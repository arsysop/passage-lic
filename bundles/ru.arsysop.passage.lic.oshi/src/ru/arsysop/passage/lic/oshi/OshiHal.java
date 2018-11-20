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
package ru.arsysop.passage.lic.oshi;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HWPartition;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

//FIXME: AF: extract tests
public class OshiHal {
	
	public static final String LICENSING_CONDITION_TYPE_HARDWARE = "hardware"; //$NON-NLS-1$
	public static final String LICENSING_CONDITION_KEY_MAC = "mac"; //$NON-NLS-1$
	public static final String LICENSING_CONDITION_VALUE_ANY = "*"; //$NON-NLS-1$

	public static void logHardwareInfo() {

		System.out.println("Initializing System...");
		SystemInfo si = new SystemInfo();

		HardwareAbstractionLayer hal = si.getHardware();
		OperatingSystem os = si.getOperatingSystem();

		System.out.println(os);

		System.out.println("Checking Processor...");
		StringBuilder builder = new StringBuilder();
		dumpProcessorInfo(hal.getProcessor(), builder);
		System.out.println(builder);

		builder.setLength(0);
		System.out.println("Checking Disks...");
		logDisksInfo(hal.getDiskStores(), builder);
	}

	public static String getProcessorId(CentralProcessor processor) {
		if (processor == null) {
			return "";
		}
		return processor.getIdentifier();
	}

	public static String getHardDiskId(HWDiskStore disk) {
		if (disk == null) {
			return "";
		}
		return disk.getSerial();
	}

	public static String getActiveNetworkAdapterId() throws SocketException, UnknownHostException {
		InetAddress ipAddress = InetAddress.getLocalHost();
		if (ipAddress != null) {
			NetworkInterface network = NetworkInterface.getByInetAddress(ipAddress);
			byte[] mac = network.getHardwareAddress();
			return convertHardwareAddressToString(mac);
		}
		return "";
	}

	public static List<String> getNetworksAdaptersId() throws SocketException {
		List<String> lstHwAddresses = new ArrayList<>();

		Enumeration<NetworkInterface> nwAdapters = NetworkInterface.getNetworkInterfaces();
		if (nwAdapters == null) {
			return lstHwAddresses;
		}
		while (nwAdapters.hasMoreElements()) {
			NetworkInterface adapter = nwAdapters.nextElement();
			byte[] hwAddress = adapter.getHardwareAddress();
			lstHwAddresses.add(convertHardwareAddressToString(hwAddress));
		}
		return lstHwAddresses;
	}

	public static void logDisksInfo(HWDiskStore[] diskStores, StringBuilder builder) {
		builder.append("Disks:");
		for (HWDiskStore disk : diskStores) {
			boolean readwrite = disk.getReads() > 0 || disk.getWrites() > 0;
			String format = String.format(" %s: (model: %s - S/N: %s) size: %s, reads: %s (%s), writes: %s (%s), xfer: %s ms%n",
					disk.getName(), disk.getModel(), disk.getSerial(),
					disk.getSize() > 0 ? FormatUtil.formatBytesDecimal(disk.getSize()) : "?",
					readwrite ? disk.getReads() : "?", readwrite ? FormatUtil.formatBytes(disk.getReadBytes()) : "?",
					readwrite ? disk.getWrites() : "?", readwrite ? FormatUtil.formatBytes(disk.getWriteBytes()) : "?",
					readwrite ? disk.getTransferTime() : "?");
			builder.append(format);
			HWPartition[] partitions = disk.getPartitions();
			if (partitions == null) {
				continue;
			}
			for (HWPartition part : partitions) {
				System.out.format(" |-- %s: %s (%s) Maj:Min=%d:%d, size: %s%s%n", part.getIdentification(),
						part.getName(), part.getType(), part.getMajor(), part.getMinor(),
						FormatUtil.formatBytesDecimal(part.getSize()),
						part.getMountPoint().isEmpty() ? "" : " @ " + part.getMountPoint());
			}
		}
	}

	public static void dumpProcessorInfo(CentralProcessor processor, StringBuilder builder) {
		builder.append(processor).append('\n');
		builder.append(" " + processor.getPhysicalPackageCount() + " physical CPU package(s)").append('\n');
		builder.append(" " + processor.getPhysicalProcessorCount() + " physical CPU core(s)").append('\n');
		builder.append(" " + processor.getLogicalProcessorCount() + " logical CPU(s)").append('\n');
		builder.append("Identifier: " + processor.getIdentifier()).append('\n');
		builder.append("ProcessorID: " + processor.getProcessorID()).append('\n');
	}

	private static String convertHardwareAddressToString(byte[] macAddress) {
		if (macAddress == null || macAddress.length <= 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < macAddress.length; i++) {
			sb.append(String.format("%02X%s", macAddress[i], (i < macAddress.length - 1) ? "-" : ""));
		}
		return sb.toString();
	}

	public static boolean evaluateMac(String value) {
		if (LICENSING_CONDITION_VALUE_ANY.equals(value)) {
			return true;
		}
		return false;
	}
}
