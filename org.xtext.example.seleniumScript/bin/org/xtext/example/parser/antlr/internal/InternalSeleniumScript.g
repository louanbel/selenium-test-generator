/*
 * generated by Xtext 2.36.0
 */
grammar InternalSeleniumScript;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.SeleniumScriptGrammarAccess;

}

@parser::members {

 	private SeleniumScriptGrammarAccess grammarAccess;

    public InternalSeleniumScriptParser(TokenStream input, SeleniumScriptGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SeleniumScriptGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0());
			}
			lv_tests_0_0=ruleTest
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"tests",
					lv_tests_0_0,
					"org.xtext.example.SeleniumScript.Test");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleTest
entryRuleTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestRule()); }
	iv_ruleTest=ruleTest
	{ $current=$iv_ruleTest.current; }
	EOF;

// Rule Test
ruleTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='test'
		{
			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getActionsActionParserRuleCall_3_0());
				}
				lv_actions_3_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					add(
						$current,
						"actions",
						lv_actions_3_0,
						"org.xtext.example.SeleniumScript.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getGotoActionParserRuleCall_0());
		}
		this_GotoAction_0=ruleGotoAction
		{
			$current = $this_GotoAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getClickActionParserRuleCall_1());
		}
		this_ClickAction_1=ruleClickAction
		{
			$current = $this_ClickAction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getCheckActionParserRuleCall_2());
		}
		this_CheckAction_2=ruleCheckAction
		{
			$current = $this_CheckAction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getWriteActionParserRuleCall_3());
		}
		this_WriteAction_3=ruleWriteAction
		{
			$current = $this_WriteAction_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getActionAccess().getActionAction_4_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getActionAccess().getUncheckAllActionParserRuleCall_4_1());
			}
			ruleUncheckAllAction
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSelectActionParserRuleCall_5());
		}
		this_SelectAction_6=ruleSelectAction
		{
			$current = $this_SelectAction_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getVariableActionParserRuleCall_6());
		}
		this_VariableAction_7=ruleVariableAction
		{
			$current = $this_VariableAction_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGotoAction
entryRuleGotoAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGotoActionRule()); }
	iv_ruleGotoAction=ruleGotoAction
	{ $current=$iv_ruleGotoAction.current; }
	EOF;

// Rule GotoAction
ruleGotoAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='goto'
		{
			newLeafNode(otherlv_0, grammarAccess.getGotoActionAccess().getGotoKeyword_0());
		}
		(
			(
				lv_url_1_0=RULE_URL
				{
					newLeafNode(lv_url_1_0, grammarAccess.getGotoActionAccess().getUrlURLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGotoActionRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_1_0,
						"org.xtext.example.SeleniumScript.URL");
				}
			)
		)
	)
;

// Entry rule entryRuleClickAction
entryRuleClickAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClickActionRule()); }
	iv_ruleClickAction=ruleClickAction
	{ $current=$iv_ruleClickAction.current; }
	EOF;

// Rule ClickAction
ruleClickAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='click'
		{
			newLeafNode(otherlv_0, grammarAccess.getClickActionAccess().getClickKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClickActionAccess().getSelectorSelectorWithParserRuleCall_1_0());
				}
				lv_selector_1_0=ruleSelectorWith
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClickActionRule());
					}
					set(
						$current,
						"selector",
						lv_selector_1_0,
						"org.xtext.example.SeleniumScript.SelectorWith");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCheckAction
entryRuleCheckAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckActionRule()); }
	iv_ruleCheckAction=ruleCheckAction
	{ $current=$iv_ruleCheckAction.current; }
	EOF;

// Rule CheckAction
ruleCheckAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='assert'
		{
			newLeafNode(otherlv_0, grammarAccess.getCheckActionAccess().getAssertKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCheckActionAccess().getSelectorSelectorHasParserRuleCall_1_0());
				}
				lv_selector_1_0=ruleSelectorHas
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCheckActionRule());
					}
					set(
						$current,
						"selector",
						lv_selector_1_0,
						"org.xtext.example.SeleniumScript.SelectorHas");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWriteAction
entryRuleWriteAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWriteActionRule()); }
	iv_ruleWriteAction=ruleWriteAction
	{ $current=$iv_ruleWriteAction.current; }
	EOF;

// Rule WriteAction
ruleWriteAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='write'
		{
			newLeafNode(otherlv_0, grammarAccess.getWriteActionAccess().getWriteKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getWriteActionAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWriteActionRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getWriteActionAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWriteActionAccess().getSelectorSelectorWithParserRuleCall_3_0());
				}
				lv_selector_3_0=ruleSelectorWith
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWriteActionRule());
					}
					set(
						$current,
						"selector",
						lv_selector_3_0,
						"org.xtext.example.SeleniumScript.SelectorWith");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUncheckAllAction
entryRuleUncheckAllAction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUncheckAllActionRule()); }
	iv_ruleUncheckAllAction=ruleUncheckAllAction
	{ $current=$iv_ruleUncheckAllAction.current.getText(); }
	EOF;

// Rule UncheckAllAction
ruleUncheckAllAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='uncheck_all'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getUncheckAllActionAccess().getUncheck_allKeyword());
	}
;

// Entry rule entryRuleSelectAction
entryRuleSelectAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectActionRule()); }
	iv_ruleSelectAction=ruleSelectAction
	{ $current=$iv_ruleSelectAction.current; }
	EOF;

// Rule SelectAction
ruleSelectAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='select'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectActionAccess().getSelectKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectActionAccess().getOptionSelectorWithAttributeParserRuleCall_1_0_0());
					}
					lv_optionSelector_1_0=ruleWithAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectActionRule());
						}
						set(
							$current,
							"optionSelector",
							lv_optionSelector_1_0 != null,
							"org.xtext.example.SeleniumScript.WithAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_value_2_0=RULE_STRING
					{
						newLeafNode(lv_value_2_0, grammarAccess.getSelectActionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelectActionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectActionAccess().getAndAndParserRuleCall_1_2_0());
					}
					lv_and_3_0=ruleAnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectActionRule());
						}
						add(
							$current,
							"and",
							lv_and_3_0,
							"org.xtext.example.SeleniumScript.And");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_4='from'
		{
			newLeafNode(otherlv_4, grammarAccess.getSelectActionAccess().getFromKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectActionAccess().getSelectorSelectorWithParserRuleCall_3_0());
				}
				lv_selector_5_0=ruleSelectorWith
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectActionRule());
					}
					set(
						$current,
						"selector",
						lv_selector_5_0,
						"org.xtext.example.SeleniumScript.SelectorWith");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSelectorWith
entryRuleSelectorWith returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectorWithRule()); }
	iv_ruleSelectorWith=ruleSelectorWith
	{ $current=$iv_ruleSelectorWith.current; }
	EOF;

// Rule SelectorWith
ruleSelectorWith returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_first_0_0='first'
				{
					newLeafNode(lv_first_0_0, grammarAccess.getSelectorWithAccess().getFirstFirstKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorWithRule());
					}
					setWithLastConsumed($current, "first", lv_first_0_0 != null, "first");
				}
			)
		)?
		(
			(
				lv_last_1_0='last'
				{
					newLeafNode(lv_last_1_0, grammarAccess.getSelectorWithAccess().getLastLastKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorWithRule());
					}
					setWithLastConsumed($current, "last", lv_last_1_0 != null, "last");
				}
			)
		)?
		(
			(
				lv_base_selector_2_0=RULE_STRING
				{
					newLeafNode(lv_base_selector_2_0, grammarAccess.getSelectorWithAccess().getBase_selectorSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorWithRule());
					}
					setWithLastConsumed(
						$current,
						"base_selector",
						lv_base_selector_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectorWithAccess().getWWithParserRuleCall_3_0_0());
					}
					lv_w_3_0=ruleWith
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectorWithRule());
						}
						set(
							$current,
							"w",
							lv_w_3_0,
							"org.xtext.example.SeleniumScript.With");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectorWithAccess().getAndAndParserRuleCall_3_1_0());
					}
					lv_and_4_0=ruleAnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectorWithRule());
						}
						add(
							$current,
							"and",
							lv_and_4_0,
							"org.xtext.example.SeleniumScript.And");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleWith
entryRuleWith returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithRule()); }
	iv_ruleWith=ruleWith
	{ $current=$iv_ruleWith.current; }
	EOF;

// Rule With
ruleWith returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWithAccess().getWithAttributeWithAttributeParserRuleCall_0_0());
				}
				lv_withAttribute_0_0=ruleWithAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithRule());
					}
					set(
						$current,
						"withAttribute",
						lv_withAttribute_0_0,
						"org.xtext.example.SeleniumScript.WithAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getWithAccess().getValueValueParserRuleCall_1_0());
				}
				lv_value_1_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWithRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.xtext.example.SeleniumScript.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWithAttribute
entryRuleWithAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithAttributeRule()); }
	iv_ruleWithAttribute=ruleWithAttribute
	{ $current=$iv_ruleWithAttribute.current; }
	EOF;

// Rule WithAttribute
ruleWithAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getWithAttributeAccess().getWithKeyword_0());
		}
		(
			(
				lv_attribute_1_0=RULE_ID
				{
					newLeafNode(lv_attribute_1_0, grammarAccess.getWithAttributeAccess().getAttributeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWithAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"attribute",
						lv_attribute_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	iv_ruleAnd=ruleAnd
	{ $current=$iv_ruleAnd.current; }
	EOF;

// Rule And
ruleAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAndAccess().getAndAttributeAndAttributeParserRuleCall_0_0());
				}
				lv_andAttribute_0_0=ruleAndAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAndRule());
					}
					set(
						$current,
						"andAttribute",
						lv_andAttribute_0_0,
						"org.xtext.example.SeleniumScript.AndAttribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAndAccess().getValueValueParserRuleCall_1_0());
				}
				lv_value_1_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAndRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.xtext.example.SeleniumScript.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAndAttribute
entryRuleAndAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndAttributeRule()); }
	iv_ruleAndAttribute=ruleAndAttribute
	{ $current=$iv_ruleAndAttribute.current; }
	EOF;

// Rule AndAttribute
ruleAndAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='and'
		{
			newLeafNode(otherlv_0, grammarAccess.getAndAttributeAccess().getAndKeyword_0());
		}
		(
			(
				lv_attribute_1_0=RULE_ID
				{
					newLeafNode(lv_attribute_1_0, grammarAccess.getAndAttributeAccess().getAttributeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAndAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"attribute",
						lv_attribute_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSelectorHas
entryRuleSelectorHas returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectorHasRule()); }
	iv_ruleSelectorHas=ruleSelectorHas
	{ $current=$iv_ruleSelectorHas.current; }
	EOF;

// Rule SelectorHas
ruleSelectorHas returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_base_selector_0_0=RULE_STRING
				{
					newLeafNode(lv_base_selector_0_0, grammarAccess.getSelectorHasAccess().getBase_selectorSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorHasRule());
					}
					setWithLastConsumed(
						$current,
						"base_selector",
						lv_base_selector_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1='has'
		{
			newLeafNode(otherlv_1, grammarAccess.getSelectorHasAccess().getHasKeyword_1());
		}
		(
			(
				lv_attribute_2_0=RULE_ID
				{
					newLeafNode(lv_attribute_2_0, grammarAccess.getSelectorHasAccess().getAttributeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorHasRule());
					}
					setWithLastConsumed(
						$current,
						"attribute",
						lv_attribute_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectorHasAccess().getValueValueParserRuleCall_3_0());
				}
				lv_value_3_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectorHasRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"org.xtext.example.SeleniumScript.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariableAction
entryRuleVariableAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableActionRule()); }
	iv_ruleVariableAction=ruleVariableAction
	{ $current=$iv_ruleVariableAction.current; }
	EOF;

// Rule VariableAction
ruleVariableAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='let'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableActionAccess().getLetKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableActionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableActionAccess().getAssignationVariableAssignationParserRuleCall_2_0());
				}
				lv_assignation_2_0=ruleVariableAssignation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableActionRule());
					}
					set(
						$current,
						"assignation",
						lv_assignation_2_0,
						"org.xtext.example.SeleniumScript.VariableAssignation");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariableAssignation
entryRuleVariableAssignation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableAssignationRule()); }
	iv_ruleVariableAssignation=ruleVariableAssignation
	{ $current=$iv_ruleVariableAssignation.current; }
	EOF;

// Rule VariableAssignation
ruleVariableAssignation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='as'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableAssignationAccess().getAsKeyword_0());
		}
		(
			(
				lv_attribute_1_0=RULE_ID
				{
					newLeafNode(lv_attribute_1_0, grammarAccess.getVariableAssignationAccess().getAttributeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableAssignationRule());
					}
					setWithLastConsumed(
						$current,
						"attribute",
						lv_attribute_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableAssignationAccess().getFromKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAssignationAccess().getSelectorSelectorWithParserRuleCall_3_0());
				}
				lv_selector_3_0=ruleSelectorWith
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableAssignationRule());
					}
					set(
						$current,
						"selector",
						lv_selector_3_0,
						"org.xtext.example.SeleniumScript.SelectorWith");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_valueString_0_0=RULE_STRING
				{
					newLeafNode(lv_valueString_0_0, grammarAccess.getValueAccess().getValueStringSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
					setWithLastConsumed(
						$current,
						"valueString",
						lv_valueString_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		    |
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getValueAccess().getValueVariableVariableActionCrossReference_1_0());
				}
			)
		)
	)
;

RULE_URL : 'http' 's'? '://' 'www.'? ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'.')+ ('/' ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'_'|'.'|'~'|'?'|'&'|'='|'%')*)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
