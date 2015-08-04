/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.Layout#getControls <em>Controls</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Layout#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends Control
{
  /**
   * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Control}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controls</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getLayout_Controls()
   * @model containment="true"
   * @generated
   */
  EList<Control> getControls();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getLayout_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Layout#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Layout
