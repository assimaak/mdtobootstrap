/**
 */
package usd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colomn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usd.Colomn#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see usd.UsdPackage#getColomn()
 * @model
 * @generated
 */
public interface Colomn extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link usd.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see usd.UsdPackage#getColomn_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlock();

} // Colomn
