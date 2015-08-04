/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.DomainEntity;
import org.example.domainmodel.domainmodel.DomainRepository;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.InterfaceOperationsUsageRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.DomainRepositoryImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.DomainRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.DomainRepositoryImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainRepositoryImpl extends AbstractNamespaceElementImpl implements DomainRepository
{
  /**
   * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected DomainEntity entityType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected InterfaceOperationsUsageRule operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainRepositoryImpl()
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
    return DomainmodelPackage.Literals.DOMAIN_REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainEntity getEntityType()
  {
    if (entityType != null && entityType.eIsProxy())
    {
      InternalEObject oldEntityType = (InternalEObject)entityType;
      entityType = (DomainEntity)eResolveProxy(oldEntityType);
      if (entityType != oldEntityType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.DOMAIN_REPOSITORY__ENTITY_TYPE, oldEntityType, entityType));
      }
    }
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainEntity basicGetEntityType()
  {
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityType(DomainEntity newEntityType)
  {
    DomainEntity oldEntityType = entityType;
    entityType = newEntityType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.DOMAIN_REPOSITORY__ENTITY_TYPE, oldEntityType, entityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.DOMAIN_REPOSITORY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceOperationsUsageRule getOperations()
  {
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperations(InterfaceOperationsUsageRule newOperations, NotificationChain msgs)
  {
    InterfaceOperationsUsageRule oldOperations = operations;
    operations = newOperations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS, oldOperations, newOperations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperations(InterfaceOperationsUsageRule newOperations)
  {
    if (newOperations != operations)
    {
      NotificationChain msgs = null;
      if (operations != null)
        msgs = ((InternalEObject)operations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS, null, msgs);
      if (newOperations != null)
        msgs = ((InternalEObject)newOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS, null, msgs);
      msgs = basicSetOperations(newOperations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS, newOperations, newOperations));
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
      case DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS:
        return basicSetOperations(null, msgs);
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
      case DomainmodelPackage.DOMAIN_REPOSITORY__ENTITY_TYPE:
        if (resolve) return getEntityType();
        return basicGetEntityType();
      case DomainmodelPackage.DOMAIN_REPOSITORY__NAME:
        return getName();
      case DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS:
        return getOperations();
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
      case DomainmodelPackage.DOMAIN_REPOSITORY__ENTITY_TYPE:
        setEntityType((DomainEntity)newValue);
        return;
      case DomainmodelPackage.DOMAIN_REPOSITORY__NAME:
        setName((String)newValue);
        return;
      case DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS:
        setOperations((InterfaceOperationsUsageRule)newValue);
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
      case DomainmodelPackage.DOMAIN_REPOSITORY__ENTITY_TYPE:
        setEntityType((DomainEntity)null);
        return;
      case DomainmodelPackage.DOMAIN_REPOSITORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS:
        setOperations((InterfaceOperationsUsageRule)null);
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
      case DomainmodelPackage.DOMAIN_REPOSITORY__ENTITY_TYPE:
        return entityType != null;
      case DomainmodelPackage.DOMAIN_REPOSITORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.DOMAIN_REPOSITORY__OPERATIONS:
        return operations != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DomainRepositoryImpl
