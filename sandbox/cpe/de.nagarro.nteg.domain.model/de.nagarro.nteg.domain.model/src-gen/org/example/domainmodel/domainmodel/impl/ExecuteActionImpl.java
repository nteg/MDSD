/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ExecuteAction;
import org.example.domainmodel.domainmodel.UIActionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ExecuteActionImpl#getUiActionName <em>Ui Action Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteActionImpl extends UIActionFeatureImpl implements ExecuteAction
{
  /**
   * The cached value of the '{@link #getUiActionName() <em>Ui Action Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiActionName()
   * @generated
   * @ordered
   */
  protected UIActionModule uiActionName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecuteActionImpl()
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
    return DomainmodelPackage.Literals.EXECUTE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIActionModule getUiActionName()
  {
    if (uiActionName != null && uiActionName.eIsProxy())
    {
      InternalEObject oldUiActionName = (InternalEObject)uiActionName;
      uiActionName = (UIActionModule)eResolveProxy(oldUiActionName);
      if (uiActionName != oldUiActionName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.EXECUTE_ACTION__UI_ACTION_NAME, oldUiActionName, uiActionName));
      }
    }
    return uiActionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIActionModule basicGetUiActionName()
  {
    return uiActionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUiActionName(UIActionModule newUiActionName)
  {
    UIActionModule oldUiActionName = uiActionName;
    uiActionName = newUiActionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.EXECUTE_ACTION__UI_ACTION_NAME, oldUiActionName, uiActionName));
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
      case DomainmodelPackage.EXECUTE_ACTION__UI_ACTION_NAME:
        if (resolve) return getUiActionName();
        return basicGetUiActionName();
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
      case DomainmodelPackage.EXECUTE_ACTION__UI_ACTION_NAME:
        setUiActionName((UIActionModule)newValue);
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
      case DomainmodelPackage.EXECUTE_ACTION__UI_ACTION_NAME:
        setUiActionName((UIActionModule)null);
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
      case DomainmodelPackage.EXECUTE_ACTION__UI_ACTION_NAME:
        return uiActionName != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecuteActionImpl
