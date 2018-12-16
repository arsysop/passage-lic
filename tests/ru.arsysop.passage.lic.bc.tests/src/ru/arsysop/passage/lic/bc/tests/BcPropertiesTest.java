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
package ru.arsysop.passage.lic.bc.tests;

import static org.junit.Assert.assertEquals;

import static ru.arsysop.passage.lic.bc.BcProperties.*;

import java.util.HashMap;

import org.junit.Test;

@SuppressWarnings("restriction")
public class BcPropertiesTest {
	
	@Test
	public void testExtractKeyAlgo() {
		assertEquals(KEY_ALGO_DEFAULT, extractKeyAlgo(null));
		assertEquals(KEY_ALGO_DEFAULT, extractKeyAlgo(new HashMap<>()));
	}

	@Test
	public void testExtractKeySize() {
		assertEquals(KEY_SIZE_DEFAULT, extractKeySize(null));
		assertEquals(KEY_SIZE_DEFAULT, extractKeySize(new HashMap<>()));
	}
}
