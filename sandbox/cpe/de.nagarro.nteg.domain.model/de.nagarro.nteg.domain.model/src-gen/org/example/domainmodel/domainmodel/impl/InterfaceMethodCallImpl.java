/**
 */
package org.example.domainmodel.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.domainmodel.domainmodel.BusinessFeature;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.InterfaceMethodCall;
import org.example.domainmodel.domainmodel.InterfaceMethodCallParameters;
import org.example.domainmodel.domainmodel.MethodCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallImpl#getInterfaceInstanceName <em>Interface Instance Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceMethodCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceMethodCallImpl extends UIActionFeatureImpl implements InterfaceMethodCall
{
  /**
   * The cached value of the '{@link #getInterfaceInstanceName() <em>Interface Instance Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceInstanceName()
   * @generated
   * @ordered
   */
  protected BusinessFeature interfaceInstanceName;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected MethodCall methodName;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<InterfaceMethodCallParameters> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceMethodCallImpl()
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
    return DomainmodelPackage.Literals.INTERFACE_METHOD_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeature getInterfaceInstanceName()
  {
    if (interfaceInstanceName != null && interfaceInstanceName.eIsProxy())
    {
      InternalEObject oldInterfaceInstanceName = (InternalEObject)interfaceInstanceName;
      interfaceInstanceName = (BusinessFeature)eResolveProxy(oldInterfaceInstanceName);
      if (interfaceInstanceName != oldInterfaceInstanceName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME, oldInterfaceInstanceName, interfaceInstanceName));
      }
    }
    return interfaceInstanceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeature basicGetInterfaceInstanceName()
  {
    return interfaceInstanceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceInstanceName(BusinessFeature newInterfaceInstanceName)
  {
    BusinessFeature oldInterfaceInstanceName = interfaceInstanceName;
    interfaceInstanceName = newInterfaceInstanceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME, oldInterfaceInstanceName, interfaceInstanceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall getMethodName()
  {
    if (methodName != null && methodName.eIsProxy())
    {
      InternalEObject oldMethodName = (InternalEObject)methodName;
      methodName = (MethodCall)eResolveProxy(oldMethodName);
      if (methodName != oldMethodName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.INTERFACE_METHOD_CALL__METHOD_NAME, oldMethodName, methodName));
      }
    }
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall basicGetMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(MethodCall newMethodName)
  {
    MethodCall oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_METHOD_CALL__METHOD_NAME, oldMethodName, methodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceMethodCallParameters> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<InterfaceMethodCallParameters>(InterfaceMethodCallParameters.class, this, DomainmodelPackage.INTERFACE_METHOD_CALL__PARAMETERS);
    }
    return parameters;
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME:
        if (resolve) return getInterfaceInstanceName();
        return basicGetInterfaceInstanceName();
      case DomainmodelPackage.INTERFACE_METHOD_CALL__METHOD_NAME:
        if (resolve) return getMethodName();
        return basicGetMethodName();
      case DomainmodelPackage.INTERFACE_METHOD_CALL__PARAMETERS:
        return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME:
        setInterfaceInstanceName((BusinessFeature)newValue);
        return;
      case DomainmodelPackage.INTERFACE_METHOD_CALL__METHOD_NAME:
        setMethodName((MethodCall)newValue);
        return;
      case DomainmodelPackage.INTERFACE_METHOD_CALL__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends InterfaceMethodCallParameters>)newValue);
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME:
        setInterfaceInstanceName((BusinessFeature)null);
        return;
      case DomainmodelPackage.INTERFACE_METHOD_CALL__METHOD_NAME:
        setMethodName((MethodCall)null);
        return;
      case DomainmodelPackage.INTERFACE_METHOD_CALL__PARAMETERS:
        getParameters().clear();
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
      case DomainmodelPackage.INTERFACE_METHOD_CALL__INTERFACE_INSTANCE_NAME:
        return interfaceInstanceName != null;
      case DomainmodelPackage.INTERFACE_METHOD_CALL__METHOD_NAME:
        return methodName != null;
      case DomainmodelPackage.INTERFACE_METHOD_CALL__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceMethodCallImpl
