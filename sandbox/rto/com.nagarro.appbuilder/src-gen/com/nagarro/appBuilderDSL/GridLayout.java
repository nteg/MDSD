/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.GridLayout#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getGridLayout()
 * @model
 * @generated
 */
public interface GridLayout extends Layout
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(int)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getGridLayout_Columns()
   * @model
   * @generated
   */
  int getColumns();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.GridLayout#getColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #getColumns()
   * @generated
   */
  void setColumns(int value);

} // GridLayout
