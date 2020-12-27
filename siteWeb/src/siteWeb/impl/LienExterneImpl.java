/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import siteWeb.LienExterne;
import siteWeb.Site;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien Externe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.impl.LienExterneImpl#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienExterneImpl extends ElementGraphiqueImpl implements LienExterne {
	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected Site site;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienExterneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.LIEN_EXTERNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Site getSite() {
		if (site != null && site.eIsProxy()) {
			InternalEObject oldSite = (InternalEObject) site;
			site = (Site) eResolveProxy(oldSite);
			if (site != oldSite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteWebPackage.LIEN_EXTERNE__SITE,
							oldSite, site));
			}
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site basicGetSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSite(Site newSite) {
		Site oldSite = site;
		site = newSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.LIEN_EXTERNE__SITE, oldSite, site));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SiteWebPackage.LIEN_EXTERNE__SITE:
			if (resolve)
				return getSite();
			return basicGetSite();
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
		case SiteWebPackage.LIEN_EXTERNE__SITE:
			setSite((Site) newValue);
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
		case SiteWebPackage.LIEN_EXTERNE__SITE:
			setSite((Site) null);
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
		case SiteWebPackage.LIEN_EXTERNE__SITE:
			return site != null;
		}
		return super.eIsSet(featureID);
	}

} //LienExterneImpl
