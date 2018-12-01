package ru.arsysop.passage.lic.net.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeNoException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ru.arsysop.passage.lic.internal.net.FeaturePermissionAggregator;
import ru.arsysop.passage.lic.internal.net.FloatingFeaturePermission;
import ru.arsysop.passage.lic.internal.net.NetFeaturePermissionTransport;
import ru.arsysop.passage.lic.runtime.FeaturePermission;

@SuppressWarnings("restriction")
public class NetFeaturePermissionTransportTest {

	@Test
	public void netFeaturePermissionTransportTest() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		FeaturePermissionAggregator conditionAggregator = createFeaturePermissionAggregator();
		try {
			byte[] byteValues = mapper.writeValueAsBytes(conditionAggregator);
			ByteArrayInputStream bis = new ByteArrayInputStream(byteValues);
			NetFeaturePermissionTransport transport = new NetFeaturePermissionTransport();
			Iterable<FeaturePermission> conditions = transport.readFeaturePermissions(bis);
			assertNotNull(conditions);

		} catch (JsonProcessingException e) {
			assumeNoException(e);
		} catch (IOException e) {
			assumeNoException(e);
		}
	}

	@SuppressWarnings("restriction")
	private FeaturePermissionAggregator createFeaturePermissionAggregator() {
		FeaturePermissionAggregator permissionAggregator = new FeaturePermissionAggregator();
		FloatingFeaturePermission descriptor = new FloatingFeaturePermission("test.id", "test.version.1", "", 1L, 1L);
		permissionAggregator.addFeaturePermission(descriptor);
		return permissionAggregator;

	}
}
