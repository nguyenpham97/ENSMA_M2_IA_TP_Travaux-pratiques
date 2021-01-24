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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTxtDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Choreography'", "'{'", "'}'", "'instructions'", "','", "'PenDown'", "'PenUp'", "'Grab'", "'Release'", "'TurnLeft'", "'angle'", "'TurnRight'", "'GoForward'", "'distance'", "'GoBackward'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTxtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTxtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTxtDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTxtDsl.g"; }


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



    // $ANTLR start "entryRuleChoreography"
    // InternalTxtDsl.g:53:1: entryRuleChoreography : ruleChoreography EOF ;
    public final void entryRuleChoreography() throws RecognitionException {
        try {
            // InternalTxtDsl.g:54:1: ( ruleChoreography EOF )
            // InternalTxtDsl.g:55:1: ruleChoreography EOF
            {
             before(grammarAccess.getChoreographyRule()); 
            pushFollow(FOLLOW_1);
            ruleChoreography();

            state._fsp--;

             after(grammarAccess.getChoreographyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // InternalTxtDsl.g:62:1: ruleChoreography : ( ( rule__Choreography__Group__0 ) ) ;
    public final void ruleChoreography() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:66:2: ( ( ( rule__Choreography__Group__0 ) ) )
            // InternalTxtDsl.g:67:2: ( ( rule__Choreography__Group__0 ) )
            {
            // InternalTxtDsl.g:67:2: ( ( rule__Choreography__Group__0 ) )
            // InternalTxtDsl.g:68:3: ( rule__Choreography__Group__0 )
            {
             before(grammarAccess.getChoreographyAccess().getGroup()); 
            // InternalTxtDsl.g:69:3: ( rule__Choreography__Group__0 )
            // InternalTxtDsl.g:69:4: rule__Choreography__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleInstruction"
    // InternalTxtDsl.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalTxtDsl.g:79:1: ( ruleInstruction EOF )
            // InternalTxtDsl.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalTxtDsl.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalTxtDsl.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalTxtDsl.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalTxtDsl.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalTxtDsl.g:94:3: ( rule__Instruction__Alternatives )
            // InternalTxtDsl.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleEString"
    // InternalTxtDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTxtDsl.g:104:1: ( ruleEString EOF )
            // InternalTxtDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTxtDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTxtDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTxtDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalTxtDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTxtDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalTxtDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePenDown"
    // InternalTxtDsl.g:128:1: entryRulePenDown : rulePenDown EOF ;
    public final void entryRulePenDown() throws RecognitionException {
        try {
            // InternalTxtDsl.g:129:1: ( rulePenDown EOF )
            // InternalTxtDsl.g:130:1: rulePenDown EOF
            {
             before(grammarAccess.getPenDownRule()); 
            pushFollow(FOLLOW_1);
            rulePenDown();

            state._fsp--;

             after(grammarAccess.getPenDownRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePenDown"


    // $ANTLR start "rulePenDown"
    // InternalTxtDsl.g:137:1: rulePenDown : ( ( rule__PenDown__Group__0 ) ) ;
    public final void rulePenDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:141:2: ( ( ( rule__PenDown__Group__0 ) ) )
            // InternalTxtDsl.g:142:2: ( ( rule__PenDown__Group__0 ) )
            {
            // InternalTxtDsl.g:142:2: ( ( rule__PenDown__Group__0 ) )
            // InternalTxtDsl.g:143:3: ( rule__PenDown__Group__0 )
            {
             before(grammarAccess.getPenDownAccess().getGroup()); 
            // InternalTxtDsl.g:144:3: ( rule__PenDown__Group__0 )
            // InternalTxtDsl.g:144:4: rule__PenDown__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PenDown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPenDownAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePenDown"


    // $ANTLR start "entryRulePenUp"
    // InternalTxtDsl.g:153:1: entryRulePenUp : rulePenUp EOF ;
    public final void entryRulePenUp() throws RecognitionException {
        try {
            // InternalTxtDsl.g:154:1: ( rulePenUp EOF )
            // InternalTxtDsl.g:155:1: rulePenUp EOF
            {
             before(grammarAccess.getPenUpRule()); 
            pushFollow(FOLLOW_1);
            rulePenUp();

            state._fsp--;

             after(grammarAccess.getPenUpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePenUp"


    // $ANTLR start "rulePenUp"
    // InternalTxtDsl.g:162:1: rulePenUp : ( ( rule__PenUp__Group__0 ) ) ;
    public final void rulePenUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:166:2: ( ( ( rule__PenUp__Group__0 ) ) )
            // InternalTxtDsl.g:167:2: ( ( rule__PenUp__Group__0 ) )
            {
            // InternalTxtDsl.g:167:2: ( ( rule__PenUp__Group__0 ) )
            // InternalTxtDsl.g:168:3: ( rule__PenUp__Group__0 )
            {
             before(grammarAccess.getPenUpAccess().getGroup()); 
            // InternalTxtDsl.g:169:3: ( rule__PenUp__Group__0 )
            // InternalTxtDsl.g:169:4: rule__PenUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PenUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPenUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePenUp"


    // $ANTLR start "entryRuleGrab"
    // InternalTxtDsl.g:178:1: entryRuleGrab : ruleGrab EOF ;
    public final void entryRuleGrab() throws RecognitionException {
        try {
            // InternalTxtDsl.g:179:1: ( ruleGrab EOF )
            // InternalTxtDsl.g:180:1: ruleGrab EOF
            {
             before(grammarAccess.getGrabRule()); 
            pushFollow(FOLLOW_1);
            ruleGrab();

            state._fsp--;

             after(grammarAccess.getGrabRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrab"


    // $ANTLR start "ruleGrab"
    // InternalTxtDsl.g:187:1: ruleGrab : ( ( rule__Grab__Group__0 ) ) ;
    public final void ruleGrab() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:191:2: ( ( ( rule__Grab__Group__0 ) ) )
            // InternalTxtDsl.g:192:2: ( ( rule__Grab__Group__0 ) )
            {
            // InternalTxtDsl.g:192:2: ( ( rule__Grab__Group__0 ) )
            // InternalTxtDsl.g:193:3: ( rule__Grab__Group__0 )
            {
             before(grammarAccess.getGrabAccess().getGroup()); 
            // InternalTxtDsl.g:194:3: ( rule__Grab__Group__0 )
            // InternalTxtDsl.g:194:4: rule__Grab__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grab__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrabAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrab"


    // $ANTLR start "entryRuleRelease"
    // InternalTxtDsl.g:203:1: entryRuleRelease : ruleRelease EOF ;
    public final void entryRuleRelease() throws RecognitionException {
        try {
            // InternalTxtDsl.g:204:1: ( ruleRelease EOF )
            // InternalTxtDsl.g:205:1: ruleRelease EOF
            {
             before(grammarAccess.getReleaseRule()); 
            pushFollow(FOLLOW_1);
            ruleRelease();

            state._fsp--;

             after(grammarAccess.getReleaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // InternalTxtDsl.g:212:1: ruleRelease : ( ( rule__Release__Group__0 ) ) ;
    public final void ruleRelease() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:216:2: ( ( ( rule__Release__Group__0 ) ) )
            // InternalTxtDsl.g:217:2: ( ( rule__Release__Group__0 ) )
            {
            // InternalTxtDsl.g:217:2: ( ( rule__Release__Group__0 ) )
            // InternalTxtDsl.g:218:3: ( rule__Release__Group__0 )
            {
             before(grammarAccess.getReleaseAccess().getGroup()); 
            // InternalTxtDsl.g:219:3: ( rule__Release__Group__0 )
            // InternalTxtDsl.g:219:4: rule__Release__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Release__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReleaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalTxtDsl.g:228:1: entryRuleTurnLeft : ruleTurnLeft EOF ;
    public final void entryRuleTurnLeft() throws RecognitionException {
        try {
            // InternalTxtDsl.g:229:1: ( ruleTurnLeft EOF )
            // InternalTxtDsl.g:230:1: ruleTurnLeft EOF
            {
             before(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnLeft();

            state._fsp--;

             after(grammarAccess.getTurnLeftRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalTxtDsl.g:237:1: ruleTurnLeft : ( ( rule__TurnLeft__Group__0 ) ) ;
    public final void ruleTurnLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:241:2: ( ( ( rule__TurnLeft__Group__0 ) ) )
            // InternalTxtDsl.g:242:2: ( ( rule__TurnLeft__Group__0 ) )
            {
            // InternalTxtDsl.g:242:2: ( ( rule__TurnLeft__Group__0 ) )
            // InternalTxtDsl.g:243:3: ( rule__TurnLeft__Group__0 )
            {
             before(grammarAccess.getTurnLeftAccess().getGroup()); 
            // InternalTxtDsl.g:244:3: ( rule__TurnLeft__Group__0 )
            // InternalTxtDsl.g:244:4: rule__TurnLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalTxtDsl.g:253:1: entryRuleTurnRight : ruleTurnRight EOF ;
    public final void entryRuleTurnRight() throws RecognitionException {
        try {
            // InternalTxtDsl.g:254:1: ( ruleTurnRight EOF )
            // InternalTxtDsl.g:255:1: ruleTurnRight EOF
            {
             before(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnRight();

            state._fsp--;

             after(grammarAccess.getTurnRightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalTxtDsl.g:262:1: ruleTurnRight : ( ( rule__TurnRight__Group__0 ) ) ;
    public final void ruleTurnRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:266:2: ( ( ( rule__TurnRight__Group__0 ) ) )
            // InternalTxtDsl.g:267:2: ( ( rule__TurnRight__Group__0 ) )
            {
            // InternalTxtDsl.g:267:2: ( ( rule__TurnRight__Group__0 ) )
            // InternalTxtDsl.g:268:3: ( rule__TurnRight__Group__0 )
            {
             before(grammarAccess.getTurnRightAccess().getGroup()); 
            // InternalTxtDsl.g:269:3: ( rule__TurnRight__Group__0 )
            // InternalTxtDsl.g:269:4: rule__TurnRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "entryRuleGoForward"
    // InternalTxtDsl.g:278:1: entryRuleGoForward : ruleGoForward EOF ;
    public final void entryRuleGoForward() throws RecognitionException {
        try {
            // InternalTxtDsl.g:279:1: ( ruleGoForward EOF )
            // InternalTxtDsl.g:280:1: ruleGoForward EOF
            {
             before(grammarAccess.getGoForwardRule()); 
            pushFollow(FOLLOW_1);
            ruleGoForward();

            state._fsp--;

             after(grammarAccess.getGoForwardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoForward"


    // $ANTLR start "ruleGoForward"
    // InternalTxtDsl.g:287:1: ruleGoForward : ( ( rule__GoForward__Group__0 ) ) ;
    public final void ruleGoForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:291:2: ( ( ( rule__GoForward__Group__0 ) ) )
            // InternalTxtDsl.g:292:2: ( ( rule__GoForward__Group__0 ) )
            {
            // InternalTxtDsl.g:292:2: ( ( rule__GoForward__Group__0 ) )
            // InternalTxtDsl.g:293:3: ( rule__GoForward__Group__0 )
            {
             before(grammarAccess.getGoForwardAccess().getGroup()); 
            // InternalTxtDsl.g:294:3: ( rule__GoForward__Group__0 )
            // InternalTxtDsl.g:294:4: rule__GoForward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoForward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoForwardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoForward"


    // $ANTLR start "entryRuleGoBackward"
    // InternalTxtDsl.g:303:1: entryRuleGoBackward : ruleGoBackward EOF ;
    public final void entryRuleGoBackward() throws RecognitionException {
        try {
            // InternalTxtDsl.g:304:1: ( ruleGoBackward EOF )
            // InternalTxtDsl.g:305:1: ruleGoBackward EOF
            {
             before(grammarAccess.getGoBackwardRule()); 
            pushFollow(FOLLOW_1);
            ruleGoBackward();

            state._fsp--;

             after(grammarAccess.getGoBackwardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoBackward"


    // $ANTLR start "ruleGoBackward"
    // InternalTxtDsl.g:312:1: ruleGoBackward : ( ( rule__GoBackward__Group__0 ) ) ;
    public final void ruleGoBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:316:2: ( ( ( rule__GoBackward__Group__0 ) ) )
            // InternalTxtDsl.g:317:2: ( ( rule__GoBackward__Group__0 ) )
            {
            // InternalTxtDsl.g:317:2: ( ( rule__GoBackward__Group__0 ) )
            // InternalTxtDsl.g:318:3: ( rule__GoBackward__Group__0 )
            {
             before(grammarAccess.getGoBackwardAccess().getGroup()); 
            // InternalTxtDsl.g:319:3: ( rule__GoBackward__Group__0 )
            // InternalTxtDsl.g:319:4: rule__GoBackward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoBackwardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoBackward"


    // $ANTLR start "entryRuleEInt"
    // InternalTxtDsl.g:328:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTxtDsl.g:329:1: ( ruleEInt EOF )
            // InternalTxtDsl.g:330:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTxtDsl.g:337:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:341:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTxtDsl.g:342:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTxtDsl.g:342:2: ( ( rule__EInt__Group__0 ) )
            // InternalTxtDsl.g:343:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTxtDsl.g:344:3: ( rule__EInt__Group__0 )
            // InternalTxtDsl.g:344:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalTxtDsl.g:352:1: rule__Instruction__Alternatives : ( ( ruleChoreography ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleGrab ) | ( ruleRelease ) | ( ruleTurnLeft ) | ( ruleTurnRight ) | ( ruleGoForward ) | ( ruleGoBackward ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:356:1: ( ( ruleChoreography ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleGrab ) | ( ruleRelease ) | ( ruleTurnLeft ) | ( ruleTurnRight ) | ( ruleGoForward ) | ( ruleGoBackward ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            case 19:
                {
                alt1=5;
                }
                break;
            case 20:
                {
                alt1=6;
                }
                break;
            case 22:
                {
                alt1=7;
                }
                break;
            case 23:
                {
                alt1=8;
                }
                break;
            case 25:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTxtDsl.g:357:2: ( ruleChoreography )
                    {
                    // InternalTxtDsl.g:357:2: ( ruleChoreography )
                    // InternalTxtDsl.g:358:3: ruleChoreography
                    {
                     before(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChoreography();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTxtDsl.g:363:2: ( rulePenDown )
                    {
                    // InternalTxtDsl.g:363:2: ( rulePenDown )
                    // InternalTxtDsl.g:364:3: rulePenDown
                    {
                     before(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePenDown();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTxtDsl.g:369:2: ( rulePenUp )
                    {
                    // InternalTxtDsl.g:369:2: ( rulePenUp )
                    // InternalTxtDsl.g:370:3: rulePenUp
                    {
                     before(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePenUp();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTxtDsl.g:375:2: ( ruleGrab )
                    {
                    // InternalTxtDsl.g:375:2: ( ruleGrab )
                    // InternalTxtDsl.g:376:3: ruleGrab
                    {
                     before(grammarAccess.getInstructionAccess().getGrabParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGrab();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGrabParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTxtDsl.g:381:2: ( ruleRelease )
                    {
                    // InternalTxtDsl.g:381:2: ( ruleRelease )
                    // InternalTxtDsl.g:382:3: ruleRelease
                    {
                     before(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRelease();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTxtDsl.g:387:2: ( ruleTurnLeft )
                    {
                    // InternalTxtDsl.g:387:2: ( ruleTurnLeft )
                    // InternalTxtDsl.g:388:3: ruleTurnLeft
                    {
                     before(grammarAccess.getInstructionAccess().getTurnLeftParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnLeft();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getTurnLeftParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTxtDsl.g:393:2: ( ruleTurnRight )
                    {
                    // InternalTxtDsl.g:393:2: ( ruleTurnRight )
                    // InternalTxtDsl.g:394:3: ruleTurnRight
                    {
                     before(grammarAccess.getInstructionAccess().getTurnRightParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnRight();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getTurnRightParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTxtDsl.g:399:2: ( ruleGoForward )
                    {
                    // InternalTxtDsl.g:399:2: ( ruleGoForward )
                    // InternalTxtDsl.g:400:3: ruleGoForward
                    {
                     before(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleGoForward();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTxtDsl.g:405:2: ( ruleGoBackward )
                    {
                    // InternalTxtDsl.g:405:2: ( ruleGoBackward )
                    // InternalTxtDsl.g:406:3: ruleGoBackward
                    {
                     before(grammarAccess.getInstructionAccess().getGoBackwardParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleGoBackward();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGoBackwardParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTxtDsl.g:415:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:419:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTxtDsl.g:420:2: ( RULE_STRING )
                    {
                    // InternalTxtDsl.g:420:2: ( RULE_STRING )
                    // InternalTxtDsl.g:421:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTxtDsl.g:426:2: ( RULE_ID )
                    {
                    // InternalTxtDsl.g:426:2: ( RULE_ID )
                    // InternalTxtDsl.g:427:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Choreography__Group__0"
    // InternalTxtDsl.g:436:1: rule__Choreography__Group__0 : rule__Choreography__Group__0__Impl rule__Choreography__Group__1 ;
    public final void rule__Choreography__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:440:1: ( rule__Choreography__Group__0__Impl rule__Choreography__Group__1 )
            // InternalTxtDsl.g:441:2: rule__Choreography__Group__0__Impl rule__Choreography__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Choreography__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__0"


    // $ANTLR start "rule__Choreography__Group__0__Impl"
    // InternalTxtDsl.g:448:1: rule__Choreography__Group__0__Impl : ( () ) ;
    public final void rule__Choreography__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:452:1: ( ( () ) )
            // InternalTxtDsl.g:453:1: ( () )
            {
            // InternalTxtDsl.g:453:1: ( () )
            // InternalTxtDsl.g:454:2: ()
            {
             before(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); 
            // InternalTxtDsl.g:455:2: ()
            // InternalTxtDsl.g:455:3: 
            {
            }

             after(grammarAccess.getChoreographyAccess().getChoreographyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__0__Impl"


    // $ANTLR start "rule__Choreography__Group__1"
    // InternalTxtDsl.g:463:1: rule__Choreography__Group__1 : rule__Choreography__Group__1__Impl rule__Choreography__Group__2 ;
    public final void rule__Choreography__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:467:1: ( rule__Choreography__Group__1__Impl rule__Choreography__Group__2 )
            // InternalTxtDsl.g:468:2: rule__Choreography__Group__1__Impl rule__Choreography__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Choreography__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__1"


    // $ANTLR start "rule__Choreography__Group__1__Impl"
    // InternalTxtDsl.g:475:1: rule__Choreography__Group__1__Impl : ( 'Choreography' ) ;
    public final void rule__Choreography__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:479:1: ( ( 'Choreography' ) )
            // InternalTxtDsl.g:480:1: ( 'Choreography' )
            {
            // InternalTxtDsl.g:480:1: ( 'Choreography' )
            // InternalTxtDsl.g:481:2: 'Choreography'
            {
             before(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getChoreographyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__1__Impl"


    // $ANTLR start "rule__Choreography__Group__2"
    // InternalTxtDsl.g:490:1: rule__Choreography__Group__2 : rule__Choreography__Group__2__Impl rule__Choreography__Group__3 ;
    public final void rule__Choreography__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:494:1: ( rule__Choreography__Group__2__Impl rule__Choreography__Group__3 )
            // InternalTxtDsl.g:495:2: rule__Choreography__Group__2__Impl rule__Choreography__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Choreography__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__2"


    // $ANTLR start "rule__Choreography__Group__2__Impl"
    // InternalTxtDsl.g:502:1: rule__Choreography__Group__2__Impl : ( ( rule__Choreography__NameAssignment_2 ) ) ;
    public final void rule__Choreography__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:506:1: ( ( ( rule__Choreography__NameAssignment_2 ) ) )
            // InternalTxtDsl.g:507:1: ( ( rule__Choreography__NameAssignment_2 ) )
            {
            // InternalTxtDsl.g:507:1: ( ( rule__Choreography__NameAssignment_2 ) )
            // InternalTxtDsl.g:508:2: ( rule__Choreography__NameAssignment_2 )
            {
             before(grammarAccess.getChoreographyAccess().getNameAssignment_2()); 
            // InternalTxtDsl.g:509:2: ( rule__Choreography__NameAssignment_2 )
            // InternalTxtDsl.g:509:3: rule__Choreography__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__2__Impl"


    // $ANTLR start "rule__Choreography__Group__3"
    // InternalTxtDsl.g:517:1: rule__Choreography__Group__3 : rule__Choreography__Group__3__Impl rule__Choreography__Group__4 ;
    public final void rule__Choreography__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:521:1: ( rule__Choreography__Group__3__Impl rule__Choreography__Group__4 )
            // InternalTxtDsl.g:522:2: rule__Choreography__Group__3__Impl rule__Choreography__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Choreography__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__3"


    // $ANTLR start "rule__Choreography__Group__3__Impl"
    // InternalTxtDsl.g:529:1: rule__Choreography__Group__3__Impl : ( '{' ) ;
    public final void rule__Choreography__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:533:1: ( ( '{' ) )
            // InternalTxtDsl.g:534:1: ( '{' )
            {
            // InternalTxtDsl.g:534:1: ( '{' )
            // InternalTxtDsl.g:535:2: '{'
            {
             before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__3__Impl"


    // $ANTLR start "rule__Choreography__Group__4"
    // InternalTxtDsl.g:544:1: rule__Choreography__Group__4 : rule__Choreography__Group__4__Impl rule__Choreography__Group__5 ;
    public final void rule__Choreography__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:548:1: ( rule__Choreography__Group__4__Impl rule__Choreography__Group__5 )
            // InternalTxtDsl.g:549:2: rule__Choreography__Group__4__Impl rule__Choreography__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Choreography__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__4"


    // $ANTLR start "rule__Choreography__Group__4__Impl"
    // InternalTxtDsl.g:556:1: rule__Choreography__Group__4__Impl : ( ( rule__Choreography__Group_4__0 )? ) ;
    public final void rule__Choreography__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:560:1: ( ( ( rule__Choreography__Group_4__0 )? ) )
            // InternalTxtDsl.g:561:1: ( ( rule__Choreography__Group_4__0 )? )
            {
            // InternalTxtDsl.g:561:1: ( ( rule__Choreography__Group_4__0 )? )
            // InternalTxtDsl.g:562:2: ( rule__Choreography__Group_4__0 )?
            {
             before(grammarAccess.getChoreographyAccess().getGroup_4()); 
            // InternalTxtDsl.g:563:2: ( rule__Choreography__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTxtDsl.g:563:3: rule__Choreography__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choreography__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoreographyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__4__Impl"


    // $ANTLR start "rule__Choreography__Group__5"
    // InternalTxtDsl.g:571:1: rule__Choreography__Group__5 : rule__Choreography__Group__5__Impl ;
    public final void rule__Choreography__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:575:1: ( rule__Choreography__Group__5__Impl )
            // InternalTxtDsl.g:576:2: rule__Choreography__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__5"


    // $ANTLR start "rule__Choreography__Group__5__Impl"
    // InternalTxtDsl.g:582:1: rule__Choreography__Group__5__Impl : ( '}' ) ;
    public final void rule__Choreography__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:586:1: ( ( '}' ) )
            // InternalTxtDsl.g:587:1: ( '}' )
            {
            // InternalTxtDsl.g:587:1: ( '}' )
            // InternalTxtDsl.g:588:2: '}'
            {
             before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group__5__Impl"


    // $ANTLR start "rule__Choreography__Group_4__0"
    // InternalTxtDsl.g:598:1: rule__Choreography__Group_4__0 : rule__Choreography__Group_4__0__Impl rule__Choreography__Group_4__1 ;
    public final void rule__Choreography__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:602:1: ( rule__Choreography__Group_4__0__Impl rule__Choreography__Group_4__1 )
            // InternalTxtDsl.g:603:2: rule__Choreography__Group_4__0__Impl rule__Choreography__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Choreography__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__0"


    // $ANTLR start "rule__Choreography__Group_4__0__Impl"
    // InternalTxtDsl.g:610:1: rule__Choreography__Group_4__0__Impl : ( 'instructions' ) ;
    public final void rule__Choreography__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:614:1: ( ( 'instructions' ) )
            // InternalTxtDsl.g:615:1: ( 'instructions' )
            {
            // InternalTxtDsl.g:615:1: ( 'instructions' )
            // InternalTxtDsl.g:616:2: 'instructions'
            {
             before(grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__0__Impl"


    // $ANTLR start "rule__Choreography__Group_4__1"
    // InternalTxtDsl.g:625:1: rule__Choreography__Group_4__1 : rule__Choreography__Group_4__1__Impl rule__Choreography__Group_4__2 ;
    public final void rule__Choreography__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:629:1: ( rule__Choreography__Group_4__1__Impl rule__Choreography__Group_4__2 )
            // InternalTxtDsl.g:630:2: rule__Choreography__Group_4__1__Impl rule__Choreography__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Choreography__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__1"


    // $ANTLR start "rule__Choreography__Group_4__1__Impl"
    // InternalTxtDsl.g:637:1: rule__Choreography__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Choreography__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:641:1: ( ( '{' ) )
            // InternalTxtDsl.g:642:1: ( '{' )
            {
            // InternalTxtDsl.g:642:1: ( '{' )
            // InternalTxtDsl.g:643:2: '{'
            {
             before(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__1__Impl"


    // $ANTLR start "rule__Choreography__Group_4__2"
    // InternalTxtDsl.g:652:1: rule__Choreography__Group_4__2 : rule__Choreography__Group_4__2__Impl rule__Choreography__Group_4__3 ;
    public final void rule__Choreography__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:656:1: ( rule__Choreography__Group_4__2__Impl rule__Choreography__Group_4__3 )
            // InternalTxtDsl.g:657:2: rule__Choreography__Group_4__2__Impl rule__Choreography__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Choreography__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__2"


    // $ANTLR start "rule__Choreography__Group_4__2__Impl"
    // InternalTxtDsl.g:664:1: rule__Choreography__Group_4__2__Impl : ( ( rule__Choreography__InstructionsAssignment_4_2 ) ) ;
    public final void rule__Choreography__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:668:1: ( ( ( rule__Choreography__InstructionsAssignment_4_2 ) ) )
            // InternalTxtDsl.g:669:1: ( ( rule__Choreography__InstructionsAssignment_4_2 ) )
            {
            // InternalTxtDsl.g:669:1: ( ( rule__Choreography__InstructionsAssignment_4_2 ) )
            // InternalTxtDsl.g:670:2: ( rule__Choreography__InstructionsAssignment_4_2 )
            {
             before(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_2()); 
            // InternalTxtDsl.g:671:2: ( rule__Choreography__InstructionsAssignment_4_2 )
            // InternalTxtDsl.g:671:3: rule__Choreography__InstructionsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__InstructionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__2__Impl"


    // $ANTLR start "rule__Choreography__Group_4__3"
    // InternalTxtDsl.g:679:1: rule__Choreography__Group_4__3 : rule__Choreography__Group_4__3__Impl rule__Choreography__Group_4__4 ;
    public final void rule__Choreography__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:683:1: ( rule__Choreography__Group_4__3__Impl rule__Choreography__Group_4__4 )
            // InternalTxtDsl.g:684:2: rule__Choreography__Group_4__3__Impl rule__Choreography__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Choreography__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__3"


    // $ANTLR start "rule__Choreography__Group_4__3__Impl"
    // InternalTxtDsl.g:691:1: rule__Choreography__Group_4__3__Impl : ( ( rule__Choreography__Group_4_3__0 )* ) ;
    public final void rule__Choreography__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:695:1: ( ( ( rule__Choreography__Group_4_3__0 )* ) )
            // InternalTxtDsl.g:696:1: ( ( rule__Choreography__Group_4_3__0 )* )
            {
            // InternalTxtDsl.g:696:1: ( ( rule__Choreography__Group_4_3__0 )* )
            // InternalTxtDsl.g:697:2: ( rule__Choreography__Group_4_3__0 )*
            {
             before(grammarAccess.getChoreographyAccess().getGroup_4_3()); 
            // InternalTxtDsl.g:698:2: ( rule__Choreography__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTxtDsl.g:698:3: rule__Choreography__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Choreography__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getChoreographyAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__3__Impl"


    // $ANTLR start "rule__Choreography__Group_4__4"
    // InternalTxtDsl.g:706:1: rule__Choreography__Group_4__4 : rule__Choreography__Group_4__4__Impl ;
    public final void rule__Choreography__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:710:1: ( rule__Choreography__Group_4__4__Impl )
            // InternalTxtDsl.g:711:2: rule__Choreography__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__4"


    // $ANTLR start "rule__Choreography__Group_4__4__Impl"
    // InternalTxtDsl.g:717:1: rule__Choreography__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Choreography__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:721:1: ( ( '}' ) )
            // InternalTxtDsl.g:722:1: ( '}' )
            {
            // InternalTxtDsl.g:722:1: ( '}' )
            // InternalTxtDsl.g:723:2: '}'
            {
             before(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4__4__Impl"


    // $ANTLR start "rule__Choreography__Group_4_3__0"
    // InternalTxtDsl.g:733:1: rule__Choreography__Group_4_3__0 : rule__Choreography__Group_4_3__0__Impl rule__Choreography__Group_4_3__1 ;
    public final void rule__Choreography__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:737:1: ( rule__Choreography__Group_4_3__0__Impl rule__Choreography__Group_4_3__1 )
            // InternalTxtDsl.g:738:2: rule__Choreography__Group_4_3__0__Impl rule__Choreography__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Choreography__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__0"


    // $ANTLR start "rule__Choreography__Group_4_3__0__Impl"
    // InternalTxtDsl.g:745:1: rule__Choreography__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Choreography__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:749:1: ( ( ',' ) )
            // InternalTxtDsl.g:750:1: ( ',' )
            {
            // InternalTxtDsl.g:750:1: ( ',' )
            // InternalTxtDsl.g:751:2: ','
            {
             before(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__0__Impl"


    // $ANTLR start "rule__Choreography__Group_4_3__1"
    // InternalTxtDsl.g:760:1: rule__Choreography__Group_4_3__1 : rule__Choreography__Group_4_3__1__Impl ;
    public final void rule__Choreography__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:764:1: ( rule__Choreography__Group_4_3__1__Impl )
            // InternalTxtDsl.g:765:2: rule__Choreography__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__1"


    // $ANTLR start "rule__Choreography__Group_4_3__1__Impl"
    // InternalTxtDsl.g:771:1: rule__Choreography__Group_4_3__1__Impl : ( ( rule__Choreography__InstructionsAssignment_4_3_1 ) ) ;
    public final void rule__Choreography__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:775:1: ( ( ( rule__Choreography__InstructionsAssignment_4_3_1 ) ) )
            // InternalTxtDsl.g:776:1: ( ( rule__Choreography__InstructionsAssignment_4_3_1 ) )
            {
            // InternalTxtDsl.g:776:1: ( ( rule__Choreography__InstructionsAssignment_4_3_1 ) )
            // InternalTxtDsl.g:777:2: ( rule__Choreography__InstructionsAssignment_4_3_1 )
            {
             before(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_3_1()); 
            // InternalTxtDsl.g:778:2: ( rule__Choreography__InstructionsAssignment_4_3_1 )
            // InternalTxtDsl.g:778:3: rule__Choreography__InstructionsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Choreography__InstructionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChoreographyAccess().getInstructionsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__Group_4_3__1__Impl"


    // $ANTLR start "rule__PenDown__Group__0"
    // InternalTxtDsl.g:787:1: rule__PenDown__Group__0 : rule__PenDown__Group__0__Impl rule__PenDown__Group__1 ;
    public final void rule__PenDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:791:1: ( rule__PenDown__Group__0__Impl rule__PenDown__Group__1 )
            // InternalTxtDsl.g:792:2: rule__PenDown__Group__0__Impl rule__PenDown__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PenDown__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PenDown__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__0"


    // $ANTLR start "rule__PenDown__Group__0__Impl"
    // InternalTxtDsl.g:799:1: rule__PenDown__Group__0__Impl : ( () ) ;
    public final void rule__PenDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:803:1: ( ( () ) )
            // InternalTxtDsl.g:804:1: ( () )
            {
            // InternalTxtDsl.g:804:1: ( () )
            // InternalTxtDsl.g:805:2: ()
            {
             before(grammarAccess.getPenDownAccess().getPenDownAction_0()); 
            // InternalTxtDsl.g:806:2: ()
            // InternalTxtDsl.g:806:3: 
            {
            }

             after(grammarAccess.getPenDownAccess().getPenDownAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__0__Impl"


    // $ANTLR start "rule__PenDown__Group__1"
    // InternalTxtDsl.g:814:1: rule__PenDown__Group__1 : rule__PenDown__Group__1__Impl ;
    public final void rule__PenDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:818:1: ( rule__PenDown__Group__1__Impl )
            // InternalTxtDsl.g:819:2: rule__PenDown__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PenDown__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__1"


    // $ANTLR start "rule__PenDown__Group__1__Impl"
    // InternalTxtDsl.g:825:1: rule__PenDown__Group__1__Impl : ( 'PenDown' ) ;
    public final void rule__PenDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:829:1: ( ( 'PenDown' ) )
            // InternalTxtDsl.g:830:1: ( 'PenDown' )
            {
            // InternalTxtDsl.g:830:1: ( 'PenDown' )
            // InternalTxtDsl.g:831:2: 'PenDown'
            {
             before(grammarAccess.getPenDownAccess().getPenDownKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPenDownAccess().getPenDownKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__1__Impl"


    // $ANTLR start "rule__PenUp__Group__0"
    // InternalTxtDsl.g:841:1: rule__PenUp__Group__0 : rule__PenUp__Group__0__Impl rule__PenUp__Group__1 ;
    public final void rule__PenUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:845:1: ( rule__PenUp__Group__0__Impl rule__PenUp__Group__1 )
            // InternalTxtDsl.g:846:2: rule__PenUp__Group__0__Impl rule__PenUp__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PenUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PenUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__0"


    // $ANTLR start "rule__PenUp__Group__0__Impl"
    // InternalTxtDsl.g:853:1: rule__PenUp__Group__0__Impl : ( () ) ;
    public final void rule__PenUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:857:1: ( ( () ) )
            // InternalTxtDsl.g:858:1: ( () )
            {
            // InternalTxtDsl.g:858:1: ( () )
            // InternalTxtDsl.g:859:2: ()
            {
             before(grammarAccess.getPenUpAccess().getPenUpAction_0()); 
            // InternalTxtDsl.g:860:2: ()
            // InternalTxtDsl.g:860:3: 
            {
            }

             after(grammarAccess.getPenUpAccess().getPenUpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__0__Impl"


    // $ANTLR start "rule__PenUp__Group__1"
    // InternalTxtDsl.g:868:1: rule__PenUp__Group__1 : rule__PenUp__Group__1__Impl ;
    public final void rule__PenUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:872:1: ( rule__PenUp__Group__1__Impl )
            // InternalTxtDsl.g:873:2: rule__PenUp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PenUp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__1"


    // $ANTLR start "rule__PenUp__Group__1__Impl"
    // InternalTxtDsl.g:879:1: rule__PenUp__Group__1__Impl : ( 'PenUp' ) ;
    public final void rule__PenUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:883:1: ( ( 'PenUp' ) )
            // InternalTxtDsl.g:884:1: ( 'PenUp' )
            {
            // InternalTxtDsl.g:884:1: ( 'PenUp' )
            // InternalTxtDsl.g:885:2: 'PenUp'
            {
             before(grammarAccess.getPenUpAccess().getPenUpKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPenUpAccess().getPenUpKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__1__Impl"


    // $ANTLR start "rule__Grab__Group__0"
    // InternalTxtDsl.g:895:1: rule__Grab__Group__0 : rule__Grab__Group__0__Impl rule__Grab__Group__1 ;
    public final void rule__Grab__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:899:1: ( rule__Grab__Group__0__Impl rule__Grab__Group__1 )
            // InternalTxtDsl.g:900:2: rule__Grab__Group__0__Impl rule__Grab__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Grab__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grab__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__0"


    // $ANTLR start "rule__Grab__Group__0__Impl"
    // InternalTxtDsl.g:907:1: rule__Grab__Group__0__Impl : ( () ) ;
    public final void rule__Grab__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:911:1: ( ( () ) )
            // InternalTxtDsl.g:912:1: ( () )
            {
            // InternalTxtDsl.g:912:1: ( () )
            // InternalTxtDsl.g:913:2: ()
            {
             before(grammarAccess.getGrabAccess().getGrabAction_0()); 
            // InternalTxtDsl.g:914:2: ()
            // InternalTxtDsl.g:914:3: 
            {
            }

             after(grammarAccess.getGrabAccess().getGrabAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__0__Impl"


    // $ANTLR start "rule__Grab__Group__1"
    // InternalTxtDsl.g:922:1: rule__Grab__Group__1 : rule__Grab__Group__1__Impl ;
    public final void rule__Grab__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:926:1: ( rule__Grab__Group__1__Impl )
            // InternalTxtDsl.g:927:2: rule__Grab__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grab__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__1"


    // $ANTLR start "rule__Grab__Group__1__Impl"
    // InternalTxtDsl.g:933:1: rule__Grab__Group__1__Impl : ( 'Grab' ) ;
    public final void rule__Grab__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:937:1: ( ( 'Grab' ) )
            // InternalTxtDsl.g:938:1: ( 'Grab' )
            {
            // InternalTxtDsl.g:938:1: ( 'Grab' )
            // InternalTxtDsl.g:939:2: 'Grab'
            {
             before(grammarAccess.getGrabAccess().getGrabKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGrabAccess().getGrabKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grab__Group__1__Impl"


    // $ANTLR start "rule__Release__Group__0"
    // InternalTxtDsl.g:949:1: rule__Release__Group__0 : rule__Release__Group__0__Impl rule__Release__Group__1 ;
    public final void rule__Release__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:953:1: ( rule__Release__Group__0__Impl rule__Release__Group__1 )
            // InternalTxtDsl.g:954:2: rule__Release__Group__0__Impl rule__Release__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Release__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Release__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__0"


    // $ANTLR start "rule__Release__Group__0__Impl"
    // InternalTxtDsl.g:961:1: rule__Release__Group__0__Impl : ( () ) ;
    public final void rule__Release__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:965:1: ( ( () ) )
            // InternalTxtDsl.g:966:1: ( () )
            {
            // InternalTxtDsl.g:966:1: ( () )
            // InternalTxtDsl.g:967:2: ()
            {
             before(grammarAccess.getReleaseAccess().getReleaseAction_0()); 
            // InternalTxtDsl.g:968:2: ()
            // InternalTxtDsl.g:968:3: 
            {
            }

             after(grammarAccess.getReleaseAccess().getReleaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__0__Impl"


    // $ANTLR start "rule__Release__Group__1"
    // InternalTxtDsl.g:976:1: rule__Release__Group__1 : rule__Release__Group__1__Impl ;
    public final void rule__Release__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:980:1: ( rule__Release__Group__1__Impl )
            // InternalTxtDsl.g:981:2: rule__Release__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Release__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__1"


    // $ANTLR start "rule__Release__Group__1__Impl"
    // InternalTxtDsl.g:987:1: rule__Release__Group__1__Impl : ( 'Release' ) ;
    public final void rule__Release__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:991:1: ( ( 'Release' ) )
            // InternalTxtDsl.g:992:1: ( 'Release' )
            {
            // InternalTxtDsl.g:992:1: ( 'Release' )
            // InternalTxtDsl.g:993:2: 'Release'
            {
             before(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReleaseAccess().getReleaseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Release__Group__1__Impl"


    // $ANTLR start "rule__TurnLeft__Group__0"
    // InternalTxtDsl.g:1003:1: rule__TurnLeft__Group__0 : rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 ;
    public final void rule__TurnLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1007:1: ( rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 )
            // InternalTxtDsl.g:1008:2: rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TurnLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__0"


    // $ANTLR start "rule__TurnLeft__Group__0__Impl"
    // InternalTxtDsl.g:1015:1: rule__TurnLeft__Group__0__Impl : ( 'TurnLeft' ) ;
    public final void rule__TurnLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1019:1: ( ( 'TurnLeft' ) )
            // InternalTxtDsl.g:1020:1: ( 'TurnLeft' )
            {
            // InternalTxtDsl.g:1020:1: ( 'TurnLeft' )
            // InternalTxtDsl.g:1021:2: 'TurnLeft'
            {
             before(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__0__Impl"


    // $ANTLR start "rule__TurnLeft__Group__1"
    // InternalTxtDsl.g:1030:1: rule__TurnLeft__Group__1 : rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 ;
    public final void rule__TurnLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1034:1: ( rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 )
            // InternalTxtDsl.g:1035:2: rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TurnLeft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__1"


    // $ANTLR start "rule__TurnLeft__Group__1__Impl"
    // InternalTxtDsl.g:1042:1: rule__TurnLeft__Group__1__Impl : ( '{' ) ;
    public final void rule__TurnLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1046:1: ( ( '{' ) )
            // InternalTxtDsl.g:1047:1: ( '{' )
            {
            // InternalTxtDsl.g:1047:1: ( '{' )
            // InternalTxtDsl.g:1048:2: '{'
            {
             before(grammarAccess.getTurnLeftAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__1__Impl"


    // $ANTLR start "rule__TurnLeft__Group__2"
    // InternalTxtDsl.g:1057:1: rule__TurnLeft__Group__2 : rule__TurnLeft__Group__2__Impl rule__TurnLeft__Group__3 ;
    public final void rule__TurnLeft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1061:1: ( rule__TurnLeft__Group__2__Impl rule__TurnLeft__Group__3 )
            // InternalTxtDsl.g:1062:2: rule__TurnLeft__Group__2__Impl rule__TurnLeft__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TurnLeft__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__2"


    // $ANTLR start "rule__TurnLeft__Group__2__Impl"
    // InternalTxtDsl.g:1069:1: rule__TurnLeft__Group__2__Impl : ( 'angle' ) ;
    public final void rule__TurnLeft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1073:1: ( ( 'angle' ) )
            // InternalTxtDsl.g:1074:1: ( 'angle' )
            {
            // InternalTxtDsl.g:1074:1: ( 'angle' )
            // InternalTxtDsl.g:1075:2: 'angle'
            {
             before(grammarAccess.getTurnLeftAccess().getAngleKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getAngleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__2__Impl"


    // $ANTLR start "rule__TurnLeft__Group__3"
    // InternalTxtDsl.g:1084:1: rule__TurnLeft__Group__3 : rule__TurnLeft__Group__3__Impl rule__TurnLeft__Group__4 ;
    public final void rule__TurnLeft__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1088:1: ( rule__TurnLeft__Group__3__Impl rule__TurnLeft__Group__4 )
            // InternalTxtDsl.g:1089:2: rule__TurnLeft__Group__3__Impl rule__TurnLeft__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__TurnLeft__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__3"


    // $ANTLR start "rule__TurnLeft__Group__3__Impl"
    // InternalTxtDsl.g:1096:1: rule__TurnLeft__Group__3__Impl : ( ( rule__TurnLeft__AngleAssignment_3 ) ) ;
    public final void rule__TurnLeft__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1100:1: ( ( ( rule__TurnLeft__AngleAssignment_3 ) ) )
            // InternalTxtDsl.g:1101:1: ( ( rule__TurnLeft__AngleAssignment_3 ) )
            {
            // InternalTxtDsl.g:1101:1: ( ( rule__TurnLeft__AngleAssignment_3 ) )
            // InternalTxtDsl.g:1102:2: ( rule__TurnLeft__AngleAssignment_3 )
            {
             before(grammarAccess.getTurnLeftAccess().getAngleAssignment_3()); 
            // InternalTxtDsl.g:1103:2: ( rule__TurnLeft__AngleAssignment_3 )
            // InternalTxtDsl.g:1103:3: rule__TurnLeft__AngleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__AngleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTurnLeftAccess().getAngleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__3__Impl"


    // $ANTLR start "rule__TurnLeft__Group__4"
    // InternalTxtDsl.g:1111:1: rule__TurnLeft__Group__4 : rule__TurnLeft__Group__4__Impl ;
    public final void rule__TurnLeft__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1115:1: ( rule__TurnLeft__Group__4__Impl )
            // InternalTxtDsl.g:1116:2: rule__TurnLeft__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__4"


    // $ANTLR start "rule__TurnLeft__Group__4__Impl"
    // InternalTxtDsl.g:1122:1: rule__TurnLeft__Group__4__Impl : ( '}' ) ;
    public final void rule__TurnLeft__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1126:1: ( ( '}' ) )
            // InternalTxtDsl.g:1127:1: ( '}' )
            {
            // InternalTxtDsl.g:1127:1: ( '}' )
            // InternalTxtDsl.g:1128:2: '}'
            {
             before(grammarAccess.getTurnLeftAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__4__Impl"


    // $ANTLR start "rule__TurnRight__Group__0"
    // InternalTxtDsl.g:1138:1: rule__TurnRight__Group__0 : rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 ;
    public final void rule__TurnRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1142:1: ( rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 )
            // InternalTxtDsl.g:1143:2: rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TurnRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__0"


    // $ANTLR start "rule__TurnRight__Group__0__Impl"
    // InternalTxtDsl.g:1150:1: rule__TurnRight__Group__0__Impl : ( 'TurnRight' ) ;
    public final void rule__TurnRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1154:1: ( ( 'TurnRight' ) )
            // InternalTxtDsl.g:1155:1: ( 'TurnRight' )
            {
            // InternalTxtDsl.g:1155:1: ( 'TurnRight' )
            // InternalTxtDsl.g:1156:2: 'TurnRight'
            {
             before(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getTurnRightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__0__Impl"


    // $ANTLR start "rule__TurnRight__Group__1"
    // InternalTxtDsl.g:1165:1: rule__TurnRight__Group__1 : rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 ;
    public final void rule__TurnRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1169:1: ( rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 )
            // InternalTxtDsl.g:1170:2: rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TurnRight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__1"


    // $ANTLR start "rule__TurnRight__Group__1__Impl"
    // InternalTxtDsl.g:1177:1: rule__TurnRight__Group__1__Impl : ( '{' ) ;
    public final void rule__TurnRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1181:1: ( ( '{' ) )
            // InternalTxtDsl.g:1182:1: ( '{' )
            {
            // InternalTxtDsl.g:1182:1: ( '{' )
            // InternalTxtDsl.g:1183:2: '{'
            {
             before(grammarAccess.getTurnRightAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__1__Impl"


    // $ANTLR start "rule__TurnRight__Group__2"
    // InternalTxtDsl.g:1192:1: rule__TurnRight__Group__2 : rule__TurnRight__Group__2__Impl rule__TurnRight__Group__3 ;
    public final void rule__TurnRight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1196:1: ( rule__TurnRight__Group__2__Impl rule__TurnRight__Group__3 )
            // InternalTxtDsl.g:1197:2: rule__TurnRight__Group__2__Impl rule__TurnRight__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TurnRight__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__2"


    // $ANTLR start "rule__TurnRight__Group__2__Impl"
    // InternalTxtDsl.g:1204:1: rule__TurnRight__Group__2__Impl : ( 'angle' ) ;
    public final void rule__TurnRight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1208:1: ( ( 'angle' ) )
            // InternalTxtDsl.g:1209:1: ( 'angle' )
            {
            // InternalTxtDsl.g:1209:1: ( 'angle' )
            // InternalTxtDsl.g:1210:2: 'angle'
            {
             before(grammarAccess.getTurnRightAccess().getAngleKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getAngleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__2__Impl"


    // $ANTLR start "rule__TurnRight__Group__3"
    // InternalTxtDsl.g:1219:1: rule__TurnRight__Group__3 : rule__TurnRight__Group__3__Impl rule__TurnRight__Group__4 ;
    public final void rule__TurnRight__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1223:1: ( rule__TurnRight__Group__3__Impl rule__TurnRight__Group__4 )
            // InternalTxtDsl.g:1224:2: rule__TurnRight__Group__3__Impl rule__TurnRight__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__TurnRight__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__3"


    // $ANTLR start "rule__TurnRight__Group__3__Impl"
    // InternalTxtDsl.g:1231:1: rule__TurnRight__Group__3__Impl : ( ( rule__TurnRight__AngleAssignment_3 ) ) ;
    public final void rule__TurnRight__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1235:1: ( ( ( rule__TurnRight__AngleAssignment_3 ) ) )
            // InternalTxtDsl.g:1236:1: ( ( rule__TurnRight__AngleAssignment_3 ) )
            {
            // InternalTxtDsl.g:1236:1: ( ( rule__TurnRight__AngleAssignment_3 ) )
            // InternalTxtDsl.g:1237:2: ( rule__TurnRight__AngleAssignment_3 )
            {
             before(grammarAccess.getTurnRightAccess().getAngleAssignment_3()); 
            // InternalTxtDsl.g:1238:2: ( rule__TurnRight__AngleAssignment_3 )
            // InternalTxtDsl.g:1238:3: rule__TurnRight__AngleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__AngleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTurnRightAccess().getAngleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__3__Impl"


    // $ANTLR start "rule__TurnRight__Group__4"
    // InternalTxtDsl.g:1246:1: rule__TurnRight__Group__4 : rule__TurnRight__Group__4__Impl ;
    public final void rule__TurnRight__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1250:1: ( rule__TurnRight__Group__4__Impl )
            // InternalTxtDsl.g:1251:2: rule__TurnRight__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__4"


    // $ANTLR start "rule__TurnRight__Group__4__Impl"
    // InternalTxtDsl.g:1257:1: rule__TurnRight__Group__4__Impl : ( '}' ) ;
    public final void rule__TurnRight__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1261:1: ( ( '}' ) )
            // InternalTxtDsl.g:1262:1: ( '}' )
            {
            // InternalTxtDsl.g:1262:1: ( '}' )
            // InternalTxtDsl.g:1263:2: '}'
            {
             before(grammarAccess.getTurnRightAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__4__Impl"


    // $ANTLR start "rule__GoForward__Group__0"
    // InternalTxtDsl.g:1273:1: rule__GoForward__Group__0 : rule__GoForward__Group__0__Impl rule__GoForward__Group__1 ;
    public final void rule__GoForward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1277:1: ( rule__GoForward__Group__0__Impl rule__GoForward__Group__1 )
            // InternalTxtDsl.g:1278:2: rule__GoForward__Group__0__Impl rule__GoForward__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GoForward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoForward__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__0"


    // $ANTLR start "rule__GoForward__Group__0__Impl"
    // InternalTxtDsl.g:1285:1: rule__GoForward__Group__0__Impl : ( 'GoForward' ) ;
    public final void rule__GoForward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1289:1: ( ( 'GoForward' ) )
            // InternalTxtDsl.g:1290:1: ( 'GoForward' )
            {
            // InternalTxtDsl.g:1290:1: ( 'GoForward' )
            // InternalTxtDsl.g:1291:2: 'GoForward'
            {
             before(grammarAccess.getGoForwardAccess().getGoForwardKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGoForwardAccess().getGoForwardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__0__Impl"


    // $ANTLR start "rule__GoForward__Group__1"
    // InternalTxtDsl.g:1300:1: rule__GoForward__Group__1 : rule__GoForward__Group__1__Impl rule__GoForward__Group__2 ;
    public final void rule__GoForward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1304:1: ( rule__GoForward__Group__1__Impl rule__GoForward__Group__2 )
            // InternalTxtDsl.g:1305:2: rule__GoForward__Group__1__Impl rule__GoForward__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GoForward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoForward__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__1"


    // $ANTLR start "rule__GoForward__Group__1__Impl"
    // InternalTxtDsl.g:1312:1: rule__GoForward__Group__1__Impl : ( '{' ) ;
    public final void rule__GoForward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1316:1: ( ( '{' ) )
            // InternalTxtDsl.g:1317:1: ( '{' )
            {
            // InternalTxtDsl.g:1317:1: ( '{' )
            // InternalTxtDsl.g:1318:2: '{'
            {
             before(grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__1__Impl"


    // $ANTLR start "rule__GoForward__Group__2"
    // InternalTxtDsl.g:1327:1: rule__GoForward__Group__2 : rule__GoForward__Group__2__Impl rule__GoForward__Group__3 ;
    public final void rule__GoForward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1331:1: ( rule__GoForward__Group__2__Impl rule__GoForward__Group__3 )
            // InternalTxtDsl.g:1332:2: rule__GoForward__Group__2__Impl rule__GoForward__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__GoForward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoForward__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__2"


    // $ANTLR start "rule__GoForward__Group__2__Impl"
    // InternalTxtDsl.g:1339:1: rule__GoForward__Group__2__Impl : ( 'distance' ) ;
    public final void rule__GoForward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1343:1: ( ( 'distance' ) )
            // InternalTxtDsl.g:1344:1: ( 'distance' )
            {
            // InternalTxtDsl.g:1344:1: ( 'distance' )
            // InternalTxtDsl.g:1345:2: 'distance'
            {
             before(grammarAccess.getGoForwardAccess().getDistanceKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGoForwardAccess().getDistanceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__2__Impl"


    // $ANTLR start "rule__GoForward__Group__3"
    // InternalTxtDsl.g:1354:1: rule__GoForward__Group__3 : rule__GoForward__Group__3__Impl rule__GoForward__Group__4 ;
    public final void rule__GoForward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1358:1: ( rule__GoForward__Group__3__Impl rule__GoForward__Group__4 )
            // InternalTxtDsl.g:1359:2: rule__GoForward__Group__3__Impl rule__GoForward__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__GoForward__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoForward__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__3"


    // $ANTLR start "rule__GoForward__Group__3__Impl"
    // InternalTxtDsl.g:1366:1: rule__GoForward__Group__3__Impl : ( ( rule__GoForward__DistanceAssignment_3 ) ) ;
    public final void rule__GoForward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1370:1: ( ( ( rule__GoForward__DistanceAssignment_3 ) ) )
            // InternalTxtDsl.g:1371:1: ( ( rule__GoForward__DistanceAssignment_3 ) )
            {
            // InternalTxtDsl.g:1371:1: ( ( rule__GoForward__DistanceAssignment_3 ) )
            // InternalTxtDsl.g:1372:2: ( rule__GoForward__DistanceAssignment_3 )
            {
             before(grammarAccess.getGoForwardAccess().getDistanceAssignment_3()); 
            // InternalTxtDsl.g:1373:2: ( rule__GoForward__DistanceAssignment_3 )
            // InternalTxtDsl.g:1373:3: rule__GoForward__DistanceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoForward__DistanceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoForwardAccess().getDistanceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__3__Impl"


    // $ANTLR start "rule__GoForward__Group__4"
    // InternalTxtDsl.g:1381:1: rule__GoForward__Group__4 : rule__GoForward__Group__4__Impl ;
    public final void rule__GoForward__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1385:1: ( rule__GoForward__Group__4__Impl )
            // InternalTxtDsl.g:1386:2: rule__GoForward__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoForward__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__4"


    // $ANTLR start "rule__GoForward__Group__4__Impl"
    // InternalTxtDsl.g:1392:1: rule__GoForward__Group__4__Impl : ( '}' ) ;
    public final void rule__GoForward__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1396:1: ( ( '}' ) )
            // InternalTxtDsl.g:1397:1: ( '}' )
            {
            // InternalTxtDsl.g:1397:1: ( '}' )
            // InternalTxtDsl.g:1398:2: '}'
            {
             before(grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__Group__4__Impl"


    // $ANTLR start "rule__GoBackward__Group__0"
    // InternalTxtDsl.g:1408:1: rule__GoBackward__Group__0 : rule__GoBackward__Group__0__Impl rule__GoBackward__Group__1 ;
    public final void rule__GoBackward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1412:1: ( rule__GoBackward__Group__0__Impl rule__GoBackward__Group__1 )
            // InternalTxtDsl.g:1413:2: rule__GoBackward__Group__0__Impl rule__GoBackward__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GoBackward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__0"


    // $ANTLR start "rule__GoBackward__Group__0__Impl"
    // InternalTxtDsl.g:1420:1: rule__GoBackward__Group__0__Impl : ( 'GoBackward' ) ;
    public final void rule__GoBackward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1424:1: ( ( 'GoBackward' ) )
            // InternalTxtDsl.g:1425:1: ( 'GoBackward' )
            {
            // InternalTxtDsl.g:1425:1: ( 'GoBackward' )
            // InternalTxtDsl.g:1426:2: 'GoBackward'
            {
             before(grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__0__Impl"


    // $ANTLR start "rule__GoBackward__Group__1"
    // InternalTxtDsl.g:1435:1: rule__GoBackward__Group__1 : rule__GoBackward__Group__1__Impl rule__GoBackward__Group__2 ;
    public final void rule__GoBackward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1439:1: ( rule__GoBackward__Group__1__Impl rule__GoBackward__Group__2 )
            // InternalTxtDsl.g:1440:2: rule__GoBackward__Group__1__Impl rule__GoBackward__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GoBackward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__1"


    // $ANTLR start "rule__GoBackward__Group__1__Impl"
    // InternalTxtDsl.g:1447:1: rule__GoBackward__Group__1__Impl : ( '{' ) ;
    public final void rule__GoBackward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1451:1: ( ( '{' ) )
            // InternalTxtDsl.g:1452:1: ( '{' )
            {
            // InternalTxtDsl.g:1452:1: ( '{' )
            // InternalTxtDsl.g:1453:2: '{'
            {
             before(grammarAccess.getGoBackwardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGoBackwardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__1__Impl"


    // $ANTLR start "rule__GoBackward__Group__2"
    // InternalTxtDsl.g:1462:1: rule__GoBackward__Group__2 : rule__GoBackward__Group__2__Impl rule__GoBackward__Group__3 ;
    public final void rule__GoBackward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1466:1: ( rule__GoBackward__Group__2__Impl rule__GoBackward__Group__3 )
            // InternalTxtDsl.g:1467:2: rule__GoBackward__Group__2__Impl rule__GoBackward__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__GoBackward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__2"


    // $ANTLR start "rule__GoBackward__Group__2__Impl"
    // InternalTxtDsl.g:1474:1: rule__GoBackward__Group__2__Impl : ( 'distance' ) ;
    public final void rule__GoBackward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1478:1: ( ( 'distance' ) )
            // InternalTxtDsl.g:1479:1: ( 'distance' )
            {
            // InternalTxtDsl.g:1479:1: ( 'distance' )
            // InternalTxtDsl.g:1480:2: 'distance'
            {
             before(grammarAccess.getGoBackwardAccess().getDistanceKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGoBackwardAccess().getDistanceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__2__Impl"


    // $ANTLR start "rule__GoBackward__Group__3"
    // InternalTxtDsl.g:1489:1: rule__GoBackward__Group__3 : rule__GoBackward__Group__3__Impl rule__GoBackward__Group__4 ;
    public final void rule__GoBackward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1493:1: ( rule__GoBackward__Group__3__Impl rule__GoBackward__Group__4 )
            // InternalTxtDsl.g:1494:2: rule__GoBackward__Group__3__Impl rule__GoBackward__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__GoBackward__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__3"


    // $ANTLR start "rule__GoBackward__Group__3__Impl"
    // InternalTxtDsl.g:1501:1: rule__GoBackward__Group__3__Impl : ( ( rule__GoBackward__DistanceAssignment_3 ) ) ;
    public final void rule__GoBackward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1505:1: ( ( ( rule__GoBackward__DistanceAssignment_3 ) ) )
            // InternalTxtDsl.g:1506:1: ( ( rule__GoBackward__DistanceAssignment_3 ) )
            {
            // InternalTxtDsl.g:1506:1: ( ( rule__GoBackward__DistanceAssignment_3 ) )
            // InternalTxtDsl.g:1507:2: ( rule__GoBackward__DistanceAssignment_3 )
            {
             before(grammarAccess.getGoBackwardAccess().getDistanceAssignment_3()); 
            // InternalTxtDsl.g:1508:2: ( rule__GoBackward__DistanceAssignment_3 )
            // InternalTxtDsl.g:1508:3: rule__GoBackward__DistanceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoBackward__DistanceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoBackwardAccess().getDistanceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__3__Impl"


    // $ANTLR start "rule__GoBackward__Group__4"
    // InternalTxtDsl.g:1516:1: rule__GoBackward__Group__4 : rule__GoBackward__Group__4__Impl ;
    public final void rule__GoBackward__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1520:1: ( rule__GoBackward__Group__4__Impl )
            // InternalTxtDsl.g:1521:2: rule__GoBackward__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoBackward__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__4"


    // $ANTLR start "rule__GoBackward__Group__4__Impl"
    // InternalTxtDsl.g:1527:1: rule__GoBackward__Group__4__Impl : ( '}' ) ;
    public final void rule__GoBackward__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1531:1: ( ( '}' ) )
            // InternalTxtDsl.g:1532:1: ( '}' )
            {
            // InternalTxtDsl.g:1532:1: ( '}' )
            // InternalTxtDsl.g:1533:2: '}'
            {
             before(grammarAccess.getGoBackwardAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGoBackwardAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTxtDsl.g:1543:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1547:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTxtDsl.g:1548:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTxtDsl.g:1555:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1559:1: ( ( ( '-' )? ) )
            // InternalTxtDsl.g:1560:1: ( ( '-' )? )
            {
            // InternalTxtDsl.g:1560:1: ( ( '-' )? )
            // InternalTxtDsl.g:1561:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTxtDsl.g:1562:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTxtDsl.g:1562:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTxtDsl.g:1570:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1574:1: ( rule__EInt__Group__1__Impl )
            // InternalTxtDsl.g:1575:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTxtDsl.g:1581:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1585:1: ( ( RULE_INT ) )
            // InternalTxtDsl.g:1586:1: ( RULE_INT )
            {
            // InternalTxtDsl.g:1586:1: ( RULE_INT )
            // InternalTxtDsl.g:1587:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Choreography__NameAssignment_2"
    // InternalTxtDsl.g:1597:1: rule__Choreography__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Choreography__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1601:1: ( ( ruleEString ) )
            // InternalTxtDsl.g:1602:2: ( ruleEString )
            {
            // InternalTxtDsl.g:1602:2: ( ruleEString )
            // InternalTxtDsl.g:1603:3: ruleEString
            {
             before(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__NameAssignment_2"


    // $ANTLR start "rule__Choreography__InstructionsAssignment_4_2"
    // InternalTxtDsl.g:1612:1: rule__Choreography__InstructionsAssignment_4_2 : ( ruleInstruction ) ;
    public final void rule__Choreography__InstructionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1616:1: ( ( ruleInstruction ) )
            // InternalTxtDsl.g:1617:2: ( ruleInstruction )
            {
            // InternalTxtDsl.g:1617:2: ( ruleInstruction )
            // InternalTxtDsl.g:1618:3: ruleInstruction
            {
             before(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__InstructionsAssignment_4_2"


    // $ANTLR start "rule__Choreography__InstructionsAssignment_4_3_1"
    // InternalTxtDsl.g:1627:1: rule__Choreography__InstructionsAssignment_4_3_1 : ( ruleInstruction ) ;
    public final void rule__Choreography__InstructionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1631:1: ( ( ruleInstruction ) )
            // InternalTxtDsl.g:1632:2: ( ruleInstruction )
            {
            // InternalTxtDsl.g:1632:2: ( ruleInstruction )
            // InternalTxtDsl.g:1633:3: ruleInstruction
            {
             before(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choreography__InstructionsAssignment_4_3_1"


    // $ANTLR start "rule__TurnLeft__AngleAssignment_3"
    // InternalTxtDsl.g:1642:1: rule__TurnLeft__AngleAssignment_3 : ( ruleEInt ) ;
    public final void rule__TurnLeft__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1646:1: ( ( ruleEInt ) )
            // InternalTxtDsl.g:1647:2: ( ruleEInt )
            {
            // InternalTxtDsl.g:1647:2: ( ruleEInt )
            // InternalTxtDsl.g:1648:3: ruleEInt
            {
             before(grammarAccess.getTurnLeftAccess().getAngleEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTurnLeftAccess().getAngleEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__AngleAssignment_3"


    // $ANTLR start "rule__TurnRight__AngleAssignment_3"
    // InternalTxtDsl.g:1657:1: rule__TurnRight__AngleAssignment_3 : ( ruleEInt ) ;
    public final void rule__TurnRight__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1661:1: ( ( ruleEInt ) )
            // InternalTxtDsl.g:1662:2: ( ruleEInt )
            {
            // InternalTxtDsl.g:1662:2: ( ruleEInt )
            // InternalTxtDsl.g:1663:3: ruleEInt
            {
             before(grammarAccess.getTurnRightAccess().getAngleEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTurnRightAccess().getAngleEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__AngleAssignment_3"


    // $ANTLR start "rule__GoForward__DistanceAssignment_3"
    // InternalTxtDsl.g:1672:1: rule__GoForward__DistanceAssignment_3 : ( ruleEInt ) ;
    public final void rule__GoForward__DistanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1676:1: ( ( ruleEInt ) )
            // InternalTxtDsl.g:1677:2: ( ruleEInt )
            {
            // InternalTxtDsl.g:1677:2: ( ruleEInt )
            // InternalTxtDsl.g:1678:3: ruleEInt
            {
             before(grammarAccess.getGoForwardAccess().getDistanceEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoForwardAccess().getDistanceEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoForward__DistanceAssignment_3"


    // $ANTLR start "rule__GoBackward__DistanceAssignment_3"
    // InternalTxtDsl.g:1687:1: rule__GoBackward__DistanceAssignment_3 : ( ruleEInt ) ;
    public final void rule__GoBackward__DistanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTxtDsl.g:1691:1: ( ( ruleEInt ) )
            // InternalTxtDsl.g:1692:2: ( ruleEInt )
            {
            // InternalTxtDsl.g:1692:2: ( ruleEInt )
            // InternalTxtDsl.g:1693:3: ruleEInt
            {
             before(grammarAccess.getGoBackwardAccess().getDistanceEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoBackwardAccess().getDistanceEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoBackward__DistanceAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002DF0800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}