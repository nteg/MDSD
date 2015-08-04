/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.Text#getName <em>Name</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Text#getCssStyle <em>Css Style</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Text#getResourceKey <em>Resource Key</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Control
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getText_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Text#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Css Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Css Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Css Style</em>' containment reference.
   * @see #setCssStyle(Value)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getText_CssStyle()
   * @model containment="true"
   * @generated
   */
  Value getCssStyle();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Text#getCssStyle <em>Css Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Style</em>' containment reference.
   * @see #getCssStyle()
   * @generated
   */
  void setCssStyle(Value value);

  /**
   * Returns the value of the '<em><b>Resource Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Key</em>' containment reference.
   * @see #setResourceKey(Value)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getText_ResourceKey()
   * @model containment="true"
   * @generated
   */
  Value getResourceKey();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Text#getResourceKey <em>Resource Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Key</em>' containment reference.
   * @see #getResourceKey()
   * @generated
   */
  void setResourceKey(Value value);

} // Text
