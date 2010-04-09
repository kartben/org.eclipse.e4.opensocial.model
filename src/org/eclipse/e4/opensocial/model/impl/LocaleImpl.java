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

import java.util.Collection;

import org.eclipse.e4.opensocial.model.LanguageDirection;
import org.eclipse.e4.opensocial.model.Locale;
import org.eclipse.e4.opensocial.model.Msg;
import org.eclipse.e4.opensocial.model.OpenSocialPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.LocaleImpl#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.LocaleImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.LocaleImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.LocaleImpl#getLanguageDirection <em>Language Direction</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.LocaleImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocaleImpl extends EObjectImpl implements Locale {
	/**
	 * The cached value of the '{@link #getMsg() <em>Msg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected EList<Msg> msg;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageDirection() <em>Language Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageDirection()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageDirection LANGUAGE_DIRECTION_EDEFAULT = LanguageDirection.LTR;

	/**
	 * The cached value of the '{@link #getLanguageDirection() <em>Language Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageDirection()
	 * @generated
	 * @ordered
	 */
	protected LanguageDirection languageDirection = LANGUAGE_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Language Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean languageDirectionESet;

	/**
	 * The default value of the '{@link #getMessages() <em>Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected String messages = MESSAGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenSocialPackage.Literals.LOCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Msg> getMsg() {
		if (msg == null) {
			msg = new EObjectContainmentEList<Msg>(Msg.class, this, OpenSocialPackage.LOCALE__MSG);
		}
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.LOCALE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.LOCALE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageDirection getLanguageDirection() {
		return languageDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageDirection(LanguageDirection newLanguageDirection) {
		LanguageDirection oldLanguageDirection = languageDirection;
		languageDirection = newLanguageDirection == null ? LANGUAGE_DIRECTION_EDEFAULT : newLanguageDirection;
		boolean oldLanguageDirectionESet = languageDirectionESet;
		languageDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.LOCALE__LANGUAGE_DIRECTION, oldLanguageDirection, languageDirection, !oldLanguageDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLanguageDirection() {
		LanguageDirection oldLanguageDirection = languageDirection;
		boolean oldLanguageDirectionESet = languageDirectionESet;
		languageDirection = LANGUAGE_DIRECTION_EDEFAULT;
		languageDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OpenSocialPackage.LOCALE__LANGUAGE_DIRECTION, oldLanguageDirection, LANGUAGE_DIRECTION_EDEFAULT, oldLanguageDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLanguageDirection() {
		return languageDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessages() {
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessages(String newMessages) {
		String oldMessages = messages;
		messages = newMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.LOCALE__MESSAGES, oldMessages, messages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenSocialPackage.LOCALE__MSG:
				return ((InternalEList<?>)getMsg()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenSocialPackage.LOCALE__MSG:
				return getMsg();
			case OpenSocialPackage.LOCALE__COUNTRY:
				return getCountry();
			case OpenSocialPackage.LOCALE__LANG:
				return getLang();
			case OpenSocialPackage.LOCALE__LANGUAGE_DIRECTION:
				return getLanguageDirection();
			case OpenSocialPackage.LOCALE__MESSAGES:
				return getMessages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenSocialPackage.LOCALE__MSG:
				getMsg().clear();
				getMsg().addAll((Collection<? extends Msg>)newValue);
				return;
			case OpenSocialPackage.LOCALE__COUNTRY:
				setCountry((String)newValue);
				return;
			case OpenSocialPackage.LOCALE__LANG:
				setLang((String)newValue);
				return;
			case OpenSocialPackage.LOCALE__LANGUAGE_DIRECTION:
				setLanguageDirection((LanguageDirection)newValue);
				return;
			case OpenSocialPackage.LOCALE__MESSAGES:
				setMessages((String)newValue);
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
			case OpenSocialPackage.LOCALE__MSG:
				getMsg().clear();
				return;
			case OpenSocialPackage.LOCALE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case OpenSocialPackage.LOCALE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case OpenSocialPackage.LOCALE__LANGUAGE_DIRECTION:
				unsetLanguageDirection();
				return;
			case OpenSocialPackage.LOCALE__MESSAGES:
				setMessages(MESSAGES_EDEFAULT);
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
			case OpenSocialPackage.LOCALE__MSG:
				return msg != null && !msg.isEmpty();
			case OpenSocialPackage.LOCALE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case OpenSocialPackage.LOCALE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case OpenSocialPackage.LOCALE__LANGUAGE_DIRECTION:
				return isSetLanguageDirection();
			case OpenSocialPackage.LOCALE__MESSAGES:
				return MESSAGES_EDEFAULT == null ? messages != null : !MESSAGES_EDEFAULT.equals(messages);
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
		result.append(" (country: ");
		result.append(country);
		result.append(", lang: ");
		result.append(lang);
		result.append(", languageDirection: ");
		if (languageDirectionESet) result.append(languageDirection); else result.append("<unset>");
		result.append(", messages: ");
		result.append(messages);
		result.append(')');
		return result.toString();
	}

} //LocaleImpl
