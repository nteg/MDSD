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

import org.example.domainmodel.domainmodel.AbstractNamespaceElement;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.NamespaceDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.NamespaceDeclarationImpl#getNamespaceElements <em>Namespace Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceDeclarationImpl extends AbstractElementImpl implements NamespaceDeclaration
{
  /**
   * The cached value of the '{@link #getNamespaceElements() <em>Namespace Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaceElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractNamespaceElement> namespaceElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceDeclarationImpl()
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
    return DomainmodelPackage.Literals.NAMESPACE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractNamespaceElement> getNamespaceElements()
  {
    if (namespaceElements == null)
    {
      namespaceElements = new EObjectContainmentEList<AbstractNamespaceElement>(AbstractNamespaceElement.class, this, DomainmodelPackage.NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS);
    }
    return namespaceElements;
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
      case DomainmodelPackage.NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS:
        return ((InternalEList<?>)getNamespaceElements()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS:
        return getNamespaceElements();
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
      case DomainmodelPackage.NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS:
        getNamespaceElements().clear();
        getNamespaceElements().addAll((Collection<? extends AbstractNamespaceElement>)newValue);
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
      case DomainmodelPackage.NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS:
        getNamespaceElements().clear();
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
      case DomainmodelPackage.NAMESPACE_DECLARATION__NAMESPACE_ELEMENTS:
        return namespaceElements != null && !namespaceElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NamespaceDeclarationImpl
