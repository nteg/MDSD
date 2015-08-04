/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidatorRules#getValidatorRules <em>Validator Rules</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorRules()
 * @model
 * @generated
 */
public interface ValidatorRules extends EObject
{
  /**
   * Returns the value of the '<em><b>Validator Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.ValidatorRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validator Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validator Rules</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorRules_ValidatorRules()
   * @model containment="true"
   * @generated
   */
  EList<ValidatorRule> getValidatorRules();

} // ValidatorRules
