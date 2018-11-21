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
package ru.arsysop.passage.lic.runtime;

/**
 * The usage constraint defined for specific feature identifier with given
 * version. Obtained from {@link ConfigurationResolver}
 *
 */
public interface ConfigurationRequirement {

	String getFeatureIdentifier();

	String getMatchVersion();

	String getMatchRule();

	/**
	 * The default restriction level, as defined by component vendor, may be
	 * redefined by specific configuration. Used as a hint for
	 * <code>RestrictionExaminer</code>>
	 * 
	 * @return restriction level, <code>warn</code> by default
	 */
	String getRestrictionLevel();

	Object getRequirementSource();
	
}
