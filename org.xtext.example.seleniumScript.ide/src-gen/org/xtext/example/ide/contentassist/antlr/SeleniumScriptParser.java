/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.ide.contentassist.antlr.internal.InternalSeleniumScriptParser;
import org.xtext.example.services.SeleniumScriptGrammarAccess;

public class SeleniumScriptParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SeleniumScriptGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SeleniumScriptGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getTestAccess().getGroup(), "rule__Test__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
			builder.put(grammarAccess.getGotoActionAccess().getGroup(), "rule__GotoAction__Group__0");
			builder.put(grammarAccess.getClickActionAccess().getGroup(), "rule__ClickAction__Group__0");
			builder.put(grammarAccess.getAssertActionAccess().getGroup(), "rule__AssertAction__Group__0");
			builder.put(grammarAccess.getWriteActionAccess().getGroup(), "rule__WriteAction__Group__0");
			builder.put(grammarAccess.getSelectActionAccess().getGroup(), "rule__SelectAction__Group__0");
			builder.put(grammarAccess.getSelectActionAccess().getGroup_1(), "rule__SelectAction__Group_1__0");
			builder.put(grammarAccess.getSelectorWithAccess().getGroup(), "rule__SelectorWith__Group__0");
			builder.put(grammarAccess.getSelectorWithAccess().getGroup_1(), "rule__SelectorWith__Group_1__0");
			builder.put(grammarAccess.getWithAccess().getGroup(), "rule__With__Group__0");
			builder.put(grammarAccess.getWithAttributeAccess().getGroup(), "rule__WithAttribute__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAttributeAccess().getGroup(), "rule__AndAttribute__Group__0");
			builder.put(grammarAccess.getSelectorHasAccess().getGroup(), "rule__SelectorHas__Group__0");
			builder.put(grammarAccess.getVariableActionAccess().getGroup(), "rule__VariableAction__Group__0");
			builder.put(grammarAccess.getVariableAssignationAccess().getGroup(), "rule__VariableAssignation__Group__0");
			builder.put(grammarAccess.getModelAccess().getTestsAssignment(), "rule__Model__TestsAssignment");
			builder.put(grammarAccess.getTestAccess().getNameAssignment_1(), "rule__Test__NameAssignment_1");
			builder.put(grammarAccess.getTestAccess().getActionsAssignment_3(), "rule__Test__ActionsAssignment_3");
			builder.put(grammarAccess.getGotoActionAccess().getUrlAssignment_1(), "rule__GotoAction__UrlAssignment_1");
			builder.put(grammarAccess.getClickActionAccess().getSelectorAssignment_1(), "rule__ClickAction__SelectorAssignment_1");
			builder.put(grammarAccess.getAssertActionAccess().getSelectorAssignment_1(), "rule__AssertAction__SelectorAssignment_1");
			builder.put(grammarAccess.getWriteActionAccess().getValueAssignment_1(), "rule__WriteAction__ValueAssignment_1");
			builder.put(grammarAccess.getWriteActionAccess().getSelectorAssignment_3(), "rule__WriteAction__SelectorAssignment_3");
			builder.put(grammarAccess.getSelectActionAccess().getOptionSelectorAssignment_1_0(), "rule__SelectAction__OptionSelectorAssignment_1_0");
			builder.put(grammarAccess.getSelectActionAccess().getValueAssignment_1_1(), "rule__SelectAction__ValueAssignment_1_1");
			builder.put(grammarAccess.getSelectActionAccess().getAndAssignment_1_2(), "rule__SelectAction__AndAssignment_1_2");
			builder.put(grammarAccess.getSelectActionAccess().getSelectorAssignment_3(), "rule__SelectAction__SelectorAssignment_3");
			builder.put(grammarAccess.getSelectorWithAccess().getBase_selectorAssignment_0(), "rule__SelectorWith__Base_selectorAssignment_0");
			builder.put(grammarAccess.getSelectorWithAccess().getWAssignment_1_0(), "rule__SelectorWith__WAssignment_1_0");
			builder.put(grammarAccess.getSelectorWithAccess().getAndAssignment_1_1(), "rule__SelectorWith__AndAssignment_1_1");
			builder.put(grammarAccess.getWithAccess().getWithAttributeAssignment_0(), "rule__With__WithAttributeAssignment_0");
			builder.put(grammarAccess.getWithAccess().getValueAssignment_1(), "rule__With__ValueAssignment_1");
			builder.put(grammarAccess.getWithAttributeAccess().getAttributeAssignment_1(), "rule__WithAttribute__AttributeAssignment_1");
			builder.put(grammarAccess.getAndAccess().getAndAttributeAssignment_0(), "rule__And__AndAttributeAssignment_0");
			builder.put(grammarAccess.getAndAccess().getValueAssignment_1(), "rule__And__ValueAssignment_1");
			builder.put(grammarAccess.getAndAttributeAccess().getAttributeAssignment_1(), "rule__AndAttribute__AttributeAssignment_1");
			builder.put(grammarAccess.getSelectorHasAccess().getBase_selectorAssignment_0(), "rule__SelectorHas__Base_selectorAssignment_0");
			builder.put(grammarAccess.getSelectorHasAccess().getAttributeAssignment_2(), "rule__SelectorHas__AttributeAssignment_2");
			builder.put(grammarAccess.getSelectorHasAccess().getValueAssignment_3(), "rule__SelectorHas__ValueAssignment_3");
			builder.put(grammarAccess.getVariableActionAccess().getNameAssignment_1(), "rule__VariableAction__NameAssignment_1");
			builder.put(grammarAccess.getVariableActionAccess().getAssignationAssignment_2(), "rule__VariableAction__AssignationAssignment_2");
			builder.put(grammarAccess.getVariableAssignationAccess().getAttributeAssignment_1(), "rule__VariableAssignation__AttributeAssignment_1");
			builder.put(grammarAccess.getVariableAssignationAccess().getSelectorAssignment_3(), "rule__VariableAssignation__SelectorAssignment_3");
			builder.put(grammarAccess.getValueAccess().getValueAssignment_0(), "rule__Value__ValueAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SeleniumScriptGrammarAccess grammarAccess;

	@Override
	protected InternalSeleniumScriptParser createParser() {
		InternalSeleniumScriptParser result = new InternalSeleniumScriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SeleniumScriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeleniumScriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
