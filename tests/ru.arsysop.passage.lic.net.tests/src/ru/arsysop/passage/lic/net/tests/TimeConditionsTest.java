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
package ru.arsysop.passage.lic.net.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ru.arsysop.passage.lic.net.TimeConditions;

public class TimeConditionsTest {
	
	@Test
	public void testIsFutureLocalTimeNegative() {
		assertFalse(TimeConditions.isFutureLocalDateTime(null));
		assertFalse(TimeConditions.isFutureLocalDateTime(new String()));
	}
	@Test
	public void testIsFutureLocalTimePositive() {
		assertFalse(TimeConditions.isFutureLocalDateTime("2018-11-20T17:00:00")); //$NON-NLS-1$
		assertTrue(TimeConditions.isFutureLocalDateTime("2028-11-20T17:00:00")); //$NON-NLS-1$
	}

}
