/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.NavigateToAction;
import org.example.domainmodel.domainmodel.ScreenFeature;
import org.example.domainmodel.domainmodel.ScreenModelParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigate To Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.NavigateToActionImpl#getScreenElementId <em>Screen Element Id</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.NavigateToActionImpl#getModelFeatures <em>Model Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigateToActionImpl extends UIActionFeatureImpl implements NavigateToAction
{
  /**
   * The cached value of the '{@link #getScreenElementId() <em>Screen Element Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScreenElementId()
   * @generated
   * @ordered
   */
  protected ScreenFeature screenElementId;

  /**
   * The cached value of the '{@link #getModelFeatures() <em>Model Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFeatures()
   * @generated
   * @ordered
   */
  protected ScreenModelParameters modelFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigateToActionImpl()
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
    return DomainmodelPackage.Literals.NAVIGATE_TO_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenFeature getScreenElementId()
  {
    if (screenElementId != null && screenElementId.eIsProxy())
    {
      InternalEObject oldScreenElementId = (InternalEObject)screenElementId;
      screenElementId = (ScreenFeature)eResolveProxy(oldScreenElementId);
      if (screenElementId != oldScreenElementId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID, oldScreenElementId, screenElementId));
      }
    }
    return screenElementId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenFeature basicGetScreenElementId()
  {
    return screenElementId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScreenElementId(ScreenFeature newScreenElementId)
  {
    ScreenFeature oldScreenElementId = screenElementId;
    screenElementId = newScreenElementId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID, oldScreenElementId, screenElementId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScreenModelParameters getModelFeatures()
  {
    return modelFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelFeatures(ScreenModelParameters newModelFeatures, NotificationChain msgs)
  {
    ScreenModelParameters oldModelFeatures = modelFeatures;
    modelFeatures = newModelFeatures;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES, oldModelFeatures, newModelFeatures);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelFeatures(ScreenModelParameters newModelFeatures)
  {
    if (newModelFeatures != modelFeatures)
    {
      NotificationChain msgs = null;
      if (modelFeatures != null)
        msgs = ((InternalEObject)modelFeatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES, null, msgs);
      if (newModelFeatures != null)
        msgs = ((InternalEObject)newModelFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES, null, msgs);
      msgs = basicSetModelFeatures(newModelFeatures, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES, newModelFeatures, newModelFeatures));
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
      case DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES:
        return basicSetModelFeatures(null, msgs);
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
      case DomainmodelPackage.NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID:
        if (resolve) return getScreenElementId();
        return basicGetScreenElementId();
      case DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES:
        return getModelFeatures();
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
      case DomainmodelPackage.NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID:
        setScreenElementId((ScreenFeature)newValue);
        return;
      case DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES:
        setModelFeatures((ScreenModelParameters)newValue);
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
      case DomainmodelPackage.NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID:
        setScreenElementId((ScreenFeature)null);
        return;
      case DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES:
        setModelFeatures((ScreenModelParameters)null);
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
      case DomainmodelPackage.NAVIGATE_TO_ACTION__SCREEN_ELEMENT_ID:
        return screenElementId != null;
      case DomainmodelPackage.NAVIGATE_TO_ACTION__MODEL_FEATURES:
        return modelFeatures != null;
    }
    return super.eIsSet(featureID);
  }

} //NavigateToActionImpl
