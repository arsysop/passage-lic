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
package ru.arsysop.passage.lic.model.api;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.passage.lic.registry.ProductDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Product#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Product#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Product#getName <em>Name</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Product#getInstallationToken <em>Installation Token</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Product#getSecureToken <em>Secure Token</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProduct()
 * @model superTypes="ru.arsysop.passage.lic.model.api.ProductDescriptor"
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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProduct_Identifier()
	 * @model
	 * @generated
	 */
  String getIdentifier();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Product#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProduct_Version()
	 * @model
	 * @generated
	 */
  String getVersion();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Product#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
  void setVersion(String value);

  /**
	 * Returns the value of the '<em><b>Installation Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Installation Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation Token</em>' attribute.
	 * @see #setInstallationToken(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProduct_InstallationToken()
	 * @model
	 * @generated
	 */
  String getInstallationToken();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Product#getInstallationToken <em>Installation Token</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation Token</em>' attribute.
	 * @see #getInstallationToken()
	 * @generated
	 */
  void setInstallationToken(String value);

  /**
	 * Returns the value of the '<em><b>Secure Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secure Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Token</em>' attribute.
	 * @see #setSecureToken(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProduct_SecureToken()
	 * @model
	 * @generated
	 */
  String getSecureToken();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Product#getSecureToken <em>Secure Token</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Token</em>' attribute.
	 * @see #getSecureToken()
	 * @generated
	 */
  void setSecureToken(String value);

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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProduct_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
   * @generated NOT
   * @return
   */
  String createPassword();

} // Product
