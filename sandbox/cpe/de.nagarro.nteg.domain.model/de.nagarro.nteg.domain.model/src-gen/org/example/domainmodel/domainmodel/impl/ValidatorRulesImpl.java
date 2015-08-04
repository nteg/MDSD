/**
 */
package org.example.domainmodel.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ValidatorRule;
import org.example.domainmodel.domainmodel.ValidatorRules;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidatorRulesImpl#getValidatorRules <em>Validator Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidatorRulesImpl extends MinimalEObjectImpl.Container implements ValidatorRules
{
  /**
   * The cached value of the '{@link #getValidatorRules() <em>Validator Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidatorRules()
   * @generated
   * @ordered
   */
  protected EList<ValidatorRule> validatorRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidatorRulesImpl()
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
    return DomainmodelPackage.Literals.VALIDATOR_RULES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValidatorRule> getValidatorRules()
  {
    if (validatorRules == null)
    {
      validatorRules = new EObjectContainmentEList<ValidatorRule>(ValidatorRule.class, this, DomainmodelPackage.VALIDATOR_RULES__VALIDATOR_RULES);
    }
    return validatorRules;
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
      case DomainmodelPackage.VALIDATOR_RULES__VALIDATOR_RULES:
        return ((InternalEList<?>)getValidatorRules()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.VALIDATOR_RULES__VALIDATOR_RULES:
        return getValidatorRules();
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
      case DomainmodelPackage.VALIDATOR_RULES__VALIDATOR_RULES:
        getValidatorRules().clear();
        getValidatorRules().addAll((Collection<? extends ValidatorRule>)newValue);
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
      case DomainmodelPackage.VALIDATOR_RULES__VALIDATOR_RULES:
        getValidatorRules().clear();
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
      case DomainmodelPackage.VALIDATOR_RULES__VALIDATOR_RULES:
        return validatorRules != null && !validatorRules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ValidatorRulesImpl
