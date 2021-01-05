/**
 */
package bootstrap;

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
 *   <li>{@link bootstrap.Navbar#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getNavbar()
 * @model
 * @generated
 */
public interface Navbar extends Block {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getNavbar_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // Navbar
