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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.passage.lic.base.BaseConfigurationRequirement;
import org.eclipse.passage.lic.base.ConfigurationRequirements;
import org.eclipse.passage.lic.base.LicensingNamespaces;
import org.eclipse.passage.lic.base.LicensingVersions;
import org.eclipse.passage.lic.runtime.ConfigurationRequirement;
import org.eclipse.passage.lic.runtime.ConfigurationResolver;
import org.eclipse.passage.lic.runtime.LicensingConfiguration;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.runtime.ServiceComponentRuntime;
import org.osgi.service.component.runtime.dto.ComponentDescriptionDTO;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

@Component
public class ComponentConfigurationResolver implements ConfigurationResolver {
	
	private Logger logger;
	private BundleContext bundleContext;
	private ServiceComponentRuntime scr;
	
	@Reference
	public void bindLoggerFactory(LoggerFactory loggerFactory) {
		this.logger = loggerFactory.getLogger(ComponentConfigurationResolver.class);
	}

	public void unbindLoggerFactory(LoggerFactory loggerFactory) {
		this.logger = null;
	}
	
	@Reference
	public void bindScr(ServiceComponentRuntime scr) {
		this.scr = scr;
	}

	public void unbindScr(ServiceComponentRuntime scr) {
		this.scr = null;
	}
	
	@Activate
	public void activate(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	@Deactivate
	public void deactivate() {
		this.bundleContext = null;
	}

	@Override
	public Iterable<ConfigurationRequirement> resolveConfigurationRequirements(LicensingConfiguration configuration) {
		String lmName = "License Management";
		if (scr == null) {
			logger.audit("Unable to extract configuration requirements: invalid ServiceComponentRuntime");
			return ConfigurationRequirements.createErrorIterable(LicensingNamespaces.CAPABILITY_LICENSING_MANAGEMENT, LicensingVersions.VERSION_DEFAULT, lmName, this, configuration);
		}
		if (bundleContext == null) {
			logger.audit("Unable to extract configuration requirements: invalid BundleContext");
			return ConfigurationRequirements.createErrorIterable(LicensingNamespaces.CAPABILITY_LICENSING_MANAGEMENT, LicensingVersions.VERSION_DEFAULT, lmName, this, configuration);
		}
		List<ConfigurationRequirement> result = new ArrayList<>();
		Bundle[] bundles = bundleContext.getBundles();
		Collection<ComponentDescriptionDTO> components = scr.getComponentDescriptionDTOs(bundles);
		for (ComponentDescriptionDTO component : components) {
			BaseConfigurationRequirement requirement = ConfigurationRequirements.extractFromProperties(component.properties, component, configuration);
			if (requirement != null) {
				result.add(requirement);
			}
		}
		return result;
	}

}
