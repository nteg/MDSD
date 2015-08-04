/**
 */
package com.nagarro.appBuilderDSL;

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
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLFactory
 * @model kind="package"
 * @generated
 */
public interface AppBuilderDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "appBuilderDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nagarro.com/AppBuilderDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "appBuilderDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AppBuilderDSLPackage eINSTANCE = com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.AppBuilderImpl <em>App Builder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAppBuilder()
   * @generated
   */
  int APP_BUILDER = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_BUILDER__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>App Builder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_BUILDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.AbstractElementImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAbstractElement()
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
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.NamespaceDeclationImpl <em>Namespace Declation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.NamespaceDeclationImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getNamespaceDeclation()
   * @generated
   */
  int NAMESPACE_DECLATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLATION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Namespace Declation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.SystemImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Business</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__BUSINESS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ui</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__UI = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.BusinessImpl <em>Business</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.BusinessImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getBusiness()
   * @generated
   */
  int BUSINESS = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Business</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ServiceImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getService()
   * @generated
   */
  int SERVICE = 5;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.InstanceServiceImpl <em>Instance Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.InstanceServiceImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getInstanceService()
   * @generated
   */
  int INSTANCE_SERVICE = 6;

  /**
   * The feature id for the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SERVICE__INSTANCE_NAME = SERVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.UiImpl <em>Ui</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.UiImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getUi()
   * @generated
   */
  int UI = 7;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI__MAIN = 0;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI__SERVICES = 1;

  /**
   * The feature id for the '<em><b>Screens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI__SCREENS = 2;

  /**
   * The number of structural features of the '<em>Ui</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.MainImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getMain()
   * @generated
   */
  int MAIN = 8;

  /**
   * The feature id for the '<em><b>App Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__APP_NAME = 0;

  /**
   * The feature id for the '<em><b>App Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__APP_VERSION = 1;

  /**
   * The feature id for the '<em><b>Devices</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__DEVICES = 2;

  /**
   * The feature id for the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__SCREEN = 3;

  /**
   * The feature id for the '<em><b>General Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__GENERAL_STYLE = 4;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ScreenImpl <em>Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ScreenImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getScreen()
   * @generated
   */
  int SCREEN = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN__NAME = 0;

  /**
   * The number of structural features of the '<em>Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.SimpleScreenImpl <em>Simple Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.SimpleScreenImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSimpleScreen()
   * @generated
   */
  int SIMPLE_SCREEN = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCREEN__NAME = SCREEN__NAME;

  /**
   * The feature id for the '<em><b>Entry Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCREEN__ENTRY_PARAMETERS = SCREEN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCREEN__MODEL = SCREEN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCREEN__VIEW = SCREEN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Controller</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCREEN__CONTROLLER = SCREEN_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Simple Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCREEN_FEATURE_COUNT = SCREEN_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.EntryParametersImpl <em>Entry Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.EntryParametersImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getEntryParameters()
   * @generated
   */
  int ENTRY_PARAMETERS = 11;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_PARAMETERS__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Entry Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ControllerImpl <em>Controller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ControllerImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getController()
   * @generated
   */
  int CONTROLLER = 12;

  /**
   * The feature id for the '<em><b>Init Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__INIT_ACTION = 0;

  /**
   * The feature id for the '<em><b>Validator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__VALIDATOR = 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__ACTIONS = 2;

  /**
   * The number of structural features of the '<em>Controller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.InitActionImpl <em>Init Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.InitActionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getInitAction()
   * @generated
   */
  int INIT_ACTION = 13;

  /**
   * The feature id for the '<em><b>Databindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION__DATABINDINGS = 0;

  /**
   * The feature id for the '<em><b>Ui Listener Bindingss</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION__UI_LISTENER_BINDINGSS = 1;

  /**
   * The feature id for the '<em><b>Validation Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION__VALIDATION_BINDINGS = 2;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION__INSTRUCTIONS = 3;

  /**
   * The number of structural features of the '<em>Init Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ValidationBindingImpl <em>Validation Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ValidationBindingImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getValidationBinding()
   * @generated
   */
  int VALIDATION_BINDING = 14;

  /**
   * The feature id for the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_BINDING__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_BINDING__CONTROL = 1;

  /**
   * The feature id for the '<em><b>Control Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_BINDING__CONTROL_ACCESS = 2;

  /**
   * The number of structural features of the '<em>Validation Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.UiListenerBindingImpl <em>Ui Listener Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.UiListenerBindingImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getUiListenerBinding()
   * @generated
   */
  int UI_LISTENER_BINDING = 15;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_LISTENER_BINDING__ACTION = 0;

  /**
   * The feature id for the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_LISTENER_BINDING__CONTROL = 1;

  /**
   * The feature id for the '<em><b>Control Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_LISTENER_BINDING__CONTROL_ACCESS = 2;

  /**
   * The number of structural features of the '<em>Ui Listener Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_LISTENER_BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.DataBindingImpl <em>Data Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.DataBindingImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDataBinding()
   * @generated
   */
  int DATA_BINDING = 16;

  /**
   * The feature id for the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__CONTROL = 0;

  /**
   * The feature id for the '<em><b>Control Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING__CONTROL_ACCESS = 1;

  /**
   * The number of structural features of the '<em>Data Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.SimpleDataBindingImpl <em>Simple Data Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.SimpleDataBindingImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSimpleDataBinding()
   * @generated
   */
  int SIMPLE_DATA_BINDING = 17;

  /**
   * The feature id for the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATA_BINDING__CONTROL = DATA_BINDING__CONTROL;

  /**
   * The feature id for the '<em><b>Control Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATA_BINDING__CONTROL_ACCESS = DATA_BINDING__CONTROL_ACCESS;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATA_BINDING__MODEL = DATA_BINDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATA_BINDING__MODEL_ACCESS = DATA_BINDING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Data Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATA_BINDING_FEATURE_COUNT = DATA_BINDING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.EnumDataBindingImpl <em>Enum Data Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.EnumDataBindingImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getEnumDataBinding()
   * @generated
   */
  int ENUM_DATA_BINDING = 18;

  /**
   * The feature id for the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DATA_BINDING__CONTROL = DATA_BINDING__CONTROL;

  /**
   * The feature id for the '<em><b>Control Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DATA_BINDING__CONTROL_ACCESS = DATA_BINDING__CONTROL_ACCESS;

  /**
   * The feature id for the '<em><b>Enum Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DATA_BINDING__ENUM_CLASS_NAME = DATA_BINDING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Data Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DATA_BINDING_FEATURE_COUNT = DATA_BINDING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ValidatorImpl <em>Validator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ValidatorImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getValidator()
   * @generated
   */
  int VALIDATOR = 19;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR__CONDITIONS = 0;

  /**
   * The number of structural features of the '<em>Validator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ConditionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ConditionExpressionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getConditionExpression()
   * @generated
   */
  int CONDITION_EXPRESSION = 21;

  /**
   * The number of structural features of the '<em>Condition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.SimpleConditionExpressionImpl <em>Simple Condition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.SimpleConditionExpressionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSimpleConditionExpression()
   * @generated
   */
  int SIMPLE_CONDITION_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CONDITION_EXPRESSION__VARIABLE_NAME = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Condition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CONDITION_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.CompositeConditionExpressionImpl <em>Composite Condition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.CompositeConditionExpressionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getCompositeConditionExpression()
   * @generated
   */
  int COMPOSITE_CONDITION_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_CONDITION_EXPRESSION__CONDITIONS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composite Condition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_CONDITION_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ActionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 24;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.UiActionImpl <em>Ui Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.UiActionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getUiAction()
   * @generated
   */
  int UI_ACTION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ACTION__NAME = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ACTION__INSTRUCTIONS = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ui Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.InstructionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 26;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.SetInstructionImpl <em>Set Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.SetInstructionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSetInstruction()
   * @generated
   */
  int SET_INSTRUCTION = 27;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_INSTRUCTION__MODEL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_INSTRUCTION__MODEL_ACCESS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_INSTRUCTION__ASSIGNMENT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Set Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.NavigateImpl <em>Navigate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.NavigateImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getNavigate()
   * @generated
   */
  int NAVIGATE = 28;

  /**
   * The feature id for the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE__SCREEN = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE__PARAMS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Navigate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ExecuteActionImpl <em>Execute Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ExecuteActionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getExecuteAction()
   * @generated
   */
  int EXECUTE_ACTION = 29;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_ACTION__ACTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Execute Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_ACTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.SetInstructionAssignmentImpl <em>Set Instruction Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.SetInstructionAssignmentImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSetInstructionAssignment()
   * @generated
   */
  int SET_INSTRUCTION_ASSIGNMENT = 30;

  /**
   * The number of structural features of the '<em>Set Instruction Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.RestCallImpl <em>Rest Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.RestCallImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getRestCall()
   * @generated
   */
  int REST_CALL = 31;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_CALL__URL = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rest Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_CALL_FEATURE_COUNT = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ControlValueImpl <em>Control Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ControlValueImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getControlValue()
   * @generated
   */
  int CONTROL_VALUE = 32;

  /**
   * The feature id for the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_VALUE__CONTROL = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Control Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_VALUE__CONTROL_ACCESS = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Control Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_VALUE_FEATURE_COUNT = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ModelImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 33;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ViewImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getView()
   * @generated
   */
  int VIEW = 34;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__LAYOUTS = 0;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ControlImpl <em>Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ControlImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getControl()
   * @generated
   */
  int CONTROL = 38;

  /**
   * The number of structural features of the '<em>Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.LayoutImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 35;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__CONTROLS = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__TYPE = CONTROL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.GridLayoutImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getGridLayout()
   * @generated
   */
  int GRID_LAYOUT = 36;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__CONTROLS = LAYOUT__CONTROLS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__TYPE = LAYOUT__TYPE;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT__COLUMNS = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Grid Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.RowLayoutImpl <em>Row Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.RowLayoutImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getRowLayout()
   * @generated
   */
  int ROW_LAYOUT = 37;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_LAYOUT__CONTROLS = LAYOUT__CONTROLS;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_LAYOUT__TYPE = LAYOUT__TYPE;

  /**
   * The number of structural features of the '<em>Row Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ScreenLayoutImpl <em>Screen Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ScreenLayoutImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getScreenLayout()
   * @generated
   */
  int SCREEN_LAYOUT = 39;

  /**
   * The feature id for the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LAYOUT__SCREEN = CONTROL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Screen Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREEN_LAYOUT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ListImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getList()
   * @generated
   */
  int LIST = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Labelprovider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__LABELPROVIDER = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Css Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__CSS_STYLE = CONTROL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tooltip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__TOOLTIP = CONTROL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ValueImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getValue()
   * @generated
   */
  int VALUE = 41;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.DynamicValueImpl <em>Dynamic Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.DynamicValueImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDynamicValue()
   * @generated
   */
  int DYNAMIC_VALUE = 42;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_VALUE__VARIABLE_NAME = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_VALUE__TYPE = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_VALUE__EXPRESSION = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dynamic Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_VALUE_FEATURE_COUNT = SET_INSTRUCTION_ASSIGNMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ExpressionImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Terms</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TERMS = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.TextImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getText()
   * @generated
   */
  int TEXT = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Css Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__CSS_STYLE = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Resource Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__RESOURCE_KEY = CONTROL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ButtonImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Css Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__CSS_STYLE = CONTROL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Resource Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__RESOURCE_KEY = CONTROL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.LabelImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = CONTROL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__RESOURCE_KEY = CONTROL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.AttributeImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.CompositeScreenImpl <em>Composite Screen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.CompositeScreenImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getCompositeScreen()
   * @generated
   */
  int COMPOSITE_SCREEN = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SCREEN__NAME = SCREEN__NAME;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SCREEN__LAYOUTS = SCREEN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composite Screen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SCREEN_FEATURE_COUNT = SCREEN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.ImportImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 49;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.TypeImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.DataTypeImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.EntityImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.impl.FeatureImpl
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 53;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.nagarro.appBuilderDSL.Device <em>Device</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.nagarro.appBuilderDSL.Device
   * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 54;


  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.AppBuilder <em>App Builder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>App Builder</em>'.
   * @see com.nagarro.appBuilderDSL.AppBuilder
   * @generated
   */
  EClass getAppBuilder();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.AppBuilder#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.nagarro.appBuilderDSL.AppBuilder#getElements()
   * @see #getAppBuilder()
   * @generated
   */
  EReference getAppBuilder_Elements();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see com.nagarro.appBuilderDSL.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.NamespaceDeclation <em>Namespace Declation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Declation</em>'.
   * @see com.nagarro.appBuilderDSL.NamespaceDeclation
   * @generated
   */
  EClass getNamespaceDeclation();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see com.nagarro.appBuilderDSL.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.System#getBusiness <em>Business</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Business</em>'.
   * @see com.nagarro.appBuilderDSL.System#getBusiness()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Business();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.System#getUi <em>Ui</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ui</em>'.
   * @see com.nagarro.appBuilderDSL.System#getUi()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Ui();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Business <em>Business</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business</em>'.
   * @see com.nagarro.appBuilderDSL.Business
   * @generated
   */
  EClass getBusiness();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Business#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.nagarro.appBuilderDSL.Business#getElements()
   * @see #getBusiness()
   * @generated
   */
  EReference getBusiness_Elements();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see com.nagarro.appBuilderDSL.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.InstanceService <em>Instance Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Service</em>'.
   * @see com.nagarro.appBuilderDSL.InstanceService
   * @generated
   */
  EClass getInstanceService();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.InstanceService#getInstanceName <em>Instance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Name</em>'.
   * @see com.nagarro.appBuilderDSL.InstanceService#getInstanceName()
   * @see #getInstanceService()
   * @generated
   */
  EAttribute getInstanceService_InstanceName();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Ui <em>Ui</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui</em>'.
   * @see com.nagarro.appBuilderDSL.Ui
   * @generated
   */
  EClass getUi();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Ui#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see com.nagarro.appBuilderDSL.Ui#getMain()
   * @see #getUi()
   * @generated
   */
  EReference getUi_Main();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Ui#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see com.nagarro.appBuilderDSL.Ui#getServices()
   * @see #getUi()
   * @generated
   */
  EReference getUi_Services();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Ui#getScreens <em>Screens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Screens</em>'.
   * @see com.nagarro.appBuilderDSL.Ui#getScreens()
   * @see #getUi()
   * @generated
   */
  EReference getUi_Screens();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see com.nagarro.appBuilderDSL.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Main#getAppName <em>App Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>App Name</em>'.
   * @see com.nagarro.appBuilderDSL.Main#getAppName()
   * @see #getMain()
   * @generated
   */
  EAttribute getMain_AppName();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Main#getAppVersion <em>App Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>App Version</em>'.
   * @see com.nagarro.appBuilderDSL.Main#getAppVersion()
   * @see #getMain()
   * @generated
   */
  EAttribute getMain_AppVersion();

  /**
   * Returns the meta object for the attribute list '{@link com.nagarro.appBuilderDSL.Main#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Devices</em>'.
   * @see com.nagarro.appBuilderDSL.Main#getDevices()
   * @see #getMain()
   * @generated
   */
  EAttribute getMain_Devices();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.Main#getScreen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screen</em>'.
   * @see com.nagarro.appBuilderDSL.Main#getScreen()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Screen();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Main#getGeneralStyle <em>General Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>General Style</em>'.
   * @see com.nagarro.appBuilderDSL.Main#getGeneralStyle()
   * @see #getMain()
   * @generated
   */
  EAttribute getMain_GeneralStyle();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Screen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen</em>'.
   * @see com.nagarro.appBuilderDSL.Screen
   * @generated
   */
  EClass getScreen();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Screen#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Screen#getName()
   * @see #getScreen()
   * @generated
   */
  EAttribute getScreen_Name();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.SimpleScreen <em>Simple Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Screen</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleScreen
   * @generated
   */
  EClass getSimpleScreen();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.SimpleScreen#getEntryParameters <em>Entry Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry Parameters</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleScreen#getEntryParameters()
   * @see #getSimpleScreen()
   * @generated
   */
  EReference getSimpleScreen_EntryParameters();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.SimpleScreen#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleScreen#getModel()
   * @see #getSimpleScreen()
   * @generated
   */
  EReference getSimpleScreen_Model();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.SimpleScreen#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleScreen#getView()
   * @see #getSimpleScreen()
   * @generated
   */
  EReference getSimpleScreen_View();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.SimpleScreen#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Controller</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleScreen#getController()
   * @see #getSimpleScreen()
   * @generated
   */
  EReference getSimpleScreen_Controller();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.EntryParameters <em>Entry Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Parameters</em>'.
   * @see com.nagarro.appBuilderDSL.EntryParameters
   * @generated
   */
  EClass getEntryParameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.EntryParameters#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.nagarro.appBuilderDSL.EntryParameters#getAttributes()
   * @see #getEntryParameters()
   * @generated
   */
  EReference getEntryParameters_Attributes();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller</em>'.
   * @see com.nagarro.appBuilderDSL.Controller
   * @generated
   */
  EClass getController();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Controller#getInitAction <em>Init Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init Action</em>'.
   * @see com.nagarro.appBuilderDSL.Controller#getInitAction()
   * @see #getController()
   * @generated
   */
  EReference getController_InitAction();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Controller#getValidator <em>Validator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validator</em>'.
   * @see com.nagarro.appBuilderDSL.Controller#getValidator()
   * @see #getController()
   * @generated
   */
  EReference getController_Validator();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Controller#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.nagarro.appBuilderDSL.Controller#getActions()
   * @see #getController()
   * @generated
   */
  EReference getController_Actions();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.InitAction <em>Init Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Action</em>'.
   * @see com.nagarro.appBuilderDSL.InitAction
   * @generated
   */
  EClass getInitAction();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.InitAction#getDatabindings <em>Databindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Databindings</em>'.
   * @see com.nagarro.appBuilderDSL.InitAction#getDatabindings()
   * @see #getInitAction()
   * @generated
   */
  EReference getInitAction_Databindings();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.InitAction#getUiListenerBindingss <em>Ui Listener Bindingss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ui Listener Bindingss</em>'.
   * @see com.nagarro.appBuilderDSL.InitAction#getUiListenerBindingss()
   * @see #getInitAction()
   * @generated
   */
  EReference getInitAction_UiListenerBindingss();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.InitAction#getValidationBindings <em>Validation Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Validation Bindings</em>'.
   * @see com.nagarro.appBuilderDSL.InitAction#getValidationBindings()
   * @see #getInitAction()
   * @generated
   */
  EReference getInitAction_ValidationBindings();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.InitAction#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see com.nagarro.appBuilderDSL.InitAction#getInstructions()
   * @see #getInitAction()
   * @generated
   */
  EReference getInitAction_Instructions();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.ValidationBinding <em>Validation Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validation Binding</em>'.
   * @see com.nagarro.appBuilderDSL.ValidationBinding
   * @generated
   */
  EClass getValidationBinding();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.ValidationBinding#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Condition</em>'.
   * @see com.nagarro.appBuilderDSL.ValidationBinding#getCondition()
   * @see #getValidationBinding()
   * @generated
   */
  EReference getValidationBinding_Condition();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.ValidationBinding#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Control</em>'.
   * @see com.nagarro.appBuilderDSL.ValidationBinding#getControl()
   * @see #getValidationBinding()
   * @generated
   */
  EReference getValidationBinding_Control();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.ValidationBinding#getControlAccess <em>Control Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Access</em>'.
   * @see com.nagarro.appBuilderDSL.ValidationBinding#getControlAccess()
   * @see #getValidationBinding()
   * @generated
   */
  EAttribute getValidationBinding_ControlAccess();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.UiListenerBinding <em>Ui Listener Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Listener Binding</em>'.
   * @see com.nagarro.appBuilderDSL.UiListenerBinding
   * @generated
   */
  EClass getUiListenerBinding();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.UiListenerBinding#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see com.nagarro.appBuilderDSL.UiListenerBinding#getAction()
   * @see #getUiListenerBinding()
   * @generated
   */
  EReference getUiListenerBinding_Action();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.UiListenerBinding#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Control</em>'.
   * @see com.nagarro.appBuilderDSL.UiListenerBinding#getControl()
   * @see #getUiListenerBinding()
   * @generated
   */
  EReference getUiListenerBinding_Control();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.UiListenerBinding#getControlAccess <em>Control Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Access</em>'.
   * @see com.nagarro.appBuilderDSL.UiListenerBinding#getControlAccess()
   * @see #getUiListenerBinding()
   * @generated
   */
  EAttribute getUiListenerBinding_ControlAccess();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.DataBinding <em>Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Binding</em>'.
   * @see com.nagarro.appBuilderDSL.DataBinding
   * @generated
   */
  EClass getDataBinding();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.DataBinding#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Control</em>'.
   * @see com.nagarro.appBuilderDSL.DataBinding#getControl()
   * @see #getDataBinding()
   * @generated
   */
  EReference getDataBinding_Control();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.DataBinding#getControlAccess <em>Control Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Access</em>'.
   * @see com.nagarro.appBuilderDSL.DataBinding#getControlAccess()
   * @see #getDataBinding()
   * @generated
   */
  EAttribute getDataBinding_ControlAccess();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.SimpleDataBinding <em>Simple Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Data Binding</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleDataBinding
   * @generated
   */
  EClass getSimpleDataBinding();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.SimpleDataBinding#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleDataBinding#getModel()
   * @see #getSimpleDataBinding()
   * @generated
   */
  EReference getSimpleDataBinding_Model();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.SimpleDataBinding#getModelAccess <em>Model Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Access</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleDataBinding#getModelAccess()
   * @see #getSimpleDataBinding()
   * @generated
   */
  EAttribute getSimpleDataBinding_ModelAccess();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.EnumDataBinding <em>Enum Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Data Binding</em>'.
   * @see com.nagarro.appBuilderDSL.EnumDataBinding
   * @generated
   */
  EClass getEnumDataBinding();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.EnumDataBinding#getEnumClassName <em>Enum Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum Class Name</em>'.
   * @see com.nagarro.appBuilderDSL.EnumDataBinding#getEnumClassName()
   * @see #getEnumDataBinding()
   * @generated
   */
  EAttribute getEnumDataBinding_EnumClassName();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Validator <em>Validator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator</em>'.
   * @see com.nagarro.appBuilderDSL.Validator
   * @generated
   */
  EClass getValidator();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Validator#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see com.nagarro.appBuilderDSL.Validator#getConditions()
   * @see #getValidator()
   * @generated
   */
  EReference getValidator_Conditions();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see com.nagarro.appBuilderDSL.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Condition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Condition#getName()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Condition#getConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition Expression</em>'.
   * @see com.nagarro.appBuilderDSL.Condition#getConditionExpression()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionExpression();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.ConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Expression</em>'.
   * @see com.nagarro.appBuilderDSL.ConditionExpression
   * @generated
   */
  EClass getConditionExpression();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.SimpleConditionExpression <em>Simple Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Condition Expression</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleConditionExpression
   * @generated
   */
  EClass getSimpleConditionExpression();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.SimpleConditionExpression#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see com.nagarro.appBuilderDSL.SimpleConditionExpression#getVariableName()
   * @see #getSimpleConditionExpression()
   * @generated
   */
  EAttribute getSimpleConditionExpression_VariableName();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.CompositeConditionExpression <em>Composite Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Condition Expression</em>'.
   * @see com.nagarro.appBuilderDSL.CompositeConditionExpression
   * @generated
   */
  EClass getCompositeConditionExpression();

  /**
   * Returns the meta object for the reference list '{@link com.nagarro.appBuilderDSL.CompositeConditionExpression#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conditions</em>'.
   * @see com.nagarro.appBuilderDSL.CompositeConditionExpression#getConditions()
   * @see #getCompositeConditionExpression()
   * @generated
   */
  EReference getCompositeConditionExpression_Conditions();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see com.nagarro.appBuilderDSL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.UiAction <em>Ui Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Action</em>'.
   * @see com.nagarro.appBuilderDSL.UiAction
   * @generated
   */
  EClass getUiAction();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.UiAction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.UiAction#getName()
   * @see #getUiAction()
   * @generated
   */
  EAttribute getUiAction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.UiAction#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see com.nagarro.appBuilderDSL.UiAction#getInstructions()
   * @see #getUiAction()
   * @generated
   */
  EReference getUiAction_Instructions();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.nagarro.appBuilderDSL.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.SetInstruction <em>Set Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Instruction</em>'.
   * @see com.nagarro.appBuilderDSL.SetInstruction
   * @generated
   */
  EClass getSetInstruction();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.SetInstruction#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see com.nagarro.appBuilderDSL.SetInstruction#getModel()
   * @see #getSetInstruction()
   * @generated
   */
  EReference getSetInstruction_Model();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.SetInstruction#getModelAccess <em>Model Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Access</em>'.
   * @see com.nagarro.appBuilderDSL.SetInstruction#getModelAccess()
   * @see #getSetInstruction()
   * @generated
   */
  EAttribute getSetInstruction_ModelAccess();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.SetInstruction#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see com.nagarro.appBuilderDSL.SetInstruction#getAssignment()
   * @see #getSetInstruction()
   * @generated
   */
  EReference getSetInstruction_Assignment();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Navigate <em>Navigate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigate</em>'.
   * @see com.nagarro.appBuilderDSL.Navigate
   * @generated
   */
  EClass getNavigate();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.Navigate#getScreen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screen</em>'.
   * @see com.nagarro.appBuilderDSL.Navigate#getScreen()
   * @see #getNavigate()
   * @generated
   */
  EReference getNavigate_Screen();

  /**
   * Returns the meta object for the attribute list '{@link com.nagarro.appBuilderDSL.Navigate#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.nagarro.appBuilderDSL.Navigate#getParams()
   * @see #getNavigate()
   * @generated
   */
  EAttribute getNavigate_Params();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.ExecuteAction <em>Execute Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execute Action</em>'.
   * @see com.nagarro.appBuilderDSL.ExecuteAction
   * @generated
   */
  EClass getExecuteAction();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.ExecuteAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see com.nagarro.appBuilderDSL.ExecuteAction#getAction()
   * @see #getExecuteAction()
   * @generated
   */
  EReference getExecuteAction_Action();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.SetInstructionAssignment <em>Set Instruction Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Instruction Assignment</em>'.
   * @see com.nagarro.appBuilderDSL.SetInstructionAssignment
   * @generated
   */
  EClass getSetInstructionAssignment();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.RestCall <em>Rest Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest Call</em>'.
   * @see com.nagarro.appBuilderDSL.RestCall
   * @generated
   */
  EClass getRestCall();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.RestCall#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.nagarro.appBuilderDSL.RestCall#getUrl()
   * @see #getRestCall()
   * @generated
   */
  EAttribute getRestCall_Url();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.ControlValue <em>Control Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Value</em>'.
   * @see com.nagarro.appBuilderDSL.ControlValue
   * @generated
   */
  EClass getControlValue();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.ControlValue#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Control</em>'.
   * @see com.nagarro.appBuilderDSL.ControlValue#getControl()
   * @see #getControlValue()
   * @generated
   */
  EReference getControlValue_Control();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.ControlValue#getControlAccess <em>Control Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Access</em>'.
   * @see com.nagarro.appBuilderDSL.ControlValue#getControlAccess()
   * @see #getControlValue()
   * @generated
   */
  EAttribute getControlValue_ControlAccess();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.nagarro.appBuilderDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Model#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.nagarro.appBuilderDSL.Model#getAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Attributes();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see com.nagarro.appBuilderDSL.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.View#getLayouts <em>Layouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layouts</em>'.
   * @see com.nagarro.appBuilderDSL.View#getLayouts()
   * @see #getView()
   * @generated
   */
  EReference getView_Layouts();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see com.nagarro.appBuilderDSL.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Layout#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controls</em>'.
   * @see com.nagarro.appBuilderDSL.Layout#getControls()
   * @see #getLayout()
   * @generated
   */
  EReference getLayout_Controls();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Layout#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.nagarro.appBuilderDSL.Layout#getType()
   * @see #getLayout()
   * @generated
   */
  EAttribute getLayout_Type();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.GridLayout <em>Grid Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid Layout</em>'.
   * @see com.nagarro.appBuilderDSL.GridLayout
   * @generated
   */
  EClass getGridLayout();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.GridLayout#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see com.nagarro.appBuilderDSL.GridLayout#getColumns()
   * @see #getGridLayout()
   * @generated
   */
  EAttribute getGridLayout_Columns();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.RowLayout <em>Row Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row Layout</em>'.
   * @see com.nagarro.appBuilderDSL.RowLayout
   * @generated
   */
  EClass getRowLayout();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Control <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control</em>'.
   * @see com.nagarro.appBuilderDSL.Control
   * @generated
   */
  EClass getControl();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.ScreenLayout <em>Screen Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screen Layout</em>'.
   * @see com.nagarro.appBuilderDSL.ScreenLayout
   * @generated
   */
  EClass getScreenLayout();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.ScreenLayout#getScreen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screen</em>'.
   * @see com.nagarro.appBuilderDSL.ScreenLayout#getScreen()
   * @see #getScreenLayout()
   * @generated
   */
  EReference getScreenLayout_Screen();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see com.nagarro.appBuilderDSL.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.List#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.List#getName()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.List#getLabelprovider <em>Labelprovider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Labelprovider</em>'.
   * @see com.nagarro.appBuilderDSL.List#getLabelprovider()
   * @see #getList()
   * @generated
   */
  EReference getList_Labelprovider();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.List#getCssStyle <em>Css Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Css Style</em>'.
   * @see com.nagarro.appBuilderDSL.List#getCssStyle()
   * @see #getList()
   * @generated
   */
  EReference getList_CssStyle();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.List#getTooltip <em>Tooltip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tooltip</em>'.
   * @see com.nagarro.appBuilderDSL.List#getTooltip()
   * @see #getList()
   * @generated
   */
  EReference getList_Tooltip();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.nagarro.appBuilderDSL.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.DynamicValue <em>Dynamic Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Value</em>'.
   * @see com.nagarro.appBuilderDSL.DynamicValue
   * @generated
   */
  EClass getDynamicValue();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.DynamicValue#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see com.nagarro.appBuilderDSL.DynamicValue#getVariableName()
   * @see #getDynamicValue()
   * @generated
   */
  EAttribute getDynamicValue_VariableName();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.DynamicValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.nagarro.appBuilderDSL.DynamicValue#getType()
   * @see #getDynamicValue()
   * @generated
   */
  EAttribute getDynamicValue_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.DynamicValue#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.nagarro.appBuilderDSL.DynamicValue#getExpression()
   * @see #getDynamicValue()
   * @generated
   */
  EReference getDynamicValue_Expression();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.nagarro.appBuilderDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute list '{@link com.nagarro.appBuilderDSL.Expression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Terms</em>'.
   * @see com.nagarro.appBuilderDSL.Expression#getTerms()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Terms();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see com.nagarro.appBuilderDSL.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Text#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Text#getName()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Text#getCssStyle <em>Css Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Css Style</em>'.
   * @see com.nagarro.appBuilderDSL.Text#getCssStyle()
   * @see #getText()
   * @generated
   */
  EReference getText_CssStyle();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Text#getResourceKey <em>Resource Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Key</em>'.
   * @see com.nagarro.appBuilderDSL.Text#getResourceKey()
   * @see #getText()
   * @generated
   */
  EReference getText_ResourceKey();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see com.nagarro.appBuilderDSL.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Button#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Button#getName()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Button#getCssStyle <em>Css Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Css Style</em>'.
   * @see com.nagarro.appBuilderDSL.Button#getCssStyle()
   * @see #getButton()
   * @generated
   */
  EReference getButton_CssStyle();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Button#getResourceKey <em>Resource Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Key</em>'.
   * @see com.nagarro.appBuilderDSL.Button#getResourceKey()
   * @see #getButton()
   * @generated
   */
  EReference getButton_ResourceKey();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see com.nagarro.appBuilderDSL.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.nagarro.appBuilderDSL.Label#getResourceKey <em>Resource Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Key</em>'.
   * @see com.nagarro.appBuilderDSL.Label#getResourceKey()
   * @see #getLabel()
   * @generated
   */
  EReference getLabel_ResourceKey();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.nagarro.appBuilderDSL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.nagarro.appBuilderDSL.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.CompositeScreen <em>Composite Screen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Screen</em>'.
   * @see com.nagarro.appBuilderDSL.CompositeScreen
   * @generated
   */
  EClass getCompositeScreen();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.CompositeScreen#getLayouts <em>Layouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layouts</em>'.
   * @see com.nagarro.appBuilderDSL.CompositeScreen#getLayouts()
   * @see #getCompositeScreen()
   * @generated
   */
  EReference getCompositeScreen_Layouts();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.nagarro.appBuilderDSL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.nagarro.appBuilderDSL.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.nagarro.appBuilderDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.nagarro.appBuilderDSL.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.nagarro.appBuilderDSL.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see com.nagarro.appBuilderDSL.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link com.nagarro.appBuilderDSL.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.nagarro.appBuilderDSL.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link com.nagarro.appBuilderDSL.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see com.nagarro.appBuilderDSL.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Feature#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see com.nagarro.appBuilderDSL.Feature#isMany()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link com.nagarro.appBuilderDSL.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.nagarro.appBuilderDSL.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the reference '{@link com.nagarro.appBuilderDSL.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.nagarro.appBuilderDSL.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for enum '{@link com.nagarro.appBuilderDSL.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Device</em>'.
   * @see com.nagarro.appBuilderDSL.Device
   * @generated
   */
  EEnum getDevice();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AppBuilderDSLFactory getAppBuilderDSLFactory();

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
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.AppBuilderImpl <em>App Builder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAppBuilder()
     * @generated
     */
    EClass APP_BUILDER = eINSTANCE.getAppBuilder();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APP_BUILDER__ELEMENTS = eINSTANCE.getAppBuilder_Elements();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.AbstractElementImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAbstractElement()
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
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.NamespaceDeclationImpl <em>Namespace Declation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.NamespaceDeclationImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getNamespaceDeclation()
     * @generated
     */
    EClass NAMESPACE_DECLATION = eINSTANCE.getNamespaceDeclation();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.SystemImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Business</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__BUSINESS = eINSTANCE.getSystem_Business();

    /**
     * The meta object literal for the '<em><b>Ui</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__UI = eINSTANCE.getSystem_Ui();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.BusinessImpl <em>Business</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.BusinessImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getBusiness()
     * @generated
     */
    EClass BUSINESS = eINSTANCE.getBusiness();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS__ELEMENTS = eINSTANCE.getBusiness_Elements();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ServiceImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.InstanceServiceImpl <em>Instance Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.InstanceServiceImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getInstanceService()
     * @generated
     */
    EClass INSTANCE_SERVICE = eINSTANCE.getInstanceService();

    /**
     * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE_SERVICE__INSTANCE_NAME = eINSTANCE.getInstanceService_InstanceName();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.UiImpl <em>Ui</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.UiImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getUi()
     * @generated
     */
    EClass UI = eINSTANCE.getUi();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI__MAIN = eINSTANCE.getUi_Main();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI__SERVICES = eINSTANCE.getUi_Services();

    /**
     * The meta object literal for the '<em><b>Screens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI__SCREENS = eINSTANCE.getUi_Screens();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.MainImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em><b>App Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN__APP_NAME = eINSTANCE.getMain_AppName();

    /**
     * The meta object literal for the '<em><b>App Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN__APP_VERSION = eINSTANCE.getMain_AppVersion();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN__DEVICES = eINSTANCE.getMain_Devices();

    /**
     * The meta object literal for the '<em><b>Screen</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__SCREEN = eINSTANCE.getMain_Screen();

    /**
     * The meta object literal for the '<em><b>General Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN__GENERAL_STYLE = eINSTANCE.getMain_GeneralStyle();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ScreenImpl <em>Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ScreenImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getScreen()
     * @generated
     */
    EClass SCREEN = eINSTANCE.getScreen();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCREEN__NAME = eINSTANCE.getScreen_Name();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.SimpleScreenImpl <em>Simple Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.SimpleScreenImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSimpleScreen()
     * @generated
     */
    EClass SIMPLE_SCREEN = eINSTANCE.getSimpleScreen();

    /**
     * The meta object literal for the '<em><b>Entry Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SCREEN__ENTRY_PARAMETERS = eINSTANCE.getSimpleScreen_EntryParameters();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SCREEN__MODEL = eINSTANCE.getSimpleScreen_Model();

    /**
     * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SCREEN__VIEW = eINSTANCE.getSimpleScreen_View();

    /**
     * The meta object literal for the '<em><b>Controller</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SCREEN__CONTROLLER = eINSTANCE.getSimpleScreen_Controller();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.EntryParametersImpl <em>Entry Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.EntryParametersImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getEntryParameters()
     * @generated
     */
    EClass ENTRY_PARAMETERS = eINSTANCE.getEntryParameters();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY_PARAMETERS__ATTRIBUTES = eINSTANCE.getEntryParameters_Attributes();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ControllerImpl <em>Controller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ControllerImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getController()
     * @generated
     */
    EClass CONTROLLER = eINSTANCE.getController();

    /**
     * The meta object literal for the '<em><b>Init Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__INIT_ACTION = eINSTANCE.getController_InitAction();

    /**
     * The meta object literal for the '<em><b>Validator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__VALIDATOR = eINSTANCE.getController_Validator();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__ACTIONS = eINSTANCE.getController_Actions();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.InitActionImpl <em>Init Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.InitActionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getInitAction()
     * @generated
     */
    EClass INIT_ACTION = eINSTANCE.getInitAction();

    /**
     * The meta object literal for the '<em><b>Databindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ACTION__DATABINDINGS = eINSTANCE.getInitAction_Databindings();

    /**
     * The meta object literal for the '<em><b>Ui Listener Bindingss</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ACTION__UI_LISTENER_BINDINGSS = eINSTANCE.getInitAction_UiListenerBindingss();

    /**
     * The meta object literal for the '<em><b>Validation Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ACTION__VALIDATION_BINDINGS = eINSTANCE.getInitAction_ValidationBindings();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ACTION__INSTRUCTIONS = eINSTANCE.getInitAction_Instructions();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ValidationBindingImpl <em>Validation Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ValidationBindingImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getValidationBinding()
     * @generated
     */
    EClass VALIDATION_BINDING = eINSTANCE.getValidationBinding();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATION_BINDING__CONDITION = eINSTANCE.getValidationBinding_Condition();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATION_BINDING__CONTROL = eINSTANCE.getValidationBinding_Control();

    /**
     * The meta object literal for the '<em><b>Control Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION_BINDING__CONTROL_ACCESS = eINSTANCE.getValidationBinding_ControlAccess();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.UiListenerBindingImpl <em>Ui Listener Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.UiListenerBindingImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getUiListenerBinding()
     * @generated
     */
    EClass UI_LISTENER_BINDING = eINSTANCE.getUiListenerBinding();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_LISTENER_BINDING__ACTION = eINSTANCE.getUiListenerBinding_Action();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_LISTENER_BINDING__CONTROL = eINSTANCE.getUiListenerBinding_Control();

    /**
     * The meta object literal for the '<em><b>Control Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_LISTENER_BINDING__CONTROL_ACCESS = eINSTANCE.getUiListenerBinding_ControlAccess();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.DataBindingImpl <em>Data Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.DataBindingImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDataBinding()
     * @generated
     */
    EClass DATA_BINDING = eINSTANCE.getDataBinding();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_BINDING__CONTROL = eINSTANCE.getDataBinding_Control();

    /**
     * The meta object literal for the '<em><b>Control Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_BINDING__CONTROL_ACCESS = eINSTANCE.getDataBinding_ControlAccess();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.SimpleDataBindingImpl <em>Simple Data Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.SimpleDataBindingImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSimpleDataBinding()
     * @generated
     */
    EClass SIMPLE_DATA_BINDING = eINSTANCE.getSimpleDataBinding();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_DATA_BINDING__MODEL = eINSTANCE.getSimpleDataBinding_Model();

    /**
     * The meta object literal for the '<em><b>Model Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_DATA_BINDING__MODEL_ACCESS = eINSTANCE.getSimpleDataBinding_ModelAccess();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.EnumDataBindingImpl <em>Enum Data Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.EnumDataBindingImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getEnumDataBinding()
     * @generated
     */
    EClass ENUM_DATA_BINDING = eINSTANCE.getEnumDataBinding();

    /**
     * The meta object literal for the '<em><b>Enum Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_DATA_BINDING__ENUM_CLASS_NAME = eINSTANCE.getEnumDataBinding_EnumClassName();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ValidatorImpl <em>Validator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ValidatorImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getValidator()
     * @generated
     */
    EClass VALIDATOR = eINSTANCE.getValidator();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR__CONDITIONS = eINSTANCE.getValidator_Conditions();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ConditionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

    /**
     * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION_EXPRESSION = eINSTANCE.getCondition_ConditionExpression();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ConditionExpressionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getConditionExpression()
     * @generated
     */
    EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.SimpleConditionExpressionImpl <em>Simple Condition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.SimpleConditionExpressionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSimpleConditionExpression()
     * @generated
     */
    EClass SIMPLE_CONDITION_EXPRESSION = eINSTANCE.getSimpleConditionExpression();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CONDITION_EXPRESSION__VARIABLE_NAME = eINSTANCE.getSimpleConditionExpression_VariableName();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.CompositeConditionExpressionImpl <em>Composite Condition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.CompositeConditionExpressionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getCompositeConditionExpression()
     * @generated
     */
    EClass COMPOSITE_CONDITION_EXPRESSION = eINSTANCE.getCompositeConditionExpression();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_CONDITION_EXPRESSION__CONDITIONS = eINSTANCE.getCompositeConditionExpression_Conditions();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ActionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.UiActionImpl <em>Ui Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.UiActionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getUiAction()
     * @generated
     */
    EClass UI_ACTION = eINSTANCE.getUiAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_ACTION__NAME = eINSTANCE.getUiAction_Name();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_ACTION__INSTRUCTIONS = eINSTANCE.getUiAction_Instructions();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.InstructionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.SetInstructionImpl <em>Set Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.SetInstructionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSetInstruction()
     * @generated
     */
    EClass SET_INSTRUCTION = eINSTANCE.getSetInstruction();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_INSTRUCTION__MODEL = eINSTANCE.getSetInstruction_Model();

    /**
     * The meta object literal for the '<em><b>Model Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_INSTRUCTION__MODEL_ACCESS = eINSTANCE.getSetInstruction_ModelAccess();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_INSTRUCTION__ASSIGNMENT = eINSTANCE.getSetInstruction_Assignment();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.NavigateImpl <em>Navigate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.NavigateImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getNavigate()
     * @generated
     */
    EClass NAVIGATE = eINSTANCE.getNavigate();

    /**
     * The meta object literal for the '<em><b>Screen</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATE__SCREEN = eINSTANCE.getNavigate_Screen();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAVIGATE__PARAMS = eINSTANCE.getNavigate_Params();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ExecuteActionImpl <em>Execute Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ExecuteActionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getExecuteAction()
     * @generated
     */
    EClass EXECUTE_ACTION = eINSTANCE.getExecuteAction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_ACTION__ACTION = eINSTANCE.getExecuteAction_Action();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.SetInstructionAssignmentImpl <em>Set Instruction Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.SetInstructionAssignmentImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getSetInstructionAssignment()
     * @generated
     */
    EClass SET_INSTRUCTION_ASSIGNMENT = eINSTANCE.getSetInstructionAssignment();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.RestCallImpl <em>Rest Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.RestCallImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getRestCall()
     * @generated
     */
    EClass REST_CALL = eINSTANCE.getRestCall();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST_CALL__URL = eINSTANCE.getRestCall_Url();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ControlValueImpl <em>Control Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ControlValueImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getControlValue()
     * @generated
     */
    EClass CONTROL_VALUE = eINSTANCE.getControlValue();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_VALUE__CONTROL = eINSTANCE.getControlValue_Control();

    /**
     * The meta object literal for the '<em><b>Control Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_VALUE__CONTROL_ACCESS = eINSTANCE.getControlValue_ControlAccess();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ModelImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ATTRIBUTES = eINSTANCE.getModel_Attributes();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ViewImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__LAYOUTS = eINSTANCE.getView_Layouts();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.LayoutImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT__CONTROLS = eINSTANCE.getLayout_Controls();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYOUT__TYPE = eINSTANCE.getLayout_Type();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.GridLayoutImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getGridLayout()
     * @generated
     */
    EClass GRID_LAYOUT = eINSTANCE.getGridLayout();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRID_LAYOUT__COLUMNS = eINSTANCE.getGridLayout_Columns();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.RowLayoutImpl <em>Row Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.RowLayoutImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getRowLayout()
     * @generated
     */
    EClass ROW_LAYOUT = eINSTANCE.getRowLayout();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ControlImpl <em>Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ControlImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getControl()
     * @generated
     */
    EClass CONTROL = eINSTANCE.getControl();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ScreenLayoutImpl <em>Screen Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ScreenLayoutImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getScreenLayout()
     * @generated
     */
    EClass SCREEN_LAYOUT = eINSTANCE.getScreenLayout();

    /**
     * The meta object literal for the '<em><b>Screen</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREEN_LAYOUT__SCREEN = eINSTANCE.getScreenLayout_Screen();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ListImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__NAME = eINSTANCE.getList_Name();

    /**
     * The meta object literal for the '<em><b>Labelprovider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__LABELPROVIDER = eINSTANCE.getList_Labelprovider();

    /**
     * The meta object literal for the '<em><b>Css Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__CSS_STYLE = eINSTANCE.getList_CssStyle();

    /**
     * The meta object literal for the '<em><b>Tooltip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__TOOLTIP = eINSTANCE.getList_Tooltip();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ValueImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.DynamicValueImpl <em>Dynamic Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.DynamicValueImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDynamicValue()
     * @generated
     */
    EClass DYNAMIC_VALUE = eINSTANCE.getDynamicValue();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_VALUE__VARIABLE_NAME = eINSTANCE.getDynamicValue_VariableName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_VALUE__TYPE = eINSTANCE.getDynamicValue_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_VALUE__EXPRESSION = eINSTANCE.getDynamicValue_Expression();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ExpressionImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__TERMS = eINSTANCE.getExpression_Terms();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.TextImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__NAME = eINSTANCE.getText_Name();

    /**
     * The meta object literal for the '<em><b>Css Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT__CSS_STYLE = eINSTANCE.getText_CssStyle();

    /**
     * The meta object literal for the '<em><b>Resource Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT__RESOURCE_KEY = eINSTANCE.getText_ResourceKey();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ButtonImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__NAME = eINSTANCE.getButton_Name();

    /**
     * The meta object literal for the '<em><b>Css Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__CSS_STYLE = eINSTANCE.getButton_CssStyle();

    /**
     * The meta object literal for the '<em><b>Resource Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__RESOURCE_KEY = eINSTANCE.getButton_ResourceKey();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.LabelImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '<em><b>Resource Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL__RESOURCE_KEY = eINSTANCE.getLabel_ResourceKey();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.AttributeImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.CompositeScreenImpl <em>Composite Screen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.CompositeScreenImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getCompositeScreen()
     * @generated
     */
    EClass COMPOSITE_SCREEN = eINSTANCE.getCompositeScreen();

    /**
     * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_SCREEN__LAYOUTS = eINSTANCE.getCompositeScreen_Layouts();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.ImportImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getImport()
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
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.TypeImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.DataTypeImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.EntityImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.impl.FeatureImpl
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MANY = eINSTANCE.getFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link com.nagarro.appBuilderDSL.Device <em>Device</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.nagarro.appBuilderDSL.Device
     * @see com.nagarro.appBuilderDSL.impl.AppBuilderDSLPackageImpl#getDevice()
     * @generated
     */
    EEnum DEVICE = eINSTANCE.getDevice();

  }

} //AppBuilderDSLPackage
