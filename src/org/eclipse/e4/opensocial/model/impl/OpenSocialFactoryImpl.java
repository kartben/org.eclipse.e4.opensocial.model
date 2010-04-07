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

import org.eclipse.e4.opensocial.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenSocialFactoryImpl extends EFactoryImpl implements OpenSocialFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenSocialFactory init() {
		try {
			OpenSocialFactory theOpenSocialFactory = (OpenSocialFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/e4/os/1.0"); 
			if (theOpenSocialFactory != null) {
				return theOpenSocialFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenSocialFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSocialFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenSocialPackage.AUTHORIZATION: return createAuthorization();
			case OpenSocialPackage.CONTENT: return createContent();
			case OpenSocialPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OpenSocialPackage.ENUM_VALUE: return createEnumValue();
			case OpenSocialPackage.GADGET_FEATURE: return createGadgetFeature();
			case OpenSocialPackage.ICON: return createIcon();
			case OpenSocialPackage.LINK: return createLink();
			case OpenSocialPackage.LOCALE: return createLocale();
			case OpenSocialPackage.MODULE_PREFS: return createModulePrefs();
			case OpenSocialPackage.MODULE: return createModule();
			case OpenSocialPackage.MSG: return createMsg();
			case OpenSocialPackage.OAUTH_RESOURCE: return createOAuthResource();
			case OpenSocialPackage.OAUTH: return createOAuth();
			case OpenSocialPackage.PARAM: return createParam();
			case OpenSocialPackage.PRELOAD: return createPreload();
			case OpenSocialPackage.SERVICE: return createService();
			case OpenSocialPackage.USER_PREF: return createUserPref();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpenSocialPackage.AUTHZ:
				return createAuthzFromString(eDataType, initialValue);
			case OpenSocialPackage.DATATYPE:
				return createDatatypeFromString(eDataType, initialValue);
			case OpenSocialPackage.LANGUAGE_DIRECTION:
				return createLanguageDirectionFromString(eDataType, initialValue);
			case OpenSocialPackage.METHOD:
				return createMethodFromString(eDataType, initialValue);
			case OpenSocialPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			case OpenSocialPackage.PARAM_LOCATION:
				return createParamLocationFromString(eDataType, initialValue);
			case OpenSocialPackage.REL:
				return createRelFromString(eDataType, initialValue);
			case OpenSocialPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case OpenSocialPackage.AUTHZ_OBJECT:
				return createAuthzObjectFromString(eDataType, initialValue);
			case OpenSocialPackage.DATATYPE_OBJECT:
				return createDatatypeObjectFromString(eDataType, initialValue);
			case OpenSocialPackage.LANGUAGE_DIRECTION_OBJECT:
				return createLanguageDirectionObjectFromString(eDataType, initialValue);
			case OpenSocialPackage.METHOD_OBJECT:
				return createMethodObjectFromString(eDataType, initialValue);
			case OpenSocialPackage.MODE_OBJECT:
				return createModeObjectFromString(eDataType, initialValue);
			case OpenSocialPackage.PARAM_LOCATION_OBJECT:
				return createParamLocationObjectFromString(eDataType, initialValue);
			case OpenSocialPackage.REL_OBJECT:
				return createRelObjectFromString(eDataType, initialValue);
			case OpenSocialPackage.TYPE_OBJECT:
				return createTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpenSocialPackage.AUTHZ:
				return convertAuthzToString(eDataType, instanceValue);
			case OpenSocialPackage.DATATYPE:
				return convertDatatypeToString(eDataType, instanceValue);
			case OpenSocialPackage.LANGUAGE_DIRECTION:
				return convertLanguageDirectionToString(eDataType, instanceValue);
			case OpenSocialPackage.METHOD:
				return convertMethodToString(eDataType, instanceValue);
			case OpenSocialPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			case OpenSocialPackage.PARAM_LOCATION:
				return convertParamLocationToString(eDataType, instanceValue);
			case OpenSocialPackage.REL:
				return convertRelToString(eDataType, instanceValue);
			case OpenSocialPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case OpenSocialPackage.AUTHZ_OBJECT:
				return convertAuthzObjectToString(eDataType, instanceValue);
			case OpenSocialPackage.DATATYPE_OBJECT:
				return convertDatatypeObjectToString(eDataType, instanceValue);
			case OpenSocialPackage.LANGUAGE_DIRECTION_OBJECT:
				return convertLanguageDirectionObjectToString(eDataType, instanceValue);
			case OpenSocialPackage.METHOD_OBJECT:
				return convertMethodObjectToString(eDataType, instanceValue);
			case OpenSocialPackage.MODE_OBJECT:
				return convertModeObjectToString(eDataType, instanceValue);
			case OpenSocialPackage.PARAM_LOCATION_OBJECT:
				return convertParamLocationObjectToString(eDataType, instanceValue);
			case OpenSocialPackage.REL_OBJECT:
				return convertRelObjectToString(eDataType, instanceValue);
			case OpenSocialPackage.TYPE_OBJECT:
				return convertTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorization createAuthorization() {
		AuthorizationImpl authorization = new AuthorizationImpl();
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GadgetFeature createGadgetFeature() {
		GadgetFeatureImpl gadgetFeature = new GadgetFeatureImpl();
		return gadgetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale createLocale() {
		LocaleImpl locale = new LocaleImpl();
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePrefs createModulePrefs() {
		ModulePrefsImpl modulePrefs = new ModulePrefsImpl();
		return modulePrefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Msg createMsg() {
		MsgImpl msg = new MsgImpl();
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthResource createOAuthResource() {
		OAuthResourceImpl oAuthResource = new OAuthResourceImpl();
		return oAuthResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth createOAuth() {
		OAuthImpl oAuth = new OAuthImpl();
		return oAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preload createPreload() {
		PreloadImpl preload = new PreloadImpl();
		return preload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPref createUserPref() {
		UserPrefImpl userPref = new UserPrefImpl();
		return userPref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authz createAuthzFromString(EDataType eDataType, String initialValue) {
		Authz result = Authz.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthzToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatypeFromString(EDataType eDataType, String initialValue) {
		Datatype result = Datatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageDirection createLanguageDirectionFromString(EDataType eDataType, String initialValue) {
		LanguageDirection result = LanguageDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethodFromString(EDataType eDataType, String initialValue) {
		Method result = Method.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamLocation createParamLocationFromString(EDataType eDataType, String initialValue) {
		ParamLocation result = ParamLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParamLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rel createRelFromString(EDataType eDataType, String initialValue) {
		Rel result = Rel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authz createAuthzObjectFromString(EDataType eDataType, String initialValue) {
		return createAuthzFromString(OpenSocialPackage.Literals.AUTHZ, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthzObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuthzToString(OpenSocialPackage.Literals.AUTHZ, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDatatypeFromString(OpenSocialPackage.Literals.DATATYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDatatypeToString(OpenSocialPackage.Literals.DATATYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageDirection createLanguageDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createLanguageDirectionFromString(OpenSocialPackage.Literals.LANGUAGE_DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLanguageDirectionToString(OpenSocialPackage.Literals.LANGUAGE_DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethodObjectFromString(EDataType eDataType, String initialValue) {
		return createMethodFromString(OpenSocialPackage.Literals.METHOD, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMethodToString(OpenSocialPackage.Literals.METHOD, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeFromString(OpenSocialPackage.Literals.MODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeToString(OpenSocialPackage.Literals.MODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamLocation createParamLocationObjectFromString(EDataType eDataType, String initialValue) {
		return createParamLocationFromString(OpenSocialPackage.Literals.PARAM_LOCATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParamLocationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParamLocationToString(OpenSocialPackage.Literals.PARAM_LOCATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rel createRelObjectFromString(EDataType eDataType, String initialValue) {
		return createRelFromString(OpenSocialPackage.Literals.REL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelToString(OpenSocialPackage.Literals.REL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeFromString(OpenSocialPackage.Literals.TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeToString(OpenSocialPackage.Literals.TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSocialPackage getOpenSocialPackage() {
		return (OpenSocialPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenSocialPackage getPackage() {
		return OpenSocialPackage.eINSTANCE;
	}

} //OpenSocialFactoryImpl
