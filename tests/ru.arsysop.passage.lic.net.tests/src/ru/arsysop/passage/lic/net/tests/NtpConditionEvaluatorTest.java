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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import ru.arsysop.passage.lic.internal.net.NtpConditionEvaluator;
import ru.arsysop.passage.lic.net.TimeConditions;
import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.FeaturePermission;

@SuppressWarnings("restriction")
public class NtpConditionEvaluatorTest {
	
	static final String NET_TIME_FEATURE_ID = "net.time"; //$NON-NLS-1$
	static final String NET_TIME_MATCH_VERSION = "0.3.0"; //$NON-NLS-1$
	static final String NET_TIME_MATCH_RULE = "exact"; //$NON-NLS-1$

	private static final String EXPRESSION_EXPIRED = "localtimestamp=2017-02-02T12:00:00"; //$NON-NLS-1$
	private static final String EXPRESSION_FUTURE = "localtimestamp=2027-02-02T12:00:00"; //$NON-NLS-1$
	private static final String EXPRESSION_UNKNOWN = "ntp=2027-02-02T12:00:00"; //$NON-NLS-1$

	@Test
	public void testEvaluateConditionNegative() throws Exception {
		NtpConditionEvaluator evaluator = new NtpConditionEvaluator();
		assertEmpty(evaluator.evaluateConditions(null));

		Set<ConditionDescriptor> empty = Collections.singleton(new NetCondition(new String()));
		assertEmpty(evaluator.evaluateConditions(empty));

		Set<ConditionDescriptor> expired = Collections.singleton(new NetCondition(EXPRESSION_EXPIRED));
		assertEmpty(evaluator.evaluateConditions(expired));

		Set<ConditionDescriptor> unknown = Collections.singleton(new NetCondition(EXPRESSION_UNKNOWN));
		assertEmpty(evaluator.evaluateConditions(unknown));
	}

	@Test
	public void testEvaluateConditionPositive() throws Exception {
		NtpConditionEvaluator evaluator = new NtpConditionEvaluator();
		Set<ConditionDescriptor> future = Collections.singleton(new NetCondition(EXPRESSION_FUTURE));
		Iterator<FeaturePermission> iterator = evaluator.evaluateConditions(future).iterator();
		assertTrue(iterator.hasNext());
		FeaturePermission permission = iterator.next();
		assertEquals(NET_TIME_FEATURE_ID, permission.getFeatureIdentifier());
		assertEquals(NET_TIME_MATCH_RULE, permission.getMatchRule());
		assertEquals(NET_TIME_MATCH_VERSION, permission.getMatchVersion());
	}

	@Test
	public void testNetCondition() throws Exception {
		NetCondition netCondition = new NetCondition(EXPRESSION_EXPIRED);
		assertEquals(EXPRESSION_EXPIRED, netCondition.getConditionExpression());
		assertEquals(TimeConditions.LC_TYPE_TIME, netCondition.getConditionType());
		assertEquals(NET_TIME_FEATURE_ID, netCondition.getAllowedFeatureId());
		assertEquals(NET_TIME_MATCH_RULE, netCondition.getAllowedMatchRule());
		assertEquals(NET_TIME_MATCH_VERSION, netCondition.getAllowedMatchVersion());
	}
	
	private void assertEmpty(Iterable<FeaturePermission> iterable) {
		assertFalse(iterable.iterator().hasNext());
	}

	private final class NetCondition implements ConditionDescriptor {

		private final String expression;

		public NetCondition(String expression) {
			this.expression = expression;
		}

		@Override
		public String getConditionType() {
			return TimeConditions.LC_TYPE_TIME;
		}

		@Override
		public String getConditionExpression() {
			return expression;
		}

		@Override
		public String getAllowedMatchVersion() {
			return NET_TIME_MATCH_VERSION;
		}

		@Override
		public String getAllowedMatchRule() {
			return NET_TIME_MATCH_RULE;
		}

		@Override
		public String getAllowedFeatureId() {
			return NET_TIME_FEATURE_ID;
		}
	}
}
