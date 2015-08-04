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
import org.example.domainmodel.domainmodel.EntryParametersModule;
import org.example.domainmodel.domainmodel.ModelFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Parameters Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.EntryParametersModuleImpl#getEntryFeatures <em>Entry Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryParametersModuleImpl extends ScreenModuleImpl implements EntryParametersModule
{
  /**
   * The cached value of the '{@link #getEntryFeatures() <em>Entry Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryFeatures()
   * @generated
   * @ordered
   */
  protected EList<ModelFeature> entryFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntryParametersModuleImpl()
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
    return DomainmodelPackage.Literals.ENTRY_PARAMETERS_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelFeature> getEntryFeatures()
  {
    if (entryFeatures == null)
    {
      entryFeatures = new EObjectContainmentEList<ModelFeature>(ModelFeature.class, this, DomainmodelPackage.ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES);
    }
    return entryFeatures;
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
      case DomainmodelPackage.ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES:
        return ((InternalEList<?>)getEntryFeatures()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES:
        return getEntryFeatures();
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
      case DomainmodelPackage.ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES:
        getEntryFeatures().clear();
        getEntryFeatures().addAll((Collection<? extends ModelFeature>)newValue);
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
      case DomainmodelPackage.ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES:
        getEntryFeatures().clear();
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
      case DomainmodelPackage.ENTRY_PARAMETERS_MODULE__ENTRY_FEATURES:
        return entryFeatures != null && !entryFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntryParametersModuleImpl
