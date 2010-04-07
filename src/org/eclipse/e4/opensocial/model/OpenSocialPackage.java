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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.opensocial.model.OpenSocialFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface OpenSocialPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/e4/os/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenSocialPackage eINSTANCE = org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.AuthorizationImpl <em>Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.AuthorizationImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getAuthorization()
	 * @generated
	 */
	int AUTHORIZATION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION__URL = 0;

	/**
	 * The number of structural features of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.ContentImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__HREF = 1;

	/**
	 * The feature id for the '<em><b>Preferred Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__PREFERRED_HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Preferred Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__PREFERRED_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Scrolling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__SCROLLING = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TYPE = 5;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VIEW = 6;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.DocumentRootImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODULE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.EnumValueImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DISPLAY_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.GadgetFeatureImpl <em>Gadget Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.GadgetFeatureImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getGadgetFeature()
	 * @generated
	 */
	int GADGET_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADGET_FEATURE__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADGET_FEATURE__FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Gadget Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADGET_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.IconImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__MODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.LinkImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 6;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.LocaleImpl <em>Locale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.LocaleImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 7;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__MSG = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__LANG = 2;

	/**
	 * The feature id for the '<em><b>Language Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__LANGUAGE_DIRECTION = 3;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE__MESSAGES = 4;

	/**
	 * The number of structural features of the '<em>Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl <em>Module Prefs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getModulePrefs()
	 * @generated
	 */
	int MODULE_PREFS = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Require</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__REQUIRE = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__OPTIONAL = 2;

	/**
	 * The feature id for the '<em><b>Preload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__PRELOAD = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__ICON = 4;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__LOCALE = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__LINK = 6;

	/**
	 * The feature id for the '<em><b>OAuth</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__OAUTH = 7;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__AUTHOR = 8;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__AUTHOR_EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__CATEGORY = 10;

	/**
	 * The feature id for the '<em><b>Category2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__CATEGORY2 = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Directory Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__DIRECTORY_TITLE = 13;

	/**
	 * The feature id for the '<em><b>Screenshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__SCREENSHOT = 14;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__THUMBNAIL = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__TITLE = 16;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__WIDTH = 17;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__HEIGHT = 18;

	/**
	 * The feature id for the '<em><b>Title Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS__TITLE_URL = 19;

	/**
	 * The number of structural features of the '<em>Module Prefs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PREFS_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.ModuleImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 9;

	/**
	 * The feature id for the '<em><b>Module Prefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_PREFS = 0;

	/**
	 * The feature id for the '<em><b>User Pref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__USER_PREF = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.MsgImpl <em>Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.MsgImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMsg()
	 * @generated
	 */
	int MSG = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG__DESC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG__NAME = 2;

	/**
	 * The number of structural features of the '<em>Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.OAuthResourceImpl <em>OAuth Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.OAuthResourceImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getOAuthResource()
	 * @generated
	 */
	int OAUTH_RESOURCE = 11;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_RESOURCE__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Param Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_RESOURCE__PARAM_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_RESOURCE__URL = 2;

	/**
	 * The number of structural features of the '<em>OAuth Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.OAuthImpl <em>OAuth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.OAuthImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getOAuth()
	 * @generated
	 */
	int OAUTH = 12;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH__NAME = 1;

	/**
	 * The number of structural features of the '<em>OAuth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.ParamImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl <em>Preload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.PreloadImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getPreload()
	 * @generated
	 */
	int PRELOAD = 14;

	/**
	 * The feature id for the '<em><b>Authz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__AUTHZ = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__HREF = 1;

	/**
	 * The feature id for the '<em><b>Oauth Request Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__OAUTH_REQUEST_TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Oauth Request Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__OAUTH_REQUEST_TOKEN_SECRET = 3;

	/**
	 * The feature id for the '<em><b>Oauth Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__OAUTH_SERVICE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Oauth Token Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__OAUTH_TOKEN_NAME = 5;

	/**
	 * The feature id for the '<em><b>Sign Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__SIGN_OWNER = 6;

	/**
	 * The feature id for the '<em><b>Sign Viewer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__SIGN_VIEWER = 7;

	/**
	 * The feature id for the '<em><b>Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD__VIEWS = 8;

	/**
	 * The number of structural features of the '<em>Preload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELOAD_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.ServiceImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 15;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__AUTHORIZATION = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.impl.UserPrefImpl <em>User Pref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.impl.UserPrefImpl
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getUserPref()
	 * @generated
	 */
	int USER_PREF = 16;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF__ENUM_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF__DISPLAY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF__NAME = 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF__REQUIRED = 5;

	/**
	 * The number of structural features of the '<em>User Pref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.Authz <em>Authz</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Authz
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getAuthz()
	 * @generated
	 */
	int AUTHZ = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.Datatype <em>Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Datatype
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.LanguageDirection <em>Language Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.LanguageDirection
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLanguageDirection()
	 * @generated
	 */
	int LANGUAGE_DIRECTION = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.Method <em>Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Method
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Mode
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.ParamLocation <em>Param Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.ParamLocation
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getParamLocation()
	 * @generated
	 */
	int PARAM_LOCATION = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.Rel <em>Rel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Rel
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getRel()
	 * @generated
	 */
	int REL = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.opensocial.model.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Type
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 24;

	/**
	 * The meta object id for the '<em>Authz Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Authz
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getAuthzObject()
	 * @generated
	 */
	int AUTHZ_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Datatype
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getDatatypeObject()
	 * @generated
	 */
	int DATATYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Language Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.LanguageDirection
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLanguageDirectionObject()
	 * @generated
	 */
	int LANGUAGE_DIRECTION_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Method Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Method
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMethodObject()
	 * @generated
	 */
	int METHOD_OBJECT = 28;

	/**
	 * The meta object id for the '<em>Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Mode
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getModeObject()
	 * @generated
	 */
	int MODE_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Param Location Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.ParamLocation
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getParamLocationObject()
	 * @generated
	 */
	int PARAM_LOCATION_OBJECT = 30;

	/**
	 * The meta object id for the '<em>Rel Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Rel
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getRelObject()
	 * @generated
	 */
	int REL_OBJECT = 31;

	/**
	 * The meta object id for the '<em>Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.opensocial.model.Type
	 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getTypeObject()
	 * @generated
	 */
	int TYPE_OBJECT = 32;


	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization</em>'.
	 * @see org.eclipse.e4.opensocial.model.Authorization
	 * @generated
	 */
	EClass getAuthorization();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Authorization#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.e4.opensocial.model.Authorization#getUrl()
	 * @see #getAuthorization()
	 * @generated
	 */
	EAttribute getAuthorization_Url();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Content#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content#getValue()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Content#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content#getHref()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Content#getPreferredHeight <em>Preferred Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Height</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content#getPreferredHeight()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_PreferredHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Content#getPreferredWidth <em>Preferred Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Width</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content#getPreferredWidth()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_PreferredWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Content#isScrolling <em>Scrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrolling</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content#isScrolling()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Scrolling();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Content#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content#getType()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Content#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.eclipse.e4.opensocial.model.Content#getView()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_View();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.e4.opensocial.model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.e4.opensocial.model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.e4.opensocial.model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.e4.opensocial.model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.e4.opensocial.model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.e4.opensocial.model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.e4.opensocial.model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.opensocial.model.DocumentRoot#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.eclipse.e4.opensocial.model.DocumentRoot#getModule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Module();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.EnumValue#getDisplayValue <em>Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.EnumValue#getDisplayValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_DisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.GadgetFeature <em>Gadget Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gadget Feature</em>'.
	 * @see org.eclipse.e4.opensocial.model.GadgetFeature
	 * @generated
	 */
	EClass getGadgetFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.GadgetFeature#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.eclipse.e4.opensocial.model.GadgetFeature#getParam()
	 * @see #getGadgetFeature()
	 * @generated
	 */
	EReference getGadgetFeature_Param();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.GadgetFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see org.eclipse.e4.opensocial.model.GadgetFeature#getFeature()
	 * @see #getGadgetFeature()
	 * @generated
	 */
	EAttribute getGadgetFeature_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see org.eclipse.e4.opensocial.model.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Icon#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.Icon#getValue()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Icon#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.eclipse.e4.opensocial.model.Icon#getMode()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Icon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.e4.opensocial.model.Icon#getType()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.e4.opensocial.model.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.e4.opensocial.model.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.eclipse.e4.opensocial.model.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locale</em>'.
	 * @see org.eclipse.e4.opensocial.model.Locale
	 * @generated
	 */
	EClass getLocale();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.Locale#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg</em>'.
	 * @see org.eclipse.e4.opensocial.model.Locale#getMsg()
	 * @see #getLocale()
	 * @generated
	 */
	EReference getLocale_Msg();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Locale#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.e4.opensocial.model.Locale#getCountry()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Locale#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.e4.opensocial.model.Locale#getLang()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Locale#getLanguageDirection <em>Language Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Direction</em>'.
	 * @see org.eclipse.e4.opensocial.model.Locale#getLanguageDirection()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_LanguageDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Locale#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Messages</em>'.
	 * @see org.eclipse.e4.opensocial.model.Locale#getMessages()
	 * @see #getLocale()
	 * @generated
	 */
	EAttribute getLocale_Messages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.ModulePrefs <em>Module Prefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Prefs</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs
	 * @generated
	 */
	EClass getModulePrefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getGroup()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Require</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getRequire()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EReference getModulePrefs_Require();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getOptional()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EReference getModulePrefs_Optional();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getPreload <em>Preload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preload</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getPreload()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EReference getModulePrefs_Preload();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getIcon()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EReference getModulePrefs_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locale</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getLocale()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EReference getModulePrefs_Locale();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getLink()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EReference getModulePrefs_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getOAuth <em>OAuth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OAuth</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getOAuth()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EReference getModulePrefs_OAuth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getAuthor()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getAuthorEmail <em>Author Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Email</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getAuthorEmail()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_AuthorEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getCategory()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getCategory2 <em>Category2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category2</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getCategory2()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Category2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getDescription()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getDirectoryTitle <em>Directory Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Title</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getDirectoryTitle()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_DirectoryTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getScreenshot <em>Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screenshot</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getScreenshot()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Screenshot();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getThumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbnail</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getThumbnail()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Thumbnail();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getTitle()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getWidth()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getHeight()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getTitleUrl <em>Title Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Url</em>'.
	 * @see org.eclipse.e4.opensocial.model.ModulePrefs#getTitleUrl()
	 * @see #getModulePrefs()
	 * @generated
	 */
	EAttribute getModulePrefs_TitleUrl();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.eclipse.e4.opensocial.model.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.opensocial.model.Module#getModulePrefs <em>Module Prefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Prefs</em>'.
	 * @see org.eclipse.e4.opensocial.model.Module#getModulePrefs()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModulePrefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.Module#getUserPref <em>User Pref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Pref</em>'.
	 * @see org.eclipse.e4.opensocial.model.Module#getUserPref()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_UserPref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.Module#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.eclipse.e4.opensocial.model.Module#getContent()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Msg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg</em>'.
	 * @see org.eclipse.e4.opensocial.model.Msg
	 * @generated
	 */
	EClass getMsg();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Msg#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.Msg#getValue()
	 * @see #getMsg()
	 * @generated
	 */
	EAttribute getMsg_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Msg#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.eclipse.e4.opensocial.model.Msg#getDesc()
	 * @see #getMsg()
	 * @generated
	 */
	EAttribute getMsg_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Msg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.e4.opensocial.model.Msg#getName()
	 * @see #getMsg()
	 * @generated
	 */
	EAttribute getMsg_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.OAuthResource <em>OAuth Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Resource</em>'.
	 * @see org.eclipse.e4.opensocial.model.OAuthResource
	 * @generated
	 */
	EClass getOAuthResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.OAuthResource#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.eclipse.e4.opensocial.model.OAuthResource#getMethod()
	 * @see #getOAuthResource()
	 * @generated
	 */
	EAttribute getOAuthResource_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.OAuthResource#getParamLocation <em>Param Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Location</em>'.
	 * @see org.eclipse.e4.opensocial.model.OAuthResource#getParamLocation()
	 * @see #getOAuthResource()
	 * @generated
	 */
	EAttribute getOAuthResource_ParamLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.OAuthResource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.e4.opensocial.model.OAuthResource#getUrl()
	 * @see #getOAuthResource()
	 * @generated
	 */
	EAttribute getOAuthResource_Url();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.OAuth <em>OAuth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth</em>'.
	 * @see org.eclipse.e4.opensocial.model.OAuth
	 * @generated
	 */
	EClass getOAuth();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.OAuth#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.eclipse.e4.opensocial.model.OAuth#getService()
	 * @see #getOAuth()
	 * @generated
	 */
	EReference getOAuth_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.OAuth#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.e4.opensocial.model.OAuth#getName()
	 * @see #getOAuth()
	 * @generated
	 */
	EAttribute getOAuth_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see org.eclipse.e4.opensocial.model.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.e4.opensocial.model.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Preload <em>Preload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preload</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload
	 * @generated
	 */
	EClass getPreload();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#getAuthz <em>Authz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authz</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#getAuthz()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_Authz();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#getHref()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#getOauthRequestToken <em>Oauth Request Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oauth Request Token</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#getOauthRequestToken()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_OauthRequestToken();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#getOauthRequestTokenSecret <em>Oauth Request Token Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oauth Request Token Secret</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#getOauthRequestTokenSecret()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_OauthRequestTokenSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#getOauthServiceName <em>Oauth Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oauth Service Name</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#getOauthServiceName()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_OauthServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#getOauthTokenName <em>Oauth Token Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oauth Token Name</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#getOauthTokenName()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_OauthTokenName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#isSignOwner <em>Sign Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Owner</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#isSignOwner()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_SignOwner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#isSignViewer <em>Sign Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Viewer</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#isSignViewer()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_SignViewer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.Preload#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Views</em>'.
	 * @see org.eclipse.e4.opensocial.model.Preload#getViews()
	 * @see #getPreload()
	 * @generated
	 */
	EAttribute getPreload_Views();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipse.e4.opensocial.model.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.opensocial.model.Service#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see org.eclipse.e4.opensocial.model.Service#getRequest()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Request();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.opensocial.model.Service#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.e4.opensocial.model.Service#getAccess()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.opensocial.model.Service#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorization</em>'.
	 * @see org.eclipse.e4.opensocial.model.Service#getAuthorization()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Authorization();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.opensocial.model.UserPref <em>User Pref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Pref</em>'.
	 * @see org.eclipse.e4.opensocial.model.UserPref
	 * @generated
	 */
	EClass getUserPref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.opensocial.model.UserPref#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.UserPref#getEnumValue()
	 * @see #getUserPref()
	 * @generated
	 */
	EReference getUserPref_EnumValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.UserPref#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see org.eclipse.e4.opensocial.model.UserPref#getDatatype()
	 * @see #getUserPref()
	 * @generated
	 */
	EAttribute getUserPref_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.UserPref#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.e4.opensocial.model.UserPref#getDefaultValue()
	 * @see #getUserPref()
	 * @generated
	 */
	EAttribute getUserPref_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.UserPref#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.eclipse.e4.opensocial.model.UserPref#getDisplayName()
	 * @see #getUserPref()
	 * @generated
	 */
	EAttribute getUserPref_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.UserPref#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.e4.opensocial.model.UserPref#getName()
	 * @see #getUserPref()
	 * @generated
	 */
	EAttribute getUserPref_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.opensocial.model.UserPref#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.e4.opensocial.model.UserPref#getRequired()
	 * @see #getUserPref()
	 * @generated
	 */
	EAttribute getUserPref_Required();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.Authz <em>Authz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authz</em>'.
	 * @see org.eclipse.e4.opensocial.model.Authz
	 * @generated
	 */
	EEnum getAuthz();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype</em>'.
	 * @see org.eclipse.e4.opensocial.model.Datatype
	 * @generated
	 */
	EEnum getDatatype();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.LanguageDirection <em>Language Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Direction</em>'.
	 * @see org.eclipse.e4.opensocial.model.LanguageDirection
	 * @generated
	 */
	EEnum getLanguageDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method</em>'.
	 * @see org.eclipse.e4.opensocial.model.Method
	 * @generated
	 */
	EEnum getMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see org.eclipse.e4.opensocial.model.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.ParamLocation <em>Param Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Param Location</em>'.
	 * @see org.eclipse.e4.opensocial.model.ParamLocation
	 * @generated
	 */
	EEnum getParamLocation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.Rel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rel</em>'.
	 * @see org.eclipse.e4.opensocial.model.Rel
	 * @generated
	 */
	EEnum getRel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.e4.opensocial.model.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.eclipse.e4.opensocial.model.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.Authz <em>Authz Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Authz Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.Authz
	 * @model instanceClass="org.eclipse.e4.opensocial.model.Authz"
	 *        extendedMetaData="name='authz_._type:Object' baseType='authz_._type'"
	 * @generated
	 */
	EDataType getAuthzObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.Datatype <em>Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datatype Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.Datatype
	 * @model instanceClass="org.eclipse.e4.opensocial.model.Datatype"
	 *        extendedMetaData="name='datatype_._type:Object' baseType='datatype_._type'"
	 * @generated
	 */
	EDataType getDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.LanguageDirection <em>Language Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Direction Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.LanguageDirection
	 * @model instanceClass="org.eclipse.e4.opensocial.model.LanguageDirection"
	 *        extendedMetaData="name='language_direction_._type:Object' baseType='language_direction_._type'"
	 * @generated
	 */
	EDataType getLanguageDirectionObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.Method <em>Method Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.Method
	 * @model instanceClass="org.eclipse.e4.opensocial.model.Method"
	 *        extendedMetaData="name='method_._type:Object' baseType='method_._type'"
	 * @generated
	 */
	EDataType getMethodObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.Mode <em>Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mode Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.Mode
	 * @model instanceClass="org.eclipse.e4.opensocial.model.Mode"
	 *        extendedMetaData="name='mode_._type:Object' baseType='mode_._type'"
	 * @generated
	 */
	EDataType getModeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.ParamLocation <em>Param Location Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Param Location Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.ParamLocation
	 * @model instanceClass="org.eclipse.e4.opensocial.model.ParamLocation"
	 *        extendedMetaData="name='param_location_._type:Object' baseType='param_location_._type'"
	 * @generated
	 */
	EDataType getParamLocationObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.Rel <em>Rel Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rel Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.Rel
	 * @model instanceClass="org.eclipse.e4.opensocial.model.Rel"
	 *        extendedMetaData="name='rel_._type:Object' baseType='rel_._type'"
	 * @generated
	 */
	EDataType getRelObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.e4.opensocial.model.Type <em>Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Object</em>'.
	 * @see org.eclipse.e4.opensocial.model.Type
	 * @model instanceClass="org.eclipse.e4.opensocial.model.Type"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenSocialFactory getOpenSocialFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.AuthorizationImpl <em>Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.AuthorizationImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getAuthorization()
		 * @generated
		 */
		EClass AUTHORIZATION = eINSTANCE.getAuthorization();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION__URL = eINSTANCE.getAuthorization_Url();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.ContentImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__VALUE = eINSTANCE.getContent_Value();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__HREF = eINSTANCE.getContent_Href();

		/**
		 * The meta object literal for the '<em><b>Preferred Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__PREFERRED_HEIGHT = eINSTANCE.getContent_PreferredHeight();

		/**
		 * The meta object literal for the '<em><b>Preferred Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__PREFERRED_WIDTH = eINSTANCE.getContent_PreferredWidth();

		/**
		 * The meta object literal for the '<em><b>Scrolling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__SCROLLING = eINSTANCE.getContent_Scrolling();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__TYPE = eINSTANCE.getContent_Type();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__VIEW = eINSTANCE.getContent_View();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.DocumentRootImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODULE = eINSTANCE.getDocumentRoot_Module();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.EnumValueImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__DISPLAY_VALUE = eINSTANCE.getEnumValue_DisplayValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.GadgetFeatureImpl <em>Gadget Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.GadgetFeatureImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getGadgetFeature()
		 * @generated
		 */
		EClass GADGET_FEATURE = eINSTANCE.getGadgetFeature();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GADGET_FEATURE__PARAM = eINSTANCE.getGadgetFeature_Param();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GADGET_FEATURE__FEATURE = eINSTANCE.getGadgetFeature_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.IconImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__VALUE = eINSTANCE.getIcon_Value();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__MODE = eINSTANCE.getIcon_Mode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__TYPE = eINSTANCE.getIcon_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.LinkImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.LocaleImpl <em>Locale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.LocaleImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLocale()
		 * @generated
		 */
		EClass LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALE__MSG = eINSTANCE.getLocale_Msg();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__COUNTRY = eINSTANCE.getLocale_Country();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__LANG = eINSTANCE.getLocale_Lang();

		/**
		 * The meta object literal for the '<em><b>Language Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__LANGUAGE_DIRECTION = eINSTANCE.getLocale_LanguageDirection();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALE__MESSAGES = eINSTANCE.getLocale_Messages();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl <em>Module Prefs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getModulePrefs()
		 * @generated
		 */
		EClass MODULE_PREFS = eINSTANCE.getModulePrefs();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__GROUP = eINSTANCE.getModulePrefs_Group();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PREFS__REQUIRE = eINSTANCE.getModulePrefs_Require();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PREFS__OPTIONAL = eINSTANCE.getModulePrefs_Optional();

		/**
		 * The meta object literal for the '<em><b>Preload</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PREFS__PRELOAD = eINSTANCE.getModulePrefs_Preload();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PREFS__ICON = eINSTANCE.getModulePrefs_Icon();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PREFS__LOCALE = eINSTANCE.getModulePrefs_Locale();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PREFS__LINK = eINSTANCE.getModulePrefs_Link();

		/**
		 * The meta object literal for the '<em><b>OAuth</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PREFS__OAUTH = eINSTANCE.getModulePrefs_OAuth();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__AUTHOR = eINSTANCE.getModulePrefs_Author();

		/**
		 * The meta object literal for the '<em><b>Author Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__AUTHOR_EMAIL = eINSTANCE.getModulePrefs_AuthorEmail();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__CATEGORY = eINSTANCE.getModulePrefs_Category();

		/**
		 * The meta object literal for the '<em><b>Category2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__CATEGORY2 = eINSTANCE.getModulePrefs_Category2();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__DESCRIPTION = eINSTANCE.getModulePrefs_Description();

		/**
		 * The meta object literal for the '<em><b>Directory Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__DIRECTORY_TITLE = eINSTANCE.getModulePrefs_DirectoryTitle();

		/**
		 * The meta object literal for the '<em><b>Screenshot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__SCREENSHOT = eINSTANCE.getModulePrefs_Screenshot();

		/**
		 * The meta object literal for the '<em><b>Thumbnail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__THUMBNAIL = eINSTANCE.getModulePrefs_Thumbnail();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__TITLE = eINSTANCE.getModulePrefs_Title();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__WIDTH = eINSTANCE.getModulePrefs_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__HEIGHT = eINSTANCE.getModulePrefs_Height();

		/**
		 * The meta object literal for the '<em><b>Title Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_PREFS__TITLE_URL = eINSTANCE.getModulePrefs_TitleUrl();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.ModuleImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Module Prefs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_PREFS = eINSTANCE.getModule_ModulePrefs();

		/**
		 * The meta object literal for the '<em><b>User Pref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__USER_PREF = eINSTANCE.getModule_UserPref();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONTENT = eINSTANCE.getModule_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.MsgImpl <em>Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.MsgImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMsg()
		 * @generated
		 */
		EClass MSG = eINSTANCE.getMsg();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG__VALUE = eINSTANCE.getMsg_Value();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG__DESC = eINSTANCE.getMsg_Desc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG__NAME = eINSTANCE.getMsg_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.OAuthResourceImpl <em>OAuth Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.OAuthResourceImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getOAuthResource()
		 * @generated
		 */
		EClass OAUTH_RESOURCE = eINSTANCE.getOAuthResource();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_RESOURCE__METHOD = eINSTANCE.getOAuthResource_Method();

		/**
		 * The meta object literal for the '<em><b>Param Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_RESOURCE__PARAM_LOCATION = eINSTANCE.getOAuthResource_ParamLocation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_RESOURCE__URL = eINSTANCE.getOAuthResource_Url();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.OAuthImpl <em>OAuth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.OAuthImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getOAuth()
		 * @generated
		 */
		EClass OAUTH = eINSTANCE.getOAuth();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH__SERVICE = eINSTANCE.getOAuth_Service();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH__NAME = eINSTANCE.getOAuth_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.ParamImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.PreloadImpl <em>Preload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.PreloadImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getPreload()
		 * @generated
		 */
		EClass PRELOAD = eINSTANCE.getPreload();

		/**
		 * The meta object literal for the '<em><b>Authz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__AUTHZ = eINSTANCE.getPreload_Authz();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__HREF = eINSTANCE.getPreload_Href();

		/**
		 * The meta object literal for the '<em><b>Oauth Request Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__OAUTH_REQUEST_TOKEN = eINSTANCE.getPreload_OauthRequestToken();

		/**
		 * The meta object literal for the '<em><b>Oauth Request Token Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__OAUTH_REQUEST_TOKEN_SECRET = eINSTANCE.getPreload_OauthRequestTokenSecret();

		/**
		 * The meta object literal for the '<em><b>Oauth Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__OAUTH_SERVICE_NAME = eINSTANCE.getPreload_OauthServiceName();

		/**
		 * The meta object literal for the '<em><b>Oauth Token Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__OAUTH_TOKEN_NAME = eINSTANCE.getPreload_OauthTokenName();

		/**
		 * The meta object literal for the '<em><b>Sign Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__SIGN_OWNER = eINSTANCE.getPreload_SignOwner();

		/**
		 * The meta object literal for the '<em><b>Sign Viewer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__SIGN_VIEWER = eINSTANCE.getPreload_SignViewer();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELOAD__VIEWS = eINSTANCE.getPreload_Views();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.ServiceImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REQUEST = eINSTANCE.getService_Request();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ACCESS = eINSTANCE.getService_Access();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__AUTHORIZATION = eINSTANCE.getService_Authorization();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.impl.UserPrefImpl <em>User Pref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.impl.UserPrefImpl
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getUserPref()
		 * @generated
		 */
		EClass USER_PREF = eINSTANCE.getUserPref();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PREF__ENUM_VALUE = eINSTANCE.getUserPref_EnumValue();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREF__DATATYPE = eINSTANCE.getUserPref_Datatype();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREF__DEFAULT_VALUE = eINSTANCE.getUserPref_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREF__DISPLAY_NAME = eINSTANCE.getUserPref_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREF__NAME = eINSTANCE.getUserPref_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREF__REQUIRED = eINSTANCE.getUserPref_Required();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.Authz <em>Authz</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Authz
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getAuthz()
		 * @generated
		 */
		EEnum AUTHZ = eINSTANCE.getAuthz();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.Datatype <em>Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Datatype
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getDatatype()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.LanguageDirection <em>Language Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.LanguageDirection
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLanguageDirection()
		 * @generated
		 */
		EEnum LANGUAGE_DIRECTION = eINSTANCE.getLanguageDirection();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.Method <em>Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Method
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMethod()
		 * @generated
		 */
		EEnum METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Mode
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.ParamLocation <em>Param Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.ParamLocation
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getParamLocation()
		 * @generated
		 */
		EEnum PARAM_LOCATION = eINSTANCE.getParamLocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.Rel <em>Rel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Rel
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getRel()
		 * @generated
		 */
		EEnum REL = eINSTANCE.getRel();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.opensocial.model.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Type
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Authz Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Authz
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getAuthzObject()
		 * @generated
		 */
		EDataType AUTHZ_OBJECT = eINSTANCE.getAuthzObject();

		/**
		 * The meta object literal for the '<em>Datatype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Datatype
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getDatatypeObject()
		 * @generated
		 */
		EDataType DATATYPE_OBJECT = eINSTANCE.getDatatypeObject();

		/**
		 * The meta object literal for the '<em>Language Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.LanguageDirection
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getLanguageDirectionObject()
		 * @generated
		 */
		EDataType LANGUAGE_DIRECTION_OBJECT = eINSTANCE.getLanguageDirectionObject();

		/**
		 * The meta object literal for the '<em>Method Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Method
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getMethodObject()
		 * @generated
		 */
		EDataType METHOD_OBJECT = eINSTANCE.getMethodObject();

		/**
		 * The meta object literal for the '<em>Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Mode
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getModeObject()
		 * @generated
		 */
		EDataType MODE_OBJECT = eINSTANCE.getModeObject();

		/**
		 * The meta object literal for the '<em>Param Location Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.ParamLocation
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getParamLocationObject()
		 * @generated
		 */
		EDataType PARAM_LOCATION_OBJECT = eINSTANCE.getParamLocationObject();

		/**
		 * The meta object literal for the '<em>Rel Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Rel
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getRelObject()
		 * @generated
		 */
		EDataType REL_OBJECT = eINSTANCE.getRelObject();

		/**
		 * The meta object literal for the '<em>Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.opensocial.model.Type
		 * @see org.eclipse.e4.opensocial.model.impl.OpenSocialPackageImpl#getTypeObject()
		 * @generated
		 */
		EDataType TYPE_OBJECT = eINSTANCE.getTypeObject();

	}

} //OpenSocialPackage
