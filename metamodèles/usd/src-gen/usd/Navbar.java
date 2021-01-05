/**
 */
package usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.Navbar#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getNavbar()
 * @model
 * @generated
 */
public interface Navbar extends Block {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link usd.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see usd.UsdPackage#getNavbar_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // Navbar
