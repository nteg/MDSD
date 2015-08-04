/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Action Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.InitActionModule#getInitActionFeatures <em>Init Action Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInitActionModule()
 * @model
 * @generated
 */
public interface InitActionModule extends ControllerElement
{
  /**
   * Returns the value of the '<em><b>Init Action Features</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.InitActionFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Action Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Action Features</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInitActionModule_InitActionFeatures()
   * @model containment="true"
   * @generated
   */
  EList<InitActionFeature> getInitActionFeatures();

} // InitActionModule
