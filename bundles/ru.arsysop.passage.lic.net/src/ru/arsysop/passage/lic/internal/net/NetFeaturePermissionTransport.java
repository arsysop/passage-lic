package ru.arsysop.passage.lic.internal.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.io.FeaturePermissionTransport;

public class NetFeaturePermissionTransport implements FeaturePermissionTransport {

	@Override
	public Iterable<FeaturePermission> readFeaturePermissions(InputStream input) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeFeaturePermissions(Iterable<FeaturePermission> conditions, OutputStream output)
			throws IOException {
		// TODO Auto-generated method stub

	}

}
