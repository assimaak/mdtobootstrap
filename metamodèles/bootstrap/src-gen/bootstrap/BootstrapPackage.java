/**
 */
package bootstrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bootstrap.BootstrapFactory
 * @model kind="package"
 * @generated
 */
public interface BootstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bootstrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bootstrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bootstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BootstrapPackage eINSTANCE = bootstrap.impl.BootstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link bootstrap.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.SiteImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Blocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__BLOCS = 1;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.BlockImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TextContainerImpl <em>Text Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TextContainerImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTextContainer()
	 * @generated
	 */
	int TEXT_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__TEXTELEMENTS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TextElementImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.TextImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.HeaderImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 4;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__LEVEL = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ParagrapheImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 6;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.ReferenceImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 8;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bootstrap.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bootstrap.impl.LinkImpl
	 * @see bootstrap.impl.BootstrapPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link bootstrap.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see bootstrap.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Site#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bootstrap.Site#getName()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.Site#getBlocs <em>Blocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocs</em>'.
	 * @see bootstrap.Site#getBlocs()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Blocs();

	/**
	 * Returns the meta object for class '{@link bootstrap.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Container</em>'.
	 * @see bootstrap.TextContainer
	 * @generated
	 */
	EClass getTextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link bootstrap.TextContainer#getTextelements <em>Textelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textelements</em>'.
	 * @see bootstrap.TextContainer#getTextelements()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Textelements();

	/**
	 * Returns the meta object for class '{@link bootstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see bootstrap.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see bootstrap.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link bootstrap.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see bootstrap.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for class '{@link bootstrap.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see bootstrap.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Header#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see bootstrap.Header#getLevel()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Level();

	/**
	 * Returns the meta object for class '{@link bootstrap.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see bootstrap.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link bootstrap.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see bootstrap.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for class '{@link bootstrap.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see bootstrap.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Link#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see bootstrap.Link#getUrl()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link bootstrap.Link#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see bootstrap.Link#getTitle()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Title();

	/**
	 * Returns the meta object for class '{@link bootstrap.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see bootstrap.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BootstrapFactory getBootstrapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bootstrap.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.SiteImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__NAME = eINSTANCE.getSite_Name();

		/**
		 * The meta object literal for the '<em><b>Blocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__BLOCS = eINSTANCE.getSite_Blocs();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TextContainerImpl <em>Text Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TextContainerImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTextContainer()
		 * @generated
		 */
		EClass TEXT_CONTAINER = eINSTANCE.getTextContainer();

		/**
		 * The meta object literal for the '<em><b>Textelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__TEXTELEMENTS = eINSTANCE.getTextContainer_Textelements();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TextImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.TextElementImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.HeaderImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__LEVEL = eINSTANCE.getHeader_Level();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.BlockImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ParagrapheImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.LinkImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__URL = eINSTANCE.getLink_Url();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TITLE = eINSTANCE.getLink_Title();

		/**
		 * The meta object literal for the '{@link bootstrap.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bootstrap.impl.ReferenceImpl
		 * @see bootstrap.impl.BootstrapPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

	}

} //BootstrapPackage
