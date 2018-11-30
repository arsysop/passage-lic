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

import static ru.arsysop.passage.lic.base.LicensingEvents.*;
import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.arsysop.passage.lic.base.LicensingEvents.LicensingLifeCycle;
import ru.arsysop.passage.lic.runtime.AccessManager;
import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.ConditionEvaluator;
import ru.arsysop.passage.lic.runtime.ConditionMiner;
import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.ConfigurationResolver;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.PermissionExaminer;
import ru.arsysop.passage.lic.runtime.RestrictionExecutor;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public abstract class BaseAccessManager implements AccessManager {

	private final List<ConfigurationResolver> configurationResolvers = new ArrayList<>();
	private final List<ConditionMiner> conditionMiners = new ArrayList<>();
	private final Map<String, ConditionEvaluator> conditionEvaluators = new HashMap<>();
	private final List<RestrictionExecutor> restrictionExecutors = new ArrayList<>();

	private PermissionExaminer examiner;

	public void bindConfigurationResolver(ConfigurationResolver configurationResolver) {
		configurationResolvers.add(configurationResolver);
	}

	public void unbindConfigurationResolver(ConfigurationResolver configurationResolver) {
		configurationResolvers.remove(configurationResolver);
	}

	public void bindConditionMiner(ConditionMiner conditionMiner) {
		conditionMiners.add(conditionMiner);
	}

	public void unbindConditionMiner(ConditionMiner conditionMiner) {
		conditionMiners.remove(conditionMiner);
	}

	public void bindConditionEvaluator(ConditionEvaluator conditionEvaluator, Map<String, Object> properties) {
		Object conditionType = properties.get(LICENSING_CONDITION_TYPE);
		String type = String.valueOf(conditionType);
		// FIXME: check permissions
		conditionEvaluators.put(type, conditionEvaluator);
	}

	public void unbindConditionEvaluator(ConditionEvaluator conditionEvaluator, Map<String, Object> properties) {
		Object conditionType = properties.get(LICENSING_CONDITION_TYPE);
		String type = String.valueOf(conditionType);
		conditionEvaluators.remove(type);
	}

	public void bindRestrictionExecutor(RestrictionExecutor restrictionExecutor) {
		restrictionExecutors.add(restrictionExecutor);
	}

	public void unbindRestrictionExecutor(RestrictionExecutor restrictionExecutor) {
		restrictionExecutors.remove(restrictionExecutor);
	}

	@Override
	public void executeAccessRestrictions(Object configuration) {
		Iterable<ConfigurationRequirement> requirements = resolveRequirements(configuration);
		Iterable<ConditionDescriptor> conditions = extractConditions(configuration);
		Iterable<FeaturePermission> permissions = evaluateConditions(conditions);
		Iterable<RestrictionVerdict> verdicts = examinePermissons(requirements, permissions, configuration);
		executeRestrictions(verdicts);
	}

	@Override
	public Iterable<ConfigurationRequirement> resolveRequirements(Object configuration) {
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
	public Iterable<ConditionDescriptor> extractConditions(Object configuration) {
		List<ConditionDescriptor> result = new ArrayList<>();
		for (ConditionMiner conditionMiner : conditionMiners) {
			Iterable<ConditionDescriptor> conditions = conditionMiner.extractConditionDescriptors(configuration);
			for (ConditionDescriptor condition : conditions) {
				result.add(condition);
			}
		}
		List<ConditionDescriptor> unmodifiable = Collections.unmodifiableList(result);
		postEvent(LicensingLifeCycle.CONDITIONS_EXTRACTED, unmodifiable);
		return unmodifiable;
	}

	@Override
	public Iterable<FeaturePermission> evaluateConditions(Iterable<ConditionDescriptor> conditions) {
		List<FeaturePermission> result = new ArrayList<>();
		if (conditions == null) {
			// FIXME: log error;
			return result;
		}
		Map<String, List<ConditionDescriptor>> map = new HashMap<>();
		for (ConditionDescriptor condition : conditions) {
			if (condition == null) {
				// FIXME: log error;
				continue;
			}
			String type = condition.getConditionType();
			List<ConditionDescriptor> list = map.computeIfAbsent(type, key -> new ArrayList<>());
			list.add(condition);
		}
		Set<String> types = map.keySet();
		for (String type : types) {
			ConditionEvaluator evaluator = conditionEvaluators.get(type);
			if (evaluator == null) {
				// FIXME: log error;
				continue;
			}
			Iterable<FeaturePermission> permissions = evaluator.evaluateConditions(map.get(type));
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
			Iterable<FeaturePermission> permissions, Object configuration) {
		if (examiner == null) {
			examiner = new BasePermissionExaminer();
		}
		Iterable<RestrictionVerdict> examined = examiner.examine(requirements, permissions, configuration);
		postEvent(LicensingLifeCycle.PERMISSIONS_EXAMINED, examined);
		return examined;
	}

	@Override
	public void executeRestrictions(Iterable<RestrictionVerdict> restrictions) {
		for (RestrictionExecutor executor : restrictionExecutors) {
			try {
				executor.execute(restrictions);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		postEvent(LicensingLifeCycle.RESTRICTION_EXECUTED, restrictions);
	}
	
	protected abstract void postEvent(String topic, Object data);

	protected abstract void sendEvent(String topic, Object data);
}
