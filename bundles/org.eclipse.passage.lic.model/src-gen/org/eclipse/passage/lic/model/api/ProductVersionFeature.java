/**
 * 	Copyright (c) 2018-2019 ArSysOp
 * 
 * 	Licensed under the Apache License, Version 2.0 (the "License");
 * 	you may not use this file except in compliance with the License.
 * 	You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 * 
 * 	SPDX-License-Identifier: Apache-2.0
 * 
 * 	Contributors:
 * 		ArSysOp - initial API and implementation
 * 
 */
package org.eclipse.passage.lic.model.api;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.passage.lic.registry.ProductVersionFeatureDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Version Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getFeatureIdentifier <em>Feature Identifier</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getFeatureVersion <em>Feature Version</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getRestrictionLevel <em>Restriction Level</em>}</li>
 *   <li>{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getProductVersion <em>Product Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProductVersionFeature()
 * @model superTypes="org.eclipse.passage.lic.model.api.ProductVersionFeatureDescriptor"
 * @generated
 */
public interface ProductVersionFeature extends EObject, ProductVersionFeatureDescriptor {
	/**
	 * Returns the value of the '<em><b>Feature Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Identifier</em>' attribute.
	 * @see #setFeatureIdentifier(String)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProductVersionFeature_FeatureIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getFeatureIdentifier <em>Feature Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Identifier</em>' attribute.
	 * @see #getFeatureIdentifier()
	 * @generated
	 */
	void setFeatureIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Feature Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Version</em>' attribute.
	 * @see #setFeatureVersion(String)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProductVersionFeature_FeatureVersion()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getFeatureVersion <em>Feature Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Version</em>' attribute.
	 * @see #getFeatureVersion()
	 * @generated
	 */
	void setFeatureVersion(String value);

	/**
	 * Returns the value of the '<em><b>Restriction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Level</em>' attribute.
	 * @see #setRestrictionLevel(String)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProductVersionFeature_RestrictionLevel()
	 * @model
	 * @generated
	 */
	String getRestrictionLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getRestrictionLevel <em>Restriction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Level</em>' attribute.
	 * @see #getRestrictionLevel()
	 * @generated
	 */
	void setRestrictionLevel(String value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.passage.lic.model.api.ProductVersion#getProductVersionFeatures <em>Product Version Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version</em>' container reference.
	 * @see #setProductVersion(ProductVersion)
	 * @see org.eclipse.passage.lic.model.meta.LicPackage#getProductVersionFeature_ProductVersion()
	 * @see org.eclipse.passage.lic.model.api.ProductVersion#getProductVersionFeatures
	 * @model opposite="productVersionFeatures" required="true" transient="false"
	 * @generated
	 */
	ProductVersion getProductVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.passage.lic.model.api.ProductVersionFeature#getProductVersion <em>Product Version</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' container reference.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(ProductVersion value);

} // ProductVersionFeature
