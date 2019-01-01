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
package ru.arsysop.passage.lic.base.tests;

import static org.junit.Assert.assertEquals;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import org.junit.Test;

public class LicensingPropertiesTest {
	
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
