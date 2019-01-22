/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.eclipse.passage.lic.registry;

public interface ProductRegistry extends DescriptorRegistry {

	Iterable<ProductLineDescriptor> getProductLines();

	ProductLineDescriptor getProductLine(String productLineId);

	Iterable<ProductDescriptor> getProducts();

	Iterable<ProductDescriptor> getProducts(String productLineId);
	
	ProductDescriptor getProduct(String productId);

	Iterable<ProductVersionDescriptor> getProductVersions();

	Iterable<ProductVersionDescriptor> getProductVersions(String productId);

	ProductVersionDescriptor getProductVersion(String productId, String version);

	Iterable<ProductVersionFeatureDescriptor> getProductVersionFeatures();

	Iterable<ProductVersionFeatureDescriptor> getProductVersionFeatures(String productId, String version);

}
