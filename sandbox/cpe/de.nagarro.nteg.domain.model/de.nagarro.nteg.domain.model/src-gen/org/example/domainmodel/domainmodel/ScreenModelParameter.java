/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Model Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureName <em>Model Feature Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureValue <em>Model Feature Value</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getScreenModelParameter()
 * @model
 * @generated
 */
public interface ScreenModelParameter extends EObject
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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getScreenModelParameter_ModelFeatureName()
   * @model
   * @generated
   */
  ModelFeature getModelFeatureName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureName <em>Model Feature Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Feature Name</em>' reference.
   * @see #getModelFeatureName()
   * @generated
   */
  void setModelFeatureName(ModelFeature value);

  /**
   * Returns the value of the '<em><b>Model Feature Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Feature Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Feature Value</em>' attribute.
   * @see #setModelFeatureValue(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getScreenModelParameter_ModelFeatureValue()
   * @model
   * @generated
   */
  String getModelFeatureValue();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ScreenModelParameter#getModelFeatureValue <em>Model Feature Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Feature Value</em>' attribute.
   * @see #getModelFeatureValue()
   * @generated
   */
  void setModelFeatureValue(String value);

} // ScreenModelParameter
