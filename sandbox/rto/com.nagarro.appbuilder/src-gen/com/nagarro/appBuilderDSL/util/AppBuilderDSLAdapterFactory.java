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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage
 * @generated
 */
public class AppBuilderDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AppBuilderDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppBuilderDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AppBuilderDSLPackage.eINSTANCE;
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
  protected AppBuilderDSLSwitch<Adapter> modelSwitch =
    new AppBuilderDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseAppBuilder(AppBuilder object)
      {
        return createAppBuilderAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseNamespaceDeclation(NamespaceDeclation object)
      {
        return createNamespaceDeclationAdapter();
      }
      @Override
      public Adapter caseSystem(com.nagarro.appBuilderDSL.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseBusiness(Business object)
      {
        return createBusinessAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseInstanceService(InstanceService object)
      {
        return createInstanceServiceAdapter();
      }
      @Override
      public Adapter caseUi(Ui object)
      {
        return createUiAdapter();
      }
      @Override
      public Adapter caseMain(Main object)
      {
        return createMainAdapter();
      }
      @Override
      public Adapter caseScreen(Screen object)
      {
        return createScreenAdapter();
      }
      @Override
      public Adapter caseSimpleScreen(SimpleScreen object)
      {
        return createSimpleScreenAdapter();
      }
      @Override
      public Adapter caseEntryParameters(EntryParameters object)
      {
        return createEntryParametersAdapter();
      }
      @Override
      public Adapter caseController(Controller object)
      {
        return createControllerAdapter();
      }
      @Override
      public Adapter caseInitAction(InitAction object)
      {
        return createInitActionAdapter();
      }
      @Override
      public Adapter caseValidationBinding(ValidationBinding object)
      {
        return createValidationBindingAdapter();
      }
      @Override
      public Adapter caseUiListenerBinding(UiListenerBinding object)
      {
        return createUiListenerBindingAdapter();
      }
      @Override
      public Adapter caseDataBinding(DataBinding object)
      {
        return createDataBindingAdapter();
      }
      @Override
      public Adapter caseSimpleDataBinding(SimpleDataBinding object)
      {
        return createSimpleDataBindingAdapter();
      }
      @Override
      public Adapter caseEnumDataBinding(EnumDataBinding object)
      {
        return createEnumDataBindingAdapter();
      }
      @Override
      public Adapter caseValidator(Validator object)
      {
        return createValidatorAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseConditionExpression(ConditionExpression object)
      {
        return createConditionExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleConditionExpression(SimpleConditionExpression object)
      {
        return createSimpleConditionExpressionAdapter();
      }
      @Override
      public Adapter caseCompositeConditionExpression(CompositeConditionExpression object)
      {
        return createCompositeConditionExpressionAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseUiAction(UiAction object)
      {
        return createUiActionAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseSetInstruction(SetInstruction object)
      {
        return createSetInstructionAdapter();
      }
      @Override
      public Adapter caseNavigate(Navigate object)
      {
        return createNavigateAdapter();
      }
      @Override
      public Adapter caseExecuteAction(ExecuteAction object)
      {
        return createExecuteActionAdapter();
      }
      @Override
      public Adapter caseSetInstructionAssignment(SetInstructionAssignment object)
      {
        return createSetInstructionAssignmentAdapter();
      }
      @Override
      public Adapter caseRestCall(RestCall object)
      {
        return createRestCallAdapter();
      }
      @Override
      public Adapter caseControlValue(ControlValue object)
      {
        return createControlValueAdapter();
      }
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseView(View object)
      {
        return createViewAdapter();
      }
      @Override
      public Adapter caseLayout(Layout object)
      {
        return createLayoutAdapter();
      }
      @Override
      public Adapter caseGridLayout(GridLayout object)
      {
        return createGridLayoutAdapter();
      }
      @Override
      public Adapter caseRowLayout(RowLayout object)
      {
        return createRowLayoutAdapter();
      }
      @Override
      public Adapter caseControl(Control object)
      {
        return createControlAdapter();
      }
      @Override
      public Adapter caseScreenLayout(ScreenLayout object)
      {
        return createScreenLayoutAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseDynamicValue(DynamicValue object)
      {
        return createDynamicValueAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseCompositeScreen(CompositeScreen object)
      {
        return createCompositeScreenAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
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
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.AppBuilder <em>App Builder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.AppBuilder
   * @generated
   */
  public Adapter createAppBuilderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.NamespaceDeclation <em>Namespace Declation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.NamespaceDeclation
   * @generated
   */
  public Adapter createNamespaceDeclationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Business <em>Business</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Business
   * @generated
   */
  public Adapter createBusinessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.InstanceService <em>Instance Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.InstanceService
   * @generated
   */
  public Adapter createInstanceServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Ui <em>Ui</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Ui
   * @generated
   */
  public Adapter createUiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Main
   * @generated
   */
  public Adapter createMainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Screen <em>Screen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Screen
   * @generated
   */
  public Adapter createScreenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.SimpleScreen <em>Simple Screen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.SimpleScreen
   * @generated
   */
  public Adapter createSimpleScreenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.EntryParameters <em>Entry Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.EntryParameters
   * @generated
   */
  public Adapter createEntryParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Controller
   * @generated
   */
  public Adapter createControllerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.InitAction <em>Init Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.InitAction
   * @generated
   */
  public Adapter createInitActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.ValidationBinding <em>Validation Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.ValidationBinding
   * @generated
   */
  public Adapter createValidationBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.UiListenerBinding <em>Ui Listener Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.UiListenerBinding
   * @generated
   */
  public Adapter createUiListenerBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.DataBinding <em>Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.DataBinding
   * @generated
   */
  public Adapter createDataBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.SimpleDataBinding <em>Simple Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.SimpleDataBinding
   * @generated
   */
  public Adapter createSimpleDataBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.EnumDataBinding <em>Enum Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.EnumDataBinding
   * @generated
   */
  public Adapter createEnumDataBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Validator <em>Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Validator
   * @generated
   */
  public Adapter createValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.ConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.ConditionExpression
   * @generated
   */
  public Adapter createConditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.SimpleConditionExpression <em>Simple Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.SimpleConditionExpression
   * @generated
   */
  public Adapter createSimpleConditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.CompositeConditionExpression <em>Composite Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.CompositeConditionExpression
   * @generated
   */
  public Adapter createCompositeConditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.UiAction <em>Ui Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.UiAction
   * @generated
   */
  public Adapter createUiActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.SetInstruction <em>Set Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.SetInstruction
   * @generated
   */
  public Adapter createSetInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Navigate <em>Navigate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Navigate
   * @generated
   */
  public Adapter createNavigateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.ExecuteAction <em>Execute Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.ExecuteAction
   * @generated
   */
  public Adapter createExecuteActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.SetInstructionAssignment <em>Set Instruction Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.SetInstructionAssignment
   * @generated
   */
  public Adapter createSetInstructionAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.RestCall <em>Rest Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.RestCall
   * @generated
   */
  public Adapter createRestCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.ControlValue <em>Control Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.ControlValue
   * @generated
   */
  public Adapter createControlValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.View
   * @generated
   */
  public Adapter createViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.GridLayout <em>Grid Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.GridLayout
   * @generated
   */
  public Adapter createGridLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.RowLayout <em>Row Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.RowLayout
   * @generated
   */
  public Adapter createRowLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Control <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Control
   * @generated
   */
  public Adapter createControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.ScreenLayout <em>Screen Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.ScreenLayout
   * @generated
   */
  public Adapter createScreenLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.DynamicValue <em>Dynamic Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.DynamicValue
   * @generated
   */
  public Adapter createDynamicValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.CompositeScreen <em>Composite Screen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.CompositeScreen
   * @generated
   */
  public Adapter createCompositeScreenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.nagarro.appBuilderDSL.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.nagarro.appBuilderDSL.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
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

} //AppBuilderDSLAdapterFactory
