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
package ru.arsysop.passage.lic.runtime.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import ru.arsysop.passage.lic.runtime.ConditionDescriptor;

/**
 * Transport interface for {@link ConditionDescriptor}(s)
 */
public interface ConditionDescriptorTransport {

	/**
	 * Reads {@link ConditionDescriptor}(s) from the given {@link InputStream}. 
	 *
	 */
	Iterable<ConditionDescriptor> readConditionDescriptors(InputStream input) throws IOException;

	/**
	 * Writes {@link ConditionDescriptor}(s) from the given {@link OutputStream}. 
	 *
	 */
	void writeConditionDescriptors(Iterable<ConditionDescriptor> conditions, OutputStream output) throws IOException;

}