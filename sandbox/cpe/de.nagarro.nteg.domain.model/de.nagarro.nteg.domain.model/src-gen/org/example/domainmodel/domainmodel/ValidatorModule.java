/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ValidatorModule#getValidatorFeatures <em>Validator Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorModule()
 * @model
 * @generated
 */
public interface ValidatorModule extends ControllerElement
{
  /**
   * Returns the value of the '<em><b>Validator Features</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.ValidatorFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validator Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validator Features</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getValidatorModule_ValidatorFeatures()
   * @model containment="true"
   * @generated
   */
  EList<ValidatorFeature> getValidatorFeatures();

} // ValidatorModule
