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
import org.example.domainmodel.domainmodel.ValidatorFeature;
import org.example.domainmodel.domainmodel.ValidatorRules;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidatorFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidatorFeatureImpl#getValidatorRules <em>Validator Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidatorFeatureImpl extends MinimalEObjectImpl.Container implements ValidatorFeature
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
   * The cached value of the '{@link #getValidatorRules() <em>Validator Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidatorRules()
   * @generated
   * @ordered
   */
  protected ValidatorRules validatorRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidatorFeatureImpl()
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
    return DomainmodelPackage.Literals.VALIDATOR_FEATURE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATOR_FEATURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorRules getValidatorRules()
  {
    return validatorRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidatorRules(ValidatorRules newValidatorRules, NotificationChain msgs)
  {
    ValidatorRules oldValidatorRules = validatorRules;
    validatorRules = newValidatorRules;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES, oldValidatorRules, newValidatorRules);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidatorRules(ValidatorRules newValidatorRules)
  {
    if (newValidatorRules != validatorRules)
    {
      NotificationChain msgs = null;
      if (validatorRules != null)
        msgs = ((InternalEObject)validatorRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES, null, msgs);
      if (newValidatorRules != null)
        msgs = ((InternalEObject)newValidatorRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES, null, msgs);
      msgs = basicSetValidatorRules(newValidatorRules, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES, newValidatorRules, newValidatorRules));
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
      case DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES:
        return basicSetValidatorRules(null, msgs);
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
      case DomainmodelPackage.VALIDATOR_FEATURE__NAME:
        return getName();
      case DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES:
        return getValidatorRules();
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
      case DomainmodelPackage.VALIDATOR_FEATURE__NAME:
        setName((String)newValue);
        return;
      case DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES:
        setValidatorRules((ValidatorRules)newValue);
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
      case DomainmodelPackage.VALIDATOR_FEATURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES:
        setValidatorRules((ValidatorRules)null);
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
      case DomainmodelPackage.VALIDATOR_FEATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.VALIDATOR_FEATURE__VALIDATOR_RULES:
        return validatorRules != null;
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

} //ValidatorFeatureImpl
