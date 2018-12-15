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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Test;

import ru.arsysop.passage.lic.base.BaseAccessManager;
import ru.arsysop.passage.lic.base.BaseLicensingCondition;
import ru.arsysop.passage.lic.base.LicensingConditions;
import ru.arsysop.passage.lic.base.LicensingConfigurations;
import ru.arsysop.passage.lic.runtime.LicensingConfiguration;

public class BaseAccessManagerTest {

	private static final String PRODUCT_ID = "product.id"; //$NON-NLS-1$
	private static final String PRODUCT_VERSION = "0.1.0"; //$NON-NLS-1$
	private static final String FEATURE_ID = "feature.id"; //$NON-NLS-1$
	private static final String FEATURE_VERSION = "0.1.0"; //$NON-NLS-1$

	private List<String> events = new ArrayList<>();
	private List<String> log = new ArrayList<>();

	private LicensingConfiguration conf = LicensingConfigurations.create(PRODUCT_ID, PRODUCT_VERSION);

	private BaseAccessManager manager = new BaseAccessManager() {

		@Override
		protected void postEvent(String topic, Object data) {
			events.add(topic);
		}

		@Override
		protected void logError(String message, Throwable e) {
			log.add(message);
		}
	};

	@After
	public void tearDown() {
		events.clear();
		log.clear();
	}

	@Test
	public void testEvaluateConditionsNegative() {
		int logSize = 0;
		int eventSize = 0;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(null, null);
		logSize++;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(new ArrayList<>(), null);
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(Collections.singleton(null), null);
		logSize++;
		checkMaps(logSize, eventSize);
	}

	@Test
	public void testEvaluateConditionDates() {
		int logSize = 0;
		int eventSize = 0;
		manager.evaluateConditions(Collections.singleton(createCondition(null, null)), null);
		logSize++;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(Collections.singleton(createCondition(new Date(), null)), null);
		logSize++;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(Collections.singleton(createCondition(null, new Date())), null);
		logSize++;
		checkMaps(logSize, eventSize);
		Date before = new Date(System.currentTimeMillis()-100500);
		Date after = new Date(System.currentTimeMillis()+100500);
		manager.evaluateConditions(Collections.singleton(createCondition(after, after)), null);
		logSize++;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(Collections.singleton(createCondition(before, before)), null);
		logSize++;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(Collections.singleton(createCondition(after, before)), null);
		logSize++;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(Collections.singleton(createCondition(before, after)), null);
		logSize++;
		checkMaps(logSize, eventSize);
	}

	protected BaseLicensingCondition createCondition(Date from, Date until) {
		return LicensingConditions.create(FEATURE_ID, FEATURE_VERSION, null, from, until, null, null);
	}

	protected void checkMaps(int logSize, int eventSize) {
		assertEquals(logSize, log.size());
		assertEquals(eventSize, events.size());
	}

}
