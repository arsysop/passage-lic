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

import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import ru.arsysop.passage.lic.base.BaseAccessManager;
import ru.arsysop.passage.lic.equinox.LicensingBundles;
import ru.arsysop.passage.lic.runtime.AccessManager;
import ru.arsysop.passage.lic.runtime.ConditionEvaluator;
import ru.arsysop.passage.lic.runtime.ConditionMiner;
import ru.arsysop.passage.lic.runtime.ConfigurationResolver;
import ru.arsysop.passage.lic.runtime.PermissionExaminer;
import ru.arsysop.passage.lic.runtime.RestrictionExecutor;

public class EquinoxAccessManager extends BaseAccessManager implements AccessManager, BundleListener {

	private EventAdmin eventAdmin;
	
	@Activate
	public void activate(BundleContext bundleContext) {
		bundleContext.addBundleListener(this);
		Bundle[] bundles = bundleContext.getBundles();
		for (Bundle bundle : bundles) {
			LicensingBundles.extractLicensingManagementRequirements(bundle);
		}
	}

	@Deactivate
	public void deactivate(BundleContext bundleContext) {
		bundleContext.removeBundleListener(this);
	}

	@Override
	public void bundleChanged(BundleEvent event) {
		//FIXME: consider event kind
		Bundle bundle = event.getBundle();
		LicensingBundles.extractLicensingManagementRequirements(bundle);
	}

	@Reference
	@Override
	public void bindConditionEvaluator(ConditionEvaluator conditionEvaluator, Map<String, Object> properties) {
		super.bindConditionEvaluator(conditionEvaluator, properties);
	}
	
	@Override
	public void unbindConditionEvaluator(ConditionEvaluator conditionEvaluator, Map<String, Object> properties) {
		super.unbindConditionEvaluator(conditionEvaluator, properties);
	}
	
	@Reference
	@Override
	public void bindConditionMiner(ConditionMiner conditionMiner) {
		super.bindConditionMiner(conditionMiner);
	}
	
	@Override
	public void unbindConditionMiner(ConditionMiner conditionMiner) {
		super.unbindConditionMiner(conditionMiner);
	}
	
	@Reference
	@Override
	public void bindConfigurationResolver(ConfigurationResolver configurationResolver) {
		super.bindConfigurationResolver(configurationResolver);
	}
	
	@Override
	public void unbindConfigurationResolver(ConfigurationResolver configurationResolver) {
		super.unbindConfigurationResolver(configurationResolver);
	}
	
	@Reference
	@Override
	public void bindPermissionExaminer(PermissionExaminer permissionExaminer) {
		super.bindPermissionExaminer(permissionExaminer);
	}
	
	@Override
	public void unbindPermissionExaminer(PermissionExaminer permissionExaminer) {
		super.unbindPermissionExaminer(permissionExaminer);
	}
	
	@Reference
	@Override
	public void bindRestrictionExecutor(RestrictionExecutor restrictionExecutor) {
		super.bindRestrictionExecutor(restrictionExecutor);
	}
	
	@Override
	public void unbindRestrictionExecutor(RestrictionExecutor restrictionExecutor) {
		super.unbindRestrictionExecutor(restrictionExecutor);
	}
	
	@Reference
	public void bindEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}
	
	public void unbindEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}

	@Override
	protected void postEvent(String topic, Object data) {
		Event event = EquinoxEvents.createEvent(topic, data);
		eventAdmin.postEvent(event);
	}

	@Override
	protected void sendEvent(String topic, Object data) {
		Event event = EquinoxEvents.createEvent(topic, data);
		eventAdmin.sendEvent(event);
	}

}
