/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.domainmodel.domainmodel.BusinessFeature;
import org.example.domainmodel.domainmodel.BusinessFeatureType;
import org.example.domainmodel.domainmodel.DomainmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl#getConnectPoint1 <em>Connect Point1</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl#getConnectPoint2 <em>Connect Point2</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BusinessFeatureImpl#getConnectEnd <em>Connect End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessFeatureImpl extends MinimalEObjectImpl.Container implements BusinessFeature
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected BusinessFeatureType type;

  /**
   * The default value of the '{@link #getConnectPoint1() <em>Connect Point1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectPoint1()
   * @generated
   * @ordered
   */
  protected static final String CONNECT_POINT1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnectPoint1() <em>Connect Point1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectPoint1()
   * @generated
   * @ordered
   */
  protected String connectPoint1 = CONNECT_POINT1_EDEFAULT;

  /**
   * The cached value of the '{@link #getConnectPoint2() <em>Connect Point2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectPoint2()
   * @generated
   * @ordered
   */
  protected BusinessFeature connectPoint2;

  /**
   * The default value of the '{@link #getConnectEnd() <em>Connect End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectEnd()
   * @generated
   * @ordered
   */
  protected static final String CONNECT_END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnectEnd() <em>Connect End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectEnd()
   * @generated
   * @ordered
   */
  protected String connectEnd = CONNECT_END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessFeatureImpl()
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
    return DomainmodelPackage.Literals.BUSINESS_FEATURE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BUSINESS_FEATURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeatureType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (BusinessFeatureType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.BUSINESS_FEATURE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeatureType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(BusinessFeatureType newType)
  {
    BusinessFeatureType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BUSINESS_FEATURE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConnectPoint1()
  {
    return connectPoint1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectPoint1(String newConnectPoint1)
  {
    String oldConnectPoint1 = connectPoint1;
    connectPoint1 = newConnectPoint1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT1, oldConnectPoint1, connectPoint1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeature getConnectPoint2()
  {
    if (connectPoint2 != null && connectPoint2.eIsProxy())
    {
      InternalEObject oldConnectPoint2 = (InternalEObject)connectPoint2;
      connectPoint2 = (BusinessFeature)eResolveProxy(oldConnectPoint2);
      if (connectPoint2 != oldConnectPoint2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT2, oldConnectPoint2, connectPoint2));
      }
    }
    return connectPoint2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessFeature basicGetConnectPoint2()
  {
    return connectPoint2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectPoint2(BusinessFeature newConnectPoint2)
  {
    BusinessFeature oldConnectPoint2 = connectPoint2;
    connectPoint2 = newConnectPoint2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT2, oldConnectPoint2, connectPoint2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConnectEnd()
  {
    return connectEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectEnd(String newConnectEnd)
  {
    String oldConnectEnd = connectEnd;
    connectEnd = newConnectEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BUSINESS_FEATURE__CONNECT_END, oldConnectEnd, connectEnd));
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
      case DomainmodelPackage.BUSINESS_FEATURE__NAME:
        return getName();
      case DomainmodelPackage.BUSINESS_FEATURE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT1:
        return getConnectPoint1();
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT2:
        if (resolve) return getConnectPoint2();
        return basicGetConnectPoint2();
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_END:
        return getConnectEnd();
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
      case DomainmodelPackage.BUSINESS_FEATURE__NAME:
        setName((String)newValue);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__TYPE:
        setType((BusinessFeatureType)newValue);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT1:
        setConnectPoint1((String)newValue);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT2:
        setConnectPoint2((BusinessFeature)newValue);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_END:
        setConnectEnd((String)newValue);
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
      case DomainmodelPackage.BUSINESS_FEATURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__TYPE:
        setType((BusinessFeatureType)null);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT1:
        setConnectPoint1(CONNECT_POINT1_EDEFAULT);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT2:
        setConnectPoint2((BusinessFeature)null);
        return;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_END:
        setConnectEnd(CONNECT_END_EDEFAULT);
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
      case DomainmodelPackage.BUSINESS_FEATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.BUSINESS_FEATURE__TYPE:
        return type != null;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT1:
        return CONNECT_POINT1_EDEFAULT == null ? connectPoint1 != null : !CONNECT_POINT1_EDEFAULT.equals(connectPoint1);
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_POINT2:
        return connectPoint2 != null;
      case DomainmodelPackage.BUSINESS_FEATURE__CONNECT_END:
        return CONNECT_END_EDEFAULT == null ? connectEnd != null : !CONNECT_END_EDEFAULT.equals(connectEnd);
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
    result.append(", connectPoint1: ");
    result.append(connectPoint1);
    result.append(", connectEnd: ");
    result.append(connectEnd);
    result.append(')');
    return result.toString();
  }

} //BusinessFeatureImpl
