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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Prefs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getRequire <em>Require</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getPreload <em>Preload</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getLink <em>Link</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getOAuth <em>OAuth</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getAuthorEmail <em>Author Email</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getCategory2 <em>Category2</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getDirectoryTitle <em>Directory Title</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getThumbnail <em>Thumbnail</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.ModulePrefs#getTitleUrl <em>Title Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs()
 * @model extendedMetaData="name='ModulePrefs_._type' kind='elementOnly'"
 * @generated
 */
public interface ModulePrefs extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Require</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.GadgetFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Require()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Require' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<GadgetFeature> getRequire();

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.GadgetFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Optional()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Optional' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<GadgetFeature> getOptional();

	/**
	 * Returns the value of the '<em><b>Preload</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.Preload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preload</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Preload()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Preload' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Preload> getPreload();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.Icon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Icon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Icon' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Icon> getIcon();

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.Locale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Locale()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Locale' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Locale> getLocale();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Link()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>OAuth</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.opensocial.model.OAuth}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth</em>' containment reference list.
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_OAuth()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OAuth' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<OAuth> getOAuth();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Email</em>' attribute.
	 * @see #setAuthorEmail(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_AuthorEmail()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='author_email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthorEmail();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getAuthorEmail <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Email</em>' attribute.
	 * @see #getAuthorEmail()
	 * @generated
	 */
	void setAuthorEmail(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Category()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Category2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category2</em>' attribute.
	 * @see #setCategory2(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Category2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='category2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCategory2();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getCategory2 <em>Category2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category2</em>' attribute.
	 * @see #getCategory2()
	 * @generated
	 */
	void setCategory2(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Directory Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Title</em>' attribute.
	 * @see #setDirectoryTitle(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_DirectoryTitle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='directory_title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDirectoryTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getDirectoryTitle <em>Directory Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Title</em>' attribute.
	 * @see #getDirectoryTitle()
	 * @generated
	 */
	void setDirectoryTitle(String value);

	/**
	 * Returns the value of the '<em><b>Screenshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screenshot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot</em>' attribute.
	 * @see #setScreenshot(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Screenshot()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='screenshot' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScreenshot();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getScreenshot <em>Screenshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screenshot</em>' attribute.
	 * @see #getScreenshot()
	 * @generated
	 */
	void setScreenshot(String value);

	/**
	 * Returns the value of the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumbnail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbnail</em>' attribute.
	 * @see #setThumbnail(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Thumbnail()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='thumbnail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getThumbnail();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getThumbnail <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail</em>' attribute.
	 * @see #getThumbnail()
	 * @generated
	 */
	void setThumbnail(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Width()
	 * @model extendedMetaData="kind='attribute' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_Height()
	 * @model extendedMetaData="kind='attribute' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Title Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Url</em>' attribute.
	 * @see #setTitleUrl(String)
	 * @see org.eclipse.e4.opensocial.model.OpenSocialPackage#getModulePrefs_TitleUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title_url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitleUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.opensocial.model.ModulePrefs#getTitleUrl <em>Title Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Url</em>' attribute.
	 * @see #getTitleUrl()
	 * @generated
	 */
	void setTitleUrl(String value);

} // ModulePrefs
