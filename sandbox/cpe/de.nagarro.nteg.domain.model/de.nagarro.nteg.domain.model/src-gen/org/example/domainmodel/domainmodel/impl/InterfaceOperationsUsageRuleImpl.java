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
import org.example.domainmodel.domainmodel.InterfaceOperationUsageRule;
import org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Operations Usage Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InterfaceOperationsUsageRuleImpl#getUsageOperations <em>Usage Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceOperationsUsageRuleImpl extends MinimalEObjectImpl.Container implements InterfaceOperationsUsageRule
{
  /**
   * The cached value of the '{@link #getUsageOperations() <em>Usage Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsageOperations()
   * @generated
   * @ordered
   */
  protected EList<InterfaceOperationUsageRule> usageOperations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceOperationsUsageRuleImpl()
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
    return DomainmodelPackage.Literals.INTERFACE_OPERATIONS_USAGE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceOperationUsageRule> getUsageOperations()
  {
    if (usageOperations == null)
    {
      usageOperations = new EObjectContainmentEList<InterfaceOperationUsageRule>(InterfaceOperationUsageRule.class, this, DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS);
    }
    return usageOperations;
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
      case DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS:
        return ((InternalEList<?>)getUsageOperations()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS:
        return getUsageOperations();
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
      case DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS:
        getUsageOperations().clear();
        getUsageOperations().addAll((Collection<? extends InterfaceOperationUsageRule>)newValue);
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
      case DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS:
        getUsageOperations().clear();
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
      case DomainmodelPackage.INTERFACE_OPERATIONS_USAGE_RULE__USAGE_OPERATIONS:
        return usageOperations != null && !usageOperations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceOperationsUsageRuleImpl
