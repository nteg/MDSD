/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.domainmodel.domainmodel.BindSource;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ModelFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BindSourceImpl#getModelFeatureName <em>Model Feature Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindSourceImpl extends MinimalEObjectImpl.Container implements BindSource
{
  /**
   * The cached value of the '{@link #getModelFeatureName() <em>Model Feature Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFeatureName()
   * @generated
   * @ordered
   */
  protected ModelFeature modelFeatureName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindSourceImpl()
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
    return DomainmodelPackage.Literals.BIND_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFeature getModelFeatureName()
  {
    if (modelFeatureName != null && modelFeatureName.eIsProxy())
    {
      InternalEObject oldModelFeatureName = (InternalEObject)modelFeatureName;
      modelFeatureName = (ModelFeature)eResolveProxy(oldModelFeatureName);
      if (modelFeatureName != oldModelFeatureName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.BIND_SOURCE__MODEL_FEATURE_NAME, oldModelFeatureName, modelFeatureName));
      }
    }
    return modelFeatureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFeature basicGetModelFeatureName()
  {
    return modelFeatureName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelFeatureName(ModelFeature newModelFeatureName)
  {
    ModelFeature oldModelFeatureName = modelFeatureName;
    modelFeatureName = newModelFeatureName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BIND_SOURCE__MODEL_FEATURE_NAME, oldModelFeatureName, modelFeatureName));
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
      case DomainmodelPackage.BIND_SOURCE__MODEL_FEATURE_NAME:
        if (resolve) return getModelFeatureName();
        return basicGetModelFeatureName();
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
      case DomainmodelPackage.BIND_SOURCE__MODEL_FEATURE_NAME:
        setModelFeatureName((ModelFeature)newValue);
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
      case DomainmodelPackage.BIND_SOURCE__MODEL_FEATURE_NAME:
        setModelFeatureName((ModelFeature)null);
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
      case DomainmodelPackage.BIND_SOURCE__MODEL_FEATURE_NAME:
        return modelFeatureName != null;
    }
    return super.eIsSet(featureID);
  }

} //BindSourceImpl
