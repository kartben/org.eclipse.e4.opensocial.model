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
 * A representation of the model object '<em><b>Preload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#getAuthz <em>Authz</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#getOauthRequestToken <em>Oauth Request Token</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#getOauthRequestTokenSecret <em>Oauth Request Token Secret</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#getOauthServiceName <em>Oauth Service Name</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#getOauthTokenName <em>Oauth Token Name</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#isSignOwner <em>Sign Owner</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#isSignViewer <em>Sign Viewer</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Preload#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload()
 * @model extendedMetaData="name='Preload_._type' kind='empty'"
 * @generated
 */
public interface Preload extends EObject {
	/**
	 * Returns the value of the '<em><b>Authz</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.eclipse.e4.opensocial.model.Authz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authz</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Authz
	 * @see #isSetAuthz()
	 * @see #unsetAuthz()
	 * @see #setAuthz(Authz)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_Authz()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='authz' namespace='##targetNamespace'"
	 * @generated
	 */
	Authz getAuthz();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getAuthz <em>Authz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authz</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Authz
	 * @see #isSetAuthz()
	 * @see #unsetAuthz()
	 * @see #getAuthz()
	 * @generated
	 */
	void setAuthz(Authz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getAuthz <em>Authz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthz()
	 * @see #getAuthz()
	 * @see #setAuthz(Authz)
	 * @generated
	 */
	void unsetAuthz();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getAuthz <em>Authz</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authz</em>' attribute is set.
	 * @see #unsetAuthz()
	 * @see #getAuthz()
	 * @see #setAuthz(Authz)
	 * @generated
	 */
	boolean isSetAuthz();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Oauth Request Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oauth Request Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oauth Request Token</em>' attribute.
	 * @see #setOauthRequestToken(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_OauthRequestToken()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='oauth_request_token' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOauthRequestToken();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getOauthRequestToken <em>Oauth Request Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth Request Token</em>' attribute.
	 * @see #getOauthRequestToken()
	 * @generated
	 */
	void setOauthRequestToken(String value);

	/**
	 * Returns the value of the '<em><b>Oauth Request Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oauth Request Token Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oauth Request Token Secret</em>' attribute.
	 * @see #setOauthRequestTokenSecret(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_OauthRequestTokenSecret()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='oauth_request_token_secret' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOauthRequestTokenSecret();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getOauthRequestTokenSecret <em>Oauth Request Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth Request Token Secret</em>' attribute.
	 * @see #getOauthRequestTokenSecret()
	 * @generated
	 */
	void setOauthRequestTokenSecret(String value);

	/**
	 * Returns the value of the '<em><b>Oauth Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oauth Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oauth Service Name</em>' attribute.
	 * @see #setOauthServiceName(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_OauthServiceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='oauth_service_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOauthServiceName();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getOauthServiceName <em>Oauth Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth Service Name</em>' attribute.
	 * @see #getOauthServiceName()
	 * @generated
	 */
	void setOauthServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Oauth Token Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oauth Token Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oauth Token Name</em>' attribute.
	 * @see #setOauthTokenName(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_OauthTokenName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='oauth_token_name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOauthTokenName();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getOauthTokenName <em>Oauth Token Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth Token Name</em>' attribute.
	 * @see #getOauthTokenName()
	 * @generated
	 */
	void setOauthTokenName(String value);

	/**
	 * Returns the value of the '<em><b>Sign Owner</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Owner</em>' attribute.
	 * @see #isSetSignOwner()
	 * @see #unsetSignOwner()
	 * @see #setSignOwner(boolean)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_SignOwner()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='sign_owner' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSignOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#isSignOwner <em>Sign Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Owner</em>' attribute.
	 * @see #isSetSignOwner()
	 * @see #unsetSignOwner()
	 * @see #isSignOwner()
	 * @generated
	 */
	void setSignOwner(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#isSignOwner <em>Sign Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignOwner()
	 * @see #isSignOwner()
	 * @see #setSignOwner(boolean)
	 * @generated
	 */
	void unsetSignOwner();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.Preload#isSignOwner <em>Sign Owner</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sign Owner</em>' attribute is set.
	 * @see #unsetSignOwner()
	 * @see #isSignOwner()
	 * @see #setSignOwner(boolean)
	 * @generated
	 */
	boolean isSetSignOwner();

	/**
	 * Returns the value of the '<em><b>Sign Viewer</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Viewer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Viewer</em>' attribute.
	 * @see #isSetSignViewer()
	 * @see #unsetSignViewer()
	 * @see #setSignViewer(boolean)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_SignViewer()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='sign_viewer' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSignViewer();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#isSignViewer <em>Sign Viewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Viewer</em>' attribute.
	 * @see #isSetSignViewer()
	 * @see #unsetSignViewer()
	 * @see #isSignViewer()
	 * @generated
	 */
	void setSignViewer(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#isSignViewer <em>Sign Viewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignViewer()
	 * @see #isSignViewer()
	 * @see #setSignViewer(boolean)
	 * @generated
	 */
	void unsetSignViewer();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.Preload#isSignViewer <em>Sign Viewer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sign Viewer</em>' attribute is set.
	 * @see #unsetSignViewer()
	 * @see #isSignViewer()
	 * @see #setSignViewer(boolean)
	 * @generated
	 */
	boolean isSetSignViewer();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' attribute.
	 * @see #setViews(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getPreload_Views()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='views' namespace='##targetNamespace'"
	 * @generated
	 */
	String getViews();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Preload#getViews <em>Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views</em>' attribute.
	 * @see #getViews()
	 * @generated
	 */
	void setViews(String value);

} // Preload
