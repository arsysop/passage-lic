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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.passage.lic.model.meta.LicPackage
 * @generated
 */
public class LicAdapterFactory extends AdapterFactoryImpl {
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static LicPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LicPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LicSwitch<Adapter> modelSwitch =
    new LicSwitch<Adapter>() {
			@Override
			public Adapter caseFeatureDescriptor(FeatureDescriptor object) {
				return createFeatureDescriptorAdapter();
			}
			@Override
			public Adapter caseFeatureVersionDescriptor(FeatureVersionDescriptor object) {
				return createFeatureVersionDescriptorAdapter();
			}
			@Override
			public Adapter caseProductDescriptor(ProductDescriptor object) {
				return createProductDescriptorAdapter();
			}
			@Override
			public Adapter caseProductVersionDescriptor(ProductVersionDescriptor object) {
				return createProductVersionDescriptorAdapter();
			}
			@Override
			public Adapter caseUserDescriptor(UserDescriptor object) {
				return createUserDescriptorAdapter();
			}
			@Override
			public Adapter caseLicenseDescriptor(LicensePackDescriptor object) {
				return createLicenseDescriptorAdapter();
			}
			@Override
			public Adapter caseConditionDescriptor(LicensingCondition object) {
				return createConditionDescriptorAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureVersion(FeatureVersion object) {
				return createFeatureVersionAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseProductVersion(ProductVersion object) {
				return createProductVersionAdapter();
			}
			@Override
			public Adapter caseProductVersionFeature(ProductVersionFeature object) {
				return createProductVersionFeatureAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseLicense(LicensePack object) {
				return createLicenseAdapter();
			}
			@Override
			public Adapter caseLicenseCondition(LicenseGrant object) {
				return createLicenseConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.registry.ProductDescriptor <em>Product Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.registry.ProductDescriptor
	 * @generated
	 */
	public Adapter createProductDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.registry.ProductVersionDescriptor <em>Product Version Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.registry.ProductVersionDescriptor
	 * @generated
	 */
	public Adapter createProductVersionDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.registry.FeatureDescriptor
	 * @generated
	 */
	public Adapter createFeatureDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.registry.FeatureVersionDescriptor <em>Feature Version Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.registry.FeatureVersionDescriptor
	 * @generated
	 */
	public Adapter createFeatureVersionDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.registry.UserDescriptor <em>User Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.registry.UserDescriptor
	 * @generated
	 */
	public Adapter createUserDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.registry.LicensePackDescriptor <em>LicensePack Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.registry.LicensePackDescriptor
	 * @generated
	 */
	public Adapter createLicenseDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.runtime.LicensingCondition <em>Condition Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.runtime.LicensingCondition
	 * @generated
	 */
	public Adapter createConditionDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.Product
	 * @generated
	 */
  public Adapter createProductAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.ProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion
	 * @generated
	 */
	public Adapter createProductVersionAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.ProductVersionFeature <em>Product Version Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersionFeature
	 * @generated
	 */
	public Adapter createProductVersionFeatureAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.FeatureVersion <em>Feature Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.FeatureVersion
	 * @generated
	 */
	public Adapter createFeatureVersionAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.LicensePack <em>LicensePack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.LicensePack
	 * @generated
	 */
	public Adapter createLicenseAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.lic.model.api.LicenseGrant <em>LicensePack Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.lic.model.api.LicenseGrant
	 * @generated
	 */
	public Adapter createLicenseConditionAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter() {
		return null;
	}

} //LicensingAdapterFactory
