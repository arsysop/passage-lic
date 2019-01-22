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
package org.eclipse.passage.lic.registry;

public class FeaturesEvents extends RegistryEvents {

	/**
	 * Base name of all Features events
	 */
	public static final String FEATURES_TOPIC_BASE = "ru/arsysop/passage/lic/registry/features"; //$NON-NLS-1$
	
	/**
	 * Base name of all Feature Set events
	 */
	public static final String FEATURE_SET_TOPIC_BASE = FEATURES_TOPIC_BASE + TOPIC_SEP + "FeatureSet"; //$NON-NLS-1$

	/**
	 * Feature Set <code>create</code> event
	 */
	public static final String FEATURE_SET_CREATE = FEATURE_SET_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * Feature Set <code>read</code> event
	 */
	public static final String FEATURE_SET_READ = FEATURE_SET_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * Feature Set <code>update</code> event
	 */
	public static final String FEATURE_SET_UPDATE = FEATURE_SET_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * Feature Set <code>delete</code> event
	 */
	public static final String FEATURE_SET_DELETE = FEATURE_SET_TOPIC_BASE + TOPIC_SEP + DELETE;
	
	/**
	 * Base name of all Feature events
	 */
	public static final String FEATURE_TOPIC_BASE = FEATURES_TOPIC_BASE + TOPIC_SEP + "Feature"; //$NON-NLS-1$

	/**
	 * Feature <code>create</code> event
	 */
	public static final String FEATURE_CREATE = FEATURE_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * Feature <code>read</code> event
	 */
	public static final String FEATURE_READ = FEATURE_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * Feature <code>update</code> event
	 */
	public static final String FEATURE_UPDATE = FEATURE_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * Feature <code>delete</code> event
	 */
	public static final String FEATURE_DELETE = FEATURE_TOPIC_BASE + TOPIC_SEP + DELETE;
	
	/**
	 * Base name of all Feature Version events
	 */
	public static final String FEATURE_VERSION_TOPIC_BASE = FEATURES_TOPIC_BASE + TOPIC_SEP + "FeatureVersion"; //$NON-NLS-1$

	/**
	 * Feature Version <code>create</code> event
	 */
	public static final String FEATURE_VERSION_CREATE = FEATURE_VERSION_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * Feature Version <code>read</code> event
	 */
	public static final String FEATURE_VERSION_READ = FEATURE_VERSION_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * Feature Version <code>update</code> event
	 */
	public static final String FEATURE_VERSION_UPDATE = FEATURE_VERSION_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * Feature Version <code>delete</code> event
	 */
	public static final String FEATURE_VERSION_DELETE = FEATURE_VERSION_TOPIC_BASE + TOPIC_SEP + DELETE;

}
