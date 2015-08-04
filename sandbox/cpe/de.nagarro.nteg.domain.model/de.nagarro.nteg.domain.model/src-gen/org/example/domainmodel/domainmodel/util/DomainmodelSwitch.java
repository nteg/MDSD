/**
 */
package org.example.domainmodel.domainmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.example.domainmodel.domainmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage
 * @generated
 */
public class DomainmodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainmodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DomainmodelPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseAbstractNamespaceElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseType(dataType);
        if (result == null) result = caseAbstractNamespaceElement(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.NAMESPACE_DECLARATION:
      {
        NamespaceDeclaration namespaceDeclaration = (NamespaceDeclaration)theEObject;
        T result = caseNamespaceDeclaration(namespaceDeclaration);
        if (result == null) result = caseAbstractElement(namespaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ABSTRACT_NAMESPACE_ELEMENT:
      {
        AbstractNamespaceElement abstractNamespaceElement = (AbstractNamespaceElement)theEObject;
        T result = caseAbstractNamespaceElement(abstractNamespaceElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.DOMAIN_ENTITY:
      {
        DomainEntity domainEntity = (DomainEntity)theEObject;
        T result = caseDomainEntity(domainEntity);
        if (result == null) result = caseType(domainEntity);
        if (result == null) result = caseAbstractNamespaceElement(domainEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.METHOD_PARAMETER:
      {
        MethodParameter methodParameter = (MethodParameter)theEObject;
        T result = caseMethodParameter(methodParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.METHOD_PARAMETERS:
      {
        MethodParameters methodParameters = (MethodParameters)theEObject;
        T result = caseMethodParameters(methodParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.METHOD_CALL:
      {
        MethodCall methodCall = (MethodCall)theEObject;
        T result = caseMethodCall(methodCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INTERFACE_OPERATION:
      {
        InterfaceOperation interfaceOperation = (InterfaceOperation)theEObject;
        T result = caseInterfaceOperation(interfaceOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INTERFACE_DECLARATION:
      {
        InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
        T result = caseInterfaceDeclaration(interfaceDeclaration);
        if (result == null) result = caseAbstractNamespaceElement(interfaceDeclaration);
        if (result == null) result = caseBusinessFeatureType(interfaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INTERFACE_OPERATION_USAGE_RULE:
      {
        InterfaceOperationUsageRule interfaceOperationUsageRule = (InterfaceOperationUsageRule)theEObject;
        T result = caseInterfaceOperationUsageRule(interfaceOperationUsageRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE:
      {
        InterfaceOperationsUsageRule interfaceOperationsUsageRule = (InterfaceOperationsUsageRule)theEObject;
        T result = caseInterfaceOperationsUsageRule(interfaceOperationsUsageRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.STATELESS_COMPONENT:
      {
        StatelessComponent statelessComponent = (StatelessComponent)theEObject;
        T result = caseStatelessComponent(statelessComponent);
        if (result == null) result = caseAbstractNamespaceElement(statelessComponent);
        if (result == null) result = caseBusinessFeatureType(statelessComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.DOMAIN_REPOSITORY:
      {
        DomainRepository domainRepository = (DomainRepository)theEObject;
        T result = caseDomainRepository(domainRepository);
        if (result == null) result = caseAbstractNamespaceElement(domainRepository);
        if (result == null) result = caseBusinessFeatureType(domainRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ENTRY_PARAMETERS_MODULE:
      {
        EntryParametersModule entryParametersModule = (EntryParametersModule)theEObject;
        T result = caseEntryParametersModule(entryParametersModule);
        if (result == null) result = caseScreenModule(entryParametersModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MODEL_FEATURE:
      {
        ModelFeature modelFeature = (ModelFeature)theEObject;
        T result = caseModelFeature(modelFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MODEL_MODULE:
      {
        ModelModule modelModule = (ModelModule)theEObject;
        T result = caseModelModule(modelModule);
        if (result == null) result = caseScreenModule(modelModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ELEMENT_FEATURE:
      {
        ElementFeature elementFeature = (ElementFeature)theEObject;
        T result = caseElementFeature(elementFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.CONTENT_ELEMENT:
      {
        ContentElement contentElement = (ContentElement)theEObject;
        T result = caseContentElement(contentElement);
        if (result == null) result = caseViewElement(contentElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.CONTAINER_ELEMENT:
      {
        ContainerElement containerElement = (ContainerElement)theEObject;
        T result = caseContainerElement(containerElement);
        if (result == null) result = caseViewElement(containerElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VIEW_ELEMENT:
      {
        ViewElement viewElement = (ViewElement)theEObject;
        T result = caseViewElement(viewElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VIEW_MODULE:
      {
        ViewModule viewModule = (ViewModule)theEObject;
        T result = caseViewModule(viewModule);
        if (result == null) result = caseScreenModule(viewModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VALIDATE_ACTION:
      {
        ValidateAction validateAction = (ValidateAction)theEObject;
        T result = caseValidateAction(validateAction);
        if (result == null) result = caseInitActionFeature(validateAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ATTACH_ACTION:
      {
        AttachAction attachAction = (AttachAction)theEObject;
        T result = caseAttachAction(attachAction);
        if (result == null) result = caseInitActionFeature(attachAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BIND_ENUM_SOURCE:
      {
        BindEnumSource bindEnumSource = (BindEnumSource)theEObject;
        T result = caseBindEnumSource(bindEnumSource);
        if (result == null) result = caseBindSource(bindEnumSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BIND_SOURCE:
      {
        BindSource bindSource = (BindSource)theEObject;
        T result = caseBindSource(bindSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BIND_ACTION:
      {
        BindAction bindAction = (BindAction)theEObject;
        T result = caseBindAction(bindAction);
        if (result == null) result = caseInitActionFeature(bindAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INIT_ACTION_FEATURE:
      {
        InitActionFeature initActionFeature = (InitActionFeature)theEObject;
        T result = caseInitActionFeature(initActionFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INIT_ACTION_MODULE:
      {
        InitActionModule initActionModule = (InitActionModule)theEObject;
        T result = caseInitActionModule(initActionModule);
        if (result == null) result = caseControllerElement(initActionModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VALIDATOR_RULE:
      {
        ValidatorRule validatorRule = (ValidatorRule)theEObject;
        T result = caseValidatorRule(validatorRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VALIDATOR_RULES:
      {
        ValidatorRules validatorRules = (ValidatorRules)theEObject;
        T result = caseValidatorRules(validatorRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VALIDATOR_FEATURE:
      {
        ValidatorFeature validatorFeature = (ValidatorFeature)theEObject;
        T result = caseValidatorFeature(validatorFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VALIDATOR_MODULE:
      {
        ValidatorModule validatorModule = (ValidatorModule)theEObject;
        T result = caseValidatorModule(validatorModule);
        if (result == null) result = caseControllerElement(validatorModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER:
      {
        ScreenModelParameter screenModelParameter = (ScreenModelParameter)theEObject;
        T result = caseScreenModelParameter(screenModelParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SCREEN_MODEL_PARAMETERS:
      {
        ScreenModelParameters screenModelParameters = (ScreenModelParameters)theEObject;
        T result = caseScreenModelParameters(screenModelParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.NAVIGATE_TO_ACTION:
      {
        NavigateToAction navigateToAction = (NavigateToAction)theEObject;
        T result = caseNavigateToAction(navigateToAction);
        if (result == null) result = caseUIActionFeature(navigateToAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.EXECUTE_ACTION:
      {
        ExecuteAction executeAction = (ExecuteAction)theEObject;
        T result = caseExecuteAction(executeAction);
        if (result == null) result = caseUIActionFeature(executeAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_URL_PARAMETER:
      {
        SetRestCallReceiverURLParameter setRestCallReceiverURLParameter = (SetRestCallReceiverURLParameter)theEObject;
        T result = caseSetRestCallReceiverURLParameter(setRestCallReceiverURLParameter);
        if (result == null) result = caseSetRestCallReceiverParameter(setRestCallReceiverURLParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER:
      {
        SetRestCallReceiverReturnTypeParameter setRestCallReceiverReturnTypeParameter = (SetRestCallReceiverReturnTypeParameter)theEObject;
        T result = caseSetRestCallReceiverReturnTypeParameter(setRestCallReceiverReturnTypeParameter);
        if (result == null) result = caseSetRestCallReceiverParameter(setRestCallReceiverReturnTypeParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_ID_PARAMETER:
      {
        SetRestCallReceiverIDParameter setRestCallReceiverIDParameter = (SetRestCallReceiverIDParameter)theEObject;
        T result = caseSetRestCallReceiverIDParameter(setRestCallReceiverIDParameter);
        if (result == null) result = caseSetRestCallReceiverParameter(setRestCallReceiverIDParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_PARAMETER:
      {
        SetRestCallReceiverParameter setRestCallReceiverParameter = (SetRestCallReceiverParameter)theEObject;
        T result = caseSetRestCallReceiverParameter(setRestCallReceiverParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_REST_CALL_RECEIVER_PARAMETERS:
      {
        SetRestCallReceiverParameters setRestCallReceiverParameters = (SetRestCallReceiverParameters)theEObject;
        T result = caseSetRestCallReceiverParameters(setRestCallReceiverParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_REST_CALL_RECEIVER:
      {
        SetRestCallReceiver setRestCallReceiver = (SetRestCallReceiver)theEObject;
        T result = caseSetRestCallReceiver(setRestCallReceiver);
        if (result == null) result = caseSetActionReceiver(setRestCallReceiver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER:
      {
        SetUIElementReceiver setUIElementReceiver = (SetUIElementReceiver)theEObject;
        T result = caseSetUIElementReceiver(setUIElementReceiver);
        if (result == null) result = caseSetActionReceiver(setUIElementReceiver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_ACTION_RECEIVER:
      {
        SetActionReceiver setActionReceiver = (SetActionReceiver)theEObject;
        T result = caseSetActionReceiver(setActionReceiver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SET_ACTION:
      {
        SetAction setAction = (SetAction)theEObject;
        T result = caseSetAction(setAction);
        if (result == null) result = caseInitActionFeature(setAction);
        if (result == null) result = caseUIActionFeature(setAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER:
      {
        InterfaceMethodCallParameter interfaceMethodCallParameter = (InterfaceMethodCallParameter)theEObject;
        T result = caseInterfaceMethodCallParameter(interfaceMethodCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETERS:
      {
        InterfaceMethodCallParameters interfaceMethodCallParameters = (InterfaceMethodCallParameters)theEObject;
        T result = caseInterfaceMethodCallParameters(interfaceMethodCallParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INTERFACE_METHOD_CALL:
      {
        InterfaceMethodCall interfaceMethodCall = (InterfaceMethodCall)theEObject;
        T result = caseInterfaceMethodCall(interfaceMethodCall);
        if (result == null) result = caseUIActionFeature(interfaceMethodCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.UI_ACTION_FEATURE:
      {
        UIActionFeature uiActionFeature = (UIActionFeature)theEObject;
        T result = caseUIActionFeature(uiActionFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.UI_ACTION_MODULE:
      {
        UIActionModule uiActionModule = (UIActionModule)theEObject;
        T result = caseUIActionModule(uiActionModule);
        if (result == null) result = caseControllerElement(uiActionModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.CONTROLLER_ELEMENT:
      {
        ControllerElement controllerElement = (ControllerElement)theEObject;
        T result = caseControllerElement(controllerElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.CONTROLLER_MODULE:
      {
        ControllerModule controllerModule = (ControllerModule)theEObject;
        T result = caseControllerModule(controllerModule);
        if (result == null) result = caseScreenModule(controllerModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SCREEN_MODULE:
      {
        ScreenModule screenModule = (ScreenModule)theEObject;
        T result = caseScreenModule(screenModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SCREEN_FEATURE:
      {
        ScreenFeature screenFeature = (ScreenFeature)theEObject;
        T result = caseScreenFeature(screenFeature);
        if (result == null) result = caseUIFeature(screenFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MAIN_FEATURE_OPTION:
      {
        MainFeatureOption mainFeatureOption = (MainFeatureOption)theEObject;
        T result = caseMainFeatureOption(mainFeatureOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MAIN_FEATURE:
      {
        MainFeature mainFeature = (MainFeature)theEObject;
        T result = caseMainFeature(mainFeature);
        if (result == null) result = caseUIFeature(mainFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.UI_FEATURE:
      {
        UIFeature uiFeature = (UIFeature)theEObject;
        T result = caseUIFeature(uiFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.UI_MODULE:
      {
        UIModule uiModule = (UIModule)theEObject;
        T result = caseUIModule(uiModule);
        if (result == null) result = caseSystemModule(uiModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BUSINESS_FEATURE_TYPE:
      {
        BusinessFeatureType businessFeatureType = (BusinessFeatureType)theEObject;
        T result = caseBusinessFeatureType(businessFeatureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BUSINESS_FEATURE:
      {
        BusinessFeature businessFeature = (BusinessFeature)theEObject;
        T result = caseBusinessFeature(businessFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BUSINESS_FEATURES:
      {
        BusinessFeatures businessFeatures = (BusinessFeatures)theEObject;
        T result = caseBusinessFeatures(businessFeatures);
        if (result == null) result = caseBusinessModule(businessFeatures);
        if (result == null) result = caseSystemModule(businessFeatures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BUSINESS_MODULE:
      {
        BusinessModule businessModule = (BusinessModule)theEObject;
        T result = caseBusinessModule(businessModule);
        if (result == null) result = caseSystemModule(businessModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SYSTEM_MODULE:
      {
        SystemModule systemModule = (SystemModule)theEObject;
        T result = caseSystemModule(systemModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SYSTEM_DEFINITION:
      {
        SystemDefinition systemDefinition = (SystemDefinition)theEObject;
        T result = caseSystemDefinition(systemDefinition);
        if (result == null) result = caseAbstractElement(systemDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceDeclaration(NamespaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Namespace Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Namespace Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractNamespaceElement(AbstractNamespaceElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainEntity(DomainEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodParameter(MethodParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodParameters(MethodParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodCall(MethodCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceOperation(InterfaceOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceDeclaration(InterfaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Operation Usage Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Operation Usage Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceOperationUsageRule(InterfaceOperationUsageRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Operations Usage Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Operations Usage Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceOperationsUsageRule(InterfaceOperationsUsageRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stateless Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stateless Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatelessComponent(StatelessComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainRepository(DomainRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Parameters Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Parameters Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryParametersModule(EntryParametersModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelFeature(ModelFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelModule(ModelModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementFeature(ElementFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentElement(ContentElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerElement(ContainerElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewElement(ViewElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewModule(ViewModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validate Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validate Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidateAction(ValidateAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attach Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attach Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttachAction(AttachAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bind Enum Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Enum Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindEnumSource(BindEnumSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bind Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindSource(BindSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bind Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindAction(BindAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Action Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Action Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitActionFeature(InitActionFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Action Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Action Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitActionModule(InitActionModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validator Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validator Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidatorRule(ValidatorRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validator Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validator Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidatorRules(ValidatorRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validator Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validator Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidatorFeature(ValidatorFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validator Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validator Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidatorModule(ValidatorModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Model Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Model Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenModelParameter(ScreenModelParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Model Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Model Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenModelParameters(ScreenModelParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigate To Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigate To Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigateToAction(NavigateToAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execute Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execute Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecuteAction(ExecuteAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Rest Call Receiver URL Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Rest Call Receiver URL Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetRestCallReceiverURLParameter(SetRestCallReceiverURLParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Rest Call Receiver Return Type Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Rest Call Receiver Return Type Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetRestCallReceiverReturnTypeParameter(SetRestCallReceiverReturnTypeParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Rest Call Receiver ID Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Rest Call Receiver ID Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetRestCallReceiverIDParameter(SetRestCallReceiverIDParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Rest Call Receiver Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Rest Call Receiver Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetRestCallReceiverParameter(SetRestCallReceiverParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Rest Call Receiver Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Rest Call Receiver Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetRestCallReceiverParameters(SetRestCallReceiverParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Rest Call Receiver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Rest Call Receiver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetRestCallReceiver(SetRestCallReceiver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set UI Element Receiver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set UI Element Receiver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetUIElementReceiver(SetUIElementReceiver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Action Receiver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Action Receiver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetActionReceiver(SetActionReceiver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetAction(SetAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Method Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Method Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceMethodCallParameter(InterfaceMethodCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Method Call Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Method Call Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceMethodCallParameters(InterfaceMethodCallParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Method Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Method Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceMethodCall(InterfaceMethodCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Action Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Action Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIActionFeature(UIActionFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Action Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Action Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIActionModule(UIActionModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControllerElement(ControllerElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControllerModule(ControllerModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenModule(ScreenModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenFeature(ScreenFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Feature Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Feature Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainFeatureOption(MainFeatureOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainFeature(MainFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIFeature(UIFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIModule(UIModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Feature Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Feature Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessFeatureType(BusinessFeatureType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessFeature(BusinessFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Features</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Features</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessFeatures(BusinessFeatures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessModule(BusinessModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemModule(SystemModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemDefinition(SystemDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DomainmodelSwitch
