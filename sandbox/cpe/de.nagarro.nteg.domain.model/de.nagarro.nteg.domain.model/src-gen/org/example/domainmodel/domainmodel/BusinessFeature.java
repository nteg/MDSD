/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.BusinessFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.BusinessFeature#getType <em>Type</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint1 <em>Connect Point1</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint2 <em>Connect Point2</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectEnd <em>Connect End</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBusinessFeature()
 * @model
 * @generated
 */
public interface BusinessFeature extends EObject
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
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBusinessFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BusinessFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(BusinessFeatureType)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBusinessFeature_Type()
   * @model
   * @generated
   */
  BusinessFeatureType getType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BusinessFeature#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(BusinessFeatureType value);

  /**
   * Returns the value of the '<em><b>Connect Point1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connect Point1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connect Point1</em>' attribute.
   * @see #setConnectPoint1(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBusinessFeature_ConnectPoint1()
   * @model
   * @generated
   */
  String getConnectPoint1();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint1 <em>Connect Point1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connect Point1</em>' attribute.
   * @see #getConnectPoint1()
   * @generated
   */
  void setConnectPoint1(String value);

  /**
   * Returns the value of the '<em><b>Connect Point2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connect Point2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connect Point2</em>' reference.
   * @see #setConnectPoint2(BusinessFeature)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBusinessFeature_ConnectPoint2()
   * @model
   * @generated
   */
  BusinessFeature getConnectPoint2();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectPoint2 <em>Connect Point2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connect Point2</em>' reference.
   * @see #getConnectPoint2()
   * @generated
   */
  void setConnectPoint2(BusinessFeature value);

  /**
   * Returns the value of the '<em><b>Connect End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connect End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connect End</em>' attribute.
   * @see #setConnectEnd(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getBusinessFeature_ConnectEnd()
   * @model
   * @generated
   */
  String getConnectEnd();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.BusinessFeature#getConnectEnd <em>Connect End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connect End</em>' attribute.
   * @see #getConnectEnd()
   * @generated
   */
  void setConnectEnd(String value);

} // BusinessFeature
