/**
 */
package siteWeb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Externe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.LienExterne#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @see siteWeb.SiteWebPackage#getLienExterne()
 * @model
 * @generated
 */
public interface LienExterne extends ElementGraphique {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' reference.
	 * @see #setSite(Site)
	 * @see siteWeb.SiteWebPackage#getLienExterne_Site()
	 * @model required="true"
	 * @generated
	 */
	Site getSite();

	/**
	 * Sets the value of the '{@link siteWeb.LienExterne#getSite <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(Site value);

} // LienExterne
