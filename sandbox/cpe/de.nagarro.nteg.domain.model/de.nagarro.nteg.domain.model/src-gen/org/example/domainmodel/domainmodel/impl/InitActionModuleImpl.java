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
import org.example.domainmodel.domainmodel.InitActionFeature;
import org.example.domainmodel.domainmodel.InitActionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Action Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.InitActionModuleImpl#getInitActionFeatures <em>Init Action Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitActionModuleImpl extends ControllerElementImpl implements InitActionModule
{
  /**
   * The cached value of the '{@link #getInitActionFeatures() <em>Init Action Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitActionFeatures()
   * @generated
   * @ordered
   */
  protected EList<InitActionFeature> initActionFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitActionModuleImpl()
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
    return DomainmodelPackage.Literals.INIT_ACTION_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InitActionFeature> getInitActionFeatures()
  {
    if (initActionFeatures == null)
    {
      initActionFeatures = new EObjectContainmentEList<InitActionFeature>(InitActionFeature.class, this, DomainmodelPackage.INIT_ACTION_MODULE__INIT_ACTION_FEATURES);
    }
    return initActionFeatures;
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
      case DomainmodelPackage.INIT_ACTION_MODULE__INIT_ACTION_FEATURES:
        return ((InternalEList<?>)getInitActionFeatures()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.INIT_ACTION_MODULE__INIT_ACTION_FEATURES:
        return getInitActionFeatures();
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
      case DomainmodelPackage.INIT_ACTION_MODULE__INIT_ACTION_FEATURES:
        getInitActionFeatures().clear();
        getInitActionFeatures().addAll((Collection<? extends InitActionFeature>)newValue);
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
      case DomainmodelPackage.INIT_ACTION_MODULE__INIT_ACTION_FEATURES:
        getInitActionFeatures().clear();
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
      case DomainmodelPackage.INIT_ACTION_MODULE__INIT_ACTION_FEATURES:
        return initActionFeatures != null && !initActionFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InitActionModuleImpl
