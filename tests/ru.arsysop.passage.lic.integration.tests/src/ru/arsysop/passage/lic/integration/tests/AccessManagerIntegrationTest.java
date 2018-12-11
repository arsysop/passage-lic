package ru.arsysop.passage.lic.integration.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import ru.arsysop.passage.lic.base.LicensingConfigurations;
import ru.arsysop.passage.lic.base.LicensingNamespaces;
import ru.arsysop.passage.lic.inspector.HardwareInspector;
import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.api.LicenseGrant;
import ru.arsysop.passage.lic.model.api.Product;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.oshi.OshiHal;

public class AccessManagerIntegrationTest extends LicIntegrationBase {
	
	private static final String UNDEFINED = "undefined"; //$NON-NLS-1$
	
	@Before
	public void beforeTest() {
		System.setProperty(SOME_BUNDLE_ID, UNDEFINED);
		System.setProperty(SOME_COMPONENT_ID, UNDEFINED);
	}

	@Test
	public void testAccessManagerNoLicense() {
		assertEquals(UNDEFINED, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
		assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
		accessManager.executeAccessRestrictions(null);
		assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_ERROR, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
		assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_WARN, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
	}

	@Test
	public void testAccessManagerOsgiInstall() throws IOException {
		LicFactory factory = LicFactory.eINSTANCE;
		Product product = factory.createProduct();
		product.setIdentifier(SOME_PRODUCT_ID);
		LicensePack license = factory.createLicensePack();
		EList<LicenseGrant> licenseConditions = license.getLicenseGrants();
		LicenseGrant conditionBundle = factory.createLicenseGrant();
		conditionBundle.setFeatureIdentifier(SOME_BUNDLE_ID);
		conditionBundle.setConditionType(OshiHal.CONDITION_TYPE_HARDWARE);
		conditionBundle.setConditionExpression(HardwareInspector.PROPERTY_OS_FAMILY + '=' + '*');
		licenseConditions.add(conditionBundle);
		try {
			createProductLicense(product, license);
			
			assertEquals(UNDEFINED, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
			assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
			Map<String, String> configuration = LicensingConfigurations.createProductConfiguration(SOME_PRODUCT_ID, null);
			accessManager.executeAccessRestrictions(configuration);
			assertEquals(LicensingNamespaces.ATTRIBUTE_LEVEL_ERROR, System.getProperty(SOME_COMPONENT_ID, UNDEFINED));
			assertEquals(UNDEFINED, System.getProperty(SOME_BUNDLE_ID, UNDEFINED));
			
		} finally {
			deleteProductLicense(product);
		}
	}

}
