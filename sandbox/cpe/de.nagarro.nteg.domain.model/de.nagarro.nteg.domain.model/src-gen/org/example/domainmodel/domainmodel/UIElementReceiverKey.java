/**
 */
package org.example.domainmodel.domainmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>UI Element Receiver Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getUIElementReceiverKey()
 * @model
 * @generated
 */
public enum UIElementReceiverKey implements Enumerator
{
  /**
   * The '<em><b>SELECTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SELECTION_VALUE
   * @generated
   * @ordered
   */
  SELECTION(0, "SELECTION", "selection"),

  /**
   * The '<em><b>VALUES </b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUES__VALUE
   * @generated
   * @ordered
   */
  VALUES_(1, "VALUES_", "values"),

  /**
   * The '<em><b>ON SELECTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ON_SELECTION_VALUE
   * @generated
   * @ordered
   */
  ON_SELECTION(2, "ON_SELECTION", "onSelection"),

  /**
   * The '<em><b>TEXT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_VALUE
   * @generated
   * @ordered
   */
  TEXT(3, "TEXT", "text");

  /**
   * The '<em><b>SELECTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SELECTION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SELECTION
   * @model literal="selection"
   * @generated
   * @ordered
   */
  public static final int SELECTION_VALUE = 0;

  /**
   * The '<em><b>VALUES </b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VALUES </b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALUES_
   * @model literal="values"
   * @generated
   * @ordered
   */
  public static final int VALUES__VALUE = 1;

  /**
   * The '<em><b>ON SELECTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ON SELECTION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ON_SELECTION
   * @model literal="onSelection"
   * @generated
   * @ordered
   */
  public static final int ON_SELECTION_VALUE = 2;

  /**
   * The '<em><b>TEXT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TEXT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT
   * @model literal="text"
   * @generated
   * @ordered
   */
  public static final int TEXT_VALUE = 3;

  /**
   * An array of all the '<em><b>UI Element Receiver Key</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UIElementReceiverKey[] VALUES_ARRAY =
    new UIElementReceiverKey[]
    {
      SELECTION,
      VALUES_,
      ON_SELECTION,
      TEXT,
    };

  /**
   * A public read-only list of all the '<em><b>UI Element Receiver Key</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UIElementReceiverKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>UI Element Receiver Key</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UIElementReceiverKey get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UIElementReceiverKey result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UI Element Receiver Key</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UIElementReceiverKey getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UIElementReceiverKey result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UI Element Receiver Key</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UIElementReceiverKey get(int value)
  {
    switch (value)
    {
      case SELECTION_VALUE: return SELECTION;
      case VALUES__VALUE: return VALUES_;
      case ON_SELECTION_VALUE: return ON_SELECTION;
      case TEXT_VALUE: return TEXT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private UIElementReceiverKey(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //UIElementReceiverKey
