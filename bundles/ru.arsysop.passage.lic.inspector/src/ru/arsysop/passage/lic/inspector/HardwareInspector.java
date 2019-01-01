/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
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
package ru.arsysop.passage.lic.inspector;

import java.io.IOException;
import java.io.OutputStream;

public interface HardwareInspector {
	
	String PROPERTY_OS_FAMILY = "os.family"; //$NON-NLS-1$
	String PROPERTY_OS_MANUFACTURER = "os.manufacturer"; //$NON-NLS-1$
	String PROPERTY_OS_VERSION = "os.version"; //$NON-NLS-1$
	String PROPERTY_OS_BUILDNUMBER = "os.buildnumber"; //$NON-NLS-1$

	String PROPERTY_SYSTEM_MANUFACTURER = "system.manufacturer"; //$NON-NLS-1$
	String PROPERTY_SYSTEM_MODEL = "system.model"; //$NON-NLS-1$
	String PROPERTY_SYSTEM_SERIALNUMBER = "system.serialnumber"; //$NON-NLS-1$

	String PROPERTY_BASEBOARD_MANUFACTURER = "baseboard.manufacturer"; //$NON-NLS-1$
	String PROPERTY_BASEBOARD_MODEL = "baseboard.model"; //$NON-NLS-1$
	String PROPERTY_BASEBOARD_VERSION = "baseboard.version"; //$NON-NLS-1$
	String PROPERTY_BASEBOARD_SERIALNUMBER = "baseboard.serialnumber"; //$NON-NLS-1$

	String PROPERTY_FIRMWARE_MANUFACTURER = "firmware.manufacturer"; //$NON-NLS-1$
	String PROPERTY_FIRMWARE_VERSION = "firmware.version"; //$NON-NLS-1$
	String PROPERTY_FIRMWARE_RELEASEDATE = "firmware.releasedate"; //$NON-NLS-1$
	String PROPERTY_FIRMWARE_NAME = "firmware.name"; //$NON-NLS-1$
	String PROPERTY_FIRMWARE_DESCRIPTION = "firmware.description"; //$NON-NLS-1$

	String PROPERTY_CPU_VENDOR = "cpu.vendor"; //$NON-NLS-1$;
	String PROPERTY_CPU_FAMILY = "cpu.family"; //$NON-NLS-1$
	String PROPERTY_CPU_MODEL = "cpu.model"; //$NON-NLS-1$
	String PROPERTY_CPU_NAME = "cpu.name"; //$NON-NLS-1$
	String PROPERTY_CPU_IDENTIFIER = "cpu.identifier"; //$NON-NLS-1$
	String PROPERTY_CPU_PROCESSORID = "cpu.processorid"; //$NON-NLS-1$

	void dumpHardwareInfo(OutputStream output) throws IOException;

	Iterable<String> getKnownProperties();

	String inspectProperty(String name);

}
