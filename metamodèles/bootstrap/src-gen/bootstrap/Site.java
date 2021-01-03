/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.Site#getName <em>Name</em>}</li>
 *   <li>{@link bootstrap.Site#getBlocs <em>Blocs</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bootstrap.BootstrapPackage#getSite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bootstrap.Site#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Blocs</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocs</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getSite_Blocs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getBlocs();

} // Site
