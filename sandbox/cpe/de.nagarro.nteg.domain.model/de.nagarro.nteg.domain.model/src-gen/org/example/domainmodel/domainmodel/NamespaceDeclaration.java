/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.NamespaceDeclaration#getNamespaceElements <em>Namespace Elements</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNamespaceDeclaration()
 * @model
 * @generated
 */
public interface NamespaceDeclaration extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Namespace Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.AbstractNamespaceElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace Elements</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNamespaceDeclaration_NamespaceElements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractNamespaceElement> getNamespaceElements();

} // NamespaceDeclaration
