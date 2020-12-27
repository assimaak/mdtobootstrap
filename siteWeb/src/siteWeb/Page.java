/**
 */
package siteWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.Page#getSection <em>Section</em>}</li>
 *   <li>{@link siteWeb.Page#getId <em>Id</em>}</li>
 *   <li>{@link siteWeb.Page#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see siteWeb.SiteWebPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link siteWeb.ElementGraphique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see siteWeb.SiteWebPackage#getPage_Section()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementGraphique> getSection();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see siteWeb.SiteWebPackage#getPage_Id()
	 * @model
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link siteWeb.Page#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see siteWeb.SiteWebPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link siteWeb.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Page
