/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidateAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidateAction#getUiReceiver <em>Ui Receiver</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidateAction()
 * @model
 * @generated
 */
public interface ValidateAction extends InitActionFeature
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
   * @see #setCondition(ValidatorFeature)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidateAction_Condition()
   * @model
   * @generated
   */
  ValidatorFeature getCondition();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ValidateAction#getCondition <em>Condition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ValidatorFeature value);

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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidateAction_UiReceiver()
   * @model containment="true"
   * @generated
   */
  SetUIElementReceiver getUiReceiver();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ValidateAction#getUiReceiver <em>Ui Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Receiver</em>' containment reference.
   * @see #getUiReceiver()
   * @generated
   */
  void setUiReceiver(SetUIElementReceiver value);

} // ValidateAction
