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
package ru.arsysop.passage.lic.internal.equinox;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import ru.arsysop.passage.lic.base.BaseAccessManager;
import ru.arsysop.passage.lic.equinox.LicensingBundles;
import ru.arsysop.passage.lic.runtime.AccessManager;

public class EquinoxAccessManager extends BaseAccessManager implements AccessManager, BundleListener {

	//@see org.eclipse.e4.core.services.events.IEventBroker.DATA
	private static final String PROPERTY_DATA = "org.eclipse.e4.data"; //$NON-NLS-1$

	private EventAdmin eventAdmin;
	
	@Reference
	public void bindEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}
	
	public void unbindEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}
	
	public void activate(BundleContext bundleContext) {
		bundleContext.addBundleListener(this);
		Bundle[] bundles = bundleContext.getBundles();
		for (Bundle bundle : bundles) {
			LicensingBundles.extractLicensingManagementRequirements(bundle);
		}
	}

	public void deactivate(BundleContext bundleContext) {
		bundleContext.removeBundleListener(this);
	}
	
	

	@Override
	public void bundleChanged(BundleEvent event) {
		//FIXME: consider event kind
		Bundle bundle = event.getBundle();
		LicensingBundles.extractLicensingManagementRequirements(bundle);
	}

	@Override
	protected void postEvent(String topic, Object data) {
		Event event = createEvent(topic, data);
		eventAdmin.postEvent(event);
	}

	@Override
	protected void sendEvent(String topic, Object data) {
		Event event = createEvent(topic, data);
		eventAdmin.sendEvent(event);
	}

	protected Event createEvent(String topic, Object data) {
		Map<String, Object> properties = new HashMap<>();
		properties.put(PROPERTY_DATA, data);
		Event event = new Event(topic, properties);
		return event;
	}

}
