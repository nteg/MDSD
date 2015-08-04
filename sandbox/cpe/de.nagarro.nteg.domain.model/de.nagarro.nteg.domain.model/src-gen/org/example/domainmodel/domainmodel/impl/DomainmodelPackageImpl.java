/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.example.domainmodel.domainmodel.AbstractElement;
import org.example.domainmodel.domainmodel.AbstractNamespaceElement;
import org.example.domainmodel.domainmodel.AttachAction;
import org.example.domainmodel.domainmodel.BindAction;
import org.example.domainmodel.domainmodel.BindEnumSource;
import org.example.domainmodel.domainmodel.BindSource;
import org.example.domainmodel.domainmodel.BusinessFeature;
import org.example.domainmodel.domainmodel.BusinessFeatureType;
import org.example.domainmodel.domainmodel.BusinessFeatures;
import org.example.domainmodel.domainmodel.BusinessModule;
import org.example.domainmodel.domainmodel.ContainerElement;
import org.example.domainmodel.domainmodel.ContainerElementLiteral;
import org.example.domainmodel.domainmodel.ContentElement;
import org.example.domainmodel.domainmodel.ContentElementLiteral;
import org.example.domainmodel.domainmodel.ControllerElement;
import org.example.domainmodel.domainmodel.ControllerModule;
import org.example.domainmodel.domainmodel.DataType;
import org.example.domainmodel.domainmodel.DomainEntity;
import org.example.domainmodel.domainmodel.DomainRepository;
import org.example.domainmodel.domainmodel.Domainmodel;
import org.example.domainmodel.domainmodel.DomainmodelFactory;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ElementFeature;
import org.example.domainmodel.domainmodel.EntryParametersModule;
import org.example.domainmodel.domainmodel.ExecuteAction;
import org.example.domainmodel.domainmodel.Feature;
import org.example.domainmodel.domainmodel.Import;
import org.example.domainmodel.domainmodel.InitActionFeature;
import org.example.domainmodel.domainmodel.InitActionModule;
import org.example.domainmodel.domainmodel.InterfaceDeclaration;
import org.example.domainmodel.domainmodel.InterfaceMethodCall;
import org.example.domainmodel.domainmodel.InterfaceMethodCallParameter;
import org.example.domainmodel.domainmodel.InterfaceMethodCallParameters;
import org.example.domainmodel.domainmodel.InterfaceOperation;
import org.example.domainmodel.domainmodel.InterfaceOperationUsageRule;
import org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule;
import org.example.domainmodel.domainmodel.MainFeature;
import org.example.domainmodel.domainmodel.MainFeatureOption;
import org.example.domainmodel.domainmodel.MethodCall;
import org.example.domainmodel.domainmodel.MethodParameter;
import org.example.domainmodel.domainmodel.MethodParameters;
import org.example.domainmodel.domainmodel.ModelFeature;
import org.example.domainmodel.domainmodel.ModelModule;
import org.example.domainmodel.domainmodel.NamespaceDeclaration;
import org.example.domainmodel.domainmodel.NavigateToAction;
import org.example.domainmodel.domainmodel.PropertyNameLiteral;
import org.example.domainmodel.domainmodel.ScreenFeature;
import org.example.domainmodel.domainmodel.ScreenModelParameter;
import org.example.domainmodel.domainmodel.ScreenModelParameters;
import org.example.domainmodel.domainmodel.ScreenModule;
import org.example.domainmodel.domainmodel.SetAction;
import org.example.domainmodel.domainmodel.SetActionReceiver;
import org.example.domainmodel.domainmodel.SetRestCallReceiver;
import org.example.domainmodel.domainmodel.SetRestCallReceiverIDParameter;
import org.example.domainmodel.domainmodel.SetRestCallReceiverParameter;
import org.example.domainmodel.domainmodel.SetRestCallReceiverParameters;
import org.example.domainmodel.domainmodel.SetRestCallReceiverReturnTypeParameter;
import org.example.domainmodel.domainmodel.SetRestCallReceiverURLParameter;
import org.example.domainmodel.domainmodel.SetUIElementReceiver;
import org.example.domainmodel.domainmodel.StatelessComponent;
import org.example.domainmodel.domainmodel.SystemDefinition;
import org.example.domainmodel.domainmodel.SystemModule;
import org.example.domainmodel.domainmodel.Type;
import org.example.domainmodel.domainmodel.UIActionFeature;
import org.example.domainmodel.domainmodel.UIActionModule;
import org.example.domainmodel.domainmodel.UIElementReceiverKey;
import org.example.domainmodel.domainmodel.UIFeature;
import org.example.domainmodel.domainmodel.UIModule;
import org.example.domainmodel.domainmodel.ValidateAction;
import org.example.domainmodel.domainmodel.ValidatorFeature;
import org.example.domainmodel.domainmodel.ValidatorModule;
import org.example.domainmodel.domainmodel.ValidatorRule;
import org.example.domainmodel.domainmodel.ValidatorRules;
import org.example.domainmodel.domainmodel.ViewElement;
import org.example.domainmodel.domainmodel.ViewModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainmodelPackageImpl extends EPackageImpl implements DomainmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainmodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractNamespaceElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceOperationUsageRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceOperationsUsageRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statelessComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryParametersModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validateActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attachActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindEnumSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initActionFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initActionModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validatorRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validatorRulesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validatorFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validatorModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenModelParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenModelParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass navigateToActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executeActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setRestCallReceiverURLParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setRestCallReceiverReturnTypeParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setRestCallReceiverIDParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setRestCallReceiverParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setRestCallReceiverParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setRestCallReceiverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setUIElementReceiverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setActionReceiverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceMethodCallParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceMethodCallParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceMethodCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiActionFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiActionModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controllerElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controllerModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainFeatureOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessFeatureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessFeaturesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum contentElementLiteralEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum propertyNameLiteralEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum containerElementLiteralEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum uiElementReceiverKeyEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DomainmodelPackageImpl()
  {
    super(eNS_URI, DomainmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DomainmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DomainmodelPackage init()
  {
    if (isInited) return (DomainmodelPackage)EPackage.Registry.INSTANCE.getEPackage(DomainmodelPackage.eNS_URI);

    // Obtain or create and register package
    DomainmodelPackageImpl theDomainmodelPackage = (DomainmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDomainmodelPackage.createPackageContents();

    // Initialize created meta-data
    theDomainmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDomainmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DomainmodelPackage.eNS_URI, theDomainmodelPackage);
    return theDomainmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainmodel()
  {
    return domainmodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainmodel_Elements()
  {
    return (EReference)domainmodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Name()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_Name()
  {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_MappedType()
  {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_InitValue()
  {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceDeclaration()
  {
    return namespaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceDeclaration_NamespaceElements()
  {
    return (EReference)namespaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractNamespaceElement()
  {
    return abstractNamespaceElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_MappingOption()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_MapName()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Type()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainEntity()
  {
    return domainEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainEntity_Name()
  {
    return (EAttribute)domainEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainEntity_Features()
  {
    return (EReference)domainEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodParameter()
  {
    return methodParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodParameter_Type()
  {
    return (EReference)methodParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodParameter_Name()
  {
    return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodParameters()
  {
    return methodParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodParameters_Parameters()
  {
    return (EReference)methodParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodCall()
  {
    return methodCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodCall_Name()
  {
    return (EAttribute)methodCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodCall_Parameters()
  {
    return (EReference)methodCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceOperation()
  {
    return interfaceOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceOperation_RestOperation()
  {
    return (EAttribute)interfaceOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceOperation_MethodCall()
  {
    return (EReference)interfaceOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceOperation_Type()
  {
    return (EReference)interfaceOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceDeclaration()
  {
    return interfaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceDeclaration_Name()
  {
    return (EAttribute)interfaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDeclaration_Operations()
  {
    return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceOperationUsageRule()
  {
    return interfaceOperationUsageRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceOperationUsageRule_Name()
  {
    return (EAttribute)interfaceOperationUsageRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceOperationUsageRule_InterfaceName()
  {
    return (EReference)interfaceOperationUsageRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceOperationsUsageRule()
  {
    return interfaceOperationsUsageRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceOperationsUsageRule_UsageOperations()
  {
    return (EReference)interfaceOperationsUsageRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatelessComponent()
  {
    return statelessComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatelessComponent_Name()
  {
    return (EAttribute)statelessComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatelessComponent_Operations()
  {
    return (EReference)statelessComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainRepository()
  {
    return domainRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainRepository_EntityType()
  {
    return (EReference)domainRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainRepository_Name()
  {
    return (EAttribute)domainRepositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainRepository_Operations()
  {
    return (EReference)domainRepositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryParametersModule()
  {
    return entryParametersModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryParametersModule_EntryFeatures()
  {
    return (EReference)entryParametersModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelFeature()
  {
    return modelFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelFeature_Name()
  {
    return (EAttribute)modelFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFeature_Type()
  {
    return (EReference)modelFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelModule()
  {
    return modelModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelModule_ModelFeatures()
  {
    return (EReference)modelModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementFeature()
  {
    return elementFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementFeature_PropertyName()
  {
    return (EAttribute)elementFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementFeature_PropertyValue()
  {
    return (EAttribute)elementFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentElement()
  {
    return contentElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentElement_ContentElement()
  {
    return (EAttribute)contentElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerElement()
  {
    return containerElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerElement_Container()
  {
    return (EAttribute)containerElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerElement_Elements()
  {
    return (EReference)containerElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewElement()
  {
    return viewElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewElement_Name()
  {
    return (EAttribute)viewElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewElement_Features()
  {
    return (EReference)viewElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewModule()
  {
    return viewModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewModule_Elements()
  {
    return (EReference)viewModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidateAction()
  {
    return validateActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidateAction_Condition()
  {
    return (EReference)validateActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidateAction_UiReceiver()
  {
    return (EReference)validateActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttachAction()
  {
    return attachActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttachAction_UiAction()
  {
    return (EReference)attachActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttachAction_UiReceiver()
  {
    return (EReference)attachActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindEnumSource()
  {
    return bindEnumSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBindEnumSource_EnumType()
  {
    return (EAttribute)bindEnumSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindSource()
  {
    return bindSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindSource_ModelFeatureName()
  {
    return (EReference)bindSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindAction()
  {
    return bindActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindAction_BindSource()
  {
    return (EReference)bindActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBindAction_Attribute()
  {
    return (EAttribute)bindActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindAction_UiReceiver()
  {
    return (EReference)bindActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitActionFeature()
  {
    return initActionFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitActionModule()
  {
    return initActionModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitActionModule_InitActionFeatures()
  {
    return (EReference)initActionModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidatorRule()
  {
    return validatorRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidatorRule_StringRule()
  {
    return (EAttribute)validatorRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidatorRule_ConditionName()
  {
    return (EReference)validatorRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidatorRules()
  {
    return validatorRulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidatorRules_ValidatorRules()
  {
    return (EReference)validatorRulesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidatorFeature()
  {
    return validatorFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidatorFeature_Name()
  {
    return (EAttribute)validatorFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidatorFeature_ValidatorRules()
  {
    return (EReference)validatorFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidatorModule()
  {
    return validatorModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidatorModule_ValidatorFeatures()
  {
    return (EReference)validatorModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenModelParameter()
  {
    return screenModelParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenModelParameter_ModelFeatureName()
  {
    return (EReference)screenModelParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreenModelParameter_ModelFeatureValue()
  {
    return (EAttribute)screenModelParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenModelParameters()
  {
    return screenModelParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenModelParameters_Parameters()
  {
    return (EReference)screenModelParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNavigateToAction()
  {
    return navigateToActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavigateToAction_ScreenElementId()
  {
    return (EReference)navigateToActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavigateToAction_ModelFeatures()
  {
    return (EReference)navigateToActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecuteAction()
  {
    return executeActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteAction_UiActionName()
  {
    return (EReference)executeActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetRestCallReceiverURLParameter()
  {
    return setRestCallReceiverURLParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetRestCallReceiverURLParameter_ParameterType()
  {
    return (EAttribute)setRestCallReceiverURLParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetRestCallReceiverReturnTypeParameter()
  {
    return setRestCallReceiverReturnTypeParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetRestCallReceiverReturnTypeParameter_ParameterType()
  {
    return (EReference)setRestCallReceiverReturnTypeParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetRestCallReceiverIDParameter()
  {
    return setRestCallReceiverIDParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetRestCallReceiverIDParameter_ParameterType()
  {
    return (EAttribute)setRestCallReceiverIDParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetRestCallReceiverParameter()
  {
    return setRestCallReceiverParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetRestCallReceiverParameters()
  {
    return setRestCallReceiverParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetRestCallReceiverParameters_Parameters()
  {
    return (EReference)setRestCallReceiverParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetRestCallReceiver()
  {
    return setRestCallReceiverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetRestCallReceiver_Parameters()
  {
    return (EReference)setRestCallReceiverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetUIElementReceiver()
  {
    return setUIElementReceiverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetUIElementReceiver_WidgetName()
  {
    return (EReference)setUIElementReceiverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetUIElementReceiver_UiKey()
  {
    return (EAttribute)setUIElementReceiverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetActionReceiver()
  {
    return setActionReceiverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetAction()
  {
    return setActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetAction_ModelFeatureName()
  {
    return (EReference)setActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetAction_SetActionReceiver()
  {
    return (EReference)setActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceMethodCallParameter()
  {
    return interfaceMethodCallParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodCallParameter_ParameterName()
  {
    return (EReference)interfaceMethodCallParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceMethodCallParameter_ParameterType()
  {
    return (EAttribute)interfaceMethodCallParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceMethodCallParameters()
  {
    return interfaceMethodCallParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodCallParameters_Parameters()
  {
    return (EReference)interfaceMethodCallParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceMethodCall()
  {
    return interfaceMethodCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodCall_InterfaceInstanceName()
  {
    return (EReference)interfaceMethodCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodCall_MethodName()
  {
    return (EReference)interfaceMethodCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceMethodCall_Parameters()
  {
    return (EReference)interfaceMethodCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIActionFeature()
  {
    return uiActionFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIActionModule()
  {
    return uiActionModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUIActionModule_Name()
  {
    return (EAttribute)uiActionModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIActionModule_UiActionFeatures()
  {
    return (EReference)uiActionModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControllerElement()
  {
    return controllerElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControllerModule()
  {
    return controllerModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getControllerModule_Elements()
  {
    return (EReference)controllerModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenModule()
  {
    return screenModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreenFeature()
  {
    return screenFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScreenFeature_Name()
  {
    return (EAttribute)screenFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreenFeature_ScreenModules()
  {
    return (EReference)screenFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainFeatureOption()
  {
    return mainFeatureOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMainFeatureOption_Name()
  {
    return (EAttribute)mainFeatureOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainFeature()
  {
    return mainFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainFeature_Features()
  {
    return (EReference)mainFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIFeature()
  {
    return uiFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIModule()
  {
    return uiModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUIModule_UiFeatures()
  {
    return (EReference)uiModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessFeatureType()
  {
    return businessFeatureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessFeature()
  {
    return businessFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessFeature_Name()
  {
    return (EAttribute)businessFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessFeature_Type()
  {
    return (EReference)businessFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessFeature_ConnectPoint1()
  {
    return (EAttribute)businessFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessFeature_ConnectPoint2()
  {
    return (EReference)businessFeatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessFeature_ConnectEnd()
  {
    return (EAttribute)businessFeatureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessFeatures()
  {
    return businessFeaturesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessFeatures_Features()
  {
    return (EReference)businessFeaturesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessModule()
  {
    return businessModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemModule()
  {
    return systemModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemDefinition()
  {
    return systemDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemDefinition_Modules()
  {
    return (EReference)systemDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getContentElementLiteral()
  {
    return contentElementLiteralEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPropertyNameLiteral()
  {
    return propertyNameLiteralEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getContainerElementLiteral()
  {
    return containerElementLiteralEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUIElementReceiverKey()
  {
    return uiElementReceiverKeyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelFactory getDomainmodelFactory()
  {
    return (DomainmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainmodelEClass = createEClass(DOMAINMODEL);
    createEReference(domainmodelEClass, DOMAINMODEL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);

    typeEClass = createEClass(TYPE);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__NAME);
    createEAttribute(dataTypeEClass, DATA_TYPE__MAPPED_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__INIT_VALUE);

    namespaceDeclarationEClass = createEClass(NAMESPACE_DECLARATION);
    createEReference(namespaceDeclarationEClass, NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS);

    abstractNamespaceElementEClass = createEClass(ABSTRACT_NAMESPACE_ELEMENT);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);
    createEAttribute(featureEClass, FEATURE__MAPPING_OPTION);
    createEAttribute(featureEClass, FEATURE__MAP_NAME);
    createEReference(featureEClass, FEATURE__TYPE);

    domainEntityEClass = createEClass(DOMAIN_ENTITY);
    createEAttribute(domainEntityEClass, DOMAIN_ENTITY__NAME);
    createEReference(domainEntityEClass, DOMAIN_ENTITY__FEATURES);

    methodParameterEClass = createEClass(METHOD_PARAMETER);
    createEReference(methodParameterEClass, METHOD_PARAMETER__TYPE);
    createEAttribute(methodParameterEClass, METHOD_PARAMETER__NAME);

    methodParametersEClass = createEClass(METHOD_PARAMETERS);
    createEReference(methodParametersEClass, METHOD_PARAMETERS__PARAMETERS);

    methodCallEClass = createEClass(METHOD_CALL);
    createEAttribute(methodCallEClass, METHOD_CALL__NAME);
    createEReference(methodCallEClass, METHOD_CALL__PARAMETERS);

    interfaceOperationEClass = createEClass(INTERFACE_OPERATION);
    createEAttribute(interfaceOperationEClass, INTERFACE_OPERATION__REST_OPERATION);
    createEReference(interfaceOperationEClass, INTERFACE_OPERATION__METHOD_CALL);
    createEReference(interfaceOperationEClass, INTERFACE_OPERATION__TYPE);

    interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);
    createEAttribute(interfaceDeclarationEClass, INTERFACE_DECLARATION__NAME);
    createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__OPERATIONS);

    interfaceOperationUsageRuleEClass = createEClass(INTERFACE_OPERATION_USAGE_RULE);
    createEAttribute(interfaceOperationUsageRuleEClass, INTERFACE_OPERATION_USAGE_RULE__NAME);
    createEReference(interfaceOperationUsageRuleEClass, INTERFACE_OPERATION_USAGE_RULE__INTERFACE_NAME);

    interfaceOperationsUsageRuleEClass = createEClass(INTERFACE_OPERATIONS_USAGE_RULE);
    createEReference(interfaceOperationsUsageRuleEClass, INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS);

    statelessComponentEClass = createEClass(STATELESS_COMPONENT);
    createEAttribute(statelessComponentEClass, STATELESS_COMPONENT__NAME);
    createEReference(statelessComponentEClass, STATELESS_COMPONENT__OPERATIONS);

    domainRepositoryEClass = createEClass(DOMAIN_REPOSITORY);
    createEReference(domainRepositoryEClass, DOMAIN_REPOSITORY__ENTITY_TYPE);
    createEAttribute(domainRepositoryEClass, DOMAIN_REPOSITORY__NAME);
    createEReference(domainRepositoryEClass, DOMAIN_REPOSITORY__OPERATIONS);

    entryParametersModuleEClass = createEClass(ENTRY_PARAMETERS_MODULE);
    createEReference(entryParametersModuleEClass, ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES);

    modelFeatureEClass = createEClass(MODEL_FEATURE);
    createEAttribute(modelFeatureEClass, MODEL_FEATURE__NAME);
    createEReference(modelFeatureEClass, MODEL_FEATURE__TYPE);

    modelModuleEClass = createEClass(MODEL_MODULE);
    createEReference(modelModuleEClass, MODEL_MODULE__MODEL_FEATURES);

    elementFeatureEClass = createEClass(ELEMENT_FEATURE);
    createEAttribute(elementFeatureEClass, ELEMENT_FEATURE__PROPERTY_NAME);
    createEAttribute(elementFeatureEClass, ELEMENT_FEATURE__PROPERTY_VALUE);

    contentElementEClass = createEClass(CONTENT_ELEMENT);
    createEAttribute(contentElementEClass, CONTENT_ELEMENT__CONTENT_ELEMENT);

    containerElementEClass = createEClass(CONTAINER_ELEMENT);
    createEAttribute(containerElementEClass, CONTAINER_ELEMENT__CONTAINER);
    createEReference(containerElementEClass, CONTAINER_ELEMENT__ELEMENTS);

    viewElementEClass = createEClass(VIEW_ELEMENT);
    createEAttribute(viewElementEClass, VIEW_ELEMENT__NAME);
    createEReference(viewElementEClass, VIEW_ELEMENT__FEATURES);

    viewModuleEClass = createEClass(VIEW_MODULE);
    createEReference(viewModuleEClass, VIEW_MODULE__ELEMENTS);

    validateActionEClass = createEClass(VALIDATE_ACTION);
    createEReference(validateActionEClass, VALIDATE_ACTION__CONDITION);
    createEReference(validateActionEClass, VALIDATE_ACTION__UI_RECEIVER);

    attachActionEClass = createEClass(ATTACH_ACTION);
    createEReference(attachActionEClass, ATTACH_ACTION__UI_ACTION);
    createEReference(attachActionEClass, ATTACH_ACTION__UI_RECEIVER);

    bindEnumSourceEClass = createEClass(BIND_ENUM_SOURCE);
    createEAttribute(bindEnumSourceEClass, BIND_ENUM_SOURCE__ENUM_TYPE);

    bindSourceEClass = createEClass(BIND_SOURCE);
    createEReference(bindSourceEClass, BIND_SOURCE__MODEL_FEATURE_NAME);

    bindActionEClass = createEClass(BIND_ACTION);
    createEReference(bindActionEClass, BIND_ACTION__BIND_SOURCE);
    createEAttribute(bindActionEClass, BIND_ACTION__ATTRIBUTE);
    createEReference(bindActionEClass, BIND_ACTION__UI_RECEIVER);

    initActionFeatureEClass = createEClass(INIT_ACTION_FEATURE);

    initActionModuleEClass = createEClass(INIT_ACTION_MODULE);
    createEReference(initActionModuleEClass, INIT_ACTION_MODULE__INIT_ACTION_FEATURES);

    validatorRuleEClass = createEClass(VALIDATOR_RULE);
    createEAttribute(validatorRuleEClass, VALIDATOR_RULE__STRING_RULE);
    createEReference(validatorRuleEClass, VALIDATOR_RULE__CONDITION_NAME);

    validatorRulesEClass = createEClass(VALIDATOR_RULES);
    createEReference(validatorRulesEClass, VALIDATOR_RULES__VALIDATOR_RULES);

    validatorFeatureEClass = createEClass(VALIDATOR_FEATURE);
    createEAttribute(validatorFeatureEClass, VALIDATOR_FEATURE__NAME);
    createEReference(validatorFeatureEClass, VALIDATOR_FEATURE__VALIDATOR_RULES);

    validatorModuleEClass = createEClass(VALIDATOR_MODULE);
    createEReference(validatorModuleEClass, VALIDATOR_MODULE__VALIDATOR_FEATURES);

    screenModelParameterEClass = createEClass(SCREEN_MODEL_PARAMETER);
    createEReference(screenModelParameterEClass, SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME);
    createEAttribute(screenModelParameterEClass, SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE);

    screenModelParametersEClass = createEClass(SCREEN_MODEL_PARAMETERS);
    createEReference(screenModelParametersEClass, SCREEN_MODEL_PARAMETERS__PARAMETERS);

    navigateToActionEClass = createEClass(NAVIGATE_TO_ACTION);
    createEReference(navigateToActionEClass, NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID);
    createEReference(navigateToActionEClass, NAVIGATE_TO_ACTION__MODEL_FEATURES);

    executeActionEClass = createEClass(EXECUTE_ACTION);
    createEReference(executeActionEClass, EXECUTE_ACTION__UI_ACTION_NAME);

    setRestCallReceiverURLParameterEClass = createEClass(SET_REST_CALL_RECEIVER_URL_PARAMETER);
    createEAttribute(setRestCallReceiverURLParameterEClass, SET_REST_CALL_RECEIVER_URL_PARAMETER__PARAMETER_TYPE);

    setRestCallReceiverReturnTypeParameterEClass = createEClass(SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER);
    createEReference(setRestCallReceiverReturnTypeParameterEClass, SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER__PARAMETER_TYPE);

    setRestCallReceiverIDParameterEClass = createEClass(SET_REST_CALL_RECEIVER_ID_PARAMETER);
    createEAttribute(setRestCallReceiverIDParameterEClass, SET_REST_CALL_RECEIVER_ID_PARAMETER__PARAMETER_TYPE);

    setRestCallReceiverParameterEClass = createEClass(SET_REST_CALL_RECEIVER_PARAMETER);

    setRestCallReceiverParametersEClass = createEClass(SET_REST_CALL_RECEIVER_PARAMETERS);
    createEReference(setRestCallReceiverParametersEClass, SET_REST_CALL_RECEIVER_PARAMETERS__PARAMETERS);

    setRestCallReceiverEClass = createEClass(SET_REST_CALL_RECEIVER);
    createEReference(setRestCallReceiverEClass, SET_REST_CALL_RECEIVER__PARAMETERS);

    setUIElementReceiverEClass = createEClass(SET_UI_ELEMENT_RECEIVER);
    createEReference(setUIElementReceiverEClass, SET_UI_ELEMENT_RECEIVER__WIDGET_NAME);
    createEAttribute(setUIElementReceiverEClass, SET_UI_ELEMENT_RECEIVER__UI_KEY);

    setActionReceiverEClass = createEClass(SET_ACTION_RECEIVER);

    setActionEClass = createEClass(SET_ACTION);
    createEReference(setActionEClass, SET_ACTION__MODEL_FEATURE_NAME);
    createEReference(setActionEClass, SET_ACTION__SET_ACTION_RECEIVER);

    interfaceMethodCallParameterEClass = createEClass(INTERFACE_METHOD_CALL_PARAMETER);
    createEReference(interfaceMethodCallParameterEClass, INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME);
    createEAttribute(interfaceMethodCallParameterEClass, INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE);

    interfaceMethodCallParametersEClass = createEClass(INTERFACE_METHOD_CALL_PARAMETERS);
    createEReference(interfaceMethodCallParametersEClass, INTERFACE_METHOD_CALL_PARAMETERS__PARAMETERS);

    interfaceMethodCallEClass = createEClass(INTERFACE_METHOD_CALL);
    createEReference(interfaceMethodCallEClass, INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME);
    createEReference(interfaceMethodCallEClass, INTERFACE_METHOD_CALL__METHOD_NAME);
    createEReference(interfaceMethodCallEClass, INTERFACE_METHOD_CALL__PARAMETERS);

    uiActionFeatureEClass = createEClass(UI_ACTION_FEATURE);

    uiActionModuleEClass = createEClass(UI_ACTION_MODULE);
    createEAttribute(uiActionModuleEClass, UI_ACTION_MODULE__NAME);
    createEReference(uiActionModuleEClass, UI_ACTION_MODULE__UI_ACTION_FEATURES);

    controllerElementEClass = createEClass(CONTROLLER_ELEMENT);

    controllerModuleEClass = createEClass(CONTROLLER_MODULE);
    createEReference(controllerModuleEClass, CONTROLLER_MODULE__ELEMENTS);

    screenModuleEClass = createEClass(SCREEN_MODULE);

    screenFeatureEClass = createEClass(SCREEN_FEATURE);
    createEAttribute(screenFeatureEClass, SCREEN_FEATURE__NAME);
    createEReference(screenFeatureEClass, SCREEN_FEATURE__SCREEN_MODULES);

    mainFeatureOptionEClass = createEClass(MAIN_FEATURE_OPTION);
    createEAttribute(mainFeatureOptionEClass, MAIN_FEATURE_OPTION__NAME);

    mainFeatureEClass = createEClass(MAIN_FEATURE);
    createEReference(mainFeatureEClass, MAIN_FEATURE__FEATURES);

    uiFeatureEClass = createEClass(UI_FEATURE);

    uiModuleEClass = createEClass(UI_MODULE);
    createEReference(uiModuleEClass, UI_MODULE__UI_FEATURES);

    businessFeatureTypeEClass = createEClass(BUSINESS_FEATURE_TYPE);

    businessFeatureEClass = createEClass(BUSINESS_FEATURE);
    createEAttribute(businessFeatureEClass, BUSINESS_FEATURE__NAME);
    createEReference(businessFeatureEClass, BUSINESS_FEATURE__TYPE);
    createEAttribute(businessFeatureEClass, BUSINESS_FEATURE__CONNECT_POINT1);
    createEReference(businessFeatureEClass, BUSINESS_FEATURE__CONNECT_POINT2);
    createEAttribute(businessFeatureEClass, BUSINESS_FEATURE__CONNECT_END);

    businessFeaturesEClass = createEClass(BUSINESS_FEATURES);
    createEReference(businessFeaturesEClass, BUSINESS_FEATURES__FEATURES);

    businessModuleEClass = createEClass(BUSINESS_MODULE);

    systemModuleEClass = createEClass(SYSTEM_MODULE);

    systemDefinitionEClass = createEClass(SYSTEM_DEFINITION);
    createEReference(systemDefinitionEClass, SYSTEM_DEFINITION__MODULES);

    // Create enums
    contentElementLiteralEEnum = createEEnum(CONTENT_ELEMENT_LITERAL);
    propertyNameLiteralEEnum = createEEnum(PROPERTY_NAME_LITERAL);
    containerElementLiteralEEnum = createEEnum(CONTAINER_ELEMENT_LITERAL);
    uiElementReceiverKeyEEnum = createEEnum(UI_ELEMENT_RECEIVER_KEY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    importEClass.getESuperTypes().add(this.getAbstractNamespaceElement());
    dataTypeEClass.getESuperTypes().add(this.getType());
    dataTypeEClass.getESuperTypes().add(this.getAbstractNamespaceElement());
    namespaceDeclarationEClass.getESuperTypes().add(this.getAbstractElement());
    domainEntityEClass.getESuperTypes().add(this.getType());
    domainEntityEClass.getESuperTypes().add(this.getAbstractNamespaceElement());
    interfaceDeclarationEClass.getESuperTypes().add(this.getAbstractNamespaceElement());
    interfaceDeclarationEClass.getESuperTypes().add(this.getBusinessFeatureType());
    statelessComponentEClass.getESuperTypes().add(this.getAbstractNamespaceElement());
    statelessComponentEClass.getESuperTypes().add(this.getBusinessFeatureType());
    domainRepositoryEClass.getESuperTypes().add(this.getAbstractNamespaceElement());
    domainRepositoryEClass.getESuperTypes().add(this.getBusinessFeatureType());
    entryParametersModuleEClass.getESuperTypes().add(this.getScreenModule());
    modelModuleEClass.getESuperTypes().add(this.getScreenModule());
    contentElementEClass.getESuperTypes().add(this.getViewElement());
    containerElementEClass.getESuperTypes().add(this.getViewElement());
    viewModuleEClass.getESuperTypes().add(this.getScreenModule());
    validateActionEClass.getESuperTypes().add(this.getInitActionFeature());
    attachActionEClass.getESuperTypes().add(this.getInitActionFeature());
    bindEnumSourceEClass.getESuperTypes().add(this.getBindSource());
    bindActionEClass.getESuperTypes().add(this.getInitActionFeature());
    initActionModuleEClass.getESuperTypes().add(this.getControllerElement());
    validatorModuleEClass.getESuperTypes().add(this.getControllerElement());
    navigateToActionEClass.getESuperTypes().add(this.getUIActionFeature());
    executeActionEClass.getESuperTypes().add(this.getUIActionFeature());
    setRestCallReceiverURLParameterEClass.getESuperTypes().add(this.getSetRestCallReceiverParameter());
    setRestCallReceiverReturnTypeParameterEClass.getESuperTypes().add(this.getSetRestCallReceiverParameter());
    setRestCallReceiverIDParameterEClass.getESuperTypes().add(this.getSetRestCallReceiverParameter());
    setRestCallReceiverEClass.getESuperTypes().add(this.getSetActionReceiver());
    setUIElementReceiverEClass.getESuperTypes().add(this.getSetActionReceiver());
    setActionEClass.getESuperTypes().add(this.getInitActionFeature());
    setActionEClass.getESuperTypes().add(this.getUIActionFeature());
    interfaceMethodCallEClass.getESuperTypes().add(this.getUIActionFeature());
    uiActionModuleEClass.getESuperTypes().add(this.getControllerElement());
    controllerModuleEClass.getESuperTypes().add(this.getScreenModule());
    screenFeatureEClass.getESuperTypes().add(this.getUIFeature());
    mainFeatureEClass.getESuperTypes().add(this.getUIFeature());
    uiModuleEClass.getESuperTypes().add(this.getSystemModule());
    businessFeaturesEClass.getESuperTypes().add(this.getBusinessModule());
    businessModuleEClass.getESuperTypes().add(this.getSystemModule());
    systemDefinitionEClass.getESuperTypes().add(this.getAbstractElement());

    // Initialize classes and features; add operations and parameters
    initEClass(domainmodelEClass, Domainmodel.class, "Domainmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainmodel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Domainmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataType_MappedType(), ecorePackage.getEString(), "mappedType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataType_InitValue(), ecorePackage.getEString(), "initValue", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceDeclarationEClass, NamespaceDeclaration.class, "NamespaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamespaceDeclaration_NamespaceElements(), this.getAbstractNamespaceElement(), null, "namespaceElements", null, 0, -1, NamespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractNamespaceElementEClass, AbstractNamespaceElement.class, "AbstractNamespaceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_MappingOption(), ecorePackage.getEString(), "mappingOption", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_MapName(), ecorePackage.getEString(), "mapName", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_Type(), this.getType(), null, "type", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainEntityEClass, DomainEntity.class, "DomainEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainEntity_Features(), this.getFeature(), null, "features", null, 0, -1, DomainEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodParameterEClass, MethodParameter.class, "MethodParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodParameter_Type(), this.getType(), null, "type", null, 0, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodParametersEClass, MethodParameters.class, "MethodParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodParameters_Parameters(), this.getMethodParameter(), null, "parameters", null, 0, -1, MethodParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethodCall_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodCall_Parameters(), this.getMethodParameters(), null, "parameters", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceOperationEClass, InterfaceOperation.class, "InterfaceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceOperation_RestOperation(), ecorePackage.getEString(), "restOperation", null, 0, 1, InterfaceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceOperation_MethodCall(), this.getMethodCall(), null, "methodCall", null, 0, 1, InterfaceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceOperation_Type(), this.getType(), null, "type", null, 0, 1, InterfaceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceDeclaration_Operations(), this.getInterfaceOperation(), null, "operations", null, 0, -1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceOperationUsageRuleEClass, InterfaceOperationUsageRule.class, "InterfaceOperationUsageRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceOperationUsageRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceOperationUsageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceOperationUsageRule_InterfaceName(), this.getInterfaceDeclaration(), null, "interfaceName", null, 0, 1, InterfaceOperationUsageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceOperationsUsageRuleEClass, InterfaceOperationsUsageRule.class, "InterfaceOperationsUsageRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceOperationsUsageRule_UsageOperations(), this.getInterfaceOperationUsageRule(), null, "usageOperations", null, 0, -1, InterfaceOperationsUsageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statelessComponentEClass, StatelessComponent.class, "StatelessComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatelessComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, StatelessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatelessComponent_Operations(), this.getInterfaceOperationsUsageRule(), null, "operations", null, 0, 1, StatelessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainRepositoryEClass, DomainRepository.class, "DomainRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainRepository_EntityType(), this.getDomainEntity(), null, "entityType", null, 0, 1, DomainRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainRepository_Operations(), this.getInterfaceOperationsUsageRule(), null, "operations", null, 0, 1, DomainRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entryParametersModuleEClass, EntryParametersModule.class, "EntryParametersModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntryParametersModule_EntryFeatures(), this.getModelFeature(), null, "entryFeatures", null, 0, -1, EntryParametersModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelFeatureEClass, ModelFeature.class, "ModelFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelFeature_Type(), this.getType(), null, "type", null, 0, 1, ModelFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelModuleEClass, ModelModule.class, "ModelModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelModule_ModelFeatures(), this.getModelFeature(), null, "modelFeatures", null, 0, -1, ModelModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementFeatureEClass, ElementFeature.class, "ElementFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementFeature_PropertyName(), this.getPropertyNameLiteral(), "propertyName", null, 0, 1, ElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementFeature_PropertyValue(), ecorePackage.getEString(), "propertyValue", null, 0, 1, ElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentElementEClass, ContentElement.class, "ContentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContentElement_ContentElement(), this.getContentElementLiteral(), "contentElement", null, 0, 1, ContentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerElementEClass, ContainerElement.class, "ContainerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainerElement_Container(), this.getContainerElementLiteral(), "container", null, 0, 1, ContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerElement_Elements(), this.getViewElement(), null, "elements", null, 0, -1, ContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewElementEClass, ViewElement.class, "ViewElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewElement_Features(), this.getElementFeature(), null, "features", null, 0, -1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewModuleEClass, ViewModule.class, "ViewModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewModule_Elements(), this.getViewElement(), null, "elements", null, 0, -1, ViewModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validateActionEClass, ValidateAction.class, "ValidateAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValidateAction_Condition(), this.getValidatorFeature(), null, "condition", null, 0, 1, ValidateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValidateAction_UiReceiver(), this.getSetUIElementReceiver(), null, "uiReceiver", null, 0, 1, ValidateAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attachActionEClass, AttachAction.class, "AttachAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttachAction_UiAction(), this.getUIActionModule(), null, "uiAction", null, 0, 1, AttachAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttachAction_UiReceiver(), this.getSetUIElementReceiver(), null, "uiReceiver", null, 0, 1, AttachAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindEnumSourceEClass, BindEnumSource.class, "BindEnumSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBindEnumSource_EnumType(), ecorePackage.getEString(), "enumType", null, 0, 1, BindEnumSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindSourceEClass, BindSource.class, "BindSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBindSource_ModelFeatureName(), this.getModelFeature(), null, "modelFeatureName", null, 0, 1, BindSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindActionEClass, BindAction.class, "BindAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBindAction_BindSource(), this.getBindSource(), null, "bindSource", null, 0, 1, BindAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBindAction_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, BindAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBindAction_UiReceiver(), this.getSetUIElementReceiver(), null, "uiReceiver", null, 0, 1, BindAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initActionFeatureEClass, InitActionFeature.class, "InitActionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(initActionModuleEClass, InitActionModule.class, "InitActionModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitActionModule_InitActionFeatures(), this.getInitActionFeature(), null, "initActionFeatures", null, 0, -1, InitActionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validatorRuleEClass, ValidatorRule.class, "ValidatorRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValidatorRule_StringRule(), ecorePackage.getEString(), "stringRule", null, 0, 1, ValidatorRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValidatorRule_ConditionName(), this.getValidatorFeature(), null, "conditionName", null, 0, 1, ValidatorRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validatorRulesEClass, ValidatorRules.class, "ValidatorRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValidatorRules_ValidatorRules(), this.getValidatorRule(), null, "validatorRules", null, 0, -1, ValidatorRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validatorFeatureEClass, ValidatorFeature.class, "ValidatorFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValidatorFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValidatorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValidatorFeature_ValidatorRules(), this.getValidatorRules(), null, "validatorRules", null, 0, 1, ValidatorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validatorModuleEClass, ValidatorModule.class, "ValidatorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValidatorModule_ValidatorFeatures(), this.getValidatorFeature(), null, "validatorFeatures", null, 0, -1, ValidatorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenModelParameterEClass, ScreenModelParameter.class, "ScreenModelParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScreenModelParameter_ModelFeatureName(), this.getModelFeature(), null, "modelFeatureName", null, 0, 1, ScreenModelParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreenModelParameter_ModelFeatureValue(), ecorePackage.getEString(), "modelFeatureValue", null, 0, 1, ScreenModelParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenModelParametersEClass, ScreenModelParameters.class, "ScreenModelParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScreenModelParameters_Parameters(), this.getScreenModelParameter(), null, "parameters", null, 0, -1, ScreenModelParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(navigateToActionEClass, NavigateToAction.class, "NavigateToAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNavigateToAction_ScreenElementId(), this.getScreenFeature(), null, "screenElementId", null, 0, 1, NavigateToAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNavigateToAction_ModelFeatures(), this.getScreenModelParameters(), null, "modelFeatures", null, 0, 1, NavigateToAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executeActionEClass, ExecuteAction.class, "ExecuteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecuteAction_UiActionName(), this.getUIActionModule(), null, "uiActionName", null, 0, 1, ExecuteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setRestCallReceiverURLParameterEClass, SetRestCallReceiverURLParameter.class, "SetRestCallReceiverURLParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetRestCallReceiverURLParameter_ParameterType(), ecorePackage.getEString(), "parameterType", null, 0, 1, SetRestCallReceiverURLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setRestCallReceiverReturnTypeParameterEClass, SetRestCallReceiverReturnTypeParameter.class, "SetRestCallReceiverReturnTypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetRestCallReceiverReturnTypeParameter_ParameterType(), this.getType(), null, "parameterType", null, 0, 1, SetRestCallReceiverReturnTypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setRestCallReceiverIDParameterEClass, SetRestCallReceiverIDParameter.class, "SetRestCallReceiverIDParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetRestCallReceiverIDParameter_ParameterType(), ecorePackage.getEString(), "parameterType", null, 0, 1, SetRestCallReceiverIDParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setRestCallReceiverParameterEClass, SetRestCallReceiverParameter.class, "SetRestCallReceiverParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setRestCallReceiverParametersEClass, SetRestCallReceiverParameters.class, "SetRestCallReceiverParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetRestCallReceiverParameters_Parameters(), this.getSetRestCallReceiverParameter(), null, "parameters", null, 0, -1, SetRestCallReceiverParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setRestCallReceiverEClass, SetRestCallReceiver.class, "SetRestCallReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetRestCallReceiver_Parameters(), this.getSetRestCallReceiverParameters(), null, "parameters", null, 0, -1, SetRestCallReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setUIElementReceiverEClass, SetUIElementReceiver.class, "SetUIElementReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetUIElementReceiver_WidgetName(), this.getViewElement(), null, "widgetName", null, 0, 1, SetUIElementReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetUIElementReceiver_UiKey(), this.getUIElementReceiverKey(), "uiKey", null, 0, 1, SetUIElementReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setActionReceiverEClass, SetActionReceiver.class, "SetActionReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setActionEClass, SetAction.class, "SetAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetAction_ModelFeatureName(), this.getModelFeature(), null, "modelFeatureName", null, 0, 1, SetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetAction_SetActionReceiver(), this.getSetActionReceiver(), null, "setActionReceiver", null, 0, 1, SetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceMethodCallParameterEClass, InterfaceMethodCallParameter.class, "InterfaceMethodCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceMethodCallParameter_ParameterName(), this.getMethodParameter(), null, "parameterName", null, 0, 1, InterfaceMethodCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterfaceMethodCallParameter_ParameterType(), ecorePackage.getEString(), "parameterType", null, 0, 1, InterfaceMethodCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceMethodCallParametersEClass, InterfaceMethodCallParameters.class, "InterfaceMethodCallParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceMethodCallParameters_Parameters(), this.getInterfaceMethodCallParameter(), null, "parameters", null, 0, -1, InterfaceMethodCallParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceMethodCallEClass, InterfaceMethodCall.class, "InterfaceMethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceMethodCall_InterfaceInstanceName(), this.getBusinessFeature(), null, "interfaceInstanceName", null, 0, 1, InterfaceMethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMethodCall_MethodName(), this.getMethodCall(), null, "methodName", null, 0, 1, InterfaceMethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceMethodCall_Parameters(), this.getInterfaceMethodCallParameters(), null, "parameters", null, 0, -1, InterfaceMethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiActionFeatureEClass, UIActionFeature.class, "UIActionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uiActionModuleEClass, UIActionModule.class, "UIActionModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUIActionModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, UIActionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUIActionModule_UiActionFeatures(), this.getUIActionFeature(), null, "uiActionFeatures", null, 0, -1, UIActionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controllerElementEClass, ControllerElement.class, "ControllerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controllerModuleEClass, ControllerModule.class, "ControllerModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControllerModule_Elements(), this.getControllerElement(), null, "elements", null, 0, -1, ControllerModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenModuleEClass, ScreenModule.class, "ScreenModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(screenFeatureEClass, ScreenFeature.class, "ScreenFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScreenFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScreenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScreenFeature_ScreenModules(), this.getScreenModule(), null, "screenModules", null, 0, -1, ScreenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainFeatureOptionEClass, MainFeatureOption.class, "MainFeatureOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMainFeatureOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, MainFeatureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainFeatureEClass, MainFeature.class, "MainFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMainFeature_Features(), this.getMainFeatureOption(), null, "features", null, 0, -1, MainFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiFeatureEClass, UIFeature.class, "UIFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uiModuleEClass, UIModule.class, "UIModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUIModule_UiFeatures(), this.getUIFeature(), null, "uiFeatures", null, 0, -1, UIModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessFeatureTypeEClass, BusinessFeatureType.class, "BusinessFeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(businessFeatureEClass, BusinessFeature.class, "BusinessFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessFeature_Type(), this.getBusinessFeatureType(), null, "type", null, 0, 1, BusinessFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessFeature_ConnectPoint1(), ecorePackage.getEString(), "connectPoint1", null, 0, 1, BusinessFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessFeature_ConnectPoint2(), this.getBusinessFeature(), null, "connectPoint2", null, 0, 1, BusinessFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessFeature_ConnectEnd(), ecorePackage.getEString(), "connectEnd", null, 0, 1, BusinessFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessFeaturesEClass, BusinessFeatures.class, "BusinessFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBusinessFeatures_Features(), this.getBusinessFeature(), null, "features", null, 0, -1, BusinessFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessModuleEClass, BusinessModule.class, "BusinessModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemModuleEClass, SystemModule.class, "SystemModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(systemDefinitionEClass, SystemDefinition.class, "SystemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemDefinition_Modules(), this.getSystemModule(), null, "modules", null, 0, -1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(contentElementLiteralEEnum, ContentElementLiteral.class, "ContentElementLiteral");
    addEEnumLiteral(contentElementLiteralEEnum, ContentElementLiteral.TEXT);
    addEEnumLiteral(contentElementLiteralEEnum, ContentElementLiteral.BUTTON);
    addEEnumLiteral(contentElementLiteralEEnum, ContentElementLiteral.LABEL);
    addEEnumLiteral(contentElementLiteralEEnum, ContentElementLiteral.LIST);
    addEEnumLiteral(contentElementLiteralEEnum, ContentElementLiteral.IMAGE);

    initEEnum(propertyNameLiteralEEnum, PropertyNameLiteral.class, "PropertyNameLiteral");
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.LABEL_PROVIDER);
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.CSS_ITEM);
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.TOOLTIP);
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.RESOURCE_KEY);
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.STYLE);
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.PATH);
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.TYPE);
    addEEnumLiteral(propertyNameLiteralEEnum, PropertyNameLiteral.COLUMNS);

    initEEnum(containerElementLiteralEEnum, ContainerElementLiteral.class, "ContainerElementLiteral");
    addEEnumLiteral(containerElementLiteralEEnum, ContainerElementLiteral.LAYOUT);
    addEEnumLiteral(containerElementLiteralEEnum, ContainerElementLiteral.SCREEN);

    initEEnum(uiElementReceiverKeyEEnum, UIElementReceiverKey.class, "UIElementReceiverKey");
    addEEnumLiteral(uiElementReceiverKeyEEnum, UIElementReceiverKey.SELECTION);
    addEEnumLiteral(uiElementReceiverKeyEEnum, UIElementReceiverKey.VALUES_);
    addEEnumLiteral(uiElementReceiverKeyEEnum, UIElementReceiverKey.ON_SELECTION);
    addEEnumLiteral(uiElementReceiverKeyEEnum, UIElementReceiverKey.TEXT);

    // Create resource
    createResource(eNS_URI);
  }

} //DomainmodelPackageImpl
