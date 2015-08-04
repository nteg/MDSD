/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.AttachAction;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.SetUIElementReceiver;
import org.example.domainmodel.domainmodel.UIActionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.AttachActionImpl#getUiAction <em>Ui Action</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.AttachActionImpl#getUiReceiver <em>Ui Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachActionImpl extends InitActionFeatureImpl implements AttachAction
{
  /**
   * The cached value of the '{@link #getUiAction() <em>Ui Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiAction()
   * @generated
   * @ordered
   */
  protected UIActionModule uiAction;

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
  protected AttachActionImpl()
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
    return DomainmodelPackage.Literals.ATTACH_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIActionModule getUiAction()
  {
    if (uiAction != null && uiAction.eIsProxy())
    {
      InternalEObject oldUiAction = (InternalEObject)uiAction;
      uiAction = (UIActionModule)eResolveProxy(oldUiAction);
      if (uiAction != oldUiAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.ATTACH_ACTION__UI_ACTION, oldUiAction, uiAction));
      }
    }
    return uiAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIActionModule basicGetUiAction()
  {
    return uiAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUiAction(UIActionModule newUiAction)
  {
    UIActionModule oldUiAction = uiAction;
    uiAction = newUiAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ATTACH_ACTION__UI_ACTION, oldUiAction, uiAction));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER, oldUiReceiver, newUiReceiver);
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
        msgs = ((InternalEObject)uiReceiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER, null, msgs);
      if (newUiReceiver != null)
        msgs = ((InternalEObject)newUiReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER, null, msgs);
      msgs = basicSetUiReceiver(newUiReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER, newUiReceiver, newUiReceiver));
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
      case DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER:
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
      case DomainmodelPackage.ATTACH_ACTION__UI_ACTION:
        if (resolve) return getUiAction();
        return basicGetUiAction();
      case DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER:
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
      case DomainmodelPackage.ATTACH_ACTION__UI_ACTION:
        setUiAction((UIActionModule)newValue);
        return;
      case DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER:
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
      case DomainmodelPackage.ATTACH_ACTION__UI_ACTION:
        setUiAction((UIActionModule)null);
        return;
      case DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER:
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
      case DomainmodelPackage.ATTACH_ACTION__UI_ACTION:
        return uiAction != null;
      case DomainmodelPackage.ATTACH_ACTION__UI_RECEIVER:
        return uiReceiver != null;
    }
    return super.eIsSet(featureID);
  }

} //AttachActionImpl
