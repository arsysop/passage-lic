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
package ru.arsysop.passage.licensing.runtime;

/**
 * The main entry point to the licensing
 *
 */
public interface AccessManager {

	/**
	 * Aggregated method to:
	 * <li>resolve {@link ConfigurationRequirement}(s)</li>
	 * <li>obtain {@link ConditionDescriptor}(s)</li>
	 * <li>evaluate {@link ConditionDescriptor}(s) to receive
	 * {@link FeaturePermission}(s)</li>
	 * <li>examine requirements and permissions to compose
	 * {@link RestrictionVerdict}(s)</li>
	 * <li>execute {@link RestrictionVerdict}(s) to realize restrictions</li>
	 * 
	 * @param configuration
	 * @return the composite result of execution
	 */
	void executeAccessRestrictions(Object configuration);

	Iterable<ConfigurationRequirement> resolveRequirements(Object configuration);

	Iterable<ConditionDescriptor> extractConditions(Object configuration);

	Iterable<FeaturePermission> evaluateConditions(Iterable<ConditionDescriptor> conditions);

	Iterable<RestrictionVerdict> examinePermissons(Iterable<ConfigurationRequirement> requirements, Iterable<FeaturePermission> permissions, Object configuration);

	void executeRestrictions(Iterable<RestrictionVerdict> restrictions);

}
