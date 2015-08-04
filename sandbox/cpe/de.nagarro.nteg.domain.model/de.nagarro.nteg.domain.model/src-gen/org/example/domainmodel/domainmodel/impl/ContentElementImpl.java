/**
 */
package org.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.domainmodel.ContentElement;
import org.example.domainmodel.domainmodel.ContentElementLiteral;
import org.example.domainmodel.domainmodel.DomainmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.impl.ContentElementImpl#getContentElement <em>Content Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentElementImpl extends ViewElementImpl implements ContentElement
{
  /**
   * The default value of the '{@link #getContentElement() <em>Content Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentElement()
   * @generated
   * @ordered
   */
  protected static final ContentElementLiteral CONTENT_ELEMENT_EDEFAULT = ContentElementLiteral.TEXT;

  /**
   * The cached value of the '{@link #getContentElement() <em>Content Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentElement()
   * @generated
   * @ordered
   */
  protected ContentElementLiteral contentElement = CONTENT_ELEMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentElementImpl()
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
    return DomainmodelPackage.Literals.CONTENT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentElementLiteral getContentElement()
  {
    return contentElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContentElement(ContentElementLiteral newContentElement)
  {
    ContentElementLiteral oldContentElement = contentElement;
    contentElement = newContentElement == null ? CONTENT_ELEMENT_EDEFAULT : newContentElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.CONTENT_ELEMENT__CONTENT_ELEMENT, oldContentElement, contentElement));
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
      case DomainmodelPackage.CONTENT_ELEMENT__CONTENT_ELEMENT:
        return getContentElement();
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
      case DomainmodelPackage.CONTENT_ELEMENT__CONTENT_ELEMENT:
        setContentElement((ContentElementLiteral)newValue);
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
      case DomainmodelPackage.CONTENT_ELEMENT__CONTENT_ELEMENT:
        setContentElement(CONTENT_ELEMENT_EDEFAULT);
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
      case DomainmodelPackage.CONTENT_ELEMENT__CONTENT_ELEMENT:
        return contentElement != CONTENT_ELEMENT_EDEFAULT;
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
    result.append(" (contentElement: ");
    result.append(contentElement);
    result.append(')');
    return result.toString();
  }

} //ContentElementImpl
