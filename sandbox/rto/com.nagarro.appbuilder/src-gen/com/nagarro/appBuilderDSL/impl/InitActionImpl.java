/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.DataBinding;
import com.nagarro.appBuilderDSL.InitAction;
import com.nagarro.appBuilderDSL.Instruction;
import com.nagarro.appBuilderDSL.UiListenerBinding;
import com.nagarro.appBuilderDSL.ValidationBinding;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.InitActionImpl#getDatabindings <em>Databindings</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.InitActionImpl#getUiListenerBindingss <em>Ui Listener Bindingss</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.InitActionImpl#getValidationBindings <em>Validation Bindings</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.InitActionImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitActionImpl extends MinimalEObjectImpl.Container implements InitAction
{
  /**
   * The cached value of the '{@link #getDatabindings() <em>Databindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabindings()
   * @generated
   * @ordered
   */
  protected EList<DataBinding> databindings;

  /**
   * The cached value of the '{@link #getUiListenerBindingss() <em>Ui Listener Bindingss</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiListenerBindingss()
   * @generated
   * @ordered
   */
  protected EList<UiListenerBinding> uiListenerBindingss;

  /**
   * The cached value of the '{@link #getValidationBindings() <em>Validation Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidationBindings()
   * @generated
   * @ordered
   */
  protected EList<ValidationBinding> validationBindings;

  /**
   * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructions()
   * @generated
   * @ordered
   */
  protected EList<Instruction> instructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AppBuilderDSLPackage.Literals.INIT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataBinding> getDatabindings()
  {
    if (databindings == null)
    {
      databindings = new EObjectContainmentEList<DataBinding>(DataBinding.class, this, AppBuilderDSLPackage.INIT_ACTION__DATABINDINGS);
    }
    return databindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UiListenerBinding> getUiListenerBindingss()
  {
    if (uiListenerBindingss == null)
    {
      uiListenerBindingss = new EObjectContainmentEList<UiListenerBinding>(UiListenerBinding.class, this, AppBuilderDSLPackage.INIT_ACTION__UI_LISTENER_BINDINGSS);
    }
    return uiListenerBindingss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValidationBinding> getValidationBindings()
  {
    if (validationBindings == null)
    {
      validationBindings = new EObjectContainmentEList<ValidationBinding>(ValidationBinding.class, this, AppBuilderDSLPackage.INIT_ACTION__VALIDATION_BINDINGS);
    }
    return validationBindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instruction> getInstructions()
  {
    if (instructions == null)
    {
      instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, AppBuilderDSLPackage.INIT_ACTION__INSTRUCTIONS);
    }
    return instructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.INIT_ACTION__DATABINDINGS:
        return ((InternalEList<?>)getDatabindings()).basicRemove(otherEnd, msgs);
      case AppBuilderDSLPackage.INIT_ACTION__UI_LISTENER_BINDINGSS:
        return ((InternalEList<?>)getUiListenerBindingss()).basicRemove(otherEnd, msgs);
      case AppBuilderDSLPackage.INIT_ACTION__VALIDATION_BINDINGS:
        return ((InternalEList<?>)getValidationBindings()).basicRemove(otherEnd, msgs);
      case AppBuilderDSLPackage.INIT_ACTION__INSTRUCTIONS:
        return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.INIT_ACTION__DATABINDINGS:
        return getDatabindings();
      case AppBuilderDSLPackage.INIT_ACTION__UI_LISTENER_BINDINGSS:
        return getUiListenerBindingss();
      case AppBuilderDSLPackage.INIT_ACTION__VALIDATION_BINDINGS:
        return getValidationBindings();
      case AppBuilderDSLPackage.INIT_ACTION__INSTRUCTIONS:
        return getInstructions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.INIT_ACTION__DATABINDINGS:
        getDatabindings().clear();
        getDatabindings().addAll((Collection<? extends DataBinding>)newValue);
        return;
      case AppBuilderDSLPackage.INIT_ACTION__UI_LISTENER_BINDINGSS:
        getUiListenerBindingss().clear();
        getUiListenerBindingss().addAll((Collection<? extends UiListenerBinding>)newValue);
        return;
      case AppBuilderDSLPackage.INIT_ACTION__VALIDATION_BINDINGS:
        getValidationBindings().clear();
        getValidationBindings().addAll((Collection<? extends ValidationBinding>)newValue);
        return;
      case AppBuilderDSLPackage.INIT_ACTION__INSTRUCTIONS:
        getInstructions().clear();
        getInstructions().addAll((Collection<? extends Instruction>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.INIT_ACTION__DATABINDINGS:
        getDatabindings().clear();
        return;
      case AppBuilderDSLPackage.INIT_ACTION__UI_LISTENER_BINDINGSS:
        getUiListenerBindingss().clear();
        return;
      case AppBuilderDSLPackage.INIT_ACTION__VALIDATION_BINDINGS:
        getValidationBindings().clear();
        return;
      case AppBuilderDSLPackage.INIT_ACTION__INSTRUCTIONS:
        getInstructions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.INIT_ACTION__DATABINDINGS:
        return databindings != null && !databindings.isEmpty();
      case AppBuilderDSLPackage.INIT_ACTION__UI_LISTENER_BINDINGSS:
        return uiListenerBindingss != null && !uiListenerBindingss.isEmpty();
      case AppBuilderDSLPackage.INIT_ACTION__VALIDATION_BINDINGS:
        return validationBindings != null && !validationBindings.isEmpty();
      case AppBuilderDSLPackage.INIT_ACTION__INSTRUCTIONS:
        return instructions != null && !instructions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InitActionImpl
