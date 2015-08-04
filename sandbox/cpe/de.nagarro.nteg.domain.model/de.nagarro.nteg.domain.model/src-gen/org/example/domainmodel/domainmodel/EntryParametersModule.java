/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Parameters Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.EntryParametersModule#getEntryFeatures <em>Entry Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getEntryParametersModule()
 * @model
 * @generated
 */
public interface EntryParametersModule extends ScreenModule
{
  /**
   * Returns the value of the '<em><b>Entry Features</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.ModelFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Features</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getEntryParametersModule_EntryFeatures()
   * @model containment="true"
   * @generated
   */
  EList<ModelFeature> getEntryFeatures();

} // EntryParametersModule
