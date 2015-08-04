/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Screen;
import com.nagarro.appBuilderDSL.ScreenLayout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ScreenLayoutImpl#getScreen <em>Screen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenLayoutImpl extends ControlImpl implements ScreenLayout
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScreenLayoutImpl()
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
    return AppBuilderDSLPackage.Literals.SCREEN_LAYOUT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppBuilderDSLPackage.SCREEN_LAYOUT__SCREEN, oldScreen, screen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SCREEN_LAYOUT__SCREEN, oldScreen, screen));
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
      case AppBuilderDSLPackage.SCREEN_LAYOUT__SCREEN:
        if (resolve) return getScreen();
        return basicGetScreen();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.SCREEN_LAYOUT__SCREEN:
        setScreen((Screen)newValue);
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
      case AppBuilderDSLPackage.SCREEN_LAYOUT__SCREEN:
        setScreen((Screen)null);
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
      case AppBuilderDSLPackage.SCREEN_LAYOUT__SCREEN:
        return screen != null;
    }
    return super.eIsSet(featureID);
  }

} //ScreenLayoutImpl
