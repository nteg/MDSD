/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.Controller#getInitAction <em>Init Action</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Controller#getValidator <em>Validator</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Controller#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject
{
  /**
   * Returns the value of the '<em><b>Init Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Action</em>' containment reference.
   * @see #setInitAction(InitAction)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getController_InitAction()
   * @model containment="true"
   * @generated
   */
  InitAction getInitAction();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Controller#getInitAction <em>Init Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Action</em>' containment reference.
   * @see #getInitAction()
   * @generated
   */
  void setInitAction(InitAction value);

  /**
   * Returns the value of the '<em><b>Validator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validator</em>' containment reference.
   * @see #setValidator(Validator)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getController_Validator()
   * @model containment="true"
   * @generated
   */
  Validator getValidator();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Controller#getValidator <em>Validator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validator</em>' containment reference.
   * @see #getValidator()
   * @generated
   */
  void setValidator(Validator value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getController_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Controller
