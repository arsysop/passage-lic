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
package ru.arsysop.passage.lic.base;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import ru.arsysop.passage.lic.runtime.LicensingConfiguration;

public class LicensingPaths {

	public static String FOLDER_LICENSING_BASE = ".passage"; //$NON-NLS-1$

	public static String EXTENSION_LICENSE_ENCRYPTED = ".licen"; //$NON-NLS-1$
	public static String EXTENSION_PRODUCT_PUBLIC = ".pub"; //$NON-NLS-1$
	
	public static final String PROPERTY_OSGI_INSTALL_AREA = "osgi.install.area"; //$NON-NLS-1$
	
	public static Path getBasePath(String from) {
		Path path = Paths.get(URI.create(from));
		return path.resolve(FOLDER_LICENSING_BASE);
	}

	public static Path resolveConfigurationPath(String from, LicensingConfiguration configuration) {
		Path basePath = getBasePath(from);
		if (configuration == null) {
			return basePath;
		}
		String product = configuration.getProductIdentifier();
		if (product == null) {
			return basePath;
		}
		Path productPath = basePath.resolve(product);
		String version = configuration.getProductVersion();
		if (version == null) {
			return productPath;
		}
		return productPath.resolve(version);
	}

	public static String composeFileName(LicensingConfiguration configuration, String extension) {
		String product = null;
		String version = null;
		if (configuration != null) {
			product = configuration.getProductIdentifier();
			version = configuration.getProductVersion();
		}
		StringBuilder sb = new StringBuilder();
		sb.append(product).append('_').append(version).append(extension);
		return sb.toString();
	}

}
