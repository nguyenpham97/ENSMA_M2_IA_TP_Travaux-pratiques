package fr.ensma.idm.choreography.robottxtsyntax.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ensma.idm.choreography.robottxtsyntax.services.TxtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTxtDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Choreography'", "'{'", "'instructions'", "','", "'}'", "'PenDown'", "'PenUp'", "'Grab'", "'Release'", "'TurnLeft'", "'angle'", "'TurnRight'", "'GoForward'", "'distance'", "'GoBackward'", "'-'"
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

        public InternalTxtDslParser(TokenStream input, TxtDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Choreography";
       	}

       	@Override
       	protected TxtDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleChoreography"
    // InternalTxtDsl.g:64:1: entryRuleChoreography returns [EObject current=null] : iv_ruleChoreography= ruleChoreography EOF ;
    public final EObject entryRuleChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreography = null;


        try {
            // InternalTxtDsl.g:64:53: (iv_ruleChoreography= ruleChoreography EOF )
            // InternalTxtDsl.g:65:2: iv_ruleChoreography= ruleChoreography EOF
            {
             newCompositeNode(grammarAccess.getChoreographyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoreography=ruleChoreography();

            state._fsp--;

             current =iv_ruleChoreography; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // InternalTxtDsl.g:71:1: ruleChoreography returns [EObject current=null] : ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_instructions_6_0 = null;

        EObject lv_instructions_8_0 = null;



        	enterRule();

        try {
            // InternalTxtDsl.g:77:2: ( ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalTxtDsl.g:78:2: ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalTxtDsl.g:78:2: ( () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalTxtDsl.g:79:3: () otherlv_1= 'Choreography' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalTxtDsl.g:79:3: ()
            // InternalTxtDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChoreographyAccess().getChoreographyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getChoreographyAccess().getChoreographyKeyword_1());
            		
            // InternalTxtDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTxtDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalTxtDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalTxtDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChoreographyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoreographyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.ensma.idm.choreography.robottxtsyntax.TxtDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTxtDsl.g:113:3: (otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTxtDsl.g:114:4: otherlv_4= 'instructions' otherlv_5= '{' ( (lv_instructions_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getChoreographyAccess().getInstructionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getChoreographyAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTxtDsl.g:122:4: ( (lv_instructions_6_0= ruleInstruction ) )
                    // InternalTxtDsl.g:123:5: (lv_instructions_6_0= ruleInstruction )
                    {
                    // InternalTxtDsl.g:123:5: (lv_instructions_6_0= ruleInstruction )
                    // InternalTxtDsl.g:124:6: lv_instructions_6_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_instructions_6_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    						}
                    						add(
                    							current,
                    							"instructions",
                    							lv_instructions_6_0,
                    							"fr.ensma.idm.choreography.robottxtsyntax.TxtDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTxtDsl.g:141:4: (otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTxtDsl.g:142:5: otherlv_7= ',' ( (lv_instructions_8_0= ruleInstruction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getChoreographyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTxtDsl.g:146:5: ( (lv_instructions_8_0= ruleInstruction ) )
                    	    // InternalTxtDsl.g:147:6: (lv_instructions_8_0= ruleInstruction )
                    	    {
                    	    // InternalTxtDsl.g:147:6: (lv_instructions_8_0= ruleInstruction )
                    	    // InternalTxtDsl.g:148:7: lv_instructions_8_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getChoreographyAccess().getInstructionsInstructionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_instructions_8_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChoreographyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instructions",
                    	    								lv_instructions_8_0,
                    	    								"fr.ensma.idm.choreography.robottxtsyntax.TxtDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getChoreographyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleInstruction"
    // InternalTxtDsl.g:179:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalTxtDsl.g:179:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalTxtDsl.g:180:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalTxtDsl.g:186:1: ruleInstruction returns [EObject current=null] : (this_Choreography_0= ruleChoreography | this_PenDown_1= rulePenDown | this_PenUp_2= rulePenUp | this_Grab_3= ruleGrab | this_Release_4= ruleRelease | this_TurnLeft_5= ruleTurnLeft | this_TurnRight_6= ruleTurnRight | this_GoForward_7= ruleGoForward | this_GoBackward_8= ruleGoBackward ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Choreography_0 = null;

        EObject this_PenDown_1 = null;

        EObject this_PenUp_2 = null;

        EObject this_Grab_3 = null;

        EObject this_Release_4 = null;

        EObject this_TurnLeft_5 = null;

        EObject this_TurnRight_6 = null;

        EObject this_GoForward_7 = null;

        EObject this_GoBackward_8 = null;



        	enterRule();

        try {
            // InternalTxtDsl.g:192:2: ( (this_Choreography_0= ruleChoreography | this_PenDown_1= rulePenDown | this_PenUp_2= rulePenUp | this_Grab_3= ruleGrab | this_Release_4= ruleRelease | this_TurnLeft_5= ruleTurnLeft | this_TurnRight_6= ruleTurnRight | this_GoForward_7= ruleGoForward | this_GoBackward_8= ruleGoBackward ) )
            // InternalTxtDsl.g:193:2: (this_Choreography_0= ruleChoreography | this_PenDown_1= rulePenDown | this_PenUp_2= rulePenUp | this_Grab_3= ruleGrab | this_Release_4= ruleRelease | this_TurnLeft_5= ruleTurnLeft | this_TurnRight_6= ruleTurnRight | this_GoForward_7= ruleGoForward | this_GoBackward_8= ruleGoBackward )
            {
            // InternalTxtDsl.g:193:2: (this_Choreography_0= ruleChoreography | this_PenDown_1= rulePenDown | this_PenUp_2= rulePenUp | this_Grab_3= ruleGrab | this_Release_4= ruleRelease | this_TurnLeft_5= ruleTurnLeft | this_TurnRight_6= ruleTurnRight | this_GoForward_7= ruleGoForward | this_GoBackward_8= ruleGoBackward )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            case 23:
                {
                alt3=8;
                }
                break;
            case 25:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTxtDsl.g:194:3: this_Choreography_0= ruleChoreography
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getChoreographyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choreography_0=ruleChoreography();

                    state._fsp--;


                    			current = this_Choreography_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTxtDsl.g:203:3: this_PenDown_1= rulePenDown
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PenDown_1=rulePenDown();

                    state._fsp--;


                    			current = this_PenDown_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTxtDsl.g:212:3: this_PenUp_2= rulePenUp
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PenUp_2=rulePenUp();

                    state._fsp--;


                    			current = this_PenUp_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTxtDsl.g:221:3: this_Grab_3= ruleGrab
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGrabParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Grab_3=ruleGrab();

                    state._fsp--;


                    			current = this_Grab_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTxtDsl.g:230:3: this_Release_4= ruleRelease
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getReleaseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Release_4=ruleRelease();

                    state._fsp--;


                    			current = this_Release_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTxtDsl.g:239:3: this_TurnLeft_5= ruleTurnLeft
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getTurnLeftParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnLeft_5=ruleTurnLeft();

                    state._fsp--;


                    			current = this_TurnLeft_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTxtDsl.g:248:3: this_TurnRight_6= ruleTurnRight
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getTurnRightParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnRight_6=ruleTurnRight();

                    state._fsp--;


                    			current = this_TurnRight_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTxtDsl.g:257:3: this_GoForward_7= ruleGoForward
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGoForwardParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoForward_7=ruleGoForward();

                    state._fsp--;


                    			current = this_GoForward_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTxtDsl.g:266:3: this_GoBackward_8= ruleGoBackward
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getGoBackwardParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoBackward_8=ruleGoBackward();

                    state._fsp--;


                    			current = this_GoBackward_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleEString"
    // InternalTxtDsl.g:278:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTxtDsl.g:278:47: (iv_ruleEString= ruleEString EOF )
            // InternalTxtDsl.g:279:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTxtDsl.g:285:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTxtDsl.g:291:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTxtDsl.g:292:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTxtDsl.g:292:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTxtDsl.g:293:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTxtDsl.g:301:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePenDown"
    // InternalTxtDsl.g:312:1: entryRulePenDown returns [EObject current=null] : iv_rulePenDown= rulePenDown EOF ;
    public final EObject entryRulePenDown() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenDown = null;


        try {
            // InternalTxtDsl.g:312:48: (iv_rulePenDown= rulePenDown EOF )
            // InternalTxtDsl.g:313:2: iv_rulePenDown= rulePenDown EOF
            {
             newCompositeNode(grammarAccess.getPenDownRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePenDown=rulePenDown();

            state._fsp--;

             current =iv_rulePenDown; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenDown"


    // $ANTLR start "rulePenDown"
    // InternalTxtDsl.g:319:1: rulePenDown returns [EObject current=null] : ( () otherlv_1= 'PenDown' ) ;
    public final EObject rulePenDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTxtDsl.g:325:2: ( ( () otherlv_1= 'PenDown' ) )
            // InternalTxtDsl.g:326:2: ( () otherlv_1= 'PenDown' )
            {
            // InternalTxtDsl.g:326:2: ( () otherlv_1= 'PenDown' )
            // InternalTxtDsl.g:327:3: () otherlv_1= 'PenDown'
            {
            // InternalTxtDsl.g:327:3: ()
            // InternalTxtDsl.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPenDownAccess().getPenDownAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPenDownAccess().getPenDownKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenDown"


    // $ANTLR start "entryRulePenUp"
    // InternalTxtDsl.g:342:1: entryRulePenUp returns [EObject current=null] : iv_rulePenUp= rulePenUp EOF ;
    public final EObject entryRulePenUp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenUp = null;


        try {
            // InternalTxtDsl.g:342:46: (iv_rulePenUp= rulePenUp EOF )
            // InternalTxtDsl.g:343:2: iv_rulePenUp= rulePenUp EOF
            {
             newCompositeNode(grammarAccess.getPenUpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePenUp=rulePenUp();

            state._fsp--;

             current =iv_rulePenUp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenUp"


    // $ANTLR start "rulePenUp"
    // InternalTxtDsl.g:349:1: rulePenUp returns [EObject current=null] : ( () otherlv_1= 'PenUp' ) ;
    public final EObject rulePenUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTxtDsl.g:355:2: ( ( () otherlv_1= 'PenUp' ) )
            // InternalTxtDsl.g:356:2: ( () otherlv_1= 'PenUp' )
            {
            // InternalTxtDsl.g:356:2: ( () otherlv_1= 'PenUp' )
            // InternalTxtDsl.g:357:3: () otherlv_1= 'PenUp'
            {
            // InternalTxtDsl.g:357:3: ()
            // InternalTxtDsl.g:358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPenUpAccess().getPenUpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPenUpAccess().getPenUpKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenUp"


    // $ANTLR start "entryRuleGrab"
    // InternalTxtDsl.g:372:1: entryRuleGrab returns [EObject current=null] : iv_ruleGrab= ruleGrab EOF ;
    public final EObject entryRuleGrab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrab = null;


        try {
            // InternalTxtDsl.g:372:45: (iv_ruleGrab= ruleGrab EOF )
            // InternalTxtDsl.g:373:2: iv_ruleGrab= ruleGrab EOF
            {
             newCompositeNode(grammarAccess.getGrabRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrab=ruleGrab();

            state._fsp--;

             current =iv_ruleGrab; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrab"


    // $ANTLR start "ruleGrab"
    // InternalTxtDsl.g:379:1: ruleGrab returns [EObject current=null] : ( () otherlv_1= 'Grab' ) ;
    public final EObject ruleGrab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTxtDsl.g:385:2: ( ( () otherlv_1= 'Grab' ) )
            // InternalTxtDsl.g:386:2: ( () otherlv_1= 'Grab' )
            {
            // InternalTxtDsl.g:386:2: ( () otherlv_1= 'Grab' )
            // InternalTxtDsl.g:387:3: () otherlv_1= 'Grab'
            {
            // InternalTxtDsl.g:387:3: ()
            // InternalTxtDsl.g:388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGrabAccess().getGrabAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGrabAccess().getGrabKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrab"


    // $ANTLR start "entryRuleRelease"
    // InternalTxtDsl.g:402:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalTxtDsl.g:402:48: (iv_ruleRelease= ruleRelease EOF )
            // InternalTxtDsl.g:403:2: iv_ruleRelease= ruleRelease EOF
            {
             newCompositeNode(grammarAccess.getReleaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelease=ruleRelease();

            state._fsp--;

             current =iv_ruleRelease; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // InternalTxtDsl.g:409:1: ruleRelease returns [EObject current=null] : ( () otherlv_1= 'Release' ) ;
    public final EObject ruleRelease() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTxtDsl.g:415:2: ( ( () otherlv_1= 'Release' ) )
            // InternalTxtDsl.g:416:2: ( () otherlv_1= 'Release' )
            {
            // InternalTxtDsl.g:416:2: ( () otherlv_1= 'Release' )
            // InternalTxtDsl.g:417:3: () otherlv_1= 'Release'
            {
            // InternalTxtDsl.g:417:3: ()
            // InternalTxtDsl.g:418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReleaseAccess().getReleaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReleaseAccess().getReleaseKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalTxtDsl.g:432:1: entryRuleTurnLeft returns [EObject current=null] : iv_ruleTurnLeft= ruleTurnLeft EOF ;
    public final EObject entryRuleTurnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnLeft = null;


        try {
            // InternalTxtDsl.g:432:49: (iv_ruleTurnLeft= ruleTurnLeft EOF )
            // InternalTxtDsl.g:433:2: iv_ruleTurnLeft= ruleTurnLeft EOF
            {
             newCompositeNode(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnLeft=ruleTurnLeft();

            state._fsp--;

             current =iv_ruleTurnLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalTxtDsl.g:439:1: ruleTurnLeft returns [EObject current=null] : (otherlv_0= 'TurnLeft' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleTurnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_angle_3_0 = null;



        	enterRule();

        try {
            // InternalTxtDsl.g:445:2: ( (otherlv_0= 'TurnLeft' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalTxtDsl.g:446:2: (otherlv_0= 'TurnLeft' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalTxtDsl.g:446:2: (otherlv_0= 'TurnLeft' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalTxtDsl.g:447:3: otherlv_0= 'TurnLeft' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnLeftAccess().getTurnLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnLeftAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnLeftAccess().getAngleKeyword_2());
            		
            // InternalTxtDsl.g:459:3: ( (lv_angle_3_0= ruleEInt ) )
            // InternalTxtDsl.g:460:4: (lv_angle_3_0= ruleEInt )
            {
            // InternalTxtDsl.g:460:4: (lv_angle_3_0= ruleEInt )
            // InternalTxtDsl.g:461:5: lv_angle_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTurnLeftAccess().getAngleEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_angle_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnLeftRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_3_0,
            						"fr.ensma.idm.choreography.robottxtsyntax.TxtDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTurnLeftAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalTxtDsl.g:486:1: entryRuleTurnRight returns [EObject current=null] : iv_ruleTurnRight= ruleTurnRight EOF ;
    public final EObject entryRuleTurnRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRight = null;


        try {
            // InternalTxtDsl.g:486:50: (iv_ruleTurnRight= ruleTurnRight EOF )
            // InternalTxtDsl.g:487:2: iv_ruleTurnRight= ruleTurnRight EOF
            {
             newCompositeNode(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnRight=ruleTurnRight();

            state._fsp--;

             current =iv_ruleTurnRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalTxtDsl.g:493:1: ruleTurnRight returns [EObject current=null] : (otherlv_0= 'TurnRight' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleTurnRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_angle_3_0 = null;



        	enterRule();

        try {
            // InternalTxtDsl.g:499:2: ( (otherlv_0= 'TurnRight' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalTxtDsl.g:500:2: (otherlv_0= 'TurnRight' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalTxtDsl.g:500:2: (otherlv_0= 'TurnRight' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalTxtDsl.g:501:3: otherlv_0= 'TurnRight' otherlv_1= '{' otherlv_2= 'angle' ( (lv_angle_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnRightAccess().getTurnRightKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnRightAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnRightAccess().getAngleKeyword_2());
            		
            // InternalTxtDsl.g:513:3: ( (lv_angle_3_0= ruleEInt ) )
            // InternalTxtDsl.g:514:4: (lv_angle_3_0= ruleEInt )
            {
            // InternalTxtDsl.g:514:4: (lv_angle_3_0= ruleEInt )
            // InternalTxtDsl.g:515:5: lv_angle_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTurnRightAccess().getAngleEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_angle_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnRightRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_3_0,
            						"fr.ensma.idm.choreography.robottxtsyntax.TxtDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTurnRightAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "entryRuleGoForward"
    // InternalTxtDsl.g:540:1: entryRuleGoForward returns [EObject current=null] : iv_ruleGoForward= ruleGoForward EOF ;
    public final EObject entryRuleGoForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoForward = null;


        try {
            // InternalTxtDsl.g:540:50: (iv_ruleGoForward= ruleGoForward EOF )
            // InternalTxtDsl.g:541:2: iv_ruleGoForward= ruleGoForward EOF
            {
             newCompositeNode(grammarAccess.getGoForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoForward=ruleGoForward();

            state._fsp--;

             current =iv_ruleGoForward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoForward"


    // $ANTLR start "ruleGoForward"
    // InternalTxtDsl.g:547:1: ruleGoForward returns [EObject current=null] : (otherlv_0= 'GoForward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleGoForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_distance_3_0 = null;



        	enterRule();

        try {
            // InternalTxtDsl.g:553:2: ( (otherlv_0= 'GoForward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalTxtDsl.g:554:2: (otherlv_0= 'GoForward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalTxtDsl.g:554:2: (otherlv_0= 'GoForward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalTxtDsl.g:555:3: otherlv_0= 'GoForward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGoForwardAccess().getGoForwardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getGoForwardAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGoForwardAccess().getDistanceKeyword_2());
            		
            // InternalTxtDsl.g:567:3: ( (lv_distance_3_0= ruleEInt ) )
            // InternalTxtDsl.g:568:4: (lv_distance_3_0= ruleEInt )
            {
            // InternalTxtDsl.g:568:4: (lv_distance_3_0= ruleEInt )
            // InternalTxtDsl.g:569:5: lv_distance_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGoForwardAccess().getDistanceEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_distance_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoForwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_3_0,
            						"fr.ensma.idm.choreography.robottxtsyntax.TxtDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGoForwardAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoForward"


    // $ANTLR start "entryRuleGoBackward"
    // InternalTxtDsl.g:594:1: entryRuleGoBackward returns [EObject current=null] : iv_ruleGoBackward= ruleGoBackward EOF ;
    public final EObject entryRuleGoBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoBackward = null;


        try {
            // InternalTxtDsl.g:594:51: (iv_ruleGoBackward= ruleGoBackward EOF )
            // InternalTxtDsl.g:595:2: iv_ruleGoBackward= ruleGoBackward EOF
            {
             newCompositeNode(grammarAccess.getGoBackwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoBackward=ruleGoBackward();

            state._fsp--;

             current =iv_ruleGoBackward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoBackward"


    // $ANTLR start "ruleGoBackward"
    // InternalTxtDsl.g:601:1: ruleGoBackward returns [EObject current=null] : (otherlv_0= 'GoBackward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleGoBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_distance_3_0 = null;



        	enterRule();

        try {
            // InternalTxtDsl.g:607:2: ( (otherlv_0= 'GoBackward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalTxtDsl.g:608:2: (otherlv_0= 'GoBackward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalTxtDsl.g:608:2: (otherlv_0= 'GoBackward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalTxtDsl.g:609:3: otherlv_0= 'GoBackward' otherlv_1= '{' otherlv_2= 'distance' ( (lv_distance_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGoBackwardAccess().getGoBackwardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getGoBackwardAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGoBackwardAccess().getDistanceKeyword_2());
            		
            // InternalTxtDsl.g:621:3: ( (lv_distance_3_0= ruleEInt ) )
            // InternalTxtDsl.g:622:4: (lv_distance_3_0= ruleEInt )
            {
            // InternalTxtDsl.g:622:4: (lv_distance_3_0= ruleEInt )
            // InternalTxtDsl.g:623:5: lv_distance_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGoBackwardAccess().getDistanceEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_distance_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoBackwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_3_0,
            						"fr.ensma.idm.choreography.robottxtsyntax.TxtDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGoBackwardAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoBackward"


    // $ANTLR start "entryRuleEInt"
    // InternalTxtDsl.g:648:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTxtDsl.g:648:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTxtDsl.g:649:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTxtDsl.g:655:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTxtDsl.g:661:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTxtDsl.g:662:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTxtDsl.g:662:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTxtDsl.g:663:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTxtDsl.g:663:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTxtDsl.g:664:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002DF0800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});

}