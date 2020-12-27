/**
 */
package siteWeb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.Image#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @see siteWeb.SiteWebPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends ElementGraphique {

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' attribute.
	 * @see #setLien(String)
	 * @see siteWeb.SiteWebPackage#getImage_Lien()
	 * @model
	 * @generated
	 */
	String getLien();

	/**
	 * Sets the value of the '{@link siteWeb.Image#getLien <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien</em>' attribute.
	 * @see #getLien()
	 * @generated
	 */
	void setLien(String value);
} // Image
