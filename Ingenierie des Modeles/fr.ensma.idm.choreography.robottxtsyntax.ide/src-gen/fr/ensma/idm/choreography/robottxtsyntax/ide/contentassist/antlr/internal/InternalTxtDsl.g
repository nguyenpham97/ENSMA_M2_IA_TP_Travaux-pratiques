/*
 * generated by Xtext 2.23.0
 */
grammar InternalTxtDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.ensma.idm.choreography.robottxtsyntax.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.ensma.idm.choreography.robottxtsyntax.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.ensma.idm.choreography.robottxtsyntax.services.TxtDslGrammarAccess;

}
@parser::members {
	private TxtDslGrammarAccess grammarAccess;

	public void setGrammarAccess(TxtDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleChoreography
entryRuleChoreography
:
{ before(grammarAccess.getChoreographyRule()); }
	 ruleChoreography
{ after(grammarAccess.getChoreographyRule()); } 
	 EOF 
;

// Rule Choreography
ruleChoreography 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChoreographyAccess().getGroup()); }
		(rule__Choreography__Group__0)
		{ after(grammarAccess.getChoreographyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstruction
entryRuleInstruction
:
{ before(grammarAccess.getInstructionRule()); }
	 ruleInstruction
{ after(grammarAccess.getInstructionRule()); } 
	 EOF 
;

// Rule Instruction
ruleInstruction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstructionAccess().getAlternatives()); }
		(rule__Instruction__Alternatives)
		{ after(grammarAccess.getInstructionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePenDown
entryRulePenDown
:
{ before(grammarAccess.getPenDownRule()); }
	 rulePenDown
{ after(grammarAccess.getPenDownRule()); } 
	 EOF 
;

// Rule PenDown
rulePenDown 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPenDownAccess().getGroup()); }
		(rule__PenDown__Group__0)
		{ after(grammarAccess.getPenDownAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePenUp
entryRulePenUp
:
{ before(grammarAccess.getPenUpRule()); }
	 rulePenUp
{ after(grammarAccess.getPenUpRule()); } 
	 EOF 
;

// Rule PenUp
rulePenUp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPenUpAccess().getGroup()); }
		(rule__PenUp__Group__0)
		{ after(grammarAccess.getPenUpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGrab
entryRuleGrab
:
{ before(grammarAccess.getGrabRule()); }
	 ruleGrab
{ after(grammarAccess.getGrabRule()); } 
	 EOF 
;

// Rule Grab
ruleGrab 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGrabAccess().getGroup()); }
		(rule__Grab__Group__0)
		{ after(grammarAccess.getGrabAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelease
entryRuleRelease
:
{ before(grammarAccess.getReleaseRule()); }
	 ruleRelease
{ after(grammarAccess.getReleaseRule()); } 
	 EOF 
;

// Rule Release
ruleRelease 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReleaseAccess().getGroup()); }
		(rule__Release__Group__0)
		{ after(grammarAccess.getReleaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTurnLeft
entryRuleTurnLeft
:
{ before(grammarAccess.getTurnLeftRule()); }
	 ruleTurnLeft
{ after(grammarAccess.getTurnLeftRule()); } 
	 EOF 
;

// Rule TurnLeft
ruleTurnLeft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTurnLeftAccess().getGroup()); }
		(rule__TurnLeft__Group__0)
		{ after(grammarAccess.getTurnLeftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTurnRight
entryRuleTurnRight
:
{ before(grammarAccess.getTurnRightRule()); }
	 ruleTurnRight
{ after(grammarAccess.getTurnRightRule()); } 
	 EOF 
;

// Rule TurnRight
ruleTurnRight 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTurnRightAccess().getGroup()); }
		(rule__TurnRight__Group__0)
		{ after(grammarAccess.getTurnRightAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGoForward
entryRuleGoForward
:
{ before(grammarAccess.getGoForwardRule()); }
	 ruleGoForward
{ after(grammarAccess.getGoForwardRule()); } 
	 EOF 
;

// Rule GoForward
ruleGoForward 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGoForwardAccess().getGroup()); }
		(rule__GoForward__Group__0)
		{ after(grammarAccess.getGoForwardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGoBackward
entryRuleGoBackward
:
{ before(grammarAccess.getGoBackwardRule()); }
	 ruleGoBackward
{ after(grammarAccess.getGoBackwardRule()); } 
	 EOF 
;

// Rule GoBackward
ruleGoBackward 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGoBackwardAccess().getGroup()); }
		(rule__GoBackward__Group__0)
		{ after(grammarAccess.getGoBackwardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0()); }
		ruleChoreography
		{ after(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_1()); }
		rulePenDown
		{ after(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_2()); }
		rulePenUp
		{ after(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGrabParserRuleCall_3()); }
		ruleGrab
		{ after(grammarAccess.getInstructionAccess().getGrabParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_4()); }
		ruleRelease
		{ after(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getTurnLeftParserRuleCall_5()); }
		ruleTurnLeft
		{ after(grammarAccess.getInstructionAccess().getTurnLeftParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getTurnRightParserRuleCall_6()); }
		ruleTurnRight
		{ after(grammarAccess.getInstructionAccess().getTurnRightParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_7()); }
		ruleGoForward
		{ after(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGoBackwardParserRuleCall_8()); }
		ruleGoBackward
		{ after(grammarAccess.getInstructionAccess().getGoBackwardParserRuleCall_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__0__Impl
	rule__Choreography__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); }
	()
	{ after(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__1__Impl
	rule__Choreography__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); }
	'Choreography'
	{ after(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__2__Impl
	rule__Choreography__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getNameAssignment_2()); }
	(rule__Choreography__NameAssignment_2)
	{ after(grammarAccess.getChoreographyAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__3__Impl
	rule__Choreography__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__4__Impl
	rule__Choreography__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getGroup_4()); }
	(rule__Choreography__Group_4__0)?
	{ after(grammarAccess.getChoreographyAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choreography__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__0__Impl
	rule__Choreography__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0()); }
	'instructions'
	{ after(grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__1__Impl
	rule__Choreography__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__2__Impl
	rule__Choreography__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_2()); }
	(rule__Choreography__InstructionsAssignment_4_2)
	{ after(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__3__Impl
	rule__Choreography__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getGroup_4_3()); }
	(rule__Choreography__Group_4_3__0)*
	{ after(grammarAccess.getChoreographyAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choreography__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4_3__0__Impl
	rule__Choreography__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choreography__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_3_1()); }
	(rule__Choreography__InstructionsAssignment_4_3_1)
	{ after(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PenDown__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PenDown__Group__0__Impl
	rule__PenDown__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PenDown__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPenDownAccess().getPenDownAction_0()); }
	()
	{ after(grammarAccess.getPenDownAccess().getPenDownAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PenDown__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PenDown__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PenDown__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPenDownAccess().getPenDownKeyword_1()); }
	'PenDown'
	{ after(grammarAccess.getPenDownAccess().getPenDownKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PenUp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PenUp__Group__0__Impl
	rule__PenUp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PenUp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPenUpAccess().getPenUpAction_0()); }
	()
	{ after(grammarAccess.getPenUpAccess().getPenUpAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PenUp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PenUp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PenUp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPenUpAccess().getPenUpKeyword_1()); }
	'PenUp'
	{ after(grammarAccess.getPenUpAccess().getPenUpKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grab__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grab__Group__0__Impl
	rule__Grab__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grab__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrabAccess().getGrabAction_0()); }
	()
	{ after(grammarAccess.getGrabAccess().getGrabAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grab__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grab__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grab__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrabAccess().getGrabKeyword_1()); }
	'Grab'
	{ after(grammarAccess.getGrabAccess().getGrabKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Release__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Release__Group__0__Impl
	rule__Release__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Release__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReleaseAccess().getReleaseAction_0()); }
	()
	{ after(grammarAccess.getReleaseAccess().getReleaseAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Release__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Release__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Release__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); }
	'Release'
	{ after(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TurnLeft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__0__Impl
	rule__TurnLeft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); }
	'TurnLeft'
	{ after(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__1__Impl
	rule__TurnLeft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTurnLeftAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__2__Impl
	rule__TurnLeft__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getAngleKeyword_2()); }
	'angle'
	{ after(grammarAccess.getTurnLeftAccess().getAngleKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__3__Impl
	rule__TurnLeft__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getAngleAssignment_3()); }
	(rule__TurnLeft__AngleAssignment_3)
	{ after(grammarAccess.getTurnLeftAccess().getAngleAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnLeft__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnLeftAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTurnLeftAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TurnRight__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__0__Impl
	rule__TurnRight__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); }
	'TurnRight'
	{ after(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__1__Impl
	rule__TurnRight__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTurnRightAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__2__Impl
	rule__TurnRight__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getAngleKeyword_2()); }
	'angle'
	{ after(grammarAccess.getTurnRightAccess().getAngleKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__3__Impl
	rule__TurnRight__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getAngleAssignment_3()); }
	(rule__TurnRight__AngleAssignment_3)
	{ after(grammarAccess.getTurnRightAccess().getAngleAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnRight__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnRightAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTurnRightAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GoForward__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__0__Impl
	rule__GoForward__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getGoForwardKeyword_0()); }
	'GoForward'
	{ after(grammarAccess.getGoForwardAccess().getGoForwardKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__1__Impl
	rule__GoForward__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__2__Impl
	rule__GoForward__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getDistanceKeyword_2()); }
	'distance'
	{ after(grammarAccess.getGoForwardAccess().getDistanceKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__3__Impl
	rule__GoForward__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getDistanceAssignment_3()); }
	(rule__GoForward__DistanceAssignment_3)
	{ after(grammarAccess.getGoForwardAccess().getDistanceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoForward__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GoBackward__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoBackward__Group__0__Impl
	rule__GoBackward__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_0()); }
	'GoBackward'
	{ after(grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoBackward__Group__1__Impl
	rule__GoBackward__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoBackwardAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getGoBackwardAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoBackward__Group__2__Impl
	rule__GoBackward__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoBackwardAccess().getDistanceKeyword_2()); }
	'distance'
	{ after(grammarAccess.getGoBackwardAccess().getDistanceKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoBackward__Group__3__Impl
	rule__GoBackward__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoBackwardAccess().getDistanceAssignment_3()); }
	(rule__GoBackward__DistanceAssignment_3)
	{ after(grammarAccess.getGoBackwardAccess().getDistanceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoBackward__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoBackwardAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getGoBackwardAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choreography__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__InstructionsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0()); }
		ruleInstruction
		{ after(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choreography__InstructionsAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0()); }
		ruleInstruction
		{ after(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnLeft__AngleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnLeftAccess().getAngleEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getTurnLeftAccess().getAngleEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnRight__AngleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnRightAccess().getAngleEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getTurnRightAccess().getAngleEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoForward__DistanceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoForwardAccess().getDistanceEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getGoForwardAccess().getDistanceEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoBackward__DistanceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoBackwardAccess().getDistanceEIntParserRuleCall_3_0()); }
		ruleEInt
		{ after(grammarAccess.getGoBackwardAccess().getDistanceEIntParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
