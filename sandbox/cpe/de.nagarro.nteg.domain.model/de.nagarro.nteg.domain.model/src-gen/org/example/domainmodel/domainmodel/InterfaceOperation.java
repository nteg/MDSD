/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceOperation#getRestOperation <em>Rest Operation</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceOperation#getMethodCall <em>Method Call</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceOperation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperation()
 * @model
 * @generated
 */
public interface InterfaceOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Rest Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest Operation</em>' attribute.
   * @see #setRestOperation(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperation_RestOperation()
   * @model
   * @generated
   */
  String getRestOperation();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceOperation#getRestOperation <em>Rest Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest Operation</em>' attribute.
   * @see #getRestOperation()
   * @generated
   */
  void setRestOperation(String value);

  /**
   * Returns the value of the '<em><b>Method Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Call</em>' containment reference.
   * @see #setMethodCall(MethodCall)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperation_MethodCall()
   * @model containment="true"
   * @generated
   */
  MethodCall getMethodCall();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceOperation#getMethodCall <em>Method Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Call</em>' containment reference.
   * @see #getMethodCall()
   * @generated
   */
  void setMethodCall(MethodCall value);

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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceOperation_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.InterfaceOperation#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // InterfaceOperation
