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

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

public class BaseAccessManager implements AccessManager {

	private final List<ConfigurationResolver> configurationResolvers = new ArrayList<>();
	private final List<ConditionMiner> conditionMiners = new ArrayList<>();
	private final List<ConditionEvaluator> conditionEvaluators = new ArrayList<>();
	private final Map<String, RestrictionExecutor> restrictionExecutors = new HashMap<>();

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

	public void bindConditionMiner(ConditionEvaluator conditionEvaluator) {
		conditionEvaluators.add(conditionEvaluator);
	}

	public void unbindConditionMiner(ConditionEvaluator conditionEvaluator) {
		conditionEvaluators.remove(conditionEvaluator);
	}

	public void bindRestrictionExecutor(RestrictionExecutor restrictionExecutor, Map<String, Object> properties) {
		Object restrictionType = properties.get(LICENSING_RESTRICTION_LEVEL);
		String type = String.valueOf(restrictionType);
		restrictionExecutors.put(type, restrictionExecutor);
	}

	public void unbindRestrictionExecutor(RestrictionExecutor restrictionExecutor, Map<String, Object> properties) {
		Object restrictionType = properties.get(LICENSING_RESTRICTION_LEVEL);
		String type = String.valueOf(restrictionType);
		restrictionExecutors.remove(type, restrictionExecutor);
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
		Collection<ConfigurationRequirement> result = new ArrayList<>();
		for (ConfigurationResolver configurationResolver : configurationResolvers) {
			Iterable<ConfigurationRequirement> requirements = configurationResolver
					.resolveConfigurationRequirements(configuration);
			for (ConfigurationRequirement requirement : requirements) {
				result.add(requirement);
			}
		}
		return result;
	}

	@Override
	public Iterable<ConditionDescriptor> extractConditions(Object configuration) {
		Collection<ConditionDescriptor> result = new ArrayList<>();
		for (ConditionMiner conditionMiner : conditionMiners) {
			Iterable<ConditionDescriptor> conditions = conditionMiner.extractConditionDescriptors(configuration);
			for (ConditionDescriptor condition : conditions) {
				result.add(condition);
			}
		}
		return result;
	}

	@Override
	public Iterable<FeaturePermission> evaluateConditions(Iterable<ConditionDescriptor> conditions) {
		Collection<FeaturePermission> result = new ArrayList<>();
		for (ConditionEvaluator conditionEvaluator : conditionEvaluators) {
			Iterable<FeaturePermission> permissons = conditionEvaluator.evaluate(conditions);
			for (FeaturePermission permission : permissons) {
				result.add(permission);
			}
		}
		return result;
	}

	@Override
	public Iterable<RestrictionVerdict> examinePermissons(Iterable<ConfigurationRequirement> requirements,
			Iterable<FeaturePermission> permissions, Object configuration) {
		if (examiner == null) {
			examiner = new BasePermissionExaminer();
		}
		return examiner.examine(requirements, permissions, configuration);
	}

	@Override
	public void executeRestrictions(Iterable<RestrictionVerdict> restrictions) {
		Map<String, List<RestrictionVerdict>> map = new HashMap<>();
		for (RestrictionVerdict verdict : restrictions) {
			String level = verdict.getRestrictionLevel();
			List<RestrictionVerdict> list = map.computeIfAbsent(level, key -> new ArrayList<>());
			list.add(verdict);
		}
		Set<String> keySet = map.keySet();
		for (String level : keySet) {
			List<RestrictionVerdict> verdicts = map.get(level);
			RestrictionExecutor executor = restrictionExecutors.get(level);
			if (executor != null) {
				executor.execute(verdicts);
			}
		}
	}

}
