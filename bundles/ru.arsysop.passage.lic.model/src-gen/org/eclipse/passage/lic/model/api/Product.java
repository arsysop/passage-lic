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
package org.eclipse.passage.lic.model.api;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.passage.lic.registry.ProductDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.passage.lic.model.api.Product#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.Product#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.Product#getProductLine <em>Product Line</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.Product#getProductVersions <em>Product Versions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProduct()
 * @model superTypes="org.eclipse.passage.lic.model.api.ProductDescriptor"
 * @generated
 */
public interface Product extends EObject, ProductDescriptor {
  /**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProduct_Identifier()
	 * @model required="true"
	 * @generated
	 */
  String getIdentifier();

  /**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.Product#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
  void setIdentifier(String value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProduct_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Product Line</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.passage.lic.model.api.ProductLine#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Line</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Line</em>' container reference.
	 * @see #setProductLine(ProductLine)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProduct_ProductLine()
	 * @see org.eclipse.passage.lic.model.api.ProductLine#getProducts
	 * @model opposite="products" required="true" transient="false"
	 * @generated
	 */
	ProductLine getProductLine();

		/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.Product#getProductLine <em>Product Line</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Line</em>' container reference.
	 * @see #getProductLine()
	 * @generated
	 */
	void setProductLine(ProductLine value);

		/**
	 * Returns the value of the '<em><b>Product Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.passage.lic.model.api.ProductVersion}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.passage.lic.model.api.ProductVersion#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Versions</em>' containment reference list.
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProduct_ProductVersions()
	 * @see org.eclipse.passage.lic.model.api.ProductVersion#getProduct
	 * @model opposite="product" containment="true"
	 * @generated
	 */
	EList<ProductVersion> getProductVersions();

} // Product
