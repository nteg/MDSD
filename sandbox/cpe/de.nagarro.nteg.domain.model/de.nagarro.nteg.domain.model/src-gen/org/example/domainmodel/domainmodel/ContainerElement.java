/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ContainerElement#getContainer <em>Container</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.ContainerElement#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getContainerElement()
 * @model
 * @generated
 */
public interface ContainerElement extends ViewElement
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' attribute.
   * The literals are from the enumeration {@link org.example.domainmodel.domainmodel.ContainerElementLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' attribute.
   * @see org.example.domainmodel.domainmodel.ContainerElementLiteral
   * @see #setContainer(ContainerElementLiteral)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getContainerElement_Container()
   * @model
   * @generated
   */
  ContainerElementLiteral getContainer();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ContainerElement#getContainer <em>Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' attribute.
   * @see org.example.domainmodel.domainmodel.ContainerElementLiteral
   * @see #getContainer()
   * @generated
   */
  void setContainer(ContainerElementLiteral value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.ViewElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getContainerElement_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ViewElement> getElements();

} // ContainerElement
