/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.BindAction;
import org.example.domainmodel.domainmodel.BindSource;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.SetUIElementReceiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BindActionImpl#getBindSource <em>Bind Source</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BindActionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.BindActionImpl#getUiReceiver <em>Ui Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindActionImpl extends InitActionFeatureImpl implements BindAction
{
  /**
   * The cached value of the '{@link #getBindSource() <em>Bind Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindSource()
   * @generated
   * @ordered
   */
  protected BindSource bindSource;

  /**
   * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected String attribute = ATTRIBUTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUiReceiver() <em>Ui Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiReceiver()
   * @generated
   * @ordered
   */
  protected SetUIElementReceiver uiReceiver;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindActionImpl()
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
    return DomainmodelPackage.Literals.BIND_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindSource getBindSource()
  {
    return bindSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBindSource(BindSource newBindSource, NotificationChain msgs)
  {
    BindSource oldBindSource = bindSource;
    bindSource = newBindSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BIND_ACTION__BIND_SOURCE, oldBindSource, newBindSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindSource(BindSource newBindSource)
  {
    if (newBindSource != bindSource)
    {
      NotificationChain msgs = null;
      if (bindSource != null)
        msgs = ((InternalEObject)bindSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.BIND_ACTION__BIND_SOURCE, null, msgs);
      if (newBindSource != null)
        msgs = ((InternalEObject)newBindSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.BIND_ACTION__BIND_SOURCE, null, msgs);
      msgs = basicSetBindSource(newBindSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BIND_ACTION__BIND_SOURCE, newBindSource, newBindSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(String newAttribute)
  {
    String oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BIND_ACTION__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetUIElementReceiver getUiReceiver()
  {
    return uiReceiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUiReceiver(SetUIElementReceiver newUiReceiver, NotificationChain msgs)
  {
    SetUIElementReceiver oldUiReceiver = uiReceiver;
    uiReceiver = newUiReceiver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BIND_ACTION__UI_RECEIVER, oldUiReceiver, newUiReceiver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUiReceiver(SetUIElementReceiver newUiReceiver)
  {
    if (newUiReceiver != uiReceiver)
    {
      NotificationChain msgs = null;
      if (uiReceiver != null)
        msgs = ((InternalEObject)uiReceiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.BIND_ACTION__UI_RECEIVER, null, msgs);
      if (newUiReceiver != null)
        msgs = ((InternalEObject)newUiReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.BIND_ACTION__UI_RECEIVER, null, msgs);
      msgs = basicSetUiReceiver(newUiReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.BIND_ACTION__UI_RECEIVER, newUiReceiver, newUiReceiver));
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
      case DomainmodelPackage.BIND_ACTION__BIND_SOURCE:
        return basicSetBindSource(null, msgs);
      case DomainmodelPackage.BIND_ACTION__UI_RECEIVER:
        return basicSetUiReceiver(null, msgs);
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
      case DomainmodelPackage.BIND_ACTION__BIND_SOURCE:
        return getBindSource();
      case DomainmodelPackage.BIND_ACTION__ATTRIBUTE:
        return getAttribute();
      case DomainmodelPackage.BIND_ACTION__UI_RECEIVER:
        return getUiReceiver();
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
      case DomainmodelPackage.BIND_ACTION__BIND_SOURCE:
        setBindSource((BindSource)newValue);
        return;
      case DomainmodelPackage.BIND_ACTION__ATTRIBUTE:
        setAttribute((String)newValue);
        return;
      case DomainmodelPackage.BIND_ACTION__UI_RECEIVER:
        setUiReceiver((SetUIElementReceiver)newValue);
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
      case DomainmodelPackage.BIND_ACTION__BIND_SOURCE:
        setBindSource((BindSource)null);
        return;
      case DomainmodelPackage.BIND_ACTION__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
        return;
      case DomainmodelPackage.BIND_ACTION__UI_RECEIVER:
        setUiReceiver((SetUIElementReceiver)null);
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
      case DomainmodelPackage.BIND_ACTION__BIND_SOURCE:
        return bindSource != null;
      case DomainmodelPackage.BIND_ACTION__ATTRIBUTE:
        return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
      case DomainmodelPackage.BIND_ACTION__UI_RECEIVER:
        return uiReceiver != null;
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
    result.append(" (attribute: ");
    result.append(attribute);
    result.append(')');
    return result.toString();
  }

} //BindActionImpl
