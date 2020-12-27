/**
 */
package siteWeb.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import siteWeb.ElementGraphique;
import siteWeb.Section;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.impl.SectionImpl#getElementgraphique <em>Elementgraphique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ElementGraphiqueImpl implements Section {
	/**
	 * The cached value of the '{@link #getElementgraphique() <em>Elementgraphique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementgraphique()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementGraphique> elementgraphique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementGraphique> getElementgraphique() {
		if (elementgraphique == null) {
			elementgraphique = new EObjectContainmentEList<ElementGraphique>(ElementGraphique.class, this,
					SiteWebPackage.SECTION__ELEMENTGRAPHIQUE);
		}
		return elementgraphique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SiteWebPackage.SECTION__ELEMENTGRAPHIQUE:
			return ((InternalEList<?>) getElementgraphique()).basicRemove(otherEnd, msgs);
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
		case SiteWebPackage.SECTION__ELEMENTGRAPHIQUE:
			return getElementgraphique();
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
		case SiteWebPackage.SECTION__ELEMENTGRAPHIQUE:
			getElementgraphique().clear();
			getElementgraphique().addAll((Collection<? extends ElementGraphique>) newValue);
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
		case SiteWebPackage.SECTION__ELEMENTGRAPHIQUE:
			getElementgraphique().clear();
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
		case SiteWebPackage.SECTION__ELEMENTGRAPHIQUE:
			return elementgraphique != null && !elementgraphique.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
