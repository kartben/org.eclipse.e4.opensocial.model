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

import org.eclipse.e4.opensocial.model.GadgetFeature;
import org.eclipse.e4.opensocial.model.Icon;
import org.eclipse.e4.opensocial.model.Link;
import org.eclipse.e4.opensocial.model.Locale;
import org.eclipse.e4.opensocial.model.ModulePrefs;
import org.eclipse.e4.opensocial.model.OAuth;
import org.eclipse.e4.opensocial.model.OpenSocialPackage;
import org.eclipse.e4.opensocial.model.Preload;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Prefs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getPreload <em>Preload</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getOAuth <em>OAuth</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getAuthorEmail <em>Author Email</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getCategory2 <em>Category2</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getDirectoryTitle <em>Directory Title</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getThumbnail <em>Thumbnail</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.e4.opensocial.model.impl.ModulePrefsImpl#getTitleUrl <em>Title Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModulePrefsImpl extends EObjectImpl implements ModulePrefs {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorEmail() <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorEmail() <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorEmail()
	 * @generated
	 * @ordered
	 */
	protected String authorEmail = AUTHOR_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory2() <em>Category2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory2()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory2() <em>Category2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory2()
	 * @generated
	 * @ordered
	 */
	protected String category2 = CATEGORY2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectoryTitle() <em>Directory Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryTitle() <em>Directory Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryTitle()
	 * @generated
	 * @ordered
	 */
	protected String directoryTitle = DIRECTORY_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenshot()
	 * @generated
	 * @ordered
	 */
	protected static final String SCREENSHOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenshot()
	 * @generated
	 * @ordered
	 */
	protected String screenshot = SCREENSHOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThumbnail() <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnail()
	 * @generated
	 * @ordered
	 */
	protected static final String THUMBNAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThumbnail() <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnail()
	 * @generated
	 * @ordered
	 */
	protected String thumbnail = THUMBNAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleUrl() <em>Title Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleUrl() <em>Title Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleUrl()
	 * @generated
	 * @ordered
	 */
	protected String titleUrl = TITLE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulePrefsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenSocialPackage.Literals.MODULE_PREFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OpenSocialPackage.MODULE_PREFS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GadgetFeature> getRequire() {
		return getGroup().list(OpenSocialPackage.Literals.MODULE_PREFS__REQUIRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GadgetFeature> getOptional() {
		return getGroup().list(OpenSocialPackage.Literals.MODULE_PREFS__OPTIONAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Preload> getPreload() {
		return getGroup().list(OpenSocialPackage.Literals.MODULE_PREFS__PRELOAD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Icon> getIcon() {
		return getGroup().list(OpenSocialPackage.Literals.MODULE_PREFS__ICON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Locale> getLocale() {
		return getGroup().list(OpenSocialPackage.Literals.MODULE_PREFS__LOCALE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Link> getLink() {
		return getGroup().list(OpenSocialPackage.Literals.MODULE_PREFS__LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OAuth> getOAuth() {
		return getGroup().list(OpenSocialPackage.Literals.MODULE_PREFS__OAUTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorEmail() {
		return authorEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorEmail(String newAuthorEmail) {
		String oldAuthorEmail = authorEmail;
		authorEmail = newAuthorEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__AUTHOR_EMAIL, oldAuthorEmail, authorEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory2() {
		return category2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory2(String newCategory2) {
		String oldCategory2 = category2;
		category2 = newCategory2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__CATEGORY2, oldCategory2, category2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectoryTitle() {
		return directoryTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectoryTitle(String newDirectoryTitle) {
		String oldDirectoryTitle = directoryTitle;
		directoryTitle = newDirectoryTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__DIRECTORY_TITLE, oldDirectoryTitle, directoryTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScreenshot() {
		return screenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenshot(String newScreenshot) {
		String oldScreenshot = screenshot;
		screenshot = newScreenshot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__SCREENSHOT, oldScreenshot, screenshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnail(String newThumbnail) {
		String oldThumbnail = thumbnail;
		thumbnail = newThumbnail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__THUMBNAIL, oldThumbnail, thumbnail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleUrl() {
		return titleUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleUrl(String newTitleUrl) {
		String oldTitleUrl = titleUrl;
		titleUrl = newTitleUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenSocialPackage.MODULE_PREFS__TITLE_URL, oldTitleUrl, titleUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenSocialPackage.MODULE_PREFS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE_PREFS__REQUIRE:
				return ((InternalEList<?>)getRequire()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE_PREFS__OPTIONAL:
				return ((InternalEList<?>)getOptional()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE_PREFS__PRELOAD:
				return ((InternalEList<?>)getPreload()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE_PREFS__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE_PREFS__LOCALE:
				return ((InternalEList<?>)getLocale()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE_PREFS__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OpenSocialPackage.MODULE_PREFS__OAUTH:
				return ((InternalEList<?>)getOAuth()).basicRemove(otherEnd, msgs);
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
			case OpenSocialPackage.MODULE_PREFS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OpenSocialPackage.MODULE_PREFS__REQUIRE:
				return getRequire();
			case OpenSocialPackage.MODULE_PREFS__OPTIONAL:
				return getOptional();
			case OpenSocialPackage.MODULE_PREFS__PRELOAD:
				return getPreload();
			case OpenSocialPackage.MODULE_PREFS__ICON:
				return getIcon();
			case OpenSocialPackage.MODULE_PREFS__LOCALE:
				return getLocale();
			case OpenSocialPackage.MODULE_PREFS__LINK:
				return getLink();
			case OpenSocialPackage.MODULE_PREFS__OAUTH:
				return getOAuth();
			case OpenSocialPackage.MODULE_PREFS__AUTHOR:
				return getAuthor();
			case OpenSocialPackage.MODULE_PREFS__AUTHOR_EMAIL:
				return getAuthorEmail();
			case OpenSocialPackage.MODULE_PREFS__CATEGORY:
				return getCategory();
			case OpenSocialPackage.MODULE_PREFS__CATEGORY2:
				return getCategory2();
			case OpenSocialPackage.MODULE_PREFS__DESCRIPTION:
				return getDescription();
			case OpenSocialPackage.MODULE_PREFS__DIRECTORY_TITLE:
				return getDirectoryTitle();
			case OpenSocialPackage.MODULE_PREFS__SCREENSHOT:
				return getScreenshot();
			case OpenSocialPackage.MODULE_PREFS__THUMBNAIL:
				return getThumbnail();
			case OpenSocialPackage.MODULE_PREFS__TITLE:
				return getTitle();
			case OpenSocialPackage.MODULE_PREFS__WIDTH:
				return getWidth();
			case OpenSocialPackage.MODULE_PREFS__HEIGHT:
				return getHeight();
			case OpenSocialPackage.MODULE_PREFS__TITLE_URL:
				return getTitleUrl();
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
			case OpenSocialPackage.MODULE_PREFS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__REQUIRE:
				getRequire().clear();
				getRequire().addAll((Collection<? extends GadgetFeature>)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__OPTIONAL:
				getOptional().clear();
				getOptional().addAll((Collection<? extends GadgetFeature>)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__PRELOAD:
				getPreload().clear();
				getPreload().addAll((Collection<? extends Preload>)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends Icon>)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__LOCALE:
				getLocale().clear();
				getLocale().addAll((Collection<? extends Locale>)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__OAUTH:
				getOAuth().clear();
				getOAuth().addAll((Collection<? extends OAuth>)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__AUTHOR:
				setAuthor((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__AUTHOR_EMAIL:
				setAuthorEmail((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__CATEGORY:
				setCategory((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__CATEGORY2:
				setCategory2((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__DIRECTORY_TITLE:
				setDirectoryTitle((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__SCREENSHOT:
				setScreenshot((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__THUMBNAIL:
				setThumbnail((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__TITLE:
				setTitle((String)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__WIDTH:
				setWidth((Integer)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case OpenSocialPackage.MODULE_PREFS__TITLE_URL:
				setTitleUrl((String)newValue);
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
			case OpenSocialPackage.MODULE_PREFS__GROUP:
				getGroup().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__REQUIRE:
				getRequire().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__OPTIONAL:
				getOptional().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__PRELOAD:
				getPreload().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__ICON:
				getIcon().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__LOCALE:
				getLocale().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__LINK:
				getLink().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__OAUTH:
				getOAuth().clear();
				return;
			case OpenSocialPackage.MODULE_PREFS__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__AUTHOR_EMAIL:
				setAuthorEmail(AUTHOR_EMAIL_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__CATEGORY2:
				setCategory2(CATEGORY2_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__DIRECTORY_TITLE:
				setDirectoryTitle(DIRECTORY_TITLE_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__SCREENSHOT:
				setScreenshot(SCREENSHOT_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__THUMBNAIL:
				setThumbnail(THUMBNAIL_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case OpenSocialPackage.MODULE_PREFS__TITLE_URL:
				setTitleUrl(TITLE_URL_EDEFAULT);
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
			case OpenSocialPackage.MODULE_PREFS__GROUP:
				return group != null && !group.isEmpty();
			case OpenSocialPackage.MODULE_PREFS__REQUIRE:
				return !getRequire().isEmpty();
			case OpenSocialPackage.MODULE_PREFS__OPTIONAL:
				return !getOptional().isEmpty();
			case OpenSocialPackage.MODULE_PREFS__PRELOAD:
				return !getPreload().isEmpty();
			case OpenSocialPackage.MODULE_PREFS__ICON:
				return !getIcon().isEmpty();
			case OpenSocialPackage.MODULE_PREFS__LOCALE:
				return !getLocale().isEmpty();
			case OpenSocialPackage.MODULE_PREFS__LINK:
				return !getLink().isEmpty();
			case OpenSocialPackage.MODULE_PREFS__OAUTH:
				return !getOAuth().isEmpty();
			case OpenSocialPackage.MODULE_PREFS__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case OpenSocialPackage.MODULE_PREFS__AUTHOR_EMAIL:
				return AUTHOR_EMAIL_EDEFAULT == null ? authorEmail != null : !AUTHOR_EMAIL_EDEFAULT.equals(authorEmail);
			case OpenSocialPackage.MODULE_PREFS__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case OpenSocialPackage.MODULE_PREFS__CATEGORY2:
				return CATEGORY2_EDEFAULT == null ? category2 != null : !CATEGORY2_EDEFAULT.equals(category2);
			case OpenSocialPackage.MODULE_PREFS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenSocialPackage.MODULE_PREFS__DIRECTORY_TITLE:
				return DIRECTORY_TITLE_EDEFAULT == null ? directoryTitle != null : !DIRECTORY_TITLE_EDEFAULT.equals(directoryTitle);
			case OpenSocialPackage.MODULE_PREFS__SCREENSHOT:
				return SCREENSHOT_EDEFAULT == null ? screenshot != null : !SCREENSHOT_EDEFAULT.equals(screenshot);
			case OpenSocialPackage.MODULE_PREFS__THUMBNAIL:
				return THUMBNAIL_EDEFAULT == null ? thumbnail != null : !THUMBNAIL_EDEFAULT.equals(thumbnail);
			case OpenSocialPackage.MODULE_PREFS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OpenSocialPackage.MODULE_PREFS__WIDTH:
				return width != WIDTH_EDEFAULT;
			case OpenSocialPackage.MODULE_PREFS__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case OpenSocialPackage.MODULE_PREFS__TITLE_URL:
				return TITLE_URL_EDEFAULT == null ? titleUrl != null : !TITLE_URL_EDEFAULT.equals(titleUrl);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", author: ");
		result.append(author);
		result.append(", authorEmail: ");
		result.append(authorEmail);
		result.append(", category: ");
		result.append(category);
		result.append(", category2: ");
		result.append(category2);
		result.append(", description: ");
		result.append(description);
		result.append(", directoryTitle: ");
		result.append(directoryTitle);
		result.append(", screenshot: ");
		result.append(screenshot);
		result.append(", thumbnail: ");
		result.append(thumbnail);
		result.append(", title: ");
		result.append(title);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", titleUrl: ");
		result.append(titleUrl);
		result.append(')');
		return result.toString();
	}

} //ModulePrefsImpl
