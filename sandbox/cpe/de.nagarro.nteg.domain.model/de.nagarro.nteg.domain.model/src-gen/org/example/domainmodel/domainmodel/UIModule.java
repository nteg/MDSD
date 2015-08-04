/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.UIModule#getUiFeatures <em>Ui Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getUIModule()
 * @model
 * @generated
 */
public interface UIModule extends SystemModule
{
  /**
   * Returns the value of the '<em><b>Ui Features</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.UIFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ui Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ui Features</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getUIModule_UiFeatures()
   * @model containment="true"
   * @generated
   */
  EList<UIFeature> getUiFeatures();

} // UIModule
