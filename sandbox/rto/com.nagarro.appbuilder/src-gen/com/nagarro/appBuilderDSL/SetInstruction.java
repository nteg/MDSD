/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.SetInstruction#getModel <em>Model</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.SetInstruction#getModelAccess <em>Model Access</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.SetInstruction#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSetInstruction()
 * @model
 * @generated
 */
public interface SetInstruction extends Instruction
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Attribute)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSetInstruction_Model()
   * @model
   * @generated
   */
  Attribute getModel();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.SetInstruction#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Attribute value);

  /**
   * Returns the value of the '<em><b>Model Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Access</em>' attribute.
   * @see #setModelAccess(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSetInstruction_ModelAccess()
   * @model
   * @generated
   */
  String getModelAccess();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.SetInstruction#getModelAccess <em>Model Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Access</em>' attribute.
   * @see #getModelAccess()
   * @generated
   */
  void setModelAccess(String value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(SetInstructionAssignment)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSetInstruction_Assignment()
   * @model containment="true"
   * @generated
   */
  SetInstructionAssignment getAssignment();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.SetInstruction#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(SetInstructionAssignment value);

} // SetInstruction
