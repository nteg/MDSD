/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Feature#getMappingOption <em>Mapping Option</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Feature#getMapName <em>Map Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Feature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mapping Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Option</em>' attribute.
   * @see #setMappingOption(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getFeature_MappingOption()
   * @model
   * @generated
   */
  String getMappingOption();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Feature#getMappingOption <em>Mapping Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping Option</em>' attribute.
   * @see #getMappingOption()
   * @generated
   */
  void setMappingOption(String value);

  /**
   * Returns the value of the '<em><b>Map Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Name</em>' attribute.
   * @see #setMapName(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getFeature_MapName()
   * @model
   * @generated
   */
  String getMapName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Feature#getMapName <em>Map Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Name</em>' attribute.
   * @see #getMapName()
   * @generated
   */
  void setMapName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getFeature_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Feature#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Feature
