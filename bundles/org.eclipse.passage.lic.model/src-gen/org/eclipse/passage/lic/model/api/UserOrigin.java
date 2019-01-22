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
package org.eclipse.passage.lic.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.passage.lic.registry.UserOriginDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.passage.lic.model.api.UserOrigin#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.UserOrigin#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.UserOrigin#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.UserOrigin#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see org.eclipse.passage.lic.model.meta.LicPackage#getUserOrigin()
 * @model superTypes="org.eclipse.passage.lic.model.api.UserOriginDescriptor"
 * @generated
 */
public interface UserOrigin extends EObject, UserOriginDescriptor {
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
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getUserOrigin_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.UserOrigin#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getUserOrigin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.UserOrigin#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getUserOrigin_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.UserOrigin#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.passage.lic.model.api.User}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.passage.lic.model.api.User#getUserOrigin <em>User Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getUserOrigin_Users()
	 * @see org.eclipse.passage.lic.model.api.User#getUserOrigin
	 * @model opposite="userOrigin" containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // UserOrigin
