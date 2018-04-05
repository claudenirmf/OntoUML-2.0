/*
 * generated by Xtext 2.13.0
 */
package it.unibz.inf.ontouml.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class OntoUMLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cElementsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cElementsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cElementsModelElementParserRuleCall_3_2_0 = (RuleCall)cElementsAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cElementsAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cElementsModelElementParserRuleCall_3_3_1_0 = (RuleCall)cElementsAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Model:
		//	{Model}
		//	'Model'
		//	'{' ('elements' '{' elements+=ModelElement ("," elements+=ModelElement)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} 'Model' '{' ('elements' '{' elements+=ModelElement ("," elements+=ModelElement)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//'Model'
		public Keyword getModelKeyword_1() { return cModelKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('elements' '{' elements+=ModelElement ("," elements+=ModelElement)* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'elements'
		public Keyword getElementsKeyword_3_0() { return cElementsKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//elements+=ModelElement
		public Assignment getElementsAssignment_3_2() { return cElementsAssignment_3_2; }
		
		//ModelElement
		public RuleCall getElementsModelElementParserRuleCall_3_2_0() { return cElementsModelElementParserRuleCall_3_2_0; }
		
		//("," elements+=ModelElement)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//elements+=ModelElement
		public Assignment getElementsAssignment_3_3_1() { return cElementsAssignment_3_3_1; }
		
		//ModelElement
		public RuleCall getElementsModelElementParserRuleCall_3_3_1_0() { return cElementsModelElementParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ModelElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cModelElement_ImplParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOntoUMLClassParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ModelElement:
		//	ModelElement_Impl | OntoUMLClass;
		@Override public ParserRule getRule() { return rule; }
		
		//ModelElement_Impl | OntoUMLClass
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ModelElement_Impl
		public RuleCall getModelElement_ImplParserRuleCall_0() { return cModelElement_ImplParserRuleCall_0; }
		
		//OntoUMLClass
		public RuleCall getOntoUMLClassParserRuleCall_1() { return cOntoUMLClassParserRuleCall_1; }
	}
	public class ModelElement_ImplElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.ModelElement_Impl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModelElementKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ModelElement_Impl ModelElement:
		//	{ModelElement}
		//	'ModelElement';
		@Override public ParserRule getRule() { return rule; }
		
		//{ModelElement} 'ModelElement'
		public Group getGroup() { return cGroup; }
		
		//{ModelElement}
		public Action getModelElementAction_0() { return cModelElementAction_0; }
		
		//'ModelElement'
		public Keyword getModelElementKeyword_1() { return cModelElementKeyword_1; }
	}
	public class OntoUMLClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.OntoUMLClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOntoUMLClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOntoUMLClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//OntoUMLClass:
		//	{OntoUMLClass}
		//	'OntoUMLClass'
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{OntoUMLClass} 'OntoUMLClass' name=EString
		public Group getGroup() { return cGroup; }
		
		//{OntoUMLClass}
		public Action getOntoUMLClassAction_0() { return cOntoUMLClassAction_0; }
		
		//'OntoUMLClass'
		public Keyword getOntoUMLClassKeyword_1() { return cOntoUMLClassKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.xtext.OntoUML.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final ModelElements pModel;
	private final ModelElementElements pModelElement;
	private final ModelElement_ImplElements pModelElement_Impl;
	private final OntoUMLClassElements pOntoUMLClass;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OntoUMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pModelElement = new ModelElementElements();
		this.pModelElement_Impl = new ModelElement_ImplElements();
		this.pOntoUMLClass = new OntoUMLClassElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("it.unibz.inf.ontouml.xtext.OntoUML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	{Model}
	//	'Model'
	//	'{' ('elements' '{' elements+=ModelElement ("," elements+=ModelElement)* '}')?
	//	'}';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ModelElement:
	//	ModelElement_Impl | OntoUMLClass;
	public ModelElementElements getModelElementAccess() {
		return pModelElement;
	}
	
	public ParserRule getModelElementRule() {
		return getModelElementAccess().getRule();
	}
	
	//ModelElement_Impl ModelElement:
	//	{ModelElement}
	//	'ModelElement';
	public ModelElement_ImplElements getModelElement_ImplAccess() {
		return pModelElement_Impl;
	}
	
	public ParserRule getModelElement_ImplRule() {
		return getModelElement_ImplAccess().getRule();
	}
	
	//OntoUMLClass:
	//	{OntoUMLClass}
	//	'OntoUMLClass'
	//	name=EString;
	public OntoUMLClassElements getOntoUMLClassAccess() {
		return pOntoUMLClass;
	}
	
	public ParserRule getOntoUMLClassRule() {
		return getOntoUMLClassAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
