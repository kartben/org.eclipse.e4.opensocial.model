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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Param Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getParamLocation()
 * @model extendedMetaData="name='param_location_._type'"
 * @generated
 */
public enum ParamLocation implements Enumerator {
	/**
	 * The '<em><b>Auth Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_HEADER(0, "authHeader", "auth-header"),

	/**
	 * The '<em><b>Uri Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	URI_QUERY(1, "uriQuery", "uri-query"),

	/**
	 * The '<em><b>Post Body</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_BODY_VALUE
	 * @generated
	 * @ordered
	 */
	POST_BODY(2, "postBody", "post-body");

	/**
	 * The '<em><b>Auth Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auth Header</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTH_HEADER
	 * @model name="authHeader" literal="auth-header"
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_HEADER_VALUE = 0;

	/**
	 * The '<em><b>Uri Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uri Query</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URI_QUERY
	 * @model name="uriQuery" literal="uri-query"
	 * @generated
	 * @ordered
	 */
	public static final int URI_QUERY_VALUE = 1;

	/**
	 * The '<em><b>Post Body</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Body</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_BODY
	 * @model name="postBody" literal="post-body"
	 * @generated
	 * @ordered
	 */
	public static final int POST_BODY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Param Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParamLocation[] VALUES_ARRAY =
		new ParamLocation[] {
			AUTH_HEADER,
			URI_QUERY,
			POST_BODY,
		};

	/**
	 * A public read-only list of all the '<em><b>Param Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParamLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Param Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParamLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParamLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Param Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParamLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParamLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Param Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParamLocation get(int value) {
		switch (value) {
			case AUTH_HEADER_VALUE: return AUTH_HEADER;
			case URI_QUERY_VALUE: return URI_QUERY;
			case POST_BODY_VALUE: return POST_BODY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParamLocation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ParamLocation
