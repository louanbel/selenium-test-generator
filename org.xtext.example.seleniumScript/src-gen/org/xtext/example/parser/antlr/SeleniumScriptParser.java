/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.parser.antlr.internal.InternalSeleniumScriptParser;
import org.xtext.example.services.SeleniumScriptGrammarAccess;

public class SeleniumScriptParser extends AbstractAntlrParser {

	@Inject
	private SeleniumScriptGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSeleniumScriptParser createParser(XtextTokenStream stream) {
		return new InternalSeleniumScriptParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SeleniumScriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeleniumScriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
