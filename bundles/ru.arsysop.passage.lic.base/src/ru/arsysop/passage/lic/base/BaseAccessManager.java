/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package ru.arsysop.passage.lic.base;

import static ru.arsysop.passage.lic.base.LicensingProperties.LICENSING_CONDITION_TYPE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.arsysop.passage.lic.base.LicensingEvents.LicensingLifeCycle;
import ru.arsysop.passage.lic.runtime.AccessManager;
import ru.arsysop.passage.lic.runtime.ConditionEvaluator;
import ru.arsysop.passage.lic.runtime.ConditionMiner;
import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.ConfigurationResolver;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.LicensingConfiguration;
import ru.arsysop.passage.lic.runtime.PermissionExaminer;
import ru.arsysop.passage.lic.runtime.RestrictionExecutor;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public abstract class BaseAccessManager implements AccessManager {

	private final List<ConfigurationResolver> configurationResolvers = new ArrayList<>();
	private final List<ConditionMiner> conditionMiners = new ArrayList<>();
	private final Map<String, ConditionEvaluator> conditionEvaluators = new HashMap<>();
	private final List<RestrictionExecutor> restrictionExecutors = new ArrayList<>();

	private PermissionExaminer permissionExaminer;

	protected void bindConfigurationResolver(ConfigurationResolver configurationResolver) {
		configurationResolvers.add(configurationResolver);
	}

	protected void unbindConfigurationResolver(ConfigurationResolver configurationResolver) {
		configurationResolvers.remove(configurationResolver);
	}

	protected void bindConditionMiner(ConditionMiner conditionMiner) {
		conditionMiners.add(conditionMiner);
	}

	protected void unbindConditionMiner(ConditionMiner conditionMiner) {
		conditionMiners.remove(conditionMiner);
	}

	protected void bindConditionEvaluator(ConditionEvaluator conditionEvaluator, Map<String, Object> properties) {
		Object conditionType = properties.get(LICENSING_CONDITION_TYPE);
		String type = String.valueOf(conditionType);
		// FIXME: check permissions
		conditionEvaluators.put(type, conditionEvaluator);
	}

	protected void unbindConditionEvaluator(ConditionEvaluator conditionEvaluator, Map<String, Object> properties) {
		Object conditionType = properties.get(LICENSING_CONDITION_TYPE);
		String type = String.valueOf(conditionType);
		conditionEvaluators.remove(type);
	}

	protected void bindPermissionExaminer(PermissionExaminer permissionExaminer) {
		this.permissionExaminer = permissionExaminer;
	}

	protected void unbindPermissionExaminer(PermissionExaminer permissionExaminer) {
		this.permissionExaminer = null;
	}

	protected void bindRestrictionExecutor(RestrictionExecutor restrictionExecutor) {
		restrictionExecutors.add(restrictionExecutor);
	}

	protected void unbindRestrictionExecutor(RestrictionExecutor restrictionExecutor) {
		restrictionExecutors.remove(restrictionExecutor);
	}

	@Override
	public void executeAccessRestrictions(LicensingConfiguration configuration) {
		Iterable<ConfigurationRequirement> requirements = resolveRequirements(configuration);
		Iterable<LicensingCondition> conditions = extractConditions(configuration);
		Iterable<FeaturePermission> permissions = evaluateConditions(conditions, configuration);
		Iterable<RestrictionVerdict> verdicts = examinePermissons(requirements, permissions);
		executeRestrictions(verdicts);
	}

	@Override
	public Iterable<ConfigurationRequirement> resolveRequirements(LicensingConfiguration configuration) {
		List<ConfigurationRequirement> result = new ArrayList<>();
		for (ConfigurationResolver configurationResolver : configurationResolvers) {
			Iterable<ConfigurationRequirement> requirements = configurationResolver
					.resolveConfigurationRequirements(configuration);
			for (ConfigurationRequirement requirement : requirements) {
				result.add(requirement);
			}
		}
		List<ConfigurationRequirement> unmodifiable = Collections.unmodifiableList(result);
		postEvent(LicensingLifeCycle.REQUIREMENTS_RESOLVED, unmodifiable);
		return unmodifiable;
	}

	@Override
	public Iterable<LicensingCondition> extractConditions(LicensingConfiguration configuration) {
		List<LicensingCondition> result = new ArrayList<>();
		for (ConditionMiner conditionMiner : conditionMiners) {
			Iterable<LicensingCondition> conditions = conditionMiner.extractLicensingConditions(configuration);
			for (LicensingCondition condition : conditions) {
				result.add(condition);
			}
		}
		List<LicensingCondition> unmodifiable = Collections.unmodifiableList(result);
		postEvent(LicensingLifeCycle.CONDITIONS_EXTRACTED, unmodifiable);
		return unmodifiable;
	}

	@Override
	public Iterable<FeaturePermission> evaluateConditions(Iterable<LicensingCondition> conditions, LicensingConfiguration configuration) {
		List<FeaturePermission> result = new ArrayList<>();
		if (conditions == null) {
			String message = "Evaluation rejected for invalid conditions";
			logError(message, new NullPointerException());
			return result;
		}
		Map<String, List<LicensingCondition>> map = new HashMap<>();
		for (LicensingCondition condition : conditions) {
			if (condition == null) {
				String message = "Evaluation rejected for invalid condition";
				logError(message, new NullPointerException());
				continue;
			}
			String type = condition.getConditionType();
			List<LicensingCondition> list = map.computeIfAbsent(type, key -> new ArrayList<>());
			list.add(condition);
		}
		Set<String> types = map.keySet();
		for (String type : types) {
			ConditionEvaluator evaluator = conditionEvaluators.get(type);
			if (evaluator == null) {
				String message = String.format("No evaluator available for type %s", type);
				logError(message, new NullPointerException());
				continue;
			}
			Iterable<FeaturePermission> permissions = evaluator.evaluateConditions(map.get(type), configuration);
			for (FeaturePermission permission : permissions) {
				result.add(permission);
			}
		}
		List<FeaturePermission> unmodifiable = Collections.unmodifiableList(result);
		postEvent(LicensingLifeCycle.CONDITIONS_EVALUATED, unmodifiable);
		return unmodifiable;
	}

	@Override
	public Iterable<RestrictionVerdict> examinePermissons(Iterable<ConfigurationRequirement> requirements,
			Iterable<FeaturePermission> permissions) {
		if (permissionExaminer == null) {
			String message = String.format("No permission examiner defined, rejecting all %s", requirements);
			logError(message, new NullPointerException());
			List<RestrictionVerdict> verdicts = new ArrayList<>();
			for (ConfigurationRequirement requirement : requirements) {
				RestrictionVerdict verdict = new BaseRestrictionVerdict(requirement, requirement.getRestrictionLevel());
				verdicts.add(verdict);
			}
			return verdicts;
		}
		Iterable<RestrictionVerdict> examined = permissionExaminer.examine(requirements, permissions);
		postEvent(LicensingLifeCycle.PERMISSIONS_EXAMINED, examined);
		return examined;
	}

	@Override
	public void executeRestrictions(Iterable<RestrictionVerdict> restrictions) {
		for (RestrictionExecutor executor : restrictionExecutors) {
			try {
				executor.execute(restrictions);
			} catch (Exception e) {
				String message = String.format("%s failed to execute %s", executor, restrictions);
				logError(message, e);
			}
		}
		postEvent(LicensingLifeCycle.RESTRICTIONS_EXECUTED, restrictions);
	}
	
	protected abstract void postEvent(String topic, Object data);

	protected abstract void sendEvent(String topic, Object data);

	protected abstract void logError(String message, Throwable e);

}
