/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.BindSource#getModelFeatureName <em>Model Feature Name</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBindSource()
 * @model
 * @generated
 */
public interface BindSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Feature Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Feature Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Feature Name</em>' reference.
   * @see #setModelFeatureName(ModelFeature)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBindSource_ModelFeatureName()
   * @model
   * @generated
   */
  ModelFeature getModelFeatureName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BindSource#getModelFeatureName <em>Model Feature Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Feature Name</em>' reference.
   * @see #getModelFeatureName()
   * @generated
   */
  void setModelFeatureName(ModelFeature value);

} // BindSource
