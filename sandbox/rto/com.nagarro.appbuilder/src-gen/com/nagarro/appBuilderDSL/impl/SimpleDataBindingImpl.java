/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Attribute;
import com.nagarro.appBuilderDSL.SimpleDataBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Data Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SimpleDataBindingImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SimpleDataBindingImpl#getModelAccess <em>Model Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleDataBindingImpl extends DataBindingImpl implements SimpleDataBinding
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Attribute model;

  /**
   * The default value of the '{@link #getModelAccess() <em>Model Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelAccess()
   * @generated
   * @ordered
   */
  protected static final String MODEL_ACCESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelAccess() <em>Model Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelAccess()
   * @generated
   * @ordered
   */
  protected String modelAccess = MODEL_ACCESS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleDataBindingImpl()
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
    return AppBuilderDSLPackage.Literals.SIMPLE_DATA_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getModel()
  {
    if (model != null && model.eIsProxy())
    {
      InternalEObject oldModel = (InternalEObject)model;
      model = (Attribute)eResolveProxy(oldModel);
      if (model != oldModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL, oldModel, model));
      }
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(Attribute newModel)
  {
    Attribute oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelAccess()
  {
    return modelAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelAccess(String newModelAccess)
  {
    String oldModelAccess = modelAccess;
    modelAccess = newModelAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL_ACCESS, oldModelAccess, modelAccess));
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
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL:
        if (resolve) return getModel();
        return basicGetModel();
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL_ACCESS:
        return getModelAccess();
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
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL:
        setModel((Attribute)newValue);
        return;
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL_ACCESS:
        setModelAccess((String)newValue);
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
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL:
        setModel((Attribute)null);
        return;
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL_ACCESS:
        setModelAccess(MODEL_ACCESS_EDEFAULT);
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
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL:
        return model != null;
      case AppBuilderDSLPackage.SIMPLE_DATA_BINDING__MODEL_ACCESS:
        return MODEL_ACCESS_EDEFAULT == null ? modelAccess != null : !MODEL_ACCESS_EDEFAULT.equals(modelAccess);
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
    result.append(" (modelAccess: ");
    result.append(modelAccess);
    result.append(')');
    return result.toString();
  }

} //SimpleDataBindingImpl
