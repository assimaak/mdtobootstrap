/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import siteWeb.Paragraphe;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraphe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.impl.ParagrapheImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link siteWeb.impl.ParagrapheImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParagrapheImpl extends ElementGraphiqueImpl implements Paragraphe {
	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected String texte = TEXTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagrapheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.PARAGRAPHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexte() {
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexte(String newTexte) {
		String oldTexte = texte;
		texte = newTexte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PARAGRAPHE__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PARAGRAPHE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SiteWebPackage.PARAGRAPHE__TEXTE:
			return getTexte();
		case SiteWebPackage.PARAGRAPHE__ID:
			return getId();
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
		case SiteWebPackage.PARAGRAPHE__TEXTE:
			setTexte((String) newValue);
			return;
		case SiteWebPackage.PARAGRAPHE__ID:
			setId((Integer) newValue);
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
		case SiteWebPackage.PARAGRAPHE__TEXTE:
			setTexte(TEXTE_EDEFAULT);
			return;
		case SiteWebPackage.PARAGRAPHE__ID:
			setId(ID_EDEFAULT);
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
		case SiteWebPackage.PARAGRAPHE__TEXTE:
			return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
		case SiteWebPackage.PARAGRAPHE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (texte: ");
		result.append(texte);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ParagrapheImpl
