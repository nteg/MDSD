/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.View#getLayouts <em>Layouts</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject
{
  /**
   * Returns the value of the '<em><b>Layouts</b></em>' containment reference list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Layout}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layouts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layouts</em>' containment reference list.
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getView_Layouts()
   * @model containment="true"
   * @generated
   */
  EList<Layout> getLayouts();

} // View
