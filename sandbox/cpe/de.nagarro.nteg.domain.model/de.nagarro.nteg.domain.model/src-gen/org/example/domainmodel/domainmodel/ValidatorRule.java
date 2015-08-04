/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidatorRule#getStringRule <em>String Rule</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidatorRule#getConditionName <em>Condition Name</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorRule()
 * @model
 * @generated
 */
public interface ValidatorRule extends EObject
{
  /**
   * Returns the value of the '<em><b>String Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Rule</em>' attribute.
   * @see #setStringRule(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorRule_StringRule()
   * @model
   * @generated
   */
  String getStringRule();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ValidatorRule#getStringRule <em>String Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Rule</em>' attribute.
   * @see #getStringRule()
   * @generated
   */
  void setStringRule(String value);

  /**
   * Returns the value of the '<em><b>Condition Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Name</em>' reference.
   * @see #setConditionName(ValidatorFeature)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorRule_ConditionName()
   * @model
   * @generated
   */
  ValidatorFeature getConditionName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ValidatorRule#getConditionName <em>Condition Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Name</em>' reference.
   * @see #getConditionName()
   * @generated
   */
  void setConditionName(ValidatorFeature value);

} // ValidatorRule
