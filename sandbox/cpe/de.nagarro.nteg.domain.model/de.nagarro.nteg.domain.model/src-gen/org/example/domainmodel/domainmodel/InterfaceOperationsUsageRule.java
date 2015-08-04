/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Operations Usage Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule#getUsageOperations <em>Usage Operations</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperationsUsageRule()
 * @model
 * @generated
 */
public interface InterfaceOperationsUsageRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Usage Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usage Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage Operations</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperationsUsageRule_UsageOperations()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceOperationUsageRule> getUsageOperations();

} // InterfaceOperationsUsageRule
