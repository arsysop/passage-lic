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
package org.eclipse.passage.lic.internal.equinox;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.event.Event;

public class EquinoxEvents {

	//@see org.eclipse.e4.core.services.events.IEventBroker.DATA
	static final String PROPERTY_DATA = "org.eclipse.e4.data"; //$NON-NLS-1$

	static Event createEvent(String topic, Object data) {
		Map<String, Object> properties = new HashMap<>();
		properties.put(PROPERTY_DATA, data);
		Event event = new Event(topic, properties);
		return event;
	}

}
