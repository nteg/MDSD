/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Business;
import com.nagarro.appBuilderDSL.Ui;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SystemImpl#getBusiness <em>Business</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SystemImpl#getUi <em>Ui</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends AbstractElementImpl implements com.nagarro.appBuilderDSL.System
{
  /**
   * The cached value of the '{@link #getBusiness() <em>Business</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusiness()
   * @generated
   * @ordered
   */
  protected Business business;

  /**
   * The cached value of the '{@link #getUi() <em>Ui</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUi()
   * @generated
   * @ordered
   */
  protected Ui ui;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return AppBuilderDSLPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Business getBusiness()
  {
    return business;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBusiness(Business newBusiness, NotificationChain msgs)
  {
    Business oldBusiness = business;
    business = newBusiness;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SYSTEM__BUSINESS, oldBusiness, newBusiness);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBusiness(Business newBusiness)
  {
    if (newBusiness != business)
    {
      NotificationChain msgs = null;
      if (business != null)
        msgs = ((InternalEObject)business).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SYSTEM__BUSINESS, null, msgs);
      if (newBusiness != null)
        msgs = ((InternalEObject)newBusiness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SYSTEM__BUSINESS, null, msgs);
      msgs = basicSetBusiness(newBusiness, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SYSTEM__BUSINESS, newBusiness, newBusiness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ui getUi()
  {
    return ui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUi(Ui newUi, NotificationChain msgs)
  {
    Ui oldUi = ui;
    ui = newUi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SYSTEM__UI, oldUi, newUi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUi(Ui newUi)
  {
    if (newUi != ui)
    {
      NotificationChain msgs = null;
      if (ui != null)
        msgs = ((InternalEObject)ui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SYSTEM__UI, null, msgs);
      if (newUi != null)
        msgs = ((InternalEObject)newUi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SYSTEM__UI, null, msgs);
      msgs = basicSetUi(newUi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SYSTEM__UI, newUi, newUi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AppBuilderDSLPackage.SYSTEM__BUSINESS:
        return basicSetBusiness(null, msgs);
      case AppBuilderDSLPackage.SYSTEM__UI:
        return basicSetUi(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AppBuilderDSLPackage.SYSTEM__BUSINESS:
        return getBusiness();
      case AppBuilderDSLPackage.SYSTEM__UI:
        return getUi();
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
      case AppBuilderDSLPackage.SYSTEM__BUSINESS:
        setBusiness((Business)newValue);
        return;
      case AppBuilderDSLPackage.SYSTEM__UI:
        setUi((Ui)newValue);
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
      case AppBuilderDSLPackage.SYSTEM__BUSINESS:
        setBusiness((Business)null);
        return;
      case AppBuilderDSLPackage.SYSTEM__UI:
        setUi((Ui)null);
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
      case AppBuilderDSLPackage.SYSTEM__BUSINESS:
        return business != null;
      case AppBuilderDSLPackage.SYSTEM__UI:
        return ui != null;
    }
    return super.eIsSet(featureID);
  }

} //SystemImpl
