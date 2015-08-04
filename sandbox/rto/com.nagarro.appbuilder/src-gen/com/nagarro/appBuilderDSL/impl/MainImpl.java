/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Device;
import com.nagarro.appBuilderDSL.Main;
import com.nagarro.appBuilderDSL.Screen;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.MainImpl#getAppName <em>App Name</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.MainImpl#getAppVersion <em>App Version</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.MainImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.MainImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.MainImpl#getGeneralStyle <em>General Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends MinimalEObjectImpl.Container implements Main
{
  /**
   * The default value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected static final String APP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected String appName = APP_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAppVersion() <em>App Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppVersion()
   * @generated
   * @ordered
   */
  protected static final String APP_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppVersion() <em>App Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppVersion()
   * @generated
   * @ordered
   */
  protected String appVersion = APP_VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<Device> devices;

  /**
   * The cached value of the '{@link #getScreen() <em>Screen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScreen()
   * @generated
   * @ordered
   */
  protected Screen screen;

  /**
   * The default value of the '{@link #getGeneralStyle() <em>General Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralStyle()
   * @generated
   * @ordered
   */
  protected static final String GENERAL_STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGeneralStyle() <em>General Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralStyle()
   * @generated
   * @ordered
   */
  protected String generalStyle = GENERAL_STYLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AppBuilderDSLPackage.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppName()
  {
    return appName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppName(String newAppName)
  {
    String oldAppName = appName;
    appName = newAppName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.MAIN__APP_NAME, oldAppName, appName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppVersion()
  {
    return appVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppVersion(String newAppVersion)
  {
    String oldAppVersion = appVersion;
    appVersion = newAppVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.MAIN__APP_VERSION, oldAppVersion, appVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Device> getDevices()
  {
    if (devices == null)
    {
      devices = new EDataTypeEList<Device>(Device.class, this, AppBuilderDSLPackage.MAIN__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screen getScreen()
  {
    if (screen != null && screen.eIsProxy())
    {
      InternalEObject oldScreen = (InternalEObject)screen;
      screen = (Screen)eResolveProxy(oldScreen);
      if (screen != oldScreen)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppBuilderDSLPackage.MAIN__SCREEN, oldScreen, screen));
      }
    }
    return screen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screen basicGetScreen()
  {
    return screen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScreen(Screen newScreen)
  {
    Screen oldScreen = screen;
    screen = newScreen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.MAIN__SCREEN, oldScreen, screen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGeneralStyle()
  {
    return generalStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneralStyle(String newGeneralStyle)
  {
    String oldGeneralStyle = generalStyle;
    generalStyle = newGeneralStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.MAIN__GENERAL_STYLE, oldGeneralStyle, generalStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.MAIN__APP_NAME:
        return getAppName();
      case AppBuilderDSLPackage.MAIN__APP_VERSION:
        return getAppVersion();
      case AppBuilderDSLPackage.MAIN__DEVICES:
        return getDevices();
      case AppBuilderDSLPackage.MAIN__SCREEN:
        if (resolve) return getScreen();
        return basicGetScreen();
      case AppBuilderDSLPackage.MAIN__GENERAL_STYLE:
        return getGeneralStyle();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.MAIN__APP_NAME:
        setAppName((String)newValue);
        return;
      case AppBuilderDSLPackage.MAIN__APP_VERSION:
        setAppVersion((String)newValue);
        return;
      case AppBuilderDSLPackage.MAIN__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Device>)newValue);
        return;
      case AppBuilderDSLPackage.MAIN__SCREEN:
        setScreen((Screen)newValue);
        return;
      case AppBuilderDSLPackage.MAIN__GENERAL_STYLE:
        setGeneralStyle((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.MAIN__APP_NAME:
        setAppName(APP_NAME_EDEFAULT);
        return;
      case AppBuilderDSLPackage.MAIN__APP_VERSION:
        setAppVersion(APP_VERSION_EDEFAULT);
        return;
      case AppBuilderDSLPackage.MAIN__DEVICES:
        getDevices().clear();
        return;
      case AppBuilderDSLPackage.MAIN__SCREEN:
        setScreen((Screen)null);
        return;
      case AppBuilderDSLPackage.MAIN__GENERAL_STYLE:
        setGeneralStyle(GENERAL_STYLE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.MAIN__APP_NAME:
        return APP_NAME_EDEFAULT == null ? appName != null : !APP_NAME_EDEFAULT.equals(appName);
      case AppBuilderDSLPackage.MAIN__APP_VERSION:
        return APP_VERSION_EDEFAULT == null ? appVersion != null : !APP_VERSION_EDEFAULT.equals(appVersion);
      case AppBuilderDSLPackage.MAIN__DEVICES:
        return devices != null && !devices.isEmpty();
      case AppBuilderDSLPackage.MAIN__SCREEN:
        return screen != null;
      case AppBuilderDSLPackage.MAIN__GENERAL_STYLE:
        return GENERAL_STYLE_EDEFAULT == null ? generalStyle != null : !GENERAL_STYLE_EDEFAULT.equals(generalStyle);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (appName: ");
    result.append(appName);
    result.append(", appVersion: ");
    result.append(appVersion);
    result.append(", devices: ");
    result.append(devices);
    result.append(", generalStyle: ");
    result.append(generalStyle);
    result.append(')');
    return result.toString();
  }

} //MainImpl
