/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ElementFeature#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.ElementFeature#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getElementFeature()
 * @model
 * @generated
 */
public interface ElementFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.example.domainmodel.domainmodel.PropertyNameLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' attribute.
   * @see org.example.domainmodel.domainmodel.PropertyNameLiteral
   * @see #setPropertyName(PropertyNameLiteral)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getElementFeature_PropertyName()
   * @model
   * @generated
   */
  PropertyNameLiteral getPropertyName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ElementFeature#getPropertyName <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' attribute.
   * @see org.example.domainmodel.domainmodel.PropertyNameLiteral
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(PropertyNameLiteral value);

  /**
   * Returns the value of the '<em><b>Property Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Value</em>' attribute.
   * @see #setPropertyValue(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getElementFeature_PropertyValue()
   * @model
   * @generated
   */
  String getPropertyValue();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ElementFeature#getPropertyValue <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Value</em>' attribute.
   * @see #getPropertyValue()
   * @generated
   */
  void setPropertyValue(String value);

} // ElementFeature
