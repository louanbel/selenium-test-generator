/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.seleniumScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.seleniumScript.And#getAndAttribute <em>And Attribute</em>}</li>
 *   <li>{@link org.xtext.example.seleniumScript.And#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.seleniumScript.SeleniumScriptPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends EObject
{
  /**
   * Returns the value of the '<em><b>And Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>And Attribute</em>' containment reference.
   * @see #setAndAttribute(AndAttribute)
   * @see org.xtext.example.seleniumScript.SeleniumScriptPackage#getAnd_AndAttribute()
   * @model containment="true"
   * @generated
   */
  AndAttribute getAndAttribute();

  /**
   * Sets the value of the '{@link org.xtext.example.seleniumScript.And#getAndAttribute <em>And Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And Attribute</em>' containment reference.
   * @see #getAndAttribute()
   * @generated
   */
  void setAndAttribute(AndAttribute value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.xtext.example.seleniumScript.SeleniumScriptPackage#getAnd_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.seleniumScript.And#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // And
