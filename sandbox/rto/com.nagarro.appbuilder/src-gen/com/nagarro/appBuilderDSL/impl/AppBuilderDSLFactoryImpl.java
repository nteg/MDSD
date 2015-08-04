/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AbstractElement;
import com.nagarro.appBuilderDSL.Action;
import com.nagarro.appBuilderDSL.AppBuilder;
import com.nagarro.appBuilderDSL.AppBuilderDSLFactory;
import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Attribute;
import com.nagarro.appBuilderDSL.Business;
import com.nagarro.appBuilderDSL.Button;
import com.nagarro.appBuilderDSL.CompositeConditionExpression;
import com.nagarro.appBuilderDSL.CompositeScreen;
import com.nagarro.appBuilderDSL.Condition;
import com.nagarro.appBuilderDSL.ConditionExpression;
import com.nagarro.appBuilderDSL.Control;
import com.nagarro.appBuilderDSL.ControlValue;
import com.nagarro.appBuilderDSL.Controller;
import com.nagarro.appBuilderDSL.DataBinding;
import com.nagarro.appBuilderDSL.DataType;
import com.nagarro.appBuilderDSL.Device;
import com.nagarro.appBuilderDSL.DynamicValue;
import com.nagarro.appBuilderDSL.Entity;
import com.nagarro.appBuilderDSL.EntryParameters;
import com.nagarro.appBuilderDSL.EnumDataBinding;
import com.nagarro.appBuilderDSL.ExecuteAction;
import com.nagarro.appBuilderDSL.Expression;
import com.nagarro.appBuilderDSL.Feature;
import com.nagarro.appBuilderDSL.GridLayout;
import com.nagarro.appBuilderDSL.Import;
import com.nagarro.appBuilderDSL.InitAction;
import com.nagarro.appBuilderDSL.InstanceService;
import com.nagarro.appBuilderDSL.Instruction;
import com.nagarro.appBuilderDSL.Label;
import com.nagarro.appBuilderDSL.Layout;
import com.nagarro.appBuilderDSL.List;
import com.nagarro.appBuilderDSL.Main;
import com.nagarro.appBuilderDSL.Model;
import com.nagarro.appBuilderDSL.NamespaceDeclation;
import com.nagarro.appBuilderDSL.Navigate;
import com.nagarro.appBuilderDSL.RestCall;
import com.nagarro.appBuilderDSL.RowLayout;
import com.nagarro.appBuilderDSL.Screen;
import com.nagarro.appBuilderDSL.ScreenLayout;
import com.nagarro.appBuilderDSL.Service;
import com.nagarro.appBuilderDSL.SetInstruction;
import com.nagarro.appBuilderDSL.SetInstructionAssignment;
import com.nagarro.appBuilderDSL.SimpleConditionExpression;
import com.nagarro.appBuilderDSL.SimpleDataBinding;
import com.nagarro.appBuilderDSL.SimpleScreen;
import com.nagarro.appBuilderDSL.Text;
import com.nagarro.appBuilderDSL.Type;
import com.nagarro.appBuilderDSL.Ui;
import com.nagarro.appBuilderDSL.UiAction;
import com.nagarro.appBuilderDSL.UiListenerBinding;
import com.nagarro.appBuilderDSL.ValidationBinding;
import com.nagarro.appBuilderDSL.Validator;
import com.nagarro.appBuilderDSL.Value;
import com.nagarro.appBuilderDSL.View;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppBuilderDSLFactoryImpl extends EFactoryImpl implements AppBuilderDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AppBuilderDSLFactory init()
  {
    try
    {
      AppBuilderDSLFactory theAppBuilderDSLFactory = (AppBuilderDSLFactory)EPackage.Registry.INSTANCE.getEFactory(AppBuilderDSLPackage.eNS_URI);
      if (theAppBuilderDSLFactory != null)
      {
        return theAppBuilderDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AppBuilderDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppBuilderDSLFactoryImpl()
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
      case AppBuilderDSLPackage.APP_BUILDER: return createAppBuilder();
      case AppBuilderDSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case AppBuilderDSLPackage.NAMESPACE_DECLATION: return createNamespaceDeclation();
      case AppBuilderDSLPackage.SYSTEM: return createSystem();
      case AppBuilderDSLPackage.BUSINESS: return createBusiness();
      case AppBuilderDSLPackage.SERVICE: return createService();
      case AppBuilderDSLPackage.INSTANCE_SERVICE: return createInstanceService();
      case AppBuilderDSLPackage.UI: return createUi();
      case AppBuilderDSLPackage.MAIN: return createMain();
      case AppBuilderDSLPackage.SCREEN: return createScreen();
      case AppBuilderDSLPackage.SIMPLE_SCREEN: return createSimpleScreen();
      case AppBuilderDSLPackage.ENTRY_PARAMETERS: return createEntryParameters();
      case AppBuilderDSLPackage.CONTROLLER: return createController();
      case AppBuilderDSLPackage.INIT_ACTION: return createInitAction();
      case AppBuilderDSLPackage.VALIDATION_BINDING: return createValidationBinding();
      case AppBuilderDSLPackage.UI_LISTENER_BINDING: return createUiListenerBinding();
      case AppBuilderDSLPackage.DATA_BINDING: return createDataBinding();
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING: return createSimpleDataBinding();
      case AppBuilderDSLPackage.ENUM_DATA_BINDING: return createEnumDataBinding();
      case AppBuilderDSLPackage.VALIDATOR: return createValidator();
      case AppBuilderDSLPackage.CONDITION: return createCondition();
      case AppBuilderDSLPackage.CONDITION_EXPRESSION: return createConditionExpression();
      case AppBuilderDSLPackage.SIMPLE_CONDITION_EXPRESSION: return createSimpleConditionExpression();
      case AppBuilderDSLPackage.COMPOSITE_CONDITION_EXPRESSION: return createCompositeConditionExpression();
      case AppBuilderDSLPackage.ACTION: return createAction();
      case AppBuilderDSLPackage.UI_ACTION: return createUiAction();
      case AppBuilderDSLPackage.INSTRUCTION: return createInstruction();
      case AppBuilderDSLPackage.SET_INSTRUCTION: return createSetInstruction();
      case AppBuilderDSLPackage.NAVIGATE: return createNavigate();
      case AppBuilderDSLPackage.EXECUTE_ACTION: return createExecuteAction();
      case AppBuilderDSLPackage.SET_INSTRUCTION_ASSIGNMENT: return createSetInstructionAssignment();
      case AppBuilderDSLPackage.REST_CALL: return createRestCall();
      case AppBuilderDSLPackage.CONTROL_VALUE: return createControlValue();
      case AppBuilderDSLPackage.MODEL: return createModel();
      case AppBuilderDSLPackage.VIEW: return createView();
      case AppBuilderDSLPackage.LAYOUT: return createLayout();
      case AppBuilderDSLPackage.GRID_LAYOUT: return createGridLayout();
      case AppBuilderDSLPackage.ROW_LAYOUT: return createRowLayout();
      case AppBuilderDSLPackage.CONTROL: return createControl();
      case AppBuilderDSLPackage.SCREEN_LAYOUT: return createScreenLayout();
      case AppBuilderDSLPackage.LIST: return createList();
      case AppBuilderDSLPackage.VALUE: return createValue();
      case AppBuilderDSLPackage.DYNAMIC_VALUE: return createDynamicValue();
      case AppBuilderDSLPackage.EXPRESSION: return createExpression();
      case AppBuilderDSLPackage.TEXT: return createText();
      case AppBuilderDSLPackage.BUTTON: return createButton();
      case AppBuilderDSLPackage.LABEL: return createLabel();
      case AppBuilderDSLPackage.ATTRIBUTE: return createAttribute();
      case AppBuilderDSLPackage.COMPOSITE_SCREEN: return createCompositeScreen();
      case AppBuilderDSLPackage.IMPORT: return createImport();
      case AppBuilderDSLPackage.TYPE: return createType();
      case AppBuilderDSLPackage.DATA_TYPE: return createDataType();
      case AppBuilderDSLPackage.ENTITY: return createEntity();
      case AppBuilderDSLPackage.FEATURE: return createFeature();
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
      case AppBuilderDSLPackage.DEVICE:
        return createDeviceFromString(eDataType, initialValue);
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
      case AppBuilderDSLPackage.DEVICE:
        return convertDeviceToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppBuilder createAppBuilder()
  {
    AppBuilderImpl appBuilder = new AppBuilderImpl();
    return appBuilder;
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
  public NamespaceDeclation createNamespaceDeclation()
  {
    NamespaceDeclationImpl namespaceDeclation = new NamespaceDeclationImpl();
    return namespaceDeclation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.nagarro.appBuilderDSL.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Business createBusiness()
  {
    BusinessImpl business = new BusinessImpl();
    return business;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceService createInstanceService()
  {
    InstanceServiceImpl instanceService = new InstanceServiceImpl();
    return instanceService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ui createUi()
  {
    UiImpl ui = new UiImpl();
    return ui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screen createScreen()
  {
    ScreenImpl screen = new ScreenImpl();
    return screen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleScreen createSimpleScreen()
  {
    SimpleScreenImpl simpleScreen = new SimpleScreenImpl();
    return simpleScreen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryParameters createEntryParameters()
  {
    EntryParametersImpl entryParameters = new EntryParametersImpl();
    return entryParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controller createController()
  {
    ControllerImpl controller = new ControllerImpl();
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitAction createInitAction()
  {
    InitActionImpl initAction = new InitActionImpl();
    return initAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationBinding createValidationBinding()
  {
    ValidationBindingImpl validationBinding = new ValidationBindingImpl();
    return validationBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiListenerBinding createUiListenerBinding()
  {
    UiListenerBindingImpl uiListenerBinding = new UiListenerBindingImpl();
    return uiListenerBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataBinding createDataBinding()
  {
    DataBindingImpl dataBinding = new DataBindingImpl();
    return dataBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleDataBinding createSimpleDataBinding()
  {
    SimpleDataBindingImpl simpleDataBinding = new SimpleDataBindingImpl();
    return simpleDataBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDataBinding createEnumDataBinding()
  {
    EnumDataBindingImpl enumDataBinding = new EnumDataBindingImpl();
    return enumDataBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validator createValidator()
  {
    ValidatorImpl validator = new ValidatorImpl();
    return validator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionExpression createConditionExpression()
  {
    ConditionExpressionImpl conditionExpression = new ConditionExpressionImpl();
    return conditionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleConditionExpression createSimpleConditionExpression()
  {
    SimpleConditionExpressionImpl simpleConditionExpression = new SimpleConditionExpressionImpl();
    return simpleConditionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeConditionExpression createCompositeConditionExpression()
  {
    CompositeConditionExpressionImpl compositeConditionExpression = new CompositeConditionExpressionImpl();
    return compositeConditionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiAction createUiAction()
  {
    UiActionImpl uiAction = new UiActionImpl();
    return uiAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetInstruction createSetInstruction()
  {
    SetInstructionImpl setInstruction = new SetInstructionImpl();
    return setInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navigate createNavigate()
  {
    NavigateImpl navigate = new NavigateImpl();
    return navigate;
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
  public SetInstructionAssignment createSetInstructionAssignment()
  {
    SetInstructionAssignmentImpl setInstructionAssignment = new SetInstructionAssignmentImpl();
    return setInstructionAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestCall createRestCall()
  {
    RestCallImpl restCall = new RestCallImpl();
    return restCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlValue createControlValue()
  {
    ControlValueImpl controlValue = new ControlValueImpl();
    return controlValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridLayout createGridLayout()
  {
    GridLayoutImpl gridLayout = new GridLayoutImpl();
    return gridLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RowLayout createRowLayout()
  {
    RowLayoutImpl rowLayout = new RowLayoutImpl();
    return rowLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control createControl()
  {
    ControlImpl control = new ControlImpl();
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenLayout createScreenLayout()
  {
    ScreenLayoutImpl screenLayout = new ScreenLayoutImpl();
    return screenLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicValue createDynamicValue()
  {
    DynamicValueImpl dynamicValue = new DynamicValueImpl();
    return dynamicValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeScreen createCompositeScreen()
  {
    CompositeScreenImpl compositeScreen = new CompositeScreenImpl();
    return compositeScreen;
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
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
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
  public Device createDeviceFromString(EDataType eDataType, String initialValue)
  {
    Device result = Device.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDeviceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppBuilderDSLPackage getAppBuilderDSLPackage()
  {
    return (AppBuilderDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AppBuilderDSLPackage getPackage()
  {
    return AppBuilderDSLPackage.eINSTANCE;
  }

} //AppBuilderDSLFactoryImpl
