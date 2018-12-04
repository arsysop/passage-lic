package ru.arsysop.passage.lic.net.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.arsysop.passage.lic.base.BaseFeaturePermission;
import ru.arsysop.passage.lic.base.FeaturePermissions;
import ru.arsysop.passage.lic.internal.net.FeaturePermissionAggregator;
import ru.arsysop.passage.lic.internal.net.FeaturePermissionMixln;
import ru.arsysop.passage.lic.internal.net.NetFeaturePermissionTransport;
import ru.arsysop.passage.lic.runtime.FeaturePermission;

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
			Iterable<FeaturePermission> conditions = transport.readFeaturePermissions(bis);
			assertNotNull(conditions);
			for (FeaturePermission permition : conditions) {
				assertTrue(permition.getFeatureIdentifier().equals(FEATURE_TEST_ID));
				assertTrue(permition.getMatchVersion().equals(FEATURE_TEST_VERSION));
				assertTrue(permition.getMatchRule().equals(FEATURE_TEST_RULE));
				assertTrue(permition.getLeaseTime() == FEATURE_TEST_LEASE_TIME);
				assertTrue(permition.getExpireTime() == FEATURE_TEST_EXPIRE_TIME);
			}

		} catch (JsonProcessingException e) {
			assumeNoException(e);
		} catch (IOException e) {
			assumeNoException(e);
		}
	}

	private FeaturePermissionAggregator createFeaturePermissionAggregator() {
		FeaturePermissionAggregator permissionAggregator = new FeaturePermissionAggregator();
		BaseFeaturePermission descriptor = FeaturePermissions.create(FEATURE_TEST_ID, FEATURE_TEST_VERSION,
				FEATURE_TEST_RULE, FEATURE_TEST_LEASE_TIME, FEATURE_TEST_EXPIRE_TIME);
		permissionAggregator.addFeaturePermission(descriptor);
		return permissionAggregator;

	}
}
