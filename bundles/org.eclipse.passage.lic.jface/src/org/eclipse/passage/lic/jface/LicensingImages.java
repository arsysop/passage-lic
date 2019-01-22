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
package org.eclipse.passage.lic.jface;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public interface LicensingImages {
	
	String IMG_DEFAULT = "IMG_DEFAULT"; //$NON-NLS-1$

	String IMG_LEVEL_OK = "IMG_LEVEL_OK"; //$NON-NLS-1$
	String IMG_LEVEL_INFO = "IMG_LEVEL_INFO"; //$NON-NLS-1$
	String IMG_LEVEL_WARN = "IMG_LEVEL_WARN"; //$NON-NLS-1$
	String IMG_LEVEL_ERROR = "IMG_LEVEL_ERROR"; //$NON-NLS-1$
	String IMG_LEVEL_FATAL = "IMG_LEVEL_FATAL"; //$NON-NLS-1$
	
	public Image getImage(String identifier);
	public ImageDescriptor getImageDescriptor(String identifier);
	
}
