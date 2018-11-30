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
package ru.arsysop.passage.lic.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ru.arsysop.passage.lic.model.api.*;
import ru.arsysop.passage.lic.model.api.Feature;
import ru.arsysop.passage.lic.model.api.User;
import ru.arsysop.passage.lic.model.api.Product;
import ru.arsysop.passage.lic.model.meta.LicPackage;
import ru.arsysop.passage.lic.registry.FeatureDescriptor;
import ru.arsysop.passage.lic.registry.FeatureVersionDescriptor;
import ru.arsysop.passage.lic.registry.LicensePackDescriptor;
import ru.arsysop.passage.lic.registry.UserDescriptor;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.registry.ProductDescriptor;
import ru.arsysop.passage.lic.registry.ProductVersionDescriptor;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.arsysop.passage.lic.model.meta.LicPackage
 * @generated
 */
public class LicSwitch<T> extends Switch<T> {
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static LicPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LicSwitch() {
		if (modelPackage == null) {
			modelPackage = LicPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LicPackage.FEATURE_DESCRIPTOR: {
				FeatureDescriptor featureDescriptor = (FeatureDescriptor)theEObject;
				T result = caseFeatureDescriptor(featureDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.FEATURE_VERSION_DESCRIPTOR: {
				FeatureVersionDescriptor featureVersionDescriptor = (FeatureVersionDescriptor)theEObject;
				T result = caseFeatureVersionDescriptor(featureVersionDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.PRODUCT_DESCRIPTOR: {
				ProductDescriptor productDescriptor = (ProductDescriptor)theEObject;
				T result = caseProductDescriptor(productDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.PRODUCT_VERSION_DESCRIPTOR: {
				ProductVersionDescriptor productVersionDescriptor = (ProductVersionDescriptor)theEObject;
				T result = caseProductVersionDescriptor(productVersionDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.USER_DESCRIPTOR: {
				UserDescriptor userDescriptor = (UserDescriptor)theEObject;
				T result = caseUserDescriptor(userDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.LICENSE_DESCRIPTOR: {
				LicensePackDescriptor licenseDescriptor = (LicensePackDescriptor)theEObject;
				T result = caseLicenseDescriptor(licenseDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.CONDITION_DESCRIPTOR: {
				LicensingCondition conditionDescriptor = (LicensingCondition)theEObject;
				T result = caseConditionDescriptor(conditionDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseFeatureDescriptor(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.FEATURE_VERSION: {
				FeatureVersion featureVersion = (FeatureVersion)theEObject;
				T result = caseFeatureVersion(featureVersion);
				if (result == null) result = caseFeatureVersionDescriptor(featureVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseProductDescriptor(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.PRODUCT_VERSION: {
				ProductVersion productVersion = (ProductVersion)theEObject;
				T result = caseProductVersion(productVersion);
				if (result == null) result = caseProductVersionDescriptor(productVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.PRODUCT_VERSION_FEATURE: {
				ProductVersionFeature productVersionFeature = (ProductVersionFeature)theEObject;
				T result = caseProductVersionFeature(productVersionFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseUserDescriptor(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.LICENSE: {
				LicensePack license = (LicensePack)theEObject;
				T result = caseLicense(license);
				if (result == null) result = caseLicenseDescriptor(license);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LicPackage.LICENSE_CONDITION: {
				LicenseGrant licenseCondition = (LicenseGrant)theEObject;
				T result = caseLicenseCondition(licenseCondition);
				if (result == null) result = caseConditionDescriptor(licenseCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Product Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDescriptor(ProductDescriptor object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Version Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Version Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductVersionDescriptor(ProductVersionDescriptor object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureDescriptor(FeatureDescriptor object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Version Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Version Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureVersionDescriptor(FeatureVersionDescriptor object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>User Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDescriptor(UserDescriptor object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>LicensePack Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LicensePack Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseDescriptor(LicensePackDescriptor object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionDescriptor(LicensingCondition object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProduct(Product object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Product Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductVersion(ProductVersion object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Version Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Version Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductVersionFeature(ProductVersionFeature object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureVersion(FeatureVersion object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>LicensePack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LicensePack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicense(LicensePack object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>LicensePack Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LicensePack Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseCondition(LicenseGrant object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object) {
		return null;
	}

} //PassageSwitch
