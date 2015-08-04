/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.SetUIElementReceiver;
import org.example.domainmodel.domainmodel.UIElementReceiverKey;
import org.example.domainmodel.domainmodel.ViewElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set UI Element Receiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.SetUIElementReceiverImpl#getWidgetName <em>Widget Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.SetUIElementReceiverImpl#getUiKey <em>Ui Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetUIElementReceiverImpl extends SetActionReceiverImpl implements SetUIElementReceiver
{
  /**
   * The cached value of the '{@link #getWidgetName() <em>Widget Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidgetName()
   * @generated
   * @ordered
   */
  protected ViewElement widgetName;

  /**
   * The default value of the '{@link #getUiKey() <em>Ui Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiKey()
   * @generated
   * @ordered
   */
  protected static final UIElementReceiverKey UI_KEY_EDEFAULT = UIElementReceiverKey.SELECTION;

  /**
   * The cached value of the '{@link #getUiKey() <em>Ui Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiKey()
   * @generated
   * @ordered
   */
  protected UIElementReceiverKey uiKey = UI_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetUIElementReceiverImpl()
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
    return DomainmodelPackage.Literals.SET_UI_ELEMENT_RECEIVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewElement getWidgetName()
  {
    if (widgetName != null && widgetName.eIsProxy())
    {
      InternalEObject oldWidgetName = (InternalEObject)widgetName;
      widgetName = (ViewElement)eResolveProxy(oldWidgetName);
      if (widgetName != oldWidgetName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__WIDGET_NAME, oldWidgetName, widgetName));
      }
    }
    return widgetName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewElement basicGetWidgetName()
  {
    return widgetName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidgetName(ViewElement newWidgetName)
  {
    ViewElement oldWidgetName = widgetName;
    widgetName = newWidgetName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__WIDGET_NAME, oldWidgetName, widgetName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIElementReceiverKey getUiKey()
  {
    return uiKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUiKey(UIElementReceiverKey newUiKey)
  {
    UIElementReceiverKey oldUiKey = uiKey;
    uiKey = newUiKey == null ? UI_KEY_EDEFAULT : newUiKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__UI_KEY, oldUiKey, uiKey));
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
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__WIDGET_NAME:
        if (resolve) return getWidgetName();
        return basicGetWidgetName();
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__UI_KEY:
        return getUiKey();
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
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__WIDGET_NAME:
        setWidgetName((ViewElement)newValue);
        return;
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__UI_KEY:
        setUiKey((UIElementReceiverKey)newValue);
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
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__WIDGET_NAME:
        setWidgetName((ViewElement)null);
        return;
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__UI_KEY:
        setUiKey(UI_KEY_EDEFAULT);
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
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__WIDGET_NAME:
        return widgetName != null;
      case DomainmodelPackage.SET_UI_ELEMENT_RECEIVER__UI_KEY:
        return uiKey != UI_KEY_EDEFAULT;
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
    result.append(" (uiKey: ");
    result.append(uiKey);
    result.append(')');
    return result.toString();
  }

} //SetUIElementReceiverImpl
