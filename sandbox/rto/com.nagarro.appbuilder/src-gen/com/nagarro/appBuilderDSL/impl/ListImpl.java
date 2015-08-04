/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.List;
import com.nagarro.appBuilderDSL.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ListImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ListImpl#getLabelprovider <em>Labelprovider</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ListImpl#getCssStyle <em>Css Style</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ListImpl#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends ControlImpl implements List
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLabelprovider() <em>Labelprovider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelprovider()
   * @generated
   * @ordered
   */
  protected Value labelprovider;

  /**
   * The cached value of the '{@link #getCssStyle() <em>Css Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCssStyle()
   * @generated
   * @ordered
   */
  protected Value cssStyle;

  /**
   * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTooltip()
   * @generated
   * @ordered
   */
  protected Value tooltip;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListImpl()
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
    return AppBuilderDSLPackage.Literals.LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.LIST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getLabelprovider()
  {
    return labelprovider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabelprovider(Value newLabelprovider, NotificationChain msgs)
  {
    Value oldLabelprovider = labelprovider;
    labelprovider = newLabelprovider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.LIST__LABELPROVIDER, oldLabelprovider, newLabelprovider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelprovider(Value newLabelprovider)
  {
    if (newLabelprovider != labelprovider)
    {
      NotificationChain msgs = null;
      if (labelprovider != null)
        msgs = ((InternalEObject)labelprovider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.LIST__LABELPROVIDER, null, msgs);
      if (newLabelprovider != null)
        msgs = ((InternalEObject)newLabelprovider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.LIST__LABELPROVIDER, null, msgs);
      msgs = basicSetLabelprovider(newLabelprovider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.LIST__LABELPROVIDER, newLabelprovider, newLabelprovider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getCssStyle()
  {
    return cssStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCssStyle(Value newCssStyle, NotificationChain msgs)
  {
    Value oldCssStyle = cssStyle;
    cssStyle = newCssStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.LIST__CSS_STYLE, oldCssStyle, newCssStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCssStyle(Value newCssStyle)
  {
    if (newCssStyle != cssStyle)
    {
      NotificationChain msgs = null;
      if (cssStyle != null)
        msgs = ((InternalEObject)cssStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.LIST__CSS_STYLE, null, msgs);
      if (newCssStyle != null)
        msgs = ((InternalEObject)newCssStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.LIST__CSS_STYLE, null, msgs);
      msgs = basicSetCssStyle(newCssStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.LIST__CSS_STYLE, newCssStyle, newCssStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getTooltip()
  {
    return tooltip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTooltip(Value newTooltip, NotificationChain msgs)
  {
    Value oldTooltip = tooltip;
    tooltip = newTooltip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.LIST__TOOLTIP, oldTooltip, newTooltip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTooltip(Value newTooltip)
  {
    if (newTooltip != tooltip)
    {
      NotificationChain msgs = null;
      if (tooltip != null)
        msgs = ((InternalEObject)tooltip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.LIST__TOOLTIP, null, msgs);
      if (newTooltip != null)
        msgs = ((InternalEObject)newTooltip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.LIST__TOOLTIP, null, msgs);
      msgs = basicSetTooltip(newTooltip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.LIST__TOOLTIP, newTooltip, newTooltip));
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
      case AppBuilderDSLPackage.LIST__LABELPROVIDER:
        return basicSetLabelprovider(null, msgs);
      case AppBuilderDSLPackage.LIST__CSS_STYLE:
        return basicSetCssStyle(null, msgs);
      case AppBuilderDSLPackage.LIST__TOOLTIP:
        return basicSetTooltip(null, msgs);
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
      case AppBuilderDSLPackage.LIST__NAME:
        return getName();
      case AppBuilderDSLPackage.LIST__LABELPROVIDER:
        return getLabelprovider();
      case AppBuilderDSLPackage.LIST__CSS_STYLE:
        return getCssStyle();
      case AppBuilderDSLPackage.LIST__TOOLTIP:
        return getTooltip();
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
      case AppBuilderDSLPackage.LIST__NAME:
        setName((String)newValue);
        return;
      case AppBuilderDSLPackage.LIST__LABELPROVIDER:
        setLabelprovider((Value)newValue);
        return;
      case AppBuilderDSLPackage.LIST__CSS_STYLE:
        setCssStyle((Value)newValue);
        return;
      case AppBuilderDSLPackage.LIST__TOOLTIP:
        setTooltip((Value)newValue);
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
      case AppBuilderDSLPackage.LIST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AppBuilderDSLPackage.LIST__LABELPROVIDER:
        setLabelprovider((Value)null);
        return;
      case AppBuilderDSLPackage.LIST__CSS_STYLE:
        setCssStyle((Value)null);
        return;
      case AppBuilderDSLPackage.LIST__TOOLTIP:
        setTooltip((Value)null);
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
      case AppBuilderDSLPackage.LIST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AppBuilderDSLPackage.LIST__LABELPROVIDER:
        return labelprovider != null;
      case AppBuilderDSLPackage.LIST__CSS_STYLE:
        return cssStyle != null;
      case AppBuilderDSLPackage.LIST__TOOLTIP:
        return tooltip != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ListImpl
