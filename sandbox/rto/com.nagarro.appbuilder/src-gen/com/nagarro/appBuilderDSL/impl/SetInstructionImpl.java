/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Attribute;
import com.nagarro.appBuilderDSL.SetInstruction;
import com.nagarro.appBuilderDSL.SetInstructionAssignment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SetInstructionImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SetInstructionImpl#getModelAccess <em>Model Access</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SetInstructionImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetInstructionImpl extends InstructionImpl implements SetInstruction
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Attribute model;

  /**
   * The default value of the '{@link #getModelAccess() <em>Model Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelAccess()
   * @generated
   * @ordered
   */
  protected static final String MODEL_ACCESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelAccess() <em>Model Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelAccess()
   * @generated
   * @ordered
   */
  protected String modelAccess = MODEL_ACCESS_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected SetInstructionAssignment assignment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetInstructionImpl()
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
    return AppBuilderDSLPackage.Literals.SET_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getModel()
  {
    if (model != null && model.eIsProxy())
    {
      InternalEObject oldModel = (InternalEObject)model;
      model = (Attribute)eResolveProxy(oldModel);
      if (model != oldModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppBuilderDSLPackage.SET_INSTRUCTION__MODEL, oldModel, model));
      }
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(Attribute newModel)
  {
    Attribute oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SET_INSTRUCTION__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelAccess()
  {
    return modelAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelAccess(String newModelAccess)
  {
    String oldModelAccess = modelAccess;
    modelAccess = newModelAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SET_INSTRUCTION__MODEL_ACCESS, oldModelAccess, modelAccess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetInstructionAssignment getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(SetInstructionAssignment newAssignment, NotificationChain msgs)
  {
    SetInstructionAssignment oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(SetInstructionAssignment newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT, newAssignment, newAssignment));
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
      case AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
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
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL:
        if (resolve) return getModel();
        return basicGetModel();
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL_ACCESS:
        return getModelAccess();
      case AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT:
        return getAssignment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL:
        setModel((Attribute)newValue);
        return;
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL_ACCESS:
        setModelAccess((String)newValue);
        return;
      case AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT:
        setAssignment((SetInstructionAssignment)newValue);
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
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL:
        setModel((Attribute)null);
        return;
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL_ACCESS:
        setModelAccess(MODEL_ACCESS_EDEFAULT);
        return;
      case AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT:
        setAssignment((SetInstructionAssignment)null);
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
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL:
        return model != null;
      case AppBuilderDSLPackage.SET_INSTRUCTION__MODEL_ACCESS:
        return MODEL_ACCESS_EDEFAULT == null ? modelAccess != null : !MODEL_ACCESS_EDEFAULT.equals(modelAccess);
      case AppBuilderDSLPackage.SET_INSTRUCTION__ASSIGNMENT:
        return assignment != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (modelAccess: ");
    result.append(modelAccess);
    result.append(')');
    return result.toString();
  }

} //SetInstructionImpl
