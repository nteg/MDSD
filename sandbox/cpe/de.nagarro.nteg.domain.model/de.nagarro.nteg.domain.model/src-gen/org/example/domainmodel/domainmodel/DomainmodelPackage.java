/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DomainmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domainmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/domainmodel/Domainmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "domainmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelPackage eINSTANCE = org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.AbstractElementImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.TypeImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.AbstractNamespaceElementImpl <em>Abstract Namespace Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.AbstractNamespaceElementImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getAbstractNamespaceElement()
   * @generated
   */
  int ABSTRACT_NAMESPACE_ELEMENT = 6;

  /**
   * The number of structural features of the '<em>Abstract Namespace Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ImportImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.DataTypeImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapped Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__MAPPED_TYPE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__INIT_VALUE = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.NamespaceDeclarationImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getNamespaceDeclaration()
   * @generated
   */
  int NAMESPACE_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Namespace Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Namespace Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.FeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Mapping Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MAPPING_OPTION = 1;

  /**
   * The feature id for the '<em><b>Map Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MAP_NAME = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 3;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.DomainEntityImpl <em>Domain Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.DomainEntityImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDomainEntity()
   * @generated
   */
  int DOMAIN_ENTITY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ENTITY__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ENTITY__FEATURES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Domain Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.MethodParameterImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMethodParameter()
   * @generated
   */
  int METHOD_PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Method Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.MethodParametersImpl <em>Method Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.MethodParametersImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMethodParameters()
   * @generated
   */
  int METHOD_PARAMETERS = 10;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Method Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.MethodCallImpl <em>Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.MethodCallImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMethodCall()
   * @generated
   */
  int METHOD_CALL = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationImpl <em>Interface Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InterfaceOperationImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceOperation()
   * @generated
   */
  int INTERFACE_OPERATION = 12;

  /**
   * The feature id for the '<em><b>Rest Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATION__REST_OPERATION = 0;

  /**
   * The feature id for the '<em><b>Method Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATION__METHOD_CALL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATION__TYPE = 2;

  /**
   * The number of structural features of the '<em>Interface Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InterfaceDeclarationImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceDeclaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__NAME = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__OPERATIONS = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationUsageRuleImpl <em>Interface Operation Usage Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InterfaceOperationUsageRuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceOperationUsageRule()
   * @generated
   */
  int INTERFACE_OPERATION_USAGE_RULE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATION_USAGE_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Interface Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATION_USAGE_RULE__INTERFACE_NAME = 1;

  /**
   * The number of structural features of the '<em>Interface Operation Usage Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATION_USAGE_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationsUsageRuleImpl <em>Interface Operations Usage Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InterfaceOperationsUsageRuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceOperationsUsageRule()
   * @generated
   */
  int INTERFACE_OPERATIONS_USAGE_RULE = 15;

  /**
   * The feature id for the '<em><b>Usage Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS = 0;

  /**
   * The number of structural features of the '<em>Interface Operations Usage Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_OPERATIONS_USAGE_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.StatelessComponentImpl <em>Stateless Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.StatelessComponentImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getStatelessComponent()
   * @generated
   */
  int STATELESS_COMPONENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_COMPONENT__NAME = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_COMPONENT__OPERATIONS = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stateless Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_COMPONENT_FEATURE_COUNT = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.DomainRepositoryImpl <em>Domain Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.DomainRepositoryImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDomainRepository()
   * @generated
   */
  int DOMAIN_REPOSITORY = 17;

  /**
   * The feature id for the '<em><b>Entity Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REPOSITORY__ENTITY_TYPE = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REPOSITORY__NAME = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REPOSITORY__OPERATIONS = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Domain Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REPOSITORY_FEATURE_COUNT = ABSTRACT_NAMESPACE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ScreenModuleImpl <em>Screen Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ScreenModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenModule()
   * @generated
   */
  int SCREEN_MODULE = 57;

  /**
   * The number of structural features of the '<em>Screen Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_MODULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.EntryParametersModuleImpl <em>Entry Parameters Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.EntryParametersModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getEntryParametersModule()
   * @generated
   */
  int ENTRY_PARAMETERS_MODULE = 18;

  /**
   * The feature id for the '<em><b>Entry Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES = SCREEN_MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entry Parameters Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_PARAMETERS_MODULE_FEATURE_COUNT = SCREEN_MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ModelFeatureImpl <em>Model Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ModelFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getModelFeature()
   * @generated
   */
  int MODEL_FEATURE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Model Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ModelModuleImpl <em>Model Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ModelModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getModelModule()
   * @generated
   */
  int MODEL_MODULE = 20;

  /**
   * The feature id for the '<em><b>Model Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MODULE__MODEL_FEATURES = SCREEN_MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MODULE_FEATURE_COUNT = SCREEN_MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ElementFeatureImpl <em>Element Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ElementFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getElementFeature()
   * @generated
   */
  int ELEMENT_FEATURE = 21;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE__PROPERTY_NAME = 0;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE__PROPERTY_VALUE = 1;

  /**
   * The number of structural features of the '<em>Element Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ViewElementImpl <em>View Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ViewElementImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getViewElement()
   * @generated
   */
  int VIEW_ELEMENT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT__FEATURES = 1;

  /**
   * The number of structural features of the '<em>View Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ContentElementImpl <em>Content Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ContentElementImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContentElement()
   * @generated
   */
  int CONTENT_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_ELEMENT__NAME = VIEW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_ELEMENT__FEATURES = VIEW_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Content Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_ELEMENT__CONTENT_ELEMENT = VIEW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Content Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_ELEMENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ContainerElementImpl <em>Container Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ContainerElementImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContainerElement()
   * @generated
   */
  int CONTAINER_ELEMENT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT__NAME = VIEW_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT__FEATURES = VIEW_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Container</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT__CONTAINER = VIEW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT__ELEMENTS = VIEW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Container Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ViewModuleImpl <em>View Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ViewModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getViewModule()
   * @generated
   */
  int VIEW_MODULE = 25;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_MODULE__ELEMENTS = SCREEN_MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_MODULE_FEATURE_COUNT = SCREEN_MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InitActionFeatureImpl <em>Init Action Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InitActionFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInitActionFeature()
   * @generated
   */
  int INIT_ACTION_FEATURE = 31;

  /**
   * The number of structural features of the '<em>Init Action Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION_FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ValidateActionImpl <em>Validate Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ValidateActionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidateAction()
   * @generated
   */
  int VALIDATE_ACTION = 26;

  /**
   * The feature id for the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATE_ACTION__CONDITION = INIT_ACTION_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ui Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATE_ACTION__UI_RECEIVER = INIT_ACTION_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Validate Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATE_ACTION_FEATURE_COUNT = INIT_ACTION_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.AttachActionImpl <em>Attach Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.AttachActionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getAttachAction()
   * @generated
   */
  int ATTACH_ACTION = 27;

  /**
   * The feature id for the '<em><b>Ui Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACH_ACTION__UI_ACTION = INIT_ACTION_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ui Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACH_ACTION__UI_RECEIVER = INIT_ACTION_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attach Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACH_ACTION_FEATURE_COUNT = INIT_ACTION_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.BindSourceImpl <em>Bind Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.BindSourceImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBindSource()
   * @generated
   */
  int BIND_SOURCE = 29;

  /**
   * The feature id for the '<em><b>Model Feature Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_SOURCE__MODEL_FEATURE_NAME = 0;

  /**
   * The number of structural features of the '<em>Bind Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.BindEnumSourceImpl <em>Bind Enum Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.BindEnumSourceImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBindEnumSource()
   * @generated
   */
  int BIND_ENUM_SOURCE = 28;

  /**
   * The feature id for the '<em><b>Model Feature Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_ENUM_SOURCE__MODEL_FEATURE_NAME = BIND_SOURCE__MODEL_FEATURE_NAME;

  /**
   * The feature id for the '<em><b>Enum Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_ENUM_SOURCE__ENUM_TYPE = BIND_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bind Enum Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_ENUM_SOURCE_FEATURE_COUNT = BIND_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.BindActionImpl <em>Bind Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.BindActionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBindAction()
   * @generated
   */
  int BIND_ACTION = 30;

  /**
   * The feature id for the '<em><b>Bind Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_ACTION__BIND_SOURCE = INIT_ACTION_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_ACTION__ATTRIBUTE = INIT_ACTION_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ui Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_ACTION__UI_RECEIVER = INIT_ACTION_FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bind Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_ACTION_FEATURE_COUNT = INIT_ACTION_FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ControllerElementImpl <em>Controller Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ControllerElementImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getControllerElement()
   * @generated
   */
  int CONTROLLER_ELEMENT = 55;

  /**
   * The number of structural features of the '<em>Controller Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InitActionModuleImpl <em>Init Action Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InitActionModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInitActionModule()
   * @generated
   */
  int INIT_ACTION_MODULE = 32;

  /**
   * The feature id for the '<em><b>Init Action Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION_MODULE__INIT_ACTION_FEATURES = CONTROLLER_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Init Action Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION_MODULE_FEATURE_COUNT = CONTROLLER_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorRuleImpl <em>Validator Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ValidatorRuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorRule()
   * @generated
   */
  int VALIDATOR_RULE = 33;

  /**
   * The feature id for the '<em><b>String Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RULE__STRING_RULE = 0;

  /**
   * The feature id for the '<em><b>Condition Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RULE__CONDITION_NAME = 1;

  /**
   * The number of structural features of the '<em>Validator Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorRulesImpl <em>Validator Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ValidatorRulesImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorRules()
   * @generated
   */
  int VALIDATOR_RULES = 34;

  /**
   * The feature id for the '<em><b>Validator Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RULES__VALIDATOR_RULES = 0;

  /**
   * The number of structural features of the '<em>Validator Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RULES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorFeatureImpl <em>Validator Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ValidatorFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorFeature()
   * @generated
   */
  int VALIDATOR_FEATURE = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Validator Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_FEATURE__VALIDATOR_RULES = 1;

  /**
   * The number of structural features of the '<em>Validator Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorModuleImpl <em>Validator Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ValidatorModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorModule()
   * @generated
   */
  int VALIDATOR_MODULE = 36;

  /**
   * The feature id for the '<em><b>Validator Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_MODULE__VALIDATOR_FEATURES = CONTROLLER_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Validator Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_MODULE_FEATURE_COUNT = CONTROLLER_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ScreenModelParameterImpl <em>Screen Model Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ScreenModelParameterImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenModelParameter()
   * @generated
   */
  int SCREEN_MODEL_PARAMETER = 37;

  /**
   * The feature id for the '<em><b>Model Feature Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME = 0;

  /**
   * The feature id for the '<em><b>Model Feature Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE = 1;

  /**
   * The number of structural features of the '<em>Screen Model Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_MODEL_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ScreenModelParametersImpl <em>Screen Model Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ScreenModelParametersImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenModelParameters()
   * @generated
   */
  int SCREEN_MODEL_PARAMETERS = 38;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_MODEL_PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Screen Model Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_MODEL_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.UIActionFeatureImpl <em>UI Action Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.UIActionFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIActionFeature()
   * @generated
   */
  int UI_ACTION_FEATURE = 53;

  /**
   * The number of structural features of the '<em>UI Action Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ACTION_FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.NavigateToActionImpl <em>Navigate To Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.NavigateToActionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getNavigateToAction()
   * @generated
   */
  int NAVIGATE_TO_ACTION = 39;

  /**
   * The feature id for the '<em><b>Screen Element Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID = UI_ACTION_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE_TO_ACTION__MODEL_FEATURES = UI_ACTION_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Navigate To Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE_TO_ACTION_FEATURE_COUNT = UI_ACTION_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ExecuteActionImpl <em>Execute Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ExecuteActionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getExecuteAction()
   * @generated
   */
  int EXECUTE_ACTION = 40;

  /**
   * The feature id for the '<em><b>Ui Action Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_ACTION__UI_ACTION_NAME = UI_ACTION_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Execute Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_ACTION_FEATURE_COUNT = UI_ACTION_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParameterImpl <em>Set Rest Call Receiver Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParameterImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverParameter()
   * @generated
   */
  int SET_REST_CALL_RECEIVER_PARAMETER = 44;

  /**
   * The number of structural features of the '<em>Set Rest Call Receiver Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverURLParameterImpl <em>Set Rest Call Receiver URL Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverURLParameterImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverURLParameter()
   * @generated
   */
  int SET_REST_CALL_RECEIVER_URL_PARAMETER = 41;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_URL_PARAMETER__PARAMETER_TYPE = SET_REST_CALL_RECEIVER_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Rest Call Receiver URL Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_URL_PARAMETER_FEATURE_COUNT = SET_REST_CALL_RECEIVER_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverReturnTypeParameterImpl <em>Set Rest Call Receiver Return Type Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverReturnTypeParameterImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverReturnTypeParameter()
   * @generated
   */
  int SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER = 42;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER__PARAMETER_TYPE = SET_REST_CALL_RECEIVER_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Rest Call Receiver Return Type Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER_FEATURE_COUNT = SET_REST_CALL_RECEIVER_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverIDParameterImpl <em>Set Rest Call Receiver ID Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverIDParameterImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverIDParameter()
   * @generated
   */
  int SET_REST_CALL_RECEIVER_ID_PARAMETER = 43;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_ID_PARAMETER__PARAMETER_TYPE = SET_REST_CALL_RECEIVER_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Rest Call Receiver ID Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_ID_PARAMETER_FEATURE_COUNT = SET_REST_CALL_RECEIVER_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParametersImpl <em>Set Rest Call Receiver Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParametersImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverParameters()
   * @generated
   */
  int SET_REST_CALL_RECEIVER_PARAMETERS = 45;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Set Rest Call Receiver Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetActionReceiverImpl <em>Set Action Receiver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetActionReceiverImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetActionReceiver()
   * @generated
   */
  int SET_ACTION_RECEIVER = 48;

  /**
   * The number of structural features of the '<em>Set Action Receiver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ACTION_RECEIVER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverImpl <em>Set Rest Call Receiver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiver()
   * @generated
   */
  int SET_REST_CALL_RECEIVER = 46;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER__PARAMETERS = SET_ACTION_RECEIVER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Rest Call Receiver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_REST_CALL_RECEIVER_FEATURE_COUNT = SET_ACTION_RECEIVER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetUIElementReceiverImpl <em>Set UI Element Receiver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetUIElementReceiverImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetUIElementReceiver()
   * @generated
   */
  int SET_UI_ELEMENT_RECEIVER = 47;

  /**
   * The feature id for the '<em><b>Widget Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_UI_ELEMENT_RECEIVER__WIDGET_NAME = SET_ACTION_RECEIVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ui Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_UI_ELEMENT_RECEIVER__UI_KEY = SET_ACTION_RECEIVER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set UI Element Receiver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_UI_ELEMENT_RECEIVER_FEATURE_COUNT = SET_ACTION_RECEIVER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SetActionImpl <em>Set Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SetActionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetAction()
   * @generated
   */
  int SET_ACTION = 49;

  /**
   * The feature id for the '<em><b>Model Feature Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ACTION__MODEL_FEATURE_NAME = INIT_ACTION_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Set Action Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ACTION__SET_ACTION_RECEIVER = INIT_ACTION_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ACTION_FEATURE_COUNT = INIT_ACTION_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParameterImpl <em>Interface Method Call Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParameterImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceMethodCallParameter()
   * @generated
   */
  int INTERFACE_METHOD_CALL_PARAMETER = 50;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE = 1;

  /**
   * The number of structural features of the '<em>Interface Method Call Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParametersImpl <em>Interface Method Call Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParametersImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceMethodCallParameters()
   * @generated
   */
  int INTERFACE_METHOD_CALL_PARAMETERS = 51;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL_PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Interface Method Call Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallImpl <em>Interface Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.InterfaceMethodCallImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceMethodCall()
   * @generated
   */
  int INTERFACE_METHOD_CALL = 52;

  /**
   * The feature id for the '<em><b>Interface Instance Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME = UI_ACTION_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL__METHOD_NAME = UI_ACTION_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL__PARAMETERS = UI_ACTION_FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Interface Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_CALL_FEATURE_COUNT = UI_ACTION_FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.UIActionModuleImpl <em>UI Action Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.UIActionModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIActionModule()
   * @generated
   */
  int UI_ACTION_MODULE = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ACTION_MODULE__NAME = CONTROLLER_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ui Action Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ACTION_MODULE__UI_ACTION_FEATURES = CONTROLLER_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>UI Action Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ACTION_MODULE_FEATURE_COUNT = CONTROLLER_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ControllerModuleImpl <em>Controller Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ControllerModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getControllerModule()
   * @generated
   */
  int CONTROLLER_MODULE = 56;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_MODULE__ELEMENTS = SCREEN_MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Controller Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_MODULE_FEATURE_COUNT = SCREEN_MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.UIFeatureImpl <em>UI Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.UIFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIFeature()
   * @generated
   */
  int UI_FEATURE = 61;

  /**
   * The number of structural features of the '<em>UI Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.ScreenFeatureImpl <em>Screen Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.ScreenFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenFeature()
   * @generated
   */
  int SCREEN_FEATURE = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_FEATURE__NAME = UI_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Screen Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_FEATURE__SCREEN_MODULES = UI_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Screen Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_FEATURE_FEATURE_COUNT = UI_FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.MainFeatureOptionImpl <em>Main Feature Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.MainFeatureOptionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMainFeatureOption()
   * @generated
   */
  int MAIN_FEATURE_OPTION = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_OPTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Main Feature Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_OPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.MainFeatureImpl <em>Main Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.MainFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMainFeature()
   * @generated
   */
  int MAIN_FEATURE = 60;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE__FEATURES = UI_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Main Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_FEATURE_COUNT = UI_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SystemModuleImpl <em>System Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SystemModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSystemModule()
   * @generated
   */
  int SYSTEM_MODULE = 67;

  /**
   * The number of structural features of the '<em>System Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_MODULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.UIModuleImpl <em>UI Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.UIModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIModule()
   * @generated
   */
  int UI_MODULE = 62;

  /**
   * The feature id for the '<em><b>Ui Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODULE__UI_FEATURES = SYSTEM_MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UI Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODULE_FEATURE_COUNT = SYSTEM_MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureTypeImpl <em>Business Feature Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.BusinessFeatureTypeImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessFeatureType()
   * @generated
   */
  int BUSINESS_FEATURE_TYPE = 63;

  /**
   * The number of structural features of the '<em>Business Feature Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl <em>Business Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessFeature()
   * @generated
   */
  int BUSINESS_FEATURE = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Connect Point1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE__CONNECT_POINT1 = 2;

  /**
   * The feature id for the '<em><b>Connect Point2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE__CONNECT_POINT2 = 3;

  /**
   * The feature id for the '<em><b>Connect End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE__CONNECT_END = 4;

  /**
   * The number of structural features of the '<em>Business Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.BusinessModuleImpl <em>Business Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.BusinessModuleImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessModule()
   * @generated
   */
  int BUSINESS_MODULE = 66;

  /**
   * The number of structural features of the '<em>Business Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_MODULE_FEATURE_COUNT = SYSTEM_MODULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.BusinessFeaturesImpl <em>Business Features</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.BusinessFeaturesImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessFeatures()
   * @generated
   */
  int BUSINESS_FEATURES = 65;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURES__FEATURES = BUSINESS_MODULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Business Features</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURES_FEATURE_COUNT = BUSINESS_MODULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.impl.SystemDefinitionImpl <em>System Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.impl.SystemDefinitionImpl
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSystemDefinition()
   * @generated
   */
  int SYSTEM_DEFINITION = 68;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DEFINITION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DEFINITION__MODULES = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>System Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DEFINITION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.ContentElementLiteral <em>Content Element Literal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.ContentElementLiteral
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContentElementLiteral()
   * @generated
   */
  int CONTENT_ELEMENT_LITERAL = 69;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.PropertyNameLiteral <em>Property Name Literal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.PropertyNameLiteral
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getPropertyNameLiteral()
   * @generated
   */
  int PROPERTY_NAME_LITERAL = 70;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.ContainerElementLiteral <em>Container Element Literal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.ContainerElementLiteral
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContainerElementLiteral()
   * @generated
   */
  int CONTAINER_ELEMENT_LITERAL = 71;

  /**
   * The meta object id for the '{@link org.example.domainmodel.domainmodel.UIElementReceiverKey <em>UI Element Receiver Key</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.domainmodel.UIElementReceiverKey
   * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIElementReceiverKey()
   * @generated
   */
  int UI_ELEMENT_RECEIVER_KEY = 72;


  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see org.example.domainmodel.domainmodel.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.example.domainmodel.domainmodel.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.example.domainmodel.domainmodel.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.example.domainmodel.domainmodel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.example.domainmodel.domainmodel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.example.domainmodel.domainmodel.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.example.domainmodel.domainmodel.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.DataType#getMappedType <em>Mapped Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped Type</em>'.
   * @see org.example.domainmodel.domainmodel.DataType#getMappedType()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_MappedType();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.DataType#getInitValue <em>Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Value</em>'.
   * @see org.example.domainmodel.domainmodel.DataType#getInitValue()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_InitValue();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Declaration</em>'.
   * @see org.example.domainmodel.domainmodel.NamespaceDeclaration
   * @generated
   */
  EClass getNamespaceDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.NamespaceDeclaration#getNamespaceElements <em>Namespace Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespace Elements</em>'.
   * @see org.example.domainmodel.domainmodel.NamespaceDeclaration#getNamespaceElements()
   * @see #getNamespaceDeclaration()
   * @generated
   */
  EReference getNamespaceDeclaration_NamespaceElements();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.AbstractNamespaceElement <em>Abstract Namespace Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Namespace Element</em>'.
   * @see org.example.domainmodel.domainmodel.AbstractNamespaceElement
   * @generated
   */
  EClass getAbstractNamespaceElement();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.example.domainmodel.domainmodel.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Feature#getMappingOption <em>Mapping Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapping Option</em>'.
   * @see org.example.domainmodel.domainmodel.Feature#getMappingOption()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_MappingOption();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.Feature#getMapName <em>Map Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Name</em>'.
   * @see org.example.domainmodel.domainmodel.Feature#getMapName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_MapName();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.domainmodel.domainmodel.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.DomainEntity <em>Domain Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Entity</em>'.
   * @see org.example.domainmodel.domainmodel.DomainEntity
   * @generated
   */
  EClass getDomainEntity();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.DomainEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.DomainEntity#getName()
   * @see #getDomainEntity()
   * @generated
   */
  EAttribute getDomainEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.DomainEntity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.example.domainmodel.domainmodel.DomainEntity#getFeatures()
   * @see #getDomainEntity()
   * @generated
   */
  EReference getDomainEntity_Features();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.MethodParameter <em>Method Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Parameter</em>'.
   * @see org.example.domainmodel.domainmodel.MethodParameter
   * @generated
   */
  EClass getMethodParameter();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.MethodParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.domainmodel.domainmodel.MethodParameter#getType()
   * @see #getMethodParameter()
   * @generated
   */
  EReference getMethodParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.MethodParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.MethodParameter#getName()
   * @see #getMethodParameter()
   * @generated
   */
  EAttribute getMethodParameter_Name();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.MethodParameters <em>Method Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.MethodParameters
   * @generated
   */
  EClass getMethodParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.MethodParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.MethodParameters#getParameters()
   * @see #getMethodParameters()
   * @generated
   */
  EReference getMethodParameters_Parameters();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call</em>'.
   * @see org.example.domainmodel.domainmodel.MethodCall
   * @generated
   */
  EClass getMethodCall();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.MethodCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.MethodCall#getName()
   * @see #getMethodCall()
   * @generated
   */
  EAttribute getMethodCall_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.MethodCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.MethodCall#getParameters()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Parameters();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InterfaceOperation <em>Interface Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Operation</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperation
   * @generated
   */
  EClass getInterfaceOperation();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.InterfaceOperation#getRestOperation <em>Rest Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rest Operation</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperation#getRestOperation()
   * @see #getInterfaceOperation()
   * @generated
   */
  EAttribute getInterfaceOperation_RestOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.InterfaceOperation#getMethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Call</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperation#getMethodCall()
   * @see #getInterfaceOperation()
   * @generated
   */
  EReference getInterfaceOperation_MethodCall();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.InterfaceOperation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperation#getType()
   * @see #getInterfaceOperation()
   * @generated
   */
  EReference getInterfaceOperation_Type();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Declaration</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceDeclaration
   * @generated
   */
  EClass getInterfaceDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.InterfaceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceDeclaration#getName()
   * @see #getInterfaceDeclaration()
   * @generated
   */
  EAttribute getInterfaceDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.InterfaceDeclaration#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceDeclaration#getOperations()
   * @see #getInterfaceDeclaration()
   * @generated
   */
  EReference getInterfaceDeclaration_Operations();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule <em>Interface Operation Usage Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Operation Usage Rule</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperationUsageRule
   * @generated
   */
  EClass getInterfaceOperationUsageRule();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getName()
   * @see #getInterfaceOperationUsageRule()
   * @generated
   */
  EAttribute getInterfaceOperationUsageRule_Name();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getInterfaceName <em>Interface Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface Name</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getInterfaceName()
   * @see #getInterfaceOperationUsageRule()
   * @generated
   */
  EReference getInterfaceOperationUsageRule_InterfaceName();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule <em>Interface Operations Usage Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Operations Usage Rule</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule
   * @generated
   */
  EClass getInterfaceOperationsUsageRule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule#getUsageOperations <em>Usage Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usage Operations</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule#getUsageOperations()
   * @see #getInterfaceOperationsUsageRule()
   * @generated
   */
  EReference getInterfaceOperationsUsageRule_UsageOperations();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.StatelessComponent <em>Stateless Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stateless Component</em>'.
   * @see org.example.domainmodel.domainmodel.StatelessComponent
   * @generated
   */
  EClass getStatelessComponent();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.StatelessComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.StatelessComponent#getName()
   * @see #getStatelessComponent()
   * @generated
   */
  EAttribute getStatelessComponent_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.StatelessComponent#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operations</em>'.
   * @see org.example.domainmodel.domainmodel.StatelessComponent#getOperations()
   * @see #getStatelessComponent()
   * @generated
   */
  EReference getStatelessComponent_Operations();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.DomainRepository <em>Domain Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Repository</em>'.
   * @see org.example.domainmodel.domainmodel.DomainRepository
   * @generated
   */
  EClass getDomainRepository();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.DomainRepository#getEntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity Type</em>'.
   * @see org.example.domainmodel.domainmodel.DomainRepository#getEntityType()
   * @see #getDomainRepository()
   * @generated
   */
  EReference getDomainRepository_EntityType();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.DomainRepository#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.DomainRepository#getName()
   * @see #getDomainRepository()
   * @generated
   */
  EAttribute getDomainRepository_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.DomainRepository#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operations</em>'.
   * @see org.example.domainmodel.domainmodel.DomainRepository#getOperations()
   * @see #getDomainRepository()
   * @generated
   */
  EReference getDomainRepository_Operations();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.EntryParametersModule <em>Entry Parameters Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Parameters Module</em>'.
   * @see org.example.domainmodel.domainmodel.EntryParametersModule
   * @generated
   */
  EClass getEntryParametersModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.EntryParametersModule#getEntryFeatures <em>Entry Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Features</em>'.
   * @see org.example.domainmodel.domainmodel.EntryParametersModule#getEntryFeatures()
   * @see #getEntryParametersModule()
   * @generated
   */
  EReference getEntryParametersModule_EntryFeatures();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ModelFeature <em>Model Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Feature</em>'.
   * @see org.example.domainmodel.domainmodel.ModelFeature
   * @generated
   */
  EClass getModelFeature();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ModelFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.ModelFeature#getName()
   * @see #getModelFeature()
   * @generated
   */
  EAttribute getModelFeature_Name();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.ModelFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.domainmodel.domainmodel.ModelFeature#getType()
   * @see #getModelFeature()
   * @generated
   */
  EReference getModelFeature_Type();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ModelModule <em>Model Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Module</em>'.
   * @see org.example.domainmodel.domainmodel.ModelModule
   * @generated
   */
  EClass getModelModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ModelModule#getModelFeatures <em>Model Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model Features</em>'.
   * @see org.example.domainmodel.domainmodel.ModelModule#getModelFeatures()
   * @see #getModelModule()
   * @generated
   */
  EReference getModelModule_ModelFeatures();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ElementFeature <em>Element Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Feature</em>'.
   * @see org.example.domainmodel.domainmodel.ElementFeature
   * @generated
   */
  EClass getElementFeature();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ElementFeature#getPropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Name</em>'.
   * @see org.example.domainmodel.domainmodel.ElementFeature#getPropertyName()
   * @see #getElementFeature()
   * @generated
   */
  EAttribute getElementFeature_PropertyName();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ElementFeature#getPropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Value</em>'.
   * @see org.example.domainmodel.domainmodel.ElementFeature#getPropertyValue()
   * @see #getElementFeature()
   * @generated
   */
  EAttribute getElementFeature_PropertyValue();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ContentElement <em>Content Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Element</em>'.
   * @see org.example.domainmodel.domainmodel.ContentElement
   * @generated
   */
  EClass getContentElement();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ContentElement#getContentElement <em>Content Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content Element</em>'.
   * @see org.example.domainmodel.domainmodel.ContentElement#getContentElement()
   * @see #getContentElement()
   * @generated
   */
  EAttribute getContentElement_ContentElement();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ContainerElement <em>Container Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Element</em>'.
   * @see org.example.domainmodel.domainmodel.ContainerElement
   * @generated
   */
  EClass getContainerElement();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ContainerElement#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container</em>'.
   * @see org.example.domainmodel.domainmodel.ContainerElement#getContainer()
   * @see #getContainerElement()
   * @generated
   */
  EAttribute getContainerElement_Container();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ContainerElement#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.example.domainmodel.domainmodel.ContainerElement#getElements()
   * @see #getContainerElement()
   * @generated
   */
  EReference getContainerElement_Elements();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Element</em>'.
   * @see org.example.domainmodel.domainmodel.ViewElement
   * @generated
   */
  EClass getViewElement();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ViewElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.ViewElement#getName()
   * @see #getViewElement()
   * @generated
   */
  EAttribute getViewElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ViewElement#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.example.domainmodel.domainmodel.ViewElement#getFeatures()
   * @see #getViewElement()
   * @generated
   */
  EReference getViewElement_Features();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ViewModule <em>View Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Module</em>'.
   * @see org.example.domainmodel.domainmodel.ViewModule
   * @generated
   */
  EClass getViewModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ViewModule#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.example.domainmodel.domainmodel.ViewModule#getElements()
   * @see #getViewModule()
   * @generated
   */
  EReference getViewModule_Elements();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ValidateAction <em>Validate Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validate Action</em>'.
   * @see org.example.domainmodel.domainmodel.ValidateAction
   * @generated
   */
  EClass getValidateAction();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.ValidateAction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Condition</em>'.
   * @see org.example.domainmodel.domainmodel.ValidateAction#getCondition()
   * @see #getValidateAction()
   * @generated
   */
  EReference getValidateAction_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.ValidateAction#getUiReceiver <em>Ui Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ui Receiver</em>'.
   * @see org.example.domainmodel.domainmodel.ValidateAction#getUiReceiver()
   * @see #getValidateAction()
   * @generated
   */
  EReference getValidateAction_UiReceiver();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.AttachAction <em>Attach Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attach Action</em>'.
   * @see org.example.domainmodel.domainmodel.AttachAction
   * @generated
   */
  EClass getAttachAction();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.AttachAction#getUiAction <em>Ui Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ui Action</em>'.
   * @see org.example.domainmodel.domainmodel.AttachAction#getUiAction()
   * @see #getAttachAction()
   * @generated
   */
  EReference getAttachAction_UiAction();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.AttachAction#getUiReceiver <em>Ui Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ui Receiver</em>'.
   * @see org.example.domainmodel.domainmodel.AttachAction#getUiReceiver()
   * @see #getAttachAction()
   * @generated
   */
  EReference getAttachAction_UiReceiver();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.BindEnumSource <em>Bind Enum Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind Enum Source</em>'.
   * @see org.example.domainmodel.domainmodel.BindEnumSource
   * @generated
   */
  EClass getBindEnumSource();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.BindEnumSource#getEnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum Type</em>'.
   * @see org.example.domainmodel.domainmodel.BindEnumSource#getEnumType()
   * @see #getBindEnumSource()
   * @generated
   */
  EAttribute getBindEnumSource_EnumType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.BindSource <em>Bind Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind Source</em>'.
   * @see org.example.domainmodel.domainmodel.BindSource
   * @generated
   */
  EClass getBindSource();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.BindSource#getModelFeatureName <em>Model Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Feature Name</em>'.
   * @see org.example.domainmodel.domainmodel.BindSource#getModelFeatureName()
   * @see #getBindSource()
   * @generated
   */
  EReference getBindSource_ModelFeatureName();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.BindAction <em>Bind Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind Action</em>'.
   * @see org.example.domainmodel.domainmodel.BindAction
   * @generated
   */
  EClass getBindAction();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.BindAction#getBindSource <em>Bind Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bind Source</em>'.
   * @see org.example.domainmodel.domainmodel.BindAction#getBindSource()
   * @see #getBindAction()
   * @generated
   */
  EReference getBindAction_BindSource();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.BindAction#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.example.domainmodel.domainmodel.BindAction#getAttribute()
   * @see #getBindAction()
   * @generated
   */
  EAttribute getBindAction_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.BindAction#getUiReceiver <em>Ui Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ui Receiver</em>'.
   * @see org.example.domainmodel.domainmodel.BindAction#getUiReceiver()
   * @see #getBindAction()
   * @generated
   */
  EReference getBindAction_UiReceiver();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InitActionFeature <em>Init Action Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Action Feature</em>'.
   * @see org.example.domainmodel.domainmodel.InitActionFeature
   * @generated
   */
  EClass getInitActionFeature();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InitActionModule <em>Init Action Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Action Module</em>'.
   * @see org.example.domainmodel.domainmodel.InitActionModule
   * @generated
   */
  EClass getInitActionModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.InitActionModule#getInitActionFeatures <em>Init Action Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init Action Features</em>'.
   * @see org.example.domainmodel.domainmodel.InitActionModule#getInitActionFeatures()
   * @see #getInitActionModule()
   * @generated
   */
  EReference getInitActionModule_InitActionFeatures();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ValidatorRule <em>Validator Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator Rule</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorRule
   * @generated
   */
  EClass getValidatorRule();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ValidatorRule#getStringRule <em>String Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Rule</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorRule#getStringRule()
   * @see #getValidatorRule()
   * @generated
   */
  EAttribute getValidatorRule_StringRule();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.ValidatorRule#getConditionName <em>Condition Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Condition Name</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorRule#getConditionName()
   * @see #getValidatorRule()
   * @generated
   */
  EReference getValidatorRule_ConditionName();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ValidatorRules <em>Validator Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator Rules</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorRules
   * @generated
   */
  EClass getValidatorRules();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ValidatorRules#getValidatorRules <em>Validator Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Validator Rules</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorRules#getValidatorRules()
   * @see #getValidatorRules()
   * @generated
   */
  EReference getValidatorRules_ValidatorRules();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ValidatorFeature <em>Validator Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator Feature</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorFeature
   * @generated
   */
  EClass getValidatorFeature();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ValidatorFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorFeature#getName()
   * @see #getValidatorFeature()
   * @generated
   */
  EAttribute getValidatorFeature_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.ValidatorFeature#getValidatorRules <em>Validator Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validator Rules</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorFeature#getValidatorRules()
   * @see #getValidatorFeature()
   * @generated
   */
  EReference getValidatorFeature_ValidatorRules();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ValidatorModule <em>Validator Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator Module</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorModule
   * @generated
   */
  EClass getValidatorModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ValidatorModule#getValidatorFeatures <em>Validator Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Validator Features</em>'.
   * @see org.example.domainmodel.domainmodel.ValidatorModule#getValidatorFeatures()
   * @see #getValidatorModule()
   * @generated
   */
  EReference getValidatorModule_ValidatorFeatures();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ScreenModelParameter <em>Screen Model Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Model Parameter</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenModelParameter
   * @generated
   */
  EClass getScreenModelParameter();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureName <em>Model Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Feature Name</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureName()
   * @see #getScreenModelParameter()
   * @generated
   */
  EReference getScreenModelParameter_ModelFeatureName();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureValue <em>Model Feature Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Feature Value</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureValue()
   * @see #getScreenModelParameter()
   * @generated
   */
  EAttribute getScreenModelParameter_ModelFeatureValue();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ScreenModelParameters <em>Screen Model Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Model Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenModelParameters
   * @generated
   */
  EClass getScreenModelParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ScreenModelParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenModelParameters#getParameters()
   * @see #getScreenModelParameters()
   * @generated
   */
  EReference getScreenModelParameters_Parameters();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.NavigateToAction <em>Navigate To Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigate To Action</em>'.
   * @see org.example.domainmodel.domainmodel.NavigateToAction
   * @generated
   */
  EClass getNavigateToAction();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.NavigateToAction#getScreenElementId <em>Screen Element Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screen Element Id</em>'.
   * @see org.example.domainmodel.domainmodel.NavigateToAction#getScreenElementId()
   * @see #getNavigateToAction()
   * @generated
   */
  EReference getNavigateToAction_ScreenElementId();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.NavigateToAction#getModelFeatures <em>Model Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model Features</em>'.
   * @see org.example.domainmodel.domainmodel.NavigateToAction#getModelFeatures()
   * @see #getNavigateToAction()
   * @generated
   */
  EReference getNavigateToAction_ModelFeatures();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ExecuteAction <em>Execute Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execute Action</em>'.
   * @see org.example.domainmodel.domainmodel.ExecuteAction
   * @generated
   */
  EClass getExecuteAction();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.ExecuteAction#getUiActionName <em>Ui Action Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ui Action Name</em>'.
   * @see org.example.domainmodel.domainmodel.ExecuteAction#getUiActionName()
   * @see #getExecuteAction()
   * @generated
   */
  EReference getExecuteAction_UiActionName();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverURLParameter <em>Set Rest Call Receiver URL Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Rest Call Receiver URL Parameter</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverURLParameter
   * @generated
   */
  EClass getSetRestCallReceiverURLParameter();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverURLParameter#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Type</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverURLParameter#getParameterType()
   * @see #getSetRestCallReceiverURLParameter()
   * @generated
   */
  EAttribute getSetRestCallReceiverURLParameter_ParameterType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverReturnTypeParameter <em>Set Rest Call Receiver Return Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Rest Call Receiver Return Type Parameter</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverReturnTypeParameter
   * @generated
   */
  EClass getSetRestCallReceiverReturnTypeParameter();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverReturnTypeParameter#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter Type</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverReturnTypeParameter#getParameterType()
   * @see #getSetRestCallReceiverReturnTypeParameter()
   * @generated
   */
  EReference getSetRestCallReceiverReturnTypeParameter_ParameterType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverIDParameter <em>Set Rest Call Receiver ID Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Rest Call Receiver ID Parameter</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverIDParameter
   * @generated
   */
  EClass getSetRestCallReceiverIDParameter();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverIDParameter#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Type</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverIDParameter#getParameterType()
   * @see #getSetRestCallReceiverIDParameter()
   * @generated
   */
  EAttribute getSetRestCallReceiverIDParameter_ParameterType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverParameter <em>Set Rest Call Receiver Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Rest Call Receiver Parameter</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverParameter
   * @generated
   */
  EClass getSetRestCallReceiverParameter();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverParameters <em>Set Rest Call Receiver Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Rest Call Receiver Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverParameters
   * @generated
   */
  EClass getSetRestCallReceiverParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.SetRestCallReceiverParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiverParameters#getParameters()
   * @see #getSetRestCallReceiverParameters()
   * @generated
   */
  EReference getSetRestCallReceiverParameters_Parameters();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetRestCallReceiver <em>Set Rest Call Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Rest Call Receiver</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiver
   * @generated
   */
  EClass getSetRestCallReceiver();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.SetRestCallReceiver#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.SetRestCallReceiver#getParameters()
   * @see #getSetRestCallReceiver()
   * @generated
   */
  EReference getSetRestCallReceiver_Parameters();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetUIElementReceiver <em>Set UI Element Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set UI Element Receiver</em>'.
   * @see org.example.domainmodel.domainmodel.SetUIElementReceiver
   * @generated
   */
  EClass getSetUIElementReceiver();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.SetUIElementReceiver#getWidgetName <em>Widget Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Widget Name</em>'.
   * @see org.example.domainmodel.domainmodel.SetUIElementReceiver#getWidgetName()
   * @see #getSetUIElementReceiver()
   * @generated
   */
  EReference getSetUIElementReceiver_WidgetName();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.SetUIElementReceiver#getUiKey <em>Ui Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ui Key</em>'.
   * @see org.example.domainmodel.domainmodel.SetUIElementReceiver#getUiKey()
   * @see #getSetUIElementReceiver()
   * @generated
   */
  EAttribute getSetUIElementReceiver_UiKey();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetActionReceiver <em>Set Action Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Action Receiver</em>'.
   * @see org.example.domainmodel.domainmodel.SetActionReceiver
   * @generated
   */
  EClass getSetActionReceiver();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SetAction <em>Set Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Action</em>'.
   * @see org.example.domainmodel.domainmodel.SetAction
   * @generated
   */
  EClass getSetAction();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.SetAction#getModelFeatureName <em>Model Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Feature Name</em>'.
   * @see org.example.domainmodel.domainmodel.SetAction#getModelFeatureName()
   * @see #getSetAction()
   * @generated
   */
  EReference getSetAction_ModelFeatureName();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.domainmodel.SetAction#getSetActionReceiver <em>Set Action Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set Action Receiver</em>'.
   * @see org.example.domainmodel.domainmodel.SetAction#getSetActionReceiver()
   * @see #getSetAction()
   * @generated
   */
  EReference getSetAction_SetActionReceiver();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter <em>Interface Method Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Method Call Parameter</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCallParameter
   * @generated
   */
  EClass getInterfaceMethodCallParameter();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterName <em>Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter Name</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterName()
   * @see #getInterfaceMethodCallParameter()
   * @generated
   */
  EReference getInterfaceMethodCallParameter_ParameterName();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Type</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterType()
   * @see #getInterfaceMethodCallParameter()
   * @generated
   */
  EAttribute getInterfaceMethodCallParameter_ParameterType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameters <em>Interface Method Call Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Method Call Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCallParameters
   * @generated
   */
  EClass getInterfaceMethodCallParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCallParameters#getParameters()
   * @see #getInterfaceMethodCallParameters()
   * @generated
   */
  EReference getInterfaceMethodCallParameters_Parameters();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.InterfaceMethodCall <em>Interface Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Method Call</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCall
   * @generated
   */
  EClass getInterfaceMethodCall();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getInterfaceInstanceName <em>Interface Instance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface Instance Name</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCall#getInterfaceInstanceName()
   * @see #getInterfaceMethodCall()
   * @generated
   */
  EReference getInterfaceMethodCall_InterfaceInstanceName();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method Name</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCall#getMethodName()
   * @see #getInterfaceMethodCall()
   * @generated
   */
  EReference getInterfaceMethodCall_MethodName();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.example.domainmodel.domainmodel.InterfaceMethodCall#getParameters()
   * @see #getInterfaceMethodCall()
   * @generated
   */
  EReference getInterfaceMethodCall_Parameters();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.UIActionFeature <em>UI Action Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Action Feature</em>'.
   * @see org.example.domainmodel.domainmodel.UIActionFeature
   * @generated
   */
  EClass getUIActionFeature();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.UIActionModule <em>UI Action Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Action Module</em>'.
   * @see org.example.domainmodel.domainmodel.UIActionModule
   * @generated
   */
  EClass getUIActionModule();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.UIActionModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.UIActionModule#getName()
   * @see #getUIActionModule()
   * @generated
   */
  EAttribute getUIActionModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.UIActionModule#getUiActionFeatures <em>Ui Action Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ui Action Features</em>'.
   * @see org.example.domainmodel.domainmodel.UIActionModule#getUiActionFeatures()
   * @see #getUIActionModule()
   * @generated
   */
  EReference getUIActionModule_UiActionFeatures();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ControllerElement <em>Controller Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller Element</em>'.
   * @see org.example.domainmodel.domainmodel.ControllerElement
   * @generated
   */
  EClass getControllerElement();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ControllerModule <em>Controller Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller Module</em>'.
   * @see org.example.domainmodel.domainmodel.ControllerModule
   * @generated
   */
  EClass getControllerModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ControllerModule#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.example.domainmodel.domainmodel.ControllerModule#getElements()
   * @see #getControllerModule()
   * @generated
   */
  EReference getControllerModule_Elements();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ScreenModule <em>Screen Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Module</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenModule
   * @generated
   */
  EClass getScreenModule();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.ScreenFeature <em>Screen Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Feature</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenFeature
   * @generated
   */
  EClass getScreenFeature();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.ScreenFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenFeature#getName()
   * @see #getScreenFeature()
   * @generated
   */
  EAttribute getScreenFeature_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.ScreenFeature#getScreenModules <em>Screen Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Screen Modules</em>'.
   * @see org.example.domainmodel.domainmodel.ScreenFeature#getScreenModules()
   * @see #getScreenFeature()
   * @generated
   */
  EReference getScreenFeature_ScreenModules();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.MainFeatureOption <em>Main Feature Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Feature Option</em>'.
   * @see org.example.domainmodel.domainmodel.MainFeatureOption
   * @generated
   */
  EClass getMainFeatureOption();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.MainFeatureOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.MainFeatureOption#getName()
   * @see #getMainFeatureOption()
   * @generated
   */
  EAttribute getMainFeatureOption_Name();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.MainFeature <em>Main Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Feature</em>'.
   * @see org.example.domainmodel.domainmodel.MainFeature
   * @generated
   */
  EClass getMainFeature();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.MainFeature#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.example.domainmodel.domainmodel.MainFeature#getFeatures()
   * @see #getMainFeature()
   * @generated
   */
  EReference getMainFeature_Features();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.UIFeature <em>UI Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Feature</em>'.
   * @see org.example.domainmodel.domainmodel.UIFeature
   * @generated
   */
  EClass getUIFeature();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.UIModule <em>UI Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Module</em>'.
   * @see org.example.domainmodel.domainmodel.UIModule
   * @generated
   */
  EClass getUIModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.UIModule#getUiFeatures <em>Ui Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ui Features</em>'.
   * @see org.example.domainmodel.domainmodel.UIModule#getUiFeatures()
   * @see #getUIModule()
   * @generated
   */
  EReference getUIModule_UiFeatures();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.BusinessFeatureType <em>Business Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Feature Type</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeatureType
   * @generated
   */
  EClass getBusinessFeatureType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.BusinessFeature <em>Business Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Feature</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeature
   * @generated
   */
  EClass getBusinessFeature();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.BusinessFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeature#getName()
   * @see #getBusinessFeature()
   * @generated
   */
  EAttribute getBusinessFeature_Name();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.BusinessFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeature#getType()
   * @see #getBusinessFeature()
   * @generated
   */
  EReference getBusinessFeature_Type();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint1 <em>Connect Point1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connect Point1</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint1()
   * @see #getBusinessFeature()
   * @generated
   */
  EAttribute getBusinessFeature_ConnectPoint1();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint2 <em>Connect Point2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Connect Point2</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint2()
   * @see #getBusinessFeature()
   * @generated
   */
  EReference getBusinessFeature_ConnectPoint2();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectEnd <em>Connect End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connect End</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeature#getConnectEnd()
   * @see #getBusinessFeature()
   * @generated
   */
  EAttribute getBusinessFeature_ConnectEnd();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.BusinessFeatures <em>Business Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Features</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeatures
   * @generated
   */
  EClass getBusinessFeatures();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.BusinessFeatures#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessFeatures#getFeatures()
   * @see #getBusinessFeatures()
   * @generated
   */
  EReference getBusinessFeatures_Features();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.BusinessModule <em>Business Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Module</em>'.
   * @see org.example.domainmodel.domainmodel.BusinessModule
   * @generated
   */
  EClass getBusinessModule();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SystemModule <em>System Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Module</em>'.
   * @see org.example.domainmodel.domainmodel.SystemModule
   * @generated
   */
  EClass getSystemModule();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.domainmodel.SystemDefinition <em>System Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Definition</em>'.
   * @see org.example.domainmodel.domainmodel.SystemDefinition
   * @generated
   */
  EClass getSystemDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.domainmodel.SystemDefinition#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see org.example.domainmodel.domainmodel.SystemDefinition#getModules()
   * @see #getSystemDefinition()
   * @generated
   */
  EReference getSystemDefinition_Modules();

  /**
   * Returns the meta object for enum '{@link org.example.domainmodel.domainmodel.ContentElementLiteral <em>Content Element Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Content Element Literal</em>'.
   * @see org.example.domainmodel.domainmodel.ContentElementLiteral
   * @generated
   */
  EEnum getContentElementLiteral();

  /**
   * Returns the meta object for enum '{@link org.example.domainmodel.domainmodel.PropertyNameLiteral <em>Property Name Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Property Name Literal</em>'.
   * @see org.example.domainmodel.domainmodel.PropertyNameLiteral
   * @generated
   */
  EEnum getPropertyNameLiteral();

  /**
   * Returns the meta object for enum '{@link org.example.domainmodel.domainmodel.ContainerElementLiteral <em>Container Element Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Container Element Literal</em>'.
   * @see org.example.domainmodel.domainmodel.ContainerElementLiteral
   * @generated
   */
  EEnum getContainerElementLiteral();

  /**
   * Returns the meta object for enum '{@link org.example.domainmodel.domainmodel.UIElementReceiverKey <em>UI Element Receiver Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>UI Element Receiver Key</em>'.
   * @see org.example.domainmodel.domainmodel.UIElementReceiverKey
   * @generated
   */
  EEnum getUIElementReceiverKey();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainmodelFactory getDomainmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.AbstractElementImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.TypeImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ImportImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.DataTypeImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '<em><b>Mapped Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__MAPPED_TYPE = eINSTANCE.getDataType_MappedType();

    /**
     * The meta object literal for the '<em><b>Init Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__INIT_VALUE = eINSTANCE.getDataType_InitValue();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.NamespaceDeclarationImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getNamespaceDeclaration()
     * @generated
     */
    EClass NAMESPACE_DECLARATION = eINSTANCE.getNamespaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Namespace Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS = eINSTANCE.getNamespaceDeclaration_NamespaceElements();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.AbstractNamespaceElementImpl <em>Abstract Namespace Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.AbstractNamespaceElementImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getAbstractNamespaceElement()
     * @generated
     */
    EClass ABSTRACT_NAMESPACE_ELEMENT = eINSTANCE.getAbstractNamespaceElement();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.FeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Mapping Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MAPPING_OPTION = eINSTANCE.getFeature_MappingOption();

    /**
     * The meta object literal for the '<em><b>Map Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MAP_NAME = eINSTANCE.getFeature_MapName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.DomainEntityImpl <em>Domain Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.DomainEntityImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDomainEntity()
     * @generated
     */
    EClass DOMAIN_ENTITY = eINSTANCE.getDomainEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_ENTITY__NAME = eINSTANCE.getDomainEntity_Name();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_ENTITY__FEATURES = eINSTANCE.getDomainEntity_Features();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.MethodParameterImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMethodParameter()
     * @generated
     */
    EClass METHOD_PARAMETER = eINSTANCE.getMethodParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PARAMETER__TYPE = eINSTANCE.getMethodParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_PARAMETER__NAME = eINSTANCE.getMethodParameter_Name();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.MethodParametersImpl <em>Method Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.MethodParametersImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMethodParameters()
     * @generated
     */
    EClass METHOD_PARAMETERS = eINSTANCE.getMethodParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PARAMETERS__PARAMETERS = eINSTANCE.getMethodParameters_Parameters();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.MethodCallImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMethodCall()
     * @generated
     */
    EClass METHOD_CALL = eINSTANCE.getMethodCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_CALL__NAME = eINSTANCE.getMethodCall_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__PARAMETERS = eINSTANCE.getMethodCall_Parameters();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationImpl <em>Interface Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InterfaceOperationImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceOperation()
     * @generated
     */
    EClass INTERFACE_OPERATION = eINSTANCE.getInterfaceOperation();

    /**
     * The meta object literal for the '<em><b>Rest Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_OPERATION__REST_OPERATION = eINSTANCE.getInterfaceOperation_RestOperation();

    /**
     * The meta object literal for the '<em><b>Method Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_OPERATION__METHOD_CALL = eINSTANCE.getInterfaceOperation_MethodCall();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_OPERATION__TYPE = eINSTANCE.getInterfaceOperation_Type();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InterfaceDeclarationImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceDeclaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__NAME = eINSTANCE.getInterfaceDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__OPERATIONS = eINSTANCE.getInterfaceDeclaration_Operations();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationUsageRuleImpl <em>Interface Operation Usage Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InterfaceOperationUsageRuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceOperationUsageRule()
     * @generated
     */
    EClass INTERFACE_OPERATION_USAGE_RULE = eINSTANCE.getInterfaceOperationUsageRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_OPERATION_USAGE_RULE__NAME = eINSTANCE.getInterfaceOperationUsageRule_Name();

    /**
     * The meta object literal for the '<em><b>Interface Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_OPERATION_USAGE_RULE__INTERFACE_NAME = eINSTANCE.getInterfaceOperationUsageRule_InterfaceName();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationsUsageRuleImpl <em>Interface Operations Usage Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InterfaceOperationsUsageRuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceOperationsUsageRule()
     * @generated
     */
    EClass INTERFACE_OPERATIONS_USAGE_RULE = eINSTANCE.getInterfaceOperationsUsageRule();

    /**
     * The meta object literal for the '<em><b>Usage Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS = eINSTANCE.getInterfaceOperationsUsageRule_UsageOperations();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.StatelessComponentImpl <em>Stateless Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.StatelessComponentImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getStatelessComponent()
     * @generated
     */
    EClass STATELESS_COMPONENT = eINSTANCE.getStatelessComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATELESS_COMPONENT__NAME = eINSTANCE.getStatelessComponent_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATELESS_COMPONENT__OPERATIONS = eINSTANCE.getStatelessComponent_Operations();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.DomainRepositoryImpl <em>Domain Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.DomainRepositoryImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getDomainRepository()
     * @generated
     */
    EClass DOMAIN_REPOSITORY = eINSTANCE.getDomainRepository();

    /**
     * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_REPOSITORY__ENTITY_TYPE = eINSTANCE.getDomainRepository_EntityType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_REPOSITORY__NAME = eINSTANCE.getDomainRepository_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_REPOSITORY__OPERATIONS = eINSTANCE.getDomainRepository_Operations();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.EntryParametersModuleImpl <em>Entry Parameters Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.EntryParametersModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getEntryParametersModule()
     * @generated
     */
    EClass ENTRY_PARAMETERS_MODULE = eINSTANCE.getEntryParametersModule();

    /**
     * The meta object literal for the '<em><b>Entry Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES = eINSTANCE.getEntryParametersModule_EntryFeatures();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ModelFeatureImpl <em>Model Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ModelFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getModelFeature()
     * @generated
     */
    EClass MODEL_FEATURE = eINSTANCE.getModelFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_FEATURE__NAME = eINSTANCE.getModelFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FEATURE__TYPE = eINSTANCE.getModelFeature_Type();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ModelModuleImpl <em>Model Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ModelModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getModelModule()
     * @generated
     */
    EClass MODEL_MODULE = eINSTANCE.getModelModule();

    /**
     * The meta object literal for the '<em><b>Model Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MODULE__MODEL_FEATURES = eINSTANCE.getModelModule_ModelFeatures();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ElementFeatureImpl <em>Element Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ElementFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getElementFeature()
     * @generated
     */
    EClass ELEMENT_FEATURE = eINSTANCE.getElementFeature();

    /**
     * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_FEATURE__PROPERTY_NAME = eINSTANCE.getElementFeature_PropertyName();

    /**
     * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_FEATURE__PROPERTY_VALUE = eINSTANCE.getElementFeature_PropertyValue();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ContentElementImpl <em>Content Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ContentElementImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContentElement()
     * @generated
     */
    EClass CONTENT_ELEMENT = eINSTANCE.getContentElement();

    /**
     * The meta object literal for the '<em><b>Content Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_ELEMENT__CONTENT_ELEMENT = eINSTANCE.getContentElement_ContentElement();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ContainerElementImpl <em>Container Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ContainerElementImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContainerElement()
     * @generated
     */
    EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_ELEMENT__CONTAINER = eINSTANCE.getContainerElement_Container();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_ELEMENT__ELEMENTS = eINSTANCE.getContainerElement_Elements();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ViewElementImpl <em>View Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ViewElementImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getViewElement()
     * @generated
     */
    EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_ELEMENT__NAME = eINSTANCE.getViewElement_Name();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_ELEMENT__FEATURES = eINSTANCE.getViewElement_Features();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ViewModuleImpl <em>View Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ViewModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getViewModule()
     * @generated
     */
    EClass VIEW_MODULE = eINSTANCE.getViewModule();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_MODULE__ELEMENTS = eINSTANCE.getViewModule_Elements();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ValidateActionImpl <em>Validate Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ValidateActionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidateAction()
     * @generated
     */
    EClass VALIDATE_ACTION = eINSTANCE.getValidateAction();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATE_ACTION__CONDITION = eINSTANCE.getValidateAction_Condition();

    /**
     * The meta object literal for the '<em><b>Ui Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATE_ACTION__UI_RECEIVER = eINSTANCE.getValidateAction_UiReceiver();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.AttachActionImpl <em>Attach Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.AttachActionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getAttachAction()
     * @generated
     */
    EClass ATTACH_ACTION = eINSTANCE.getAttachAction();

    /**
     * The meta object literal for the '<em><b>Ui Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTACH_ACTION__UI_ACTION = eINSTANCE.getAttachAction_UiAction();

    /**
     * The meta object literal for the '<em><b>Ui Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTACH_ACTION__UI_RECEIVER = eINSTANCE.getAttachAction_UiReceiver();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.BindEnumSourceImpl <em>Bind Enum Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.BindEnumSourceImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBindEnumSource()
     * @generated
     */
    EClass BIND_ENUM_SOURCE = eINSTANCE.getBindEnumSource();

    /**
     * The meta object literal for the '<em><b>Enum Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND_ENUM_SOURCE__ENUM_TYPE = eINSTANCE.getBindEnumSource_EnumType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.BindSourceImpl <em>Bind Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.BindSourceImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBindSource()
     * @generated
     */
    EClass BIND_SOURCE = eINSTANCE.getBindSource();

    /**
     * The meta object literal for the '<em><b>Model Feature Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_SOURCE__MODEL_FEATURE_NAME = eINSTANCE.getBindSource_ModelFeatureName();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.BindActionImpl <em>Bind Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.BindActionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBindAction()
     * @generated
     */
    EClass BIND_ACTION = eINSTANCE.getBindAction();

    /**
     * The meta object literal for the '<em><b>Bind Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_ACTION__BIND_SOURCE = eINSTANCE.getBindAction_BindSource();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND_ACTION__ATTRIBUTE = eINSTANCE.getBindAction_Attribute();

    /**
     * The meta object literal for the '<em><b>Ui Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_ACTION__UI_RECEIVER = eINSTANCE.getBindAction_UiReceiver();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InitActionFeatureImpl <em>Init Action Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InitActionFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInitActionFeature()
     * @generated
     */
    EClass INIT_ACTION_FEATURE = eINSTANCE.getInitActionFeature();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InitActionModuleImpl <em>Init Action Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InitActionModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInitActionModule()
     * @generated
     */
    EClass INIT_ACTION_MODULE = eINSTANCE.getInitActionModule();

    /**
     * The meta object literal for the '<em><b>Init Action Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ACTION_MODULE__INIT_ACTION_FEATURES = eINSTANCE.getInitActionModule_InitActionFeatures();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorRuleImpl <em>Validator Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ValidatorRuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorRule()
     * @generated
     */
    EClass VALIDATOR_RULE = eINSTANCE.getValidatorRule();

    /**
     * The meta object literal for the '<em><b>String Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATOR_RULE__STRING_RULE = eINSTANCE.getValidatorRule_StringRule();

    /**
     * The meta object literal for the '<em><b>Condition Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR_RULE__CONDITION_NAME = eINSTANCE.getValidatorRule_ConditionName();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorRulesImpl <em>Validator Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ValidatorRulesImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorRules()
     * @generated
     */
    EClass VALIDATOR_RULES = eINSTANCE.getValidatorRules();

    /**
     * The meta object literal for the '<em><b>Validator Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR_RULES__VALIDATOR_RULES = eINSTANCE.getValidatorRules_ValidatorRules();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorFeatureImpl <em>Validator Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ValidatorFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorFeature()
     * @generated
     */
    EClass VALIDATOR_FEATURE = eINSTANCE.getValidatorFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATOR_FEATURE__NAME = eINSTANCE.getValidatorFeature_Name();

    /**
     * The meta object literal for the '<em><b>Validator Rules</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR_FEATURE__VALIDATOR_RULES = eINSTANCE.getValidatorFeature_ValidatorRules();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ValidatorModuleImpl <em>Validator Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ValidatorModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getValidatorModule()
     * @generated
     */
    EClass VALIDATOR_MODULE = eINSTANCE.getValidatorModule();

    /**
     * The meta object literal for the '<em><b>Validator Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR_MODULE__VALIDATOR_FEATURES = eINSTANCE.getValidatorModule_ValidatorFeatures();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ScreenModelParameterImpl <em>Screen Model Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ScreenModelParameterImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenModelParameter()
     * @generated
     */
    EClass SCREEN_MODEL_PARAMETER = eINSTANCE.getScreenModelParameter();

    /**
     * The meta object literal for the '<em><b>Model Feature Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME = eINSTANCE.getScreenModelParameter_ModelFeatureName();

    /**
     * The meta object literal for the '<em><b>Model Feature Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE = eINSTANCE.getScreenModelParameter_ModelFeatureValue();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ScreenModelParametersImpl <em>Screen Model Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ScreenModelParametersImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenModelParameters()
     * @generated
     */
    EClass SCREEN_MODEL_PARAMETERS = eINSTANCE.getScreenModelParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_MODEL_PARAMETERS__PARAMETERS = eINSTANCE.getScreenModelParameters_Parameters();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.NavigateToActionImpl <em>Navigate To Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.NavigateToActionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getNavigateToAction()
     * @generated
     */
    EClass NAVIGATE_TO_ACTION = eINSTANCE.getNavigateToAction();

    /**
     * The meta object literal for the '<em><b>Screen Element Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID = eINSTANCE.getNavigateToAction_ScreenElementId();

    /**
     * The meta object literal for the '<em><b>Model Features</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATE_TO_ACTION__MODEL_FEATURES = eINSTANCE.getNavigateToAction_ModelFeatures();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ExecuteActionImpl <em>Execute Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ExecuteActionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getExecuteAction()
     * @generated
     */
    EClass EXECUTE_ACTION = eINSTANCE.getExecuteAction();

    /**
     * The meta object literal for the '<em><b>Ui Action Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_ACTION__UI_ACTION_NAME = eINSTANCE.getExecuteAction_UiActionName();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverURLParameterImpl <em>Set Rest Call Receiver URL Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverURLParameterImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverURLParameter()
     * @generated
     */
    EClass SET_REST_CALL_RECEIVER_URL_PARAMETER = eINSTANCE.getSetRestCallReceiverURLParameter();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_REST_CALL_RECEIVER_URL_PARAMETER__PARAMETER_TYPE = eINSTANCE.getSetRestCallReceiverURLParameter_ParameterType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverReturnTypeParameterImpl <em>Set Rest Call Receiver Return Type Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverReturnTypeParameterImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverReturnTypeParameter()
     * @generated
     */
    EClass SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER = eINSTANCE.getSetRestCallReceiverReturnTypeParameter();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_REST_CALL_RECEIVER_RETURN_TYPE_PARAMETER__PARAMETER_TYPE = eINSTANCE.getSetRestCallReceiverReturnTypeParameter_ParameterType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverIDParameterImpl <em>Set Rest Call Receiver ID Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverIDParameterImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverIDParameter()
     * @generated
     */
    EClass SET_REST_CALL_RECEIVER_ID_PARAMETER = eINSTANCE.getSetRestCallReceiverIDParameter();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_REST_CALL_RECEIVER_ID_PARAMETER__PARAMETER_TYPE = eINSTANCE.getSetRestCallReceiverIDParameter_ParameterType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParameterImpl <em>Set Rest Call Receiver Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParameterImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverParameter()
     * @generated
     */
    EClass SET_REST_CALL_RECEIVER_PARAMETER = eINSTANCE.getSetRestCallReceiverParameter();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParametersImpl <em>Set Rest Call Receiver Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverParametersImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiverParameters()
     * @generated
     */
    EClass SET_REST_CALL_RECEIVER_PARAMETERS = eINSTANCE.getSetRestCallReceiverParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_REST_CALL_RECEIVER_PARAMETERS__PARAMETERS = eINSTANCE.getSetRestCallReceiverParameters_Parameters();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetRestCallReceiverImpl <em>Set Rest Call Receiver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetRestCallReceiverImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetRestCallReceiver()
     * @generated
     */
    EClass SET_REST_CALL_RECEIVER = eINSTANCE.getSetRestCallReceiver();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_REST_CALL_RECEIVER__PARAMETERS = eINSTANCE.getSetRestCallReceiver_Parameters();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetUIElementReceiverImpl <em>Set UI Element Receiver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetUIElementReceiverImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetUIElementReceiver()
     * @generated
     */
    EClass SET_UI_ELEMENT_RECEIVER = eINSTANCE.getSetUIElementReceiver();

    /**
     * The meta object literal for the '<em><b>Widget Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_UI_ELEMENT_RECEIVER__WIDGET_NAME = eINSTANCE.getSetUIElementReceiver_WidgetName();

    /**
     * The meta object literal for the '<em><b>Ui Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_UI_ELEMENT_RECEIVER__UI_KEY = eINSTANCE.getSetUIElementReceiver_UiKey();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetActionReceiverImpl <em>Set Action Receiver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetActionReceiverImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetActionReceiver()
     * @generated
     */
    EClass SET_ACTION_RECEIVER = eINSTANCE.getSetActionReceiver();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SetActionImpl <em>Set Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SetActionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSetAction()
     * @generated
     */
    EClass SET_ACTION = eINSTANCE.getSetAction();

    /**
     * The meta object literal for the '<em><b>Model Feature Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_ACTION__MODEL_FEATURE_NAME = eINSTANCE.getSetAction_ModelFeatureName();

    /**
     * The meta object literal for the '<em><b>Set Action Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_ACTION__SET_ACTION_RECEIVER = eINSTANCE.getSetAction_SetActionReceiver();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParameterImpl <em>Interface Method Call Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParameterImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceMethodCallParameter()
     * @generated
     */
    EClass INTERFACE_METHOD_CALL_PARAMETER = eINSTANCE.getInterfaceMethodCallParameter();

    /**
     * The meta object literal for the '<em><b>Parameter Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME = eINSTANCE.getInterfaceMethodCallParameter_ParameterName();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE = eINSTANCE.getInterfaceMethodCallParameter_ParameterType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParametersImpl <em>Interface Method Call Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParametersImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceMethodCallParameters()
     * @generated
     */
    EClass INTERFACE_METHOD_CALL_PARAMETERS = eINSTANCE.getInterfaceMethodCallParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_CALL_PARAMETERS__PARAMETERS = eINSTANCE.getInterfaceMethodCallParameters_Parameters();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallImpl <em>Interface Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.InterfaceMethodCallImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getInterfaceMethodCall()
     * @generated
     */
    EClass INTERFACE_METHOD_CALL = eINSTANCE.getInterfaceMethodCall();

    /**
     * The meta object literal for the '<em><b>Interface Instance Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME = eINSTANCE.getInterfaceMethodCall_InterfaceInstanceName();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_CALL__METHOD_NAME = eINSTANCE.getInterfaceMethodCall_MethodName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_METHOD_CALL__PARAMETERS = eINSTANCE.getInterfaceMethodCall_Parameters();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.UIActionFeatureImpl <em>UI Action Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.UIActionFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIActionFeature()
     * @generated
     */
    EClass UI_ACTION_FEATURE = eINSTANCE.getUIActionFeature();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.UIActionModuleImpl <em>UI Action Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.UIActionModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIActionModule()
     * @generated
     */
    EClass UI_ACTION_MODULE = eINSTANCE.getUIActionModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_ACTION_MODULE__NAME = eINSTANCE.getUIActionModule_Name();

    /**
     * The meta object literal for the '<em><b>Ui Action Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_ACTION_MODULE__UI_ACTION_FEATURES = eINSTANCE.getUIActionModule_UiActionFeatures();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ControllerElementImpl <em>Controller Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ControllerElementImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getControllerElement()
     * @generated
     */
    EClass CONTROLLER_ELEMENT = eINSTANCE.getControllerElement();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ControllerModuleImpl <em>Controller Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ControllerModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getControllerModule()
     * @generated
     */
    EClass CONTROLLER_MODULE = eINSTANCE.getControllerModule();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER_MODULE__ELEMENTS = eINSTANCE.getControllerModule_Elements();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ScreenModuleImpl <em>Screen Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ScreenModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenModule()
     * @generated
     */
    EClass SCREEN_MODULE = eINSTANCE.getScreenModule();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.ScreenFeatureImpl <em>Screen Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.ScreenFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getScreenFeature()
     * @generated
     */
    EClass SCREEN_FEATURE = eINSTANCE.getScreenFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN_FEATURE__NAME = eINSTANCE.getScreenFeature_Name();

    /**
     * The meta object literal for the '<em><b>Screen Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_FEATURE__SCREEN_MODULES = eINSTANCE.getScreenFeature_ScreenModules();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.MainFeatureOptionImpl <em>Main Feature Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.MainFeatureOptionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMainFeatureOption()
     * @generated
     */
    EClass MAIN_FEATURE_OPTION = eINSTANCE.getMainFeatureOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_FEATURE_OPTION__NAME = eINSTANCE.getMainFeatureOption_Name();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.MainFeatureImpl <em>Main Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.MainFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getMainFeature()
     * @generated
     */
    EClass MAIN_FEATURE = eINSTANCE.getMainFeature();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_FEATURE__FEATURES = eINSTANCE.getMainFeature_Features();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.UIFeatureImpl <em>UI Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.UIFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIFeature()
     * @generated
     */
    EClass UI_FEATURE = eINSTANCE.getUIFeature();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.UIModuleImpl <em>UI Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.UIModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIModule()
     * @generated
     */
    EClass UI_MODULE = eINSTANCE.getUIModule();

    /**
     * The meta object literal for the '<em><b>Ui Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_MODULE__UI_FEATURES = eINSTANCE.getUIModule_UiFeatures();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureTypeImpl <em>Business Feature Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.BusinessFeatureTypeImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessFeatureType()
     * @generated
     */
    EClass BUSINESS_FEATURE_TYPE = eINSTANCE.getBusinessFeatureType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl <em>Business Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessFeature()
     * @generated
     */
    EClass BUSINESS_FEATURE = eINSTANCE.getBusinessFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_FEATURE__NAME = eINSTANCE.getBusinessFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_FEATURE__TYPE = eINSTANCE.getBusinessFeature_Type();

    /**
     * The meta object literal for the '<em><b>Connect Point1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_FEATURE__CONNECT_POINT1 = eINSTANCE.getBusinessFeature_ConnectPoint1();

    /**
     * The meta object literal for the '<em><b>Connect Point2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_FEATURE__CONNECT_POINT2 = eINSTANCE.getBusinessFeature_ConnectPoint2();

    /**
     * The meta object literal for the '<em><b>Connect End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_FEATURE__CONNECT_END = eINSTANCE.getBusinessFeature_ConnectEnd();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.BusinessFeaturesImpl <em>Business Features</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.BusinessFeaturesImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessFeatures()
     * @generated
     */
    EClass BUSINESS_FEATURES = eINSTANCE.getBusinessFeatures();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_FEATURES__FEATURES = eINSTANCE.getBusinessFeatures_Features();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.BusinessModuleImpl <em>Business Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.BusinessModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getBusinessModule()
     * @generated
     */
    EClass BUSINESS_MODULE = eINSTANCE.getBusinessModule();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SystemModuleImpl <em>System Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SystemModuleImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSystemModule()
     * @generated
     */
    EClass SYSTEM_MODULE = eINSTANCE.getSystemModule();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.impl.SystemDefinitionImpl <em>System Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.impl.SystemDefinitionImpl
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getSystemDefinition()
     * @generated
     */
    EClass SYSTEM_DEFINITION = eINSTANCE.getSystemDefinition();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_DEFINITION__MODULES = eINSTANCE.getSystemDefinition_Modules();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.ContentElementLiteral <em>Content Element Literal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.ContentElementLiteral
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContentElementLiteral()
     * @generated
     */
    EEnum CONTENT_ELEMENT_LITERAL = eINSTANCE.getContentElementLiteral();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.PropertyNameLiteral <em>Property Name Literal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.PropertyNameLiteral
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getPropertyNameLiteral()
     * @generated
     */
    EEnum PROPERTY_NAME_LITERAL = eINSTANCE.getPropertyNameLiteral();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.ContainerElementLiteral <em>Container Element Literal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.ContainerElementLiteral
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getContainerElementLiteral()
     * @generated
     */
    EEnum CONTAINER_ELEMENT_LITERAL = eINSTANCE.getContainerElementLiteral();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.domainmodel.UIElementReceiverKey <em>UI Element Receiver Key</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.domainmodel.UIElementReceiverKey
     * @see org.example.domainmodel.domainmodel.impl.DomainmodelPackageImpl#getUIElementReceiverKey()
     * @generated
     */
    EEnum UI_ELEMENT_RECEIVER_KEY = eINSTANCE.getUIElementReceiverKey();

  }

} //DomainmodelPackage
