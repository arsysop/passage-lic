/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
 *
 * Licensed under the Apache LicensePack, Version 2.0 (the "LicensePack");
 * you may not use this file except in compliance with the LicensePack.
 * You may obtain a copy of the LicensePack at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the LicensePack is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the LicensePack for the specific language governing permissions and
 * limitations under the LicensePack.
 *
 * SPDX-LicensePack-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package ru.arsysop.passage.lic.integration.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.arsysop.passage.lic.inspector.HardwareInspector;
import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.api.LicenseGrant;
import ru.arsysop.passage.lic.model.api.Product;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.oshi.OshiHal;
import ru.arsysop.passage.lic.registry.LicenseGrantDescriptor;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.FeaturePermission;

public class FeaturePermissionIntegrationTest extends LicIntegrationBase {

	@Test
	public void testEvaluateConditionsNegative() {
		Iterable<FeaturePermission> permissionsNull = accessManager.evaluateConditions(null);
		assertFalse(permissionsNull.iterator().hasNext());

		Iterable<FeaturePermission> permissionsEmpty = accessManager.evaluateConditions(Collections.emptyList());
		assertFalse(permissionsEmpty.iterator().hasNext());

	}

	@Test
	public void testEvaluateConditionsPositive() throws Exception {
		LicFactory factory = LicFactory.eINSTANCE;
		Product product = factory.createProduct();
		product.setIdentifier(SOME_PRODUCT_ID);

		LicensePack license = factory.createLicense();
		EList<LicenseGrantDescriptor> licenseConditions = license.getLicenseGrants();
		LicenseGrant conditionBundle = factory.createLicenseCondition();
		conditionBundle.setAllowedFeatureId(SOME_BUNDLE_ID);
		conditionBundle.setConditionType(OshiHal.CONDITION_TYPE_HARDWARE);
		conditionBundle.setConditionExpression(HardwareInspector.PROPERTY_OS_FAMILY + '=' + '*');
		licenseConditions.add(conditionBundle);

		createProductLicense(product, license);
		Iterable<LicensingCondition> conditions = accessManager.extractConditions(product);
		assertTrue(conditions.iterator().hasNext());
		Iterable<FeaturePermission> permissions = accessManager.evaluateConditions(conditions);
		assertTrue(permissions.iterator().hasNext());
		deleteProductLicense(product);
	}

}
