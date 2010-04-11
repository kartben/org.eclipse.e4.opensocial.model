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

import org.eclipse.e4.opensocial.model.Authorization;
import org.eclipse.e4.opensocial.model.Authz;
import org.eclipse.e4.opensocial.model.Content;
import org.eclipse.e4.opensocial.model.Datatype;
import org.eclipse.e4.opensocial.model.DocumentRoot;
import org.eclipse.e4.opensocial.model.EnumValue;
import org.eclipse.e4.opensocial.model.GadgetFeature;
import org.eclipse.e4.opensocial.model.Icon;
import org.eclipse.e4.opensocial.model.LanguageDirection;
import org.eclipse.e4.opensocial.model.Link;
import org.eclipse.e4.opensocial.model.Locale;
import org.eclipse.e4.opensocial.model.Method;
import org.eclipse.e4.opensocial.model.Mode;
import org.eclipse.e4.opensocial.model.Module;
import org.eclipse.e4.opensocial.model.ModulePrefs;
import org.eclipse.e4.opensocial.model.Msg;
import org.eclipse.e4.opensocial.model.OAuth;
import org.eclipse.e4.opensocial.model.OAuthResource;
import org.eclipse.e4.opensocial.model.OpenSocialFactory;
import org.eclipse.e4.opensocial.model.OpenSocialPackage;
import org.eclipse.e4.opensocial.model.Param;
import org.eclipse.e4.opensocial.model.ParamLocation;
import org.eclipse.e4.opensocial.model.Preload;
import org.eclipse.e4.opensocial.model.Rel;
import org.eclipse.e4.opensocial.model.Service;
import org.eclipse.e4.opensocial.model.Type;
import org.eclipse.e4.opensocial.model.UserPref;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenSocialPackageImpl extends EPackageImpl implements OpenSocialPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gadgetFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulePrefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPrefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authzEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paramLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType authzObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paramLocationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenSocialPackageImpl() {
		super(eNS_URI, OpenSocialFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OpenSocialPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenSocialPackage init() {
		if (isInited) return (OpenSocialPackage)EPackage.Registry.INSTANCE.getEPackage(OpenSocialPackage.eNS_URI);

		// Obtain or create and register package
		OpenSocialPackageImpl theOpenSocialPackage = (OpenSocialPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpenSocialPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpenSocialPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenSocialPackage.createPackageContents();

		// Initialize created meta-data
		theOpenSocialPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenSocialPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenSocialPackage.eNS_URI, theOpenSocialPackage);
		return theOpenSocialPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorization() {
		return authorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorization_Url() {
		return (EAttribute)authorizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Value() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Href() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_PreferredHeight() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_PreferredWidth() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Scrolling() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Type() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_View() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Module() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumValue_DisplayValue() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumValue_Value() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGadgetFeature() {
		return gadgetFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGadgetFeature_Param() {
		return (EReference)gadgetFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGadgetFeature_Feature() {
		return (EAttribute)gadgetFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGadgetFeature_Version() {
		return (EAttribute)gadgetFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIcon_Value() {
		return (EAttribute)iconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIcon_Mode() {
		return (EAttribute)iconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIcon_Type() {
		return (EAttribute)iconEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Href() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocale() {
		return localeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocale_Msg() {
		return (EReference)localeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocale_Country() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocale_Lang() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocale_LanguageDirection() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocale_Messages() {
		return (EAttribute)localeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulePrefs() {
		return modulePrefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Group() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePrefs_Require() {
		return (EReference)modulePrefsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePrefs_Optional() {
		return (EReference)modulePrefsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePrefs_Preload() {
		return (EReference)modulePrefsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePrefs_Icon() {
		return (EReference)modulePrefsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePrefs_Locale() {
		return (EReference)modulePrefsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePrefs_Link() {
		return (EReference)modulePrefsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePrefs_OAuth() {
		return (EReference)modulePrefsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Author() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_AuthorEmail() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Category() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Category2() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Description() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_DirectoryTitle() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Screenshot() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Thumbnail() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Title() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Width() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_Height() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulePrefs_TitleUrl() {
		return (EAttribute)modulePrefsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModulePrefs() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_UserPref() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Content() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMsg() {
		return msgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMsg_Value() {
		return (EAttribute)msgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMsg_Desc() {
		return (EAttribute)msgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMsg_Name() {
		return (EAttribute)msgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuthResource() {
		return oAuthResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthResource_Method() {
		return (EAttribute)oAuthResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthResource_ParamLocation() {
		return (EAttribute)oAuthResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthResource_Url() {
		return (EAttribute)oAuthResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuth() {
		return oAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOAuth_Service() {
		return (EReference)oAuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth_Name() {
		return (EAttribute)oAuthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParam() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Value() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Name() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreload() {
		return preloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_Authz() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_Href() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_OauthRequestToken() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_OauthRequestTokenSecret() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_OauthServiceName() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_OauthTokenName() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_SignOwner() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_SignViewer() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreload_Views() {
		return (EAttribute)preloadEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Request() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Access() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Authorization() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserPref() {
		return userPrefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserPref_EnumValue() {
		return (EReference)userPrefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserPref_Datatype() {
		return (EAttribute)userPrefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserPref_DefaultValue() {
		return (EAttribute)userPrefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserPref_DisplayName() {
		return (EAttribute)userPrefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserPref_Name() {
		return (EAttribute)userPrefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserPref_Required() {
		return (EAttribute)userPrefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthz() {
		return authzEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatype() {
		return datatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguageDirection() {
		return languageDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethod() {
		return methodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParamLocation() {
		return paramLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRel() {
		return relEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuthzObject() {
		return authzObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatatypeObject() {
		return datatypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLanguageDirectionObject() {
		return languageDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodObject() {
		return methodObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModeObject() {
		return modeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParamLocationObject() {
		return paramLocationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelObject() {
		return relObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeObject() {
		return typeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenSocialFactory getOpenSocialFactory() {
		return (OpenSocialFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authorizationEClass = createEClass(AUTHORIZATION);
		createEAttribute(authorizationEClass, AUTHORIZATION__URL);

		contentEClass = createEClass(CONTENT);
		createEAttribute(contentEClass, CONTENT__VALUE);
		createEAttribute(contentEClass, CONTENT__HREF);
		createEAttribute(contentEClass, CONTENT__PREFERRED_HEIGHT);
		createEAttribute(contentEClass, CONTENT__PREFERRED_WIDTH);
		createEAttribute(contentEClass, CONTENT__SCROLLING);
		createEAttribute(contentEClass, CONTENT__TYPE);
		createEAttribute(contentEClass, CONTENT__VIEW);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODULE);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEAttribute(enumValueEClass, ENUM_VALUE__DISPLAY_VALUE);
		createEAttribute(enumValueEClass, ENUM_VALUE__VALUE);

		gadgetFeatureEClass = createEClass(GADGET_FEATURE);
		createEReference(gadgetFeatureEClass, GADGET_FEATURE__PARAM);
		createEAttribute(gadgetFeatureEClass, GADGET_FEATURE__FEATURE);
		createEAttribute(gadgetFeatureEClass, GADGET_FEATURE__VERSION);

		iconEClass = createEClass(ICON);
		createEAttribute(iconEClass, ICON__VALUE);
		createEAttribute(iconEClass, ICON__MODE);
		createEAttribute(iconEClass, ICON__TYPE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__REL);

		localeEClass = createEClass(LOCALE);
		createEReference(localeEClass, LOCALE__MSG);
		createEAttribute(localeEClass, LOCALE__COUNTRY);
		createEAttribute(localeEClass, LOCALE__LANG);
		createEAttribute(localeEClass, LOCALE__LANGUAGE_DIRECTION);
		createEAttribute(localeEClass, LOCALE__MESSAGES);

		modulePrefsEClass = createEClass(MODULE_PREFS);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__GROUP);
		createEReference(modulePrefsEClass, MODULE_PREFS__REQUIRE);
		createEReference(modulePrefsEClass, MODULE_PREFS__OPTIONAL);
		createEReference(modulePrefsEClass, MODULE_PREFS__PRELOAD);
		createEReference(modulePrefsEClass, MODULE_PREFS__ICON);
		createEReference(modulePrefsEClass, MODULE_PREFS__LOCALE);
		createEReference(modulePrefsEClass, MODULE_PREFS__LINK);
		createEReference(modulePrefsEClass, MODULE_PREFS__OAUTH);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__AUTHOR);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__AUTHOR_EMAIL);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__CATEGORY);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__CATEGORY2);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__DESCRIPTION);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__DIRECTORY_TITLE);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__SCREENSHOT);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__THUMBNAIL);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__TITLE);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__WIDTH);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__HEIGHT);
		createEAttribute(modulePrefsEClass, MODULE_PREFS__TITLE_URL);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULE_PREFS);
		createEReference(moduleEClass, MODULE__USER_PREF);
		createEReference(moduleEClass, MODULE__CONTENT);

		msgEClass = createEClass(MSG);
		createEAttribute(msgEClass, MSG__VALUE);
		createEAttribute(msgEClass, MSG__DESC);
		createEAttribute(msgEClass, MSG__NAME);

		oAuthResourceEClass = createEClass(OAUTH_RESOURCE);
		createEAttribute(oAuthResourceEClass, OAUTH_RESOURCE__METHOD);
		createEAttribute(oAuthResourceEClass, OAUTH_RESOURCE__PARAM_LOCATION);
		createEAttribute(oAuthResourceEClass, OAUTH_RESOURCE__URL);

		oAuthEClass = createEClass(OAUTH);
		createEReference(oAuthEClass, OAUTH__SERVICE);
		createEAttribute(oAuthEClass, OAUTH__NAME);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__VALUE);
		createEAttribute(paramEClass, PARAM__NAME);

		preloadEClass = createEClass(PRELOAD);
		createEAttribute(preloadEClass, PRELOAD__AUTHZ);
		createEAttribute(preloadEClass, PRELOAD__HREF);
		createEAttribute(preloadEClass, PRELOAD__OAUTH_REQUEST_TOKEN);
		createEAttribute(preloadEClass, PRELOAD__OAUTH_REQUEST_TOKEN_SECRET);
		createEAttribute(preloadEClass, PRELOAD__OAUTH_SERVICE_NAME);
		createEAttribute(preloadEClass, PRELOAD__OAUTH_TOKEN_NAME);
		createEAttribute(preloadEClass, PRELOAD__SIGN_OWNER);
		createEAttribute(preloadEClass, PRELOAD__SIGN_VIEWER);
		createEAttribute(preloadEClass, PRELOAD__VIEWS);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__REQUEST);
		createEReference(serviceEClass, SERVICE__ACCESS);
		createEReference(serviceEClass, SERVICE__AUTHORIZATION);

		userPrefEClass = createEClass(USER_PREF);
		createEReference(userPrefEClass, USER_PREF__ENUM_VALUE);
		createEAttribute(userPrefEClass, USER_PREF__DATATYPE);
		createEAttribute(userPrefEClass, USER_PREF__DEFAULT_VALUE);
		createEAttribute(userPrefEClass, USER_PREF__DISPLAY_NAME);
		createEAttribute(userPrefEClass, USER_PREF__NAME);
		createEAttribute(userPrefEClass, USER_PREF__REQUIRED);

		// Create enums
		authzEEnum = createEEnum(AUTHZ);
		datatypeEEnum = createEEnum(DATATYPE);
		languageDirectionEEnum = createEEnum(LANGUAGE_DIRECTION);
		methodEEnum = createEEnum(METHOD);
		modeEEnum = createEEnum(MODE);
		paramLocationEEnum = createEEnum(PARAM_LOCATION);
		relEEnum = createEEnum(REL);
		typeEEnum = createEEnum(TYPE);

		// Create data types
		authzObjectEDataType = createEDataType(AUTHZ_OBJECT);
		datatypeObjectEDataType = createEDataType(DATATYPE_OBJECT);
		languageDirectionObjectEDataType = createEDataType(LANGUAGE_DIRECTION_OBJECT);
		methodObjectEDataType = createEDataType(METHOD_OBJECT);
		modeObjectEDataType = createEDataType(MODE_OBJECT);
		paramLocationObjectEDataType = createEDataType(PARAM_LOCATION_OBJECT);
		relObjectEDataType = createEDataType(REL_OBJECT);
		typeObjectEDataType = createEDataType(TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(authorizationEClass, Authorization.class, "Authorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorization_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, Authorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContent_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_PreferredHeight(), theXMLTypePackage.getInteger(), "preferredHeight", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_PreferredWidth(), theXMLTypePackage.getInteger(), "preferredWidth", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Scrolling(), theXMLTypePackage.getBoolean(), "scrolling", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Type(), this.getType(), "type", "html", 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_View(), theXMLTypePackage.getString(), "view", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Module(), this.getModule(), null, "module", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumValue_DisplayValue(), theXMLTypePackage.getString(), "displayValue", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumValue_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gadgetFeatureEClass, GadgetFeature.class, "GadgetFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGadgetFeature_Param(), this.getParam(), null, "param", null, 0, -1, GadgetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGadgetFeature_Feature(), theXMLTypePackage.getString(), "feature", null, 1, 1, GadgetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGadgetFeature_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, GadgetFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIcon_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIcon_Mode(), this.getMode(), "mode", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIcon_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Href(), theXMLTypePackage.getString(), "href", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rel(), this.getRel(), "rel", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localeEClass, Locale.class, "Locale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocale_Msg(), this.getMsg(), null, "msg", null, 0, -1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocale_Country(), theXMLTypePackage.getString(), "country", null, 0, 1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocale_Lang(), theXMLTypePackage.getString(), "lang", null, 0, 1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocale_LanguageDirection(), this.getLanguageDirection(), "languageDirection", null, 0, 1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocale_Messages(), theXMLTypePackage.getString(), "messages", null, 0, 1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modulePrefsEClass, ModulePrefs.class, "ModulePrefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModulePrefs_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulePrefs_Require(), this.getGadgetFeature(), null, "require", null, 0, -1, ModulePrefs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModulePrefs_Optional(), this.getGadgetFeature(), null, "optional", null, 0, -1, ModulePrefs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModulePrefs_Preload(), this.getPreload(), null, "preload", null, 0, -1, ModulePrefs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModulePrefs_Icon(), this.getIcon(), null, "icon", null, 0, -1, ModulePrefs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModulePrefs_Locale(), this.getLocale(), null, "locale", null, 0, -1, ModulePrefs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModulePrefs_Link(), this.getLink(), null, "link", null, 0, -1, ModulePrefs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModulePrefs_OAuth(), this.getOAuth(), null, "oAuth", null, 0, -1, ModulePrefs.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_AuthorEmail(), theXMLTypePackage.getString(), "authorEmail", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Category(), theXMLTypePackage.getString(), "category", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Category2(), theXMLTypePackage.getString(), "category2", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_DirectoryTitle(), theXMLTypePackage.getString(), "directoryTitle", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Screenshot(), theXMLTypePackage.getString(), "screenshot", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Thumbnail(), theXMLTypePackage.getString(), "thumbnail", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Width(), ecorePackage.getEInt(), "width", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_Height(), ecorePackage.getEInt(), "height", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulePrefs_TitleUrl(), theXMLTypePackage.getString(), "titleUrl", null, 0, 1, ModulePrefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ModulePrefs(), this.getModulePrefs(), null, "modulePrefs", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_UserPref(), this.getUserPref(), null, "userPref", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Content(), this.getContent(), null, "content", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msgEClass, Msg.class, "Msg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMsg_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Msg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMsg_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, Msg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMsg_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Msg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuthResourceEClass, OAuthResource.class, "OAuthResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuthResource_Method(), this.getMethod(), "method", "GET", 0, 1, OAuthResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthResource_ParamLocation(), this.getParamLocation(), "paramLocation", "auth-header", 0, 1, OAuthResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthResource_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, OAuthResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuthEClass, OAuth.class, "OAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOAuth_Service(), this.getService(), null, "service", null, 1, -1, OAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, OAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParam_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParam_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preloadEClass, Preload.class, "Preload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreload_Authz(), this.getAuthz(), "authz", "none", 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_Href(), theXMLTypePackage.getString(), "href", null, 1, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_OauthRequestToken(), theXMLTypePackage.getString(), "oauthRequestToken", null, 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_OauthRequestTokenSecret(), theXMLTypePackage.getString(), "oauthRequestTokenSecret", null, 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_OauthServiceName(), theXMLTypePackage.getString(), "oauthServiceName", null, 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_OauthTokenName(), theXMLTypePackage.getString(), "oauthTokenName", null, 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_SignOwner(), theXMLTypePackage.getBoolean(), "signOwner", "true", 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_SignViewer(), theXMLTypePackage.getBoolean(), "signViewer", "true", 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreload_Views(), theXMLTypePackage.getString(), "views", null, 0, 1, Preload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Request(), this.getOAuthResource(), null, "request", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Access(), this.getOAuthResource(), null, "access", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Authorization(), this.getAuthorization(), null, "authorization", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userPrefEClass, UserPref.class, "UserPref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserPref_EnumValue(), this.getEnumValue(), null, "enumValue", null, 0, -1, UserPref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPref_Datatype(), this.getDatatype(), "datatype", "string", 0, 1, UserPref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPref_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, UserPref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPref_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 0, 1, UserPref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPref_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, UserPref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserPref_Required(), theXMLTypePackage.getString(), "required", null, 0, 1, UserPref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authzEEnum, Authz.class, "Authz");
		addEEnumLiteral(authzEEnum, Authz.NONE);
		addEEnumLiteral(authzEEnum, Authz.SIGNED);
		addEEnumLiteral(authzEEnum, Authz.OAUTH);

		initEEnum(datatypeEEnum, Datatype.class, "Datatype");
		addEEnumLiteral(datatypeEEnum, Datatype.STRING);
		addEEnumLiteral(datatypeEEnum, Datatype.HIDDEN);
		addEEnumLiteral(datatypeEEnum, Datatype.BOOL);
		addEEnumLiteral(datatypeEEnum, Datatype.ENUM);
		addEEnumLiteral(datatypeEEnum, Datatype.NUMBER);

		initEEnum(languageDirectionEEnum, LanguageDirection.class, "LanguageDirection");
		addEEnumLiteral(languageDirectionEEnum, LanguageDirection.LTR);
		addEEnumLiteral(languageDirectionEEnum, LanguageDirection.RTL);

		initEEnum(methodEEnum, Method.class, "Method");
		addEEnumLiteral(methodEEnum, Method.GET);
		addEEnumLiteral(methodEEnum, Method.POST);

		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.BASE64);

		initEEnum(paramLocationEEnum, ParamLocation.class, "ParamLocation");
		addEEnumLiteral(paramLocationEEnum, ParamLocation.AUTH_HEADER);
		addEEnumLiteral(paramLocationEEnum, ParamLocation.URI_QUERY);
		addEEnumLiteral(paramLocationEEnum, ParamLocation.POST_BODY);

		initEEnum(relEEnum, Rel.class, "Rel");
		addEEnumLiteral(relEEnum, Rel.GADGETS_HELP);
		addEEnumLiteral(relEEnum, Rel.GADGETS_SUPPORT);
		addEEnumLiteral(relEEnum, Rel.ICON);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.HTML);
		addEEnumLiteral(typeEEnum, Type.URL);

		// Initialize data types
		initEDataType(authzObjectEDataType, Authz.class, "AuthzObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datatypeObjectEDataType, Datatype.class, "DatatypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(languageDirectionObjectEDataType, LanguageDirection.class, "LanguageDirectionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(methodObjectEDataType, Method.class, "MethodObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modeObjectEDataType, Mode.class, "ModeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(paramLocationObjectEDataType, ParamLocation.class, "ParamLocationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relObjectEDataType, Rel.class, "RelObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeObjectEDataType, Type.class, "TypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (authorizationEClass, 
		   source, 
		   new String[] {
			 "name", "Authorization_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAuthorization_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (authzEEnum, 
		   source, 
		   new String[] {
			 "name", "authz_._type"
		   });		
		addAnnotation
		  (authzObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "authz_._type:Object",
			 "baseType", "authz_._type"
		   });		
		addAnnotation
		  (contentEClass, 
		   source, 
		   new String[] {
			 "name", "Content_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getContent_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getContent_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContent_PreferredHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preferred_height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContent_PreferredWidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preferred_width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContent_Scrolling(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scrolling",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContent_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getContent_View(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "view",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (datatypeEEnum, 
		   source, 
		   new String[] {
			 "name", "datatype_._type"
		   });		
		addAnnotation
		  (datatypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "datatype_._type:Object",
			 "baseType", "datatype_._type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Module(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Module",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (enumValueEClass, 
		   source, 
		   new String[] {
			 "name", "EnumValue_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEnumValue_DisplayValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display_value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumValue_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (gadgetFeatureEClass, 
		   source, 
		   new String[] {
			 "name", "GadgetFeature",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGadgetFeature_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGadgetFeature_Feature(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "feature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGadgetFeature_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iconEClass, 
		   source, 
		   new String[] {
			 "name", "Icon_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIcon_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIcon_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIcon_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (languageDirectionEEnum, 
		   source, 
		   new String[] {
			 "name", "language_direction_._type"
		   });		
		addAnnotation
		  (languageDirectionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "language_direction_._type:Object",
			 "baseType", "language_direction_._type"
		   });		
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "name", "Link_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLink_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLink_Rel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (localeEClass, 
		   source, 
		   new String[] {
			 "name", "Locale_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLocale_Msg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "msg",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocale_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocale_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocale_LanguageDirection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language_direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocale_Messages(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "messages",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (methodEEnum, 
		   source, 
		   new String[] {
			 "name", "method_._type"
		   });		
		addAnnotation
		  (methodObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "method_._type:Object",
			 "baseType", "method_._type"
		   });		
		addAnnotation
		  (modeEEnum, 
		   source, 
		   new String[] {
			 "name", "mode_._type"
		   });		
		addAnnotation
		  (modeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mode_._type:Object",
			 "baseType", "mode_._type"
		   });		
		addAnnotation
		  (modulePrefsEClass, 
		   source, 
		   new String[] {
			 "name", "ModulePrefs_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModulePrefs_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_Require(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Require",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_Optional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Optional",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_Preload(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Preload",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Icon",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_Locale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Locale",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Link",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_OAuth(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OAuth",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModulePrefs_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_AuthorEmail(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "author_email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Category(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "category",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Category2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "category2",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_DirectoryTitle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "directory_title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Screenshot(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "screenshot",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Thumbnail(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thumbnail",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModulePrefs_TitleUrl(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title_url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "name", "Module_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModule_ModulePrefs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModulePrefs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModule_UserPref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserPref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModule_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Content",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (msgEClass, 
		   source, 
		   new String[] {
			 "name", "msg_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMsg_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMsg_Desc(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMsg_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (oAuthResourceEClass, 
		   source, 
		   new String[] {
			 "name", "OAuthResource",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOAuthResource_Method(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOAuthResource_ParamLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "param_location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOAuthResource_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (oAuthEClass, 
		   source, 
		   new String[] {
			 "name", "OAuth_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOAuth_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOAuth_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (paramLocationEEnum, 
		   source, 
		   new String[] {
			 "name", "param_location_._type"
		   });		
		addAnnotation
		  (paramLocationObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "param_location_._type:Object",
			 "baseType", "param_location_._type"
		   });		
		addAnnotation
		  (paramEClass, 
		   source, 
		   new String[] {
			 "name", "Param_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getParam_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getParam_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (preloadEClass, 
		   source, 
		   new String[] {
			 "name", "Preload_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPreload_Authz(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "authz",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_OauthRequestToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oauth_request_token",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_OauthRequestTokenSecret(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oauth_request_token_secret",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_OauthServiceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oauth_service_name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_OauthTokenName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oauth_token_name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_SignOwner(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sign_owner",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_SignViewer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sign_viewer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPreload_Views(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "views",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (relEEnum, 
		   source, 
		   new String[] {
			 "name", "rel_._type"
		   });		
		addAnnotation
		  (relObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "rel_._type:Object",
			 "baseType", "rel_._type"
		   });		
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "name", "Service_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getService_Request(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Request",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_Access(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Access",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_Authorization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Authorization",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeEEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });		
		addAnnotation
		  (typeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });		
		addAnnotation
		  (userPrefEClass, 
		   source, 
		   new String[] {
			 "name", "UserPref_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserPref_EnumValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EnumValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserPref_Datatype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "datatype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserPref_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserPref_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display_name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserPref_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserPref_Required(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "required",
			 "namespace", "##targetNamespace"
		   });
	}

} //OpenSocialPackageImpl
