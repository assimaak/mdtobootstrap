/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import siteWeb.Page;
import siteWeb.Paragraphe;
import siteWeb.Reference;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.impl.ReferenceImpl#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link siteWeb.impl.ReferenceImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceImpl extends ElementGraphiqueImpl implements Reference {
	/**
	 * The cached value of the '{@link #getParagraphe() <em>Paragraphe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphe()
	 * @generated
	 * @ordered
	 */
	protected Paragraphe paragraphe;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected Page page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraphe getParagraphe() {
		if (paragraphe != null && paragraphe.eIsProxy()) {
			InternalEObject oldParagraphe = (InternalEObject) paragraphe;
			paragraphe = (Paragraphe) eResolveProxy(oldParagraphe);
			if (paragraphe != oldParagraphe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteWebPackage.REFERENCE__PARAGRAPHE,
							oldParagraphe, paragraphe));
			}
		}
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe basicGetParagraphe() {
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParagraphe(Paragraphe newParagraphe) {
		Paragraphe oldParagraphe = paragraphe;
		paragraphe = newParagraphe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.REFERENCE__PARAGRAPHE, oldParagraphe,
					paragraphe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getPage() {
		if (page != null && page.eIsProxy()) {
			InternalEObject oldPage = (InternalEObject) page;
			page = (Page) eResolveProxy(oldPage);
			if (page != oldPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteWebPackage.REFERENCE__PAGE, oldPage,
							page));
			}
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPage(Page newPage) {
		Page oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.REFERENCE__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SiteWebPackage.REFERENCE__PARAGRAPHE:
			if (resolve)
				return getParagraphe();
			return basicGetParagraphe();
		case SiteWebPackage.REFERENCE__PAGE:
			if (resolve)
				return getPage();
			return basicGetPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SiteWebPackage.REFERENCE__PARAGRAPHE:
			setParagraphe((Paragraphe) newValue);
			return;
		case SiteWebPackage.REFERENCE__PAGE:
			setPage((Page) newValue);
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
		case SiteWebPackage.REFERENCE__PARAGRAPHE:
			setParagraphe((Paragraphe) null);
			return;
		case SiteWebPackage.REFERENCE__PAGE:
			setPage((Page) null);
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
		case SiteWebPackage.REFERENCE__PARAGRAPHE:
			return paragraphe != null;
		case SiteWebPackage.REFERENCE__PAGE:
			return page != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
