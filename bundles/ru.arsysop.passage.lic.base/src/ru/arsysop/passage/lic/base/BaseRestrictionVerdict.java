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

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public class BaseRestrictionVerdict implements RestrictionVerdict {
	
	private final ConfigurationRequirement configurationRequirement;
	private final String restrictionPolicy;

	BaseRestrictionVerdict(ConfigurationRequirement configurationRequirement, String restrictionPolicy) {
		this.configurationRequirement = configurationRequirement;
		this.restrictionPolicy = restrictionPolicy;
	}

	@Override
	public ConfigurationRequirement getConfigurationRequirement() {
		return configurationRequirement;
	}

	@Override
	public String getRestrictionLevel() {
		return restrictionPolicy;
	}

}
