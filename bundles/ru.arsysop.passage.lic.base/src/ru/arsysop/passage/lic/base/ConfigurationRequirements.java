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
		Object feature = attributes.get(CAPABILITY_LICENSING_FEATURE);
		if (feature instanceof String) {
			String featureId = (String) feature;
			String version = toVersionAttribute(attributes.get(ATTRIBUTE_VERSION));
			String rule = toRuleAttribute(attributes.get(ATTRIBUTE_RULE));
			String level = toLevelAttribute(attributes.get(ATTRIBUTE_LEVEL));
			return new BaseConfigurationRequirement(featureId, version, rule, level, source);
		}
		return null;
	}

	public static BaseConfigurationRequirement extractFromProperties(Map<String, Object> properties, Object source) {
		Object feature = properties.get(LICENSING_FEATURE_IDENTIFIER);
		if (feature instanceof String) {
			String featureId = (String) feature;
			String version = toMatchVersionProperty(properties.get(LICENSING_MATCH_VERSION));
			String rule = toMatchRuleProperty(properties.get(LICENSING_MATCH_RULE));
			String level = toRestrictionLevelProperty(properties.get(LICENSING_RESTRICTION_LEVEL));
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
