/**
 */
package idm.simplemarkdown.mm.simplemarkdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simplemarkdown.mm.simplemarkdown.Title#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownPackage#getTitle_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link idm.simplemarkdown.mm.simplemarkdown.Title#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // Title
