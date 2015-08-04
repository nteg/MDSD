/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ElementFeature;
import org.example.domainmodel.domainmodel.PropertyNameLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ElementFeatureImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ElementFeatureImpl#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementFeatureImpl extends MinimalEObjectImpl.Container implements ElementFeature
{
  /**
   * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected static final PropertyNameLiteral PROPERTY_NAME_EDEFAULT = PropertyNameLiteral.LABEL_PROVIDER;

  /**
   * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected PropertyNameLiteral propertyName = PROPERTY_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementFeatureImpl()
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
    return DomainmodelPackage.Literals.ELEMENT_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyNameLiteral getPropertyName()
  {
    return propertyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyName(PropertyNameLiteral newPropertyName)
  {
    PropertyNameLiteral oldPropertyName = propertyName;
    propertyName = newPropertyName == null ? PROPERTY_NAME_EDEFAULT : newPropertyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_NAME, oldPropertyName, propertyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyValue()
  {
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyValue(String newPropertyValue)
  {
    String oldPropertyValue = propertyValue;
    propertyValue = newPropertyValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_VALUE, oldPropertyValue, propertyValue));
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
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_NAME:
        return getPropertyName();
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_VALUE:
        return getPropertyValue();
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
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_NAME:
        setPropertyName((PropertyNameLiteral)newValue);
        return;
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_VALUE:
        setPropertyValue((String)newValue);
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
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_NAME:
        setPropertyName(PROPERTY_NAME_EDEFAULT);
        return;
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_VALUE:
        setPropertyValue(PROPERTY_VALUE_EDEFAULT);
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
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_NAME:
        return propertyName != PROPERTY_NAME_EDEFAULT;
      case DomainmodelPackage.ELEMENT_FEATURE__PROPERTY_VALUE:
        return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
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
    result.append(" (propertyName: ");
    result.append(propertyName);
    result.append(", propertyValue: ");
    result.append(propertyValue);
    result.append(')');
    return result.toString();
  }

} //ElementFeatureImpl
