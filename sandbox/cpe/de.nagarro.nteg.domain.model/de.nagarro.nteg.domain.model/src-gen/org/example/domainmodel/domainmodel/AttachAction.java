/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.AttachAction#getUiAction <em>Ui Action</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.AttachAction#getUiReceiver <em>Ui Receiver</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getAttachAction()
 * @model
 * @generated
 */
public interface AttachAction extends InitActionFeature
{
  /**
   * Returns the value of the '<em><b>Ui Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Action</em>' reference.
   * @see #setUiAction(UIActionModule)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getAttachAction_UiAction()
   * @model
   * @generated
   */
  UIActionModule getUiAction();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.AttachAction#getUiAction <em>Ui Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Action</em>' reference.
   * @see #getUiAction()
   * @generated
   */
  void setUiAction(UIActionModule value);

  /**
   * Returns the value of the '<em><b>Ui Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Receiver</em>' containment reference.
   * @see #setUiReceiver(SetUIElementReceiver)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getAttachAction_UiReceiver()
   * @model containment="true"
   * @generated
   */
  SetUIElementReceiver getUiReceiver();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.AttachAction#getUiReceiver <em>Ui Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Receiver</em>' containment reference.
   * @see #getUiReceiver()
   * @generated
   */
  void setUiReceiver(SetUIElementReceiver value);

} // AttachAction
