/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ValidatorFeature;
import org.example.domainmodel.domainmodel.ValidatorRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidatorRuleImpl#getStringRule <em>String Rule</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidatorRuleImpl#getConditionName <em>Condition Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidatorRuleImpl extends MinimalEObjectImpl.Container implements ValidatorRule
{
  /**
   * The default value of the '{@link #getStringRule() <em>String Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringRule()
   * @generated
   * @ordered
   */
  protected static final String STRING_RULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringRule() <em>String Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringRule()
   * @generated
   * @ordered
   */
  protected String stringRule = STRING_RULE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionName() <em>Condition Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionName()
   * @generated
   * @ordered
   */
  protected ValidatorFeature conditionName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidatorRuleImpl()
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
    return DomainmodelPackage.Literals.VALIDATOR_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringRule()
  {
    return stringRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringRule(String newStringRule)
  {
    String oldStringRule = stringRule;
    stringRule = newStringRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATOR_RULE__STRING_RULE, oldStringRule, stringRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorFeature getConditionName()
  {
    if (conditionName != null && conditionName.eIsProxy())
    {
      InternalEObject oldConditionName = (InternalEObject)conditionName;
      conditionName = (ValidatorFeature)eResolveProxy(oldConditionName);
      if (conditionName != oldConditionName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.VALIDATOR_RULE__CONDITION_NAME, oldConditionName, conditionName));
      }
    }
    return conditionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidatorFeature basicGetConditionName()
  {
    return conditionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionName(ValidatorFeature newConditionName)
  {
    ValidatorFeature oldConditionName = conditionName;
    conditionName = newConditionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VALIDATOR_RULE__CONDITION_NAME, oldConditionName, conditionName));
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
      case DomainmodelPackage.VALIDATOR_RULE__STRING_RULE:
        return getStringRule();
      case DomainmodelPackage.VALIDATOR_RULE__CONDITION_NAME:
        if (resolve) return getConditionName();
        return basicGetConditionName();
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
      case DomainmodelPackage.VALIDATOR_RULE__STRING_RULE:
        setStringRule((String)newValue);
        return;
      case DomainmodelPackage.VALIDATOR_RULE__CONDITION_NAME:
        setConditionName((ValidatorFeature)newValue);
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
      case DomainmodelPackage.VALIDATOR_RULE__STRING_RULE:
        setStringRule(STRING_RULE_EDEFAULT);
        return;
      case DomainmodelPackage.VALIDATOR_RULE__CONDITION_NAME:
        setConditionName((ValidatorFeature)null);
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
      case DomainmodelPackage.VALIDATOR_RULE__STRING_RULE:
        return STRING_RULE_EDEFAULT == null ? stringRule != null : !STRING_RULE_EDEFAULT.equals(stringRule);
      case DomainmodelPackage.VALIDATOR_RULE__CONDITION_NAME:
        return conditionName != null;
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
    result.append(" (stringRule: ");
    result.append(stringRule);
    result.append(')');
    return result.toString();
  }

} //ValidatorRuleImpl
