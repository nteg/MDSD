/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getInterfaceInstanceName <em>Interface Instance Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCall()
 * @model
 * @generated
 */
public interface InterfaceMethodCall extends UIActionFeature
{
  /**
   * Returns the value of the '<em><b>Interface Instance Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Instance Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Instance Name</em>' reference.
   * @see #setInterfaceInstanceName(BusinessFeature)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCall_InterfaceInstanceName()
   * @model
   * @generated
   */
  BusinessFeature getInterfaceInstanceName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getInterfaceInstanceName <em>Interface Instance Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Instance Name</em>' reference.
   * @see #getInterfaceInstanceName()
   * @generated
   */
  void setInterfaceInstanceName(BusinessFeature value);

  /**
   * Returns the value of the '<em><b>Method Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' reference.
   * @see #setMethodName(MethodCall)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCall_MethodName()
   * @model
   * @generated
   */
  MethodCall getMethodName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceMethodCall#getMethodName <em>Method Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' reference.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(MethodCall value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameters}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCall_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceMethodCallParameters> getParameters();

} // InterfaceMethodCall
