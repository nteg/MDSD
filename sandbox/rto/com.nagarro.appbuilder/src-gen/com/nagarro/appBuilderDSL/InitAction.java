/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.InitAction#getDatabindings <em>Databindings</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.InitAction#getUiListenerBindingss <em>Ui Listener Bindingss</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.InitAction#getValidationBindings <em>Validation Bindings</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.InitAction#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getInitAction()
 * @model
 * @generated
 */
public interface InitAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Databindings</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.DataBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Databindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Databindings</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getInitAction_Databindings()
   * @model containment="true"
   * @generated
   */
  EList<DataBinding> getDatabindings();

  /**
   * Returns the value of the '<em><b>Ui Listener Bindingss</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.UiListenerBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Listener Bindingss</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Listener Bindingss</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getInitAction_UiListenerBindingss()
   * @model containment="true"
   * @generated
   */
  EList<UiListenerBinding> getUiListenerBindingss();

  /**
   * Returns the value of the '<em><b>Validation Bindings</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.ValidationBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validation Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation Bindings</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getInitAction_ValidationBindings()
   * @model containment="true"
   * @generated
   */
  EList<ValidationBinding> getValidationBindings();

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getInitAction_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // InitAction
