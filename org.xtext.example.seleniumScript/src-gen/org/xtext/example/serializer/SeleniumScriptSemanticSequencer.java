/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.seleniumScript.And;
import org.xtext.example.seleniumScript.AndAttribute;
import org.xtext.example.seleniumScript.AssertAction;
import org.xtext.example.seleniumScript.ClickAction;
import org.xtext.example.seleniumScript.GotoAction;
import org.xtext.example.seleniumScript.Model;
import org.xtext.example.seleniumScript.SelectAction;
import org.xtext.example.seleniumScript.SelectorHas;
import org.xtext.example.seleniumScript.SelectorWith;
import org.xtext.example.seleniumScript.SeleniumScriptPackage;
import org.xtext.example.seleniumScript.Test;
import org.xtext.example.seleniumScript.Value;
import org.xtext.example.seleniumScript.VariableAction;
import org.xtext.example.seleniumScript.VariableAssignation;
import org.xtext.example.seleniumScript.With;
import org.xtext.example.seleniumScript.WithAttribute;
import org.xtext.example.seleniumScript.WriteAction;
import org.xtext.example.services.SeleniumScriptGrammarAccess;

@SuppressWarnings("all")
public class SeleniumScriptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SeleniumScriptGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SeleniumScriptPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SeleniumScriptPackage.ACTION:
				sequence_Action(context, (org.xtext.example.seleniumScript.Action) semanticObject); 
				return; 
			case SeleniumScriptPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case SeleniumScriptPackage.AND_ATTRIBUTE:
				sequence_AndAttribute(context, (AndAttribute) semanticObject); 
				return; 
			case SeleniumScriptPackage.ASSERT_ACTION:
				sequence_AssertAction(context, (AssertAction) semanticObject); 
				return; 
			case SeleniumScriptPackage.CLICK_ACTION:
				sequence_ClickAction(context, (ClickAction) semanticObject); 
				return; 
			case SeleniumScriptPackage.GOTO_ACTION:
				sequence_GotoAction(context, (GotoAction) semanticObject); 
				return; 
			case SeleniumScriptPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SeleniumScriptPackage.SELECT_ACTION:
				sequence_SelectAction(context, (SelectAction) semanticObject); 
				return; 
			case SeleniumScriptPackage.SELECTOR_HAS:
				sequence_SelectorHas(context, (SelectorHas) semanticObject); 
				return; 
			case SeleniumScriptPackage.SELECTOR_WITH:
				sequence_SelectorWith(context, (SelectorWith) semanticObject); 
				return; 
			case SeleniumScriptPackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case SeleniumScriptPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			case SeleniumScriptPackage.VARIABLE_ACTION:
				sequence_VariableAction(context, (VariableAction) semanticObject); 
				return; 
			case SeleniumScriptPackage.VARIABLE_ASSIGNATION:
				sequence_VariableAssignation(context, (VariableAssignation) semanticObject); 
				return; 
			case SeleniumScriptPackage.WITH:
				sequence_With(context, (With) semanticObject); 
				return; 
			case SeleniumScriptPackage.WITH_ATTRIBUTE:
				sequence_WithAttribute(context, (WithAttribute) semanticObject); 
				return; 
			case SeleniumScriptPackage.WRITE_ACTION:
				sequence_WriteAction(context, (WriteAction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     {Action}
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, org.xtext.example.seleniumScript.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AndAttribute returns AndAttribute
	 *
	 * Constraint:
	 *     attribute=ID
	 * </pre>
	 */
	protected void sequence_AndAttribute(ISerializationContext context, AndAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.AND_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.AND_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAttributeAccess().getAttributeIDTerminalRuleCall_1_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     And returns And
	 *
	 * Constraint:
	 *     (andAttribute=AndAttribute value=Value)
	 * </pre>
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.AND__AND_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.AND__AND_ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.AND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.AND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndAttributeAndAttributeParserRuleCall_0_0(), semanticObject.getAndAttribute());
		feeder.accept(grammarAccess.getAndAccess().getValueValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns AssertAction
	 *     AssertAction returns AssertAction
	 *
	 * Constraint:
	 *     selector=SelectorHas
	 * </pre>
	 */
	protected void sequence_AssertAction(ISerializationContext context, AssertAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.ASSERT_ACTION__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.ASSERT_ACTION__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssertActionAccess().getSelectorSelectorHasParserRuleCall_1_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns ClickAction
	 *     ClickAction returns ClickAction
	 *
	 * Constraint:
	 *     selector=SelectorWith
	 * </pre>
	 */
	protected void sequence_ClickAction(ISerializationContext context, ClickAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.CLICK_ACTION__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.CLICK_ACTION__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickActionAccess().getSelectorSelectorWithParserRuleCall_1_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns GotoAction
	 *     GotoAction returns GotoAction
	 *
	 * Constraint:
	 *     url=URL
	 * </pre>
	 */
	protected void sequence_GotoAction(ISerializationContext context, GotoAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.GOTO_ACTION__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.GOTO_ACTION__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGotoActionAccess().getUrlURLTerminalRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     tests+=Test+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns SelectAction
	 *     SelectAction returns SelectAction
	 *
	 * Constraint:
	 *     ((optionSelector?=WithAttribute value=STRING and+=And*)? selector=SelectorWith)
	 * </pre>
	 */
	protected void sequence_SelectAction(ISerializationContext context, SelectAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SelectorHas returns SelectorHas
	 *
	 * Constraint:
	 *     (base_selector=STRING attribute=ID value=Value)
	 * </pre>
	 */
	protected void sequence_SelectorHas(ISerializationContext context, SelectorHas semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.SELECTOR_HAS__BASE_SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.SELECTOR_HAS__BASE_SELECTOR));
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.SELECTOR_HAS__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.SELECTOR_HAS__ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.SELECTOR_HAS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.SELECTOR_HAS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectorHasAccess().getBase_selectorSTRINGTerminalRuleCall_0_0(), semanticObject.getBase_selector());
		feeder.accept(grammarAccess.getSelectorHasAccess().getAttributeIDTerminalRuleCall_2_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getSelectorHasAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SelectorWith returns SelectorWith
	 *
	 * Constraint:
	 *     (base_selector=STRING (w=With and+=And*)?)
	 * </pre>
	 */
	protected void sequence_SelectorWith(ISerializationContext context, SelectorWith semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     (name=ID actions+=Action+)
	 * </pre>
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns Value
	 *
	 * Constraint:
	 *     value=[VariableAction|ID]
	 * </pre>
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getValueVariableActionIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SeleniumScriptPackage.Literals.VALUE__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns VariableAction
	 *     VariableAction returns VariableAction
	 *
	 * Constraint:
	 *     (name=ID assignation=VariableAssignation)
	 * </pre>
	 */
	protected void sequence_VariableAction(ISerializationContext context, VariableAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ACTION__NAME));
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ACTION__ASSIGNATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ACTION__ASSIGNATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableActionAccess().getAssignationVariableAssignationParserRuleCall_2_0(), semanticObject.getAssignation());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VariableAssignation returns VariableAssignation
	 *
	 * Constraint:
	 *     (attribute=ID selector=SelectorWith)
	 * </pre>
	 */
	protected void sequence_VariableAssignation(ISerializationContext context, VariableAssignation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ASSIGNATION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ASSIGNATION__ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ASSIGNATION__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.VARIABLE_ASSIGNATION__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAssignationAccess().getAttributeIDTerminalRuleCall_1_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getVariableAssignationAccess().getSelectorSelectorWithParserRuleCall_3_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WithAttribute returns WithAttribute
	 *
	 * Constraint:
	 *     attribute=ID
	 * </pre>
	 */
	protected void sequence_WithAttribute(ISerializationContext context, WithAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.WITH_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.WITH_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWithAttributeAccess().getAttributeIDTerminalRuleCall_1_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     With returns With
	 *
	 * Constraint:
	 *     (withAttribute=WithAttribute value=Value)
	 * </pre>
	 */
	protected void sequence_With(ISerializationContext context, With semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.WITH__WITH_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.WITH__WITH_ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.WITH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.WITH__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWithAccess().getWithAttributeWithAttributeParserRuleCall_0_0(), semanticObject.getWithAttribute());
		feeder.accept(grammarAccess.getWithAccess().getValueValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns WriteAction
	 *     WriteAction returns WriteAction
	 *
	 * Constraint:
	 *     (value=STRING selector=SelectorWith)
	 * </pre>
	 */
	protected void sequence_WriteAction(ISerializationContext context, WriteAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.WRITE_ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.WRITE_ACTION__VALUE));
			if (transientValues.isValueTransient(semanticObject, SeleniumScriptPackage.Literals.WRITE_ACTION__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumScriptPackage.Literals.WRITE_ACTION__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWriteActionAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getWriteActionAccess().getSelectorSelectorWithParserRuleCall_3_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
}
