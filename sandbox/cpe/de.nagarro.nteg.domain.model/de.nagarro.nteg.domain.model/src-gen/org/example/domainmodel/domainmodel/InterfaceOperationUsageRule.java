/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Operation Usage Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperationUsageRule()
 * @model
 * @generated
 */
public interface InterfaceOperationUsageRule extends EObject
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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperationUsageRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Interface Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Name</em>' reference.
   * @see #setInterfaceName(InterfaceDeclaration)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperationUsageRule_InterfaceName()
   * @model
   * @generated
   */
  InterfaceDeclaration getInterfaceName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceOperationUsageRule#getInterfaceName <em>Interface Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Name</em>' reference.
   * @see #getInterfaceName()
   * @generated
   */
  void setInterfaceName(InterfaceDeclaration value);

} // InterfaceOperationUsageRule
