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
 * A representation of the literals of the enumeration '<em><b>Rel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getRel()
 * @model extendedMetaData="name='rel_._type'"
 * @generated
 */
public enum Rel implements Enumerator {
	/**
	 * The '<em><b>Gadgets Help</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GADGETS_HELP_VALUE
	 * @generated
	 * @ordered
	 */
	GADGETS_HELP(0, "gadgetsHelp", "gadgets.help"),

	/**
	 * The '<em><b>Gadgets Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GADGETS_SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	GADGETS_SUPPORT(1, "gadgetsSupport", "gadgets.support"),

	/**
	 * The '<em><b>Icon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_VALUE
	 * @generated
	 * @ordered
	 */
	ICON(2, "icon", "icon");

	/**
	 * The '<em><b>Gadgets Help</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gadgets Help</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GADGETS_HELP
	 * @model name="gadgetsHelp" literal="gadgets.help"
	 * @generated
	 * @ordered
	 */
	public static final int GADGETS_HELP_VALUE = 0;

	/**
	 * The '<em><b>Gadgets Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gadgets Support</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GADGETS_SUPPORT
	 * @model name="gadgetsSupport" literal="gadgets.support"
	 * @generated
	 * @ordered
	 */
	public static final int GADGETS_SUPPORT_VALUE = 1;

	/**
	 * The '<em><b>Icon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Icon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON
	 * @model name="icon"
	 * @generated
	 * @ordered
	 */
	public static final int ICON_VALUE = 2;

	/**
	 * An array of all the '<em><b>Rel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Rel[] VALUES_ARRAY =
		new Rel[] {
			GADGETS_HELP,
			GADGETS_SUPPORT,
			ICON,
		};

	/**
	 * A public read-only list of all the '<em><b>Rel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Rel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Rel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Rel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rel get(int value) {
		switch (value) {
			case GADGETS_HELP_VALUE: return GADGETS_HELP;
			case GADGETS_SUPPORT_VALUE: return GADGETS_SUPPORT;
			case ICON_VALUE: return ICON;
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
	private Rel(int value, String name, String literal) {
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
	
} //Rel
