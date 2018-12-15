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

import java.util.Collections;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.arsysop.passage.lic.base.LicensingConfigurations;
import ru.arsysop.passage.lic.inspector.HardwareInspector;
import ru.arsysop.passage.lic.model.api.LicenseGrant;
import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.oshi.OshiHal;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.LicensingConfiguration;

public class FeaturePermissionIntegrationTest extends LicIntegrationBase {

	@Test
	public void testEvaluateConditionsNegative() {
		Iterable<FeaturePermission> permissionsNull = accessManager.evaluateConditions(null, null);
		assertFalse(permissionsNull.iterator().hasNext());

		Iterable<FeaturePermission> permissionsEmpty = accessManager.evaluateConditions(Collections.emptyList(), null);
		assertFalse(permissionsEmpty.iterator().hasNext());

	}

	@Test
	public void testEvaluateConditionsPositive() throws Exception {
		LicFactory factory = LicFactory.eINSTANCE;
		LicensePack license = factory.createLicensePack();
		EList<LicenseGrant> licenseGrants = license.getLicenseGrants();
		LicenseGrant grant = factory.createLicenseGrant();
		grant.setFeatureIdentifier(SOME_BUNDLE_ID);
		grant.setConditionType(OshiHal.CONDITION_TYPE_HARDWARE);
		grant.setConditionExpression(HardwareInspector.PROPERTY_OS_FAMILY + '=' + '*');
		grant.setValidFrom(new Date(System.currentTimeMillis() - 100500));
		grant.setValidUntil(new Date(System.currentTimeMillis() + 100500));
		licenseGrants.add(grant);

		String identifier = SOME_PRODUCT_ID;
		LicensingConfiguration configuration = LicensingConfigurations.create(identifier, null);
		createProductLicense(configuration, license);
		Iterable<LicensingCondition> conditions = accessManager.extractConditions(configuration);
		assertTrue(conditions.iterator().hasNext());
		Iterable<FeaturePermission> permissions = accessManager.evaluateConditions(conditions, configuration);
		assertTrue(permissions.iterator().hasNext());
		deleteProductLicense(configuration);
	}

}
