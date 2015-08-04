/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Listener Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.UiListenerBinding#getAction <em>Action</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.UiListenerBinding#getControl <em>Control</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.UiListenerBinding#getControlAccess <em>Control Access</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUiListenerBinding()
 * @model
 * @generated
 */
public interface UiListenerBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUiListenerBinding_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.UiListenerBinding#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

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
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUiListenerBinding_Control()
   * @model
   * @generated
   */
  Control getControl();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.UiListenerBinding#getControl <em>Control</em>}' reference.
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
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getUiListenerBinding_ControlAccess()
   * @model
   * @generated
   */
  String getControlAccess();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.UiListenerBinding#getControlAccess <em>Control Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Access</em>' attribute.
   * @see #getControlAccess()
   * @generated
   */
  void setControlAccess(String value);

} // UiListenerBinding
