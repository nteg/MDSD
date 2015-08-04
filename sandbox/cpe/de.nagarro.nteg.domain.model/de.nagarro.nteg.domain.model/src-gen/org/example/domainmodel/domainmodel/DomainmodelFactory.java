/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage
 * @generated
 */
public interface DomainmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelFactory eINSTANCE = org.example.domainmodel.domainmodel.impl.DomainmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Declaration</em>'.
   * @generated
   */
  NamespaceDeclaration createNamespaceDeclaration();

  /**
   * Returns a new object of class '<em>Abstract Namespace Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Namespace Element</em>'.
   * @generated
   */
  AbstractNamespaceElement createAbstractNamespaceElement();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Domain Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Entity</em>'.
   * @generated
   */
  DomainEntity createDomainEntity();

  /**
   * Returns a new object of class '<em>Method Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Parameter</em>'.
   * @generated
   */
  MethodParameter createMethodParameter();

  /**
   * Returns a new object of class '<em>Method Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Parameters</em>'.
   * @generated
   */
  MethodParameters createMethodParameters();

  /**
   * Returns a new object of class '<em>Method Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Call</em>'.
   * @generated
   */
  MethodCall createMethodCall();

  /**
   * Returns a new object of class '<em>Interface Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Operation</em>'.
   * @generated
   */
  InterfaceOperation createInterfaceOperation();

  /**
   * Returns a new object of class '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Declaration</em>'.
   * @generated
   */
  InterfaceDeclaration createInterfaceDeclaration();

  /**
   * Returns a new object of class '<em>Interface Operation Usage Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Operation Usage Rule</em>'.
   * @generated
   */
  InterfaceOperationUsageRule createInterfaceOperationUsageRule();

  /**
   * Returns a new object of class '<em>Interface Operations Usage Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Operations Usage Rule</em>'.
   * @generated
   */
  InterfaceOperationsUsageRule createInterfaceOperationsUsageRule();

  /**
   * Returns a new object of class '<em>Stateless Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stateless Component</em>'.
   * @generated
   */
  StatelessComponent createStatelessComponent();

  /**
   * Returns a new object of class '<em>Domain Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Repository</em>'.
   * @generated
   */
  DomainRepository createDomainRepository();

  /**
   * Returns a new object of class '<em>Entry Parameters Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Parameters Module</em>'.
   * @generated
   */
  EntryParametersModule createEntryParametersModule();

  /**
   * Returns a new object of class '<em>Model Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Feature</em>'.
   * @generated
   */
  ModelFeature createModelFeature();

  /**
   * Returns a new object of class '<em>Model Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Module</em>'.
   * @generated
   */
  ModelModule createModelModule();

  /**
   * Returns a new object of class '<em>Element Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Feature</em>'.
   * @generated
   */
  ElementFeature createElementFeature();

  /**
   * Returns a new object of class '<em>Content Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Element</em>'.
   * @generated
   */
  ContentElement createContentElement();

  /**
   * Returns a new object of class '<em>Container Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Element</em>'.
   * @generated
   */
  ContainerElement createContainerElement();

  /**
   * Returns a new object of class '<em>View Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Element</em>'.
   * @generated
   */
  ViewElement createViewElement();

  /**
   * Returns a new object of class '<em>View Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Module</em>'.
   * @generated
   */
  ViewModule createViewModule();

  /**
   * Returns a new object of class '<em>Validate Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validate Action</em>'.
   * @generated
   */
  ValidateAction createValidateAction();

  /**
   * Returns a new object of class '<em>Attach Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attach Action</em>'.
   * @generated
   */
  AttachAction createAttachAction();

  /**
   * Returns a new object of class '<em>Bind Enum Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bind Enum Source</em>'.
   * @generated
   */
  BindEnumSource createBindEnumSource();

  /**
   * Returns a new object of class '<em>Bind Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bind Source</em>'.
   * @generated
   */
  BindSource createBindSource();

  /**
   * Returns a new object of class '<em>Bind Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bind Action</em>'.
   * @generated
   */
  BindAction createBindAction();

  /**
   * Returns a new object of class '<em>Init Action Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Action Feature</em>'.
   * @generated
   */
  InitActionFeature createInitActionFeature();

  /**
   * Returns a new object of class '<em>Init Action Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Action Module</em>'.
   * @generated
   */
  InitActionModule createInitActionModule();

  /**
   * Returns a new object of class '<em>Validator Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validator Rule</em>'.
   * @generated
   */
  ValidatorRule createValidatorRule();

  /**
   * Returns a new object of class '<em>Validator Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validator Rules</em>'.
   * @generated
   */
  ValidatorRules createValidatorRules();

  /**
   * Returns a new object of class '<em>Validator Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validator Feature</em>'.
   * @generated
   */
  ValidatorFeature createValidatorFeature();

  /**
   * Returns a new object of class '<em>Validator Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validator Module</em>'.
   * @generated
   */
  ValidatorModule createValidatorModule();

  /**
   * Returns a new object of class '<em>Screen Model Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen Model Parameter</em>'.
   * @generated
   */
  ScreenModelParameter createScreenModelParameter();

  /**
   * Returns a new object of class '<em>Screen Model Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen Model Parameters</em>'.
   * @generated
   */
  ScreenModelParameters createScreenModelParameters();

  /**
   * Returns a new object of class '<em>Navigate To Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigate To Action</em>'.
   * @generated
   */
  NavigateToAction createNavigateToAction();

  /**
   * Returns a new object of class '<em>Execute Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execute Action</em>'.
   * @generated
   */
  ExecuteAction createExecuteAction();

  /**
   * Returns a new object of class '<em>Set Rest Call Receiver URL Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Rest Call Receiver URL Parameter</em>'.
   * @generated
   */
  SetRestCallReceiverURLParameter createSetRestCallReceiverURLParameter();

  /**
   * Returns a new object of class '<em>Set Rest Call Receiver Return Type Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Rest Call Receiver Return Type Parameter</em>'.
   * @generated
   */
  SetRestCallReceiverReturnTypeParameter createSetRestCallReceiverReturnTypeParameter();

  /**
   * Returns a new object of class '<em>Set Rest Call Receiver ID Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Rest Call Receiver ID Parameter</em>'.
   * @generated
   */
  SetRestCallReceiverIDParameter createSetRestCallReceiverIDParameter();

  /**
   * Returns a new object of class '<em>Set Rest Call Receiver Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Rest Call Receiver Parameter</em>'.
   * @generated
   */
  SetRestCallReceiverParameter createSetRestCallReceiverParameter();

  /**
   * Returns a new object of class '<em>Set Rest Call Receiver Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Rest Call Receiver Parameters</em>'.
   * @generated
   */
  SetRestCallReceiverParameters createSetRestCallReceiverParameters();

  /**
   * Returns a new object of class '<em>Set Rest Call Receiver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Rest Call Receiver</em>'.
   * @generated
   */
  SetRestCallReceiver createSetRestCallReceiver();

  /**
   * Returns a new object of class '<em>Set UI Element Receiver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set UI Element Receiver</em>'.
   * @generated
   */
  SetUIElementReceiver createSetUIElementReceiver();

  /**
   * Returns a new object of class '<em>Set Action Receiver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Action Receiver</em>'.
   * @generated
   */
  SetActionReceiver createSetActionReceiver();

  /**
   * Returns a new object of class '<em>Set Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Action</em>'.
   * @generated
   */
  SetAction createSetAction();

  /**
   * Returns a new object of class '<em>Interface Method Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Method Call Parameter</em>'.
   * @generated
   */
  InterfaceMethodCallParameter createInterfaceMethodCallParameter();

  /**
   * Returns a new object of class '<em>Interface Method Call Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Method Call Parameters</em>'.
   * @generated
   */
  InterfaceMethodCallParameters createInterfaceMethodCallParameters();

  /**
   * Returns a new object of class '<em>Interface Method Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Method Call</em>'.
   * @generated
   */
  InterfaceMethodCall createInterfaceMethodCall();

  /**
   * Returns a new object of class '<em>UI Action Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Action Feature</em>'.
   * @generated
   */
  UIActionFeature createUIActionFeature();

  /**
   * Returns a new object of class '<em>UI Action Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Action Module</em>'.
   * @generated
   */
  UIActionModule createUIActionModule();

  /**
   * Returns a new object of class '<em>Controller Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Controller Element</em>'.
   * @generated
   */
  ControllerElement createControllerElement();

  /**
   * Returns a new object of class '<em>Controller Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Controller Module</em>'.
   * @generated
   */
  ControllerModule createControllerModule();

  /**
   * Returns a new object of class '<em>Screen Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen Module</em>'.
   * @generated
   */
  ScreenModule createScreenModule();

  /**
   * Returns a new object of class '<em>Screen Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen Feature</em>'.
   * @generated
   */
  ScreenFeature createScreenFeature();

  /**
   * Returns a new object of class '<em>Main Feature Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Feature Option</em>'.
   * @generated
   */
  MainFeatureOption createMainFeatureOption();

  /**
   * Returns a new object of class '<em>Main Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Feature</em>'.
   * @generated
   */
  MainFeature createMainFeature();

  /**
   * Returns a new object of class '<em>UI Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Feature</em>'.
   * @generated
   */
  UIFeature createUIFeature();

  /**
   * Returns a new object of class '<em>UI Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Module</em>'.
   * @generated
   */
  UIModule createUIModule();

  /**
   * Returns a new object of class '<em>Business Feature Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Feature Type</em>'.
   * @generated
   */
  BusinessFeatureType createBusinessFeatureType();

  /**
   * Returns a new object of class '<em>Business Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Feature</em>'.
   * @generated
   */
  BusinessFeature createBusinessFeature();

  /**
   * Returns a new object of class '<em>Business Features</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Features</em>'.
   * @generated
   */
  BusinessFeatures createBusinessFeatures();

  /**
   * Returns a new object of class '<em>Business Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Module</em>'.
   * @generated
   */
  BusinessModule createBusinessModule();

  /**
   * Returns a new object of class '<em>System Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Module</em>'.
   * @generated
   */
  SystemModule createSystemModule();

  /**
   * Returns a new object of class '<em>System Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Definition</em>'.
   * @generated
   */
  SystemDefinition createSystemDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainmodelPackage getDomainmodelPackage();

} //DomainmodelFactory
