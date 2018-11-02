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
package ru.arsysop.passage.licensing.runtime.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ru.arsysop.passage.licensing.runtime.model.api.Feature;
import ru.arsysop.passage.licensing.runtime.model.api.Licensee;
import ru.arsysop.passage.licensing.runtime.model.api.Product;
import ru.arsysop.passage.licensing.runtime.model.meta.LicensingPackage;
import ru.arsysop.passage.licensing.runtime.registry.FeatureDescriptor;
import ru.arsysop.passage.licensing.runtime.registry.LicenseeDescriptor;
import ru.arsysop.passage.licensing.runtime.registry.ProductDescriptor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.passage.licensing.runtime.model.meta.LicensingPackage
 * @generated
 */
public class LicensingAdapterFactory extends AdapterFactoryImpl {
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static LicensingPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LicensingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LicensingPackage.eINSTANCE;
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
  protected LicensingSwitch<Adapter> modelSwitch =
    new LicensingSwitch<Adapter>() {
			@Override
			public Adapter caseProductDescriptor(ProductDescriptor object) {
				return createProductDescriptorAdapter();
			}
			@Override
			public Adapter caseFeatureDescriptor(FeatureDescriptor object) {
				return createFeatureDescriptorAdapter();
			}
			@Override
			public Adapter caseLicenseeDescriptor(LicenseeDescriptor object) {
				return createLicenseeDescriptorAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseLicensee(Licensee object) {
				return createLicenseeAdapter();
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
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.licensing.runtime.registry.ProductDescriptor <em>Product Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.licensing.runtime.registry.ProductDescriptor
	 * @generated
	 */
	public Adapter createProductDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.licensing.runtime.registry.FeatureDescriptor <em>Feature Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.licensing.runtime.registry.FeatureDescriptor
	 * @generated
	 */
	public Adapter createFeatureDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.licensing.runtime.registry.LicenseeDescriptor <em>Licensee Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.licensing.runtime.registry.LicenseeDescriptor
	 * @generated
	 */
	public Adapter createLicenseeDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.licensing.runtime.model.api.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.licensing.runtime.model.api.Product
	 * @generated
	 */
  public Adapter createProductAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.licensing.runtime.model.api.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.licensing.runtime.model.api.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.passage.licensing.runtime.model.api.Licensee <em>Licensee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.passage.licensing.runtime.model.api.Licensee
	 * @generated
	 */
	public Adapter createLicenseeAdapter() {
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
