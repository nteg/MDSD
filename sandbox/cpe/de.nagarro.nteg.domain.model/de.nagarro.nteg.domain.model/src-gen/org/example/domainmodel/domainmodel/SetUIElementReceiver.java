/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set UI Element Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.SetUIElementReceiver#getWidgetName <em>Widget Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.SetUIElementReceiver#getUiKey <em>Ui Key</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetUIElementReceiver()
 * @model
 * @generated
 */
public interface SetUIElementReceiver extends SetActionReceiver
{
  /**
   * Returns the value of the '<em><b>Widget Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widget Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widget Name</em>' reference.
   * @see #setWidgetName(ViewElement)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetUIElementReceiver_WidgetName()
   * @model
   * @generated
   */
  ViewElement getWidgetName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.SetUIElementReceiver#getWidgetName <em>Widget Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Widget Name</em>' reference.
   * @see #getWidgetName()
   * @generated
   */
  void setWidgetName(ViewElement value);

  /**
   * Returns the value of the '<em><b>Ui Key</b></em>' attribute.
   * The literals are from the enumeration {@link org.example.domainmodel.domainmodel.UIElementReceiverKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Key</em>' attribute.
   * @see org.example.domainmodel.domainmodel.UIElementReceiverKey
   * @see #setUiKey(UIElementReceiverKey)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetUIElementReceiver_UiKey()
   * @model
   * @generated
   */
  UIElementReceiverKey getUiKey();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.SetUIElementReceiver#getUiKey <em>Ui Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui Key</em>' attribute.
   * @see org.example.domainmodel.domainmodel.UIElementReceiverKey
   * @see #getUiKey()
   * @generated
   */
  void setUiKey(UIElementReceiverKey value);

} // SetUIElementReceiver
