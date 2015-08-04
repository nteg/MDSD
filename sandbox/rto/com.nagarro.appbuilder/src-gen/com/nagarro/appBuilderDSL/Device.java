/**
 */
package com.nagarro.appBuilderDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.nagarro.appBuilderDSL.AppBuilderDSLPackage#getDevice()
 * @model
 * @generated
 */
public enum Device implements Enumerator
{
  /**
   * The '<em><b>Iphone</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IPHONE_VALUE
   * @generated
   * @ordered
   */
  IPHONE(0, "iphone", "iphone"),

  /**
   * The '<em><b>Ipad</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IPAD_VALUE
   * @generated
   * @ordered
   */
  IPAD(1, "ipad", "ipad"),

  /**
   * The '<em><b>Android4</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANDROID4_VALUE
   * @generated
   * @ordered
   */
  ANDROID4(2, "android4", "android4"),

  /**
   * The '<em><b>Android2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANDROID2_VALUE
   * @generated
   * @ordered
   */
  ANDROID2(3, "android2", "android2");

  /**
   * The '<em><b>Iphone</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Iphone</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IPHONE
   * @model name="iphone"
   * @generated
   * @ordered
   */
  public static final int IPHONE_VALUE = 0;

  /**
   * The '<em><b>Ipad</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ipad</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IPAD
   * @model name="ipad"
   * @generated
   * @ordered
   */
  public static final int IPAD_VALUE = 1;

  /**
   * The '<em><b>Android4</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Android4</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANDROID4
   * @model name="android4"
   * @generated
   * @ordered
   */
  public static final int ANDROID4_VALUE = 2;

  /**
   * The '<em><b>Android2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Android2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANDROID2
   * @model name="android2"
   * @generated
   * @ordered
   */
  public static final int ANDROID2_VALUE = 3;

  /**
   * An array of all the '<em><b>Device</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Device[] VALUES_ARRAY =
    new Device[]
    {
      IPHONE,
      IPAD,
      ANDROID4,
      ANDROID2,
    };

  /**
   * A public read-only list of all the '<em><b>Device</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Device> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Device</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Device get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Device result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Device</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Device getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Device result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Device</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Device get(int value)
  {
    switch (value)
    {
      case IPHONE_VALUE: return IPHONE;
      case IPAD_VALUE: return IPAD;
      case ANDROID4_VALUE: return ANDROID4;
      case ANDROID2_VALUE: return ANDROID2;
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
  private Device(int value, String name, String literal)
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
  
} //Device
