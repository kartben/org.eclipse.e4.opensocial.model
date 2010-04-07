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
package org.eclipse.e4.opensocial.model.impl;

import org.eclipse.e4.opensocial.model.Authz;
import org.eclipse.e4.opensocial.model.OpenSocialPackage;
import org.eclipse.e4.opensocial.model.Preload;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#getAuthz <em>Authz</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#getOauthRequestToken <em>Oauth Request Token</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#getOauthRequestTokenSecret <em>Oauth Request Token Secret</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#getOauthServiceName <em>Oauth Service Name</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#getOauthTokenName <em>Oauth Token Name</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#isSignOwner <em>Sign Owner</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#isSignViewer <em>Sign Viewer</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreloadImpl extends EObjectImpl implements Preload {
	/**
	 * The default value of the '{@link #getAuthz() <em>Authz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthz()
	 * @generated
	 * @ordered
	 */
	protected static final Authz AUTHZ_EDEFAULT = Authz.NONE;

	/**
	 * The cached value of the '{@link #getAuthz() <em>Authz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthz()
	 * @generated
	 * @ordered
	 */
	protected Authz authz = AUTHZ_EDEFAULT;

	/**
	 * This is true if the Authz attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authzESet;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOauthRequestToken() <em>Oauth Request Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthRequestToken()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH_REQUEST_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauthRequestToken() <em>Oauth Request Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthRequestToken()
	 * @generated
	 * @ordered
	 */
	protected String oauthRequestToken = OAUTH_REQUEST_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOauthRequestTokenSecret() <em>Oauth Request Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthRequestTokenSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH_REQUEST_TOKEN_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauthRequestTokenSecret() <em>Oauth Request Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthRequestTokenSecret()
	 * @generated
	 * @ordered
	 */
	protected String oauthRequestTokenSecret = OAUTH_REQUEST_TOKEN_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOauthServiceName() <em>Oauth Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH_SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauthServiceName() <em>Oauth Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthServiceName()
	 * @generated
	 * @ordered
	 */
	protected String oauthServiceName = OAUTH_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOauthTokenName() <em>Oauth Token Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthTokenName()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH_TOKEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauthTokenName() <em>Oauth Token Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauthTokenName()
	 * @generated
	 * @ordered
	 */
	protected String oauthTokenName = OAUTH_TOKEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSignOwner() <em>Sign Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignOwner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGN_OWNER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSignOwner() <em>Sign Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignOwner()
	 * @generated
	 * @ordered
	 */
	protected boolean signOwner = SIGN_OWNER_EDEFAULT;

	/**
	 * This is true if the Sign Owner attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signOwnerESet;

	/**
	 * The default value of the '{@link #isSignViewer() <em>Sign Viewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignViewer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGN_VIEWER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSignViewer() <em>Sign Viewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignViewer()
	 * @generated
	 * @ordered
	 */
	protected boolean signViewer = SIGN_VIEWER_EDEFAULT;

	/**
	 * This is true if the Sign Viewer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signViewerESet;

	/**
	 * The default value of the '{@link #getViews() <em>Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected String views = VIEWS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenSocialPackage.Literals.PRELOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authz getAuthz() {
		return authz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthz(Authz newAuthz) {
		Authz oldAuthz = authz;
		authz = newAuthz == null ? AUTHZ_EDEFAULT : newAuthz;
		boolean oldAuthzESet = authzESet;
		authzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__AUTHZ, oldAuthz, authz, !oldAuthzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthz() {
		Authz oldAuthz = authz;
		boolean oldAuthzESet = authzESet;
		authz = AUTHZ_EDEFAULT;
		authzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.PRELOAD__AUTHZ, oldAuthz, AUTHZ_EDEFAULT, oldAuthzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthz() {
		return authzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOauthRequestToken() {
		return oauthRequestToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOauthRequestToken(String newOauthRequestToken) {
		String oldOauthRequestToken = oauthRequestToken;
		oauthRequestToken = newOauthRequestToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN, oldOauthRequestToken, oauthRequestToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOauthRequestTokenSecret() {
		return oauthRequestTokenSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOauthRequestTokenSecret(String newOauthRequestTokenSecret) {
		String oldOauthRequestTokenSecret = oauthRequestTokenSecret;
		oauthRequestTokenSecret = newOauthRequestTokenSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN_SECRET, oldOauthRequestTokenSecret, oauthRequestTokenSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOauthServiceName() {
		return oauthServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOauthServiceName(String newOauthServiceName) {
		String oldOauthServiceName = oauthServiceName;
		oauthServiceName = newOauthServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__OAUTH_SERVICE_NAME, oldOauthServiceName, oauthServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOauthTokenName() {
		return oauthTokenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOauthTokenName(String newOauthTokenName) {
		String oldOauthTokenName = oauthTokenName;
		oauthTokenName = newOauthTokenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__OAUTH_TOKEN_NAME, oldOauthTokenName, oauthTokenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSignOwner() {
		return signOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignOwner(boolean newSignOwner) {
		boolean oldSignOwner = signOwner;
		signOwner = newSignOwner;
		boolean oldSignOwnerESet = signOwnerESet;
		signOwnerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__SIGN_OWNER, oldSignOwner, signOwner, !oldSignOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignOwner() {
		boolean oldSignOwner = signOwner;
		boolean oldSignOwnerESet = signOwnerESet;
		signOwner = SIGN_OWNER_EDEFAULT;
		signOwnerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.PRELOAD__SIGN_OWNER, oldSignOwner, SIGN_OWNER_EDEFAULT, oldSignOwnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignOwner() {
		return signOwnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSignViewer() {
		return signViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignViewer(boolean newSignViewer) {
		boolean oldSignViewer = signViewer;
		signViewer = newSignViewer;
		boolean oldSignViewerESet = signViewerESet;
		signViewerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__SIGN_VIEWER, oldSignViewer, signViewer, !oldSignViewerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignViewer() {
		boolean oldSignViewer = signViewer;
		boolean oldSignViewerESet = signViewerESet;
		signViewer = SIGN_VIEWER_EDEFAULT;
		signViewerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.PRELOAD__SIGN_VIEWER, oldSignViewer, SIGN_VIEWER_EDEFAULT, oldSignViewerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignViewer() {
		return signViewerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViews() {
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViews(String newViews) {
		String oldViews = views;
		views = newViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.PRELOAD__VIEWS, oldViews, views));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenSocialPackage.PRELOAD__AUTHZ:
				return getAuthz();
			case OpenSocialPackage.PRELOAD__HREF:
				return getHref();
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN:
				return getOauthRequestToken();
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN_SECRET:
				return getOauthRequestTokenSecret();
			case OpenSocialPackage.PRELOAD__OAUTH_SERVICE_NAME:
				return getOauthServiceName();
			case OpenSocialPackage.PRELOAD__OAUTH_TOKEN_NAME:
				return getOauthTokenName();
			case OpenSocialPackage.PRELOAD__SIGN_OWNER:
				return isSignOwner();
			case OpenSocialPackage.PRELOAD__SIGN_VIEWER:
				return isSignViewer();
			case OpenSocialPackage.PRELOAD__VIEWS:
				return getViews();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenSocialPackage.PRELOAD__AUTHZ:
				setAuthz((Authz)newValue);
				return;
			case OpenSocialPackage.PRELOAD__HREF:
				setHref((String)newValue);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN:
				setOauthRequestToken((String)newValue);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN_SECRET:
				setOauthRequestTokenSecret((String)newValue);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_SERVICE_NAME:
				setOauthServiceName((String)newValue);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_TOKEN_NAME:
				setOauthTokenName((String)newValue);
				return;
			case OpenSocialPackage.PRELOAD__SIGN_OWNER:
				setSignOwner((Boolean)newValue);
				return;
			case OpenSocialPackage.PRELOAD__SIGN_VIEWER:
				setSignViewer((Boolean)newValue);
				return;
			case OpenSocialPackage.PRELOAD__VIEWS:
				setViews((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenSocialPackage.PRELOAD__AUTHZ:
				unsetAuthz();
				return;
			case OpenSocialPackage.PRELOAD__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN:
				setOauthRequestToken(OAUTH_REQUEST_TOKEN_EDEFAULT);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN_SECRET:
				setOauthRequestTokenSecret(OAUTH_REQUEST_TOKEN_SECRET_EDEFAULT);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_SERVICE_NAME:
				setOauthServiceName(OAUTH_SERVICE_NAME_EDEFAULT);
				return;
			case OpenSocialPackage.PRELOAD__OAUTH_TOKEN_NAME:
				setOauthTokenName(OAUTH_TOKEN_NAME_EDEFAULT);
				return;
			case OpenSocialPackage.PRELOAD__SIGN_OWNER:
				unsetSignOwner();
				return;
			case OpenSocialPackage.PRELOAD__SIGN_VIEWER:
				unsetSignViewer();
				return;
			case OpenSocialPackage.PRELOAD__VIEWS:
				setViews(VIEWS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenSocialPackage.PRELOAD__AUTHZ:
				return isSetAuthz();
			case OpenSocialPackage.PRELOAD__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN:
				return OAUTH_REQUEST_TOKEN_EDEFAULT == null ? oauthRequestToken != null : !OAUTH_REQUEST_TOKEN_EDEFAULT.equals(oauthRequestToken);
			case OpenSocialPackage.PRELOAD__OAUTH_REQUEST_TOKEN_SECRET:
				return OAUTH_REQUEST_TOKEN_SECRET_EDEFAULT == null ? oauthRequestTokenSecret != null : !OAUTH_REQUEST_TOKEN_SECRET_EDEFAULT.equals(oauthRequestTokenSecret);
			case OpenSocialPackage.PRELOAD__OAUTH_SERVICE_NAME:
				return OAUTH_SERVICE_NAME_EDEFAULT == null ? oauthServiceName != null : !OAUTH_SERVICE_NAME_EDEFAULT.equals(oauthServiceName);
			case OpenSocialPackage.PRELOAD__OAUTH_TOKEN_NAME:
				return OAUTH_TOKEN_NAME_EDEFAULT == null ? oauthTokenName != null : !OAUTH_TOKEN_NAME_EDEFAULT.equals(oauthTokenName);
			case OpenSocialPackage.PRELOAD__SIGN_OWNER:
				return isSetSignOwner();
			case OpenSocialPackage.PRELOAD__SIGN_VIEWER:
				return isSetSignViewer();
			case OpenSocialPackage.PRELOAD__VIEWS:
				return VIEWS_EDEFAULT == null ? views != null : !VIEWS_EDEFAULT.equals(views);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (authz: ");
		if (authzESet) result.append(authz); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", oauthRequestToken: ");
		result.append(oauthRequestToken);
		result.append(", oauthRequestTokenSecret: ");
		result.append(oauthRequestTokenSecret);
		result.append(", oauthServiceName: ");
		result.append(oauthServiceName);
		result.append(", oauthTokenName: ");
		result.append(oauthTokenName);
		result.append(", signOwner: ");
		if (signOwnerESet) result.append(signOwner); else result.append("<unset>");
		result.append(", signViewer: ");
		if (signViewerESet) result.append(signViewer); else result.append("<unset>");
		result.append(", views: ");
		result.append(views);
		result.append(')');
		return result.toString();
	}

} //PreloadImpl
