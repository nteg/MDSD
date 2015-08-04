/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.DomainRepository#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.DomainRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.DomainRepository#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDomainRepository()
 * @model
 * @generated
 */
public interface DomainRepository extends AbstractNamespaceElement, BusinessFeatureType
{
  /**
   * Returns the value of the '<em><b>Entity Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Type</em>' reference.
   * @see #setEntityType(DomainEntity)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDomainRepository_EntityType()
   * @model
   * @generated
   */
  DomainEntity getEntityType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.DomainRepository#getEntityType <em>Entity Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Type</em>' reference.
   * @see #getEntityType()
   * @generated
   */
  void setEntityType(DomainEntity value);

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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDomainRepository_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.DomainRepository#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference.
   * @see #setOperations(InterfaceOperationsUsageRule)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDomainRepository_Operations()
   * @model containment="true"
   * @generated
   */
  InterfaceOperationsUsageRule getOperations();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.DomainRepository#getOperations <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operations</em>' containment reference.
   * @see #getOperations()
   * @generated
   */
  void setOperations(InterfaceOperationsUsageRule value);

} // DomainRepository
