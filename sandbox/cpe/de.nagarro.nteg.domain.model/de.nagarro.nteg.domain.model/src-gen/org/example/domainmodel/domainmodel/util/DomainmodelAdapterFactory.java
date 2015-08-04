/**
 */
package org.example.domainmodel.domainmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.domainmodel.domainmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage
 * @generated
 */
public class DomainmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainmodelPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected DomainmodelSwitch<Adapter> modelSwitch =
    new DomainmodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseNamespaceDeclaration(NamespaceDeclaration object)
      {
        return createNamespaceDeclarationAdapter();
      }
      @Override
      public Adapter caseAbstractNamespaceElement(AbstractNamespaceElement object)
      {
        return createAbstractNamespaceElementAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseDomainEntity(DomainEntity object)
      {
        return createDomainEntityAdapter();
      }
      @Override
      public Adapter caseMethodParameter(MethodParameter object)
      {
        return createMethodParameterAdapter();
      }
      @Override
      public Adapter caseMethodParameters(MethodParameters object)
      {
        return createMethodParametersAdapter();
      }
      @Override
      public Adapter caseMethodCall(MethodCall object)
      {
        return createMethodCallAdapter();
      }
      @Override
      public Adapter caseInterfaceOperation(InterfaceOperation object)
      {
        return createInterfaceOperationAdapter();
      }
      @Override
      public Adapter caseInterfaceDeclaration(InterfaceDeclaration object)
      {
        return createInterfaceDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfaceOperationUsageRule(InterfaceOperationUsageRule object)
      {
        return createInterfaceOperationUsageRuleAdapter();
      }
      @Override
      public Adapter caseInterfaceOperationsUsageRule(InterfaceOperationsUsageRule object)
      {
        return createInterfaceOperationsUsageRuleAdapter();
      }
      @Override
      public Adapter caseStatelessComponent(StatelessComponent object)
      {
        return createStatelessComponentAdapter();
      }
      @Override
      public Adapter caseDomainRepository(DomainRepository object)
      {
        return createDomainRepositoryAdapter();
      }
      @Override
      public Adapter caseEntryParametersModule(EntryParametersModule object)
      {
        return createEntryParametersModuleAdapter();
      }
      @Override
      public Adapter caseModelFeature(ModelFeature object)
      {
        return createModelFeatureAdapter();
      }
      @Override
      public Adapter caseModelModule(ModelModule object)
      {
        return createModelModuleAdapter();
      }
      @Override
      public Adapter caseElementFeature(ElementFeature object)
      {
        return createElementFeatureAdapter();
      }
      @Override
      public Adapter caseContentElement(ContentElement object)
      {
        return createContentElementAdapter();
      }
      @Override
      public Adapter caseContainerElement(ContainerElement object)
      {
        return createContainerElementAdapter();
      }
      @Override
      public Adapter caseViewElement(ViewElement object)
      {
        return createViewElementAdapter();
      }
      @Override
      public Adapter caseViewModule(ViewModule object)
      {
        return createViewModuleAdapter();
      }
      @Override
      public Adapter caseValidateAction(ValidateAction object)
      {
        return createValidateActionAdapter();
      }
      @Override
      public Adapter caseAttachAction(AttachAction object)
      {
        return createAttachActionAdapter();
      }
      @Override
      public Adapter caseBindEnumSource(BindEnumSource object)
      {
        return createBindEnumSourceAdapter();
      }
      @Override
      public Adapter caseBindSource(BindSource object)
      {
        return createBindSourceAdapter();
      }
      @Override
      public Adapter caseBindAction(BindAction object)
      {
        return createBindActionAdapter();
      }
      @Override
      public Adapter caseInitActionFeature(InitActionFeature object)
      {
        return createInitActionFeatureAdapter();
      }
      @Override
      public Adapter caseInitActionModule(InitActionModule object)
      {
        return createInitActionModuleAdapter();
      }
      @Override
      public Adapter caseValidatorRule(ValidatorRule object)
      {
        return createValidatorRuleAdapter();
      }
      @Override
      public Adapter caseValidatorRules(ValidatorRules object)
      {
        return createValidatorRulesAdapter();
      }
      @Override
      public Adapter caseValidatorFeature(ValidatorFeature object)
      {
        return createValidatorFeatureAdapter();
      }
      @Override
      public Adapter caseValidatorModule(ValidatorModule object)
      {
        return createValidatorModuleAdapter();
      }
      @Override
      public Adapter caseScreenModelParameter(ScreenModelParameter object)
      {
        return createScreenModelParameterAdapter();
      }
      @Override
      public Adapter caseScreenModelParameters(ScreenModelParameters object)
      {
        return createScreenModelParametersAdapter();
      }
      @Override
      public Adapter caseNavigateToAction(NavigateToAction object)
      {
        return createNavigateToActionAdapter();
      }
      @Override
      public Adapter caseExecuteAction(ExecuteAction object)
      {
        return createExecuteActionAdapter();
      }
      @Override
      public Adapter caseSetRestCallReceiverURLParameter(SetRestCallReceiverURLParameter object)
      {
        return createSetRestCallReceiverURLParameterAdapter();
      }
      @Override
      public Adapter caseSetRestCallReceiverReturnTypeParameter(SetRestCallReceiverReturnTypeParameter object)
      {
        return createSetRestCallReceiverReturnTypeParameterAdapter();
      }
      @Override
      public Adapter caseSetRestCallReceiverIDParameter(SetRestCallReceiverIDParameter object)
      {
        return createSetRestCallReceiverIDParameterAdapter();
      }
      @Override
      public Adapter caseSetRestCallReceiverParameter(SetRestCallReceiverParameter object)
      {
        return createSetRestCallReceiverParameterAdapter();
      }
      @Override
      public Adapter caseSetRestCallReceiverParameters(SetRestCallReceiverParameters object)
      {
        return createSetRestCallReceiverParametersAdapter();
      }
      @Override
      public Adapter caseSetRestCallReceiver(SetRestCallReceiver object)
      {
        return createSetRestCallReceiverAdapter();
      }
      @Override
      public Adapter caseSetUIElementReceiver(SetUIElementReceiver object)
      {
        return createSetUIElementReceiverAdapter();
      }
      @Override
      public Adapter caseSetActionReceiver(SetActionReceiver object)
      {
        return createSetActionReceiverAdapter();
      }
      @Override
      public Adapter caseSetAction(SetAction object)
      {
        return createSetActionAdapter();
      }
      @Override
      public Adapter caseInterfaceMethodCallParameter(InterfaceMethodCallParameter object)
      {
        return createInterfaceMethodCallParameterAdapter();
      }
      @Override
      public Adapter caseInterfaceMethodCallParameters(InterfaceMethodCallParameters object)
      {
        return createInterfaceMethodCallParametersAdapter();
      }
      @Override
      public Adapter caseInterfaceMethodCall(InterfaceMethodCall object)
      {
        return createInterfaceMethodCallAdapter();
      }
      @Override
      public Adapter caseUIActionFeature(UIActionFeature object)
      {
        return createUIActionFeatureAdapter();
      }
      @Override
      public Adapter caseUIActionModule(UIActionModule object)
      {
        return createUIActionModuleAdapter();
      }
      @Override
      public Adapter caseControllerElement(ControllerElement object)
      {
        return createControllerElementAdapter();
      }
      @Override
      public Adapter caseControllerModule(ControllerModule object)
      {
        return createControllerModuleAdapter();
      }
      @Override
      public Adapter caseScreenModule(ScreenModule object)
      {
        return createScreenModuleAdapter();
      }
      @Override
      public Adapter caseScreenFeature(ScreenFeature object)
      {
        return createScreenFeatureAdapter();
      }
      @Override
      public Adapter caseMainFeatureOption(MainFeatureOption object)
      {
        return createMainFeatureOptionAdapter();
      }
      @Override
      public Adapter caseMainFeature(MainFeature object)
      {
        return createMainFeatureAdapter();
      }
      @Override
      public Adapter caseUIFeature(UIFeature object)
      {
        return createUIFeatureAdapter();
      }
      @Override
      public Adapter caseUIModule(UIModule object)
      {
        return createUIModuleAdapter();
      }
      @Override
      public Adapter caseBusinessFeatureType(BusinessFeatureType object)
      {
        return createBusinessFeatureTypeAdapter();
      }
      @Override
      public Adapter caseBusinessFeature(BusinessFeature object)
      {
        return createBusinessFeatureAdapter();
      }
      @Override
      public Adapter caseBusinessFeatures(BusinessFeatures object)
      {
        return createBusinessFeaturesAdapter();
      }
      @Override
      public Adapter caseBusinessModule(BusinessModule object)
      {
        return createBusinessModuleAdapter();
      }
      @Override
      public Adapter caseSystemModule(SystemModule object)
      {
        return createSystemModuleAdapter();
      }
      @Override
      public Adapter caseSystemDefinition(SystemDefinition object)
      {
        return createSystemDefinitionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.NamespaceDeclaration
   * @generated
   */
  public Adapter createNamespaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.AbstractNamespaceElement <em>Abstract Namespace Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.AbstractNamespaceElement
   * @generated
   */
  public Adapter createAbstractNamespaceElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.DomainEntity <em>Domain Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.DomainEntity
   * @generated
   */
  public Adapter createDomainEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.MethodParameter <em>Method Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.MethodParameter
   * @generated
   */
  public Adapter createMethodParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.MethodParameters <em>Method Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.MethodParameters
   * @generated
   */
  public Adapter createMethodParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.MethodCall
   * @generated
   */
  public Adapter createMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InterfaceOperation <em>Interface Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InterfaceOperation
   * @generated
   */
  public Adapter createInterfaceOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InterfaceDeclaration
   * @generated
   */
  public Adapter createInterfaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule <em>Interface Operation Usage Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InterfaceOperationUsageRule
   * @generated
   */
  public Adapter createInterfaceOperationUsageRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule <em>Interface Operations Usage Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule
   * @generated
   */
  public Adapter createInterfaceOperationsUsageRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.StatelessComponent <em>Stateless Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.StatelessComponent
   * @generated
   */
  public Adapter createStatelessComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.DomainRepository <em>Domain Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.DomainRepository
   * @generated
   */
  public Adapter createDomainRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.EntryParametersModule <em>Entry Parameters Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.EntryParametersModule
   * @generated
   */
  public Adapter createEntryParametersModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ModelFeature <em>Model Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ModelFeature
   * @generated
   */
  public Adapter createModelFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ModelModule <em>Model Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ModelModule
   * @generated
   */
  public Adapter createModelModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ElementFeature <em>Element Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ElementFeature
   * @generated
   */
  public Adapter createElementFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ContentElement <em>Content Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ContentElement
   * @generated
   */
  public Adapter createContentElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ContainerElement <em>Container Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ContainerElement
   * @generated
   */
  public Adapter createContainerElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ViewElement
   * @generated
   */
  public Adapter createViewElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ViewModule <em>View Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ViewModule
   * @generated
   */
  public Adapter createViewModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ValidateAction <em>Validate Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ValidateAction
   * @generated
   */
  public Adapter createValidateActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.AttachAction <em>Attach Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.AttachAction
   * @generated
   */
  public Adapter createAttachActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.BindEnumSource <em>Bind Enum Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.BindEnumSource
   * @generated
   */
  public Adapter createBindEnumSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.BindSource <em>Bind Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.BindSource
   * @generated
   */
  public Adapter createBindSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.BindAction <em>Bind Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.BindAction
   * @generated
   */
  public Adapter createBindActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InitActionFeature <em>Init Action Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InitActionFeature
   * @generated
   */
  public Adapter createInitActionFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InitActionModule <em>Init Action Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InitActionModule
   * @generated
   */
  public Adapter createInitActionModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ValidatorRule <em>Validator Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ValidatorRule
   * @generated
   */
  public Adapter createValidatorRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ValidatorRules <em>Validator Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ValidatorRules
   * @generated
   */
  public Adapter createValidatorRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ValidatorFeature <em>Validator Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ValidatorFeature
   * @generated
   */
  public Adapter createValidatorFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ValidatorModule <em>Validator Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ValidatorModule
   * @generated
   */
  public Adapter createValidatorModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ScreenModelParameter <em>Screen Model Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ScreenModelParameter
   * @generated
   */
  public Adapter createScreenModelParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ScreenModelParameters <em>Screen Model Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ScreenModelParameters
   * @generated
   */
  public Adapter createScreenModelParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.NavigateToAction <em>Navigate To Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.NavigateToAction
   * @generated
   */
  public Adapter createNavigateToActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ExecuteAction <em>Execute Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ExecuteAction
   * @generated
   */
  public Adapter createExecuteActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverURLParameter <em>Set Rest Call Receiver URL Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverURLParameter
   * @generated
   */
  public Adapter createSetRestCallReceiverURLParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverReturnTypeParameter <em>Set Rest Call Receiver Return Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverReturnTypeParameter
   * @generated
   */
  public Adapter createSetRestCallReceiverReturnTypeParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverIDParameter <em>Set Rest Call Receiver ID Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverIDParameter
   * @generated
   */
  public Adapter createSetRestCallReceiverIDParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverParameter <em>Set Rest Call Receiver Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverParameter
   * @generated
   */
  public Adapter createSetRestCallReceiverParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverParameters <em>Set Rest Call Receiver Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverParameters
   * @generated
   */
  public Adapter createSetRestCallReceiverParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiver <em>Set Rest Call Receiver</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiver
   * @generated
   */
  public Adapter createSetRestCallReceiverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetUIElementReceiver <em>Set UI Element Receiver</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetUIElementReceiver
   * @generated
   */
  public Adapter createSetUIElementReceiverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetActionReceiver <em>Set Action Receiver</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetActionReceiver
   * @generated
   */
  public Adapter createSetActionReceiverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SetAction <em>Set Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SetAction
   * @generated
   */
  public Adapter createSetActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter <em>Interface Method Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCallParameter
   * @generated
   */
  public Adapter createInterfaceMethodCallParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameters <em>Interface Method Call Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCallParameters
   * @generated
   */
  public Adapter createInterfaceMethodCallParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.InterfaceMethodCall <em>Interface Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCall
   * @generated
   */
  public Adapter createInterfaceMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.UIActionFeature <em>UI Action Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.UIActionFeature
   * @generated
   */
  public Adapter createUIActionFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.UIActionModule <em>UI Action Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.UIActionModule
   * @generated
   */
  public Adapter createUIActionModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ControllerElement <em>Controller Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ControllerElement
   * @generated
   */
  public Adapter createControllerElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ControllerModule <em>Controller Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ControllerModule
   * @generated
   */
  public Adapter createControllerModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ScreenModule <em>Screen Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ScreenModule
   * @generated
   */
  public Adapter createScreenModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.ScreenFeature <em>Screen Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.ScreenFeature
   * @generated
   */
  public Adapter createScreenFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.MainFeatureOption <em>Main Feature Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.MainFeatureOption
   * @generated
   */
  public Adapter createMainFeatureOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.MainFeature <em>Main Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.MainFeature
   * @generated
   */
  public Adapter createMainFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.UIFeature <em>UI Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.UIFeature
   * @generated
   */
  public Adapter createUIFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.UIModule <em>UI Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.UIModule
   * @generated
   */
  public Adapter createUIModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.BusinessFeatureType <em>Business Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.BusinessFeatureType
   * @generated
   */
  public Adapter createBusinessFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.BusinessFeature <em>Business Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.BusinessFeature
   * @generated
   */
  public Adapter createBusinessFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.BusinessFeatures <em>Business Features</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.BusinessFeatures
   * @generated
   */
  public Adapter createBusinessFeaturesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.BusinessModule <em>Business Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.BusinessModule
   * @generated
   */
  public Adapter createBusinessModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SystemModule <em>System Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SystemModule
   * @generated
   */
  public Adapter createSystemModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.domainmodel.domainmodel.SystemDefinition <em>System Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.domainmodel.domainmodel.SystemDefinition
   * @generated
   */
  public Adapter createSystemDefinitionAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DomainmodelAdapterFactory
