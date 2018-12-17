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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import ru.arsysop.passage.lic.bc.BcStreamCodec;
import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.runtime.io.StreamCodec;

@SuppressWarnings("restriction")
public class LocOfflineEmulator {
	
	private static StreamCodec streamCodec = new BcStreamCodec();

	static void encodeLicense(LicensePack license, File publicFile, File privateFile, File licFile, File licenFile)
			throws IOException, FileNotFoundException {
		String publicKeyPath = publicFile.getPath();
		String privateKeyPath = privateFile.getPath();
		String username = "user"; //$NON-NLS-1$
		String password = "password"; //$NON-NLS-1$
	
		streamCodec.createKeyPair(publicKeyPath, privateKeyPath, username, password);
	
		try (FileInputStream open = new FileInputStream(licFile);
				FileOutputStream encoded = new FileOutputStream(licenFile);
				FileInputStream key = new FileInputStream(privateFile)) {
			streamCodec.encodeStream(open, encoded, key, username, password);
		}
	}

	static void storeLicense(LicensePack license, File licFile) throws IOException, FileNotFoundException {
		try (FileOutputStream fos = new FileOutputStream(licFile)) {
			Resource resource = new XMIResourceImpl();
			resource.getContents().add(license);
			resource.save(fos, new HashMap<>());
		}
	}

}
