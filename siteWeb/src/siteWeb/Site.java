/**
 */
package siteWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.Site#getPage <em>Page</em>}</li>
 *   <li>{@link siteWeb.Site#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see siteWeb.SiteWebPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link siteWeb.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see siteWeb.SiteWebPackage#getSite_Page()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPage();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see siteWeb.SiteWebPackage#getSite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link siteWeb.Site#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Site
