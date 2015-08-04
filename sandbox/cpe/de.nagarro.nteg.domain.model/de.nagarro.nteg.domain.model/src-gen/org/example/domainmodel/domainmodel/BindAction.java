/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.BindAction#getBindSource <em>Bind Source</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.BindAction#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.BindAction#getUiReceiver <em>Ui Receiver</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBindAction()
 * @model
 * @generated
 */
public interface BindAction extends InitActionFeature
{
  /**
   * Returns the value of the '<em><b>Bind Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind Source</em>' containment reference.
   * @see #setBindSource(BindSource)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBindAction_BindSource()
   * @model containment="true"
   * @generated
   */
  BindSource getBindSource();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BindAction#getBindSource <em>Bind Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind Source</em>' containment reference.
   * @see #getBindSource()
   * @generated
   */
  void setBindSource(BindSource value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBindAction_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BindAction#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBindAction_UiReceiver()
   * @model containment="true"
   * @generated
   */
  SetUIElementReceiver getUiReceiver();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BindAction#getUiReceiver <em>Ui Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Receiver</em>' containment reference.
   * @see #getUiReceiver()
   * @generated
   */
  void setUiReceiver(SetUIElementReceiver value);

} // BindAction
