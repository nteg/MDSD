/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.Action;
import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Controller;
import com.nagarro.appBuilderDSL.InitAction;
import com.nagarro.appBuilderDSL.Validator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ControllerImpl#getInitAction <em>Init Action</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ControllerImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.ControllerImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends MinimalEObjectImpl.Container implements Controller
{
  /**
   * The cached value of the '{@link #getInitAction() <em>Init Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitAction()
   * @generated
   * @ordered
   */
  protected InitAction initAction;

  /**
   * The cached value of the '{@link #getValidator() <em>Validator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidator()
   * @generated
   * @ordered
   */
  protected Validator validator;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControllerImpl()
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
    return AppBuilderDSLPackage.Literals.CONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitAction getInitAction()
  {
    return initAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitAction(InitAction newInitAction, NotificationChain msgs)
  {
    InitAction oldInitAction = initAction;
    initAction = newInitAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.CONTROLLER__INIT_ACTION, oldInitAction, newInitAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitAction(InitAction newInitAction)
  {
    if (newInitAction != initAction)
    {
      NotificationChain msgs = null;
      if (initAction != null)
        msgs = ((InternalEObject)initAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.CONTROLLER__INIT_ACTION, null, msgs);
      if (newInitAction != null)
        msgs = ((InternalEObject)newInitAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.CONTROLLER__INIT_ACTION, null, msgs);
      msgs = basicSetInitAction(newInitAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.CONTROLLER__INIT_ACTION, newInitAction, newInitAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validator getValidator()
  {
    return validator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidator(Validator newValidator, NotificationChain msgs)
  {
    Validator oldValidator = validator;
    validator = newValidator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.CONTROLLER__VALIDATOR, oldValidator, newValidator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidator(Validator newValidator)
  {
    if (newValidator != validator)
    {
      NotificationChain msgs = null;
      if (validator != null)
        msgs = ((InternalEObject)validator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.CONTROLLER__VALIDATOR, null, msgs);
      if (newValidator != null)
        msgs = ((InternalEObject)newValidator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.CONTROLLER__VALIDATOR, null, msgs);
      msgs = basicSetValidator(newValidator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.CONTROLLER__VALIDATOR, newValidator, newValidator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, AppBuilderDSLPackage.CONTROLLER__ACTIONS);
    }
    return actions;
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
      case AppBuilderDSLPackage.CONTROLLER__INIT_ACTION:
        return basicSetInitAction(null, msgs);
      case AppBuilderDSLPackage.CONTROLLER__VALIDATOR:
        return basicSetValidator(null, msgs);
      case AppBuilderDSLPackage.CONTROLLER__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case AppBuilderDSLPackage.CONTROLLER__INIT_ACTION:
        return getInitAction();
      case AppBuilderDSLPackage.CONTROLLER__VALIDATOR:
        return getValidator();
      case AppBuilderDSLPackage.CONTROLLER__ACTIONS:
        return getActions();
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
      case AppBuilderDSLPackage.CONTROLLER__INIT_ACTION:
        setInitAction((InitAction)newValue);
        return;
      case AppBuilderDSLPackage.CONTROLLER__VALIDATOR:
        setValidator((Validator)newValue);
        return;
      case AppBuilderDSLPackage.CONTROLLER__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case AppBuilderDSLPackage.CONTROLLER__INIT_ACTION:
        setInitAction((InitAction)null);
        return;
      case AppBuilderDSLPackage.CONTROLLER__VALIDATOR:
        setValidator((Validator)null);
        return;
      case AppBuilderDSLPackage.CONTROLLER__ACTIONS:
        getActions().clear();
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
      case AppBuilderDSLPackage.CONTROLLER__INIT_ACTION:
        return initAction != null;
      case AppBuilderDSLPackage.CONTROLLER__VALIDATOR:
        return validator != null;
      case AppBuilderDSLPackage.CONTROLLER__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ControllerImpl
