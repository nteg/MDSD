/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.DataType;
import org.example.domainmodel.domainmodel.DomainmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.DataTypeImpl#getMappedType <em>Mapped Type</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.DataTypeImpl#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends TypeImpl implements DataType
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
   * The default value of the '{@link #getMappedType() <em>Mapped Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedType()
   * @generated
   * @ordered
   */
  protected static final String MAPPED_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappedType() <em>Mapped Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedType()
   * @generated
   * @ordered
   */
  protected String mappedType = MAPPED_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitValue()
   * @generated
   * @ordered
   */
  protected static final String INIT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitValue()
   * @generated
   * @ordered
   */
  protected String initValue = INIT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl()
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
    return DomainmodelPackage.Literals.DATA_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.DATA_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMappedType()
  {
    return mappedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedType(String newMappedType)
  {
    String oldMappedType = mappedType;
    mappedType = newMappedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.DATA_TYPE__MAPPED_TYPE, oldMappedType, mappedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitValue()
  {
    return initValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitValue(String newInitValue)
  {
    String oldInitValue = initValue;
    initValue = newInitValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.DATA_TYPE__INIT_VALUE, oldInitValue, initValue));
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
      case DomainmodelPackage.DATA_TYPE__NAME:
        return getName();
      case DomainmodelPackage.DATA_TYPE__MAPPED_TYPE:
        return getMappedType();
      case DomainmodelPackage.DATA_TYPE__INIT_VALUE:
        return getInitValue();
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
      case DomainmodelPackage.DATA_TYPE__NAME:
        setName((String)newValue);
        return;
      case DomainmodelPackage.DATA_TYPE__MAPPED_TYPE:
        setMappedType((String)newValue);
        return;
      case DomainmodelPackage.DATA_TYPE__INIT_VALUE:
        setInitValue((String)newValue);
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
      case DomainmodelPackage.DATA_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainmodelPackage.DATA_TYPE__MAPPED_TYPE:
        setMappedType(MAPPED_TYPE_EDEFAULT);
        return;
      case DomainmodelPackage.DATA_TYPE__INIT_VALUE:
        setInitValue(INIT_VALUE_EDEFAULT);
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
      case DomainmodelPackage.DATA_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.DATA_TYPE__MAPPED_TYPE:
        return MAPPED_TYPE_EDEFAULT == null ? mappedType != null : !MAPPED_TYPE_EDEFAULT.equals(mappedType);
      case DomainmodelPackage.DATA_TYPE__INIT_VALUE:
        return INIT_VALUE_EDEFAULT == null ? initValue != null : !INIT_VALUE_EDEFAULT.equals(initValue);
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
    result.append(", mappedType: ");
    result.append(mappedType);
    result.append(", initValue: ");
    result.append(initValue);
    result.append(')');
    return result.toString();
  }

} //DataTypeImpl
