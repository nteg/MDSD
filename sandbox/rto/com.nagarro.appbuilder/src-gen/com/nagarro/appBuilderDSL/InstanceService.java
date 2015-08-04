/**
 */
package com.nagarro.appBuilderDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.InstanceService#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getInstanceService()
 * @model
 * @generated
 */
public interface InstanceService extends Service
{
  /**
   * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Name</em>' attribute.
   * @see #setInstanceName(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getInstanceService_InstanceName()
   * @model
   * @generated
   */
  String getInstanceName();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.InstanceService#getInstanceName <em>Instance Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Name</em>' attribute.
   * @see #getInstanceName()
   * @generated
   */
  void setInstanceName(String value);

} // InstanceService
