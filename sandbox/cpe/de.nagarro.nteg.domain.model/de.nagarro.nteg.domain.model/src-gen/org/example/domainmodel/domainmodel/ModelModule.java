/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ModelModule#getModelFeatures <em>Model Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getModelModule()
 * @model
 * @generated
 */
public interface ModelModule extends ScreenModule
{
  /**
   * Returns the value of the '<em><b>Model Features</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.ModelFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Features</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getModelModule_ModelFeatures()
   * @model containment="true"
   * @generated
   */
  EList<ModelFeature> getModelFeatures();

} // ModelModule
