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

import static ru.arsysop.passage.lic.base.LicensingNamespaces.*;

import org.junit.Test;


public class LicensingNamespacesTest {
	
	@Test
	public void testMatchVersionProperty() {
		assertEquals(ATTRIBUTE_VERSION_DEFAULT, toVersionAttribute(this));
		assertEquals(ATTRIBUTE_VERSION_DEFAULT, toVersionAttribute(this.toString()));
		assertEquals(ATTRIBUTE_VERSION_DEFAULT, toVersionAttribute(String.valueOf(' ')));
		assertEquals("1", toVersionAttribute("1")); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals("1.2", toVersionAttribute("1.2")); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals("1.2.3", toVersionAttribute("1.2.3")); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals("1.2.3.x3", toVersionAttribute("1.2.3.x3")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void testMatchRuleProperty() {
		assertEquals(ATTRIBUTE_RULE_DEFAULT, toRuleAttribute(this));
		assertEquals(ATTRIBUTE_RULE_DEFAULT, toRuleAttribute(this.toString()));

		assertEquals(ATTRIBUTE_RULE_COMPATIBLE, toRuleAttribute(ATTRIBUTE_RULE_COMPATIBLE));
		assertEquals(ATTRIBUTE_RULE_EQUIVALENT, toRuleAttribute(ATTRIBUTE_RULE_EQUIVALENT));
		assertEquals(ATTRIBUTE_RULE_GREATER_OR_EQUAL, toRuleAttribute(ATTRIBUTE_RULE_GREATER_OR_EQUAL));
		assertEquals(ATTRIBUTE_RULE_PERFECT, toRuleAttribute(ATTRIBUTE_RULE_PERFECT));

		assertEquals(ATTRIBUTE_RULE_COMPATIBLE, toRuleAttribute("coMpaTible")); //$NON-NLS-1$
		assertEquals(ATTRIBUTE_RULE_EQUIVALENT, toRuleAttribute("eQuIVALenT")); //$NON-NLS-1$
		assertEquals(ATTRIBUTE_RULE_GREATER_OR_EQUAL, toRuleAttribute("gREaterORequAL")); //$NON-NLS-1$
		assertEquals(ATTRIBUTE_RULE_PERFECT, toRuleAttribute("perFecT")); //$NON-NLS-1$
	}

	@Test
	public void testRestrictionLevelProperty() {
		assertEquals(ATTRIBUTE_LEVEL_DEFAULT, toLevelAttribute(this));
		assertEquals(ATTRIBUTE_LEVEL_DEFAULT, toLevelAttribute(this.toString()));

		assertEquals(ATTRIBUTE_LEVEL_ERROR, toLevelAttribute(ATTRIBUTE_LEVEL_ERROR));
		assertEquals(ATTRIBUTE_LEVEL_FATAL, toLevelAttribute(ATTRIBUTE_LEVEL_FATAL));
		assertEquals(ATTRIBUTE_LEVEL_WARN, toLevelAttribute(ATTRIBUTE_LEVEL_WARN));

		assertEquals(ATTRIBUTE_LEVEL_ERROR, toLevelAttribute("eRroR")); //$NON-NLS-1$
		assertEquals(ATTRIBUTE_LEVEL_FATAL, toLevelAttribute("FaTaL")); //$NON-NLS-1$
		assertEquals(ATTRIBUTE_LEVEL_WARN, toLevelAttribute("wARn")); //$NON-NLS-1$
	}

}
