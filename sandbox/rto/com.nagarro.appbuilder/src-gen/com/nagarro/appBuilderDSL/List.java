/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.List#getName <em>Name</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.List#getLabelprovider <em>Labelprovider</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.List#getCssStyle <em>Css Style</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.List#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getList()
 * @model
 * @generated
 */
public interface List extends Control
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
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getList_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.List#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Labelprovider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labelprovider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labelprovider</em>' containment reference.
   * @see #setLabelprovider(Value)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getList_Labelprovider()
   * @model containment="true"
   * @generated
   */
  Value getLabelprovider();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.List#getLabelprovider <em>Labelprovider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Labelprovider</em>' containment reference.
   * @see #getLabelprovider()
   * @generated
   */
  void setLabelprovider(Value value);

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
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getList_CssStyle()
   * @model containment="true"
   * @generated
   */
  Value getCssStyle();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.List#getCssStyle <em>Css Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Style</em>' containment reference.
   * @see #getCssStyle()
   * @generated
   */
  void setCssStyle(Value value);

  /**
   * Returns the value of the '<em><b>Tooltip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tooltip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tooltip</em>' containment reference.
   * @see #setTooltip(Value)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getList_Tooltip()
   * @model containment="true"
   * @generated
   */
  Value getTooltip();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.List#getTooltip <em>Tooltip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tooltip</em>' containment reference.
   * @see #getTooltip()
   * @generated
   */
  void setTooltip(Value value);

} // List
