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
package ru.arsysop.passage.lic.model.core.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import ru.arsysop.passage.lic.model.api.License;
import ru.arsysop.passage.lic.model.api.LicenseCondition;
import ru.arsysop.passage.lic.model.core.XmiLicenseConditionExtractor;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.runtime.ConditionDescriptor;

public class XmiLicenseConditionExtractorTest {

	private static final String COND1_FEATURE_ID = "loc.workbench"; //$NON-NLS-1$
	private static final String COND1_CONDITION_TYPE = "hardware"; //$NON-NLS-1$
	private static final String COND1_CONDITION_EXPRESSION = "mac=*"; //$NON-NLS-1$

	private static final String COND2_FEATURE_ID = "loc.products.matrix"; //$NON-NLS-1$
	private static final String COND2_CONDITION_TYPE = "hardware"; //$NON-NLS-1$
	private static final String COND2_CONDITION_EXPRESSION = "hdd=*"; //$NON-NLS-1$

	/**
	 * Passed through maven-surefire-plugin configuration
	 */
	private static final String MVN_PROJECT_OUTPUT_PROPERTY = "project.build.directory"; //$NON-NLS-1$

	private static final String MVN_PROJECT_OUTPUT_VALUE = "target"; //$NON-NLS-1$

	@Rule
	public TemporaryFolder keyFolder = new TemporaryFolder(new File(resolveOutputDirName()));

	public static String resolveOutputDirName() {
		String userDir = System.getProperty("user.dir"); //$NON-NLS-1$
		String defaultValue = userDir + File.separator + MVN_PROJECT_OUTPUT_VALUE;
		String outDir = System.getProperty(MVN_PROJECT_OUTPUT_PROPERTY, defaultValue);
		return outDir;
	}
	
	@Test
	public void testExtractorPositive() throws Exception {
		XmiLicenseConditionExtractor extractor = new XmiLicenseConditionExtractor();
		
		LicFactory factory = LicFactory.eINSTANCE;
		License license = factory.createLicense();
		EList<LicenseCondition> conditions = license.getLicenseConditions();
		LicenseCondition cond1 = factory.createLicenseCondition();
		cond1.setAllowedFeatureId(COND1_FEATURE_ID);
		cond1.setConditionType(COND1_CONDITION_TYPE);
		cond1.setConditionExpression(COND1_CONDITION_EXPRESSION);
		conditions.add(cond1);
		LicenseCondition cond2 = factory.createLicenseCondition();
		cond2.setAllowedFeatureId(COND2_FEATURE_ID);
		cond2.setConditionType(COND2_CONDITION_TYPE);
		cond2.setConditionExpression(COND2_CONDITION_EXPRESSION);
		conditions.add(cond2);

		File file = keyFolder.newFile("some.lic"); //$NON-NLS-1$
		try (FileOutputStream fos = new FileOutputStream(file)) {
			Resource saved = new XMIResourceImpl();
			saved.getContents().add(license);
			saved.save(fos, new HashMap<>());
		}

		List<ConditionDescriptor> actual = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(file)) {
			Iterable<ConditionDescriptor> extracted = extractor.extractConditions(fis);
			for (ConditionDescriptor descriptor : extracted) {
				actual.add(descriptor);
			}
		}
		assertEquals(2, actual.size());
		ConditionDescriptor actual1 = actual.get(0);
		assertEquals(COND1_FEATURE_ID, actual1.getAllowedFeatureId());
		assertEquals(COND1_CONDITION_TYPE, actual1.getConditionType());
		assertEquals(COND1_CONDITION_EXPRESSION, actual1.getConditionExpression());
		ConditionDescriptor actual2 = actual.get(1);
		assertEquals(COND2_FEATURE_ID, actual2.getAllowedFeatureId());
		assertEquals(COND2_CONDITION_TYPE, actual2.getConditionType());
		assertEquals(COND2_CONDITION_EXPRESSION, actual2.getConditionExpression());
	}
	
	

}
