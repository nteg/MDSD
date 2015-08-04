/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ScreenFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.ScreenFeature#getScreenModules <em>Screen Modules</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getScreenFeature()
 * @model
 * @generated
 */
public interface ScreenFeature extends UIFeature
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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getScreenFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ScreenFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Screen Modules</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.ScreenModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Screen Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Screen Modules</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getScreenFeature_ScreenModules()
   * @model containment="true"
   * @generated
   */
  EList<ScreenModule> getScreenModules();

} // ScreenFeature
