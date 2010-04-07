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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.Content#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Content#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Content#getPreferredHeight <em>Preferred Height</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Content#getPreferredWidth <em>Preferred Width</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Content#isScrolling <em>Scrolling</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Content#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Content#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent()
 * @model extendedMetaData="name='Content_._type' kind='simple'"
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Content#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Content#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Height</em>' attribute.
	 * @see #setPreferredHeight(BigInteger)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent_PreferredHeight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='preferred_height' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPreferredHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Content#getPreferredHeight <em>Preferred Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Height</em>' attribute.
	 * @see #getPreferredHeight()
	 * @generated
	 */
	void setPreferredHeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Preferred Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Width</em>' attribute.
	 * @see #setPreferredWidth(BigInteger)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent_PreferredWidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='preferred_width' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPreferredWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Content#getPreferredWidth <em>Preferred Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Width</em>' attribute.
	 * @see #getPreferredWidth()
	 * @generated
	 */
	void setPreferredWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Scrolling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scrolling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrolling</em>' attribute.
	 * @see #isSetScrolling()
	 * @see #unsetScrolling()
	 * @see #setScrolling(boolean)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent_Scrolling()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='scrolling' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isScrolling();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Content#isScrolling <em>Scrolling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrolling</em>' attribute.
	 * @see #isSetScrolling()
	 * @see #unsetScrolling()
	 * @see #isScrolling()
	 * @generated
	 */
	void setScrolling(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.Content#isScrolling <em>Scrolling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrolling()
	 * @see #isScrolling()
	 * @see #setScrolling(boolean)
	 * @generated
	 */
	void unsetScrolling();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.Content#isScrolling <em>Scrolling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scrolling</em>' attribute is set.
	 * @see #unsetScrolling()
	 * @see #isScrolling()
	 * @see #setScrolling(boolean)
	 * @generated
	 */
	boolean isSetScrolling();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"html"</code>.
	 * The literals are from the enumeration {@link org.eclipse.e4.opensocial.model.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Type
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(Type)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent_Type()
	 * @model default="html" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Content#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Type
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.Content#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.Content#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getContent_View()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='view' namespace='##targetNamespace'"
	 * @generated
	 */
	String getView();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Content#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #getView()
	 * @generated
	 */
	void setView(String value);

} // Content
