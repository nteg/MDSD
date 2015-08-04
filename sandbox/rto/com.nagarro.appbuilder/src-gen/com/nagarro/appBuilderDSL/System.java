/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.System#getBusiness <em>Business</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.System#getUi <em>Ui</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Business</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business</em>' containment reference.
   * @see #setBusiness(Business)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSystem_Business()
   * @model containment="true"
   * @generated
   */
  Business getBusiness();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.System#getBusiness <em>Business</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Business</em>' containment reference.
   * @see #getBusiness()
   * @generated
   */
  void setBusiness(Business value);

  /**
   * Returns the value of the '<em><b>Ui</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui</em>' containment reference.
   * @see #setUi(Ui)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSystem_Ui()
   * @model containment="true"
   * @generated
   */
  Ui getUi();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.System#getUi <em>Ui</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ui</em>' containment reference.
   * @see #getUi()
   * @generated
   */
  void setUi(Ui value);

} // System
