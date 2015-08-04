/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigate To Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.NavigateToAction#getScreenElementId <em>Screen Element Id</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.NavigateToAction#getModelFeatures <em>Model Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNavigateToAction()
 * @model
 * @generated
 */
public interface NavigateToAction extends UIActionFeature
{
  /**
   * Returns the value of the '<em><b>Screen Element Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Screen Element Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Screen Element Id</em>' reference.
   * @see #setScreenElementId(ScreenFeature)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNavigateToAction_ScreenElementId()
   * @model
   * @generated
   */
  ScreenFeature getScreenElementId();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.NavigateToAction#getScreenElementId <em>Screen Element Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Screen Element Id</em>' reference.
   * @see #getScreenElementId()
   * @generated
   */
  void setScreenElementId(ScreenFeature value);

  /**
   * Returns the value of the '<em><b>Model Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Features</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Features</em>' containment reference.
   * @see #setModelFeatures(ScreenModelParameters)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNavigateToAction_ModelFeatures()
   * @model containment="true"
   * @generated
   */
  ScreenModelParameters getModelFeatures();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.NavigateToAction#getModelFeatures <em>Model Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Features</em>' containment reference.
   * @see #getModelFeatures()
   * @generated
   */
  void setModelFeatures(ScreenModelParameters value);

} // NavigateToAction
