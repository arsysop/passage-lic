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
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import ru.arsysop.passage.lic.base.BaseAccessManager;
import ru.arsysop.passage.lic.base.BaseLicensingCondition;
import ru.arsysop.passage.lic.base.LicensingConditions;
import ru.arsysop.passage.lic.base.LicensingConfigurations;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.LicensingConfiguration;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

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
	public void testExecuteAccessRestrictionsNegative() {
		manager.executeAccessRestrictions(null);
		int errors = 1;
		int events = 5;
		checkMaps(errors, events);
	}

	@Test
	public void testEvaluateConditionsNegative() {
		int logSize = 0;
		int eventSize = 0;
		checkMaps(logSize, eventSize);

		Iterable<FeaturePermission> permissions = Collections.emptyList();
		permissions = manager.evaluateConditions(null, null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);

		permissions = manager.evaluateConditions(new ArrayList<>(), null);
		assertFalse(permissions.iterator().hasNext());
		eventSize++;
		checkMaps(logSize, eventSize);

		permissions = manager.evaluateConditions(Collections.singleton(null), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);
	}

	@Test
	public void testEvaluateConditionDates() {
		int logSize = 0;
		int eventSize = 0;
		Iterable<FeaturePermission> permissions = Collections.emptyList();
		permissions = manager.evaluateConditions(Collections.singleton(createCondition(null, null)), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);

		permissions = manager.evaluateConditions(Collections.singleton(createCondition(new Date(), null)), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);

		permissions = manager.evaluateConditions(Collections.singleton(createCondition(null, new Date())), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);

		Date before = new Date(System.currentTimeMillis()-100500);
		Date after = new Date(System.currentTimeMillis()+100500);
		permissions = manager.evaluateConditions(Collections.singleton(createCondition(after, after)), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);
		
		permissions = manager.evaluateConditions(Collections.singleton(createCondition(before, before)), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);
		
		permissions = manager.evaluateConditions(Collections.singleton(createCondition(after, before)), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);
		
		permissions = manager.evaluateConditions(Collections.singleton(createCondition(before, after)), null);
		assertFalse(permissions.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);
	}

	protected BaseLicensingCondition createCondition(Date from, Date until) {
		return LicensingConditions.create(FEATURE_ID, FEATURE_VERSION, null, from, until, null, null);
	}

	@Test
	public void testExaminePermissionsNegative() {
		int logSize = 0;
		int eventSize = 0;
		Iterable<RestrictionVerdict> verdicts = Collections.emptyList();
		verdicts = manager.examinePermissons(null, null, null);
		assertFalse(verdicts.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);

		verdicts = manager.examinePermissons(null, null, conf);
		assertFalse(verdicts.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);

		verdicts = manager.examinePermissons(new ArrayList<>(), null, conf);
		assertFalse(verdicts.iterator().hasNext());
		checkMaps(++logSize, ++eventSize);

		verdicts = manager.examinePermissons(Collections.singleton(null), null, conf);
		assertFalse(verdicts.iterator().hasNext());
		logSize++;
		checkMaps(++logSize, ++eventSize);
	}

	protected void checkMaps(int logSize, int eventSize) {
		assertEquals(logSize, log.size());
		assertEquals(eventSize, events.size());
	}

}
