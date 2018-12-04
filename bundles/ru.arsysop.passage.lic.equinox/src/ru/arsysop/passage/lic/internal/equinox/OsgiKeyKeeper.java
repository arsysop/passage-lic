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

import static ru.arsysop.passage.lic.base.LicensingNamespaces.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.osgi.service.environment.EnvironmentInfo;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.wiring.BundleCapability;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import ru.arsysop.passage.lic.base.LicensingConfigurations;
import ru.arsysop.passage.lic.base.LicensingPaths;
import ru.arsysop.passage.lic.equinox.LicensingBundles;
import ru.arsysop.passage.lic.runtime.io.KeyKeeper;

@Component
public class OsgiKeyKeeper implements KeyKeeper {

	private EnvironmentInfo environmentInfo;
	private Map<String, BundleCapability> configurationCapabilities = new HashMap<>();
	
	@Activate
	public void activate(BundleContext bundleContext) {
		Bundle[] bundles = bundleContext.getBundles();
		for (Bundle bundle : bundles) {
			Iterable<BundleCapability> capabilities = LicensingBundles.extractLicensingConfigurations(bundle);
			for (BundleCapability capability : capabilities) {
				Map<String, Object> attributes = capability.getAttributes();
				Object object = attributes.get(CAPABILITY_LICENSING_CONFIGURATION);
				if (object instanceof String) {
					String id = (String) object;
					configurationCapabilities.put(id, capability);
				} else {
					//FIXME: log error;
				}
			}
		}
	}

	@Reference
	public void bindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = environmentInfo;
	}

	public void unbindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = null;
	}

	@Override
	public InputStream openKeyStream(Object configuration) throws IOException {
		String identifier = LicensingConfigurations.resolveProductIdentifier(configuration);
		BundleCapability capability = configurationCapabilities.get(identifier);
		if (capability != null) {
			Object value = capability.getAttributes().get(ATTRIBUTE_KEYPATH);
			if (value instanceof String) {
				String keypath = (String) value;
				Bundle bundle = capability.getRevision().getBundle();
				URL resource = bundle.getResource(keypath);
				return resource.openStream();
			} 
		}
		
		String areaValue = environmentInfo.getProperty(LicensingPaths.PROPERTY_OSGI_INSTALL_AREA);
		Path configurationPath = LicensingPaths.resolveConfigurationPath(areaValue, configuration);
		if (!configurationPath.toFile().isDirectory()) {
			throw new FileNotFoundException(configurationPath.toString());
		}
		List<Path> productKeys = new ArrayList<>();
		Files.walkFileTree(configurationPath, new SimpleFileVisitor<Path>() {
			
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				if (file.toString().toLowerCase().endsWith(LicensingPaths.EXTENSION_PRODUCT_PUBLIC)) {
					productKeys.add(file);
				}
				return FileVisitResult.CONTINUE;
			}
			
		});
		if (productKeys.isEmpty()) {
			String productId = LicensingConfigurations.resolveProductIdentifier(configuration);
			Path expected = configurationPath.resolve(productId + LicensingPaths.EXTENSION_PRODUCT_PUBLIC);
			throw new FileNotFoundException(expected.toString());
		}
		return Files.newInputStream(productKeys.get(0));
	}

}
