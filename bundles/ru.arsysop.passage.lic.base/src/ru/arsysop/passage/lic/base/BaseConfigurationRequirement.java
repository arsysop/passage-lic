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

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;

public class BaseConfigurationRequirement implements ConfigurationRequirement {
	
	private final String featureIdentifier;
	private final String matchVersion;
	private final String matchRule;
	private final String restrictionLevel;
	private final Object source;

	BaseConfigurationRequirement(String id, String version, String rule, String level, Object source) {
		this.featureIdentifier = id;
		this.matchVersion = version;
		this.matchRule = rule;
		this.restrictionLevel = level;
		this.source = source;
	}

	@Override
	public Object getRequirementSource() {
		return source;
	}

	@Override
	public String getFeatureIdentifier() {
		return featureIdentifier;
	}

	@Override
	public String getMatchVersion() {
		return matchVersion;
	}

	@Override
	public String getMatchRule() {
		return matchRule;
	}

	@Override
	public String getRestrictionLevel() {
		return restrictionLevel;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(LICENSING_FEATURE_IDENTIFIER).append('=').append(featureIdentifier).append(';');
		sb.append(LICENSING_MATCH_VERSION).append('=').append(matchVersion).append(';');
		sb.append(LICENSING_MATCH_RULE).append('=').append(matchRule).append(';');
		sb.append(LICENSING_RESTRICTION_LEVEL).append('=').append(restrictionLevel).append(';');
		sb.append("source").append('=').append(source); //$NON-NLS-1$
		return sb.toString();
	}

}
