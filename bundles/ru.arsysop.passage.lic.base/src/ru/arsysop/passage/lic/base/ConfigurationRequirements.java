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

import static ru.arsysop.passage.lic.base.LicensingNamespaces.*;
import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import java.util.Collections;
import java.util.Map;

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;

public class ConfigurationRequirements {

	private ConfigurationRequirements() {
		// block
	}

	public static BaseConfigurationRequirement extractFromCapability(Map<String, Object> attributes, Map<String, String> directives, Object source) {
		Object feature = attributes.get(LICENSING_CONFIGRATION_REQUIREMENT);
		if (feature instanceof String) {
			String featureId = (String) feature;
			String version = LICENSING_CONFIGRATION_REQUIREMENT_VERSION_DEFAULT;
			String rule = LICENSING_CONFIGRATION_REQUIREMENT_RULE_DEFAULT;
			String level = LICENSING_CONFIGRATION_REQUIREMENT_LEVEL_DEFAULT;
			Object matchVersion = attributes.get(LICENSING_CONFIGRATION_REQUIREMENT_VERSION);
			if (matchVersion instanceof String) {
				version = (String) matchVersion;
			}
			Object matchRule = attributes.get(LICENSING_CONFIGRATION_REQUIREMENT_RULE);
			if (matchRule instanceof String) {
				rule = (String) matchRule;
			}
			Object restrictionLevel = attributes.get(LICENSING_CONFIGRATION_REQUIREMENT_LEVEL);
			if (restrictionLevel instanceof String) {
				level = (String) restrictionLevel;
			}
			return new BaseConfigurationRequirement(featureId, version, rule, level, source);
		}
		return null;
	}

	public static BaseConfigurationRequirement extractFromProperties(Map<String, Object> properties, Object source) {
		Object feature = properties.get(LICENSING_FEATURE_ID);
		if (feature instanceof String) {
			String featureId = (String) feature;
			String version = LICENSING_MATCH_VERSION_DEFAULT;
			String rule = LICENSING_MATCH_RULE_DEFAULT;
			String level = LICENSING_RESTRICTION_LEVEL_DEFAULT;
			Object matchVersion = properties.get(LICENSING_MATCH_VERSION);
			if (matchVersion instanceof String) {
				version = (String) matchVersion;
			}
			Object matchRule = properties.get(LICENSING_MATCH_RULE);
			if (matchRule instanceof String) {
				rule = (String) matchRule;
			}
			Object restrictionLevel = properties.get(LICENSING_RESTRICTION_LEVEL);
			if (restrictionLevel instanceof String) {
				level = (String) restrictionLevel;
			}
			return new BaseConfigurationRequirement(featureId, version, rule, level, source);
		}
		return null;
	}

	public static BaseConfigurationRequirement createError(String featureId, Object source) {
		String version = LICENSING_MATCH_VERSION_DEFAULT;
		String rule = LICENSING_MATCH_RULE_DEFAULT;
		String policy = LICENSING_RESTRICTION_LEVEL_ERROR;
		return new BaseConfigurationRequirement(featureId, version, rule, policy, source);
	}

	public static Iterable<ConfigurationRequirement> createErrorIterable(String featureId, Object source) {
		return Collections.singletonList(createError(featureId, source));
	}

	public static BaseConfigurationRequirement createDefault(String featureId, Object source) {
		String version = LICENSING_MATCH_VERSION_DEFAULT;
		String rule = LICENSING_MATCH_RULE_DEFAULT;
		String policy = LICENSING_RESTRICTION_LEVEL_DEFAULT;
		return new BaseConfigurationRequirement(featureId, version, rule, policy, source);
	}

}
