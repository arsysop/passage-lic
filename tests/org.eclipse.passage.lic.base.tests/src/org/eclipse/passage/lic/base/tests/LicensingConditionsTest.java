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
package org.eclipse.passage.lic.base.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.passage.lic.base.LicensingConditions;
import org.junit.Test;

public class LicensingConditionsTest {
	
	@SuppressWarnings("nls")
	@Test
	public void testEvaluateSegmentValuePositive() {
		assertTrue(LicensingConditions.evaluateSegmentValue("*some*", "something"));
		assertTrue(LicensingConditions.evaluateSegmentValue("some*", "something"));
		assertFalse(LicensingConditions.evaluateSegmentValue("*some*", "anotherthing"));
		assertFalse(LicensingConditions.evaluateSegmentValue("*Thin*", "anotherthing"));
		assertTrue(LicensingConditions.evaluateSegmentValue("*Thin*", "anotherThing"));
		assertTrue(LicensingConditions.evaluateSegmentValue("A*the*Some*", "Another Something"));
	}

}
