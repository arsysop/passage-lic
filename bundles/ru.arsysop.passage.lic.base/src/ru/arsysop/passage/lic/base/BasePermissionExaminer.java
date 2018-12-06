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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.PermissionExaminer;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public class BasePermissionExaminer implements PermissionExaminer {

	@Override
	public Iterable<RestrictionVerdict> examine(Iterable<ConfigurationRequirement> requirements,
			Iterable<FeaturePermission> permissions, Object configuration) {
		Map<String, List<ConfigurationRequirement>> required = new HashMap<>();
		Map<String, List<FeaturePermission>> allowed = new HashMap<>();
		for (ConfigurationRequirement requirement : requirements) {
			String featureId = requirement.getFeatureIdentifier();
			List<ConfigurationRequirement> list = required.computeIfAbsent(featureId, key -> new ArrayList<>());
			list.add(requirement);
		}
		for (FeaturePermission permission : permissions) {
			String featureId = permission.getFeatureIdentifier();
			List<FeaturePermission> list = allowed.computeIfAbsent(featureId, key -> new ArrayList<>());
			list.add(permission);
		}
		
		List<RestrictionVerdict> verdicts = new ArrayList<>();
		
		Set<String> features = required.keySet();
		for (String featureId : features) {
			List<ConfigurationRequirement> requirementList = required.get(featureId);
			List<FeaturePermission> permissionList = allowed.computeIfAbsent(featureId, key -> new ArrayList<>());
			List<RestrictionVerdict> examined = examineFeatures(requirementList, permissionList);
			verdicts.addAll(examined);
		}
		return Collections.unmodifiableList(verdicts);
	}
	
	protected List<RestrictionVerdict> examineFeatures(List<ConfigurationRequirement> requirements, List<FeaturePermission> permissions) {
		List<ConfigurationRequirement> unsatisfied = new ArrayList<>(requirements);
		for (FeaturePermission permission : permissions) {
			List<ConfigurationRequirement> covered = new ArrayList<>();
			for (ConfigurationRequirement requirement : unsatisfied) {
				if (isCovered(requirement, permission)) {
					covered.add(requirement);
				}
			}
			unsatisfied.removeAll(covered);
		}
		
		List<RestrictionVerdict> verdicts = new ArrayList<>();
		for (ConfigurationRequirement requirement : unsatisfied) {
			verdicts.add(createVerdict(requirement));
		}
		return Collections.unmodifiableList(verdicts);
	}

	protected RestrictionVerdict createVerdict(ConfigurationRequirement requirement) {
		String level = requirement.getRestrictionLevel();
		return new BaseRestrictionVerdict(requirement, level);
	}
	
	protected boolean isCovered(ConfigurationRequirement requirement, FeaturePermission permission) {
		if (!Objects.equals(requirement.getFeatureIdentifier(), permission.getFeatureIdentifier())) {
			return false;
		}
		return LicensingVersions.isMatch(requirement.getFeatureVersion(), permission.getMatchVersion(), permission.getMatchRule());
	}

}
