/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Data Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.EnumDataBinding#getEnumClassName <em>Enum Class Name</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getEnumDataBinding()
 * @model
 * @generated
 */
public interface EnumDataBinding extends DataBinding
{
  /**
   * Returns the value of the '<em><b>Enum Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Class Name</em>' attribute.
   * @see #setEnumClassName(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getEnumDataBinding_EnumClassName()
   * @model
   * @generated
   */
  String getEnumClassName();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.EnumDataBinding#getEnumClassName <em>Enum Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Class Name</em>' attribute.
   * @see #getEnumClassName()
   * @generated
   */
  void setEnumClassName(String value);

} // EnumDataBinding
