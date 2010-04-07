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

import java.math.BigInteger;

import org.eclipse.e4.opensocial.model.Content;
import org.eclipse.e4.opensocial.model.OpenSocialPackage;
import org.eclipse.e4.opensocial.model.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ContentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ContentImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ContentImpl#getPreferredHeight <em>Preferred Height</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ContentImpl#getPreferredWidth <em>Preferred Width</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ContentImpl#isScrolling <em>Scrolling</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ContentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ContentImpl#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends EObjectImpl implements Content {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getPreferredHeight() <em>Preferred Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PREFERRED_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredHeight() <em>Preferred Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger preferredHeight = PREFERRED_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredWidth() <em>Preferred Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PREFERRED_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredWidth() <em>Preferred Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger preferredWidth = PREFERRED_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isScrolling() <em>Scrolling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrolling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCROLLING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScrolling() <em>Scrolling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrolling()
	 * @generated
	 * @ordered
	 */
	protected boolean scrolling = SCROLLING_EDEFAULT;

	/**
	 * This is true if the Scrolling attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scrollingESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.HTML;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected String view = VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenSocialPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.CONTENT__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.CONTENT__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPreferredHeight() {
		return preferredHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredHeight(BigInteger newPreferredHeight) {
		BigInteger oldPreferredHeight = preferredHeight;
		preferredHeight = newPreferredHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.CONTENT__PREFERRED_HEIGHT, oldPreferredHeight, preferredHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPreferredWidth() {
		return preferredWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredWidth(BigInteger newPreferredWidth) {
		BigInteger oldPreferredWidth = preferredWidth;
		preferredWidth = newPreferredWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.CONTENT__PREFERRED_WIDTH, oldPreferredWidth, preferredWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScrolling() {
		return scrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrolling(boolean newScrolling) {
		boolean oldScrolling = scrolling;
		scrolling = newScrolling;
		boolean oldScrollingESet = scrollingESet;
		scrollingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.CONTENT__SCROLLING, oldScrolling, scrolling, !oldScrollingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScrolling() {
		boolean oldScrolling = scrolling;
		boolean oldScrollingESet = scrollingESet;
		scrolling = SCROLLING_EDEFAULT;
		scrollingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.CONTENT__SCROLLING, oldScrolling, SCROLLING_EDEFAULT, oldScrollingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScrolling() {
		return scrollingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.CONTENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		Type oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.CONTENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(String newView) {
		String oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.CONTENT__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenSocialPackage.CONTENT__VALUE:
				return getValue();
			case OpenSocialPackage.CONTENT__HREF:
				return getHref();
			case OpenSocialPackage.CONTENT__PREFERRED_HEIGHT:
				return getPreferredHeight();
			case OpenSocialPackage.CONTENT__PREFERRED_WIDTH:
				return getPreferredWidth();
			case OpenSocialPackage.CONTENT__SCROLLING:
				return isScrolling();
			case OpenSocialPackage.CONTENT__TYPE:
				return getType();
			case OpenSocialPackage.CONTENT__VIEW:
				return getView();
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
			case OpenSocialPackage.CONTENT__VALUE:
				setValue((String)newValue);
				return;
			case OpenSocialPackage.CONTENT__HREF:
				setHref((String)newValue);
				return;
			case OpenSocialPackage.CONTENT__PREFERRED_HEIGHT:
				setPreferredHeight((BigInteger)newValue);
				return;
			case OpenSocialPackage.CONTENT__PREFERRED_WIDTH:
				setPreferredWidth((BigInteger)newValue);
				return;
			case OpenSocialPackage.CONTENT__SCROLLING:
				setScrolling((Boolean)newValue);
				return;
			case OpenSocialPackage.CONTENT__TYPE:
				setType((Type)newValue);
				return;
			case OpenSocialPackage.CONTENT__VIEW:
				setView((String)newValue);
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
			case OpenSocialPackage.CONTENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case OpenSocialPackage.CONTENT__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case OpenSocialPackage.CONTENT__PREFERRED_HEIGHT:
				setPreferredHeight(PREFERRED_HEIGHT_EDEFAULT);
				return;
			case OpenSocialPackage.CONTENT__PREFERRED_WIDTH:
				setPreferredWidth(PREFERRED_WIDTH_EDEFAULT);
				return;
			case OpenSocialPackage.CONTENT__SCROLLING:
				unsetScrolling();
				return;
			case OpenSocialPackage.CONTENT__TYPE:
				unsetType();
				return;
			case OpenSocialPackage.CONTENT__VIEW:
				setView(VIEW_EDEFAULT);
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
			case OpenSocialPackage.CONTENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case OpenSocialPackage.CONTENT__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case OpenSocialPackage.CONTENT__PREFERRED_HEIGHT:
				return PREFERRED_HEIGHT_EDEFAULT == null ? preferredHeight != null : !PREFERRED_HEIGHT_EDEFAULT.equals(preferredHeight);
			case OpenSocialPackage.CONTENT__PREFERRED_WIDTH:
				return PREFERRED_WIDTH_EDEFAULT == null ? preferredWidth != null : !PREFERRED_WIDTH_EDEFAULT.equals(preferredWidth);
			case OpenSocialPackage.CONTENT__SCROLLING:
				return isSetScrolling();
			case OpenSocialPackage.CONTENT__TYPE:
				return isSetType();
			case OpenSocialPackage.CONTENT__VIEW:
				return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", href: ");
		result.append(href);
		result.append(", preferredHeight: ");
		result.append(preferredHeight);
		result.append(", preferredWidth: ");
		result.append(preferredWidth);
		result.append(", scrolling: ");
		if (scrollingESet) result.append(scrolling); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", view: ");
		result.append(view);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
