package ru.arsysop.passage.lic.internal.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.io.FeaturePermissionTransport;

public class NetFeaturePermissionTransport implements FeaturePermissionTransport {

	@Override
	public Iterable<FeaturePermission> readFeaturePermissions(InputStream input) throws IOException {
		Collection<FeaturePermission> descriptors = new ArrayList<>();

		if (input != null) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			FeaturePermissionAggregator transferAgregatorObject = mapper.readValue(input,
					FeaturePermissionAggregator.class);
			descriptors.addAll(transferAgregatorObject.getFeaturePermissions());
		}

		return descriptors;
	}

	@Override
	public void writeFeaturePermissions(Iterable<FeaturePermission> conditions, OutputStream output)
			throws IOException {

	}

}
