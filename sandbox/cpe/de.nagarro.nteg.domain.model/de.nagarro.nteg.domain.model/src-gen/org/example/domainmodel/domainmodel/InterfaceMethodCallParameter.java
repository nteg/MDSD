/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Method Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCallParameter()
 * @model
 * @generated
 */
public interface InterfaceMethodCallParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Name</em>' reference.
   * @see #setParameterName(MethodParameter)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCallParameter_ParameterName()
   * @model
   * @generated
   */
  MethodParameter getParameterName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterName <em>Parameter Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Name</em>' reference.
   * @see #getParameterName()
   * @generated
   */
  void setParameterName(MethodParameter value);

  /**
   * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Type</em>' attribute.
   * @see #setParameterType(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCallParameter_ParameterType()
   * @model
   * @generated
   */
  String getParameterType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter#getParameterType <em>Parameter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' attribute.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(String value);

} // InterfaceMethodCallParameter
