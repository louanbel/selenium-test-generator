/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.generator;

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xtext.example.seleniumScript.Action
import org.xtext.example.seleniumScript.CheckAction
import org.xtext.example.seleniumScript.ClickAction
import org.xtext.example.seleniumScript.GotoAction
import org.xtext.example.seleniumScript.Test
import org.xtext.example.seleniumScript.SelectorHas
import org.xtext.example.seleniumScript.SelectorWith
import org.xtext.example.seleniumScript.And
import org.eclipse.emf.common.util.EList
import org.xtext.example.seleniumScript.VariableAction
import org.xtext.example.seleniumScript.Value
import org.xtext.example.seleniumScript.BaseSelector
import org.xtext.example.seleniumScript.WriteAction

public class SeleniumScriptGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider
	
	private int elementCounter = 0;
	
	private def resetCounter() {
		elementCounter = 0;
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Test)) {
			fsa.generateFile("Tests/Test" + e.fullyQualifiedName.toString("/") + ".java", e.compile)
			resetCounter();
		}

		fsa.generateFile("Tests/AllTestsRunner.java", compileMainClass(resource.allContents.toIterable.filter(Test)))
	}

	
	private def compile(Test test) '''
		package com.cafonctionne.mavenproject;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.JavascriptExecutor;
		
		public class Test«test.getName()» {
		    private WebDriver driver;
		
		    public Test«test.getName()»() {
			    this.driver = new ChromeDriver();
		    }
		
		    public void runTest() {
			    try {
			    	JavascriptExecutor js = (JavascriptExecutor) driver;
			        «FOR action : test.actions»
			        	«action.compile()»
			        «ENDFOR»
			    } finally {
			        driver.quit();
			    }
		    }
		}
	'''

	private def compileMainClass(Iterable<Test> tests) '''
		package com.cafonctionne.mavenproject;

		public class AllTestsRunner {
		
		    public static void main(String[] args) {
			    «FOR test : tests»
			    System.out.println("Running test: «test.getName()»");
			    new Test«test.getName()»().runTest();
				«ENDFOR»
			
				System.out.println("All tests completed.");
			}
		}
	'''

	private def compile(Action action) '''
		«IF action instanceof ClickAction»
			«(action as ClickAction).compile()»
		«ELSEIF action instanceof CheckAction»
			«(action as CheckAction).compile()»
		«ELSEIF action instanceof GotoAction»
			«(action as GotoAction).compile()»
		«ELSEIF action instanceof VariableAction»
			«(action as VariableAction).compile()»
		«ELSEIF action instanceof WriteAction»
			«(action as WriteAction).compile()»
		«ENDIF»'''

	private def compile(WriteAction writeAction) '''
		WebElement element«elementCounter++» = driver.findElement(«writeAction.selector.compile().toString().trim()»);
		element«elementCounter-1».sendKeys("«writeAction.value.compile().toString().trim()»");
	'''
	private def compile(ClickAction action) '''
	    WebElement element«elementCounter++» = driver.findElement(
	    «IF action.selector.w != null && action.selector.w.withAttribute.attribute == "text"»
	        By.xpath("//«action.selector.base_selector.compile()»[contains(text(), '«action.selector.w.value.compile().toString().trim()»')]")
	    «ELSE»
	        «action.selector.compile().toString().trim()»
	    «ENDIF»);
	    js.executeScript("arguments[0].click();", element«elementCounter-1»);
	'''

	private def compile(CheckAction action) '''
	    WebElement element«elementCounter++» = driver.findElement(
	    «IF action.selector.getAttribute == "text"»
	        By.xpath("//«action.selector.base_selector.compile()»[contains(text(), '«action.selector.value.compile().toString().trim()»')]")
	    «ELSE»
	        «action.selector.compile().toString().trim()»
	    «ENDIF»);
	    element«elementCounter-1».isDisplayed();
	'''

	private def compile(GotoAction action) '''
		driver.get("«action.getUrl()»");
	'''
	
	private def compile(BaseSelector baseSelector)'''
		«IF baseSelector.getName() == "body"»div«ELSE»«baseSelector.getName()»«ENDIF»'''
	
	private def compile(SelectorWith selector) '''
		By.xpath("(//«IF selector.w !== null && selector.w.withAttribute.attribute == "label"»
		    input[@id=//label[contains(text(), '«selector.w.value.compile().toString().trim()»')]/@for]
	    «ELSEIF selector.w !== null && selector.w.withAttribute.attribute == "text"»
			«selector.base_selector.compile()»[contains(text(), '«selector.w.value.compile().toString().trim()»')]
	    «ELSEIF selector.w !== null»
			«selector.base_selector.compile()»[@«selector.w.withAttribute.attribute»=\"«selector.w.value.compile().toString().trim()»\"]
	    «ELSE»
	        «selector.base_selector.compile()»
	    «ENDIF»)
		«IF selector.isLast()»[last()]«ELSEIF selector.isFirst()»[0]«ENDIF»")«selector.and.compile()»'''
	
	private def compile(EList<And> lAnd) '''«FOR and: lAnd»[«and.andAttribute.attribute»=\"_«and.value.compile().toString().trim()»\"]«ENDFOR»'''
	
	private def compile(Value value) '''
	    «IF value.valueString != null»
	        «value.valueString»
	    «ELSEIF value.valueVariable != null»
	        " + _«value.valueVariable.getName()» + "
	    «ENDIF»'''
	
	private def compile(VariableAction action) '''
		WebElement _«action.getName()» = driver.findElement(«action.assignation.selector.compile().toString().trim()»);
		_«action.getName()» = «IF action.getAssignation().getAttribute() == "text"» _«action.getName()».getText(); «ELSE» _«action.name».getAttribute(«action.assignation.attribute»); «ENDIF»
	'''

	
	private def compile(SelectorHas selector) '''«selector.base_selector.compile()»[«selector.attribute»=\"«selector.value»\"]'''
}
