/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.Container#getBlock <em>Block</em>}</li>
 *   <li>{@link bootstrap.Container#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Block {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getContainer_Block()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlock();

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getContainer_Row()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRow();

} // Container
