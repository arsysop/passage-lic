package ru.arsysop.passage.lic.net.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.arsysop.passage.lic.base.BaseFeaturePermission;
import ru.arsysop.passage.lic.base.BaseLicensingCondition;
import ru.arsysop.passage.lic.base.FeaturePermissions;
import ru.arsysop.passage.lic.base.LicensingConditions;
import ru.arsysop.passage.lic.internal.net.FeaturePermissionAggregator;
import ru.arsysop.passage.lic.internal.net.FeaturePermissionMixln;
import ru.arsysop.passage.lic.internal.net.NetFeaturePermissionTransport;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.LicensingCondition;

@SuppressWarnings("restriction")
public class NetFeaturePermissionTransportTest {

	private static final String FEATURE_TEST_VERSION = "test.version.1"; //$NON-NLS-1$
	private static final String FEATURE_TEST_ID = "test.id"; //$NON-NLS-1$
	private static final String FEATURE_TEST_RULE = "test.rule"; //$NON-NLS-1$
	private static final long FEATURE_TEST_LEASE_TIME = 3000l;
	private static final long FEATURE_TEST_EXPIRE_TIME = 4000l;

	@Test
	public void netFeaturePermissionTransportTest() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
		mapper.addMixIn(BaseFeaturePermission.class, FeaturePermissionMixln.class);

		FeaturePermissionAggregator conditionAggregator = createFeaturePermissionAggregator();
		try {
			byte[] byteValues = mapper.writeValueAsBytes(conditionAggregator);
			ByteArrayInputStream bis = new ByteArrayInputStream(byteValues);
			NetFeaturePermissionTransport transport = new NetFeaturePermissionTransport();
			Iterable<FeaturePermission> permissions = transport.readFeaturePermissions(bis);
			assertNotNull(permissions);
			for (FeaturePermission permission : permissions) {
				LicensingCondition condition = permission.getLicensingCondition();
				assertNotNull(condition);
				assertTrue(condition.getFeatureIdentifier().equals(FEATURE_TEST_ID));
				assertTrue(condition.getMatchVersion().equals(FEATURE_TEST_VERSION));
				assertTrue(condition.getMatchRule().equals(FEATURE_TEST_RULE));
				assertTrue(permission.getLeaseTime() == FEATURE_TEST_LEASE_TIME);
				assertTrue(permission.getExpireTime() == FEATURE_TEST_EXPIRE_TIME);
			}

		} catch (JsonProcessingException e) {
			assumeNoException(e);
		} catch (IOException e) {
			assumeNoException(e);
		}
	}

	private FeaturePermissionAggregator createFeaturePermissionAggregator() {
		FeaturePermissionAggregator permissionAggregator = new FeaturePermissionAggregator();
		Date from = null;
		Date until = null;
		BaseLicensingCondition condition = LicensingConditions.create(FEATURE_TEST_ID, FEATURE_TEST_VERSION, FEATURE_TEST_RULE, from, until, null, null);
		BaseFeaturePermission permission = FeaturePermissions.create(condition, FEATURE_TEST_LEASE_TIME, FEATURE_TEST_EXPIRE_TIME);
		permissionAggregator.addFeaturePermission(permission);
		return permissionAggregator;

	}
}
