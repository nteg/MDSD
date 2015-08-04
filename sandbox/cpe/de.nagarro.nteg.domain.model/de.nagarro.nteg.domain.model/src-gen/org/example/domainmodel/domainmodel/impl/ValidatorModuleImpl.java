/**
 */
package org.example.domainmodel.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ValidatorFeature;
import org.example.domainmodel.domainmodel.ValidatorModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ValidatorModuleImpl#getValidatorFeatures <em>Validator Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidatorModuleImpl extends ControllerElementImpl implements ValidatorModule
{
  /**
   * The cached value of the '{@link #getValidatorFeatures() <em>Validator Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidatorFeatures()
   * @generated
   * @ordered
   */
  protected EList<ValidatorFeature> validatorFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidatorModuleImpl()
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
    return DomainmodelPackage.Literals.VALIDATOR_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValidatorFeature> getValidatorFeatures()
  {
    if (validatorFeatures == null)
    {
      validatorFeatures = new EObjectContainmentEList<ValidatorFeature>(ValidatorFeature.class, this, DomainmodelPackage.VALIDATOR_MODULE__VALIDATOR_FEATURES);
    }
    return validatorFeatures;
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
      case DomainmodelPackage.VALIDATOR_MODULE__VALIDATOR_FEATURES:
        return ((InternalEList<?>)getValidatorFeatures()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.VALIDATOR_MODULE__VALIDATOR_FEATURES:
        return getValidatorFeatures();
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
      case DomainmodelPackage.VALIDATOR_MODULE__VALIDATOR_FEATURES:
        getValidatorFeatures().clear();
        getValidatorFeatures().addAll((Collection<? extends ValidatorFeature>)newValue);
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
      case DomainmodelPackage.VALIDATOR_MODULE__VALIDATOR_FEATURES:
        getValidatorFeatures().clear();
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
      case DomainmodelPackage.VALIDATOR_MODULE__VALIDATOR_FEATURES:
        return validatorFeatures != null && !validatorFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ValidatorModuleImpl
