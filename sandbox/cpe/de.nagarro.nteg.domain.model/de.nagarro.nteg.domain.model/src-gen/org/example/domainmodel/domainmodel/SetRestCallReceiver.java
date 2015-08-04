/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Rest Call Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.SetRestCallReceiver#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetRestCallReceiver()
 * @model
 * @generated
 */
public interface SetRestCallReceiver extends SetActionReceiver
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.SetRestCallReceiverParameters}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getSetRestCallReceiver_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<SetRestCallReceiverParameters> getParameters();

} // SetRestCallReceiver
