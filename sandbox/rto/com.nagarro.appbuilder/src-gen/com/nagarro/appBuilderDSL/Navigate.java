/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.Navigate#getScreen <em>Screen</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Navigate#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getNavigate()
 * @model
 * @generated
 */
public interface Navigate extends Instruction
{
  /**
   * Returns the value of the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Screen</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Screen</em>' reference.
   * @see #setScreen(Screen)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getNavigate_Screen()
   * @model
   * @generated
   */
  Screen getScreen();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Navigate#getScreen <em>Screen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Screen</em>' reference.
   * @see #getScreen()
   * @generated
   */
  void setScreen(Screen value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getNavigate_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // Navigate
