/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.CompositeConditionExpression#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getCompositeConditionExpression()
 * @model
 * @generated
 */
public interface CompositeConditionExpression extends ConditionExpression
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getCompositeConditionExpression_Conditions()
   * @model
   * @generated
   */
  EList<Condition> getConditions();

} // CompositeConditionExpression
