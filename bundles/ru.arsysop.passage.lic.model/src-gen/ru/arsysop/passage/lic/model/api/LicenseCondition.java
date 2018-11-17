/**
 * 	Copyright (c) 2018 ArSysOp
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
package ru.arsysop.passage.lic.model.api;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.passage.lic.runtime.ConditionDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureId <em>Allowed Feature Id</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchVersion <em>Allowed Feature Match Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchRule <em>Allowed Feature Match Rule</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionType <em>Condition Type</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicenseCondition()
 * @model superTypes="ru.arsysop.passage.lic.model.api.ConditionDescriptor"
 * @generated
 */
public interface LicenseCondition extends EObject, ConditionDescriptor {
	/**
	 * Returns the value of the '<em><b>Allowed Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Feature Id</em>' attribute.
	 * @see #setAllowedFeatureId(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicenseCondition_AllowedFeatureId()
	 * @model required="true"
	 * @generated
	 */
	String getAllowedFeatureId();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureId <em>Allowed Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Feature Id</em>' attribute.
	 * @see #getAllowedFeatureId()
	 * @generated
	 */
	void setAllowedFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Feature Match Version</b></em>' attribute.
	 * The default value is <code>"0.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Feature Match Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Feature Match Version</em>' attribute.
	 * @see #setAllowedFeatureMatchVersion(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicenseCondition_AllowedFeatureMatchVersion()
	 * @model default="0.0.0" required="true"
	 * @generated
	 */
	String getAllowedFeatureMatchVersion();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchVersion <em>Allowed Feature Match Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Feature Match Version</em>' attribute.
	 * @see #getAllowedFeatureMatchVersion()
	 * @generated
	 */
	void setAllowedFeatureMatchVersion(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Feature Match Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Feature Match Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Feature Match Rule</em>' attribute.
	 * @see #setAllowedFeatureMatchRule(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicenseCondition_AllowedFeatureMatchRule()
	 * @model
	 * @generated
	 */
	String getAllowedFeatureMatchRule();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchRule <em>Allowed Feature Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Feature Match Rule</em>' attribute.
	 * @see #getAllowedFeatureMatchRule()
	 * @generated
	 */
	void setAllowedFeatureMatchRule(String value);

	/**
	 * Returns the value of the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Type</em>' attribute.
	 * @see #setConditionType(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicenseCondition_ConditionType()
	 * @model required="true"
	 * @generated
	 */
	String getConditionType();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionType <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Type</em>' attribute.
	 * @see #getConditionType()
	 * @generated
	 */
	void setConditionType(String value);

	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' attribute.
	 * @see #setConditionExpression(String)
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#getLicenseCondition_ConditionExpression()
	 * @model required="true"
	 * @generated
	 */
	String getConditionExpression();

	/**
	 * Sets the value of the '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionExpression <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' attribute.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(String value);

} // LicenseCondition
