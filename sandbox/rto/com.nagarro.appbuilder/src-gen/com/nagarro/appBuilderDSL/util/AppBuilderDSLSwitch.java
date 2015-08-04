/**
 */
package com.nagarro.appBuilderDSL.util;

import com.nagarro.appBuilderDSL.AbstractElement;
import com.nagarro.appBuilderDSL.Action;
import com.nagarro.appBuilderDSL.AppBuilder;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage
 * @generated
 */
public class AppBuilderDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AppBuilderDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppBuilderDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AppBuilderDSLPackage.eINSTANCE;
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
      case AppBuilderDSLPackage.APP_BUILDER:
      {
        AppBuilder appBuilder = (AppBuilder)theEObject;
        T result = caseAppBuilder(appBuilder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.NAMESPACE_DECLATION:
      {
        NamespaceDeclation namespaceDeclation = (NamespaceDeclation)theEObject;
        T result = caseNamespaceDeclation(namespaceDeclation);
        if (result == null) result = caseAbstractElement(namespaceDeclation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SYSTEM:
      {
        com.nagarro.appBuilderDSL.System system = (com.nagarro.appBuilderDSL.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = caseAbstractElement(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.BUSINESS:
      {
        Business business = (Business)theEObject;
        T result = caseBusiness(business);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.INSTANCE_SERVICE:
      {
        InstanceService instanceService = (InstanceService)theEObject;
        T result = caseInstanceService(instanceService);
        if (result == null) result = caseService(instanceService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.UI:
      {
        Ui ui = (Ui)theEObject;
        T result = caseUi(ui);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.MAIN:
      {
        Main main = (Main)theEObject;
        T result = caseMain(main);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SCREEN:
      {
        Screen screen = (Screen)theEObject;
        T result = caseScreen(screen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SIMPLE_SCREEN:
      {
        SimpleScreen simpleScreen = (SimpleScreen)theEObject;
        T result = caseSimpleScreen(simpleScreen);
        if (result == null) result = caseScreen(simpleScreen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.ENTRY_PARAMETERS:
      {
        EntryParameters entryParameters = (EntryParameters)theEObject;
        T result = caseEntryParameters(entryParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.CONTROLLER:
      {
        Controller controller = (Controller)theEObject;
        T result = caseController(controller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.INIT_ACTION:
      {
        InitAction initAction = (InitAction)theEObject;
        T result = caseInitAction(initAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.VALIDATION_BINDING:
      {
        ValidationBinding validationBinding = (ValidationBinding)theEObject;
        T result = caseValidationBinding(validationBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.UI_LISTENER_BINDING:
      {
        UiListenerBinding uiListenerBinding = (UiListenerBinding)theEObject;
        T result = caseUiListenerBinding(uiListenerBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.DATA_BINDING:
      {
        DataBinding dataBinding = (DataBinding)theEObject;
        T result = caseDataBinding(dataBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING:
      {
        SimpleDataBinding simpleDataBinding = (SimpleDataBinding)theEObject;
        T result = caseSimpleDataBinding(simpleDataBinding);
        if (result == null) result = caseDataBinding(simpleDataBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.ENUM_DATA_BINDING:
      {
        EnumDataBinding enumDataBinding = (EnumDataBinding)theEObject;
        T result = caseEnumDataBinding(enumDataBinding);
        if (result == null) result = caseDataBinding(enumDataBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.VALIDATOR:
      {
        Validator validator = (Validator)theEObject;
        T result = caseValidator(validator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.CONDITION_EXPRESSION:
      {
        ConditionExpression conditionExpression = (ConditionExpression)theEObject;
        T result = caseConditionExpression(conditionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SIMPLE_CONDITION_EXPRESSION:
      {
        SimpleConditionExpression simpleConditionExpression = (SimpleConditionExpression)theEObject;
        T result = caseSimpleConditionExpression(simpleConditionExpression);
        if (result == null) result = caseConditionExpression(simpleConditionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.COMPOSITE_CONDITION_EXPRESSION:
      {
        CompositeConditionExpression compositeConditionExpression = (CompositeConditionExpression)theEObject;
        T result = caseCompositeConditionExpression(compositeConditionExpression);
        if (result == null) result = caseConditionExpression(compositeConditionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.UI_ACTION:
      {
        UiAction uiAction = (UiAction)theEObject;
        T result = caseUiAction(uiAction);
        if (result == null) result = caseAction(uiAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SET_INSTRUCTION:
      {
        SetInstruction setInstruction = (SetInstruction)theEObject;
        T result = caseSetInstruction(setInstruction);
        if (result == null) result = caseInstruction(setInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.NAVIGATE:
      {
        Navigate navigate = (Navigate)theEObject;
        T result = caseNavigate(navigate);
        if (result == null) result = caseInstruction(navigate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.EXECUTE_ACTION:
      {
        ExecuteAction executeAction = (ExecuteAction)theEObject;
        T result = caseExecuteAction(executeAction);
        if (result == null) result = caseInstruction(executeAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SET_INSTRUCTION_ASSIGNMENT:
      {
        SetInstructionAssignment setInstructionAssignment = (SetInstructionAssignment)theEObject;
        T result = caseSetInstructionAssignment(setInstructionAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.REST_CALL:
      {
        RestCall restCall = (RestCall)theEObject;
        T result = caseRestCall(restCall);
        if (result == null) result = caseSetInstructionAssignment(restCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.CONTROL_VALUE:
      {
        ControlValue controlValue = (ControlValue)theEObject;
        T result = caseControlValue(controlValue);
        if (result == null) result = caseSetInstructionAssignment(controlValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.VIEW:
      {
        View view = (View)theEObject;
        T result = caseView(view);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = caseControl(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.GRID_LAYOUT:
      {
        GridLayout gridLayout = (GridLayout)theEObject;
        T result = caseGridLayout(gridLayout);
        if (result == null) result = caseLayout(gridLayout);
        if (result == null) result = caseControl(gridLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.ROW_LAYOUT:
      {
        RowLayout rowLayout = (RowLayout)theEObject;
        T result = caseRowLayout(rowLayout);
        if (result == null) result = caseLayout(rowLayout);
        if (result == null) result = caseControl(rowLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.CONTROL:
      {
        Control control = (Control)theEObject;
        T result = caseControl(control);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.SCREEN_LAYOUT:
      {
        ScreenLayout screenLayout = (ScreenLayout)theEObject;
        T result = caseScreenLayout(screenLayout);
        if (result == null) result = caseControl(screenLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = caseControl(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.DYNAMIC_VALUE:
      {
        DynamicValue dynamicValue = (DynamicValue)theEObject;
        T result = caseDynamicValue(dynamicValue);
        if (result == null) result = caseSetInstructionAssignment(dynamicValue);
        if (result == null) result = caseValue(dynamicValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseControl(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseControl(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseControl(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.COMPOSITE_SCREEN:
      {
        CompositeScreen compositeScreen = (CompositeScreen)theEObject;
        T result = caseCompositeScreen(compositeScreen);
        if (result == null) result = caseScreen(compositeScreen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseType(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppBuilderDSLPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>App Builder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>App Builder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppBuilder(AppBuilder object)
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
   * Returns the result of interpreting the object as an instance of '<em>Namespace Declation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Declation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceDeclation(NamespaceDeclation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(com.nagarro.appBuilderDSL.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusiness(Business object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceService(InstanceService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUi(Ui object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMain(Main object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreen(Screen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Screen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Screen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleScreen(SimpleScreen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntryParameters(EntryParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseController(Controller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitAction(InitAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validation Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validation Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidationBinding(ValidationBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Listener Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Listener Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiListenerBinding(UiListenerBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataBinding(DataBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Data Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Data Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleDataBinding(SimpleDataBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Data Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Data Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDataBinding(EnumDataBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidator(Validator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionExpression(ConditionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Condition Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Condition Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleConditionExpression(SimpleConditionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Condition Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Condition Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeConditionExpression(CompositeConditionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiAction(UiAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetInstruction(SetInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigate(Navigate object)
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
   * Returns the result of interpreting the object as an instance of '<em>Set Instruction Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Instruction Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetInstructionAssignment(SetInstructionAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rest Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rest Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestCall(RestCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlValue(ControlValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseView(View object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGridLayout(GridLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRowLayout(RowLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControl(Control object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenLayout(ScreenLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicValue(DynamicValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Screen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Screen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeScreen(CompositeScreen object)
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
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
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

} //AppBuilderDSLSwitch
