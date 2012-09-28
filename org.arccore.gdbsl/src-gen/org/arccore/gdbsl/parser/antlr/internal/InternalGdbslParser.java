package org.arccore.gdbsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.arccore.gdbsl.services.GdbslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGdbslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'import'", "'.*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=5;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalGdbslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGdbslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGdbslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g"; }



     	private GdbslGrammarAccess grammarAccess;
     	
        public InternalGdbslParser(TokenStream input, GdbslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected GdbslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:67:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:68:2: (iv_ruleScript= ruleScript EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:69:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:76:1: ruleScript returns [EObject current=null] : ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) ) (otherlv_3= ';' )? )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_imports_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:79:28: ( ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) ) (otherlv_3= ';' )? )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:80:1: ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) ) (otherlv_3= ';' )? )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:80:1: ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) ) (otherlv_3= ';' )? )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:80:2: () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) ) (otherlv_3= ';' )? )*
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:80:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScriptAccess().getScriptAction_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:86:2: ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) ) (otherlv_3= ';' )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==14||LA3_0==26||(LA3_0>=33 && LA3_0<=34)||LA3_0==39||LA3_0==45||LA3_0==47||LA3_0==50||LA3_0==52||LA3_0==54||(LA3_0>=58 && LA3_0<=63)||(LA3_0>=65 && LA3_0<=72)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:86:3: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:86:3: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) | ( (lv_imports_2_0= ruleImport ) ) )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||LA1_0==26||(LA1_0>=33 && LA1_0<=34)||LA1_0==39||LA1_0==45||LA1_0==47||LA1_0==50||LA1_0==52||LA1_0==54||(LA1_0>=58 && LA1_0<=63)||(LA1_0>=65 && LA1_0<=72)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:86:4: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:86:4: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:88:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getScriptAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleScript142);
            	            lv_expressions_1_0=ruleXExpressionInsideBlock();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"expressions",
            	                      		lv_expressions_1_0, 
            	                      		"XExpressionInsideBlock");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:105:6: ( (lv_imports_2_0= ruleImport ) )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:105:6: ( (lv_imports_2_0= ruleImport ) )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:106:1: (lv_imports_2_0= ruleImport )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:106:1: (lv_imports_2_0= ruleImport )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:107:3: lv_imports_2_0= ruleImport
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getScriptAccess().getImportsImportParserRuleCall_1_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImport_in_ruleScript169);
            	            lv_imports_2_0=ruleImport();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"imports",
            	                      		lv_imports_2_0, 
            	                      		"Import");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:123:3: (otherlv_3= ';' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:123:5: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleScript183); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleImport"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:135:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:136:2: (iv_ruleImport= ruleImport EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:137:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport223);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:144:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:147:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:148:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:148:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:148:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:152:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:153:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:153:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:154:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:178:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:179:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:180:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard328);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:187:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:190:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:191:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:191:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:192:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard386);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:202:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:203:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleXExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:216:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:217:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:218:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression447);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression457); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:225:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:228:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:230:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression503);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:246:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:247:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:248:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment537);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:255:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:258:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:259:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:259:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_STRING && LA6_1<=RULE_ID)||(LA6_1>=13 && LA6_1<=14)||(LA6_1>=17 && LA6_1<=47)||(LA6_1>=49 && LA6_1<=74)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==16) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_DECIMAL)||LA6_0==26||(LA6_0>=33 && LA6_0<=34)||LA6_0==39||LA6_0==45||LA6_0==47||LA6_0==50||LA6_0==52||LA6_0==54||(LA6_0>=58 && LA6_0<=60)||LA6_0==63||(LA6_0>=65 && LA6_0<=72)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:259:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:259:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:259:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:259:3: ()
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:260:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:265:2: ( ( ruleValidID ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:266:1: ( ruleValidID )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:266:1: ( ruleValidID )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:267:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment605);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment621);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:288:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:289:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:289:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:290:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment641);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:307:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:307:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:308:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment671);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalGdbsl()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:321:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:321:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:321:7: ()
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:322:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:327:2: ( ( ruleOpMultiAssign ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:328:1: ( ruleOpMultiAssign )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:328:1: ( ruleOpMultiAssign )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:329:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment724);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:342:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:343:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:343:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:344:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment747);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:368:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:369:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:370:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign787);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign798); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:377:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:380:28: (kw= '=' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:382:2: kw= '='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpSingleAssign835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:395:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:396:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:397:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign875);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign886); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:404:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:407:28: (kw= '+=' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:409:2: kw= '+='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMultiAssign923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:422:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:423:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:424:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression962);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression972); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:431:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:434:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:435:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:435:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:436:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1019);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalGdbsl()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:449:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:449:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:449:7: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:450:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:455:2: ( ( ruleOpOr ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:456:1: ( ruleOpOr )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:456:1: ( ruleOpOr )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:457:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1072);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:470:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:471:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:471:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:472:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1095);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:496:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:497:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:498:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1134);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1145); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:505:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:508:28: (kw= '||' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:510:2: kw= '||'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpOr1182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:523:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:524:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:525:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1221);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1231); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:532:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:535:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:536:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:536:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:537:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1278);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalGdbsl()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:550:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:550:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:550:7: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:551:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:556:2: ( ( ruleOpAnd ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:557:1: ( ruleOpAnd )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:557:1: ( ruleOpAnd )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:558:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1331);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:571:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:572:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:572:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:573:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1354);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:597:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:598:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:599:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1393);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1404); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:606:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:609:28: (kw= '&&' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:611:2: kw= '&&'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpAnd1441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:624:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:625:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:626:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1480);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1490); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:633:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:636:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:637:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:637:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:638:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1537);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalGdbsl()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==21) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalGdbsl()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:651:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:651:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:651:7: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:652:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:657:2: ( ( ruleOpEquality ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:658:1: ( ruleOpEquality )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:658:1: ( ruleOpEquality )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:659:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1590);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:672:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:673:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:673:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:674:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1613);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:698:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:699:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:700:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1652);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1663); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:707:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:710:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:711:1: (kw= '==' | kw= '!=' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:711:1: (kw= '==' | kw= '!=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:712:2: kw= '=='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:719:2: kw= '!='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:732:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:733:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:734:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1760);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1770); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:741:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:744:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:745:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:745:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:746:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1817);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred6_InternalGdbsl()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalGdbsl()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred5_InternalGdbsl()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalGdbsl()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalGdbsl()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:756:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:756:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:756:6: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:757:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXRelationalExpression1853); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:766:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:767:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:767:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:768:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1876);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:790:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:790:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:790:7: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:791:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:796:2: ( ( ruleOpCompare ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:797:1: ( ruleOpCompare )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:797:1: ( ruleOpCompare )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:798:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1937);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:811:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:812:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:812:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:813:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1960);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:837:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:838:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:839:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2000);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2011); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:846:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:849:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:850:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:850:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:851:2: kw= '>='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare2049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:858:2: kw= '<='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:865:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:872:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:885:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:886:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:887:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2146);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2156); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:894:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:897:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:898:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:898:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:899:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2203);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:912:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:912:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:912:7: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:913:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:918:2: ( ( ruleOpOther ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:919:1: ( ruleOpOther )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:919:1: ( ruleOpOther )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:920:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2256);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:933:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:934:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:934:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:935:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2279);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:959:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:960:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:961:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2318);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2329); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:968:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:971:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:972:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:972:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            case 26:
                {
                alt16=5;
                }
                break;
            case 30:
                {
                alt16=6;
                }
                break;
            case 31:
                {
                alt16=7;
                }
                break;
            case 32:
                {
                alt16=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:973:2: kw= '->'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:980:2: kw= '..'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:987:2: kw= '=>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:993:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:993:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:994:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:999:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==25) && (synpred8_InternalGdbsl())) {
                            alt14=1;
                        }
                        else if ( (LA14_1==EOF||(LA14_1>=RULE_STRING && LA14_1<=RULE_ID)||LA14_1==26||(LA14_1>=33 && LA14_1<=34)||LA14_1==39||LA14_1==45||LA14_1==47||LA14_1==50||LA14_1==52||LA14_1==54||(LA14_1>=58 && LA14_1<=60)||LA14_1==63||(LA14_1>=65 && LA14_1<=72)) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:999:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:999:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:999:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1003:5: (kw= '>' kw= '>' )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1004:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2456); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2469); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1017:2: kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2490); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1023:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1023:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1024:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1029:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==26) ) {
                        int LA15_1 = input.LA(2);

                        if ( (synpred9_InternalGdbsl()) ) {
                            alt15=1;
                        }
                        else if ( (true) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1029:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1029:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1029:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1033:5: (kw= '<' kw= '<' )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1034:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2543); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2556); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1047:2: kw= '<'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2577); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1054:2: kw= '<>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1061:2: kw= '?:'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1068:2: kw= '<=>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1081:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1082:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1083:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2676);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2686); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1090:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1093:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1094:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1094:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1095:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2733);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred10_InternalGdbsl()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==34) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred10_InternalGdbsl()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1108:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1108:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1108:7: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1114:2: ( ( ruleOpAdd ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1115:1: ( ruleOpAdd )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1115:1: ( ruleOpAdd )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1116:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2786);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1129:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1130:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1130:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1131:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2809);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1155:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1156:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1157:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2848);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2859); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1164:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1167:28: ( (kw= '+' | kw= '-' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1168:1: (kw= '+' | kw= '-' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1168:1: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1169:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd2897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1176:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd2916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1189:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1190:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1191:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2956);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2966); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1198:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1201:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1202:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1202:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1203:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3013);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred11_InternalGdbsl()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred11_InternalGdbsl()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred11_InternalGdbsl()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred11_InternalGdbsl()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1216:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1216:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1216:7: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1217:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1222:2: ( ( ruleOpMulti ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1223:1: ( ruleOpMulti )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1223:1: ( ruleOpMulti )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1224:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3066);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1237:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1238:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1238:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1239:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3089);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1263:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1264:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1265:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3128);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3139); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1272:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1275:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1276:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1276:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt20=1;
                }
                break;
            case 36:
                {
                alt20=2;
                }
                break;
            case 37:
                {
                alt20=3;
                }
                break;
            case 38:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1277:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1284:2: kw= '**'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1291:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1298:2: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1311:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1312:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1313:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3274);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3284); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1320:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1323:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1324:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1324:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=33 && LA21_0<=34)||LA21_0==39) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||LA21_0==26||LA21_0==45||LA21_0==47||LA21_0==50||LA21_0==52||LA21_0==54||(LA21_0>=58 && LA21_0<=60)||LA21_0==63||(LA21_0>=65 && LA21_0<=72)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1324:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1324:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1324:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1324:3: ()
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1325:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1330:2: ( ( ruleOpUnary ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1331:1: ( ruleOpUnary )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1331:1: ( ruleOpUnary )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1332:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3342);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1345:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1346:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1346:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1347:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3363);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1365:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3392);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1381:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1382:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1383:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3428);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3439); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1390:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1393:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1394:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1394:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1395:2: kw= '!'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary3477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1402:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1409:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1422:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1423:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1424:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3555);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3565); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1431:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1434:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1435:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1435:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1436:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3612);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred12_InternalGdbsl()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1446:5: ( () otherlv_2= 'as' )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1446:6: () otherlv_2= 'as'
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1446:6: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1447:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXCastedExpression3647); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1456:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1457:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1457:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1458:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3670);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1482:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1483:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1484:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3708);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3718); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1491:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1494:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1495:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1495:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1496:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3765);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred13_InternalGdbsl()) ) {
                        alt31=1;
                    }
                    else if ( (synpred14_InternalGdbsl()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred14_InternalGdbsl()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred14_InternalGdbsl()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1510:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1510:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1510:26: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1511:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3814); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1520:1: ( ( ruleValidID ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1521:1: ( ruleValidID )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1521:1: ( ruleValidID )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1522:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3837);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3853);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1543:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1544:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1544:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1545:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3875);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1578:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1578:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1578:8: ()
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1579:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1584:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1584:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3961); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1589:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1589:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1590:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1590:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1591:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3985); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1605:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1605:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1606:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1606:1: (lv_spreading_9_0= '*.' )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1607:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4022); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1620:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==26) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1620:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4051); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1624:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1625:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1625:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1626:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4072);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1642:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==44) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1642:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4085); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1646:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1647:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1647:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1648:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4106);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop25;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall4120); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1668:3: ( ( ruleValidID ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1669:1: ( ruleValidID )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1669:1: ( ruleValidID )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1670:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4145);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1683:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1683:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1683:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1683:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1690:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1691:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4179); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1721:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1722:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4264);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1739:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1739:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1739:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1739:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1740:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1740:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1741:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4292);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1757:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==44) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1757:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4305); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1761:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1762:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1762:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1763:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4326);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop27;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4343); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1783:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1783:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1786:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1787:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4378);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1811:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1812:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1813:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4418);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4428); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1820:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1823:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1824:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1824:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1825:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4475);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1835:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4502);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1845:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4529);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1855:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4556);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1865:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4583);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1875:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4610);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1885:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4637);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1895:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4664);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1905:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4691);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1915:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4718);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1925:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4745);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1935:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4772);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1945:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4799);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1961:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1962:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1963:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4834);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4844); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1970:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1973:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt33=6;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) && (synpred18_InternalGdbsl())) {
                alt33=1;
            }
            else if ( ((LA33_0>=66 && LA33_0<=67)) ) {
                alt33=2;
            }
            else if ( ((LA33_0>=RULE_HEX && LA33_0<=RULE_DECIMAL)) ) {
                alt33=3;
            }
            else if ( (LA33_0==68) ) {
                alt33=4;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=5;
            }
            else if ( (LA33_0==69) ) {
                alt33=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4904);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1987:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4932);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1997:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4959);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2007:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4986);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2017:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5013);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2027:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5040);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2043:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2044:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2045:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5075);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5085); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2052:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2055:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2056:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2056:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2056:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2056:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2056:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2058:5: ( () otherlv_1= '[' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2058:6: () otherlv_1= '['
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2058:6: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2059:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2083:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2083:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2083:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==29||LA35_0==45) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2083:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2083:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2084:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2084:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2085:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5218);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2101:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==44) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2101:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5231); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2105:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2106:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2106:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2107:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5252);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2123:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2124:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2124:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2125:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2138:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2139:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2139:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2140:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5311);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2168:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2169:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2170:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5359);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5369); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2177:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2180:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2181:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2181:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2181:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2181:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2182:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2187:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==26||(LA38_0>=33 && LA38_0<=34)||LA38_0==39||LA38_0==45||LA38_0==47||LA38_0==50||LA38_0==52||LA38_0==54||(LA38_0>=58 && LA38_0<=63)||(LA38_0>=65 && LA38_0<=72)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2187:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2187:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2188:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2188:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2189:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5425);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2205:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==13) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2205:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure5438); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2217:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2218:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2219:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5478);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5488); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2226:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2229:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2230:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2230:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2230:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2230:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2230:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2246:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2246:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2246:7: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2247:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2252:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==29||LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2252:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2252:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2253:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2253:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2254:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5596);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2270:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==44) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2270:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXShortClosure5609); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2274:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2275:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2275:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2276:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5630);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2292:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2293:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2293:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2294:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure5652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2307:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2308:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2308:1: (lv_expression_5_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2309:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5688);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2333:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2334:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2335:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5724);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5734); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2342:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2345:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2346:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2346:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2346:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression5771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5793);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression5804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2371:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2372:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2373:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5840);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5850); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2380:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2383:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2384:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2384:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2384:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2384:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2385:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression5896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2398:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2399:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2399:1: (lv_if_3_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2400:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5929);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2420:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2421:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2421:1: (lv_then_5_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2422:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5962);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2438:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred22_InternalGdbsl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2438:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2438:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2438:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression5983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2443:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2444:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2444:1: (lv_else_7_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2445:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6005);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2469:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2470:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2471:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6043);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2478:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2481:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2482:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2482:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2482:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2482:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2483:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||LA43_0==26||(LA43_0>=33 && LA43_0<=34)||LA43_0==39||LA43_0==47||LA43_0==50||LA43_0==52||LA43_0==54||(LA43_0>=58 && LA43_0<=60)||LA43_0==63||(LA43_0>=65 && LA43_0<=72)) ) {
                alt43=1;
            }
            else if ( (LA43_0==45) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( ((LA43_3>=16 && LA43_3<=38)||(LA43_3>=40 && LA43_3<=43)||(LA43_3>=45 && LA43_3<=47)||LA43_3==64) ) {
                        alt43=1;
                    }
                    else if ( (LA43_3==53) && (synpred24_InternalGdbsl())) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA43_2>=RULE_STRING && LA43_2<=RULE_DECIMAL)||LA43_2==26||(LA43_2>=33 && LA43_2<=34)||LA43_2==39||LA43_2==45||LA43_2==47||LA43_2==50||LA43_2==52||LA43_2==54||(LA43_2>=58 && LA43_2<=60)||LA43_2==63||(LA43_2>=65 && LA43_2<=72)) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==53) && (synpred23_InternalGdbsl())) {
                            alt42=1;
                        }
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2497:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2497:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2497:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2498:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2498:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2499:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6142);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6154); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2519:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2520:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2520:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2521:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6178);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2544:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2544:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression6222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2548:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2549:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2549:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2550:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6243);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2570:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2571:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2571:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2572:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6278);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2596:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==29||LA44_0==45||LA44_0==53||LA44_0==57) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2597:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2597:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2598:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6325);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2614:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2614:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2622:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2623:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2623:1: (lv_default_14_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2624:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6372);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2652:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2653:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2654:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6422);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2661:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2664:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2665:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2665:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2665:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2665:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==29||LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2666:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2666:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2667:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6478);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2683:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2683:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart6492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2687:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2688:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2688:1: (lv_case_2_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2689:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6513);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart6527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2709:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2710:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2710:1: (lv_then_4_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2711:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6548);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2735:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2736:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2737:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6584);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6594); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2744:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2747:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2748:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2748:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2748:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2748:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2749:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXForLoopExpression6640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression6652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2762:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2763:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2763:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2764:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6673);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2784:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2785:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2785:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2786:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6706);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2806:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2807:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2807:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2808:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6739);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2832:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2833:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2834:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6775);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6785); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2841:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2844:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2845:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2845:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2845:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2845:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2846:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXWhileExpression6831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression6843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2859:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2860:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2860:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2861:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6864);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression6876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2881:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2882:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2882:1: (lv_body_5_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2883:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6897);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2907:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2908:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2909:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6933);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6943); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2916:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2919:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2920:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2920:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2920:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2920:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2921:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression6989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2930:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2931:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2931:1: (lv_body_2_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2932:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7010);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression7022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression7034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2956:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2957:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2957:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2958:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7055);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression7067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2986:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2987:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2988:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7103);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7113); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2995:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2998:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2999:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2999:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2999:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2999:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3000:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3009:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==26||(LA49_0>=33 && LA49_0<=34)||LA49_0==39||LA49_0==45||LA49_0==47||LA49_0==50||LA49_0==52||LA49_0==54||(LA49_0>=58 && LA49_0<=63)||(LA49_0>=65 && LA49_0<=72)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3009:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3009:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3010:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3010:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3011:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7181);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3027:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==13) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3027:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7194); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression7210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3043:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3044:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3045:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7246);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7256); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3052:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3055:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3056:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3056:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=61 && LA50_0<=62)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)||LA50_0==26||(LA50_0>=33 && LA50_0<=34)||LA50_0==39||LA50_0==45||LA50_0==47||LA50_0==50||LA50_0==52||LA50_0==54||(LA50_0>=58 && LA50_0<=60)||LA50_0==63||(LA50_0>=65 && LA50_0<=72)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3057:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7303);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3067:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7330);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3083:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3084:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3085:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7365);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7375); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3092:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3095:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3096:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3096:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3096:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3096:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3097:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3102:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            else if ( (LA51_0==62) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3102:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3102:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3103:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3103:1: (lv_writeable_1_0= 'var' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3104:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3118:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred25_InternalGdbsl()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==45) && (synpred25_InternalGdbsl())) {
                alt52=1;
            }
            else if ( (LA52_0==29) && (synpred25_InternalGdbsl())) {
                alt52=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3130:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3130:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3130:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3131:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3131:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3132:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7507);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3148:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3149:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3149:1: (lv_name_4_0= ruleValidID )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3150:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7528);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3167:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3167:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3168:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3168:1: (lv_name_5_0= ruleValidID )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3169:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7557);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3185:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==16) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3185:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXVariableDeclaration7571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3189:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3190:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3190:1: (lv_right_7_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3191:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7592);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3215:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3216:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3217:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7630);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7640); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3224:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3227:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3228:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3228:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3228:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3228:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==26||LA54_1==41||LA54_1==47) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==29||LA54_0==45) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3229:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3229:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3230:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7686);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3246:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3247:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3247:1: (lv_name_1_0= ruleValidID )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3248:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7708);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3272:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3273:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3274:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7744);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7754); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3281:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3284:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3285:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3285:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3285:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3285:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3286:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3286:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3287:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7800);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3303:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3304:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3304:1: (lv_name_1_0= ruleValidID )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3305:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7821);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3329:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3330:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3331:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7857);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7867); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3338:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3341:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3342:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3342:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3342:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3342:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3343:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3348:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==64) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3349:1: ( ruleStaticQualifier )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3349:1: ( ruleStaticQualifier )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3350:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7924);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3363:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==26) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3363:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall7938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3367:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3368:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3368:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3369:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7959);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3385:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==44) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3385:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall7972); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3389:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3390:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3390:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3391:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7993);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall8007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3411:3: ( ( ruleIdOrSuper ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3412:1: ( ruleIdOrSuper )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3412:1: ( ruleIdOrSuper )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3413:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8032);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3426:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3426:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3426:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3426:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3433:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3434:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3464:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3465:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8151);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3482:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3482:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3482:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3482:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3483:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3483:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3484:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8179);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3500:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==44) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3500:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8192); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3504:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3505:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3505:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3506:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8213);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3526:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3526:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3529:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3530:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8265);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3554:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3555:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3556:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8303);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8314); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3563:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3566:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3567:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3567:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==63) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3568:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8361);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3580:2: kw= 'super'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleIdOrSuper8385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3593:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3594:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3595:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8426);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8437); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3602:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3605:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3606:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3606:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==64) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3607:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8484);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleStaticQualifier8502); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3631:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3632:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3633:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8543);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8553); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3640:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3643:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3644:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3644:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3644:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3644:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3645:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXConstructorCall8599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3654:1: ( ( ruleQualifiedName ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3655:1: ( ruleQualifiedName )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3655:1: ( ruleQualifiedName )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3656:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8622);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3669:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3669:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3669:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3669:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3674:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3675:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3675:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3676:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8665);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3692:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==44) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3692:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8678); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3696:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3697:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3697:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3698:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8699);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3718:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3718:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3718:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3718:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3740:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3741:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8809);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3758:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3758:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3758:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3758:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3759:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3759:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3760:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8837);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3776:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==44) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3776:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8850); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3780:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3781:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3781:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3782:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8871);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3802:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3802:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3805:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3806:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8923);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3830:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3831:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3832:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8960);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8970); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3839:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3842:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3843:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3843:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3843:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3843:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3844:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3849:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==66) ) {
                alt70=1;
            }
            else if ( (LA70_0==67) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3849:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral9017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3854:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3854:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3855:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3855:1: (lv_isTrue_2_0= 'true' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3856:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3877:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3878:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3879:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9091);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9101); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3886:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3889:28: ( ( () otherlv_1= 'null' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3890:1: ( () otherlv_1= 'null' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3890:1: ( () otherlv_1= 'null' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3890:2: () otherlv_1= 'null'
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3890:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3891:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXNullLiteral9147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3908:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3909:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3910:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9183);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9193); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3917:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3920:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3921:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3921:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3921:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3921:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3927:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3928:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3928:1: (lv_value_1_0= ruleNumber )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3929:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9248);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3953:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3954:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3955:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9284);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3962:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3965:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3966:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3966:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3966:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3966:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3967:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3972:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3973:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3973:1: (lv_value_1_0= RULE_STRING )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3974:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3998:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3999:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4000:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9386);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9396); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4007:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4010:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4011:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4011:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4011:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4011:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4012:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXTypeLiteral9442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral9454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4025:1: ( ( ruleQualifiedName ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4026:1: ( ruleQualifiedName )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4026:1: ( ruleQualifiedName )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4027:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9477);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral9489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4052:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4053:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4054:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9525);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9535); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4061:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4064:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4065:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4065:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4065:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4065:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4066:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXThrowExpression9581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4075:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4076:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4076:1: (lv_expression_2_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4077:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9602);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4101:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4102:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4103:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9638);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9648); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4110:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4113:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4114:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4114:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4114:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4114:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4115:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXReturnExpression9694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4124:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4124:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4129:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4130:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9725);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4154:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4155:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4156:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9762);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9772); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4163:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4166:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4167:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4167:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4167:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4167:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4168:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4177:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4178:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4178:1: (lv_expression_2_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4179:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9839);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==74) ) {
                alt74=1;
            }
            else if ( (LA74_0==73) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==74) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred34_InternalGdbsl()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4197:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4198:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9869);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4214:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==73) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred35_InternalGdbsl()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4214:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4214:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4214:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9891); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4219:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4220:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4220:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4221:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9913);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4238:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4238:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4238:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4242:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4243:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4243:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4244:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9956);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4268:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4269:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4270:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9994);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10004); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4277:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4280:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4281:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4281:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4281:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4281:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4281:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleXCatchClause10049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause10062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4290:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4291:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4291:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4292:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10083);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause10095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4312:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4313:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4313:1: (lv_expression_4_0= ruleXExpression )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4314:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10116);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4338:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4339:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4340:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10153);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10164); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4347:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4350:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4351:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4351:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4352:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10211);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4362:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==41) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred37_InternalGdbsl()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4362:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4362:2: ( ( '.' )=>kw= '.' )
            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4362:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleQualifiedName10239); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10262);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4389:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4393:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4394:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10316);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10327); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4404:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4408:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4409:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4409:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_HEX) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_DECIMAL)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4409:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4417:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4417:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4417:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4417:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_INT) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==RULE_DECIMAL) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4417:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10399); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4425:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10425); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4432:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==41) ) {
                        int LA78_1 = input.LA(2);

                        if ( ((LA78_1>=RULE_INT && LA78_1<=RULE_DECIMAL)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4433:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleNumber10445); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4438:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==RULE_INT) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==RULE_DECIMAL) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4438:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10461); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4446:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10487); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4464:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4465:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4466:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10540);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10550); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4473:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4476:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4477:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4477:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==29||LA81_0==45) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4477:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4477:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4478:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10598);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4486:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==47) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==49) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred38_InternalGdbsl()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4486:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4489:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4489:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4489:6: ()
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4490:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference10636); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference10648); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4505:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10680);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4521:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4522:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4523:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10715);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10725); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4530:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4533:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4534:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4534:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4534:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4534:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==45) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4534:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4538:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==29||LA83_0==45) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4538:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4538:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4539:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4539:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4540:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10785);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4556:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==44) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4556:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10798); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4560:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4561:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4561:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4562:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10819);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef10835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleXFunctionTypeRef10849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4586:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4587:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4587:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4588:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10870);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4612:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4613:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4614:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10906);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4621:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4624:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4625:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4625:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4625:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4625:2: ( ( ruleQualifiedName ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4626:1: ( ruleQualifiedName )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4626:1: ( ruleQualifiedName )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4627:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10964);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4640:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4640:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4640:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4640:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference10985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4645:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4646:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4646:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4647:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11007);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4663:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==44) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4663:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleJvmParameterizedTypeReference11020); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4667:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4668:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4668:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4669:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11041);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference11055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4697:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4698:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4699:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11093);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4706:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4709:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4710:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4710:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==29||LA87_0==45) ) {
                alt87=1;
            }
            else if ( (LA87_0==75) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4711:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11150);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4721:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11177);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4737:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4738:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4739:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11212);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4746:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4749:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4750:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4750:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4750:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4750:2: ()
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4751:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleJvmWildcardTypeReference11268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4760:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==76) ) {
                alt88=1;
            }
            else if ( (LA88_0==63) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4760:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4760:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4761:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4761:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4762:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11290);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4779:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4779:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4780:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4780:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4781:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11317);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4805:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4806:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4807:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11355);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11365); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4814:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4817:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4818:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4818:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4818:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBound11402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4822:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4823:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4823:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4824:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11423);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4848:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4849:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4850:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11459);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11469); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4857:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4860:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4861:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4861:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4861:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBoundAnded11506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4865:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4866:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4866:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4867:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11527);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4891:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4892:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4893:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11563);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11573); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4900:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4903:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4904:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4904:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4904:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleJvmLowerBound11610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4908:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4909:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4909:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4910:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11631);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4936:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4937:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4938:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11670);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11681); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4945:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4948:28: (this_ID_0= RULE_ID )
            // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4949:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalGdbsl
    public final void synpred1_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:316:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:317:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:317:2: ( ( ruleOpMultiAssign ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:318:1: ( ruleOpMultiAssign )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:318:1: ( ruleOpMultiAssign )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:319:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGdbsl692);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGdbsl

    // $ANTLR start synpred2_InternalGdbsl
    public final void synpred2_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:4: ( () ( ( ruleOpOr ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:5: () ( ( ruleOpOr ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:444:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:445:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:445:2: ( ( ruleOpOr ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:446:1: ( ruleOpOr )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:446:1: ( ruleOpOr )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:447:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGdbsl1040);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalGdbsl

    // $ANTLR start synpred3_InternalGdbsl
    public final void synpred3_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:5: () ( ( ruleOpAnd ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:545:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:546:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:546:2: ( ( ruleOpAnd ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:547:1: ( ruleOpAnd )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:547:1: ( ruleOpAnd )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:548:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGdbsl1299);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalGdbsl

    // $ANTLR start synpred4_InternalGdbsl
    public final void synpred4_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:5: () ( ( ruleOpEquality ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:646:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:647:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:647:2: ( ( ruleOpEquality ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:648:1: ( ruleOpEquality )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:648:1: ( ruleOpEquality )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:649:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGdbsl1558);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGdbsl

    // $ANTLR start synpred5_InternalGdbsl
    public final void synpred5_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:4: ( ( () 'instanceof' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:5: ( () 'instanceof' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:5: ( () 'instanceof' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:6: () 'instanceof'
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:754:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:755:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred5_InternalGdbsl1834); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGdbsl

    // $ANTLR start synpred6_InternalGdbsl
    public final void synpred6_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:10: () ( ( ruleOpCompare ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:785:10: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:786:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:786:2: ( ( ruleOpCompare ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:787:1: ( ruleOpCompare )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:787:1: ( ruleOpCompare )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:788:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGdbsl1905);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGdbsl

    // $ANTLR start synpred7_InternalGdbsl
    public final void synpred7_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:4: ( () ( ( ruleOpOther ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:5: () ( ( ruleOpOther ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:907:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:908:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:908:2: ( ( ruleOpOther ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:909:1: ( ruleOpOther )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:909:1: ( ruleOpOther )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:910:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGdbsl2224);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGdbsl

    // $ANTLR start synpred8_InternalGdbsl
    public final void synpred8_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:999:3: ( ( '>' '>' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:999:4: ( '>' '>' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:999:4: ( '>' '>' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1000:2: '>' '>'
        {
        match(input,25,FOLLOW_25_in_synpred8_InternalGdbsl2440); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred8_InternalGdbsl2445); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalGdbsl

    // $ANTLR start synpred9_InternalGdbsl
    public final void synpred9_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1029:3: ( ( '<' '<' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1029:4: ( '<' '<' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1029:4: ( '<' '<' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1030:2: '<' '<'
        {
        match(input,26,FOLLOW_26_in_synpred9_InternalGdbsl2527); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred9_InternalGdbsl2532); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalGdbsl

    // $ANTLR start synpred10_InternalGdbsl
    public final void synpred10_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:5: () ( ( ruleOpAdd ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1103:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1104:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1104:2: ( ( ruleOpAdd ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1105:1: ( ruleOpAdd )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1105:1: ( ruleOpAdd )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1106:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalGdbsl2754);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalGdbsl

    // $ANTLR start synpred11_InternalGdbsl
    public final void synpred11_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:5: () ( ( ruleOpMulti ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1211:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1212:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1212:2: ( ( ruleOpMulti ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1213:1: ( ruleOpMulti )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1213:1: ( ruleOpMulti )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1214:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalGdbsl3034);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalGdbsl

    // $ANTLR start synpred12_InternalGdbsl
    public final void synpred12_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:3: ( ( () 'as' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:4: ( () 'as' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:4: ( () 'as' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:5: () 'as'
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1444:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1445:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred12_InternalGdbsl3628); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalGdbsl

    // $ANTLR start synpred13_InternalGdbsl
    public final void synpred13_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1504:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1505:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred13_InternalGdbsl3782); if (state.failed) return ;
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1506:1: ( ( ruleValidID ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1507:1: ( ruleValidID )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1507:1: ( ruleValidID )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1508:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalGdbsl3791);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalGdbsl3797);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGdbsl

    // $ANTLR start synpred14_InternalGdbsl
    public final void synpred14_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1562:10: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1563:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1563:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt89=3;
        switch ( input.LA(1) ) {
        case 41:
            {
            alt89=1;
            }
            break;
        case 42:
            {
            alt89=2;
            }
            break;
        case 43:
            {
            alt89=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1563:4: '.'
                {
                match(input,41,FOLLOW_41_in_synpred14_InternalGdbsl3900); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1565:6: ( ( '?.' ) )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1565:6: ( ( '?.' ) )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1566:1: ( '?.' )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1566:1: ( '?.' )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1567:2: '?.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalGdbsl3914); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1572:6: ( ( '*.' ) )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1572:6: ( ( '*.' ) )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1573:1: ( '*.' )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1573:1: ( '*.' )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1574:2: '*.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalGdbsl3934); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalGdbsl

    // $ANTLR start synpred15_InternalGdbsl
    public final void synpred15_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1683:4: ( ( '(' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1684:1: ( '(' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1684:1: ( '(' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1685:2: '('
        {
        match(input,45,FOLLOW_45_in_synpred15_InternalGdbsl4161); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalGdbsl

    // $ANTLR start synpred16_InternalGdbsl
    public final void synpred16_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1704:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1705:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1705:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==29||LA91_0==45) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1705:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1705:3: ( ( ruleJvmFormalParameter ) )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1706:1: ( ruleJvmFormalParameter )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1706:1: ( ruleJvmFormalParameter )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1707:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGdbsl4213);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1709:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==44) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1709:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred16_InternalGdbsl4220); if (state.failed) return ;
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1710:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1711:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1711:1: ( ruleJvmFormalParameter )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1712:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGdbsl4227);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                }
                break;

        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1714:6: ( ( '|' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1715:1: ( '|' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1715:1: ( '|' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1716:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred16_InternalGdbsl4241); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalGdbsl

    // $ANTLR start synpred17_InternalGdbsl
    public final void synpred17_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1783:4: ( ( () '[' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1783:5: ( () '[' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1783:5: ( () '[' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1783:6: () '['
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1783:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1784:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred17_InternalGdbsl4361); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalGdbsl

    // $ANTLR start synpred18_InternalGdbsl
    public final void synpred18_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:3: ( ( () '[' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:4: ( () '[' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:4: ( () '[' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:5: () '['
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1974:5: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:1975:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred18_InternalGdbsl4885); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGdbsl

    // $ANTLR start synpred20_InternalGdbsl
    public final void synpred20_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==29||LA93_0==45) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2068:7: ( ( ruleJvmFormalParameter ) )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2069:1: ( ruleJvmFormalParameter )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2069:1: ( ruleJvmFormalParameter )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2070:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGdbsl5164);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2072:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==44) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2072:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred20_InternalGdbsl5171); if (state.failed) return ;
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2073:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2074:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2074:1: ( ruleJvmFormalParameter )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2075:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGdbsl5178);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2077:6: ( ( '|' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2078:1: ( '|' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2078:1: ( '|' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2079:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred20_InternalGdbsl5192); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalGdbsl

    // $ANTLR start synpred22_InternalGdbsl
    public final void synpred22_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2438:4: ( 'else' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2438:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred22_InternalGdbsl5975); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGdbsl

    // $ANTLR start synpred23_InternalGdbsl
    public final void synpred23_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2492:6: ( ( ruleValidID ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2493:1: ( ruleValidID )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2493:1: ( ruleValidID )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2494:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalGdbsl6117);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred23_InternalGdbsl6123); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalGdbsl

    // $ANTLR start synpred24_InternalGdbsl
    public final void synpred24_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2538:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,45,FOLLOW_45_in_synpred24_InternalGdbsl6199); if (state.failed) return ;
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2539:1: ( ( ruleValidID ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2540:1: ( ruleValidID )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2540:1: ( ruleValidID )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:2541:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalGdbsl6206);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred24_InternalGdbsl6212); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalGdbsl

    // $ANTLR start synpred25_InternalGdbsl
    public final void synpred25_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3122:6: ( ( ruleJvmTypeReference ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3123:1: ( ruleJvmTypeReference )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3123:1: ( ruleJvmTypeReference )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3124:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalGdbsl7477);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3126:2: ( ( ruleValidID ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3127:1: ( ruleValidID )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3127:1: ( ruleValidID )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3128:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalGdbsl7486);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalGdbsl

    // $ANTLR start synpred26_InternalGdbsl
    public final void synpred26_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3426:4: ( ( '(' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3427:1: ( '(' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3427:1: ( '(' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3428:2: '('
        {
        match(input,45,FOLLOW_45_in_synpred26_InternalGdbsl8048); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalGdbsl

    // $ANTLR start synpred27_InternalGdbsl
    public final void synpred27_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3447:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3448:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3448:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==29||LA97_0==45) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3448:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3448:3: ( ( ruleJvmFormalParameter ) )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3449:1: ( ruleJvmFormalParameter )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3449:1: ( ruleJvmFormalParameter )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3450:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGdbsl8100);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3452:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==44) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3452:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred27_InternalGdbsl8107); if (state.failed) return ;
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3453:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3454:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3454:1: ( ruleJvmFormalParameter )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3455:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGdbsl8114);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3457:6: ( ( '|' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3458:1: ( '|' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3458:1: ( '|' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3459:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred27_InternalGdbsl8128); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalGdbsl

    // $ANTLR start synpred28_InternalGdbsl
    public final void synpred28_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3526:4: ( ( () '[' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3526:5: ( () '[' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3526:5: ( () '[' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3526:6: () '['
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3526:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3527:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred28_InternalGdbsl8248); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalGdbsl

    // $ANTLR start synpred29_InternalGdbsl
    public final void synpred29_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3669:4: ( '<' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3669:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred29_InternalGdbsl8635); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalGdbsl

    // $ANTLR start synpred30_InternalGdbsl
    public final void synpred30_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3718:5: ( '(' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3718:7: '('
        {
        match(input,45,FOLLOW_45_in_synpred30_InternalGdbsl8728); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalGdbsl

    // $ANTLR start synpred31_InternalGdbsl
    public final void synpred31_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3723:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3724:1: 
        {
        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3724:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==29||LA99_0==45) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3724:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3724:3: ( ( ruleJvmFormalParameter ) )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3725:1: ( ruleJvmFormalParameter )
                {
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3725:1: ( ruleJvmFormalParameter )
                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3726:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGdbsl8758);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3728:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==44) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3728:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred31_InternalGdbsl8765); if (state.failed) return ;
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3729:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3730:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3730:1: ( ruleJvmFormalParameter )
                	    // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3731:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGdbsl8772);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                }
                break;

        }

        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3733:6: ( ( '|' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3734:1: ( '|' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3734:1: ( '|' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3735:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred31_InternalGdbsl8786); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalGdbsl

    // $ANTLR start synpred32_InternalGdbsl
    public final void synpred32_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3802:4: ( ( () '[' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3802:5: ( () '[' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3802:5: ( () '[' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3802:6: () '['
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3802:6: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:3803:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred32_InternalGdbsl8906); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalGdbsl

    // $ANTLR start synpred33_InternalGdbsl
    public final void synpred33_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4124:2: ( ( ruleXExpression ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4125:1: ( ruleXExpression )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4125:1: ( ruleXExpression )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4126:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalGdbsl9708);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalGdbsl

    // $ANTLR start synpred34_InternalGdbsl
    public final void synpred34_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:5: ( 'catch' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4195:7: 'catch'
        {
        match(input,74,FOLLOW_74_in_synpred34_InternalGdbsl9853); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalGdbsl

    // $ANTLR start synpred35_InternalGdbsl
    public final void synpred35_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4214:5: ( 'finally' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4214:7: 'finally'
        {
        match(input,73,FOLLOW_73_in_synpred35_InternalGdbsl9883); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalGdbsl

    // $ANTLR start synpred37_InternalGdbsl
    public final void synpred37_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4362:3: ( '.' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4363:2: '.'
        {
        match(input,41,FOLLOW_41_in_synpred37_InternalGdbsl10230); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalGdbsl

    // $ANTLR start synpred38_InternalGdbsl
    public final void synpred38_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4486:2: ( ( () '[' ']' ) )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4486:3: ( () '[' ']' )
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4486:3: ( () '[' ']' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4486:4: () '[' ']'
        {
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4486:4: ()
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4487:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred38_InternalGdbsl10613); if (state.failed) return ;
        match(input,49,FOLLOW_49_in_synpred38_InternalGdbsl10617); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalGdbsl

    // $ANTLR start synpred39_InternalGdbsl
    public final void synpred39_InternalGdbsl_fragment() throws RecognitionException {   
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4640:4: ( '<' )
        // ../org.arccore.gdbsl/src-gen/org/arccore/gdbsl/parser/antlr/internal/InternalGdbsl.g:4640:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred39_InternalGdbsl10977); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalGdbsl

    // Delegated rules

    public final boolean synpred13_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGdbsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGdbsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\1\1\12\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA13_maxS =
        "\1\112\1\uffff\10\0\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA13_specialS =
        "\2\uffff\1\0\1\7\1\4\1\6\1\3\1\5\1\1\1\2\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\5\1\4\uffff\2\1\2\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\17\1\1\uffff\17\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 907:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGdbsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\102\uffff";
    static final String DFA29_eofS =
        "\1\2\101\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA29_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1683:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\36\uffff";
    static final String DFA28_eofS =
        "\36\uffff";
    static final String DFA28_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA28_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA28_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA28_transitionS = {
            "\4\5\1\1\21\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1704:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==RULE_ID) ) {s = 1;}

                        else if ( (LA28_0==45) ) {s = 2;}

                        else if ( (LA28_0==29) && (synpred16_InternalGdbsl())) {s = 3;}

                        else if ( (LA28_0==48) && (synpred16_InternalGdbsl())) {s = 4;}

                        else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_DECIMAL)||LA28_0==26||(LA28_0>=33 && LA28_0<=34)||LA28_0==39||LA28_0==47||LA28_0==50||LA28_0==52||LA28_0==54||(LA28_0>=58 && LA28_0<=60)||LA28_0==63||(LA28_0>=65 && LA28_0<=72)) ) {s = 5;}

                        else if ( (LA28_0==46) ) {s = 29;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\102\uffff";
    static final String DFA30_eofS =
        "\1\2\101\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA30_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA30_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1783:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\16\uffff";
    static final String DFA32_eofS =
        "\16\uffff";
    static final String DFA32_minS =
        "\1\4\15\uffff";
    static final String DFA32_maxS =
        "\1\110\15\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA32_specialS =
        "\16\uffff}>";
    static final String[] DFA32_transitionS = {
            "\4\5\1\4\21\uffff\1\4\22\uffff\1\15\1\uffff\1\5\2\uffff\1\6"+
            "\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1824:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA36_eotS =
        "\40\uffff";
    static final String DFA36_eofS =
        "\40\uffff";
    static final String DFA36_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA36_maxS =
        "\1\110\2\0\35\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA36_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA36_transitionS = {
            "\4\5\1\1\21\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\uffff\1\5\1\4\2\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2068:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==RULE_ID) ) {s = 1;}

                        else if ( (LA36_0==45) ) {s = 2;}

                        else if ( (LA36_0==29) && (synpred20_InternalGdbsl())) {s = 3;}

                        else if ( (LA36_0==48) && (synpred20_InternalGdbsl())) {s = 4;}

                        else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_DECIMAL)||LA36_0==26||(LA36_0>=33 && LA36_0<=34)||LA36_0==39||LA36_0==47||(LA36_0>=49 && LA36_0<=50)||LA36_0==52||LA36_0==54||(LA36_0>=58 && LA36_0<=63)||(LA36_0>=65 && LA36_0<=72)) ) {s = 5;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\102\uffff";
    static final String DFA60_eofS =
        "\1\2\101\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA60_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3426:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\36\uffff";
    static final String DFA59_eofS =
        "\36\uffff";
    static final String DFA59_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA59_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA59_transitionS = {
            "\4\5\1\1\21\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3447:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_ID) ) {s = 1;}

                        else if ( (LA59_0==45) ) {s = 2;}

                        else if ( (LA59_0==29) && (synpred27_InternalGdbsl())) {s = 3;}

                        else if ( (LA59_0==48) && (synpred27_InternalGdbsl())) {s = 4;}

                        else if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_DECIMAL)||LA59_0==26||(LA59_0>=33 && LA59_0<=34)||LA59_0==39||LA59_0==47||LA59_0==50||LA59_0==52||LA59_0==54||(LA59_0>=58 && LA59_0<=60)||LA59_0==63||(LA59_0>=65 && LA59_0<=72)) ) {s = 5;}

                        else if ( (LA59_0==46) ) {s = 29;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\102\uffff";
    static final String DFA61_eofS =
        "\1\2\101\uffff";
    static final String DFA61_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA61_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA61_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3526:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\102\uffff";
    static final String DFA65_eofS =
        "\1\2\101\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA65_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3669:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\102\uffff";
    static final String DFA68_eofS =
        "\1\2\101\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA68_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3718:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\36\uffff";
    static final String DFA67_eofS =
        "\36\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA67_maxS =
        "\1\110\2\0\33\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA67_transitionS = {
            "\4\5\1\1\21\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3723:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==45) ) {s = 2;}

                        else if ( (LA67_0==29) && (synpred31_InternalGdbsl())) {s = 3;}

                        else if ( (LA67_0==48) && (synpred31_InternalGdbsl())) {s = 4;}

                        else if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_DECIMAL)||LA67_0==26||(LA67_0>=33 && LA67_0<=34)||LA67_0==39||LA67_0==47||LA67_0==50||LA67_0==52||LA67_0==54||(LA67_0>=58 && LA67_0<=60)||LA67_0==63||(LA67_0>=65 && LA67_0<=72)) ) {s = 5;}

                        else if ( (LA67_0==46) ) {s = 29;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGdbsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\102\uffff";
    static final String DFA69_eofS =
        "\1\2\101\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA69_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3802:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\102\uffff";
    static final String DFA71_eofS =
        "\1\33\101\uffff";
    static final String DFA71_minS =
        "\1\4\32\0\47\uffff";
    static final String DFA71_maxS =
        "\1\112\32\0\47\uffff";
    static final String DFA71_acceptS =
        "\33\uffff\1\2\45\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\47\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\4\uffff\2\33\2\uffff\11\33\1\10\6\33"+
            "\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff\1\33\1\23\1\33"+
            "\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13"+
            "\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4124:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_17 = input.LA(1);

                         
                        int index71_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\102\uffff";
    static final String DFA86_eofS =
        "\1\2\101\uffff";
    static final String DFA86_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA86_maxS =
        "\1\112\1\0\100\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA86_transitionS = {
            "\5\2\4\uffff\2\2\2\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "4640:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalGdbsl()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleScript142 = new BitSet(new long[]{0xFC54A086040061F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleImport_in_ruleScript169 = new BitSet(new long[]{0xFC54A086040061F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_13_in_ruleScript183 = new BitSet(new long[]{0xFC54A086040061F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport270 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard386 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment605 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment621 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment671 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment724 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpSingleAssign835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMultiAssign923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1019 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1072 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1095 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpOr1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1278 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1331 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1354 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpAnd1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1537 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1590 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1613 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1817 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_22_in_ruleXRelationalExpression1853 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1876 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1937 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1960 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2203 = new BitSet(new long[]{0x00000001FE000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2256 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2279 = new BitSet(new long[]{0x00000001FE000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2425 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2456 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2512 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2543 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2733 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2786 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2809 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3013 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3066 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3089 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3342 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3612 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXCastedExpression3647 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3670 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3765 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3814 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3837 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3853 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3875 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3961 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3985 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4022 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4051 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4072 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4085 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4106 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall4120 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4145 = new BitSet(new long[]{0x0000AE0000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4179 = new BitSet(new long[]{0xFC55E086240001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4264 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4292 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4305 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4326 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4343 = new BitSet(new long[]{0x00008E0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4378 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5145 = new BitSet(new long[]{0xFC57A086240001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5218 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5231 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5252 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5274 = new BitSet(new long[]{0xFC56A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5311 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5425 = new BitSet(new long[]{0xFC54A086040021F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure5438 = new BitSet(new long[]{0xFC54A086040001F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5596 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXShortClosure5609 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5630 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure5652 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression5771 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5793 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression5896 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5908 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5929 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5941 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5962 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression5983 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6099 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6142 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6154 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6178 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression6222 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6243 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6255 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6278 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6290 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6304 = new BitSet(new long[]{0x0220200020000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6325 = new BitSet(new long[]{0x03A0200020000100L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6339 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6351 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6372 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6478 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart6492 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6513 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart6527 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXForLoopExpression6640 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression6652 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6673 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6685 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6706 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6718 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXWhileExpression6831 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression6843 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6864 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression6876 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression6989 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7010 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression7022 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression7034 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7055 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7159 = new BitSet(new long[]{0xFD54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7181 = new BitSet(new long[]{0xFD54A086040021F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7194 = new BitSet(new long[]{0xFD54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7428 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7459 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7528 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7557 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleXVariableDeclaration7571 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7800 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7924 = new BitSet(new long[]{0x8000000004000100L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall7938 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7959 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall7972 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7993 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall8007 = new BitSet(new long[]{0x8000000004000100L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8032 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8066 = new BitSet(new long[]{0xFC55E086240001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8151 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8179 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8192 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8213 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8230 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleIdOrSuper8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleStaticQualifier8502 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXConstructorCall8599 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8622 = new BitSet(new long[]{0x0000A00004000002L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8643 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8665 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8678 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8699 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8713 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8736 = new BitSet(new long[]{0xFC55E086240001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8809 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8837 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8850 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8871 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8888 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXNullLiteral9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTypeLiteral9442 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral9454 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9477 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXThrowExpression9581 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXReturnExpression9694 = new BitSet(new long[]{0xFC54A086040001F2L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9818 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9891 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9935 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXCatchClause10049 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause10062 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10083 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause10095 = new BitSet(new long[]{0xFC54A086040001F0L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10211 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleQualifiedName10239 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10262 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10399 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10425 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleNumber10445 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10598 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference10636 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference10648 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10763 = new BitSet(new long[]{0x0000600020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10785 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10798 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10819 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef10835 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXFunctionTypeRef10849 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10964 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference10985 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11007 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_44_in_ruleJvmParameterizedTypeReference11020 = new BitSet(new long[]{0x0000200020000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11041 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmWildcardTypeReference11268 = new BitSet(new long[]{0x8000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBound11402 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBoundAnded11506 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleJvmLowerBound11610 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGdbsl692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGdbsl1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGdbsl1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGdbsl1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred5_InternalGdbsl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGdbsl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGdbsl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred8_InternalGdbsl2440 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred8_InternalGdbsl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred9_InternalGdbsl2527 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred9_InternalGdbsl2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalGdbsl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalGdbsl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalGdbsl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred13_InternalGdbsl3782 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalGdbsl3791 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalGdbsl3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalGdbsl3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalGdbsl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalGdbsl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred15_InternalGdbsl4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGdbsl4213 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred16_InternalGdbsl4220 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGdbsl4227 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalGdbsl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred17_InternalGdbsl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred18_InternalGdbsl4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGdbsl5164 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred20_InternalGdbsl5171 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGdbsl5178 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred20_InternalGdbsl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred22_InternalGdbsl5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalGdbsl6117 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred23_InternalGdbsl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred24_InternalGdbsl6199 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalGdbsl6206 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred24_InternalGdbsl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalGdbsl7477 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalGdbsl7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred26_InternalGdbsl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGdbsl8100 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred27_InternalGdbsl8107 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGdbsl8114 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred27_InternalGdbsl8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred28_InternalGdbsl8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred29_InternalGdbsl8635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred30_InternalGdbsl8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGdbsl8758 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred31_InternalGdbsl8765 = new BitSet(new long[]{0x0000200020000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGdbsl8772 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred31_InternalGdbsl8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred32_InternalGdbsl8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalGdbsl9708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred34_InternalGdbsl9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred35_InternalGdbsl9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred37_InternalGdbsl10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred38_InternalGdbsl10613 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred38_InternalGdbsl10617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred39_InternalGdbsl10977 = new BitSet(new long[]{0x0000000000000002L});

}