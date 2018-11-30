/**
 * 	Copyright (c) 2018 ArSysOp
 * 
 * 	Licensed under the Apache LicensePack, Version 2.0 (the "LicensePack");
 * 	you may not use this file except in compliance with the LicensePack.
 * 	You may obtain a copy of the LicensePack at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the LicensePack is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the LicensePack for the specific language governing permissions and
 * 	limitations under the LicensePack.
 * 
 * 	SPDX-LicensePack-Identifier: Apache-2.0
 * 
 * 	Contributors:
 * 		ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.passage.lic.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.passage.lic.registry.ProductVersionDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.api.ProductVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.ProductVersion#getProduct <em>Product</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.ProductVersion#getInstallationToken <em>Installation Token</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.ProductVersion#getSecureToken <em>Secure Token</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.ProductVersion#getProductVersionFeatures <em>Product Version Features</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.ProductVersion#getNews <em>News</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProductVersion()
 * @model superTypes="ru.arsysop.passage.lic.model.api.ProductVersionDescriptor"
 * @generated
 */
public interface ProductVersion extends EObject, ProductVersionDescriptor {
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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProductVersion_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.passage.lic.model.api.Product#getProductVersions <em>Product Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' container reference.
	 * @see #setProduct(Product)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProductVersion_Product()
	 * @see ru.arsysop.passage.lic.model.api.Product#getProductVersions
	 * @model opposite="productVersions" required="true" transient="false"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getProduct <em>Product</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' container reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProductVersion_InstallationToken()
	 * @model
	 * @generated
	 */
	String getInstallationToken();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getInstallationToken <em>Installation Token</em>}' attribute.
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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProductVersion_SecureToken()
	 * @model
	 * @generated
	 */
	String getSecureToken();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getSecureToken <em>Secure Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Token</em>' attribute.
	 * @see #getSecureToken()
	 * @generated
	 */
	void setSecureToken(String value);

	/**
	 * Returns the value of the '<em><b>Product Version Features</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.passage.lic.model.api.ProductVersionFeature}.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.passage.lic.model.api.ProductVersionFeature#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version Features</em>' containment reference list.
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProductVersion_ProductVersionFeatures()
	 * @see ru.arsysop.passage.lic.model.api.ProductVersionFeature#getProductVersion
	 * @model opposite="productVersion" containment="true"
	 * @generated
	 */
	EList<ProductVersionFeature> getProductVersionFeatures();

	/**
	 * Returns the value of the '<em><b>News</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>News</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>News</em>' attribute.
	 * @see #setNews(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getProductVersion_News()
	 * @model
	 * @generated
	 */
	String getNews();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getNews <em>News</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>News</em>' attribute.
	 * @see #getNews()
	 * @generated
	 */
	void setNews(String value);

} // ProductVersion
