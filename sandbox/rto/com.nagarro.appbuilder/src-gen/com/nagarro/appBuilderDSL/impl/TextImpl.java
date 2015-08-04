/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Text;
import com.nagarro.appBuilderDSL.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.TextImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.TextImpl#getCssStyle <em>Css Style</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.TextImpl#getResourceKey <em>Resource Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends ControlImpl implements Text
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
   * The cached value of the '{@link #getCssStyle() <em>Css Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCssStyle()
   * @generated
   * @ordered
   */
  protected Value cssStyle;

  /**
   * The cached value of the '{@link #getResourceKey() <em>Resource Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceKey()
   * @generated
   * @ordered
   */
  protected Value resourceKey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextImpl()
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
    return AppBuilderDSLPackage.Literals.TEXT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.TEXT__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.TEXT__CSS_STYLE, oldCssStyle, newCssStyle);
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
        msgs = ((InternalEObject)cssStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.TEXT__CSS_STYLE, null, msgs);
      if (newCssStyle != null)
        msgs = ((InternalEObject)newCssStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.TEXT__CSS_STYLE, null, msgs);
      msgs = basicSetCssStyle(newCssStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.TEXT__CSS_STYLE, newCssStyle, newCssStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getResourceKey()
  {
    return resourceKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceKey(Value newResourceKey, NotificationChain msgs)
  {
    Value oldResourceKey = resourceKey;
    resourceKey = newResourceKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.TEXT__RESOURCE_KEY, oldResourceKey, newResourceKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceKey(Value newResourceKey)
  {
    if (newResourceKey != resourceKey)
    {
      NotificationChain msgs = null;
      if (resourceKey != null)
        msgs = ((InternalEObject)resourceKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.TEXT__RESOURCE_KEY, null, msgs);
      if (newResourceKey != null)
        msgs = ((InternalEObject)newResourceKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.TEXT__RESOURCE_KEY, null, msgs);
      msgs = basicSetResourceKey(newResourceKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.TEXT__RESOURCE_KEY, newResourceKey, newResourceKey));
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
      case AppBuilderDSLPackage.TEXT__CSS_STYLE:
        return basicSetCssStyle(null, msgs);
      case AppBuilderDSLPackage.TEXT__RESOURCE_KEY:
        return basicSetResourceKey(null, msgs);
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
      case AppBuilderDSLPackage.TEXT__NAME:
        return getName();
      case AppBuilderDSLPackage.TEXT__CSS_STYLE:
        return getCssStyle();
      case AppBuilderDSLPackage.TEXT__RESOURCE_KEY:
        return getResourceKey();
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
      case AppBuilderDSLPackage.TEXT__NAME:
        setName((String)newValue);
        return;
      case AppBuilderDSLPackage.TEXT__CSS_STYLE:
        setCssStyle((Value)newValue);
        return;
      case AppBuilderDSLPackage.TEXT__RESOURCE_KEY:
        setResourceKey((Value)newValue);
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
      case AppBuilderDSLPackage.TEXT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AppBuilderDSLPackage.TEXT__CSS_STYLE:
        setCssStyle((Value)null);
        return;
      case AppBuilderDSLPackage.TEXT__RESOURCE_KEY:
        setResourceKey((Value)null);
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
      case AppBuilderDSLPackage.TEXT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AppBuilderDSLPackage.TEXT__CSS_STYLE:
        return cssStyle != null;
      case AppBuilderDSLPackage.TEXT__RESOURCE_KEY:
        return resourceKey != null;
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

} //TextImpl
