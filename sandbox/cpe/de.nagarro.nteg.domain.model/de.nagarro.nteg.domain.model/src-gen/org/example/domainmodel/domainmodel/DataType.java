/**
 */
package org.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.DataType#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.DataType#getMappedType <em>Mapped Type</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.DataType#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Type, AbstractNamespaceElement
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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDataType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.DataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mapped Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Type</em>' attribute.
   * @see #setMappedType(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDataType_MappedType()
   * @model
   * @generated
   */
  String getMappedType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.DataType#getMappedType <em>Mapped Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped Type</em>' attribute.
   * @see #getMappedType()
   * @generated
   */
  void setMappedType(String value);

  /**
   * Returns the value of the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Value</em>' attribute.
   * @see #setInitValue(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getDataType_InitValue()
   * @model
   * @generated
   */
  String getInitValue();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.DataType#getInitValue <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Value</em>' attribute.
   * @see #getInitValue()
   * @generated
   */
  void setInitValue(String value);

} // DataType
