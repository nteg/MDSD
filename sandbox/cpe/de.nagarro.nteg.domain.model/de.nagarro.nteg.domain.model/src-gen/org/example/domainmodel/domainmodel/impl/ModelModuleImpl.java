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
import org.example.domainmodel.domainmodel.ModelFeature;
import org.example.domainmodel.domainmodel.ModelModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ModelModuleImpl#getModelFeatures <em>Model Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelModuleImpl extends ScreenModuleImpl implements ModelModule
{
  /**
   * The cached value of the '{@link #getModelFeatures() <em>Model Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFeatures()
   * @generated
   * @ordered
   */
  protected EList<ModelFeature> modelFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelModuleImpl()
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
    return DomainmodelPackage.Literals.MODEL_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelFeature> getModelFeatures()
  {
    if (modelFeatures == null)
    {
      modelFeatures = new EObjectContainmentEList<ModelFeature>(ModelFeature.class, this, DomainmodelPackage.MODEL_MODULE__MODEL_FEATURES);
    }
    return modelFeatures;
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
      case DomainmodelPackage.MODEL_MODULE__MODEL_FEATURES:
        return ((InternalEList<?>)getModelFeatures()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.MODEL_MODULE__MODEL_FEATURES:
        return getModelFeatures();
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
      case DomainmodelPackage.MODEL_MODULE__MODEL_FEATURES:
        getModelFeatures().clear();
        getModelFeatures().addAll((Collection<? extends ModelFeature>)newValue);
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
      case DomainmodelPackage.MODEL_MODULE__MODEL_FEATURES:
        getModelFeatures().clear();
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
      case DomainmodelPackage.MODEL_MODULE__MODEL_FEATURES:
        return modelFeatures != null && !modelFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelModuleImpl
