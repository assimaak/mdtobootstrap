/**
 */
package siteWeb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.Section#getElementgraphique <em>Elementgraphique</em>}</li>
 * </ul>
 *
 * @see siteWeb.SiteWebPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends ElementGraphique {

	/**
	 * Returns the value of the '<em><b>Elementgraphique</b></em>' containment reference list.
	 * The list contents are of type {@link siteWeb.ElementGraphique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementgraphique</em>' containment reference list.
	 * @see siteWeb.SiteWebPackage#getSection_Elementgraphique()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementGraphique> getElementgraphique();
} // Section
