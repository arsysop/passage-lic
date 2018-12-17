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

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import ru.arsysop.passage.lic.base.LicensingConfigurations;
import ru.arsysop.passage.lic.base.LicensingNamespaces;
import ru.arsysop.passage.lic.inspector.HardwareInspector;
import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.api.LicenseGrant;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.oshi.OshiHal;
import ru.arsysop.passage.lic.runtime.LicensingConfiguration;

public class AccessManagerIntegrationTest extends LicIntegrationBase {
	
	private static final String UNDEFINED = "undefined"; //$NON-NLS-1$
	
	@Before
	public void beforeTest() {
		System.setProperty(SOME_BUNDLE_ID, UNDEFINED);
		System.setProperty(SOME_COMPONENT_ID, UNDEFINED);
	}

	@Test
	public void testAccessManagerNoLicenseDecrypted() {
		assertEquals(UNDEFINED, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
		assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
		accessManager.executeAccessRestrictions(LicensingConfigurations.create(SOME_DECRYPTED_PRODUCT, null));
		assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_ERROR, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
		assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_WARN, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
	}
	
	@Test
	public void testAccessManagerNoLicenseEncrypted() {
		assertEquals(UNDEFINED, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
		assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
		accessManager.executeAccessRestrictions(LicensingConfigurations.create(SOME_ENCRYPTED_PRODUCT, null));
		assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_ERROR, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
		assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_WARN, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
	}

	@Test
	public void testAccessManagerLicensedDecrypted() throws IOException {
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
		LicensingConfiguration configuration = LicensingConfigurations.create(SOME_DECRYPTED_PRODUCT, null);
	
		try {
			createProductLicense(configuration, license, false);
			
			assertEquals(UNDEFINED, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
			assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
			accessManager.executeAccessRestrictions(configuration);
			assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_ERROR, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
			assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
			
		} finally {
			deleteProductLicense(configuration, false);
		}
	}

	@Test
	public void testAccessManagerLicensedEncrypted() throws IOException {
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
		LicensingConfiguration configuration = LicensingConfigurations.create(SOME_ENCRYPTED_PRODUCT, null);

		try {
			createProductLicense(configuration, license, true);
			
			assertEquals(UNDEFINED, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
			assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
			accessManager.executeAccessRestrictions(configuration);
			assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_ERROR, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
			assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
			
		} finally {
			deleteProductLicense(configuration, true);
		}
	}
}
