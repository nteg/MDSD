/**
 */
package org.example.domainmodel.domainmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Name Literal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getPropertyNameLiteral()
 * @model
 * @generated
 */
public enum PropertyNameLiteral implements Enumerator
{
  /**
   * The '<em><b>LABEL PROVIDER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LABEL_PROVIDER_VALUE
   * @generated
   * @ordered
   */
  LABEL_PROVIDER(0, "LABEL_PROVIDER", "labelProvider"),

  /**
   * The '<em><b>CSS ITEM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CSS_ITEM_VALUE
   * @generated
   * @ordered
   */
  CSS_ITEM(1, "CSS_ITEM", "cssItem"),

  /**
   * The '<em><b>TOOLTIP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOOLTIP_VALUE
   * @generated
   * @ordered
   */
  TOOLTIP(2, "TOOLTIP", "tooltip"),

  /**
   * The '<em><b>RESOURCE KEY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESOURCE_KEY_VALUE
   * @generated
   * @ordered
   */
  RESOURCE_KEY(3, "RESOURCE_KEY", "resourceKey"),

  /**
   * The '<em><b>STYLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STYLE_VALUE
   * @generated
   * @ordered
   */
  STYLE(4, "STYLE", "style"),

  /**
   * The '<em><b>PATH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PATH_VALUE
   * @generated
   * @ordered
   */
  PATH(5, "PATH", "path"),

  /**
   * The '<em><b>TYPE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TYPE_VALUE
   * @generated
   * @ordered
   */
  TYPE(6, "TYPE", "type"),

  /**
   * The '<em><b>COLUMNS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLUMNS_VALUE
   * @generated
   * @ordered
   */
  COLUMNS(7, "COLUMNS", "columns");

  /**
   * The '<em><b>LABEL PROVIDER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LABEL PROVIDER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LABEL_PROVIDER
   * @model literal="labelProvider"
   * @generated
   * @ordered
   */
  public static final int LABEL_PROVIDER_VALUE = 0;

  /**
   * The '<em><b>CSS ITEM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CSS ITEM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CSS_ITEM
   * @model literal="cssItem"
   * @generated
   * @ordered
   */
  public static final int CSS_ITEM_VALUE = 1;

  /**
   * The '<em><b>TOOLTIP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TOOLTIP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOOLTIP
   * @model literal="tooltip"
   * @generated
   * @ordered
   */
  public static final int TOOLTIP_VALUE = 2;

  /**
   * The '<em><b>RESOURCE KEY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RESOURCE KEY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESOURCE_KEY
   * @model literal="resourceKey"
   * @generated
   * @ordered
   */
  public static final int RESOURCE_KEY_VALUE = 3;

  /**
   * The '<em><b>STYLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STYLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STYLE
   * @model literal="style"
   * @generated
   * @ordered
   */
  public static final int STYLE_VALUE = 4;

  /**
   * The '<em><b>PATH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PATH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PATH
   * @model literal="path"
   * @generated
   * @ordered
   */
  public static final int PATH_VALUE = 5;

  /**
   * The '<em><b>TYPE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TYPE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TYPE
   * @model literal="type"
   * @generated
   * @ordered
   */
  public static final int TYPE_VALUE = 6;

  /**
   * The '<em><b>COLUMNS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COLUMNS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLUMNS
   * @model literal="columns"
   * @generated
   * @ordered
   */
  public static final int COLUMNS_VALUE = 7;

  /**
   * An array of all the '<em><b>Property Name Literal</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PropertyNameLiteral[] VALUES_ARRAY =
    new PropertyNameLiteral[]
    {
      LABEL_PROVIDER,
      CSS_ITEM,
      TOOLTIP,
      RESOURCE_KEY,
      STYLE,
      PATH,
      TYPE,
      COLUMNS,
    };

  /**
   * A public read-only list of all the '<em><b>Property Name Literal</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PropertyNameLiteral> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Property Name Literal</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropertyNameLiteral get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyNameLiteral result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Name Literal</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropertyNameLiteral getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyNameLiteral result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Name Literal</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PropertyNameLiteral get(int value)
  {
    switch (value)
    {
      case LABEL_PROVIDER_VALUE: return LABEL_PROVIDER;
      case CSS_ITEM_VALUE: return CSS_ITEM;
      case TOOLTIP_VALUE: return TOOLTIP;
      case RESOURCE_KEY_VALUE: return RESOURCE_KEY;
      case STYLE_VALUE: return STYLE;
      case PATH_VALUE: return PATH;
      case TYPE_VALUE: return TYPE;
      case COLUMNS_VALUE: return COLUMNS;
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
  private PropertyNameLiteral(int value, String name, String literal)
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
  
} //PropertyNameLiteral
