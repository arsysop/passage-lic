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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.wiring.BundleCapability;
import org.osgi.framework.wiring.BundleRevision;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import ru.arsysop.passage.lic.base.BaseConfigurationRequirement;
import ru.arsysop.passage.lic.base.ConfigurationRequirements;
import ru.arsysop.passage.lic.base.LicensingNamespaces;
import ru.arsysop.passage.lic.base.LicensingVersions;
import ru.arsysop.passage.lic.equinox.LicensingBundles;
import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.ConfigurationResolver;

@Component
public class BundleCapabilityResolver implements ConfigurationResolver {
	
	private Logger logger;
	private BundleContext bundleContext;

	@Activate
	public void activate(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	@Deactivate
	public void deactivate() {
		this.bundleContext = null;
	}

	@Override
	public Iterable<ConfigurationRequirement> resolveConfigurationRequirements(Object configuration) {
		String lmName = "License Management";
		if (bundleContext == null) {
			logger.severe("Unable to extract configuration requirements: invalid BundleContext");
			return ConfigurationRequirements.createErrorIterable(LicensingNamespaces.CAPABILITY_LICENSING_MANAGEMENT, LicensingVersions.VERSION_DEFAULT, lmName, this);
		}
		List<ConfigurationRequirement> result = new ArrayList<>();
		Bundle[] bundles = bundleContext.getBundles();
		for (Bundle bundle : bundles) {
			Iterable<BundleCapability> capabilities = LicensingBundles.extractLicensingFeatures(bundle);
			for (BundleCapability capability : capabilities) {
				Map<String, Object> attributes = capability.getAttributes();
				Map<String, String> directives = capability.getDirectives();
				BundleRevision resource = capability.getResource();
				BaseConfigurationRequirement extracted = ConfigurationRequirements.extractFromCapability(attributes, directives, resource);
				if (extracted != null) {
					result.add(extracted);
				} else {
					logger.severe(String.format("Unable to extract configuration requirements: %s", resource));
					result.add(ConfigurationRequirements.createError(LicensingNamespaces.CAPABILITY_LICENSING_MANAGEMENT, LicensingVersions.VERSION_DEFAULT, lmName, resource));
					return result;
				}
			}
		}
		return result;
	}

}
