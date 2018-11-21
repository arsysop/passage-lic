package ru.arsysop.passage.lic.integration.tests;

import org.osgi.service.component.annotations.Component;

import ru.arsysop.passage.lic.base.LicensingProperties;

@Component(property = { LicensingProperties.LICENSING_FEATURE_IDENTIFIER + "=some.licensed.component",
		LicensingProperties.LICENSING_MATCH_VERSION + '=' + "1.2.0",
		LicensingProperties.LICENSING_MATCH_RULE + '=' + LicensingProperties.LICENSING_MATCH_RULE_EXACT,
		LicensingProperties.LICENSING_RESTRICTION_LEVEL + '=' + LicensingProperties.LICENSING_RESTRICTION_LEVEL_ERROR })
public class LicIntegrationComponent {

}
