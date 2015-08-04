/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.ContentElement#getContentElement <em>Content Element</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getContentElement()
 * @model
 * @generated
 */
public interface ContentElement extends ViewElement
{
  /**
   * Returns the value of the '<em><b>Content Element</b></em>' attribute.
   * The literals are from the enumeration {@link org.example.domainmodel.domainmodel.ContentElementLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content Element</em>' attribute.
   * @see org.example.domainmodel.domainmodel.ContentElementLiteral
   * @see #setContentElement(ContentElementLiteral)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getContentElement_ContentElement()
   * @model
   * @generated
   */
  ContentElementLiteral getContentElement();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.ContentElement#getContentElement <em>Content Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content Element</em>' attribute.
   * @see org.example.domainmodel.domainmodel.ContentElementLiteral
   * @see #getContentElement()
   * @generated
   */
  void setContentElement(ContentElementLiteral value);

} // ContentElement
