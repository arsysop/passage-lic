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
package ru.arsysop.passage.licensing.runtime.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Provides the key required for given configuration
 *
 */
public interface KeyKeeper {
	
	/**
	 * 
	 * @param configuration
	 * @return the stream to read the key
	 * @throws IOException
	 */
	
	InputStream openKeyStream(Object configuration) throws IOException;

}
