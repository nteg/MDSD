/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.ValidationBinding#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.ValidationBinding#getControl <em>Control</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.ValidationBinding#getControlAccess <em>Control Access</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getValidationBinding()
 * @model
 * @generated
 */
public interface ValidationBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' reference.
   * @see #setCondition(Condition)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getValidationBinding_Condition()
   * @model
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.ValidationBinding#getCondition <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Control</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control</em>' reference.
   * @see #setControl(Control)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getValidationBinding_Control()
   * @model
   * @generated
   */
  Control getControl();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.ValidationBinding#getControl <em>Control</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control</em>' reference.
   * @see #getControl()
   * @generated
   */
  void setControl(Control value);

  /**
   * Returns the value of the '<em><b>Control Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Access</em>' attribute.
   * @see #setControlAccess(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getValidationBinding_ControlAccess()
   * @model
   * @generated
   */
  String getControlAccess();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.ValidationBinding#getControlAccess <em>Control Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Access</em>' attribute.
   * @see #getControlAccess()
   * @generated
   */
  void setControlAccess(String value);

} // ValidationBinding
