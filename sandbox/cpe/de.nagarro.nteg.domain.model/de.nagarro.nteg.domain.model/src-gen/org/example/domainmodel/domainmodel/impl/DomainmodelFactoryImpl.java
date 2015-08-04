/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.domainmodel.domainmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainmodelFactoryImpl extends EFactoryImpl implements DomainmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainmodelFactory init()
  {
    try
    {
      DomainmodelFactory theDomainmodelFactory = (DomainmodelFactory)EPackage.Registry.INSTANCE.getEFactory(DomainmodelPackage.eNS_URI);
      if (theDomainmodelFactory != null)
      {
        return theDomainmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DomainmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DomainmodelPackage.DOMAINMODEL: return createDomainmodel();
      case DomainmodelPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DomainmodelPackage.TYPE: return createType();
      case DomainmodelPackage.IMPORT: return createImport();
      case DomainmodelPackage.DATA_TYPE: return createDataType();
      case DomainmodelPackage.NAMESPACE_DECLARATION: return createNamespaceDeclaration();
      case DomainmodelPackage.ABSTRACT_NAMESPACE_ELEMENT: return createAbstractNamespaceElement();
      case DomainmodelPackage.FEATURE: return createFeature();
      case DomainmodelPackage.DOMAIN_ENTITY: return createDomainEntity();
      case DomainmodelPackage.METHOD_PARAMETER: return createMethodParameter();
      case DomainmodelPackage.METHOD_PARAMETERS: return createMethodParameters();
      case DomainmodelPackage.METHOD_CALL: return createMethodCall();
      case DomainmodelPackage.INTERFACE_OPERATION: return createInterfaceOperation();
      case DomainmodelPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
      case DomainmodelPackage.INTERFACE_OPERATION_USAGE_RULE: return createInterfaceOperationUsageRule();
      case DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE: return createInterfaceOperationsUsageRule();
      case DomainmodelPackage.STATELESS_COMPONENT: return createStatelessComponent();
      case DomainmodelPackage.DOMAIN_REPOSITORY: return createDomainRepository();
      case DomainmodelPackage.ENTRY_PARAMETERS_MODULE: return createEntryParametersModule();
      case DomainmodelPackage.MODEL_FEATURE: return createModelFeature();
      case DomainmodelPackage.MODEL_MODULE: return createModelModule();
      case DomainmodelPackage.ELEMENT_FEATURE: return createElementFeature();
      case DomainmodelPackage.CONTENT_ELEMENT: return createContentElement();
      case DomainmodelPackage.CONTAINER_ELEMENT: return createContainerElement();
      case DomainmodelPackage.VIEW_ELEMENT: return createViewElement();
      case DomainmodelPackage.VIEW_MODULE: return createViewModule();
      case DomainmodelPackage.VALIDATE_ACTION: return createValidateAction();
      case DomainmodelPackage.ATTACH_ACTION: return createAttachAction();
      case DomainmodelPackage.BIND_ENUM_SOURCE: return createBindEnumSource();
      case DomainmodelPackage.BIND_SOURCE: return createBindSource();
      case DomainmodelPackage.BIND_ACTION: return createBindAction();
      case DomainmodelPackage.INIT_ACTION_FEATURE: return createInitActionFeature();
      case DomainmodelPackage.INIT_ACTION_MODULE: return createInitActionModule();
      case DomainmodelPackage.VALIDATOR_RULE: return createValidatorRule();
      case DomainmodelPackage.VALIDATOR_RULES: return createValidatorRules();
      case DomainmodelPackage.VALIDATOR_FEATURE: return createValidatorFeature();
      case DomainmodelPackage.VALIDATOR_MODULE: return createValidatorModule();
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER: return createScreenModelParameter();
      case DomainmodelPackage.SCREEN_MODEL_PARAMETERS: return createScreenModelParameters();
      case DomainmodelPackage.NAVIGATE_TO_ACTION: return createNavigateToAction();
      case DomainmodelPackage.EXECUTE_ACTION: return createExecuteAction();
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_URL_PARAMETER: return createSetRestCallReceiverURLParameter();
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER: return createSetRestCallReceiverReturnTypeParameter();
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_ID_PARAMETER: return createSetRestCallReceiverIDParameter();
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_PARAMETER: return createSetRestCallReceiverParameter();
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_PARAMETERS: return createSetRestCallReceiverParameters();
      case DomainmodelPackage.SET_REST_CALL_RECEIVER: return createSetRestCallReceiver();
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER: return createSetUIElementReceiver();
      case DomainmodelPackage.SET_ACTION_RECEIVER: return createSetActionReceiver();
      case DomainmodelPackage.SET_ACTION: return createSetAction();
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER: return createInterfaceMethodCallParameter();
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETERS: return createInterfaceMethodCallParameters();
      case DomainmodelPackage.INTERFACE_METHOD_CALL: return createInterfaceMethodCall();
      case DomainmodelPackage.UI_ACTION_FEATURE: return createUIActionFeature();
      case DomainmodelPackage.UI_ACTION_MODULE: return createUIActionModule();
      case DomainmodelPackage.CONTROLLER_ELEMENT: return createControllerElement();
      case DomainmodelPackage.CONTROLLER_MODULE: return createControllerModule();
      case DomainmodelPackage.SCREEN_MODULE: return createScreenModule();
      case DomainmodelPackage.SCREEN_FEATURE: return createScreenFeature();
      case DomainmodelPackage.MAIN_FEATURE_OPTION: return createMainFeatureOption();
      case DomainmodelPackage.MAIN_FEATURE: return createMainFeature();
      case DomainmodelPackage.UI_FEATURE: return createUIFeature();
      case DomainmodelPackage.UI_MODULE: return createUIModule();
      case DomainmodelPackage.BUSINESS_FEATURE_TYPE: return createBusinessFeatureType();
      case DomainmodelPackage.BUSINESS_FEATURE: return createBusinessFeature();
      case DomainmodelPackage.BUSINESS_FEATURES: return createBusinessFeatures();
      case DomainmodelPackage.BUSINESS_MODULE: return createBusinessModule();
      case DomainmodelPackage.SYSTEM_MODULE: return createSystemModule();
      case DomainmodelPackage.SYSTEM_DEFINITION: return createSystemDefinition();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainmodelPackage.CONTENT_ELEMENT_LITERAL:
        return createContentElementLiteralFromString(eDataType, initialValue);
      case DomainmodelPackage.PROPERTY_NAME_LITERAL:
        return createPropertyNameLiteralFromString(eDataType, initialValue);
      case DomainmodelPackage.CONTAINER_ELEMENT_LITERAL:
        return createContainerElementLiteralFromString(eDataType, initialValue);
      case DomainmodelPackage.UI_ELEMENT_RECEIVER_KEY:
        return createUIElementReceiverKeyFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainmodelPackage.CONTENT_ELEMENT_LITERAL:
        return convertContentElementLiteralToString(eDataType, instanceValue);
      case DomainmodelPackage.PROPERTY_NAME_LITERAL:
        return convertPropertyNameLiteralToString(eDataType, instanceValue);
      case DomainmodelPackage.CONTAINER_ELEMENT_LITERAL:
        return convertContainerElementLiteralToString(eDataType, instanceValue);
      case DomainmodelPackage.UI_ELEMENT_RECEIVER_KEY:
        return convertUIElementReceiverKeyToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDeclaration createNamespaceDeclaration()
  {
    NamespaceDeclarationImpl namespaceDeclaration = new NamespaceDeclarationImpl();
    return namespaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractNamespaceElement createAbstractNamespaceElement()
  {
    AbstractNamespaceElementImpl abstractNamespaceElement = new AbstractNamespaceElementImpl();
    return abstractNamespaceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainEntity createDomainEntity()
  {
    DomainEntityImpl domainEntity = new DomainEntityImpl();
    return domainEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodParameter createMethodParameter()
  {
    MethodParameterImpl methodParameter = new MethodParameterImpl();
    return methodParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodParameters createMethodParameters()
  {
    MethodParametersImpl methodParameters = new MethodParametersImpl();
    return methodParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall createMethodCall()
  {
    MethodCallImpl methodCall = new MethodCallImpl();
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceOperation createInterfaceOperation()
  {
    InterfaceOperationImpl interfaceOperation = new InterfaceOperationImpl();
    return interfaceOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclaration createInterfaceDeclaration()
  {
    InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
    return interfaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceOperationUsageRule createInterfaceOperationUsageRule()
  {
    InterfaceOperationUsageRuleImpl interfaceOperationUsageRule = new InterfaceOperationUsageRuleImpl();
    return interfaceOperationUsageRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceOperationsUsageRule createInterfaceOperationsUsageRule()
  {
    InterfaceOperationsUsageRuleImpl interfaceOperationsUsageRule = new InterfaceOperationsUsageRuleImpl();
    return interfaceOperationsUsageRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatelessComponent createStatelessComponent()
  {
    StatelessComponentImpl statelessComponent = new StatelessComponentImpl();
    return statelessComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainRepository createDomainRepository()
  {
    DomainRepositoryImpl domainRepository = new DomainRepositoryImpl();
    return domainRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryParametersModule createEntryParametersModule()
  {
    EntryParametersModuleImpl entryParametersModule = new EntryParametersModuleImpl();
    return entryParametersModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFeature createModelFeature()
  {
    ModelFeatureImpl modelFeature = new ModelFeatureImpl();
    return modelFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelModule createModelModule()
  {
    ModelModuleImpl modelModule = new ModelModuleImpl();
    return modelModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementFeature createElementFeature()
  {
    ElementFeatureImpl elementFeature = new ElementFeatureImpl();
    return elementFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentElement createContentElement()
  {
    ContentElementImpl contentElement = new ContentElementImpl();
    return contentElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerElement createContainerElement()
  {
    ContainerElementImpl containerElement = new ContainerElementImpl();
    return containerElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewElement createViewElement()
  {
    ViewElementImpl viewElement = new ViewElementImpl();
    return viewElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewModule createViewModule()
  {
    ViewModuleImpl viewModule = new ViewModuleImpl();
    return viewModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidateAction createValidateAction()
  {
    ValidateActionImpl validateAction = new ValidateActionImpl();
    return validateAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttachAction createAttachAction()
  {
    AttachActionImpl attachAction = new AttachActionImpl();
    return attachAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindEnumSource createBindEnumSource()
  {
    BindEnumSourceImpl bindEnumSource = new BindEnumSourceImpl();
    return bindEnumSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindSource createBindSource()
  {
    BindSourceImpl bindSource = new BindSourceImpl();
    return bindSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindAction createBindAction()
  {
    BindActionImpl bindAction = new BindActionImpl();
    return bindAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitActionFeature createInitActionFeature()
  {
    InitActionFeatureImpl initActionFeature = new InitActionFeatureImpl();
    return initActionFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitActionModule createInitActionModule()
  {
    InitActionModuleImpl initActionModule = new InitActionModuleImpl();
    return initActionModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorRule createValidatorRule()
  {
    ValidatorRuleImpl validatorRule = new ValidatorRuleImpl();
    return validatorRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorRules createValidatorRules()
  {
    ValidatorRulesImpl validatorRules = new ValidatorRulesImpl();
    return validatorRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorFeature createValidatorFeature()
  {
    ValidatorFeatureImpl validatorFeature = new ValidatorFeatureImpl();
    return validatorFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorModule createValidatorModule()
  {
    ValidatorModuleImpl validatorModule = new ValidatorModuleImpl();
    return validatorModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenModelParameter createScreenModelParameter()
  {
    ScreenModelParameterImpl screenModelParameter = new ScreenModelParameterImpl();
    return screenModelParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenModelParameters createScreenModelParameters()
  {
    ScreenModelParametersImpl screenModelParameters = new ScreenModelParametersImpl();
    return screenModelParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigateToAction createNavigateToAction()
  {
    NavigateToActionImpl navigateToAction = new NavigateToActionImpl();
    return navigateToAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecuteAction createExecuteAction()
  {
    ExecuteActionImpl executeAction = new ExecuteActionImpl();
    return executeAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRestCallReceiverURLParameter createSetRestCallReceiverURLParameter()
  {
    SetRestCallReceiverURLParameterImpl setRestCallReceiverURLParameter = new SetRestCallReceiverURLParameterImpl();
    return setRestCallReceiverURLParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRestCallReceiverReturnTypeParameter createSetRestCallReceiverReturnTypeParameter()
  {
    SetRestCallReceiverReturnTypeParameterImpl setRestCallReceiverReturnTypeParameter = new SetRestCallReceiverReturnTypeParameterImpl();
    return setRestCallReceiverReturnTypeParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRestCallReceiverIDParameter createSetRestCallReceiverIDParameter()
  {
    SetRestCallReceiverIDParameterImpl setRestCallReceiverIDParameter = new SetRestCallReceiverIDParameterImpl();
    return setRestCallReceiverIDParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRestCallReceiverParameter createSetRestCallReceiverParameter()
  {
    SetRestCallReceiverParameterImpl setRestCallReceiverParameter = new SetRestCallReceiverParameterImpl();
    return setRestCallReceiverParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRestCallReceiverParameters createSetRestCallReceiverParameters()
  {
    SetRestCallReceiverParametersImpl setRestCallReceiverParameters = new SetRestCallReceiverParametersImpl();
    return setRestCallReceiverParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRestCallReceiver createSetRestCallReceiver()
  {
    SetRestCallReceiverImpl setRestCallReceiver = new SetRestCallReceiverImpl();
    return setRestCallReceiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetUIElementReceiver createSetUIElementReceiver()
  {
    SetUIElementReceiverImpl setUIElementReceiver = new SetUIElementReceiverImpl();
    return setUIElementReceiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetActionReceiver createSetActionReceiver()
  {
    SetActionReceiverImpl setActionReceiver = new SetActionReceiverImpl();
    return setActionReceiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetAction createSetAction()
  {
    SetActionImpl setAction = new SetActionImpl();
    return setAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMethodCallParameter createInterfaceMethodCallParameter()
  {
    InterfaceMethodCallParameterImpl interfaceMethodCallParameter = new InterfaceMethodCallParameterImpl();
    return interfaceMethodCallParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMethodCallParameters createInterfaceMethodCallParameters()
  {
    InterfaceMethodCallParametersImpl interfaceMethodCallParameters = new InterfaceMethodCallParametersImpl();
    return interfaceMethodCallParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceMethodCall createInterfaceMethodCall()
  {
    InterfaceMethodCallImpl interfaceMethodCall = new InterfaceMethodCallImpl();
    return interfaceMethodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIActionFeature createUIActionFeature()
  {
    UIActionFeatureImpl uiActionFeature = new UIActionFeatureImpl();
    return uiActionFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIActionModule createUIActionModule()
  {
    UIActionModuleImpl uiActionModule = new UIActionModuleImpl();
    return uiActionModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControllerElement createControllerElement()
  {
    ControllerElementImpl controllerElement = new ControllerElementImpl();
    return controllerElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControllerModule createControllerModule()
  {
    ControllerModuleImpl controllerModule = new ControllerModuleImpl();
    return controllerModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenModule createScreenModule()
  {
    ScreenModuleImpl screenModule = new ScreenModuleImpl();
    return screenModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenFeature createScreenFeature()
  {
    ScreenFeatureImpl screenFeature = new ScreenFeatureImpl();
    return screenFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainFeatureOption createMainFeatureOption()
  {
    MainFeatureOptionImpl mainFeatureOption = new MainFeatureOptionImpl();
    return mainFeatureOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainFeature createMainFeature()
  {
    MainFeatureImpl mainFeature = new MainFeatureImpl();
    return mainFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIFeature createUIFeature()
  {
    UIFeatureImpl uiFeature = new UIFeatureImpl();
    return uiFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIModule createUIModule()
  {
    UIModuleImpl uiModule = new UIModuleImpl();
    return uiModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeatureType createBusinessFeatureType()
  {
    BusinessFeatureTypeImpl businessFeatureType = new BusinessFeatureTypeImpl();
    return businessFeatureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeature createBusinessFeature()
  {
    BusinessFeatureImpl businessFeature = new BusinessFeatureImpl();
    return businessFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeatures createBusinessFeatures()
  {
    BusinessFeaturesImpl businessFeatures = new BusinessFeaturesImpl();
    return businessFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessModule createBusinessModule()
  {
    BusinessModuleImpl businessModule = new BusinessModuleImpl();
    return businessModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemModule createSystemModule()
  {
    SystemModuleImpl systemModule = new SystemModuleImpl();
    return systemModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDefinition createSystemDefinition()
  {
    SystemDefinitionImpl systemDefinition = new SystemDefinitionImpl();
    return systemDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentElementLiteral createContentElementLiteralFromString(EDataType eDataType, String initialValue)
  {
    ContentElementLiteral result = ContentElementLiteral.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertContentElementLiteralToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyNameLiteral createPropertyNameLiteralFromString(EDataType eDataType, String initialValue)
  {
    PropertyNameLiteral result = PropertyNameLiteral.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPropertyNameLiteralToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerElementLiteral createContainerElementLiteralFromString(EDataType eDataType, String initialValue)
  {
    ContainerElementLiteral result = ContainerElementLiteral.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertContainerElementLiteralToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIElementReceiverKey createUIElementReceiverKeyFromString(EDataType eDataType, String initialValue)
  {
    UIElementReceiverKey result = UIElementReceiverKey.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUIElementReceiverKeyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelPackage getDomainmodelPackage()
  {
    return (DomainmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DomainmodelPackage getPackage()
  {
    return DomainmodelPackage.eINSTANCE;
  }

} //DomainmodelFactoryImpl
