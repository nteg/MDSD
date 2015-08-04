/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.SetAction#getModelFeatureName <em>Model Feature Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.SetAction#getSetActionReceiver <em>Set Action Receiver</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetAction()
 * @model
 * @generated
 */
public interface SetAction extends InitActionFeature, UIActionFeature
{
  /**
   * Returns the value of the '<em><b>Model Feature Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Feature Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Feature Name</em>' reference.
   * @see #setModelFeatureName(ModelFeature)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetAction_ModelFeatureName()
   * @model
   * @generated
   */
  ModelFeature getModelFeatureName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.SetAction#getModelFeatureName <em>Model Feature Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Feature Name</em>' reference.
   * @see #getModelFeatureName()
   * @generated
   */
  void setModelFeatureName(ModelFeature value);

  /**
   * Returns the value of the '<em><b>Set Action Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Action Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Action Receiver</em>' containment reference.
   * @see #setSetActionReceiver(SetActionReceiver)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetAction_SetActionReceiver()
   * @model containment="true"
   * @generated
   */
  SetActionReceiver getSetActionReceiver();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.SetAction#getSetActionReceiver <em>Set Action Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Action Receiver</em>' containment reference.
   * @see #getSetActionReceiver()
   * @generated
   */
  void setSetActionReceiver(SetActionReceiver value);

} // SetAction
