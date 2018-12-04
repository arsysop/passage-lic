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
package ru.arsysop.passage.lic.base.tests;

import static org.junit.Assert.assertEquals;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import org.junit.Test;


public class LicensingPropertiesTest {
	
	@Test
	public void testMatchVersionProperty() {
		assertEquals(LICENSING_MATCH_VERSION_DEFAULT, toMatchVersionProperty(this));
		assertEquals(LICENSING_MATCH_VERSION_DEFAULT, toMatchVersionProperty(this.toString()));
		assertEquals(LICENSING_MATCH_VERSION_DEFAULT, toMatchVersionProperty(String.valueOf(' ')));
		assertEquals("1", toMatchVersionProperty("1")); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals("1.2", toMatchVersionProperty("1.2")); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals("1.2.3", toMatchVersionProperty("1.2.3")); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals("1.2.3.x3", toMatchVersionProperty("1.2.3.x3")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void testMatchRuleProperty() {
		assertEquals(LICENSING_MATCH_RULE_DEFAULT, toMatchRuleProperty(this));
		assertEquals(LICENSING_MATCH_RULE_DEFAULT, toMatchRuleProperty(this.toString()));

		assertEquals(LICENSING_MATCH_RULE_COMPATIBLE, toMatchRuleProperty(LICENSING_MATCH_RULE_COMPATIBLE));
		assertEquals(LICENSING_MATCH_RULE_EQUIVALENT, toMatchRuleProperty(LICENSING_MATCH_RULE_EQUIVALENT));
		assertEquals(LICENSING_MATCH_RULE_GREATER_OR_EQUAL, toMatchRuleProperty(LICENSING_MATCH_RULE_GREATER_OR_EQUAL));
		assertEquals(LICENSING_MATCH_RULE_PERFECT, toMatchRuleProperty(LICENSING_MATCH_RULE_PERFECT));

		assertEquals(LICENSING_MATCH_RULE_COMPATIBLE, toMatchRuleProperty("coMpaTible")); //$NON-NLS-1$
		assertEquals(LICENSING_MATCH_RULE_EQUIVALENT, toMatchRuleProperty("eQuIVALenT")); //$NON-NLS-1$
		assertEquals(LICENSING_MATCH_RULE_GREATER_OR_EQUAL, toMatchRuleProperty("gREaterORequAL")); //$NON-NLS-1$
		assertEquals(LICENSING_MATCH_RULE_PERFECT, toMatchRuleProperty("perFecT")); //$NON-NLS-1$
	}

	@Test
	public void testRestrictionLevelProperty() {
		assertEquals(LICENSING_RESTRICTION_LEVEL_DEFAULT, toRestrictionLevelProperty(this));
		assertEquals(LICENSING_RESTRICTION_LEVEL_DEFAULT, toRestrictionLevelProperty(this.toString()));

		assertEquals(LICENSING_RESTRICTION_LEVEL_ERROR, toRestrictionLevelProperty(LICENSING_RESTRICTION_LEVEL_ERROR));
		assertEquals(LICENSING_RESTRICTION_LEVEL_FATAL, toRestrictionLevelProperty(LICENSING_RESTRICTION_LEVEL_FATAL));
		assertEquals(LICENSING_RESTRICTION_LEVEL_WARN, toRestrictionLevelProperty(LICENSING_RESTRICTION_LEVEL_WARN));

		assertEquals(LICENSING_RESTRICTION_LEVEL_ERROR, toRestrictionLevelProperty("eRroR")); //$NON-NLS-1$
		assertEquals(LICENSING_RESTRICTION_LEVEL_FATAL, toRestrictionLevelProperty("FaTaL")); //$NON-NLS-1$
		assertEquals(LICENSING_RESTRICTION_LEVEL_WARN, toRestrictionLevelProperty("wARn")); //$NON-NLS-1$
	}

}
