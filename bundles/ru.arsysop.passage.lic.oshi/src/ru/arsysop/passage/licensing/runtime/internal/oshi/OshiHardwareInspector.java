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
package ru.arsysop.passage.licensing.runtime.internal.oshi;

import java.io.IOException;
import java.io.OutputStream;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import ru.arsysop.passage.licensing.runtime.inspector.HardwareInspector;
import ru.arsysop.passage.licensing.runtime.oshi.OshiHal;

public class OshiHardwareInspector implements HardwareInspector {

	@Override
	public void dumpHardwareInfo(OutputStream outputStream) throws IOException {
		SystemInfo si = new SystemInfo();

		OperatingSystem os = si.getOperatingSystem();
		outputStream.write(os.toString().getBytes());
		outputStream.write('\n');
		outputStream.write('\n');
		StringBuilder builder = new StringBuilder();
		HardwareAbstractionLayer hal = si.getHardware();
		OshiHal.dumpProcessorInfo(hal.getProcessor(), builder);
		outputStream.write(builder.toString().getBytes());
		outputStream.write('\n');
		builder.setLength(0);
		OshiHal.logDisksInfo(hal.getDiskStores(), builder);
		outputStream.write(builder.toString().getBytes());
		outputStream.write('\n');
		
	}

}
