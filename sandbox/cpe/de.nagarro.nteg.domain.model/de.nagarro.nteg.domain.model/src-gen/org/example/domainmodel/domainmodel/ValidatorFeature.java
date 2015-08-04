/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidatorFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidatorFeature#getValidatorRules <em>Validator Rules</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorFeature()
 * @model
 * @generated
 */
public interface ValidatorFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ValidatorFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Validator Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validator Rules</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validator Rules</em>' containment reference.
   * @see #setValidatorRules(ValidatorRules)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorFeature_ValidatorRules()
   * @model containment="true"
   * @generated
   */
  ValidatorRules getValidatorRules();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ValidatorFeature#getValidatorRules <em>Validator Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validator Rules</em>' containment reference.
   * @see #getValidatorRules()
   * @generated
   */
  void setValidatorRules(ValidatorRules value);

} // ValidatorFeature
