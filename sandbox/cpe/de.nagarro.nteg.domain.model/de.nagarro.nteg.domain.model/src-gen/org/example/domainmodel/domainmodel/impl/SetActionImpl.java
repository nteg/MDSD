/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ModelFeature;
import org.example.domainmodel.domainmodel.SetAction;
import org.example.domainmodel.domainmodel.SetActionReceiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.SetActionImpl#getModelFeatureName <em>Model Feature Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.SetActionImpl#getSetActionReceiver <em>Set Action Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetActionImpl extends InitActionFeatureImpl implements SetAction
{
  /**
   * The cached value of the '{@link #getModelFeatureName() <em>Model Feature Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFeatureName()
   * @generated
   * @ordered
   */
  protected ModelFeature modelFeatureName;

  /**
   * The cached value of the '{@link #getSetActionReceiver() <em>Set Action Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetActionReceiver()
   * @generated
   * @ordered
   */
  protected SetActionReceiver setActionReceiver;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetActionImpl()
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
    return DomainmodelPackage.Literals.SET_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFeature getModelFeatureName()
  {
    if (modelFeatureName != null && modelFeatureName.eIsProxy())
    {
      InternalEObject oldModelFeatureName = (InternalEObject)modelFeatureName;
      modelFeatureName = (ModelFeature)eResolveProxy(oldModelFeatureName);
      if (modelFeatureName != oldModelFeatureName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.SET_ACTION__MODEL_FEATURE_NAME, oldModelFeatureName, modelFeatureName));
      }
    }
    return modelFeatureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFeature basicGetModelFeatureName()
  {
    return modelFeatureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelFeatureName(ModelFeature newModelFeatureName)
  {
    ModelFeature oldModelFeatureName = modelFeatureName;
    modelFeatureName = newModelFeatureName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SET_ACTION__MODEL_FEATURE_NAME, oldModelFeatureName, modelFeatureName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetActionReceiver getSetActionReceiver()
  {
    return setActionReceiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSetActionReceiver(SetActionReceiver newSetActionReceiver, NotificationChain msgs)
  {
    SetActionReceiver oldSetActionReceiver = setActionReceiver;
    setActionReceiver = newSetActionReceiver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER, oldSetActionReceiver, newSetActionReceiver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetActionReceiver(SetActionReceiver newSetActionReceiver)
  {
    if (newSetActionReceiver != setActionReceiver)
    {
      NotificationChain msgs = null;
      if (setActionReceiver != null)
        msgs = ((InternalEObject)setActionReceiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER, null, msgs);
      if (newSetActionReceiver != null)
        msgs = ((InternalEObject)newSetActionReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER, null, msgs);
      msgs = basicSetSetActionReceiver(newSetActionReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER, newSetActionReceiver, newSetActionReceiver));
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
      case DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER:
        return basicSetSetActionReceiver(null, msgs);
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
      case DomainmodelPackage.SET_ACTION__MODEL_FEATURE_NAME:
        if (resolve) return getModelFeatureName();
        return basicGetModelFeatureName();
      case DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER:
        return getSetActionReceiver();
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
      case DomainmodelPackage.SET_ACTION__MODEL_FEATURE_NAME:
        setModelFeatureName((ModelFeature)newValue);
        return;
      case DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER:
        setSetActionReceiver((SetActionReceiver)newValue);
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
      case DomainmodelPackage.SET_ACTION__MODEL_FEATURE_NAME:
        setModelFeatureName((ModelFeature)null);
        return;
      case DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER:
        setSetActionReceiver((SetActionReceiver)null);
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
      case DomainmodelPackage.SET_ACTION__MODEL_FEATURE_NAME:
        return modelFeatureName != null;
      case DomainmodelPackage.SET_ACTION__SET_ACTION_RECEIVER:
        return setActionReceiver != null;
    }
    return super.eIsSet(featureID);
  }

} //SetActionImpl
