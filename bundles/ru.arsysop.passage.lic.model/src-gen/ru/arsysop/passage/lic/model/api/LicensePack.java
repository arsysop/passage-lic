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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.passage.lic.registry.LicenseGrantDescriptor;
import ru.arsysop.passage.lic.registry.LicensePackDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LicensePack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getProductIdentifier <em>Product Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getUserIdentifier <em>User Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicensePack#getLicenseConditions <em>LicensePack Conditions</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense()
 * @model superTypes="ru.arsysop.passage.lic.model.api.LicenseDescriptor"
 * @generated
 */
public interface LicensePack extends EObject, LicensePackDescriptor {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_Identifier()
	 * @model id="true" required="true" changeable="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssueDate(Date)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_IssueDate()
	 * @model required="true"
	 * @generated
	 */
	Date getIssueDate();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicensePack#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Date</em>' attribute.
	 * @see #setExpireDate(Date)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_ExpireDate()
	 * @model
	 * @generated
	 */
	Date getExpireDate();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicensePack#getExpireDate <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Date</em>' attribute.
	 * @see #getExpireDate()
	 * @generated
	 */
	void setExpireDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Identifier</em>' attribute.
	 * @see #setProductIdentifier(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_ProductIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getProductIdentifier();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicensePack#getProductIdentifier <em>Product Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Identifier</em>' attribute.
	 * @see #getProductIdentifier()
	 * @generated
	 */
	void setProductIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version</em>' attribute.
	 * @see #setProductVersion(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_ProductVersion()
	 * @model required="true"
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicensePack#getProductVersion <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' attribute.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(String value);

	/**
	 * Returns the value of the '<em><b>User Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Identifier</em>' attribute.
	 * @see #setUserIdentifier(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_UserIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getUserIdentifier();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicensePack#getUserIdentifier <em>User Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Identifier</em>' attribute.
	 * @see #getUserIdentifier()
	 * @generated
	 */
	void setUserIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_Capacity()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicensePack#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>LicensePack Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.passage.lic.model.api.LicenseGrant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LicensePack Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LicensePack Conditions</em>' containment reference list.
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicense_LicenseConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LicenseGrantDescriptor> getLicenseGrants();

} // LicensePack
