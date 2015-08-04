/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.Condition#getName <em>Name</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Condition#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
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
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getCondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Condition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Expression</em>' containment reference.
   * @see #setConditionExpression(ConditionExpression)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getCondition_ConditionExpression()
   * @model containment="true"
   * @generated
   */
  ConditionExpression getConditionExpression();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Condition#getConditionExpression <em>Condition Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Expression</em>' containment reference.
   * @see #getConditionExpression()
   * @generated
   */
  void setConditionExpression(ConditionExpression value);

} // Condition
