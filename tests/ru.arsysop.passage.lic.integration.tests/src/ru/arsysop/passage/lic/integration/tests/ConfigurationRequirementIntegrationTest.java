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
package ru.arsysop.passage.lic.integration.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;

public class ConfigurationRequirementIntegrationTest extends LicIntegrationBase {

	@Test
	public void testResolveRequirementsPositive() {
		Iterable<ConfigurationRequirement> resolved = accessManager.resolveRequirements(null);
		Map<String, ConfigurationRequirement> requirements = new HashMap<>();
		for (ConfigurationRequirement cr : resolved) {
			requirements.put(cr.getFeatureIdentifier(), cr);
		}
		assertEquals(2, requirements.size());
		ConfigurationRequirement bundleRequirement = requirements.get(SOME_BUNDLE_ID);
		assertNotNull(bundleRequirement);
		assertEquals(SOME_BUNDLE_ID, bundleRequirement.getFeatureIdentifier());
		assertEquals(LICENSING_MATCH_RULE_DEFAULT, bundleRequirement.getMatchRule());
		assertEquals(LICENSING_MATCH_VERSION_DEFAULT, bundleRequirement.getMatchVersion());
		assertEquals(LICENSING_RESTRICTION_LEVEL_DEFAULT, bundleRequirement.getRestrictionLevel());

		ConfigurationRequirement componentRequirement = requirements.get(SOME_COMPONENT_ID);
		assertNotNull(componentRequirement);
		assertEquals(SOME_COMPONENT_ID, componentRequirement.getFeatureIdentifier());
		assertEquals(LICENSING_MATCH_RULE_PERFECT, componentRequirement.getMatchRule());
		assertEquals(SOME_COMPONENT_VERSION, componentRequirement.getMatchVersion());
		assertEquals(LICENSING_RESTRICTION_LEVEL_ERROR, componentRequirement.getRestrictionLevel());
	}

}
