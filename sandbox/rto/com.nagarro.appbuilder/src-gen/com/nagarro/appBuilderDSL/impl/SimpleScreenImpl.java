/**
 */
package com.nagarro.appBuilderDSL.impl;

import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Controller;
import com.nagarro.appBuilderDSL.EntryParameters;
import com.nagarro.appBuilderDSL.Model;
import com.nagarro.appBuilderDSL.SimpleScreen;
import com.nagarro.appBuilderDSL.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SimpleScreenImpl#getEntryParameters <em>Entry Parameters</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SimpleScreenImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SimpleScreenImpl#getView <em>View</em>}</li>
 *   <li>{@link com.nagarro.appBuilderDSL.impl.SimpleScreenImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleScreenImpl extends ScreenImpl implements SimpleScreen
{
  /**
   * The cached value of the '{@link #getEntryParameters() <em>Entry Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryParameters()
   * @generated
   * @ordered
   */
  protected EntryParameters entryParameters;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Model model;

  /**
   * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected View view;

  /**
   * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected Controller controller;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleScreenImpl()
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
    return AppBuilderDSLPackage.Literals.SIMPLE_SCREEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntryParameters getEntryParameters()
  {
    return entryParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntryParameters(EntryParameters newEntryParameters, NotificationChain msgs)
  {
    EntryParameters oldEntryParameters = entryParameters;
    entryParameters = newEntryParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS, oldEntryParameters, newEntryParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryParameters(EntryParameters newEntryParameters)
  {
    if (newEntryParameters != entryParameters)
    {
      NotificationChain msgs = null;
      if (entryParameters != null)
        msgs = ((InternalEObject)entryParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS, null, msgs);
      if (newEntryParameters != null)
        msgs = ((InternalEObject)newEntryParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS, null, msgs);
      msgs = basicSetEntryParameters(newEntryParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS, newEntryParameters, newEntryParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModel(Model newModel, NotificationChain msgs)
  {
    Model oldModel = model;
    model = newModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL, oldModel, newModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(Model newModel)
  {
    if (newModel != model)
    {
      NotificationChain msgs = null;
      if (model != null)
        msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL, null, msgs);
      if (newModel != null)
        msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL, null, msgs);
      msgs = basicSetModel(newModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL, newModel, newModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View getView()
  {
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetView(View newView, NotificationChain msgs)
  {
    View oldView = view;
    view = newView;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW, oldView, newView);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(View newView)
  {
    if (newView != view)
    {
      NotificationChain msgs = null;
      if (view != null)
        msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW, null, msgs);
      if (newView != null)
        msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW, null, msgs);
      msgs = basicSetView(newView, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW, newView, newView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controller getController()
  {
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetController(Controller newController, NotificationChain msgs)
  {
    Controller oldController = controller;
    controller = newController;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER, oldController, newController);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setController(Controller newController)
  {
    if (newController != controller)
    {
      NotificationChain msgs = null;
      if (controller != null)
        msgs = ((InternalEObject)controller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER, null, msgs);
      if (newController != null)
        msgs = ((InternalEObject)newController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER, null, msgs);
      msgs = basicSetController(newController, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER, newController, newController));
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
      case AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS:
        return basicSetEntryParameters(null, msgs);
      case AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL:
        return basicSetModel(null, msgs);
      case AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW:
        return basicSetView(null, msgs);
      case AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER:
        return basicSetController(null, msgs);
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
      case AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS:
        return getEntryParameters();
      case AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL:
        return getModel();
      case AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW:
        return getView();
      case AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER:
        return getController();
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
      case AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS:
        setEntryParameters((EntryParameters)newValue);
        return;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL:
        setModel((Model)newValue);
        return;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW:
        setView((View)newValue);
        return;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER:
        setController((Controller)newValue);
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
      case AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS:
        setEntryParameters((EntryParameters)null);
        return;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL:
        setModel((Model)null);
        return;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW:
        setView((View)null);
        return;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER:
        setController((Controller)null);
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
      case AppBuilderDSLPackage.SIMPLE_SCREEN__ENTRY_PARAMETERS:
        return entryParameters != null;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__MODEL:
        return model != null;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__VIEW:
        return view != null;
      case AppBuilderDSLPackage.SIMPLE_SCREEN__CONTROLLER:
        return controller != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleScreenImpl
