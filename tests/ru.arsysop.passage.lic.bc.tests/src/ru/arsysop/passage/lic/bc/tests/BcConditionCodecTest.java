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
package ru.arsysop.passage.lic.bc.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import ru.arsysop.passage.lic.bc.BcConditionCodec;

@SuppressWarnings("restriction")
public class BcConditionCodecTest {

	/**
	 * Passed through maven-surefire-plugin configuration
	 */
	private static final String MVN_PROJECT_OUTPUT_PROPERTY = "project.build.directory"; //$NON-NLS-1$

	private static final String MVN_PROJECT_OUTPUT_VALUE = "target"; //$NON-NLS-1$

	@SuppressWarnings("nls")
	private static final String TEST_CONTENT = "#some test content" + //
			"my.product=cool one" + //
			"my.feature.1=essential one" +
			"my.feature.2=special one";

	@Rule
	public TemporaryFolder keyFolder = new TemporaryFolder(new File(resolveOutputDirName()));

	public static String resolveOutputDirName() {
		String userDir = System.getProperty("user.dir"); //$NON-NLS-1$
		String defaultValue = userDir + File.separator + MVN_PROJECT_OUTPUT_VALUE;
		String outDir = System.getProperty(MVN_PROJECT_OUTPUT_PROPERTY, defaultValue);
		return outDir;
	}

	@Test
	public void testCodecPositive() throws Exception {
		BcConditionCodec codec = new BcConditionCodec();
		File publicFile = keyFolder.newFile("key.pub"); //$NON-NLS-1$
		String publicKey = publicFile.getPath();
		File privateFile = keyFolder.newFile("key.scr"); //$NON-NLS-1$
		String privateKey = privateFile.getPath();
		String username = "user"; //$NON-NLS-1$
		String password = "password"; //$NON-NLS-1$
		codec.createKeyPair(publicKey, privateKey, username, password, 1024);
		assertTrue(publicFile.exists());
		assertTrue(privateFile.exists());

		byte[] source = TEST_CONTENT.getBytes();
		ByteArrayInputStream openInput = new ByteArrayInputStream(source);
		ByteArrayOutputStream encodedOutput = new ByteArrayOutputStream();
		codec.encodeStream(openInput, encodedOutput, new FileInputStream(privateFile), username, password);

		ByteArrayInputStream encodedSource = new ByteArrayInputStream(encodedOutput.toByteArray());
		ByteArrayOutputStream openOutput = new ByteArrayOutputStream();
		Object decodeKey = codec.decodeStream(encodedSource, openOutput, new FileInputStream(publicFile), null);
		assertNotNull(decodeKey);
		byte[] target = openOutput.toByteArray();
		assertArrayEquals(source, target);
	}

}
