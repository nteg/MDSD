/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.SetUIElementReceiver;
import org.example.domainmodel.domainmodel.ValidateAction;
import org.example.domainmodel.domainmodel.ValidatorFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidateActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidateActionImpl#getUiReceiver <em>Ui Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidateActionImpl extends InitActionFeatureImpl implements ValidateAction
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected ValidatorFeature condition;

  /**
   * The cached value of the '{@link #getUiReceiver() <em>Ui Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiReceiver()
   * @generated
   * @ordered
   */
  protected SetUIElementReceiver uiReceiver;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidateActionImpl()
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
    return DomainmodelPackage.Literals.VALIDATE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorFeature getCondition()
  {
    if (condition != null && condition.eIsProxy())
    {
      InternalEObject oldCondition = (InternalEObject)condition;
      condition = (ValidatorFeature)eResolveProxy(oldCondition);
      if (condition != oldCondition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.VALIDATE_ACTION__CONDITION, oldCondition, condition));
      }
    }
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorFeature basicGetCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(ValidatorFeature newCondition)
  {
    ValidatorFeature oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATE_ACTION__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetUIElementReceiver getUiReceiver()
  {
    return uiReceiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUiReceiver(SetUIElementReceiver newUiReceiver, NotificationChain msgs)
  {
    SetUIElementReceiver oldUiReceiver = uiReceiver;
    uiReceiver = newUiReceiver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER, oldUiReceiver, newUiReceiver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUiReceiver(SetUIElementReceiver newUiReceiver)
  {
    if (newUiReceiver != uiReceiver)
    {
      NotificationChain msgs = null;
      if (uiReceiver != null)
        msgs = ((InternalEObject)uiReceiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER, null, msgs);
      if (newUiReceiver != null)
        msgs = ((InternalEObject)newUiReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER, null, msgs);
      msgs = basicSetUiReceiver(newUiReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER, newUiReceiver, newUiReceiver));
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
      case DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER:
        return basicSetUiReceiver(null, msgs);
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
      case DomainmodelPackage.VALIDATE_ACTION__CONDITION:
        if (resolve) return getCondition();
        return basicGetCondition();
      case DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER:
        return getUiReceiver();
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
      case DomainmodelPackage.VALIDATE_ACTION__CONDITION:
        setCondition((ValidatorFeature)newValue);
        return;
      case DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER:
        setUiReceiver((SetUIElementReceiver)newValue);
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
      case DomainmodelPackage.VALIDATE_ACTION__CONDITION:
        setCondition((ValidatorFeature)null);
        return;
      case DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER:
        setUiReceiver((SetUIElementReceiver)null);
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
      case DomainmodelPackage.VALIDATE_ACTION__CONDITION:
        return condition != null;
      case DomainmodelPackage.VALIDATE_ACTION__UI_RECEIVER:
        return uiReceiver != null;
    }
    return super.eIsSet(featureID);
  }

} //ValidateActionImpl
