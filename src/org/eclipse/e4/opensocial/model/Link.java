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
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.Link#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.Link#getRel <em>Rel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLink()
 * @model extendedMetaData="name='Link_._type' kind='empty'"
 * @generated
 */
public interface Link extends EObject {
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
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLink_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Link#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.e4.opensocial.model.Rel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Rel
	 * @see #isSetRel()
	 * @see #unsetRel()
	 * @see #setRel(Rel)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getLink_Rel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='rel' namespace='##targetNamespace'"
	 * @generated
	 */
	Rel getRel();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see org.eclipse.e4.opensocial.model.Rel
	 * @see #isSetRel()
	 * @see #unsetRel()
	 * @see #getRel()
	 * @generated
	 */
	void setRel(Rel value);

	/**
	 * Unsets the value of the '{@link org.eclipse.e4.opensocial.model.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRel()
	 * @see #getRel()
	 * @see #setRel(Rel)
	 * @generated
	 */
	void unsetRel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.e4.opensocial.model.Link#getRel <em>Rel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rel</em>' attribute is set.
	 * @see #unsetRel()
	 * @see #getRel()
	 * @see #setRel(Rel)
	 * @generated
	 */
	boolean isSetRel();

} // Link
