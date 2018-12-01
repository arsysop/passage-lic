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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.osgi.service.environment.EnvironmentInfo;

import ru.arsysop.passage.lic.base.LicensingConfigurations;
import ru.arsysop.passage.lic.base.LicensingPaths;
import ru.arsysop.passage.lic.runtime.io.KeyKeeper;

public class OsgiInstallAreaKeyKeeper implements KeyKeeper {

	private EnvironmentInfo environmentInfo;

	public void bindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = environmentInfo;
	}

	public void unbindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = null;
	}

	@Override
	public InputStream openKeyStream(Object configuration) throws IOException {
		String areaValue = environmentInfo.getProperty(LicensingPaths.PROPERTY_OSGI_INSTALL_AREA);
		Path configurationPath = LicensingPaths.resolveConfigurationPath(areaValue, configuration);
		if (!configurationPath.toFile().isDirectory()) {
			throw new FileNotFoundException(configurationPath.toString());
		}
		String productKey = LicensingPaths.EXTENSION_PRODUCT_PUBLIC;
		String productId = LicensingConfigurations.resolveProductIdentifier(configuration);
		if (productId != null) {
			productKey = productId + productKey;
		}
		Path keyRingPath = configurationPath.resolve(productKey);
		return Files.newInputStream(keyRingPath);
	}

}
