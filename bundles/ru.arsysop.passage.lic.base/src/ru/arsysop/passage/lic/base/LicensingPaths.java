package ru.arsysop.passage.lic.base;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LicensingPaths {

	public static String FOLDER_LICENSING_BASE = ".passage"; //$NON-NLS-1$
	public static String EXTENSION_LICENSE_ENCRYPTED = ".licen"; //$NON-NLS-1$
	
	public static final String PROPERTY_OSGI_INSTALL_AREA = "osgi.install.area"; //$NON-NLS-1$

	public static Path getBasePath(String from) {
		Path path = Paths.get(URI.create(from));
		return path.resolve(FOLDER_LICENSING_BASE);
	}


}
