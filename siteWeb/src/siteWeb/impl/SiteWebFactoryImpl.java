/**
 */
package siteWeb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import siteWeb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteWebFactoryImpl extends EFactoryImpl implements SiteWebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SiteWebFactory init() {
		try {
			SiteWebFactory theSiteWebFactory = (SiteWebFactory) EPackage.Registry.INSTANCE
					.getEFactory(SiteWebPackage.eNS_URI);
			if (theSiteWebFactory != null) {
				return theSiteWebFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SiteWebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SiteWebPackage.PAGE:
			return createPage();
		case SiteWebPackage.LIEN:
			return createLien();
		case SiteWebPackage.IMAGE:
			return createImage();
		case SiteWebPackage.PARAGRAPHE:
			return createParagraphe();
		case SiteWebPackage.SITE:
			return createSite();
		case SiteWebPackage.BOUTON:
			return createBouton();
		case SiteWebPackage.SECTION:
			return createSection();
		case SiteWebPackage.LIEN_EXTERNE:
			return createLienExterne();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lien createLien() {
		LienImpl lien = new LienImpl();
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraphe createParagraphe() {
		ParagrapheImpl paragraphe = new ParagrapheImpl();
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bouton createBouton() {
		BoutonImpl bouton = new BoutonImpl();
		return bouton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LienExterne createLienExterne() {
		LienExterneImpl lienExterne = new LienExterneImpl();
		return lienExterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiteWebPackage getSiteWebPackage() {
		return (SiteWebPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SiteWebPackage getPackage() {
		return SiteWebPackage.eINSTANCE;
	}

} //SiteWebFactoryImpl
