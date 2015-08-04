/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Data Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.SimpleDataBinding#getModel <em>Model</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.SimpleDataBinding#getModelAccess <em>Model Access</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSimpleDataBinding()
 * @model
 * @generated
 */
public interface SimpleDataBinding extends DataBinding
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Attribute)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSimpleDataBinding_Model()
   * @model
   * @generated
   */
  Attribute getModel();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.SimpleDataBinding#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Attribute value);

  /**
   * Returns the value of the '<em><b>Model Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Access</em>' attribute.
   * @see #setModelAccess(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getSimpleDataBinding_ModelAccess()
   * @model
   * @generated
   */
  String getModelAccess();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.SimpleDataBinding#getModelAccess <em>Model Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Access</em>' attribute.
   * @see #getModelAccess()
   * @generated
   */
  void setModelAccess(String value);

} // SimpleDataBinding
