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

import org.eclipse.e4.opensocial.model.Method;
import org.eclipse.e4.opensocial.model.OAuthResource;
import org.eclipse.e4.opensocial.model.OpenSocialPackage;
import org.eclipse.e4.opensocial.model.ParamLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.OAuthResourceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.OAuthResourceImpl#getParamLocation <em>Param Location</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.OAuthResourceImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OAuthResourceImpl extends EObjectImpl implements OAuthResource {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method METHOD_EDEFAULT = Method.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method = METHOD_EDEFAULT;

	/**
	 * This is true if the Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodESet;

	/**
	 * The default value of the '{@link #getParamLocation() <em>Param Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ParamLocation PARAM_LOCATION_EDEFAULT = ParamLocation.AUTH_HEADER;

	/**
	 * The cached value of the '{@link #getParamLocation() <em>Param Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamLocation()
	 * @generated
	 * @ordered
	 */
	protected ParamLocation paramLocation = PARAM_LOCATION_EDEFAULT;

	/**
	 * This is true if the Param Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean paramLocationESet;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuthResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenSocialPackage.Literals.OAUTH_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		boolean oldMethodESet = methodESet;
		methodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.OAUTH_RESOURCE__METHOD, oldMethod, method, !oldMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethod() {
		Method oldMethod = method;
		boolean oldMethodESet = methodESet;
		method = METHOD_EDEFAULT;
		methodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.OAUTH_RESOURCE__METHOD, oldMethod, METHOD_EDEFAULT, oldMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethod() {
		return methodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamLocation getParamLocation() {
		return paramLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamLocation(ParamLocation newParamLocation) {
		ParamLocation oldParamLocation = paramLocation;
		paramLocation = newParamLocation == null ? PARAM_LOCATION_EDEFAULT : newParamLocation;
		boolean oldParamLocationESet = paramLocationESet;
		paramLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.OAUTH_RESOURCE__PARAM_LOCATION, oldParamLocation, paramLocation, !oldParamLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParamLocation() {
		ParamLocation oldParamLocation = paramLocation;
		boolean oldParamLocationESet = paramLocationESet;
		paramLocation = PARAM_LOCATION_EDEFAULT;
		paramLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.OAUTH_RESOURCE__PARAM_LOCATION, oldParamLocation, PARAM_LOCATION_EDEFAULT, oldParamLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParamLocation() {
		return paramLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.OAUTH_RESOURCE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenSocialPackage.OAUTH_RESOURCE__METHOD:
				return getMethod();
			case OpenSocialPackage.OAUTH_RESOURCE__PARAM_LOCATION:
				return getParamLocation();
			case OpenSocialPackage.OAUTH_RESOURCE__URL:
				return getUrl();
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
			case OpenSocialPackage.OAUTH_RESOURCE__METHOD:
				setMethod((Method)newValue);
				return;
			case OpenSocialPackage.OAUTH_RESOURCE__PARAM_LOCATION:
				setParamLocation((ParamLocation)newValue);
				return;
			case OpenSocialPackage.OAUTH_RESOURCE__URL:
				setUrl((String)newValue);
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
			case OpenSocialPackage.OAUTH_RESOURCE__METHOD:
				unsetMethod();
				return;
			case OpenSocialPackage.OAUTH_RESOURCE__PARAM_LOCATION:
				unsetParamLocation();
				return;
			case OpenSocialPackage.OAUTH_RESOURCE__URL:
				setUrl(URL_EDEFAULT);
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
			case OpenSocialPackage.OAUTH_RESOURCE__METHOD:
				return isSetMethod();
			case OpenSocialPackage.OAUTH_RESOURCE__PARAM_LOCATION:
				return isSetParamLocation();
			case OpenSocialPackage.OAUTH_RESOURCE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (method: ");
		if (methodESet) result.append(method); else result.append("<unset>");
		result.append(", paramLocation: ");
		if (paramLocationESet) result.append(paramLocation); else result.append("<unset>");
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //OAuthResourceImpl
