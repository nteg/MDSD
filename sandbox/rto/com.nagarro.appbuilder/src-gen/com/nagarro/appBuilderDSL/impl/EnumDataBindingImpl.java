/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.EnumDataBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Data Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.EnumDataBindingImpl#getEnumClassName <em>Enum Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumDataBindingImpl extends DataBindingImpl implements EnumDataBinding
{
  /**
   * The default value of the '{@link #getEnumClassName() <em>Enum Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumClassName()
   * @generated
   * @ordered
   */
  protected static final String ENUM_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnumClassName() <em>Enum Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumClassName()
   * @generated
   * @ordered
   */
  protected String enumClassName = ENUM_CLASS_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumDataBindingImpl()
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
    return AppBuilderDSLPackage.Literals.ENUM_DATA_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnumClassName()
  {
    return enumClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumClassName(String newEnumClassName)
  {
    String oldEnumClassName = enumClassName;
    enumClassName = newEnumClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.ENUM_DATA_BINDING__ENUM_CLASS_NAME, oldEnumClassName, enumClassName));
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
      case AppBuilderDSLPackage.ENUM_DATA_BINDING__ENUM_CLASS_NAME:
        return getEnumClassName();
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
      case AppBuilderDSLPackage.ENUM_DATA_BINDING__ENUM_CLASS_NAME:
        setEnumClassName((String)newValue);
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
      case AppBuilderDSLPackage.ENUM_DATA_BINDING__ENUM_CLASS_NAME:
        setEnumClassName(ENUM_CLASS_NAME_EDEFAULT);
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
      case AppBuilderDSLPackage.ENUM_DATA_BINDING__ENUM_CLASS_NAME:
        return ENUM_CLASS_NAME_EDEFAULT == null ? enumClassName != null : !ENUM_CLASS_NAME_EDEFAULT.equals(enumClassName);
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
    result.append(" (enumClassName: ");
    result.append(enumClassName);
    result.append(')');
    return result.toString();
  }

} //EnumDataBindingImpl
