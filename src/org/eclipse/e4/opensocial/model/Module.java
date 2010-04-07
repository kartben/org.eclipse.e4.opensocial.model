/**
 * Copyright (c) 2010 Sierra Wireless Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Benjamin Cabe, Sierra Wireless - initial API and implementation
 */
package org.eclipse.e4.opensocial.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.Module#getModulePrefs <em>Module Prefs</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Module#getUserPref <em>User Pref</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Module#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModule()
 * @model extendedMetaData="name='Module_._type' kind='elementOnly'"
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Prefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Prefs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Prefs</em>' containment reference.
	 * @see #setModulePrefs(ModulePrefs)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModule_ModulePrefs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModulePrefs' namespace='##targetNamespace'"
	 * @generated
	 */
	ModulePrefs getModulePrefs();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Module#getModulePrefs <em>Module Prefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Prefs</em>' containment reference.
	 * @see #getModulePrefs()
	 * @generated
	 */
	void setModulePrefs(ModulePrefs value);

	/**
	 * Returns the value of the '<em><b>User Pref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.UserPref}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModule_UserPref()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UserPref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UserPref> getUserPref();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModule_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Content> getContent();

} // Module
