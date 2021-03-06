/**
 */
package it.unibz.inf.ontouml.xtext.xcore.util;

import it.unibz.inf.ontouml.xtext.xcore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage
 * @generated
 */
public class XcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XcoreSwitch<Adapter> modelSwitch =
		new XcoreSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseOntoUMLClass(OntoUMLClass object) {
				return createOntoUMLClassAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseAssociationEnd(AssociationEnd object) {
				return createAssociationEndAdapter();
			}
			@Override
			public Adapter caseRegularAssociation(RegularAssociation object) {
				return createRegularAssociationAdapter();
			}
			@Override
			public Adapter caseDerivationAssociation(DerivationAssociation object) {
				return createDerivationAssociationAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseGeneralizationSet(GeneralizationSet object) {
				return createGeneralizationSetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass <em>Onto UML Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass
	 * @generated
	 */
	public Adapter createOntoUMLClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd
	 * @generated
	 */
	public Adapter createAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation <em>Regular Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation
	 * @generated
	 */
	public Adapter createRegularAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation <em>Derivation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation
	 * @generated
	 */
	public Adapter createDerivationAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XcoreAdapterFactory
