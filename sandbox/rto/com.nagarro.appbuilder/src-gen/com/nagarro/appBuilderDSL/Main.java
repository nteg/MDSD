/**
 */
package com.nagarro.appBuilderDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.Main#getAppName <em>App Name</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Main#getAppVersion <em>App Version</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Main#getDevices <em>Devices</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Main#getScreen <em>Screen</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.Main#getGeneralStyle <em>General Style</em>}</li>
 * </ul>
 *
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * Returns the value of the '<em><b>App Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>App Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>App Name</em>' attribute.
   * @see #setAppName(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getMain_AppName()
   * @model
   * @generated
   */
  String getAppName();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Main#getAppName <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App Name</em>' attribute.
   * @see #getAppName()
   * @generated
   */
  void setAppName(String value);

  /**
   * Returns the value of the '<em><b>App Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>App Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>App Version</em>' attribute.
   * @see #setAppVersion(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getMain_AppVersion()
   * @model
   * @generated
   */
  String getAppVersion();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Main#getAppVersion <em>App Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App Version</em>' attribute.
   * @see #getAppVersion()
   * @generated
   */
  void setAppVersion(String value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' attribute list.
   * The list contents are of type {@link com.nagarro.appBuilderDSL.Device}.
   * The literals are from the enumeration {@link com.nagarro.appBuilderDSL.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Devices</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' attribute list.
   * @see com.nagarro.appBuilderDSL.Device
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getMain_Devices()
   * @model unique="false"
   * @generated
   */
  EList<Device> getDevices();

  /**
   * Returns the value of the '<em><b>Screen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Screen</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Screen</em>' reference.
   * @see #setScreen(Screen)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getMain_Screen()
   * @model
   * @generated
   */
  Screen getScreen();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Main#getScreen <em>Screen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Screen</em>' reference.
   * @see #getScreen()
   * @generated
   */
  void setScreen(Screen value);

  /**
   * Returns the value of the '<em><b>General Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>General Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>General Style</em>' attribute.
   * @see #setGeneralStyle(String)
   * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getMain_GeneralStyle()
   * @model
   * @generated
   */
  String getGeneralStyle();

  /**
   * Sets the value of the '{@link com.nagarro.appBuilderDSL.Main#getGeneralStyle <em>General Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>General Style</em>' attribute.
   * @see #getGeneralStyle()
   * @generated
   */
  void setGeneralStyle(String value);

} // Main
