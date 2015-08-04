/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.ModelFeature;
import org.example.domainmodel.domainmodel.ScreenModelParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen Model Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ScreenModelParameterImpl#getModelFeatureName <em>Model Feature Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ScreenModelParameterImpl#getModelFeatureValue <em>Model Feature Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenModelParameterImpl extends MinimalEObjectImpl.Container implements ScreenModelParameter
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
   * The default value of the '{@link #getModelFeatureValue() <em>Model Feature Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFeatureValue()
   * @generated
   * @ordered
   */
  protected static final String MODEL_FEATURE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelFeatureValue() <em>Model Feature Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFeatureValue()
   * @generated
   * @ordered
   */
  protected String modelFeatureValue = MODEL_FEATURE_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScreenModelParameterImpl()
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
    return DomainmodelPackage.Literals.SCREEN_MODEL_PARAMETER;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME, oldModelFeatureName, modelFeatureName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME, oldModelFeatureName, modelFeatureName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelFeatureValue()
  {
    return modelFeatureValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelFeatureValue(String newModelFeatureValue)
  {
    String oldModelFeatureValue = modelFeatureValue;
    modelFeatureValue = newModelFeatureValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE, oldModelFeatureValue, modelFeatureValue));
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
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME:
        if (resolve) return getModelFeatureName();
        return basicGetModelFeatureName();
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE:
        return getModelFeatureValue();
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
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME:
        setModelFeatureName((ModelFeature)newValue);
        return;
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE:
        setModelFeatureValue((String)newValue);
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
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME:
        setModelFeatureName((ModelFeature)null);
        return;
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE:
        setModelFeatureValue(MODEL_FEATURE_VALUE_EDEFAULT);
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
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_NAME:
        return modelFeatureName != null;
      case DomainmodelPackage.SCREEN_MODEL_PARAMETER__MODEL_FEATURE_VALUE:
        return MODEL_FEATURE_VALUE_EDEFAULT == null ? modelFeatureValue != null : !MODEL_FEATURE_VALUE_EDEFAULT.equals(modelFeatureValue);
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
    result.append(" (modelFeatureValue: ");
    result.append(modelFeatureValue);
    result.append(')');
    return result.toString();
  }

} //ScreenModelParameterImpl
