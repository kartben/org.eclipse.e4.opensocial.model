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

import org.eclipse.e4.opensocial.model.Content;
import org.eclipse.e4.opensocial.model.Module;
import org.eclipse.e4.opensocial.model.ModulePrefs;
import org.eclipse.e4.opensocial.model.OpenSocialPackage;
import org.eclipse.e4.opensocial.model.UserPref;

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
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModuleImpl#getModulePrefs <em>Module Prefs</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModuleImpl#getUserPref <em>User Pref</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModuleImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
	/**
	 * The cached value of the '{@link #getModulePrefs() <em>Module Prefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulePrefs()
	 * @generated
	 * @ordered
	 */
	protected ModulePrefs modulePrefs;
	/**
	 * The cached value of the '{@link #getUserPref() <em>User Pref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPref()
	 * @generated
	 * @ordered
	 */
	protected EList<UserPref> userPref;
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenSocialPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePrefs getModulePrefs() {
		return modulePrefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModulePrefs(ModulePrefs newModulePrefs, NotificationChain msgs) {
		ModulePrefs oldModulePrefs = modulePrefs;
		modulePrefs = newModulePrefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE__MODULE_PREFS, oldModulePrefs, newModulePrefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulePrefs(ModulePrefs newModulePrefs) {
		if (newModulePrefs != modulePrefs) {
			NotificationChain msgs = null;
			if (modulePrefs != null)
				msgs = ((InternalEObject)modulePrefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenSocialPackage.MODULE__MODULE_PREFS, null, msgs);
			if (newModulePrefs != null)
				msgs = ((InternalEObject)newModulePrefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenSocialPackage.MODULE__MODULE_PREFS, null, msgs);
			msgs = basicSetModulePrefs(newModulePrefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE__MODULE_PREFS, newModulePrefs, newModulePrefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserPref> getUserPref() {
		if (userPref == null) {
			userPref = new EObjectContainmentEList<UserPref>(UserPref.class, this, OpenSocialPackage.MODULE__USER_PREF);
		}
		return userPref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Content> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Content>(Content.class, this, OpenSocialPackage.MODULE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenSocialPackage.MODULE__MODULE_PREFS:
				return basicSetModulePrefs(null, msgs);
			case OpenSocialPackage.MODULE__USER_PREF:
				return ((InternalEList<?>)getUserPref()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case OpenSocialPackage.MODULE__MODULE_PREFS:
				return getModulePrefs();
			case OpenSocialPackage.MODULE__USER_PREF:
				return getUserPref();
			case OpenSocialPackage.MODULE__CONTENT:
				return getContent();
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
			case OpenSocialPackage.MODULE__MODULE_PREFS:
				setModulePrefs((ModulePrefs)newValue);
				return;
			case OpenSocialPackage.MODULE__USER_PREF:
				getUserPref().clear();
				getUserPref().addAll((Collection<? extends UserPref>)newValue);
				return;
			case OpenSocialPackage.MODULE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Content>)newValue);
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
			case OpenSocialPackage.MODULE__MODULE_PREFS:
				setModulePrefs((ModulePrefs)null);
				return;
			case OpenSocialPackage.MODULE__USER_PREF:
				getUserPref().clear();
				return;
			case OpenSocialPackage.MODULE__CONTENT:
				getContent().clear();
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
			case OpenSocialPackage.MODULE__MODULE_PREFS:
				return modulePrefs != null;
			case OpenSocialPackage.MODULE__USER_PREF:
				return userPref != null && !userPref.isEmpty();
			case OpenSocialPackage.MODULE__CONTENT:
				return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
