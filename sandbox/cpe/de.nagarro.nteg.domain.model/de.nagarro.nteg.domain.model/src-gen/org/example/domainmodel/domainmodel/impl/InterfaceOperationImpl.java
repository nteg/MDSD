/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.InterfaceOperation;
import org.example.domainmodel.domainmodel.MethodCall;
import org.example.domainmodel.domainmodel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationImpl#getRestOperation <em>Rest Operation</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationImpl#getMethodCall <em>Method Call</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceOperationImpl extends MinimalEObjectImpl.Container implements InterfaceOperation
{
  /**
   * The default value of the '{@link #getRestOperation() <em>Rest Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestOperation()
   * @generated
   * @ordered
   */
  protected static final String REST_OPERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRestOperation() <em>Rest Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestOperation()
   * @generated
   * @ordered
   */
  protected String restOperation = REST_OPERATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethodCall() <em>Method Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodCall()
   * @generated
   * @ordered
   */
  protected MethodCall methodCall;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceOperationImpl()
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
    return DomainmodelPackage.Literals.INTERFACE_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRestOperation()
  {
    return restOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestOperation(String newRestOperation)
  {
    String oldRestOperation = restOperation;
    restOperation = newRestOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_OPERATION__REST_OPERATION, oldRestOperation, restOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall getMethodCall()
  {
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodCall(MethodCall newMethodCall, NotificationChain msgs)
  {
    MethodCall oldMethodCall = methodCall;
    methodCall = newMethodCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL, oldMethodCall, newMethodCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodCall(MethodCall newMethodCall)
  {
    if (newMethodCall != methodCall)
    {
      NotificationChain msgs = null;
      if (methodCall != null)
        msgs = ((InternalEObject)methodCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL, null, msgs);
      if (newMethodCall != null)
        msgs = ((InternalEObject)newMethodCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL, null, msgs);
      msgs = basicSetMethodCall(newMethodCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL, newMethodCall, newMethodCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.INTERFACE_OPERATION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTERFACE_OPERATION__TYPE, oldType, type));
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
      case DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL:
        return basicSetMethodCall(null, msgs);
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
      case DomainmodelPackage.INTERFACE_OPERATION__REST_OPERATION:
        return getRestOperation();
      case DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL:
        return getMethodCall();
      case DomainmodelPackage.INTERFACE_OPERATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case DomainmodelPackage.INTERFACE_OPERATION__REST_OPERATION:
        setRestOperation((String)newValue);
        return;
      case DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL:
        setMethodCall((MethodCall)newValue);
        return;
      case DomainmodelPackage.INTERFACE_OPERATION__TYPE:
        setType((Type)newValue);
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
      case DomainmodelPackage.INTERFACE_OPERATION__REST_OPERATION:
        setRestOperation(REST_OPERATION_EDEFAULT);
        return;
      case DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL:
        setMethodCall((MethodCall)null);
        return;
      case DomainmodelPackage.INTERFACE_OPERATION__TYPE:
        setType((Type)null);
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
      case DomainmodelPackage.INTERFACE_OPERATION__REST_OPERATION:
        return REST_OPERATION_EDEFAULT == null ? restOperation != null : !REST_OPERATION_EDEFAULT.equals(restOperation);
      case DomainmodelPackage.INTERFACE_OPERATION__METHOD_CALL:
        return methodCall != null;
      case DomainmodelPackage.INTERFACE_OPERATION__TYPE:
        return type != null;
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
    result.append(" (restOperation: ");
    result.append(restOperation);
    result.append(')');
    return result.toString();
  }

} //InterfaceOperationImpl
