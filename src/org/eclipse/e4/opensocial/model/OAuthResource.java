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
 * A representation of the model object '<em><b>OAuth Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.OAuthResource#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.OAuthResource#getParamLocation <em>Param Location</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.OAuthResource#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getOAuthResource()
 * @model extendedMetaData="name='OAuthResource' kind='empty'"
 * @generated
 */
public interface OAuthResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link org.eclipse.e4.opensocial.model.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Method
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #setMethod(Method)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getOAuthResource_Method()
	 * @model default="GET" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.OAuthResource#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Method
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.OAuthResource#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethod()
	 * @see #getMethod()
	 * @see #setMethod(Method)
	 * @generated
	 */
	void unsetMethod();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.OAuthResource#getMethod <em>Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method</em>' attribute is set.
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @see #setMethod(Method)
	 * @generated
	 */
	boolean isSetMethod();

	/**
	 * Returns the value of the '<em><b>Param Location</b></em>' attribute.
	 * The default value is <code>"auth-header"</code>.
	 * The literals are from the enumeration {@link org.eclipse.e4.opensocial.model.ParamLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Location</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.ParamLocation
	 * @see #isSetParamLocation()
	 * @see #unsetParamLocation()
	 * @see #setParamLocation(ParamLocation)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getOAuthResource_ParamLocation()
	 * @model default="auth-header" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='param_location' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamLocation getParamLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.OAuthResource#getParamLocation <em>Param Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Location</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.ParamLocation
	 * @see #isSetParamLocation()
	 * @see #unsetParamLocation()
	 * @see #getParamLocation()
	 * @generated
	 */
	void setParamLocation(ParamLocation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.OAuthResource#getParamLocation <em>Param Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParamLocation()
	 * @see #getParamLocation()
	 * @see #setParamLocation(ParamLocation)
	 * @generated
	 */
	void unsetParamLocation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.OAuthResource#getParamLocation <em>Param Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Param Location</em>' attribute is set.
	 * @see #unsetParamLocation()
	 * @see #getParamLocation()
	 * @see #setParamLocation(ParamLocation)
	 * @generated
	 */
	boolean isSetParamLocation();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getOAuthResource_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.OAuthResource#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // OAuthResource
