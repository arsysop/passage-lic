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
package ru.arsysop.passage.lic.integration.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.osgi.service.environment.EnvironmentInfo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import ru.arsysop.passage.lic.base.LicensingPaths;
import ru.arsysop.passage.lic.model.api.License;
import ru.arsysop.passage.lic.model.api.Product;
import ru.arsysop.passage.lic.runtime.AccessManager;
import ru.arsysop.passage.lic.runtime.io.StreamCodec;

public abstract class LicIntegrationBase {

	static final String SOME_BUNDLE_ID = "some.licensed.bundle"; //$NON-NLS-1$
	static final String SOME_COMPONENT_ID = "some.licensed.component"; //$NON-NLS-1$
	static final String SOME_COMPONENT_VERSION = "1.2.0"; //$NON-NLS-1$

	static final String SOME_PRODUCT_ID = "some.licensed.product"; //$NON-NLS-1$
	static final String SOME_CONFIGURATION_ID = "some.licensed.configuration"; //$NON-NLS-1$

	static final String EXECUTOR_1 = "executor.1"; //$NON-NLS-1$
	static final String EXECUTOR_2 = "executor.2"; //$NON-NLS-1$
	static final String EXECUTOR_3 = "executor.3"; //$NON-NLS-1$

	/**
	 * Passed through maven-surefire-plugin configuration
	 */
	private static final String MVN_PROJECT_OUTPUT_PROPERTY = "project.build.directory"; //$NON-NLS-1$

	private static final String MVN_PROJECT_OUTPUT_VALUE = "target"; //$NON-NLS-1$

	@Rule
	public TemporaryFolder baseFolder = new TemporaryFolder(new File(resolveOutputDirName()));

	public static String resolveOutputDirName() {
		String userDir = System.getProperty("user.dir"); //$NON-NLS-1$
		String defaultValue = userDir + File.separator + MVN_PROJECT_OUTPUT_VALUE;
		String outDir = System.getProperty(MVN_PROJECT_OUTPUT_PROPERTY, defaultValue);
		return outDir;
	}

	private static ServiceReference<AccessManager> accessManagerReference;
	protected static AccessManager accessManager;
	private static ServiceReference<EnvironmentInfo> environmentInfoReference;
	protected static EnvironmentInfo environmentInfo;
	private static ServiceReference<StreamCodec> conditionCodecReference;
	protected static StreamCodec conditionCodec;

	@BeforeClass
	public static void startup() {
		Bundle bundle = FrameworkUtil.getBundle(LicIntegrationBase.class);
		BundleContext bundleContext = bundle.getBundleContext();
		accessManagerReference = bundleContext.getServiceReference(AccessManager.class);
		accessManager = bundleContext.getService(accessManagerReference);
		environmentInfoReference = bundleContext.getServiceReference(EnvironmentInfo.class);
		environmentInfo = bundleContext.getService(environmentInfoReference);
		conditionCodecReference = bundleContext.getServiceReference(StreamCodec.class);
		conditionCodec = bundleContext.getService(conditionCodecReference);
	}

	@AfterClass
	public static void shutdown() {
		accessManager = null;
		environmentInfo = null;
		conditionCodec = null;
		Bundle bundle = FrameworkUtil.getBundle(LicIntegrationBase.class);
		BundleContext bundleContext = bundle.getBundleContext();
		bundleContext.ungetService(accessManagerReference);
		accessManagerReference = null;
		bundleContext.ungetService(environmentInfoReference);
		environmentInfoReference = null;
		bundleContext.ungetService(conditionCodecReference);
		conditionCodecReference = null;
	}

	@Test
	public void testAccessManager() {
		assertNotNull(accessManager);
	}

	protected void createProductLicense(Product product, License license) throws IOException {
		String install = environmentInfo.getProperty(LicensingPaths.PROPERTY_OSGI_INSTALL_AREA);
		Path path = LicensingPaths.resolveConfigurationPath(install, product);
		Files.createDirectories(path);
		String identifier = product.getIdentifier();
		File publicFile = path.resolve(identifier + LicensingPaths.EXTENSION_PRODUCT_PUBLIC).toFile();
		File privateFile = path.resolve(identifier + ".scr").toFile(); //$NON-NLS-1$
		File licFile = path.resolve(identifier + LicensingPaths.EXTENSION_LICENSE_DECRYPTED).toFile();
		File licenFile = path.resolve(identifier + LicensingPaths.EXTENSION_LICENSE_ENCRYPTED).toFile();

		String publicKeyPath = publicFile.getPath();
		String privateKeyPath = privateFile.getPath();
		String username = "user"; //$NON-NLS-1$
		String password = "password"; //$NON-NLS-1$

		conditionCodec.createKeyPair(publicKeyPath, privateKeyPath, username, password, 1024);

		try (FileOutputStream fos = new FileOutputStream(licFile)) {
			Resource resource = new XMIResourceImpl();
			resource.getContents().add(license);
			resource.save(fos, new HashMap<>());
		}
		try (FileInputStream open = new FileInputStream(licFile);
				FileOutputStream encoded = new FileOutputStream(licenFile);
				FileInputStream key = new FileInputStream(privateFile)) {
			conditionCodec.encodeStream(open, encoded, key, username, password);
		}
	}

	protected void deleteProductLicense(Product product) throws IOException {
		String install = environmentInfo.getProperty(LicensingPaths.PROPERTY_OSGI_INSTALL_AREA);
		Path path = LicensingPaths.resolveConfigurationPath(install, product);
		FileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				if (exc != null) {
					throw exc;
				}
				Files.delete(dir);
				return FileVisitResult.CONTINUE;
			}
		};
		Files.walkFileTree(path, visitor);
	}
}
