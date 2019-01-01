/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
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

import static ru.arsysop.passage.lic.base.LicensingProperties.LICENSING_FEATURE_IDENTIFIER;
import static ru.arsysop.passage.lic.base.LicensingProperties.LICENSING_FEATURE_NAME;
import static ru.arsysop.passage.lic.base.LicensingProperties.LICENSING_FEATURE_VERSION;
import static ru.arsysop.passage.lic.base.LicensingProperties.LICENSING_RESTRICTION_LEVEL;

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.LicensingConfiguration;

public class BaseConfigurationRequirement implements ConfigurationRequirement {
	
	private final String featureIdentifier;
	private final String featureVersion;
	private final String featureName;
	private final String restrictionLevel;
	private final Object source;
	private final LicensingConfiguration configuration;

	BaseConfigurationRequirement(String id, String version, String name, String level, Object source, LicensingConfiguration configuration) {
		this.featureIdentifier = id;
		this.featureVersion = version;
		this.featureName = name;
		this.restrictionLevel = level;
		this.source = source;
		this.configuration = configuration;
	}

	@Override
	public String getFeatureIdentifier() {
		return featureIdentifier;
	}

	@Override
	public String getFeatureVersion() {
		return featureVersion;
	}
	
	@Override
	public String getFeatureName() {
		return featureName;
	}

	@Override
	public String getRestrictionLevel() {
		return restrictionLevel;
	}
	
	@Override
	public Object getRequirementSource() {
		return source;
	}
	
	@Override
	public LicensingConfiguration getLicensingConfiguration() {
		return configuration;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(LICENSING_FEATURE_IDENTIFIER).append('=').append(featureIdentifier).append(';');
		sb.append(LICENSING_FEATURE_VERSION).append('=').append(featureVersion).append(';');
		sb.append(LICENSING_FEATURE_NAME).append('=').append(featureName).append(';');
		sb.append(LICENSING_RESTRICTION_LEVEL).append('=').append(restrictionLevel).append(';');
		sb.append("source").append('=').append(source).append(';'); //$NON-NLS-1$
		sb.append("configuration").append('=').append(configuration); //$NON-NLS-1$
		return sb.toString();
	}

}
