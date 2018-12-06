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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.arsysop.passage.lic.inspector.HardwareInspector;
import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.api.LicenseGrant;
import ru.arsysop.passage.lic.model.api.Product;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.oshi.OshiHal;
import ru.arsysop.passage.lic.runtime.LicensingCondition;

public class LicensingConditionIntegrationTest extends LicIntegrationBase {

	@Test
	public void testExtractConditionsNegative() {
		Iterable<LicensingCondition> conditionsNull = accessManager.extractConditions(null);
		assertFalse(conditionsNull.iterator().hasNext());

		Iterable<LicensingCondition> conditionsObject = accessManager.extractConditions(new Object());
		assertFalse(conditionsObject.iterator().hasNext());

		Iterable<LicensingCondition> conditionsProduct = accessManager
				.extractConditions(LicFactory.eINSTANCE.createProduct());
		assertFalse(conditionsProduct.iterator().hasNext());

		Product product = LicFactory.eINSTANCE.createProduct();
		product.setIdentifier(SOME_PRODUCT_ID);
		Iterable<LicensingCondition> conditions = accessManager.extractConditions(product);
		assertFalse(conditions.iterator().hasNext());
	}

	@Test
	public void testExtractConditionsPositive() throws Exception {
		LicFactory factory = LicFactory.eINSTANCE;
		Product product = factory.createProduct();
		product.setIdentifier(SOME_PRODUCT_ID);

		LicensePack license = factory.createLicensePack();
		EList<LicenseGrant> licenseGrants = license.getLicenseGrants();
		LicenseGrant conditionBundle = factory.createLicenseGrant();
		conditionBundle.setFeatureIdentifier(SOME_BUNDLE_ID);
		conditionBundle.setConditionType(OshiHal.CONDITION_TYPE_HARDWARE);
		conditionBundle.setConditionExpression(HardwareInspector.PROPERTY_OS_FAMILY + '=' + '*');
		licenseGrants.add(conditionBundle);

		createProductLicense(product, license);
		Iterable<LicensingCondition> conditions = accessManager.extractConditions(product);
		assertTrue(conditions.iterator().hasNext());
		deleteProductLicense(product);
	}

	@Test
	public void testExtractConditionsServerPositive() throws Exception {
		LicFactory factory = LicFactory.eINSTANCE;
		Product product = factory.createProduct();
		product.setIdentifier(SOME_PRODUCT_ID);

		LicensePack license = factory.createLicensePack();
		EList<LicenseGrant> licenseGrants = license.getLicenseGrants();
		LicenseGrant conditionBundle = factory.createLicenseGrant();
		conditionBundle.setFeatureIdentifier(SOME_BUNDLE_ID);
		conditionBundle.setConditionType(OshiHal.CONDITION_TYPE_HARDWARE);
		conditionBundle.setConditionExpression(HardwareInspector.PROPERTY_OS_FAMILY + '=' + '*');
		licenseGrants.add(conditionBundle);

		createProductLicense(product, license);
		createServerConfiguration(product);
		Iterable<LicensingCondition> conditions = accessManager.extractConditions(product);
		assertTrue(conditions.iterator().hasNext());
		deleteProductLicense(product);
	}

}
