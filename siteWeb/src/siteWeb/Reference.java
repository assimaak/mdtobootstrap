/**
 */
package siteWeb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.Reference#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link siteWeb.Reference#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see siteWeb.SiteWebPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends ElementGraphique {
	/**
	 * Returns the value of the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphe</em>' reference.
	 * @see #setParagraphe(Paragraphe)
	 * @see siteWeb.SiteWebPackage#getReference_Paragraphe()
	 * @model
	 * @generated
	 */
	Paragraphe getParagraphe();

	/**
	 * Sets the value of the '{@link siteWeb.Reference#getParagraphe <em>Paragraphe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraphe</em>' reference.
	 * @see #getParagraphe()
	 * @generated
	 */
	void setParagraphe(Paragraphe value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Page)
	 * @see siteWeb.SiteWebPackage#getReference_Page()
	 * @model
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link siteWeb.Reference#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // Reference
