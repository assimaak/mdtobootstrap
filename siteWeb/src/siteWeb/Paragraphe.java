/**
 */
package siteWeb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraphe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteWeb.Paragraphe#getTexte <em>Texte</em>}</li>
 *   <li>{@link siteWeb.Paragraphe#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see siteWeb.SiteWebPackage#getParagraphe()
 * @model
 * @generated
 */
public interface Paragraphe extends ElementGraphique {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see siteWeb.SiteWebPackage#getParagraphe_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link siteWeb.Paragraphe#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see siteWeb.SiteWebPackage#getParagraphe_Id()
	 * @model
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link siteWeb.Paragraphe#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

} // Paragraphe
