/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.Ui#getMain <em>Main</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Ui#getServices <em>Services</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Ui#getScreens <em>Screens</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUi()
 * @model
 * @generated
 */
public interface Ui extends EObject
{
  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Main)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUi_Main()
   * @model containment="true"
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Ui#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUi_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

  /**
   * Returns the value of the '<em><b>Screens</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Screen}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Screens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Screens</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUi_Screens()
   * @model containment="true"
   * @generated
   */
  EList<Screen> getScreens();

} // Ui
