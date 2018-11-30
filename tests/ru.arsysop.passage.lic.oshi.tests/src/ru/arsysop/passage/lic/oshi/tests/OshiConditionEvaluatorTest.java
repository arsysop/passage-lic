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
package ru.arsysop.passage.lic.oshi.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import ru.arsysop.passage.lic.base.ConditionDescriptors;
import ru.arsysop.passage.lic.internal.oshi.OshiConditionEvaluator;
import ru.arsysop.passage.lic.oshi.OshiHal;
import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.FeaturePermission;

@SuppressWarnings("restriction")
public class OshiConditionEvaluatorTest {

	static final String OSHI_HARDWARE_FEATURE_ID = "oshi.hardware"; //$NON-NLS-1$
	static final String OSHI_HARDWARE_MATCH_VERSION = "0.3.0"; //$NON-NLS-1$
	static final String OSHI_HARDWARE_MATCH_RULE = "exact"; //$NON-NLS-1$

	private static final String EXPRESSION_OS_ANY = "os.family=*"; //$NON-NLS-1$
	private static final String EXPRESSION_OS_X3 = "os.family=X3"; //$NON-NLS-1$

	@Test
	public void testEvaluateConditionNegative() throws Exception {
		OshiConditionEvaluator evaluator = new OshiConditionEvaluator();
		assertEmpty(evaluator.evaluateConditions(null));

		Set<ConditionDescriptor> empty = Collections.singleton(createOshiCondition(new String()));
		assertEmpty(evaluator.evaluateConditions(empty));

		Set<ConditionDescriptor> unknown = Collections.singleton(createOshiCondition(EXPRESSION_OS_X3));
		assertEmpty(evaluator.evaluateConditions(unknown));
	}

	@Test
	public void testEvaluateConditionPositive() throws Exception {
		OshiConditionEvaluator evaluator = new OshiConditionEvaluator();
		Set<ConditionDescriptor> future = Collections.singleton(createOshiCondition(EXPRESSION_OS_ANY));
		Iterator<FeaturePermission> iterator = evaluator.evaluateConditions(future).iterator();
		assertTrue(iterator.hasNext());
		FeaturePermission permission = iterator.next();
		assertEquals(OSHI_HARDWARE_FEATURE_ID, permission.getFeatureIdentifier());
		assertEquals(OSHI_HARDWARE_MATCH_RULE, permission.getMatchRule());
		assertEquals(OSHI_HARDWARE_MATCH_VERSION, permission.getMatchVersion());
	}

	@Test
	public void testOshiCondition() throws Exception {
		ConditionDescriptor condition = createOshiCondition(EXPRESSION_OS_X3);
		assertEquals(EXPRESSION_OS_X3, condition.getConditionExpression());
		assertEquals(OshiHal.CONDITION_TYPE_HARDWARE, condition.getConditionType());
		assertEquals(OSHI_HARDWARE_FEATURE_ID, condition.getAllowedFeatureId());
		assertEquals(OSHI_HARDWARE_MATCH_RULE, condition.getAllowedMatchRule());
		assertEquals(OSHI_HARDWARE_MATCH_VERSION, condition.getAllowedMatchVersion());
	}

	private void assertEmpty(Iterable<FeaturePermission> iterable) {
		assertFalse(iterable.iterator().hasNext());
	}

	public static ConditionDescriptor createOshiCondition(String expression) {
		return ConditionDescriptors.create(OSHI_HARDWARE_FEATURE_ID, OSHI_HARDWARE_MATCH_VERSION, OSHI_HARDWARE_MATCH_RULE, OshiHal.CONDITION_TYPE_HARDWARE, expression);
	}

}
