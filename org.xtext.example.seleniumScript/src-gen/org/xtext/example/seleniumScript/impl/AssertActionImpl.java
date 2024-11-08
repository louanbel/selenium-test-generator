/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.seleniumScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.seleniumScript.AssertAction;
import org.xtext.example.seleniumScript.SelectorHas;
import org.xtext.example.seleniumScript.SeleniumScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.seleniumScript.impl.AssertActionImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertActionImpl extends ActionImpl implements AssertAction
{
  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected SelectorHas selector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertActionImpl()
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
    return SeleniumScriptPackage.Literals.ASSERT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectorHas getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(SelectorHas newSelector, NotificationChain msgs)
  {
    SelectorHas oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeleniumScriptPackage.ASSERT_ACTION__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelector(SelectorHas newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeleniumScriptPackage.ASSERT_ACTION__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeleniumScriptPackage.ASSERT_ACTION__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleniumScriptPackage.ASSERT_ACTION__SELECTOR, newSelector, newSelector));
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
      case SeleniumScriptPackage.ASSERT_ACTION__SELECTOR:
        return basicSetSelector(null, msgs);
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
      case SeleniumScriptPackage.ASSERT_ACTION__SELECTOR:
        return getSelector();
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
      case SeleniumScriptPackage.ASSERT_ACTION__SELECTOR:
        setSelector((SelectorHas)newValue);
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
      case SeleniumScriptPackage.ASSERT_ACTION__SELECTOR:
        setSelector((SelectorHas)null);
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
      case SeleniumScriptPackage.ASSERT_ACTION__SELECTOR:
        return selector != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertActionImpl
