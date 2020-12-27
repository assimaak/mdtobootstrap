/**
 */
package siteWeb;

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
 * @see siteWeb.SiteWebFactory
 * @model kind="package"
 * @generated
 */
public interface SiteWebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "siteWeb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/siteWeb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "siteWeb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SiteWebPackage eINSTANCE = siteWeb.impl.SiteWebPackageImpl.init();

	/**
	 * The meta object id for the '{@link siteWeb.impl.ElementGraphiqueImpl <em>Element Graphique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.ElementGraphiqueImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getElementGraphique()
	 * @generated
	 */
	int ELEMENT_GRAPHIQUE = 2;

	/**
	 * The number of structural features of the '<em>Element Graphique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GRAPHIQUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element Graphique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GRAPHIQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.ReferenceImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PARAGRAPHE = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PAGE = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = ELEMENT_GRAPHIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.PageImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SECTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.LienImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 3;

	/**
	 * The feature id for the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__PARAGRAPHE = REFERENCE__PARAGRAPHE;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__PAGE = REFERENCE__PAGE;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.ImageImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LIEN = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = ELEMENT_GRAPHIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.ParagrapheImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 5;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__TEXTE = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__ID = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = ELEMENT_GRAPHIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.SiteImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 6;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = 1;

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
	 * The meta object id for the '{@link siteWeb.impl.BoutonImpl <em>Bouton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.BoutonImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getBouton()
	 * @generated
	 */
	int BOUTON = 7;

	/**
	 * The feature id for the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__PARAGRAPHE = REFERENCE__PARAGRAPHE;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON__PAGE = REFERENCE__PAGE;

	/**
	 * The number of structural features of the '<em>Bouton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bouton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTON_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.SectionImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 8;

	/**
	 * The feature id for the '<em><b>Elementgraphique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ELEMENTGRAPHIQUE = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = ELEMENT_GRAPHIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.LienExterneImpl <em>Lien Externe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.LienExterneImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getLienExterne()
	 * @generated
	 */
	int LIEN_EXTERNE = 9;

	/**
	 * The feature id for the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE__SITE = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lien Externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE_FEATURE_COUNT = ELEMENT_GRAPHIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lien Externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE_OPERATION_COUNT = ELEMENT_GRAPHIQUE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link siteWeb.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see siteWeb.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link siteWeb.Reference#getParagraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragraphe</em>'.
	 * @see siteWeb.Reference#getParagraphe()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Paragraphe();

	/**
	 * Returns the meta object for the reference '{@link siteWeb.Reference#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see siteWeb.Reference#getPage()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Page();

	/**
	 * Returns the meta object for class '{@link siteWeb.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see siteWeb.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link siteWeb.Page#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see siteWeb.Page#getSection()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Section();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Page#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see siteWeb.Page#getId()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Id();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see siteWeb.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link siteWeb.ElementGraphique <em>Element Graphique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Graphique</em>'.
	 * @see siteWeb.ElementGraphique
	 * @generated
	 */
	EClass getElementGraphique();

	/**
	 * Returns the meta object for class '{@link siteWeb.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see siteWeb.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for class '{@link siteWeb.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see siteWeb.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Image#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see siteWeb.Image#getLien()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Lien();

	/**
	 * Returns the meta object for class '{@link siteWeb.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see siteWeb.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Paragraphe#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see siteWeb.Paragraphe#getTexte()
	 * @see #getParagraphe()
	 * @generated
	 */
	EAttribute getParagraphe_Texte();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Paragraphe#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see siteWeb.Paragraphe#getId()
	 * @see #getParagraphe()
	 * @generated
	 */
	EAttribute getParagraphe_Id();

	/**
	 * Returns the meta object for class '{@link siteWeb.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see siteWeb.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link siteWeb.Site#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see siteWeb.Site#getPage()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Page();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Site#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see siteWeb.Site#getName()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Name();

	/**
	 * Returns the meta object for class '{@link siteWeb.Bouton <em>Bouton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouton</em>'.
	 * @see siteWeb.Bouton
	 * @generated
	 */
	EClass getBouton();

	/**
	 * Returns the meta object for class '{@link siteWeb.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see siteWeb.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link siteWeb.Section#getElementgraphique <em>Elementgraphique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementgraphique</em>'.
	 * @see siteWeb.Section#getElementgraphique()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Elementgraphique();

	/**
	 * Returns the meta object for class '{@link siteWeb.LienExterne <em>Lien Externe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Externe</em>'.
	 * @see siteWeb.LienExterne
	 * @generated
	 */
	EClass getLienExterne();

	/**
	 * Returns the meta object for the reference '{@link siteWeb.LienExterne#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Site</em>'.
	 * @see siteWeb.LienExterne#getSite()
	 * @see #getLienExterne()
	 * @generated
	 */
	EReference getLienExterne_Site();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SiteWebFactory getSiteWebFactory();

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
		 * The meta object literal for the '{@link siteWeb.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.ReferenceImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Paragraphe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__PARAGRAPHE = eINSTANCE.getReference_Paragraphe();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__PAGE = eINSTANCE.getReference_Page();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.PageImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SECTION = eINSTANCE.getPage_Section();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__ID = eINSTANCE.getPage_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.ElementGraphiqueImpl <em>Element Graphique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.ElementGraphiqueImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getElementGraphique()
		 * @generated
		 */
		EClass ELEMENT_GRAPHIQUE = eINSTANCE.getElementGraphique();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.LienImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.ImageImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__LIEN = eINSTANCE.getImage_Lien();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.ParagrapheImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPHE__TEXTE = eINSTANCE.getParagraphe_Texte();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPHE__ID = eINSTANCE.getParagraphe_Id();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.SiteImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__PAGE = eINSTANCE.getSite_Page();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__NAME = eINSTANCE.getSite_Name();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.BoutonImpl <em>Bouton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.BoutonImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getBouton()
		 * @generated
		 */
		EClass BOUTON = eINSTANCE.getBouton();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.SectionImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Elementgraphique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__ELEMENTGRAPHIQUE = eINSTANCE.getSection_Elementgraphique();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.LienExterneImpl <em>Lien Externe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.LienExterneImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getLienExterne()
		 * @generated
		 */
		EClass LIEN_EXTERNE = eINSTANCE.getLienExterne();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN_EXTERNE__SITE = eINSTANCE.getLienExterne_Site();

	}

} //SiteWebPackage
