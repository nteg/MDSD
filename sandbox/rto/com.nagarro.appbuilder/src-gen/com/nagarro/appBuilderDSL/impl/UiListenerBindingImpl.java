/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.Action;
import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Control;
import com.nagarro.appBuilderDSL.UiListenerBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Listener Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.UiListenerBindingImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.UiListenerBindingImpl#getControl <em>Control</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.UiListenerBindingImpl#getControlAccess <em>Control Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UiListenerBindingImpl extends MinimalEObjectImpl.Container implements UiListenerBinding
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected Control control;

  /**
   * The default value of the '{@link #getControlAccess() <em>Control Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlAccess()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_ACCESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControlAccess() <em>Control Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlAccess()
   * @generated
   * @ordered
   */
  protected String controlAccess = CONTROL_ACCESS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UiListenerBindingImpl()
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
    return AppBuilderDSLPackage.Literals.UI_LISTENER_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Action)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppBuilderDSLPackage.UI_LISTENER_BINDING__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.UI_LISTENER_BINDING__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control getControl()
  {
    if (control != null && control.eIsProxy())
    {
      InternalEObject oldControl = (InternalEObject)control;
      control = (Control)eResolveProxy(oldControl);
      if (control != oldControl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL, oldControl, control));
      }
    }
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control basicGetControl()
  {
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControl(Control newControl)
  {
    Control oldControl = control;
    control = newControl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL, oldControl, control));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getControlAccess()
  {
    return controlAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlAccess(String newControlAccess)
  {
    String oldControlAccess = controlAccess;
    controlAccess = newControlAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL_ACCESS, oldControlAccess, controlAccess));
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
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL:
        if (resolve) return getControl();
        return basicGetControl();
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL_ACCESS:
        return getControlAccess();
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
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__ACTION:
        setAction((Action)newValue);
        return;
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL:
        setControl((Control)newValue);
        return;
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL_ACCESS:
        setControlAccess((String)newValue);
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
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__ACTION:
        setAction((Action)null);
        return;
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL:
        setControl((Control)null);
        return;
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL_ACCESS:
        setControlAccess(CONTROL_ACCESS_EDEFAULT);
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
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__ACTION:
        return action != null;
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL:
        return control != null;
      case AppBuilderDSLPackage.UI_LISTENER_BINDING__CONTROL_ACCESS:
        return CONTROL_ACCESS_EDEFAULT == null ? controlAccess != null : !CONTROL_ACCESS_EDEFAULT.equals(controlAccess);
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
    result.append(" (controlAccess: ");
    result.append(controlAccess);
    result.append(')');
    return result.toString();
  }

} //UiListenerBindingImpl
