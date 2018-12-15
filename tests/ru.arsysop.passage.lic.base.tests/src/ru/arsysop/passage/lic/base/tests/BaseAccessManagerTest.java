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
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Test;

import ru.arsysop.passage.lic.base.BaseAccessManager;

public class BaseAccessManagerTest {
	
	private Map<String, Object> events = new HashMap<>();
	private Map<String, Object> log = new HashMap<>();
	
	private BaseAccessManager manager = new BaseAccessManager() {
		
		@Override
		protected void sendEvent(String topic, Object data) {
			events.put(topic, data);
		}
		
		@Override
		protected void postEvent(String topic, Object data) {
			events.put(topic, data);
		}
		
		@Override
		protected void logError(String message, Throwable e) {
			log.put(message, e);
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
		eventSize++;
		checkMaps(logSize, eventSize);
		manager.evaluateConditions(Collections.singleton(null), null);
		logSize++;
		checkMaps(logSize, eventSize);
	}

	protected void checkMaps(int logSize, int eventSize) {
		assertEquals(logSize, log.size());
		assertEquals(eventSize, events.size());
	}


}
