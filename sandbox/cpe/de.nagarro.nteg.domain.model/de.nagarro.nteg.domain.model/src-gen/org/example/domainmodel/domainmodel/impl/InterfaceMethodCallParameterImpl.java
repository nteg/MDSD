/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.InterfaceMethodCallParameter;
import org.example.domainmodel.domainmodel.MethodParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Method Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParameterImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceMethodCallParameterImpl extends MinimalEObjectImpl.Container implements InterfaceMethodCallParameter
{
  /**
   * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterName()
   * @generated
   * @ordered
   */
  protected MethodParameter parameterName;

  /**
   * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterType()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterType()
   * @generated
   * @ordered
   */
  protected String parameterType = PARAMETER_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceMethodCallParameterImpl()
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
    return DomainmodelPackage.Literals.INTERFACE_METHOD_CALL_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodParameter getParameterName()
  {
    if (parameterName != null && parameterName.eIsProxy())
    {
      InternalEObject oldParameterName = (InternalEObject)parameterName;
      parameterName = (MethodParameter)eResolveProxy(oldParameterName);
      if (parameterName != oldParameterName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME, oldParameterName, parameterName));
      }
    }
    return parameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodParameter basicGetParameterName()
  {
    return parameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterName(MethodParameter newParameterName)
  {
    MethodParameter oldParameterName = parameterName;
    parameterName = newParameterName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME, oldParameterName, parameterName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameterType()
  {
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterType(String newParameterType)
  {
    String oldParameterType = parameterType;
    parameterType = newParameterType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME:
        if (resolve) return getParameterName();
        return basicGetParameterName();
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE:
        return getParameterType();
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME:
        setParameterName((MethodParameter)newValue);
        return;
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE:
        setParameterType((String)newValue);
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME:
        setParameterName((MethodParameter)null);
        return;
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE:
        setParameterType(PARAMETER_TYPE_EDEFAULT);
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_NAME:
        return parameterName != null;
      case DomainmodelPackage.INTERFACE_METHOD_CALL_PARAMETER__PARAMETER_TYPE:
        return PARAMETER_TYPE_EDEFAULT == null ? parameterType != null : !PARAMETER_TYPE_EDEFAULT.equals(parameterType);
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
    result.append(" (parameterType: ");
    result.append(parameterType);
    result.append(')');
    return result.toString();
  }

} //InterfaceMethodCallParameterImpl
