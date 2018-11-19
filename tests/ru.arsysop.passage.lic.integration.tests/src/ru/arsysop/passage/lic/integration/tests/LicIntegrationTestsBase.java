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

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import ru.arsysop.passage.lic.runtime.AccessManager;

public abstract class LicIntegrationTestsBase {
	
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

	@BeforeClass
	public static void startup() {
		Bundle bundle = FrameworkUtil.getBundle(LicIntegrationTestsBase.class);
		BundleContext bundleContext = bundle.getBundleContext();
		accessManagerReference = bundleContext.getServiceReference(AccessManager.class);
		accessManager = bundleContext.getService(accessManagerReference);
	}

	@AfterClass
	public static void shutdown() {
		accessManager = null;
		Bundle bundle = FrameworkUtil.getBundle(LicIntegrationTestsBase.class);
		BundleContext bundleContext = bundle.getBundleContext();
		bundleContext.ungetService(accessManagerReference);
		accessManagerReference = null;
	}

	@Test
	public void testAccessManager() {
		assertNotNull(accessManager);
	}

}
