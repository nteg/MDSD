/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.MainFeature#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMainFeature()
 * @model
 * @generated
 */
public interface MainFeature extends UIFeature
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.MainFeatureOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getMainFeature_Features()
   * @model containment="true"
   * @generated
   */
  EList<MainFeatureOption> getFeatures();

} // MainFeature
