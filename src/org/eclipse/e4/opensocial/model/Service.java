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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.Service#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Service#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Service#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getService()
 * @model extendedMetaData="name='Service_._type' kind='elementOnly'"
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(OAuthResource)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getService_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Request' namespace='##targetNamespace'"
	 * @generated
	 */
	OAuthResource getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Service#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(OAuthResource value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(OAuthResource)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getService_Access()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Access' namespace='##targetNamespace'"
	 * @generated
	 */
	OAuthResource getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Service#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(OAuthResource value);

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' containment reference.
	 * @see #setAuthorization(Authorization)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getService_Authorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Authorization' namespace='##targetNamespace'"
	 * @generated
	 */
	Authorization getAuthorization();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Service#getAuthorization <em>Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' containment reference.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(Authorization value);

} // Service
