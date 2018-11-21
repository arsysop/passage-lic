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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.PermissionExaminer;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public class BasePermissionExaminer implements PermissionExaminer {

	@Override
	public Iterable<RestrictionVerdict> examine(Iterable<ConfigurationRequirement> requirements,
			Iterable<FeaturePermission> permissions, Object configuration) {
		Map<String, ConfigurationRequirement> unsatisfied = new HashMap<>();
		for (ConfigurationRequirement requirement : requirements) {
			String featureId = requirement.getFeatureIdentifier();
			unsatisfied.put(featureId, requirement);
		}
		for (FeaturePermission permission : permissions) {
			String featureId = permission.getFeatureIdentifier();
			unsatisfied.remove(featureId);
		}
		List<RestrictionVerdict> verdicts = new ArrayList<>();
		Set<String> features = unsatisfied.keySet();
		for (String feature : features) {
			ConfigurationRequirement configurationRequirement = unsatisfied.get(feature);
			String restrictionPolicy = configurationRequirement.getRestrictionLevel();
			verdicts.add(new BaseRestrictionVerdict(configurationRequirement, restrictionPolicy));
		}
		return verdicts;
	}

}
