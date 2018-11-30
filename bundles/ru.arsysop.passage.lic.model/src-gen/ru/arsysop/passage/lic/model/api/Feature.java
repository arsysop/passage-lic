/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
 *
 * Licensed under the Apache LicensePack, Version 2.0 (the "LicensePack");
 * you may not use this file except in compliance with the LicensePack.
 * You may obtain a copy of the LicensePack at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the LicensePack is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the LicensePack for the specific language governing permissions and
 * limitations under the LicensePack.
 *
 * SPDX-LicensePack-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package ru.arsysop.passage.lic.model.api;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ru.arsysop.passage.lic.registry.FeatureDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Feature#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Feature#getName <em>Name</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.Feature#getFeatureVersions <em>Feature Versions</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getFeature()
 * @model superTypes="ru.arsysop.passage.lic.model.api.FeatureDescriptor"
 * @generated
 */
public interface Feature extends EObject, FeatureDescriptor {
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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Feature#getName <em>Name</em>}' attribute.
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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Feature Versions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.arsysop.passage.lic.model.api.FeatureVersion}.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.passage.lic.model.api.FeatureVersion#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Versions</em>' containment reference list.
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getFeature_FeatureVersions()
	 * @see ru.arsysop.passage.lic.model.api.FeatureVersion#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	EList<FeatureVersion> getFeatureVersions();

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
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getFeature_Identifier()
	 * @model
	 * @generated
	 */
  String getIdentifier();

  /**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.Feature#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
  void setIdentifier(String value);

} // Component
