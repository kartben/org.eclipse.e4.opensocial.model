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
 * A representation of the model object '<em><b>Locale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.Locale#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Locale#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Locale#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Locale#getLanguageDirection <em>Language Direction</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Locale#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLocale()
 * @model extendedMetaData="name='Locale_._type' kind='elementOnly'"
 * @generated
 */
public interface Locale extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.Msg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLocale_Msg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='msg' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Msg> getMsg();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLocale_Country()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Locale#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLocale_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Locale#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Language Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.e4.opensocial.model.LanguageDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Direction</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.LanguageDirection
	 * @see #isSetLanguageDirection()
	 * @see #unsetLanguageDirection()
	 * @see #setLanguageDirection(LanguageDirection)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLocale_LanguageDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='language_direction' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageDirection getLanguageDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Locale#getLanguageDirection <em>Language Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Direction</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.LanguageDirection
	 * @see #isSetLanguageDirection()
	 * @see #unsetLanguageDirection()
	 * @see #getLanguageDirection()
	 * @generated
	 */
	void setLanguageDirection(LanguageDirection value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.Locale#getLanguageDirection <em>Language Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLanguageDirection()
	 * @see #getLanguageDirection()
	 * @see #setLanguageDirection(LanguageDirection)
	 * @generated
	 */
	void unsetLanguageDirection();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.Locale#getLanguageDirection <em>Language Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Language Direction</em>' attribute is set.
	 * @see #unsetLanguageDirection()
	 * @see #getLanguageDirection()
	 * @see #setLanguageDirection(LanguageDirection)
	 * @generated
	 */
	boolean isSetLanguageDirection();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' attribute.
	 * @see #setMessages(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLocale_Messages()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='messages' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessages();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Locale#getMessages <em>Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages</em>' attribute.
	 * @see #getMessages()
	 * @generated
	 */
	void setMessages(String value);

} // Locale
