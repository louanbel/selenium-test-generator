/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.seleniumScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.seleniumScript.VariableAssignation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.example.seleniumScript.VariableAssignation#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.seleniumScript.SeleniumScriptPackage#getVariableAssignation()
 * @model
 * @generated
 */
public interface VariableAssignation extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see org.xtext.example.seleniumScript.SeleniumScriptPackage#getVariableAssignation_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link org.xtext.example.seleniumScript.VariableAssignation#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference.
   * @see #setSelector(SelectorWith)
   * @see org.xtext.example.seleniumScript.SeleniumScriptPackage#getVariableAssignation_Selector()
   * @model containment="true"
   * @generated
   */
  SelectorWith getSelector();

  /**
   * Sets the value of the '{@link org.xtext.example.seleniumScript.VariableAssignation#getSelector <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' containment reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(SelectorWith value);

} // VariableAssignation
