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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;

public class LicIntegrationPositiveTest extends LicIntegrationBase {

	@Test
	public void testResolveRequirements() {
		Iterable<ConfigurationRequirement> resolved = accessManager.resolveRequirements(null);
		List<ConfigurationRequirement> requirements = new ArrayList<>();
		for (ConfigurationRequirement requirement : resolved) {
			requirements.add(requirement);
		}
		assertEquals(2, requirements.size());
	}

}
