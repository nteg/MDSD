/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ExecuteAction#getUiActionName <em>Ui Action Name</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getExecuteAction()
 * @model
 * @generated
 */
public interface ExecuteAction extends UIActionFeature
{
  /**
   * Returns the value of the '<em><b>Ui Action Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Action Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Action Name</em>' reference.
   * @see #setUiActionName(UIActionModule)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getExecuteAction_UiActionName()
   * @model
   * @generated
   */
  UIActionModule getUiActionName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ExecuteAction#getUiActionName <em>Ui Action Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Action Name</em>' reference.
   * @see #getUiActionName()
   * @generated
   */
  void setUiActionName(UIActionModule value);

} // ExecuteAction
