package com.nagarro.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.nagarro.services.AppBuilderDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppBuilderDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'.'", "'system'", "'{'", "'}'", "'business'", "'instance'", "'ui'", "'main'", "'('", "'appName'", "'appVersion'", "'devices'", "'['", "','", "']'", "'entry'", "'generalStyle'", "')'", "'screen'", "'entryparameters'", "'controller'", "'initaction'", "'validate'", "'on'", "'attach'", "'to'", "'bind'", "'enumDataSource'", "'enumClassName'", "'validator'", "'condition'", "'|'", "'and'", "'uiaction'", "'set'", "'navigateto'", "'execute'", "'params'", "'restcall'", "'url'", "'returnType'", "'model'", "'view'", "'layout'", "'type'", "':'", "'\"grid\"'", "'columns'", "'\"rowlayout\"'", "'list'", "'labelprovider'", "'cssStyle'", "'tooltip'", "'+'", "'text'", "'resourceKey'", "'button'", "'label'", "'screens'", "'\\n'", "'.*'", "'datatype'", "'entity'", "'extends'", "'many'", "'iphone'", "'ipad'", "'android4'", "'android2'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAppBuilderDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAppBuilderDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAppBuilderDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g"; }



     	private AppBuilderDSLGrammarAccess grammarAccess;
     	
        public InternalAppBuilderDSLParser(TokenStream input, AppBuilderDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AppBuilder";	
       	}
       	
       	@Override
       	protected AppBuilderDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAppBuilder"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:68:1: entryRuleAppBuilder returns [EObject current=null] : iv_ruleAppBuilder= ruleAppBuilder EOF ;
    public final EObject entryRuleAppBuilder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppBuilder = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:69:2: (iv_ruleAppBuilder= ruleAppBuilder EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:70:2: iv_ruleAppBuilder= ruleAppBuilder EOF
            {
             newCompositeNode(grammarAccess.getAppBuilderRule()); 
            pushFollow(FOLLOW_ruleAppBuilder_in_entryRuleAppBuilder75);
            iv_ruleAppBuilder=ruleAppBuilder();

            state._fsp--;

             current =iv_ruleAppBuilder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppBuilder85); 

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
    // $ANTLR end "entryRuleAppBuilder"


    // $ANTLR start "ruleAppBuilder"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:77:1: ruleAppBuilder returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleAppBuilder() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:80:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:83:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAppBuilderAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleAppBuilder130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAppBuilderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleAppBuilder"


    // $ANTLR start "entryRuleAbstractElement"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:107:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:108:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:109:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:116:1: ruleAbstractElement returns [EObject current=null] : (this_NamespaceDeclation_0= ruleNamespaceDeclation | this_System_1= ruleSystem ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceDeclation_0 = null;

        EObject this_System_1 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:119:28: ( (this_NamespaceDeclation_0= ruleNamespaceDeclation | this_System_1= ruleSystem ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:120:1: (this_NamespaceDeclation_0= ruleNamespaceDeclation | this_System_1= ruleSystem )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:120:1: (this_NamespaceDeclation_0= ruleNamespaceDeclation | this_System_1= ruleSystem )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:121:5: this_NamespaceDeclation_0= ruleNamespaceDeclation
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getNamespaceDeclationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamespaceDeclation_in_ruleAbstractElement223);
                    this_NamespaceDeclation_0=ruleNamespaceDeclation();

                    state._fsp--;

                     
                            current = this_NamespaceDeclation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:131:5: this_System_1= ruleSystem
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSystem_in_ruleAbstractElement250);
                    this_System_1=ruleSystem();

                    state._fsp--;

                     
                            current = this_System_1; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleNamespaceDeclation"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:147:1: entryRuleNamespaceDeclation returns [EObject current=null] : iv_ruleNamespaceDeclation= ruleNamespaceDeclation EOF ;
    public final EObject entryRuleNamespaceDeclation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDeclation = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:148:2: (iv_ruleNamespaceDeclation= ruleNamespaceDeclation EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:149:2: iv_ruleNamespaceDeclation= ruleNamespaceDeclation EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclation_in_entryRuleNamespaceDeclation285);
            iv_ruleNamespaceDeclation=ruleNamespaceDeclation();

            state._fsp--;

             current =iv_ruleNamespaceDeclation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclation295); 

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
    // $ANTLR end "entryRuleNamespaceDeclation"


    // $ANTLR start "ruleNamespaceDeclation"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:156:1: ruleNamespaceDeclation returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleNamespaceDeclation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:159:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:160:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:160:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:160:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespaceDeclation332); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclationAccess().getNamespaceKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:164:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:165:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:165:1: (lv_name_1_0= ruleQualifiedName )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:166:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespaceDeclation353);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDeclationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleNamespaceDeclation"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:190:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:191:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:192:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName401); 

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
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:199:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:202:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:203:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:203:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:203:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName441); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:210:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:211:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName460); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName475); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSystem"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:231:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:232:2: (iv_ruleSystem= ruleSystem EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:233:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem522);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem532); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:240:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_business_3_0= ruleBusiness ) ) ( (lv_ui_4_0= ruleUi ) ) otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_business_3_0 = null;

        EObject lv_ui_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:243:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_business_3_0= ruleBusiness ) ) ( (lv_ui_4_0= ruleUi ) ) otherlv_5= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:244:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_business_3_0= ruleBusiness ) ) ( (lv_ui_4_0= ruleUi ) ) otherlv_5= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:244:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_business_3_0= ruleBusiness ) ) ( (lv_ui_4_0= ruleUi ) ) otherlv_5= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:244:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_business_3_0= ruleBusiness ) ) ( (lv_ui_4_0= ruleUi ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSystem569); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:248:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:249:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:249:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:250:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem586); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSystem603); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:270:1: ( (lv_business_3_0= ruleBusiness ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:271:1: (lv_business_3_0= ruleBusiness )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:271:1: (lv_business_3_0= ruleBusiness )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:272:3: lv_business_3_0= ruleBusiness
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getBusinessBusinessParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBusiness_in_ruleSystem624);
            lv_business_3_0=ruleBusiness();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	        }
                   		set(
                   			current, 
                   			"business",
                    		lv_business_3_0, 
                    		"Business");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:288:2: ( (lv_ui_4_0= ruleUi ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:289:1: (lv_ui_4_0= ruleUi )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:289:1: (lv_ui_4_0= ruleUi )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:290:3: lv_ui_4_0= ruleUi
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getUiUiParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUi_in_ruleSystem645);
            lv_ui_4_0=ruleUi();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	        }
                   		set(
                   			current, 
                   			"ui",
                    		lv_ui_4_0, 
                    		"Ui");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSystem657); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleBusiness"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:318:1: entryRuleBusiness returns [EObject current=null] : iv_ruleBusiness= ruleBusiness EOF ;
    public final EObject entryRuleBusiness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusiness = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:319:2: (iv_ruleBusiness= ruleBusiness EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:320:2: iv_ruleBusiness= ruleBusiness EOF
            {
             newCompositeNode(grammarAccess.getBusinessRule()); 
            pushFollow(FOLLOW_ruleBusiness_in_entryRuleBusiness693);
            iv_ruleBusiness=ruleBusiness();

            state._fsp--;

             current =iv_ruleBusiness; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusiness703); 

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
    // $ANTLR end "entryRuleBusiness"


    // $ANTLR start "ruleBusiness"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:327:1: ruleBusiness returns [EObject current=null] : ( () otherlv_1= 'business' otherlv_2= '{' ( (lv_elements_3_0= ruleService ) )* otherlv_4= '}' ) ;
    public final EObject ruleBusiness() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:330:28: ( ( () otherlv_1= 'business' otherlv_2= '{' ( (lv_elements_3_0= ruleService ) )* otherlv_4= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:331:1: ( () otherlv_1= 'business' otherlv_2= '{' ( (lv_elements_3_0= ruleService ) )* otherlv_4= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:331:1: ( () otherlv_1= 'business' otherlv_2= '{' ( (lv_elements_3_0= ruleService ) )* otherlv_4= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:331:2: () otherlv_1= 'business' otherlv_2= '{' ( (lv_elements_3_0= ruleService ) )* otherlv_4= '}'
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:331:2: ()
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:332:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBusinessAccess().getBusinessAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBusiness749); 

                	newLeafNode(otherlv_1, grammarAccess.getBusinessAccess().getBusinessKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBusiness761); 

                	newLeafNode(otherlv_2, grammarAccess.getBusinessAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:345:1: ( (lv_elements_3_0= ruleService ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:346:1: (lv_elements_3_0= ruleService )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:346:1: (lv_elements_3_0= ruleService )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:347:3: lv_elements_3_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBusinessAccess().getElementsServiceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleBusiness782);
            	    lv_elements_3_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBusinessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBusiness795); 

                	newLeafNode(otherlv_4, grammarAccess.getBusinessAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleBusiness"


    // $ANTLR start "entryRuleService"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:375:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:376:2: (iv_ruleService= ruleService EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:377:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService831);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService841); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:384:1: ruleService returns [EObject current=null] : this_InstanceService_0= ruleInstanceService ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_InstanceService_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:387:28: (this_InstanceService_0= ruleInstanceService )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:389:5: this_InstanceService_0= ruleInstanceService
            {
             
                    newCompositeNode(grammarAccess.getServiceAccess().getInstanceServiceParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleInstanceService_in_ruleService887);
            this_InstanceService_0=ruleInstanceService();

            state._fsp--;

             
                    current = this_InstanceService_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleInstanceService"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:405:1: entryRuleInstanceService returns [EObject current=null] : iv_ruleInstanceService= ruleInstanceService EOF ;
    public final EObject entryRuleInstanceService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceService = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:406:2: (iv_ruleInstanceService= ruleInstanceService EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:407:2: iv_ruleInstanceService= ruleInstanceService EOF
            {
             newCompositeNode(grammarAccess.getInstanceServiceRule()); 
            pushFollow(FOLLOW_ruleInstanceService_in_entryRuleInstanceService921);
            iv_ruleInstanceService=ruleInstanceService();

            state._fsp--;

             current =iv_ruleInstanceService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceService931); 

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
    // $ANTLR end "entryRuleInstanceService"


    // $ANTLR start "ruleInstanceService"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:414:1: ruleInstanceService returns [EObject current=null] : (otherlv_0= 'instance' ( (lv_instanceName_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleInstanceService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_instanceName_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:417:28: ( (otherlv_0= 'instance' ( (lv_instanceName_1_0= ruleQualifiedName ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:418:1: (otherlv_0= 'instance' ( (lv_instanceName_1_0= ruleQualifiedName ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:418:1: (otherlv_0= 'instance' ( (lv_instanceName_1_0= ruleQualifiedName ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:418:3: otherlv_0= 'instance' ( (lv_instanceName_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleInstanceService968); 

                	newLeafNode(otherlv_0, grammarAccess.getInstanceServiceAccess().getInstanceKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:422:1: ( (lv_instanceName_1_0= ruleQualifiedName ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:423:1: (lv_instanceName_1_0= ruleQualifiedName )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:423:1: (lv_instanceName_1_0= ruleQualifiedName )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:424:3: lv_instanceName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getInstanceServiceAccess().getInstanceNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceService989);
            lv_instanceName_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceServiceRule());
            	        }
                   		set(
                   			current, 
                   			"instanceName",
                    		lv_instanceName_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleInstanceService"


    // $ANTLR start "entryRuleUi"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:448:1: entryRuleUi returns [EObject current=null] : iv_ruleUi= ruleUi EOF ;
    public final EObject entryRuleUi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUi = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:449:2: (iv_ruleUi= ruleUi EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:450:2: iv_ruleUi= ruleUi EOF
            {
             newCompositeNode(grammarAccess.getUiRule()); 
            pushFollow(FOLLOW_ruleUi_in_entryRuleUi1025);
            iv_ruleUi=ruleUi();

            state._fsp--;

             current =iv_ruleUi; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUi1035); 

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
    // $ANTLR end "entryRuleUi"


    // $ANTLR start "ruleUi"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:457:1: ruleUi returns [EObject current=null] : (otherlv_0= 'ui' otherlv_1= '{' ( (lv_main_2_0= ruleMain ) ) ( (lv_services_3_0= ruleService ) )* ( (lv_screens_4_0= ruleScreen ) )* otherlv_5= '}' ) ;
    public final EObject ruleUi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_main_2_0 = null;

        EObject lv_services_3_0 = null;

        EObject lv_screens_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:460:28: ( (otherlv_0= 'ui' otherlv_1= '{' ( (lv_main_2_0= ruleMain ) ) ( (lv_services_3_0= ruleService ) )* ( (lv_screens_4_0= ruleScreen ) )* otherlv_5= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:461:1: (otherlv_0= 'ui' otherlv_1= '{' ( (lv_main_2_0= ruleMain ) ) ( (lv_services_3_0= ruleService ) )* ( (lv_screens_4_0= ruleScreen ) )* otherlv_5= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:461:1: (otherlv_0= 'ui' otherlv_1= '{' ( (lv_main_2_0= ruleMain ) ) ( (lv_services_3_0= ruleService ) )* ( (lv_screens_4_0= ruleScreen ) )* otherlv_5= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:461:3: otherlv_0= 'ui' otherlv_1= '{' ( (lv_main_2_0= ruleMain ) ) ( (lv_services_3_0= ruleService ) )* ( (lv_screens_4_0= ruleScreen ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleUi1072); 

                	newLeafNode(otherlv_0, grammarAccess.getUiAccess().getUiKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleUi1084); 

                	newLeafNode(otherlv_1, grammarAccess.getUiAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:469:1: ( (lv_main_2_0= ruleMain ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:470:1: (lv_main_2_0= ruleMain )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:470:1: (lv_main_2_0= ruleMain )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:471:3: lv_main_2_0= ruleMain
            {
             
            	        newCompositeNode(grammarAccess.getUiAccess().getMainMainParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleUi1105);
            lv_main_2_0=ruleMain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUiRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_2_0, 
                    		"Main");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:487:2: ( (lv_services_3_0= ruleService ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:488:1: (lv_services_3_0= ruleService )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:488:1: (lv_services_3_0= ruleService )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:489:3: lv_services_3_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUiAccess().getServicesServiceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleUi1126);
            	    lv_services_3_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_3_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:505:3: ( (lv_screens_4_0= ruleScreen ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:506:1: (lv_screens_4_0= ruleScreen )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:506:1: (lv_screens_4_0= ruleScreen )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:507:3: lv_screens_4_0= ruleScreen
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUiAccess().getScreensScreenParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScreen_in_ruleUi1148);
            	    lv_screens_4_0=ruleScreen();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"screens",
            	            		lv_screens_4_0, 
            	            		"Screen");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUi1161); 

                	newLeafNode(otherlv_5, grammarAccess.getUiAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleUi"


    // $ANTLR start "entryRuleMain"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:535:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:536:2: (iv_ruleMain= ruleMain EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:537:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain1197);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain1207); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:544:1: ruleMain returns [EObject current=null] : ( () otherlv_1= 'main' otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) ) ) otherlv_28= ')' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_appName_6_0=null;
        Token otherlv_8=null;
        Token lv_appVersion_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_generalStyle_26_0=null;
        Token otherlv_28=null;
        Enumerator lv_devices_15_0 = null;

        Enumerator lv_devices_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:547:28: ( ( () otherlv_1= 'main' otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) ) ) otherlv_28= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:548:1: ( () otherlv_1= 'main' otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) ) ) otherlv_28= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:548:1: ( () otherlv_1= 'main' otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) ) ) otherlv_28= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:548:2: () otherlv_1= 'main' otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) ) ) otherlv_28= ')'
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:548:2: ()
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:549:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMainAccess().getMainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleMain1253); 

                	newLeafNode(otherlv_1, grammarAccess.getMainAccess().getMainKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMain1265); 

                	newLeafNode(otherlv_2, grammarAccess.getMainAccess().getLeftParenthesisKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:562:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:564:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:564:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:565:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMainAccess().getUnorderedGroup_3());
            	
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:568:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?)
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:569:3: ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+ {...}?
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:569:3: ( ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=6;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 4) ) {
                    alt13=5;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:571:4: ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:571:4: ({...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:572:5: {...}? => ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:572:101: ( ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:573:6: ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:576:6: ({...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:576:7: {...}? => (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:576:16: (otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:576:18: otherlv_4= 'appName' ruleVSEPARATOR ( (lv_appName_6_0= RULE_STRING ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMain1323); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMainAccess().getAppNameKeyword_3_0_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getMainAccess().getVSEPARATORParserRuleCall_3_0_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleMain1339);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:588:1: ( (lv_appName_6_0= RULE_STRING ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:589:1: (lv_appName_6_0= RULE_STRING )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:589:1: (lv_appName_6_0= RULE_STRING )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:590:3: lv_appName_6_0= RULE_STRING
            	    {
            	    lv_appName_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMain1355); 

            	    			newLeafNode(lv_appName_6_0, grammarAccess.getMainAccess().getAppNameSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMainRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"appName",
            	            		lv_appName_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:606:2: ( ruleASEPARATOR )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==25||LA7_0==71) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:607:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMainAccess().getASEPARATORParserRuleCall_3_0_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleMain1377);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:621:4: ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:621:4: ({...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:622:5: {...}? => ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:622:101: ( ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:623:6: ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:626:6: ({...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:626:7: {...}? => (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:626:16: (otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:626:18: otherlv_8= 'appVersion' ruleVSEPARATOR ( (lv_appVersion_10_0= RULE_STRING ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleMain1446); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMainAccess().getAppVersionKeyword_3_1_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getMainAccess().getVSEPARATORParserRuleCall_3_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleMain1462);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:638:1: ( (lv_appVersion_10_0= RULE_STRING ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:639:1: (lv_appVersion_10_0= RULE_STRING )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:639:1: (lv_appVersion_10_0= RULE_STRING )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:640:3: lv_appVersion_10_0= RULE_STRING
            	    {
            	    lv_appVersion_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMain1478); 

            	    			newLeafNode(lv_appVersion_10_0, grammarAccess.getMainAccess().getAppVersionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMainRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"appVersion",
            	            		lv_appVersion_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:656:2: ( ruleASEPARATOR )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==25||LA8_0==71) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:657:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMainAccess().getASEPARATORParserRuleCall_3_1_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleMain1500);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:671:4: ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:671:4: ({...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:672:5: {...}? => ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:672:101: ( ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:673:6: ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:676:6: ({...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:676:7: {...}? => (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:676:16: (otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:676:18: otherlv_12= 'devices' ruleVSEPARATOR otherlv_14= '[' ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* ) otherlv_18= ']' ( ruleASEPARATOR )?
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleMain1569); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMainAccess().getDevicesKeyword_3_2_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getMainAccess().getVSEPARATORParserRuleCall_3_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleMain1585);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleMain1596); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMainAccess().getLeftSquareBracketKeyword_3_2_2());
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:692:1: ( ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:692:2: ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )*
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:692:2: ( (lv_devices_15_0= ruleDevice ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:693:1: (lv_devices_15_0= ruleDevice )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:693:1: (lv_devices_15_0= ruleDevice )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:694:3: lv_devices_15_0= ruleDevice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getDevicesDeviceEnumRuleCall_3_2_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDevice_in_ruleMain1618);
            	    lv_devices_15_0=ruleDevice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"devices",
            	            		lv_devices_15_0, 
            	            		"Device");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:710:2: (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==25) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:710:4: otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,25,FOLLOW_25_in_ruleMain1631); 

            	    	        	newLeafNode(otherlv_16, grammarAccess.getMainAccess().getCommaKeyword_3_2_3_1_0());
            	    	        
            	    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:714:1: ( (lv_devices_17_0= ruleDevice ) )
            	    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:715:1: (lv_devices_17_0= ruleDevice )
            	    	    {
            	    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:715:1: (lv_devices_17_0= ruleDevice )
            	    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:716:3: lv_devices_17_0= ruleDevice
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMainAccess().getDevicesDeviceEnumRuleCall_3_2_3_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDevice_in_ruleMain1652);
            	    	    lv_devices_17_0=ruleDevice();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"devices",
            	    	            		lv_devices_17_0, 
            	    	            		"Device");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }

            	    otherlv_18=(Token)match(input,26,FOLLOW_26_in_ruleMain1667); 

            	        	newLeafNode(otherlv_18, grammarAccess.getMainAccess().getRightSquareBracketKeyword_3_2_4());
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:736:1: ( ruleASEPARATOR )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==25||LA10_0==71) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:737:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMainAccess().getASEPARATORParserRuleCall_3_2_5()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleMain1684);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:751:4: ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:751:4: ({...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:752:5: {...}? => ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:752:101: ( ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:753:6: ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:756:6: ({...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:756:7: {...}? => (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:756:16: (otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:756:18: otherlv_20= 'entry' ruleVSEPARATOR ( (otherlv_22= RULE_ID ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_20=(Token)match(input,27,FOLLOW_27_in_ruleMain1753); 

            	        	newLeafNode(otherlv_20, grammarAccess.getMainAccess().getEntryKeyword_3_3_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getMainAccess().getVSEPARATORParserRuleCall_3_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleMain1769);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:768:1: ( (otherlv_22= RULE_ID ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:769:1: (otherlv_22= RULE_ID )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:769:1: (otherlv_22= RULE_ID )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:770:3: otherlv_22= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMainRule());
            	    	        }
            	            
            	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMain1788); 

            	    		newLeafNode(otherlv_22, grammarAccess.getMainAccess().getScreenScreenCrossReference_3_3_2_0()); 
            	    	

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:781:2: ( ruleASEPARATOR )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==25||LA11_0==71) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:782:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMainAccess().getASEPARATORParserRuleCall_3_3_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleMain1805);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:796:4: ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:796:4: ({...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:797:5: {...}? => ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:797:101: ( ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:798:6: ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:801:6: ({...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:801:7: {...}? => (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:801:16: (otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:801:18: otherlv_24= 'generalStyle' ruleVSEPARATOR ( (lv_generalStyle_26_0= RULE_STRING ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_24=(Token)match(input,28,FOLLOW_28_in_ruleMain1874); 

            	        	newLeafNode(otherlv_24, grammarAccess.getMainAccess().getGeneralStyleKeyword_3_4_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getMainAccess().getVSEPARATORParserRuleCall_3_4_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleMain1890);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:813:1: ( (lv_generalStyle_26_0= RULE_STRING ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:814:1: (lv_generalStyle_26_0= RULE_STRING )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:814:1: (lv_generalStyle_26_0= RULE_STRING )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:815:3: lv_generalStyle_26_0= RULE_STRING
            	    {
            	    lv_generalStyle_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMain1906); 

            	    			newLeafNode(lv_generalStyle_26_0, grammarAccess.getMainAccess().getGeneralStyleSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMainRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"generalStyle",
            	            		lv_generalStyle_26_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:831:2: ( ruleASEPARATOR )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==25||LA12_0==71) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:832:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMainAccess().getASEPARATORParserRuleCall_3_4_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleMain1928);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMainAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canLeave(grammarAccess.getMainAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMainAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,29,FOLLOW_29_in_ruleMain1988); 

                	newLeafNode(otherlv_28, grammarAccess.getMainAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleScreen"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:866:1: entryRuleScreen returns [EObject current=null] : iv_ruleScreen= ruleScreen EOF ;
    public final EObject entryRuleScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreen = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:867:2: (iv_ruleScreen= ruleScreen EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:868:2: iv_ruleScreen= ruleScreen EOF
            {
             newCompositeNode(grammarAccess.getScreenRule()); 
            pushFollow(FOLLOW_ruleScreen_in_entryRuleScreen2024);
            iv_ruleScreen=ruleScreen();

            state._fsp--;

             current =iv_ruleScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreen2034); 

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
    // $ANTLR end "entryRuleScreen"


    // $ANTLR start "ruleScreen"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:875:1: ruleScreen returns [EObject current=null] : (this_SimpleScreen_0= ruleSimpleScreen | this_CompositeScreen_1= ruleCompositeScreen ) ;
    public final EObject ruleScreen() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleScreen_0 = null;

        EObject this_CompositeScreen_1 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:878:28: ( (this_SimpleScreen_0= ruleSimpleScreen | this_CompositeScreen_1= ruleCompositeScreen ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:879:1: (this_SimpleScreen_0= ruleSimpleScreen | this_CompositeScreen_1= ruleCompositeScreen )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:879:1: (this_SimpleScreen_0= ruleSimpleScreen | this_CompositeScreen_1= ruleCompositeScreen )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==14) ) {
                        int LA14_3 = input.LA(4);

                        if ( (LA14_3==31||LA14_3==53) ) {
                            alt14=1;
                        }
                        else if ( (LA14_3==70) ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:880:5: this_SimpleScreen_0= ruleSimpleScreen
                    {
                     
                            newCompositeNode(grammarAccess.getScreenAccess().getSimpleScreenParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleScreen_in_ruleScreen2081);
                    this_SimpleScreen_0=ruleSimpleScreen();

                    state._fsp--;

                     
                            current = this_SimpleScreen_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:890:5: this_CompositeScreen_1= ruleCompositeScreen
                    {
                     
                            newCompositeNode(grammarAccess.getScreenAccess().getCompositeScreenParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompositeScreen_in_ruleScreen2108);
                    this_CompositeScreen_1=ruleCompositeScreen();

                    state._fsp--;

                     
                            current = this_CompositeScreen_1; 
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
    // $ANTLR end "ruleScreen"


    // $ANTLR start "entryRuleSimpleScreen"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:906:1: entryRuleSimpleScreen returns [EObject current=null] : iv_ruleSimpleScreen= ruleSimpleScreen EOF ;
    public final EObject entryRuleSimpleScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleScreen = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:907:2: (iv_ruleSimpleScreen= ruleSimpleScreen EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:908:2: iv_ruleSimpleScreen= ruleSimpleScreen EOF
            {
             newCompositeNode(grammarAccess.getSimpleScreenRule()); 
            pushFollow(FOLLOW_ruleSimpleScreen_in_entryRuleSimpleScreen2143);
            iv_ruleSimpleScreen=ruleSimpleScreen();

            state._fsp--;

             current =iv_ruleSimpleScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleScreen2153); 

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
    // $ANTLR end "entryRuleSimpleScreen"


    // $ANTLR start "ruleSimpleScreen"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:915:1: ruleSimpleScreen returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entryParameters_3_0= ruleEntryParameters ) )? ( (lv_model_4_0= ruleModel ) ) ( (lv_view_5_0= ruleView ) ) ( (lv_controller_6_0= ruleController ) ) otherlv_7= '}' ) ;
    public final EObject ruleSimpleScreen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_entryParameters_3_0 = null;

        EObject lv_model_4_0 = null;

        EObject lv_view_5_0 = null;

        EObject lv_controller_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:918:28: ( (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entryParameters_3_0= ruleEntryParameters ) )? ( (lv_model_4_0= ruleModel ) ) ( (lv_view_5_0= ruleView ) ) ( (lv_controller_6_0= ruleController ) ) otherlv_7= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:919:1: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entryParameters_3_0= ruleEntryParameters ) )? ( (lv_model_4_0= ruleModel ) ) ( (lv_view_5_0= ruleView ) ) ( (lv_controller_6_0= ruleController ) ) otherlv_7= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:919:1: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entryParameters_3_0= ruleEntryParameters ) )? ( (lv_model_4_0= ruleModel ) ) ( (lv_view_5_0= ruleView ) ) ( (lv_controller_6_0= ruleController ) ) otherlv_7= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:919:3: otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entryParameters_3_0= ruleEntryParameters ) )? ( (lv_model_4_0= ruleModel ) ) ( (lv_view_5_0= ruleView ) ) ( (lv_controller_6_0= ruleController ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSimpleScreen2190); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleScreenAccess().getScreenKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:923:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:924:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:924:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:925:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleScreen2207); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleScreenAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleScreenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSimpleScreen2224); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleScreenAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:945:1: ( (lv_entryParameters_3_0= ruleEntryParameters ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:946:1: (lv_entryParameters_3_0= ruleEntryParameters )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:946:1: (lv_entryParameters_3_0= ruleEntryParameters )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:947:3: lv_entryParameters_3_0= ruleEntryParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleScreenAccess().getEntryParametersEntryParametersParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntryParameters_in_ruleSimpleScreen2245);
                    lv_entryParameters_3_0=ruleEntryParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleScreenRule());
                    	        }
                           		set(
                           			current, 
                           			"entryParameters",
                            		lv_entryParameters_3_0, 
                            		"EntryParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:963:3: ( (lv_model_4_0= ruleModel ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:964:1: (lv_model_4_0= ruleModel )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:964:1: (lv_model_4_0= ruleModel )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:965:3: lv_model_4_0= ruleModel
            {
             
            	        newCompositeNode(grammarAccess.getSimpleScreenAccess().getModelModelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleModel_in_ruleSimpleScreen2267);
            lv_model_4_0=ruleModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleScreenRule());
            	        }
                   		set(
                   			current, 
                   			"model",
                    		lv_model_4_0, 
                    		"Model");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:981:2: ( (lv_view_5_0= ruleView ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:982:1: (lv_view_5_0= ruleView )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:982:1: (lv_view_5_0= ruleView )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:983:3: lv_view_5_0= ruleView
            {
             
            	        newCompositeNode(grammarAccess.getSimpleScreenAccess().getViewViewParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleView_in_ruleSimpleScreen2288);
            lv_view_5_0=ruleView();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleScreenRule());
            	        }
                   		set(
                   			current, 
                   			"view",
                    		lv_view_5_0, 
                    		"View");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:999:2: ( (lv_controller_6_0= ruleController ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1000:1: (lv_controller_6_0= ruleController )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1000:1: (lv_controller_6_0= ruleController )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1001:3: lv_controller_6_0= ruleController
            {
             
            	        newCompositeNode(grammarAccess.getSimpleScreenAccess().getControllerControllerParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleController_in_ruleSimpleScreen2309);
            lv_controller_6_0=ruleController();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleScreenRule());
            	        }
                   		set(
                   			current, 
                   			"controller",
                    		lv_controller_6_0, 
                    		"Controller");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSimpleScreen2321); 

                	newLeafNode(otherlv_7, grammarAccess.getSimpleScreenAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleSimpleScreen"


    // $ANTLR start "entryRuleEntryParameters"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1029:1: entryRuleEntryParameters returns [EObject current=null] : iv_ruleEntryParameters= ruleEntryParameters EOF ;
    public final EObject entryRuleEntryParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryParameters = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1030:2: (iv_ruleEntryParameters= ruleEntryParameters EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1031:2: iv_ruleEntryParameters= ruleEntryParameters EOF
            {
             newCompositeNode(grammarAccess.getEntryParametersRule()); 
            pushFollow(FOLLOW_ruleEntryParameters_in_entryRuleEntryParameters2357);
            iv_ruleEntryParameters=ruleEntryParameters();

            state._fsp--;

             current =iv_ruleEntryParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryParameters2367); 

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
    // $ANTLR end "entryRuleEntryParameters"


    // $ANTLR start "ruleEntryParameters"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1038:1: ruleEntryParameters returns [EObject current=null] : (otherlv_0= 'entryparameters' otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )+ otherlv_3= '}' ) ;
    public final EObject ruleEntryParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1041:28: ( (otherlv_0= 'entryparameters' otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )+ otherlv_3= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1042:1: (otherlv_0= 'entryparameters' otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )+ otherlv_3= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1042:1: (otherlv_0= 'entryparameters' otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )+ otherlv_3= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1042:3: otherlv_0= 'entryparameters' otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEntryParameters2404); 

                	newLeafNode(otherlv_0, grammarAccess.getEntryParametersAccess().getEntryparametersKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEntryParameters2416); 

                	newLeafNode(otherlv_1, grammarAccess.getEntryParametersAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1050:1: ( (lv_attributes_2_0= ruleAttribute ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1051:1: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1051:1: (lv_attributes_2_0= ruleAttribute )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1052:3: lv_attributes_2_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntryParametersAccess().getAttributesAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntryParameters2437);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntryParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEntryParameters2450); 

                	newLeafNode(otherlv_3, grammarAccess.getEntryParametersAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleEntryParameters"


    // $ANTLR start "entryRuleController"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1080:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1081:2: (iv_ruleController= ruleController EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1082:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_ruleController_in_entryRuleController2486);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleController2496); 

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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1089:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' otherlv_1= '{' ( (lv_initAction_2_0= ruleInitAction ) ) ( (lv_validator_3_0= ruleValidator ) )? ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_initAction_2_0 = null;

        EObject lv_validator_3_0 = null;

        EObject lv_actions_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1092:28: ( (otherlv_0= 'controller' otherlv_1= '{' ( (lv_initAction_2_0= ruleInitAction ) ) ( (lv_validator_3_0= ruleValidator ) )? ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1093:1: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_initAction_2_0= ruleInitAction ) ) ( (lv_validator_3_0= ruleValidator ) )? ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1093:1: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_initAction_2_0= ruleInitAction ) ) ( (lv_validator_3_0= ruleValidator ) )? ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1093:3: otherlv_0= 'controller' otherlv_1= '{' ( (lv_initAction_2_0= ruleInitAction ) ) ( (lv_validator_3_0= ruleValidator ) )? ( (lv_actions_4_0= ruleAction ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleController2533); 

                	newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleController2545); 

                	newLeafNode(otherlv_1, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1101:1: ( (lv_initAction_2_0= ruleInitAction ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1102:1: (lv_initAction_2_0= ruleInitAction )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1102:1: (lv_initAction_2_0= ruleInitAction )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1103:3: lv_initAction_2_0= ruleInitAction
            {
             
            	        newCompositeNode(grammarAccess.getControllerAccess().getInitActionInitActionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInitAction_in_ruleController2566);
            lv_initAction_2_0=ruleInitAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControllerRule());
            	        }
                   		set(
                   			current, 
                   			"initAction",
                    		lv_initAction_2_0, 
                    		"InitAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1119:2: ( (lv_validator_3_0= ruleValidator ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1120:1: (lv_validator_3_0= ruleValidator )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1120:1: (lv_validator_3_0= ruleValidator )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1121:3: lv_validator_3_0= ruleValidator
                    {
                     
                    	        newCompositeNode(grammarAccess.getControllerAccess().getValidatorValidatorParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValidator_in_ruleController2587);
                    lv_validator_3_0=ruleValidator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControllerRule());
                    	        }
                           		set(
                           			current, 
                           			"validator",
                            		lv_validator_3_0, 
                            		"Validator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1137:3: ( (lv_actions_4_0= ruleAction ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1138:1: (lv_actions_4_0= ruleAction )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1138:1: (lv_actions_4_0= ruleAction )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1139:3: lv_actions_4_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getControllerAccess().getActionsActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleController2609);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getControllerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_4_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleController2622); 

                	newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleInitAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1167:1: entryRuleInitAction returns [EObject current=null] : iv_ruleInitAction= ruleInitAction EOF ;
    public final EObject entryRuleInitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitAction = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1168:2: (iv_ruleInitAction= ruleInitAction EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1169:2: iv_ruleInitAction= ruleInitAction EOF
            {
             newCompositeNode(grammarAccess.getInitActionRule()); 
            pushFollow(FOLLOW_ruleInitAction_in_entryRuleInitAction2658);
            iv_ruleInitAction=ruleInitAction();

            state._fsp--;

             current =iv_ruleInitAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitAction2668); 

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
    // $ANTLR end "entryRuleInitAction"


    // $ANTLR start "ruleInitAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1176:1: ruleInitAction returns [EObject current=null] : ( () otherlv_1= 'initaction' otherlv_2= '{' ( (lv_databindings_3_0= ruleDataBinding ) )* ( (lv_uiListenerBindingss_4_0= ruleUiListenerBinding ) )* ( (lv_validationBindings_5_0= ruleValidationBinding ) )* ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= '}' ) ;
    public final EObject ruleInitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_databindings_3_0 = null;

        EObject lv_uiListenerBindingss_4_0 = null;

        EObject lv_validationBindings_5_0 = null;

        EObject lv_instructions_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1179:28: ( ( () otherlv_1= 'initaction' otherlv_2= '{' ( (lv_databindings_3_0= ruleDataBinding ) )* ( (lv_uiListenerBindingss_4_0= ruleUiListenerBinding ) )* ( (lv_validationBindings_5_0= ruleValidationBinding ) )* ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1180:1: ( () otherlv_1= 'initaction' otherlv_2= '{' ( (lv_databindings_3_0= ruleDataBinding ) )* ( (lv_uiListenerBindingss_4_0= ruleUiListenerBinding ) )* ( (lv_validationBindings_5_0= ruleValidationBinding ) )* ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1180:1: ( () otherlv_1= 'initaction' otherlv_2= '{' ( (lv_databindings_3_0= ruleDataBinding ) )* ( (lv_uiListenerBindingss_4_0= ruleUiListenerBinding ) )* ( (lv_validationBindings_5_0= ruleValidationBinding ) )* ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1180:2: () otherlv_1= 'initaction' otherlv_2= '{' ( (lv_databindings_3_0= ruleDataBinding ) )* ( (lv_uiListenerBindingss_4_0= ruleUiListenerBinding ) )* ( (lv_validationBindings_5_0= ruleValidationBinding ) )* ( (lv_instructions_6_0= ruleInstruction ) )* otherlv_7= '}'
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1180:2: ()
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1181:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitActionAccess().getInitActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleInitAction2714); 

                	newLeafNode(otherlv_1, grammarAccess.getInitActionAccess().getInitactionKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInitAction2726); 

                	newLeafNode(otherlv_2, grammarAccess.getInitActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1194:1: ( (lv_databindings_3_0= ruleDataBinding ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1195:1: (lv_databindings_3_0= ruleDataBinding )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1195:1: (lv_databindings_3_0= ruleDataBinding )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1196:3: lv_databindings_3_0= ruleDataBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitActionAccess().getDatabindingsDataBindingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataBinding_in_ruleInitAction2747);
            	    lv_databindings_3_0=ruleDataBinding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"databindings",
            	            		lv_databindings_3_0, 
            	            		"DataBinding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1212:3: ( (lv_uiListenerBindingss_4_0= ruleUiListenerBinding ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1213:1: (lv_uiListenerBindingss_4_0= ruleUiListenerBinding )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1213:1: (lv_uiListenerBindingss_4_0= ruleUiListenerBinding )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1214:3: lv_uiListenerBindingss_4_0= ruleUiListenerBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitActionAccess().getUiListenerBindingssUiListenerBindingParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUiListenerBinding_in_ruleInitAction2769);
            	    lv_uiListenerBindingss_4_0=ruleUiListenerBinding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uiListenerBindingss",
            	            		lv_uiListenerBindingss_4_0, 
            	            		"UiListenerBinding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1230:3: ( (lv_validationBindings_5_0= ruleValidationBinding ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1231:1: (lv_validationBindings_5_0= ruleValidationBinding )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1231:1: (lv_validationBindings_5_0= ruleValidationBinding )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1232:3: lv_validationBindings_5_0= ruleValidationBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitActionAccess().getValidationBindingsValidationBindingParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValidationBinding_in_ruleInitAction2791);
            	    lv_validationBindings_5_0=ruleValidationBinding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"validationBindings",
            	            		lv_validationBindings_5_0, 
            	            		"ValidationBinding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1248:3: ( (lv_instructions_6_0= ruleInstruction ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=46 && LA22_0<=48)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1249:1: (lv_instructions_6_0= ruleInstruction )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1249:1: (lv_instructions_6_0= ruleInstruction )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1250:3: lv_instructions_6_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitActionAccess().getInstructionsInstructionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleInitAction2813);
            	    lv_instructions_6_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_6_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInitAction2826); 

                	newLeafNode(otherlv_7, grammarAccess.getInitActionAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleInitAction"


    // $ANTLR start "entryRuleValidationBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1278:1: entryRuleValidationBinding returns [EObject current=null] : iv_ruleValidationBinding= ruleValidationBinding EOF ;
    public final EObject entryRuleValidationBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationBinding = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1279:2: (iv_ruleValidationBinding= ruleValidationBinding EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1280:2: iv_ruleValidationBinding= ruleValidationBinding EOF
            {
             newCompositeNode(grammarAccess.getValidationBindingRule()); 
            pushFollow(FOLLOW_ruleValidationBinding_in_entryRuleValidationBinding2862);
            iv_ruleValidationBinding=ruleValidationBinding();

            state._fsp--;

             current =iv_ruleValidationBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidationBinding2872); 

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
    // $ANTLR end "entryRuleValidationBinding"


    // $ANTLR start "ruleValidationBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1287:1: ruleValidationBinding returns [EObject current=null] : (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? ) ;
    public final EObject ruleValidationBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_controlAccess_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1290:28: ( (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1291:1: (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1291:1: (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1291:3: otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleValidationBinding2909); 

                	newLeafNode(otherlv_0, grammarAccess.getValidationBindingAccess().getValidateKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1295:1: ( (otherlv_1= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1296:1: (otherlv_1= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1296:1: (otherlv_1= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1297:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidationBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidationBinding2929); 

            		newLeafNode(otherlv_1, grammarAccess.getValidationBindingAccess().getConditionConditionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleValidationBinding2941); 

                	newLeafNode(otherlv_2, grammarAccess.getValidationBindingAccess().getOnKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1312:1: ( (otherlv_3= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1313:1: (otherlv_3= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1313:1: (otherlv_3= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1314:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidationBindingRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidationBinding2961); 

            		newLeafNode(otherlv_3, grammarAccess.getValidationBindingAccess().getControlControlCrossReference_3_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1325:2: (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1325:4: otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleValidationBinding2974); 

                        	newLeafNode(otherlv_4, grammarAccess.getValidationBindingAccess().getFullStopKeyword_4_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1329:1: ( (lv_controlAccess_5_0= ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1330:1: (lv_controlAccess_5_0= ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1330:1: (lv_controlAccess_5_0= ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1331:3: lv_controlAccess_5_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidationBindingAccess().getControlAccessQualifiedNameParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleValidationBinding2995);
                    lv_controlAccess_5_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValidationBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"controlAccess",
                            		lv_controlAccess_5_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleValidationBinding"


    // $ANTLR start "entryRuleUiListenerBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1355:1: entryRuleUiListenerBinding returns [EObject current=null] : iv_ruleUiListenerBinding= ruleUiListenerBinding EOF ;
    public final EObject entryRuleUiListenerBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUiListenerBinding = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1356:2: (iv_ruleUiListenerBinding= ruleUiListenerBinding EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1357:2: iv_ruleUiListenerBinding= ruleUiListenerBinding EOF
            {
             newCompositeNode(grammarAccess.getUiListenerBindingRule()); 
            pushFollow(FOLLOW_ruleUiListenerBinding_in_entryRuleUiListenerBinding3033);
            iv_ruleUiListenerBinding=ruleUiListenerBinding();

            state._fsp--;

             current =iv_ruleUiListenerBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUiListenerBinding3043); 

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
    // $ANTLR end "entryRuleUiListenerBinding"


    // $ANTLR start "ruleUiListenerBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1364:1: ruleUiListenerBinding returns [EObject current=null] : (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? ) ;
    public final EObject ruleUiListenerBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_controlAccess_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1367:28: ( (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1368:1: (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1368:1: (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )? )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1368:3: otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleUiListenerBinding3080); 

                	newLeafNode(otherlv_0, grammarAccess.getUiListenerBindingAccess().getAttachKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1372:1: ( (otherlv_1= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1373:1: (otherlv_1= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1373:1: (otherlv_1= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1374:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUiListenerBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUiListenerBinding3100); 

            		newLeafNode(otherlv_1, grammarAccess.getUiListenerBindingAccess().getActionActionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleUiListenerBinding3112); 

                	newLeafNode(otherlv_2, grammarAccess.getUiListenerBindingAccess().getToKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1389:1: ( (otherlv_3= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1390:1: (otherlv_3= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1390:1: (otherlv_3= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1391:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUiListenerBindingRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUiListenerBinding3132); 

            		newLeafNode(otherlv_3, grammarAccess.getUiListenerBindingAccess().getControlControlCrossReference_3_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1402:2: (otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1402:4: otherlv_4= '.' ( (lv_controlAccess_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleUiListenerBinding3145); 

                        	newLeafNode(otherlv_4, grammarAccess.getUiListenerBindingAccess().getFullStopKeyword_4_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1406:1: ( (lv_controlAccess_5_0= ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1407:1: (lv_controlAccess_5_0= ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1407:1: (lv_controlAccess_5_0= ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1408:3: lv_controlAccess_5_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getUiListenerBindingAccess().getControlAccessQualifiedNameParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleUiListenerBinding3166);
                    lv_controlAccess_5_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUiListenerBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"controlAccess",
                            		lv_controlAccess_5_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleUiListenerBinding"


    // $ANTLR start "entryRuleDataBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1432:1: entryRuleDataBinding returns [EObject current=null] : iv_ruleDataBinding= ruleDataBinding EOF ;
    public final EObject entryRuleDataBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataBinding = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1433:2: (iv_ruleDataBinding= ruleDataBinding EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1434:2: iv_ruleDataBinding= ruleDataBinding EOF
            {
             newCompositeNode(grammarAccess.getDataBindingRule()); 
            pushFollow(FOLLOW_ruleDataBinding_in_entryRuleDataBinding3204);
            iv_ruleDataBinding=ruleDataBinding();

            state._fsp--;

             current =iv_ruleDataBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataBinding3214); 

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
    // $ANTLR end "entryRuleDataBinding"


    // $ANTLR start "ruleDataBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1441:1: ruleDataBinding returns [EObject current=null] : (this_SimpleDataBinding_0= ruleSimpleDataBinding | this_EnumDataBinding_1= ruleEnumDataBinding ) ;
    public final EObject ruleDataBinding() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleDataBinding_0 = null;

        EObject this_EnumDataBinding_1 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1444:28: ( (this_SimpleDataBinding_0= ruleSimpleDataBinding | this_EnumDataBinding_1= ruleEnumDataBinding ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1445:1: (this_SimpleDataBinding_0= ruleSimpleDataBinding | this_EnumDataBinding_1= ruleEnumDataBinding )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1445:1: (this_SimpleDataBinding_0= ruleSimpleDataBinding | this_EnumDataBinding_1= ruleEnumDataBinding )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==39) ) {
                    alt25=2;
                }
                else if ( (LA25_1==RULE_ID) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1446:5: this_SimpleDataBinding_0= ruleSimpleDataBinding
                    {
                     
                            newCompositeNode(grammarAccess.getDataBindingAccess().getSimpleDataBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleDataBinding_in_ruleDataBinding3261);
                    this_SimpleDataBinding_0=ruleSimpleDataBinding();

                    state._fsp--;

                     
                            current = this_SimpleDataBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1456:5: this_EnumDataBinding_1= ruleEnumDataBinding
                    {
                     
                            newCompositeNode(grammarAccess.getDataBindingAccess().getEnumDataBindingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumDataBinding_in_ruleDataBinding3288);
                    this_EnumDataBinding_1=ruleEnumDataBinding();

                    state._fsp--;

                     
                            current = this_EnumDataBinding_1; 
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
    // $ANTLR end "ruleDataBinding"


    // $ANTLR start "entryRuleSimpleDataBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1472:1: entryRuleSimpleDataBinding returns [EObject current=null] : iv_ruleSimpleDataBinding= ruleSimpleDataBinding EOF ;
    public final EObject entryRuleSimpleDataBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleDataBinding = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1473:2: (iv_ruleSimpleDataBinding= ruleSimpleDataBinding EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1474:2: iv_ruleSimpleDataBinding= ruleSimpleDataBinding EOF
            {
             newCompositeNode(grammarAccess.getSimpleDataBindingRule()); 
            pushFollow(FOLLOW_ruleSimpleDataBinding_in_entryRuleSimpleDataBinding3323);
            iv_ruleSimpleDataBinding=ruleSimpleDataBinding();

            state._fsp--;

             current =iv_ruleSimpleDataBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDataBinding3333); 

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
    // $ANTLR end "entryRuleSimpleDataBinding"


    // $ANTLR start "ruleSimpleDataBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1481:1: ruleSimpleDataBinding returns [EObject current=null] : (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (lv_controlAccess_7_0= ruleQualifiedName ) ) )? ) ;
    public final EObject ruleSimpleDataBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_modelAccess_3_0 = null;

        AntlrDatatypeRuleToken lv_controlAccess_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1484:28: ( (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (lv_controlAccess_7_0= ruleQualifiedName ) ) )? ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1485:1: (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (lv_controlAccess_7_0= ruleQualifiedName ) ) )? )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1485:1: (otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (lv_controlAccess_7_0= ruleQualifiedName ) ) )? )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1485:3: otherlv_0= 'bind' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '.' ( (lv_controlAccess_7_0= ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleSimpleDataBinding3370); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleDataBindingAccess().getBindKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1489:1: ( (otherlv_1= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1490:1: (otherlv_1= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1490:1: (otherlv_1= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1491:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleDataBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleDataBinding3390); 

            		newLeafNode(otherlv_1, grammarAccess.getSimpleDataBindingAccess().getModelAttributeCrossReference_1_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1502:2: (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1502:4: otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSimpleDataBinding3403); 

                        	newLeafNode(otherlv_2, grammarAccess.getSimpleDataBindingAccess().getFullStopKeyword_2_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1506:1: ( (lv_modelAccess_3_0= ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1507:1: (lv_modelAccess_3_0= ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1507:1: (lv_modelAccess_3_0= ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1508:3: lv_modelAccess_3_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleDataBindingAccess().getModelAccessQualifiedNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSimpleDataBinding3424);
                    lv_modelAccess_3_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleDataBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"modelAccess",
                            		lv_modelAccess_3_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleSimpleDataBinding3438); 

                	newLeafNode(otherlv_4, grammarAccess.getSimpleDataBindingAccess().getToKeyword_3());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1528:1: ( (otherlv_5= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1529:1: (otherlv_5= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1529:1: (otherlv_5= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1530:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleDataBindingRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleDataBinding3458); 

            		newLeafNode(otherlv_5, grammarAccess.getSimpleDataBindingAccess().getControlControlCrossReference_4_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1541:2: (otherlv_6= '.' ( (lv_controlAccess_7_0= ruleQualifiedName ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1541:4: otherlv_6= '.' ( (lv_controlAccess_7_0= ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleSimpleDataBinding3471); 

                        	newLeafNode(otherlv_6, grammarAccess.getSimpleDataBindingAccess().getFullStopKeyword_5_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1545:1: ( (lv_controlAccess_7_0= ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1546:1: (lv_controlAccess_7_0= ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1546:1: (lv_controlAccess_7_0= ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1547:3: lv_controlAccess_7_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleDataBindingAccess().getControlAccessQualifiedNameParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSimpleDataBinding3492);
                    lv_controlAccess_7_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleDataBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"controlAccess",
                            		lv_controlAccess_7_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleSimpleDataBinding"


    // $ANTLR start "entryRuleEnumDataBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1571:1: entryRuleEnumDataBinding returns [EObject current=null] : iv_ruleEnumDataBinding= ruleEnumDataBinding EOF ;
    public final EObject entryRuleEnumDataBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDataBinding = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1572:2: (iv_ruleEnumDataBinding= ruleEnumDataBinding EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1573:2: iv_ruleEnumDataBinding= ruleEnumDataBinding EOF
            {
             newCompositeNode(grammarAccess.getEnumDataBindingRule()); 
            pushFollow(FOLLOW_ruleEnumDataBinding_in_entryRuleEnumDataBinding3530);
            iv_ruleEnumDataBinding=ruleEnumDataBinding();

            state._fsp--;

             current =iv_ruleEnumDataBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDataBinding3540); 

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
    // $ANTLR end "entryRuleEnumDataBinding"


    // $ANTLR start "ruleEnumDataBinding"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1580:1: ruleEnumDataBinding returns [EObject current=null] : (otherlv_0= 'bind' otherlv_1= 'enumDataSource' otherlv_2= '(' otherlv_3= 'enumClassName' ruleVSEPARATOR ( (lv_enumClassName_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '.' ( (lv_controlAccess_10_0= ruleQualifiedName ) ) )? ) ;
    public final EObject ruleEnumDataBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_enumClassName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_controlAccess_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1583:28: ( (otherlv_0= 'bind' otherlv_1= 'enumDataSource' otherlv_2= '(' otherlv_3= 'enumClassName' ruleVSEPARATOR ( (lv_enumClassName_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '.' ( (lv_controlAccess_10_0= ruleQualifiedName ) ) )? ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1584:1: (otherlv_0= 'bind' otherlv_1= 'enumDataSource' otherlv_2= '(' otherlv_3= 'enumClassName' ruleVSEPARATOR ( (lv_enumClassName_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '.' ( (lv_controlAccess_10_0= ruleQualifiedName ) ) )? )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1584:1: (otherlv_0= 'bind' otherlv_1= 'enumDataSource' otherlv_2= '(' otherlv_3= 'enumClassName' ruleVSEPARATOR ( (lv_enumClassName_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '.' ( (lv_controlAccess_10_0= ruleQualifiedName ) ) )? )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1584:3: otherlv_0= 'bind' otherlv_1= 'enumDataSource' otherlv_2= '(' otherlv_3= 'enumClassName' ruleVSEPARATOR ( (lv_enumClassName_5_0= RULE_STRING ) ) otherlv_6= ')' otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '.' ( (lv_controlAccess_10_0= ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleEnumDataBinding3577); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDataBindingAccess().getBindKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEnumDataBinding3589); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumDataBindingAccess().getEnumDataSourceKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnumDataBinding3601); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDataBindingAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleEnumDataBinding3613); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumDataBindingAccess().getEnumClassNameKeyword_3());
                
             
                    newCompositeNode(grammarAccess.getEnumDataBindingAccess().getVSEPARATORParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleEnumDataBinding3629);
            ruleVSEPARATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1608:1: ( (lv_enumClassName_5_0= RULE_STRING ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1609:1: (lv_enumClassName_5_0= RULE_STRING )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1609:1: (lv_enumClassName_5_0= RULE_STRING )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1610:3: lv_enumClassName_5_0= RULE_STRING
            {
            lv_enumClassName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumDataBinding3645); 

            			newLeafNode(lv_enumClassName_5_0, grammarAccess.getEnumDataBindingAccess().getEnumClassNameSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDataBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enumClassName",
                    		lv_enumClassName_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleEnumDataBinding3662); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumDataBindingAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleEnumDataBinding3674); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumDataBindingAccess().getToKeyword_7());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1634:1: ( (otherlv_8= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1635:1: (otherlv_8= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1635:1: (otherlv_8= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1636:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDataBindingRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDataBinding3694); 

            		newLeafNode(otherlv_8, grammarAccess.getEnumDataBindingAccess().getControlControlCrossReference_8_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1647:2: (otherlv_9= '.' ( (lv_controlAccess_10_0= ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1647:4: otherlv_9= '.' ( (lv_controlAccess_10_0= ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleEnumDataBinding3707); 

                        	newLeafNode(otherlv_9, grammarAccess.getEnumDataBindingAccess().getFullStopKeyword_9_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1651:1: ( (lv_controlAccess_10_0= ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1652:1: (lv_controlAccess_10_0= ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1652:1: (lv_controlAccess_10_0= ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1653:3: lv_controlAccess_10_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumDataBindingAccess().getControlAccessQualifiedNameParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEnumDataBinding3728);
                    lv_controlAccess_10_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumDataBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"controlAccess",
                            		lv_controlAccess_10_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleEnumDataBinding"


    // $ANTLR start "entryRuleValidator"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1677:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1678:2: (iv_ruleValidator= ruleValidator EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1679:2: iv_ruleValidator= ruleValidator EOF
            {
             newCompositeNode(grammarAccess.getValidatorRule()); 
            pushFollow(FOLLOW_ruleValidator_in_entryRuleValidator3766);
            iv_ruleValidator=ruleValidator();

            state._fsp--;

             current =iv_ruleValidator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidator3776); 

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
    // $ANTLR end "entryRuleValidator"


    // $ANTLR start "ruleValidator"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1686:1: ruleValidator returns [EObject current=null] : ( () otherlv_1= 'validator' otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' ) ;
    public final EObject ruleValidator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditions_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1689:28: ( ( () otherlv_1= 'validator' otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1690:1: ( () otherlv_1= 'validator' otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1690:1: ( () otherlv_1= 'validator' otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1690:2: () otherlv_1= 'validator' otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}'
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1690:2: ()
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1691:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValidatorAccess().getValidatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleValidator3822); 

                	newLeafNode(otherlv_1, grammarAccess.getValidatorAccess().getValidatorKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleValidator3834); 

                	newLeafNode(otherlv_2, grammarAccess.getValidatorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1704:1: ( (lv_conditions_3_0= ruleCondition ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1705:1: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1705:1: (lv_conditions_3_0= ruleCondition )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1706:3: lv_conditions_3_0= ruleCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValidatorAccess().getConditionsConditionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondition_in_ruleValidator3855);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValidatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_3_0, 
            	            		"Condition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleValidator3868); 

                	newLeafNode(otherlv_4, grammarAccess.getValidatorAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleValidator"


    // $ANTLR start "entryRuleCondition"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1734:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1735:2: (iv_ruleCondition= ruleCondition EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1736:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition3904);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition3914); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1743:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conditionExpression_3_0= ruleConditionExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditionExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1746:28: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conditionExpression_3_0= ruleConditionExpression ) ) otherlv_4= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1747:1: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conditionExpression_3_0= ruleConditionExpression ) ) otherlv_4= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1747:1: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conditionExpression_3_0= ruleConditionExpression ) ) otherlv_4= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1747:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conditionExpression_3_0= ruleConditionExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleCondition3951); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1751:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1752:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1752:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1753:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition3968); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCondition3985); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1773:1: ( (lv_conditionExpression_3_0= ruleConditionExpression ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1774:1: (lv_conditionExpression_3_0= ruleConditionExpression )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1774:1: (lv_conditionExpression_3_0= ruleConditionExpression )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1775:3: lv_conditionExpression_3_0= ruleConditionExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getConditionExpressionConditionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionExpression_in_ruleCondition4006);
            lv_conditionExpression_3_0=ruleConditionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"conditionExpression",
                    		lv_conditionExpression_3_0, 
                    		"ConditionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleCondition4018); 

                	newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1803:1: entryRuleConditionExpression returns [EObject current=null] : iv_ruleConditionExpression= ruleConditionExpression EOF ;
    public final EObject entryRuleConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpression = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1804:2: (iv_ruleConditionExpression= ruleConditionExpression EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1805:2: iv_ruleConditionExpression= ruleConditionExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionExpression_in_entryRuleConditionExpression4054);
            iv_ruleConditionExpression=ruleConditionExpression();

            state._fsp--;

             current =iv_ruleConditionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionExpression4064); 

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
    // $ANTLR end "entryRuleConditionExpression"


    // $ANTLR start "ruleConditionExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1812:1: ruleConditionExpression returns [EObject current=null] : (this_SimpleConditionExpression_0= ruleSimpleConditionExpression | this_CompositeConditionExpression_1= ruleCompositeConditionExpression ) ;
    public final EObject ruleConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleConditionExpression_0 = null;

        EObject this_CompositeConditionExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1815:28: ( (this_SimpleConditionExpression_0= ruleSimpleConditionExpression | this_CompositeConditionExpression_1= ruleCompositeConditionExpression ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1816:1: (this_SimpleConditionExpression_0= ruleSimpleConditionExpression | this_CompositeConditionExpression_1= ruleCompositeConditionExpression )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1816:1: (this_SimpleConditionExpression_0= ruleSimpleConditionExpression | this_CompositeConditionExpression_1= ruleCompositeConditionExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||LA30_1==29||LA30_1==44) ) {
                    alt30=2;
                }
                else if ( (LA30_1==57) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1817:5: this_SimpleConditionExpression_0= ruleSimpleConditionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConditionExpressionAccess().getSimpleConditionExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleConditionExpression_in_ruleConditionExpression4111);
                    this_SimpleConditionExpression_0=ruleSimpleConditionExpression();

                    state._fsp--;

                     
                            current = this_SimpleConditionExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1827:5: this_CompositeConditionExpression_1= ruleCompositeConditionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConditionExpressionAccess().getCompositeConditionExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompositeConditionExpression_in_ruleConditionExpression4138);
                    this_CompositeConditionExpression_1=ruleCompositeConditionExpression();

                    state._fsp--;

                     
                            current = this_CompositeConditionExpression_1; 
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
    // $ANTLR end "ruleConditionExpression"


    // $ANTLR start "entryRuleSimpleConditionExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1843:1: entryRuleSimpleConditionExpression returns [EObject current=null] : iv_ruleSimpleConditionExpression= ruleSimpleConditionExpression EOF ;
    public final EObject entryRuleSimpleConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleConditionExpression = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1844:2: (iv_ruleSimpleConditionExpression= ruleSimpleConditionExpression EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1845:2: iv_ruleSimpleConditionExpression= ruleSimpleConditionExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleConditionExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleConditionExpression_in_entryRuleSimpleConditionExpression4173);
            iv_ruleSimpleConditionExpression=ruleSimpleConditionExpression();

            state._fsp--;

             current =iv_ruleSimpleConditionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleConditionExpression4183); 

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
    // $ANTLR end "entryRuleSimpleConditionExpression"


    // $ANTLR start "ruleSimpleConditionExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1852:1: ruleSimpleConditionExpression returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) ruleVSEPARATOR ruleAttributeType otherlv_3= '|' ) ;
    public final EObject ruleSimpleConditionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1855:28: ( ( ( (lv_variableName_0_0= RULE_ID ) ) ruleVSEPARATOR ruleAttributeType otherlv_3= '|' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1856:1: ( ( (lv_variableName_0_0= RULE_ID ) ) ruleVSEPARATOR ruleAttributeType otherlv_3= '|' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1856:1: ( ( (lv_variableName_0_0= RULE_ID ) ) ruleVSEPARATOR ruleAttributeType otherlv_3= '|' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1856:2: ( (lv_variableName_0_0= RULE_ID ) ) ruleVSEPARATOR ruleAttributeType otherlv_3= '|'
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1856:2: ( (lv_variableName_0_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1857:1: (lv_variableName_0_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1857:1: (lv_variableName_0_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1858:3: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleConditionExpression4225); 

            			newLeafNode(lv_variableName_0_0, grammarAccess.getSimpleConditionExpressionAccess().getVariableNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleConditionExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_0_0, 
                    		"ID");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getSimpleConditionExpressionAccess().getVSEPARATORParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleSimpleConditionExpression4246);
            ruleVSEPARATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getSimpleConditionExpressionAccess().getAttributeTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleAttributeType_in_ruleSimpleConditionExpression4261);
            ruleAttributeType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleSimpleConditionExpression4272); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleConditionExpressionAccess().getVerticalLineKeyword_3());
                

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
    // $ANTLR end "ruleSimpleConditionExpression"


    // $ANTLR start "entryRuleCompositeConditionExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1902:1: entryRuleCompositeConditionExpression returns [EObject current=null] : iv_ruleCompositeConditionExpression= ruleCompositeConditionExpression EOF ;
    public final EObject entryRuleCompositeConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeConditionExpression = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1903:2: (iv_ruleCompositeConditionExpression= ruleCompositeConditionExpression EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1904:2: iv_ruleCompositeConditionExpression= ruleCompositeConditionExpression EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionExpressionRule()); 
            pushFollow(FOLLOW_ruleCompositeConditionExpression_in_entryRuleCompositeConditionExpression4308);
            iv_ruleCompositeConditionExpression=ruleCompositeConditionExpression();

            state._fsp--;

             current =iv_ruleCompositeConditionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeConditionExpression4318); 

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
    // $ANTLR end "entryRuleCompositeConditionExpression"


    // $ANTLR start "ruleCompositeConditionExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1911:1: ruleCompositeConditionExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleCompositeConditionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1914:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1915:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1915:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) )* )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1915:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1915:2: ( (otherlv_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1916:1: (otherlv_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1916:1: (otherlv_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1917:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeConditionExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeConditionExpression4363); 

            		newLeafNode(otherlv_0, grammarAccess.getCompositeConditionExpressionAccess().getConditionsConditionCrossReference_0_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1928:2: (otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1928:4: otherlv_1= 'and' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCompositeConditionExpression4376); 

            	        	newLeafNode(otherlv_1, grammarAccess.getCompositeConditionExpressionAccess().getAndKeyword_1_0());
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1932:1: ( (otherlv_2= RULE_ID ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1933:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1933:1: (otherlv_2= RULE_ID )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1934:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompositeConditionExpressionRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeConditionExpression4396); 

            	    		newLeafNode(otherlv_2, grammarAccess.getCompositeConditionExpressionAccess().getConditionsConditionCrossReference_1_1_0()); 
            	    	

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
    // $ANTLR end "ruleCompositeConditionExpression"


    // $ANTLR start "entryRuleAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1953:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1954:2: (iv_ruleAction= ruleAction EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1955:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction4434);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction4444); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1962:1: ruleAction returns [EObject current=null] : this_UiAction_0= ruleUiAction ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_UiAction_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1965:28: (this_UiAction_0= ruleUiAction )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1967:5: this_UiAction_0= ruleUiAction
            {
             
                    newCompositeNode(grammarAccess.getActionAccess().getUiActionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUiAction_in_ruleAction4490);
            this_UiAction_0=ruleUiAction();

            state._fsp--;

             
                    current = this_UiAction_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleUiAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1983:1: entryRuleUiAction returns [EObject current=null] : iv_ruleUiAction= ruleUiAction EOF ;
    public final EObject entryRuleUiAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUiAction = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1984:2: (iv_ruleUiAction= ruleUiAction EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1985:2: iv_ruleUiAction= ruleUiAction EOF
            {
             newCompositeNode(grammarAccess.getUiActionRule()); 
            pushFollow(FOLLOW_ruleUiAction_in_entryRuleUiAction4524);
            iv_ruleUiAction=ruleUiAction();

            state._fsp--;

             current =iv_ruleUiAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUiAction4534); 

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
    // $ANTLR end "entryRuleUiAction"


    // $ANTLR start "ruleUiAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1992:1: ruleUiAction returns [EObject current=null] : (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= '}' ) ;
    public final EObject ruleUiAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instructions_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1995:28: ( (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1996:1: (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1996:1: (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:1996:3: otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_instructions_3_0= ruleInstruction ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleUiAction4571); 

                	newLeafNode(otherlv_0, grammarAccess.getUiActionAccess().getUiactionKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2000:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2001:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2001:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2002:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUiAction4588); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUiActionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUiActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleUiAction4605); 

                	newLeafNode(otherlv_2, grammarAccess.getUiActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2022:1: ( (lv_instructions_3_0= ruleInstruction ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=46 && LA32_0<=48)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2023:1: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2023:1: (lv_instructions_3_0= ruleInstruction )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2024:3: lv_instructions_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUiActionAccess().getInstructionsInstructionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleUiAction4626);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUiActionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_3_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleUiAction4639); 

                	newLeafNode(otherlv_4, grammarAccess.getUiActionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleUiAction"


    // $ANTLR start "entryRuleInstruction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2052:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2053:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2054:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction4675);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction4685); 

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
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2061:1: ruleInstruction returns [EObject current=null] : (this_SetInstruction_0= ruleSetInstruction | this_Navigate_1= ruleNavigate | this_ExecuteAction_2= ruleExecuteAction ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_SetInstruction_0 = null;

        EObject this_Navigate_1 = null;

        EObject this_ExecuteAction_2 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2064:28: ( (this_SetInstruction_0= ruleSetInstruction | this_Navigate_1= ruleNavigate | this_ExecuteAction_2= ruleExecuteAction ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2065:1: (this_SetInstruction_0= ruleSetInstruction | this_Navigate_1= ruleNavigate | this_ExecuteAction_2= ruleExecuteAction )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2065:1: (this_SetInstruction_0= ruleSetInstruction | this_Navigate_1= ruleNavigate | this_ExecuteAction_2= ruleExecuteAction )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt33=1;
                }
                break;
            case 47:
                {
                alt33=2;
                }
                break;
            case 48:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2066:5: this_SetInstruction_0= ruleSetInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSetInstructionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSetInstruction_in_ruleInstruction4732);
                    this_SetInstruction_0=ruleSetInstruction();

                    state._fsp--;

                     
                            current = this_SetInstruction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2076:5: this_Navigate_1= ruleNavigate
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getNavigateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNavigate_in_ruleInstruction4759);
                    this_Navigate_1=ruleNavigate();

                    state._fsp--;

                     
                            current = this_Navigate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2086:5: this_ExecuteAction_2= ruleExecuteAction
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExecuteActionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExecuteAction_in_ruleInstruction4786);
                    this_ExecuteAction_2=ruleExecuteAction();

                    state._fsp--;

                     
                            current = this_ExecuteAction_2; 
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


    // $ANTLR start "entryRuleSetInstruction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2102:1: entryRuleSetInstruction returns [EObject current=null] : iv_ruleSetInstruction= ruleSetInstruction EOF ;
    public final EObject entryRuleSetInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetInstruction = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2103:2: (iv_ruleSetInstruction= ruleSetInstruction EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2104:2: iv_ruleSetInstruction= ruleSetInstruction EOF
            {
             newCompositeNode(grammarAccess.getSetInstructionRule()); 
            pushFollow(FOLLOW_ruleSetInstruction_in_entryRuleSetInstruction4821);
            iv_ruleSetInstruction=ruleSetInstruction();

            state._fsp--;

             current =iv_ruleSetInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetInstruction4831); 

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
    // $ANTLR end "entryRuleSetInstruction"


    // $ANTLR start "ruleSetInstruction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2111:1: ruleSetInstruction returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (lv_assignment_5_0= ruleSetInstructionAssignment ) ) ) ;
    public final EObject ruleSetInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_modelAccess_3_0 = null;

        EObject lv_assignment_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2114:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (lv_assignment_5_0= ruleSetInstructionAssignment ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2115:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (lv_assignment_5_0= ruleSetInstructionAssignment ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2115:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (lv_assignment_5_0= ruleSetInstructionAssignment ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2115:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )? otherlv_4= 'to' ( (lv_assignment_5_0= ruleSetInstructionAssignment ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSetInstruction4868); 

                	newLeafNode(otherlv_0, grammarAccess.getSetInstructionAccess().getSetKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2119:1: ( (otherlv_1= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2120:1: (otherlv_1= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2120:1: (otherlv_1= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2121:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetInstructionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetInstruction4888); 

            		newLeafNode(otherlv_1, grammarAccess.getSetInstructionAccess().getModelAttributeCrossReference_1_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2132:2: (otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==12) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2132:4: otherlv_2= '.' ( (lv_modelAccess_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSetInstruction4901); 

                        	newLeafNode(otherlv_2, grammarAccess.getSetInstructionAccess().getFullStopKeyword_2_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2136:1: ( (lv_modelAccess_3_0= ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2137:1: (lv_modelAccess_3_0= ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2137:1: (lv_modelAccess_3_0= ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2138:3: lv_modelAccess_3_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetInstructionAccess().getModelAccessQualifiedNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSetInstruction4922);
                    lv_modelAccess_3_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetInstructionRule());
                    	        }
                           		set(
                           			current, 
                           			"modelAccess",
                            		lv_modelAccess_3_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleSetInstruction4936); 

                	newLeafNode(otherlv_4, grammarAccess.getSetInstructionAccess().getToKeyword_3());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2158:1: ( (lv_assignment_5_0= ruleSetInstructionAssignment ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2159:1: (lv_assignment_5_0= ruleSetInstructionAssignment )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2159:1: (lv_assignment_5_0= ruleSetInstructionAssignment )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2160:3: lv_assignment_5_0= ruleSetInstructionAssignment
            {
             
            	        newCompositeNode(grammarAccess.getSetInstructionAccess().getAssignmentSetInstructionAssignmentParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSetInstructionAssignment_in_ruleSetInstruction4957);
            lv_assignment_5_0=ruleSetInstructionAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetInstructionRule());
            	        }
                   		set(
                   			current, 
                   			"assignment",
                    		lv_assignment_5_0, 
                    		"SetInstructionAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleSetInstruction"


    // $ANTLR start "entryRuleNavigate"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2184:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2185:2: (iv_ruleNavigate= ruleNavigate EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2186:2: iv_ruleNavigate= ruleNavigate EOF
            {
             newCompositeNode(grammarAccess.getNavigateRule()); 
            pushFollow(FOLLOW_ruleNavigate_in_entryRuleNavigate4993);
            iv_ruleNavigate=ruleNavigate();

            state._fsp--;

             current =iv_ruleNavigate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigate5003); 

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
    // $ANTLR end "entryRuleNavigate"


    // $ANTLR start "ruleNavigate"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2193:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )* otherlv_5= ')' )? ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_params_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2196:28: ( (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )* otherlv_5= ')' )? ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2197:1: (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )* otherlv_5= ')' )? )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2197:1: (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )* otherlv_5= ')' )? )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2197:3: otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleNavigate5040); 

                	newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigatetoKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2201:1: ( (otherlv_1= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2202:1: (otherlv_1= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2202:1: (otherlv_1= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2203:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNavigateRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNavigate5060); 

            		newLeafNode(otherlv_1, grammarAccess.getNavigateAccess().getScreenScreenCrossReference_1_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2214:2: (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )* otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2214:4: otherlv_2= '(' ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )* otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleNavigate5073); 

                        	newLeafNode(otherlv_2, grammarAccess.getNavigateAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2218:1: ( ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )? )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==49) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2218:2: ( (lv_params_3_0= ruleParameters ) ) ( ruleASEPARATOR )?
                    	    {
                    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2218:2: ( (lv_params_3_0= ruleParameters ) )
                    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2219:1: (lv_params_3_0= ruleParameters )
                    	    {
                    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2219:1: (lv_params_3_0= ruleParameters )
                    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2220:3: lv_params_3_0= ruleParameters
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNavigateAccess().getParamsParametersParserRuleCall_2_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameters_in_ruleNavigate5095);
                    	    lv_params_3_0=ruleParameters();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNavigateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_3_0, 
                    	            		"Parameters");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2236:2: ( ruleASEPARATOR )?
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0==25||LA35_0==71) ) {
                    	        alt35=1;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2237:5: ruleASEPARATOR
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getNavigateAccess().getASEPARATORParserRuleCall_2_1_1()); 
                    	                
                    	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleNavigate5112);
                    	            ruleASEPARATOR();

                    	            state._fsp--;

                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleNavigate5127); 

                        	newLeafNode(otherlv_5, grammarAccess.getNavigateAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleNavigate"


    // $ANTLR start "entryRuleExecuteAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2256:1: entryRuleExecuteAction returns [EObject current=null] : iv_ruleExecuteAction= ruleExecuteAction EOF ;
    public final EObject entryRuleExecuteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteAction = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2257:2: (iv_ruleExecuteAction= ruleExecuteAction EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2258:2: iv_ruleExecuteAction= ruleExecuteAction EOF
            {
             newCompositeNode(grammarAccess.getExecuteActionRule()); 
            pushFollow(FOLLOW_ruleExecuteAction_in_entryRuleExecuteAction5165);
            iv_ruleExecuteAction=ruleExecuteAction();

            state._fsp--;

             current =iv_ruleExecuteAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteAction5175); 

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
    // $ANTLR end "entryRuleExecuteAction"


    // $ANTLR start "ruleExecuteAction"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2265:1: ruleExecuteAction returns [EObject current=null] : (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExecuteAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2268:28: ( (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2269:1: (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2269:1: (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2269:3: otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleExecuteAction5212); 

                	newLeafNode(otherlv_0, grammarAccess.getExecuteActionAccess().getExecuteKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2273:1: ( (otherlv_1= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2274:1: (otherlv_1= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2274:1: (otherlv_1= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2275:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecuteActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecuteAction5232); 

            		newLeafNode(otherlv_1, grammarAccess.getExecuteActionAccess().getActionActionCrossReference_1_0()); 
            	

            }


            }


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
    // $ANTLR end "ruleExecuteAction"


    // $ANTLR start "entryRuleParameters"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2294:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2295:2: (iv_ruleParameters= ruleParameters EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2296:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters5269);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters5280); 

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2303:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'params' ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2306:28: (kw= 'params' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2308:2: kw= 'params'
            {
            kw=(Token)match(input,49,FOLLOW_49_in_ruleParameters5317); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAccess().getParamsKeyword()); 
                

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleSetInstructionAssignment"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2321:1: entryRuleSetInstructionAssignment returns [EObject current=null] : iv_ruleSetInstructionAssignment= ruleSetInstructionAssignment EOF ;
    public final EObject entryRuleSetInstructionAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetInstructionAssignment = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2322:2: (iv_ruleSetInstructionAssignment= ruleSetInstructionAssignment EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2323:2: iv_ruleSetInstructionAssignment= ruleSetInstructionAssignment EOF
            {
             newCompositeNode(grammarAccess.getSetInstructionAssignmentRule()); 
            pushFollow(FOLLOW_ruleSetInstructionAssignment_in_entryRuleSetInstructionAssignment5356);
            iv_ruleSetInstructionAssignment=ruleSetInstructionAssignment();

            state._fsp--;

             current =iv_ruleSetInstructionAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetInstructionAssignment5366); 

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
    // $ANTLR end "entryRuleSetInstructionAssignment"


    // $ANTLR start "ruleSetInstructionAssignment"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2330:1: ruleSetInstructionAssignment returns [EObject current=null] : (this_RestCall_0= ruleRestCall | ( () this_STRING_2= RULE_STRING ) | ( () this_INT_4= RULE_INT ) | this_DynamicValue_5= ruleDynamicValue | this_ControlValue_6= ruleControlValue ) ;
    public final EObject ruleSetInstructionAssignment() throws RecognitionException {
        EObject current = null;

        Token this_STRING_2=null;
        Token this_INT_4=null;
        EObject this_RestCall_0 = null;

        EObject this_DynamicValue_5 = null;

        EObject this_ControlValue_6 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2333:28: ( (this_RestCall_0= ruleRestCall | ( () this_STRING_2= RULE_STRING ) | ( () this_INT_4= RULE_INT ) | this_DynamicValue_5= ruleDynamicValue | this_ControlValue_6= ruleControlValue ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2334:1: (this_RestCall_0= ruleRestCall | ( () this_STRING_2= RULE_STRING ) | ( () this_INT_4= RULE_INT ) | this_DynamicValue_5= ruleDynamicValue | this_ControlValue_6= ruleControlValue )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2334:1: (this_RestCall_0= ruleRestCall | ( () this_STRING_2= RULE_STRING ) | ( () this_INT_4= RULE_INT ) | this_DynamicValue_5= ruleDynamicValue | this_ControlValue_6= ruleControlValue )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt38=1;
                }
                break;
            case RULE_STRING:
                {
                alt38=2;
                }
                break;
            case RULE_INT:
                {
                alt38=3;
                }
                break;
            case 20:
                {
                alt38=4;
                }
                break;
            case RULE_ID:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2335:5: this_RestCall_0= ruleRestCall
                    {
                     
                            newCompositeNode(grammarAccess.getSetInstructionAssignmentAccess().getRestCallParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRestCall_in_ruleSetInstructionAssignment5413);
                    this_RestCall_0=ruleRestCall();

                    state._fsp--;

                     
                            current = this_RestCall_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2344:6: ( () this_STRING_2= RULE_STRING )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2344:6: ( () this_STRING_2= RULE_STRING )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2344:7: () this_STRING_2= RULE_STRING
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2344:7: ()
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2345:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetInstructionAssignmentAccess().getSetInstructionAssignmentAction_1_0(),
                                current);
                        

                    }

                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSetInstructionAssignment5439); 
                     
                        newLeafNode(this_STRING_2, grammarAccess.getSetInstructionAssignmentAccess().getSTRINGTerminalRuleCall_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2355:6: ( () this_INT_4= RULE_INT )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2355:6: ( () this_INT_4= RULE_INT )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2355:7: () this_INT_4= RULE_INT
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2355:7: ()
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2356:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetInstructionAssignmentAccess().getSetInstructionAssignmentAction_2_0(),
                                current);
                        

                    }

                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSetInstructionAssignment5466); 
                     
                        newLeafNode(this_INT_4, grammarAccess.getSetInstructionAssignmentAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2367:5: this_DynamicValue_5= ruleDynamicValue
                    {
                     
                            newCompositeNode(grammarAccess.getSetInstructionAssignmentAccess().getDynamicValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDynamicValue_in_ruleSetInstructionAssignment5494);
                    this_DynamicValue_5=ruleDynamicValue();

                    state._fsp--;

                     
                            current = this_DynamicValue_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2377:5: this_ControlValue_6= ruleControlValue
                    {
                     
                            newCompositeNode(grammarAccess.getSetInstructionAssignmentAccess().getControlValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleControlValue_in_ruleSetInstructionAssignment5521);
                    this_ControlValue_6=ruleControlValue();

                    state._fsp--;

                     
                            current = this_ControlValue_6; 
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
    // $ANTLR end "ruleSetInstructionAssignment"


    // $ANTLR start "entryRuleRestCall"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2393:1: entryRuleRestCall returns [EObject current=null] : iv_ruleRestCall= ruleRestCall EOF ;
    public final EObject entryRuleRestCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestCall = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2394:2: (iv_ruleRestCall= ruleRestCall EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2395:2: iv_ruleRestCall= ruleRestCall EOF
            {
             newCompositeNode(grammarAccess.getRestCallRule()); 
            pushFollow(FOLLOW_ruleRestCall_in_entryRuleRestCall5556);
            iv_ruleRestCall=ruleRestCall();

            state._fsp--;

             current =iv_ruleRestCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestCall5566); 

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
    // $ANTLR end "entryRuleRestCall"


    // $ANTLR start "ruleRestCall"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2402:1: ruleRestCall returns [EObject current=null] : (otherlv_0= 'restcall' otherlv_1= '(' (otherlv_2= 'url' ruleVSEPARATOR ( (lv_url_4_0= ruleURL ) ) ) ruleASEPARATOR (otherlv_6= 'returnType' ruleVSEPARATOR ruleAttributeType ) otherlv_9= ')' ) ;
    public final EObject ruleRestCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2405:28: ( (otherlv_0= 'restcall' otherlv_1= '(' (otherlv_2= 'url' ruleVSEPARATOR ( (lv_url_4_0= ruleURL ) ) ) ruleASEPARATOR (otherlv_6= 'returnType' ruleVSEPARATOR ruleAttributeType ) otherlv_9= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2406:1: (otherlv_0= 'restcall' otherlv_1= '(' (otherlv_2= 'url' ruleVSEPARATOR ( (lv_url_4_0= ruleURL ) ) ) ruleASEPARATOR (otherlv_6= 'returnType' ruleVSEPARATOR ruleAttributeType ) otherlv_9= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2406:1: (otherlv_0= 'restcall' otherlv_1= '(' (otherlv_2= 'url' ruleVSEPARATOR ( (lv_url_4_0= ruleURL ) ) ) ruleASEPARATOR (otherlv_6= 'returnType' ruleVSEPARATOR ruleAttributeType ) otherlv_9= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2406:3: otherlv_0= 'restcall' otherlv_1= '(' (otherlv_2= 'url' ruleVSEPARATOR ( (lv_url_4_0= ruleURL ) ) ) ruleASEPARATOR (otherlv_6= 'returnType' ruleVSEPARATOR ruleAttributeType ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleRestCall5603); 

                	newLeafNode(otherlv_0, grammarAccess.getRestCallAccess().getRestcallKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleRestCall5615); 

                	newLeafNode(otherlv_1, grammarAccess.getRestCallAccess().getLeftParenthesisKeyword_1());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2414:1: (otherlv_2= 'url' ruleVSEPARATOR ( (lv_url_4_0= ruleURL ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2414:3: otherlv_2= 'url' ruleVSEPARATOR ( (lv_url_4_0= ruleURL ) )
            {
            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleRestCall5628); 

                	newLeafNode(otherlv_2, grammarAccess.getRestCallAccess().getUrlKeyword_2_0());
                
             
                    newCompositeNode(grammarAccess.getRestCallAccess().getVSEPARATORParserRuleCall_2_1()); 
                
            pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleRestCall5644);
            ruleVSEPARATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2426:1: ( (lv_url_4_0= ruleURL ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2427:1: (lv_url_4_0= ruleURL )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2427:1: (lv_url_4_0= ruleURL )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2428:3: lv_url_4_0= ruleURL
            {
             
            	        newCompositeNode(grammarAccess.getRestCallAccess().getUrlURLParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleURL_in_ruleRestCall5664);
            lv_url_4_0=ruleURL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestCallRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_4_0, 
                    		"URL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             
                    newCompositeNode(grammarAccess.getRestCallAccess().getASEPARATORParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleRestCall5681);
            ruleASEPARATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2452:1: (otherlv_6= 'returnType' ruleVSEPARATOR ruleAttributeType )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2452:3: otherlv_6= 'returnType' ruleVSEPARATOR ruleAttributeType
            {
            otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleRestCall5693); 

                	newLeafNode(otherlv_6, grammarAccess.getRestCallAccess().getReturnTypeKeyword_4_0());
                
             
                    newCompositeNode(grammarAccess.getRestCallAccess().getVSEPARATORParserRuleCall_4_1()); 
                
            pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleRestCall5709);
            ruleVSEPARATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getRestCallAccess().getAttributeTypeParserRuleCall_4_2()); 
                
            pushFollow(FOLLOW_ruleAttributeType_in_ruleRestCall5724);
            ruleAttributeType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleRestCall5736); 

                	newLeafNode(otherlv_9, grammarAccess.getRestCallAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleRestCall"


    // $ANTLR start "entryRuleControlValue"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2484:1: entryRuleControlValue returns [EObject current=null] : iv_ruleControlValue= ruleControlValue EOF ;
    public final EObject entryRuleControlValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlValue = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2485:2: (iv_ruleControlValue= ruleControlValue EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2486:2: iv_ruleControlValue= ruleControlValue EOF
            {
             newCompositeNode(grammarAccess.getControlValueRule()); 
            pushFollow(FOLLOW_ruleControlValue_in_entryRuleControlValue5772);
            iv_ruleControlValue=ruleControlValue();

            state._fsp--;

             current =iv_ruleControlValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControlValue5782); 

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
    // $ANTLR end "entryRuleControlValue"


    // $ANTLR start "ruleControlValue"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2493:1: ruleControlValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_controlAccess_2_0= ruleQualifiedName ) ) )? ) ;
    public final EObject ruleControlValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_controlAccess_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2496:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_controlAccess_2_0= ruleQualifiedName ) ) )? ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2497:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_controlAccess_2_0= ruleQualifiedName ) ) )? )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2497:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_controlAccess_2_0= ruleQualifiedName ) ) )? )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2497:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_controlAccess_2_0= ruleQualifiedName ) ) )?
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2497:2: ( (otherlv_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2498:1: (otherlv_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2498:1: (otherlv_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2499:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getControlValueRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleControlValue5827); 

            		newLeafNode(otherlv_0, grammarAccess.getControlValueAccess().getControlControlCrossReference_0_0()); 
            	

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2510:2: (otherlv_1= '.' ( (lv_controlAccess_2_0= ruleQualifiedName ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2510:4: otherlv_1= '.' ( (lv_controlAccess_2_0= ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleControlValue5840); 

                        	newLeafNode(otherlv_1, grammarAccess.getControlValueAccess().getFullStopKeyword_1_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2514:1: ( (lv_controlAccess_2_0= ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2515:1: (lv_controlAccess_2_0= ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2515:1: (lv_controlAccess_2_0= ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2516:3: lv_controlAccess_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getControlValueAccess().getControlAccessQualifiedNameParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleControlValue5861);
                    lv_controlAccess_2_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControlValueRule());
                    	        }
                           		set(
                           			current, 
                           			"controlAccess",
                            		lv_controlAccess_2_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleControlValue"


    // $ANTLR start "entryRuleURL"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2540:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2541:2: (iv_ruleURL= ruleURL EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2542:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_ruleURL_in_entryRuleURL5900);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURL5911); 

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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2549:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2552:28: (this_STRING_0= RULE_STRING )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2553:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURL5950); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getURLAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleModel"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2568:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2569:2: (iv_ruleModel= ruleModel EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2570:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel5994);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel6004); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2577:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2580:28: ( ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2581:1: ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2581:1: ( () otherlv_1= 'model' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2581:2: () otherlv_1= 'model' otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2581:2: ()
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2582:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleModel6050); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleModel6062); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2595:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2596:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2596:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2597:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleModel6083);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleModel6096); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleView"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2625:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2626:2: (iv_ruleView= ruleView EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2627:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView6132);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView6142); 

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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2634:1: ruleView returns [EObject current=null] : (otherlv_0= 'view' otherlv_1= '{' ( (lv_layouts_2_0= ruleLayout ) ) otherlv_3= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_layouts_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2637:28: ( (otherlv_0= 'view' otherlv_1= '{' ( (lv_layouts_2_0= ruleLayout ) ) otherlv_3= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2638:1: (otherlv_0= 'view' otherlv_1= '{' ( (lv_layouts_2_0= ruleLayout ) ) otherlv_3= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2638:1: (otherlv_0= 'view' otherlv_1= '{' ( (lv_layouts_2_0= ruleLayout ) ) otherlv_3= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2638:3: otherlv_0= 'view' otherlv_1= '{' ( (lv_layouts_2_0= ruleLayout ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleView6179); 

                	newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleView6191); 

                	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2646:1: ( (lv_layouts_2_0= ruleLayout ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2647:1: (lv_layouts_2_0= ruleLayout )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2647:1: (lv_layouts_2_0= ruleLayout )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2648:3: lv_layouts_2_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getViewAccess().getLayoutsLayoutParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLayout_in_ruleView6212);
            lv_layouts_2_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewRule());
            	        }
                   		add(
                   			current, 
                   			"layouts",
                    		lv_layouts_2_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleView6224); 

                	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2676:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2677:2: (iv_ruleLayout= ruleLayout EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2678:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_ruleLayout_in_entryRuleLayout6260);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayout6270); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2685:1: ruleLayout returns [EObject current=null] : ( (this_GridLayout_0= ruleGridLayout | this_RowLayout_1= ruleRowLayout ) otherlv_2= '{' ( (lv_controls_3_0= ruleControl ) )* otherlv_4= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_GridLayout_0 = null;

        EObject this_RowLayout_1 = null;

        EObject lv_controls_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2688:28: ( ( (this_GridLayout_0= ruleGridLayout | this_RowLayout_1= ruleRowLayout ) otherlv_2= '{' ( (lv_controls_3_0= ruleControl ) )* otherlv_4= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2689:1: ( (this_GridLayout_0= ruleGridLayout | this_RowLayout_1= ruleRowLayout ) otherlv_2= '{' ( (lv_controls_3_0= ruleControl ) )* otherlv_4= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2689:1: ( (this_GridLayout_0= ruleGridLayout | this_RowLayout_1= ruleRowLayout ) otherlv_2= '{' ( (lv_controls_3_0= ruleControl ) )* otherlv_4= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2689:2: (this_GridLayout_0= ruleGridLayout | this_RowLayout_1= ruleRowLayout ) otherlv_2= '{' ( (lv_controls_3_0= ruleControl ) )* otherlv_4= '}'
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2689:2: (this_GridLayout_0= ruleGridLayout | this_RowLayout_1= ruleRowLayout )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==20) ) {
                    int LA41_2 = input.LA(3);

                    if ( (LA41_2==56) ) {
                        int LA41_3 = input.LA(4);

                        if ( (LA41_3==57) ) {
                            int LA41_4 = input.LA(5);

                            if ( (LA41_4==58) ) {
                                alt41=1;
                            }
                            else if ( (LA41_4==60) ) {
                                alt41=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2690:5: this_GridLayout_0= ruleGridLayout
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutAccess().getGridLayoutParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleGridLayout_in_ruleLayout6318);
                    this_GridLayout_0=ruleGridLayout();

                    state._fsp--;

                     
                            current = this_GridLayout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2700:5: this_RowLayout_1= ruleRowLayout
                    {
                     
                            newCompositeNode(grammarAccess.getLayoutAccess().getRowLayoutParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleRowLayout_in_ruleLayout6345);
                    this_RowLayout_1=ruleRowLayout();

                    state._fsp--;

                     
                            current = this_RowLayout_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleLayout6357); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2712:1: ( (lv_controls_3_0= ruleControl ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==30||LA42_0==55||LA42_0==61||LA42_0==66||(LA42_0>=68 && LA42_0<=69)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2713:1: (lv_controls_3_0= ruleControl )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2713:1: (lv_controls_3_0= ruleControl )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2714:3: lv_controls_3_0= ruleControl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLayoutAccess().getControlsControlParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleControl_in_ruleLayout6378);
            	    lv_controls_3_0=ruleControl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"controls",
            	            		lv_controls_3_0, 
            	            		"Control");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleLayout6391); 

                	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleGridLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2742:1: entryRuleGridLayout returns [EObject current=null] : iv_ruleGridLayout= ruleGridLayout EOF ;
    public final EObject entryRuleGridLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridLayout = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2743:2: (iv_ruleGridLayout= ruleGridLayout EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2744:2: iv_ruleGridLayout= ruleGridLayout EOF
            {
             newCompositeNode(grammarAccess.getGridLayoutRule()); 
            pushFollow(FOLLOW_ruleGridLayout_in_entryRuleGridLayout6427);
            iv_ruleGridLayout=ruleGridLayout();

            state._fsp--;

             current =iv_ruleGridLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGridLayout6437); 

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
    // $ANTLR end "entryRuleGridLayout"


    // $ANTLR start "ruleGridLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2751:1: ruleGridLayout returns [EObject current=null] : (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"grid\"' ) ) ruleASEPARATOR (otherlv_6= 'columns' ruleVSEPARATOR ( (lv_columns_8_0= RULE_INT ) ) ( ruleASEPARATOR )? )? otherlv_10= ')' ) ;
    public final EObject ruleGridLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_6=null;
        Token lv_columns_8_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2754:28: ( (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"grid\"' ) ) ruleASEPARATOR (otherlv_6= 'columns' ruleVSEPARATOR ( (lv_columns_8_0= RULE_INT ) ) ( ruleASEPARATOR )? )? otherlv_10= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2755:1: (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"grid\"' ) ) ruleASEPARATOR (otherlv_6= 'columns' ruleVSEPARATOR ( (lv_columns_8_0= RULE_INT ) ) ( ruleASEPARATOR )? )? otherlv_10= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2755:1: (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"grid\"' ) ) ruleASEPARATOR (otherlv_6= 'columns' ruleVSEPARATOR ( (lv_columns_8_0= RULE_INT ) ) ( ruleASEPARATOR )? )? otherlv_10= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2755:3: otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"grid\"' ) ) ruleASEPARATOR (otherlv_6= 'columns' ruleVSEPARATOR ( (lv_columns_8_0= RULE_INT ) ) ( ruleASEPARATOR )? )? otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleGridLayout6474); 

                	newLeafNode(otherlv_0, grammarAccess.getGridLayoutAccess().getLayoutKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleGridLayout6486); 

                	newLeafNode(otherlv_1, grammarAccess.getGridLayoutAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleGridLayout6498); 

                	newLeafNode(otherlv_2, grammarAccess.getGridLayoutAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleGridLayout6510); 

                	newLeafNode(otherlv_3, grammarAccess.getGridLayoutAccess().getColonKeyword_3());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2771:1: ( (lv_type_4_0= '\"grid\"' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2772:1: (lv_type_4_0= '\"grid\"' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2772:1: (lv_type_4_0= '\"grid\"' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2773:3: lv_type_4_0= '\"grid\"'
            {
            lv_type_4_0=(Token)match(input,58,FOLLOW_58_in_ruleGridLayout6528); 

                    newLeafNode(lv_type_4_0, grammarAccess.getGridLayoutAccess().getTypeGridKeyword_4_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGridLayoutRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_4_0, "\"grid\"");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getGridLayoutAccess().getASEPARATORParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleGridLayout6557);
            ruleASEPARATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2794:1: (otherlv_6= 'columns' ruleVSEPARATOR ( (lv_columns_8_0= RULE_INT ) ) ( ruleASEPARATOR )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==59) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2794:3: otherlv_6= 'columns' ruleVSEPARATOR ( (lv_columns_8_0= RULE_INT ) ) ( ruleASEPARATOR )?
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_59_in_ruleGridLayout6569); 

                        	newLeafNode(otherlv_6, grammarAccess.getGridLayoutAccess().getColumnsKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getGridLayoutAccess().getVSEPARATORParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleGridLayout6585);
                    ruleVSEPARATOR();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2806:1: ( (lv_columns_8_0= RULE_INT ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2807:1: (lv_columns_8_0= RULE_INT )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2807:1: (lv_columns_8_0= RULE_INT )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2808:3: lv_columns_8_0= RULE_INT
                    {
                    lv_columns_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGridLayout6601); 

                    			newLeafNode(lv_columns_8_0, grammarAccess.getGridLayoutAccess().getColumnsINTTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridLayoutRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"columns",
                            		lv_columns_8_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2824:2: ( ruleASEPARATOR )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==25||LA43_0==71) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2825:5: ruleASEPARATOR
                            {
                             
                                    newCompositeNode(grammarAccess.getGridLayoutAccess().getASEPARATORParserRuleCall_6_3()); 
                                
                            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleGridLayout6623);
                            ruleASEPARATOR();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleGridLayout6638); 

                	newLeafNode(otherlv_10, grammarAccess.getGridLayoutAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleGridLayout"


    // $ANTLR start "entryRuleRowLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2844:1: entryRuleRowLayout returns [EObject current=null] : iv_ruleRowLayout= ruleRowLayout EOF ;
    public final EObject entryRuleRowLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowLayout = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2845:2: (iv_ruleRowLayout= ruleRowLayout EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2846:2: iv_ruleRowLayout= ruleRowLayout EOF
            {
             newCompositeNode(grammarAccess.getRowLayoutRule()); 
            pushFollow(FOLLOW_ruleRowLayout_in_entryRuleRowLayout6674);
            iv_ruleRowLayout=ruleRowLayout();

            state._fsp--;

             current =iv_ruleRowLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRowLayout6684); 

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
    // $ANTLR end "entryRuleRowLayout"


    // $ANTLR start "ruleRowLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2853:1: ruleRowLayout returns [EObject current=null] : (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"rowlayout\"' ) ) otherlv_5= ')' ) ;
    public final EObject ruleRowLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2856:28: ( (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"rowlayout\"' ) ) otherlv_5= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2857:1: (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"rowlayout\"' ) ) otherlv_5= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2857:1: (otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"rowlayout\"' ) ) otherlv_5= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2857:3: otherlv_0= 'layout' otherlv_1= '(' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= '\"rowlayout\"' ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleRowLayout6721); 

                	newLeafNode(otherlv_0, grammarAccess.getRowLayoutAccess().getLayoutKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleRowLayout6733); 

                	newLeafNode(otherlv_1, grammarAccess.getRowLayoutAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleRowLayout6745); 

                	newLeafNode(otherlv_2, grammarAccess.getRowLayoutAccess().getTypeKeyword_2());
                
            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleRowLayout6757); 

                	newLeafNode(otherlv_3, grammarAccess.getRowLayoutAccess().getColonKeyword_3());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2873:1: ( (lv_type_4_0= '\"rowlayout\"' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2874:1: (lv_type_4_0= '\"rowlayout\"' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2874:1: (lv_type_4_0= '\"rowlayout\"' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2875:3: lv_type_4_0= '\"rowlayout\"'
            {
            lv_type_4_0=(Token)match(input,60,FOLLOW_60_in_ruleRowLayout6775); 

                    newLeafNode(lv_type_4_0, grammarAccess.getRowLayoutAccess().getTypeRowlayoutKeyword_4_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRowLayoutRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_4_0, "\"rowlayout\"");
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleRowLayout6800); 

                	newLeafNode(otherlv_5, grammarAccess.getRowLayoutAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleRowLayout"


    // $ANTLR start "entryRuleControl"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2900:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2901:2: (iv_ruleControl= ruleControl EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2902:2: iv_ruleControl= ruleControl EOF
            {
             newCompositeNode(grammarAccess.getControlRule()); 
            pushFollow(FOLLOW_ruleControl_in_entryRuleControl6836);
            iv_ruleControl=ruleControl();

            state._fsp--;

             current =iv_ruleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControl6846); 

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
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2909:1: ruleControl returns [EObject current=null] : (this_Layout_0= ruleLayout | this_ScreenLayout_1= ruleScreenLayout | this_List_2= ruleList | this_Text_3= ruleText | this_Button_4= ruleButton | this_Label_5= ruleLabel ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        EObject this_Layout_0 = null;

        EObject this_ScreenLayout_1 = null;

        EObject this_List_2 = null;

        EObject this_Text_3 = null;

        EObject this_Button_4 = null;

        EObject this_Label_5 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2912:28: ( (this_Layout_0= ruleLayout | this_ScreenLayout_1= ruleScreenLayout | this_List_2= ruleList | this_Text_3= ruleText | this_Button_4= ruleButton | this_Label_5= ruleLabel ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2913:1: (this_Layout_0= ruleLayout | this_ScreenLayout_1= ruleScreenLayout | this_List_2= ruleList | this_Text_3= ruleText | this_Button_4= ruleButton | this_Label_5= ruleLabel )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2913:1: (this_Layout_0= ruleLayout | this_ScreenLayout_1= ruleScreenLayout | this_List_2= ruleList | this_Text_3= ruleText | this_Button_4= ruleButton | this_Label_5= ruleLabel )
            int alt45=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt45=1;
                }
                break;
            case 30:
                {
                alt45=2;
                }
                break;
            case 61:
                {
                alt45=3;
                }
                break;
            case 66:
                {
                alt45=4;
                }
                break;
            case 68:
                {
                alt45=5;
                }
                break;
            case 69:
                {
                alt45=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2914:5: this_Layout_0= ruleLayout
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getLayoutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLayout_in_ruleControl6893);
                    this_Layout_0=ruleLayout();

                    state._fsp--;

                     
                            current = this_Layout_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2924:5: this_ScreenLayout_1= ruleScreenLayout
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getScreenLayoutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScreenLayout_in_ruleControl6920);
                    this_ScreenLayout_1=ruleScreenLayout();

                    state._fsp--;

                     
                            current = this_ScreenLayout_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2934:5: this_List_2= ruleList
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getListParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleList_in_ruleControl6947);
                    this_List_2=ruleList();

                    state._fsp--;

                     
                            current = this_List_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2944:5: this_Text_3= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getTextParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleControl6974);
                    this_Text_3=ruleText();

                    state._fsp--;

                     
                            current = this_Text_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2954:5: this_Button_4= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getButtonParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleControl7001);
                    this_Button_4=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2964:5: this_Label_5= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getControlAccess().getLabelParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleControl7028);
                    this_Label_5=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_5; 
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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleScreenLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2980:1: entryRuleScreenLayout returns [EObject current=null] : iv_ruleScreenLayout= ruleScreenLayout EOF ;
    public final EObject entryRuleScreenLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenLayout = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2981:2: (iv_ruleScreenLayout= ruleScreenLayout EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2982:2: iv_ruleScreenLayout= ruleScreenLayout EOF
            {
             newCompositeNode(grammarAccess.getScreenLayoutRule()); 
            pushFollow(FOLLOW_ruleScreenLayout_in_entryRuleScreenLayout7063);
            iv_ruleScreenLayout=ruleScreenLayout();

            state._fsp--;

             current =iv_ruleScreenLayout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenLayout7073); 

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
    // $ANTLR end "entryRuleScreenLayout"


    // $ANTLR start "ruleScreenLayout"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2989:1: ruleScreenLayout returns [EObject current=null] : (otherlv_0= 'screen' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleScreenLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2992:28: ( (otherlv_0= 'screen' ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2993:1: (otherlv_0= 'screen' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2993:1: (otherlv_0= 'screen' ( (otherlv_1= RULE_ID ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2993:3: otherlv_0= 'screen' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleScreenLayout7110); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenLayoutAccess().getScreenKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2997:1: ( (otherlv_1= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2998:1: (otherlv_1= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2998:1: (otherlv_1= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:2999:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getScreenLayoutRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScreenLayout7130); 

            		newLeafNode(otherlv_1, grammarAccess.getScreenLayoutAccess().getScreenScreenCrossReference_1_0()); 
            	

            }


            }


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
    // $ANTLR end "ruleScreenLayout"


    // $ANTLR start "entryRuleList"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3018:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3019:2: (iv_ruleList= ruleList EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3020:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList7166);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList7176); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3027:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_16= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_labelprovider_6_0 = null;

        EObject lv_cssStyle_10_0 = null;

        EObject lv_tooltip_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3030:28: ( (otherlv_0= 'list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_16= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3031:1: (otherlv_0= 'list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_16= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3031:1: (otherlv_0= 'list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_16= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3031:3: otherlv_0= 'list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleList7213); 

                	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3035:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3036:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3036:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3037:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleList7230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getListAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleList7247); 

                	newLeafNode(otherlv_2, grammarAccess.getListAccess().getLeftParenthesisKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3057:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3059:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3059:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3060:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getListAccess().getUnorderedGroup_3());
            	
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3063:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3064:3: ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )*
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3064:3: ( ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )*
            loop49:
            do {
                int alt49=4;
                int LA49_0 = input.LA(1);

                if ( LA49_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 2) ) {
                    alt49=3;
                }


                switch (alt49) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3066:4: ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3066:4: ({...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3067:5: {...}? => ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3067:101: ( ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3068:6: ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3071:6: ({...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3071:7: {...}? => (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3071:16: (otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3071:18: otherlv_4= 'labelprovider' ruleVSEPARATOR ( (lv_labelprovider_6_0= ruleValue ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleList7305); 

            	        	newLeafNode(otherlv_4, grammarAccess.getListAccess().getLabelproviderKeyword_3_0_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getListAccess().getVSEPARATORParserRuleCall_3_0_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleList7321);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3083:1: ( (lv_labelprovider_6_0= ruleValue ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3084:1: (lv_labelprovider_6_0= ruleValue )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3084:1: (lv_labelprovider_6_0= ruleValue )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3085:3: lv_labelprovider_6_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getLabelproviderValueParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleList7341);
            	    lv_labelprovider_6_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getListRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"labelprovider",
            	            		lv_labelprovider_6_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3101:2: ( ruleASEPARATOR )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==25||LA46_0==71) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3102:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getListAccess().getASEPARATORParserRuleCall_3_0_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleList7358);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3116:4: ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3116:4: ({...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3117:5: {...}? => ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3117:101: ( ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3118:6: ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3121:6: ({...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3121:7: {...}? => (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3121:16: (otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3121:18: otherlv_8= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_10_0= ruleValue ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_8=(Token)match(input,63,FOLLOW_63_in_ruleList7427); 

            	        	newLeafNode(otherlv_8, grammarAccess.getListAccess().getCssStyleKeyword_3_1_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getListAccess().getVSEPARATORParserRuleCall_3_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleList7443);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3133:1: ( (lv_cssStyle_10_0= ruleValue ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3134:1: (lv_cssStyle_10_0= ruleValue )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3134:1: (lv_cssStyle_10_0= ruleValue )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3135:3: lv_cssStyle_10_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getCssStyleValueParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleList7463);
            	    lv_cssStyle_10_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getListRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"cssStyle",
            	            		lv_cssStyle_10_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3151:2: ( ruleASEPARATOR )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==25||LA47_0==71) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3152:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getListAccess().getASEPARATORParserRuleCall_3_1_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleList7480);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3166:4: ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3166:4: ({...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3167:5: {...}? => ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3167:101: ( ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3168:6: ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3171:6: ({...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3171:7: {...}? => (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3171:16: (otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3171:18: otherlv_12= 'tooltip' ruleVSEPARATOR ( (lv_tooltip_14_0= ruleValue ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_12=(Token)match(input,64,FOLLOW_64_in_ruleList7549); 

            	        	newLeafNode(otherlv_12, grammarAccess.getListAccess().getTooltipKeyword_3_2_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getListAccess().getVSEPARATORParserRuleCall_3_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleList7565);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3183:1: ( (lv_tooltip_14_0= ruleValue ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3184:1: (lv_tooltip_14_0= ruleValue )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3184:1: (lv_tooltip_14_0= ruleValue )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3185:3: lv_tooltip_14_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getTooltipValueParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleList7585);
            	    lv_tooltip_14_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getListRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tooltip",
            	            		lv_tooltip_14_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3201:2: ( ruleASEPARATOR )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==25||LA48_0==71) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3202:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getListAccess().getASEPARATORParserRuleCall_3_2_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleList7602);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getListAccess().getUnorderedGroup_3());
            	

            }

            otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleList7656); 

                	newLeafNode(otherlv_16, grammarAccess.getListAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleValue"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3235:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3236:2: (iv_ruleValue= ruleValue EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3237:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue7692);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue7702); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3244:1: ruleValue returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | this_INT_2= RULE_INT | this_DynamicValue_3= ruleDynamicValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_INT_2=null;
        EObject this_DynamicValue_3 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3247:28: ( ( ( () this_STRING_1= RULE_STRING ) | this_INT_2= RULE_INT | this_DynamicValue_3= ruleDynamicValue ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3248:1: ( ( () this_STRING_1= RULE_STRING ) | this_INT_2= RULE_INT | this_DynamicValue_3= ruleDynamicValue )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3248:1: ( ( () this_STRING_1= RULE_STRING ) | this_INT_2= RULE_INT | this_DynamicValue_3= ruleDynamicValue )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt50=1;
                }
                break;
            case RULE_INT:
                {
                alt50=2;
                }
                break;
            case 20:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3248:2: ( () this_STRING_1= RULE_STRING )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3248:2: ( () this_STRING_1= RULE_STRING )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3248:3: () this_STRING_1= RULE_STRING
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3248:3: ()
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3249:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getValueAccess().getValueAction_0_0(),
                                current);
                        

                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue7748); 
                     
                        newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3259:6: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue7765); 
                     
                        newLeafNode(this_INT_2, grammarAccess.getValueAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3265:5: this_DynamicValue_3= ruleDynamicValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDynamicValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDynamicValue_in_ruleValue7792);
                    this_DynamicValue_3=ruleDynamicValue();

                    state._fsp--;

                     
                            current = this_DynamicValue_3; 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleDynamicValue"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3281:1: entryRuleDynamicValue returns [EObject current=null] : iv_ruleDynamicValue= ruleDynamicValue EOF ;
    public final EObject entryRuleDynamicValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicValue = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3282:2: (iv_ruleDynamicValue= ruleDynamicValue EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3283:2: iv_ruleDynamicValue= ruleDynamicValue EOF
            {
             newCompositeNode(grammarAccess.getDynamicValueRule()); 
            pushFollow(FOLLOW_ruleDynamicValue_in_entryRuleDynamicValue7827);
            iv_ruleDynamicValue=ruleDynamicValue();

            state._fsp--;

             current =iv_ruleDynamicValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicValue7837); 

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
    // $ANTLR end "entryRuleDynamicValue"


    // $ANTLR start "ruleDynamicValue"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3290:1: ruleDynamicValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_variableName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= '|' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleDynamicValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variableName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3293:28: ( (otherlv_0= '(' ( (lv_variableName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= '|' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3294:1: (otherlv_0= '(' ( (lv_variableName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= '|' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3294:1: (otherlv_0= '(' ( (lv_variableName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= '|' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3294:3: otherlv_0= '(' ( (lv_variableName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= '|' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDynamicValue7874); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamicValueAccess().getLeftParenthesisKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3298:1: ( (lv_variableName_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3299:1: (lv_variableName_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3299:1: (lv_variableName_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3300:3: lv_variableName_1_0= RULE_ID
            {
            lv_variableName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDynamicValue7891); 

            			newLeafNode(lv_variableName_1_0, grammarAccess.getDynamicValueAccess().getVariableNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDynamicValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleDynamicValue7908); 

                	newLeafNode(otherlv_2, grammarAccess.getDynamicValueAccess().getColonKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3320:1: ( (lv_type_3_0= ruleAttributeType ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3321:1: (lv_type_3_0= ruleAttributeType )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3321:1: (lv_type_3_0= ruleAttributeType )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3322:3: lv_type_3_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getDynamicValueAccess().getTypeAttributeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeType_in_ruleDynamicValue7929);
            lv_type_3_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamicValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleDynamicValue7941); 

                	newLeafNode(otherlv_4, grammarAccess.getDynamicValueAccess().getVerticalLineKeyword_4());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3342:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3343:1: (lv_expression_5_0= ruleExpression )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3343:1: (lv_expression_5_0= ruleExpression )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3344:3: lv_expression_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDynamicValueAccess().getExpressionExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleDynamicValue7962);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamicValueRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleDynamicValue7974); 

                	newLeafNode(otherlv_6, grammarAccess.getDynamicValueAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleDynamicValue"


    // $ANTLR start "entryRuleExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3372:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3373:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3374:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression8010);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression8020); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3381:1: ruleExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleExpressionTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleExpressionTerm ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_terms_0_0 = null;

        AntlrDatatypeRuleToken lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3384:28: ( ( ( (lv_terms_0_0= ruleExpressionTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleExpressionTerm ) ) )* ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3385:1: ( ( (lv_terms_0_0= ruleExpressionTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleExpressionTerm ) ) )* )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3385:1: ( ( (lv_terms_0_0= ruleExpressionTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleExpressionTerm ) ) )* )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3385:2: ( (lv_terms_0_0= ruleExpressionTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleExpressionTerm ) ) )*
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3385:2: ( (lv_terms_0_0= ruleExpressionTerm ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3386:1: (lv_terms_0_0= ruleExpressionTerm )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3386:1: (lv_terms_0_0= ruleExpressionTerm )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3387:3: lv_terms_0_0= ruleExpressionTerm
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getTermsExpressionTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleExpression8066);
            lv_terms_0_0=ruleExpressionTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"terms",
                    		lv_terms_0_0, 
                    		"ExpressionTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3403:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleExpressionTerm ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==65) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3403:4: otherlv_1= '+' ( (lv_terms_2_0= ruleExpressionTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleExpression8079); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3407:1: ( (lv_terms_2_0= ruleExpressionTerm ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3408:1: (lv_terms_2_0= ruleExpressionTerm )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3408:1: (lv_terms_2_0= ruleExpressionTerm )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3409:3: lv_terms_2_0= ruleExpressionTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getTermsExpressionTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpressionTerm_in_ruleExpression8100);
            	    lv_terms_2_0=ruleExpressionTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_2_0, 
            	            		"ExpressionTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionTerm"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3433:1: entryRuleExpressionTerm returns [String current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final String entryRuleExpressionTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionTerm = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3434:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3435:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
             newCompositeNode(grammarAccess.getExpressionTermRule()); 
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8139);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;

             current =iv_ruleExpressionTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8150); 

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
    // $ANTLR end "entryRuleExpressionTerm"


    // $ANTLR start "ruleExpressionTerm"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3442:1: ruleExpressionTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExpressionTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3445:28: ( (this_QualifiedName_0= ruleQualifiedName | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3446:1: (this_QualifiedName_0= ruleQualifiedName | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3446:1: (this_QualifiedName_0= ruleQualifiedName | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt52=1;
                }
                break;
            case RULE_STRING:
                {
                alt52=2;
                }
                break;
            case RULE_INT:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3447:5: this_QualifiedName_0= ruleQualifiedName
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionTermAccess().getQualifiedNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleExpressionTerm8197);
                    this_QualifiedName_0=ruleQualifiedName();

                    state._fsp--;


                    		current.merge(this_QualifiedName_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3458:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExpressionTerm8223); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getExpressionTermAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3466:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpressionTerm8249); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getExpressionTermAccess().getINTTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleExpressionTerm"


    // $ANTLR start "entryRuleText"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3481:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3482:2: (iv_ruleText= ruleText EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3483:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText8294);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText8304); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3490:1: ruleText returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_cssStyle_6_0 = null;

        EObject lv_resourceKey_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3493:28: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3494:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3494:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3494:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleText8341); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3498:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3499:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3499:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3500:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText8358); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleText8375); 

                	newLeafNode(otherlv_2, grammarAccess.getTextAccess().getLeftParenthesisKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3520:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3522:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3522:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3523:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_3());
            	
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3526:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3527:3: ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )*
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3527:3: ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )*
            loop55:
            do {
                int alt55=3;
                int LA55_0 = input.LA(1);

                if ( LA55_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_3(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_3(), 1) ) {
                    alt55=2;
                }


                switch (alt55) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3529:4: ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3529:4: ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3530:5: {...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3530:101: ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3531:6: ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3534:6: ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3534:7: {...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3534:16: (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3534:18: otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleText8433); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getCssStyleKeyword_3_0_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getTextAccess().getVSEPARATORParserRuleCall_3_0_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleText8449);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3546:1: ( (lv_cssStyle_6_0= ruleValue ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3547:1: (lv_cssStyle_6_0= ruleValue )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3547:1: (lv_cssStyle_6_0= ruleValue )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3548:3: lv_cssStyle_6_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getCssStyleValueParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleText8469);
            	    lv_cssStyle_6_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"cssStyle",
            	            		lv_cssStyle_6_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3564:2: ( ruleASEPARATOR )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==25||LA53_0==71) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3565:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getTextAccess().getASEPARATORParserRuleCall_3_0_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleText8486);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3579:4: ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3579:4: ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3580:5: {...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3580:101: ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3581:6: ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3584:6: ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3584:7: {...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3584:16: (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3584:18: otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_8=(Token)match(input,67,FOLLOW_67_in_ruleText8555); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTextAccess().getResourceKeyKeyword_3_1_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getTextAccess().getVSEPARATORParserRuleCall_3_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleText8571);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3596:1: ( (lv_resourceKey_10_0= ruleValue ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3597:1: (lv_resourceKey_10_0= ruleValue )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3597:1: (lv_resourceKey_10_0= ruleValue )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3598:3: lv_resourceKey_10_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getResourceKeyValueParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleText8591);
            	    lv_resourceKey_10_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceKey",
            	            		lv_resourceKey_10_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3614:2: ( ruleASEPARATOR )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==25||LA54_0==71) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3615:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getTextAccess().getASEPARATORParserRuleCall_3_1_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleText8608);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_3());
            	

            }

            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleText8662); 

                	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleButton"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3648:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3649:2: (iv_ruleButton= ruleButton EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3650:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton8698);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton8708); 

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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3657:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_cssStyle_6_0 = null;

        EObject lv_resourceKey_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3660:28: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3661:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3661:1: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3661:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleButton8745); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3665:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3666:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3666:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3667:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton8762); 

            			newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleButton8779); 

                	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftParenthesisKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3687:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3689:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3689:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3690:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getButtonAccess().getUnorderedGroup_3());
            	
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3693:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )* )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3694:3: ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )*
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3694:3: ( ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) ) )*
            loop58:
            do {
                int alt58=3;
                int LA58_0 = input.LA(1);

                if ( LA58_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 1) ) {
                    alt58=2;
                }


                switch (alt58) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3696:4: ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3696:4: ({...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3697:5: {...}? => ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3697:103: ( ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3698:6: ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3701:6: ({...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3701:7: {...}? => (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3701:16: (otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3701:18: otherlv_4= 'cssStyle' ruleVSEPARATOR ( (lv_cssStyle_6_0= ruleValue ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleButton8837); 

            	        	newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getCssStyleKeyword_3_0_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getButtonAccess().getVSEPARATORParserRuleCall_3_0_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleButton8853);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3713:1: ( (lv_cssStyle_6_0= ruleValue ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3714:1: (lv_cssStyle_6_0= ruleValue )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3714:1: (lv_cssStyle_6_0= ruleValue )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3715:3: lv_cssStyle_6_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getButtonAccess().getCssStyleValueParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleButton8873);
            	    lv_cssStyle_6_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"cssStyle",
            	            		lv_cssStyle_6_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3731:2: ( ruleASEPARATOR )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==25||LA56_0==71) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3732:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getButtonAccess().getASEPARATORParserRuleCall_3_0_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleButton8890);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3746:4: ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3746:4: ({...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3747:5: {...}? => ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "getUnorderedGroupHelper().canSelect(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3747:103: ( ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3748:6: ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getButtonAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3751:6: ({...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3751:7: {...}? => (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleButton", "true");
            	    }
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3751:16: (otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )? )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3751:18: otherlv_8= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_10_0= ruleValue ) ) ( ruleASEPARATOR )?
            	    {
            	    otherlv_8=(Token)match(input,67,FOLLOW_67_in_ruleButton8959); 

            	        	newLeafNode(otherlv_8, grammarAccess.getButtonAccess().getResourceKeyKeyword_3_1_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getButtonAccess().getVSEPARATORParserRuleCall_3_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleButton8975);
            	    ruleVSEPARATOR();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3763:1: ( (lv_resourceKey_10_0= ruleValue ) )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3764:1: (lv_resourceKey_10_0= ruleValue )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3764:1: (lv_resourceKey_10_0= ruleValue )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3765:3: lv_resourceKey_10_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getButtonAccess().getResourceKeyValueParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleButton8995);
            	    lv_resourceKey_10_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"resourceKey",
            	            		lv_resourceKey_10_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3781:2: ( ruleASEPARATOR )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==25||LA57_0==71) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3782:5: ruleASEPARATOR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getButtonAccess().getASEPARATORParserRuleCall_3_1_3()); 
            	                
            	            pushFollow(FOLLOW_ruleASEPARATOR_in_ruleButton9012);
            	            ruleASEPARATOR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getButtonAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getButtonAccess().getUnorderedGroup_3());
            	

            }

            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleButton9066); 

                	newLeafNode(otherlv_12, grammarAccess.getButtonAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleLabel"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3815:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3816:2: (iv_ruleLabel= ruleLabel EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3817:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel9102);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel9112); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3824:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_5_0= ruleValue ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_resourceKey_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3827:28: ( (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_5_0= ruleValue ) ) )? otherlv_6= ')' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3828:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_5_0= ruleValue ) ) )? otherlv_6= ')' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3828:1: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_5_0= ruleValue ) ) )? otherlv_6= ')' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3828:3: otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_5_0= ruleValue ) ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleLabel9149); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3832:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3833:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3833:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3834:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel9166); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleLabel9183); 

                	newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getLeftParenthesisKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3854:1: (otherlv_3= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_5_0= ruleValue ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==67) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3854:3: otherlv_3= 'resourceKey' ruleVSEPARATOR ( (lv_resourceKey_5_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleLabel9196); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getResourceKeyKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getLabelAccess().getVSEPARATORParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleLabel9212);
                    ruleVSEPARATOR();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3866:1: ( (lv_resourceKey_5_0= ruleValue ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3867:1: (lv_resourceKey_5_0= ruleValue )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3867:1: (lv_resourceKey_5_0= ruleValue )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3868:3: lv_resourceKey_5_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelAccess().getResourceKeyValueParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleLabel9232);
                    lv_resourceKey_5_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"resourceKey",
                            		lv_resourceKey_5_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleLabel9246); 

                	newLeafNode(otherlv_6, grammarAccess.getLabelAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAttribute"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3896:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3897:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3898:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute9282);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute9292); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3905:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ruleVSEPARATOR ( (lv_type_2_0= ruleAttributeType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3908:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ruleVSEPARATOR ( (lv_type_2_0= ruleAttributeType ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3909:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleVSEPARATOR ( (lv_type_2_0= ruleAttributeType ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3909:1: ( ( (lv_name_0_0= RULE_ID ) ) ruleVSEPARATOR ( (lv_type_2_0= ruleAttributeType ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3909:2: ( (lv_name_0_0= RULE_ID ) ) ruleVSEPARATOR ( (lv_type_2_0= ruleAttributeType ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3909:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3910:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3910:1: (lv_name_0_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3911:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute9334); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getAttributeAccess().getVSEPARATORParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleVSEPARATOR_in_ruleAttribute9355);
            ruleVSEPARATOR();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3935:1: ( (lv_type_2_0= ruleAttributeType ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3936:1: (lv_type_2_0= ruleAttributeType )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3936:1: (lv_type_2_0= ruleAttributeType )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3937:3: lv_type_2_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttribute9375);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3961:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3962:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3963:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType9412);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType9423); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3970:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3973:28: (this_QualifiedName_0= ruleQualifiedName )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3975:5: this_QualifiedName_0= ruleQualifiedName
            {
             
                    newCompositeNode(grammarAccess.getAttributeTypeAccess().getQualifiedNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttributeType9469);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleCompositeScreen"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3993:1: entryRuleCompositeScreen returns [EObject current=null] : iv_ruleCompositeScreen= ruleCompositeScreen EOF ;
    public final EObject entryRuleCompositeScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeScreen = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3994:2: (iv_ruleCompositeScreen= ruleCompositeScreen EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:3995:2: iv_ruleCompositeScreen= ruleCompositeScreen EOF
            {
             newCompositeNode(grammarAccess.getCompositeScreenRule()); 
            pushFollow(FOLLOW_ruleCompositeScreen_in_entryRuleCompositeScreen9513);
            iv_ruleCompositeScreen=ruleCompositeScreen();

            state._fsp--;

             current =iv_ruleCompositeScreen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeScreen9523); 

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
    // $ANTLR end "entryRuleCompositeScreen"


    // $ANTLR start "ruleCompositeScreen"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4002:1: ruleCompositeScreen returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screens' otherlv_4= '{' ( (lv_layouts_5_0= ruleLayout ) ) otherlv_6= '}' otherlv_7= '}' ) ;
    public final EObject ruleCompositeScreen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_layouts_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4005:28: ( (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screens' otherlv_4= '{' ( (lv_layouts_5_0= ruleLayout ) ) otherlv_6= '}' otherlv_7= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4006:1: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screens' otherlv_4= '{' ( (lv_layouts_5_0= ruleLayout ) ) otherlv_6= '}' otherlv_7= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4006:1: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screens' otherlv_4= '{' ( (lv_layouts_5_0= ruleLayout ) ) otherlv_6= '}' otherlv_7= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4006:3: otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'screens' otherlv_4= '{' ( (lv_layouts_5_0= ruleLayout ) ) otherlv_6= '}' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleCompositeScreen9560); 

                	newLeafNode(otherlv_0, grammarAccess.getCompositeScreenAccess().getScreenKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4010:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4011:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4011:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4012:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeScreen9577); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCompositeScreenAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeScreenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleCompositeScreen9594); 

                	newLeafNode(otherlv_2, grammarAccess.getCompositeScreenAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,70,FOLLOW_70_in_ruleCompositeScreen9606); 

                	newLeafNode(otherlv_3, grammarAccess.getCompositeScreenAccess().getScreensKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCompositeScreen9618); 

                	newLeafNode(otherlv_4, grammarAccess.getCompositeScreenAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4040:1: ( (lv_layouts_5_0= ruleLayout ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4041:1: (lv_layouts_5_0= ruleLayout )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4041:1: (lv_layouts_5_0= ruleLayout )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4042:3: lv_layouts_5_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getCompositeScreenAccess().getLayoutsLayoutParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleLayout_in_ruleCompositeScreen9639);
            lv_layouts_5_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeScreenRule());
            	        }
                   		add(
                   			current, 
                   			"layouts",
                    		lv_layouts_5_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCompositeScreen9651); 

                	newLeafNode(otherlv_6, grammarAccess.getCompositeScreenAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCompositeScreen9663); 

                	newLeafNode(otherlv_7, grammarAccess.getCompositeScreenAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleCompositeScreen"


    // $ANTLR start "entryRuleVSEPARATOR"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4074:1: entryRuleVSEPARATOR returns [String current=null] : iv_ruleVSEPARATOR= ruleVSEPARATOR EOF ;
    public final String entryRuleVSEPARATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVSEPARATOR = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4075:2: (iv_ruleVSEPARATOR= ruleVSEPARATOR EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4076:2: iv_ruleVSEPARATOR= ruleVSEPARATOR EOF
            {
             newCompositeNode(grammarAccess.getVSEPARATORRule()); 
            pushFollow(FOLLOW_ruleVSEPARATOR_in_entryRuleVSEPARATOR9700);
            iv_ruleVSEPARATOR=ruleVSEPARATOR();

            state._fsp--;

             current =iv_ruleVSEPARATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVSEPARATOR9711); 

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
    // $ANTLR end "entryRuleVSEPARATOR"


    // $ANTLR start "ruleVSEPARATOR"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4083:1: ruleVSEPARATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleVSEPARATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4086:28: (kw= ':' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4088:2: kw= ':'
            {
            kw=(Token)match(input,57,FOLLOW_57_in_ruleVSEPARATOR9748); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVSEPARATORAccess().getColonKeyword()); 
                

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
    // $ANTLR end "ruleVSEPARATOR"


    // $ANTLR start "entryRuleASEPARATOR"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4101:1: entryRuleASEPARATOR returns [String current=null] : iv_ruleASEPARATOR= ruleASEPARATOR EOF ;
    public final String entryRuleASEPARATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleASEPARATOR = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4102:2: (iv_ruleASEPARATOR= ruleASEPARATOR EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4103:2: iv_ruleASEPARATOR= ruleASEPARATOR EOF
            {
             newCompositeNode(grammarAccess.getASEPARATORRule()); 
            pushFollow(FOLLOW_ruleASEPARATOR_in_entryRuleASEPARATOR9788);
            iv_ruleASEPARATOR=ruleASEPARATOR();

            state._fsp--;

             current =iv_ruleASEPARATOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleASEPARATOR9799); 

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
    // $ANTLR end "entryRuleASEPARATOR"


    // $ANTLR start "ruleASEPARATOR"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4110:1: ruleASEPARATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= '\\n' ) ;
    public final AntlrDatatypeRuleToken ruleASEPARATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4113:28: ( (kw= ',' | kw= '\\n' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4114:1: (kw= ',' | kw= '\\n' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4114:1: (kw= ',' | kw= '\\n' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==25) ) {
                alt60=1;
            }
            else if ( (LA60_0==71) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4115:2: kw= ','
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleASEPARATOR9837); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getASEPARATORAccess().getCommaKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4122:2: kw= '\\n'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleASEPARATOR9856); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getASEPARATORAccess().getControl000aKeyword_1()); 
                        

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
    // $ANTLR end "ruleASEPARATOR"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4137:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4138:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4139:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9899);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9910); 

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
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4146:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4149:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4150:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4150:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4151:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9957);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4161:1: (kw= '.*' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==72) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4162:2: kw= '.*'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleQualifiedNameWithWildcard9976); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleDataType"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4177:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4178:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4179:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType10020);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType10030); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4186:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4189:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4190:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4190:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4190:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleDataType10067); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4194:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4195:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4195:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4196:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType10084); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4220:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4221:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4222:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity10125);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity10135); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4229:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4232:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4233:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4233:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4233:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleEntity10172); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4237:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4238:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4238:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4239:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity10189); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4255:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==75) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4255:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,75,FOLLOW_75_in_ruleEntity10207); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4259:1: ( ( ruleQualifiedName ) )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4260:1: ( ruleQualifiedName )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4260:1: ( ruleQualifiedName )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4261:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity10230);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEntity10244); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4278:1: ( (lv_features_5_0= ruleFeature ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID||LA63_0==76) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4279:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4279:1: (lv_features_5_0= ruleFeature )
            	    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4280:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity10265);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEntity10278); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4308:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4309:2: (iv_ruleFeature= ruleFeature EOF )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4310:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature10314);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature10324); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4317:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4320:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4321:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4321:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4321:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4321:2: ( (lv_many_0_0= 'many' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==76) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4322:1: (lv_many_0_0= 'many' )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4322:1: (lv_many_0_0= 'many' )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4323:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,76,FOLLOW_76_in_ruleFeature10367); 

                            newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4336:3: ( (lv_name_1_0= RULE_ID ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4337:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4337:1: (lv_name_1_0= RULE_ID )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4338:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature10398); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleFeature10415); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4358:1: ( ( ruleQualifiedName ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4359:1: ( ruleQualifiedName )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4359:1: ( ruleQualifiedName )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4360:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature10438);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "ruleDevice"
    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4381:1: ruleDevice returns [Enumerator current=null] : ( (enumLiteral_0= 'iphone' ) | (enumLiteral_1= 'ipad' ) | (enumLiteral_2= 'android4' ) | (enumLiteral_3= 'android2' ) ) ;
    public final Enumerator ruleDevice() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4383:28: ( ( (enumLiteral_0= 'iphone' ) | (enumLiteral_1= 'ipad' ) | (enumLiteral_2= 'android4' ) | (enumLiteral_3= 'android2' ) ) )
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4384:1: ( (enumLiteral_0= 'iphone' ) | (enumLiteral_1= 'ipad' ) | (enumLiteral_2= 'android4' ) | (enumLiteral_3= 'android2' ) )
            {
            // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4384:1: ( (enumLiteral_0= 'iphone' ) | (enumLiteral_1= 'ipad' ) | (enumLiteral_2= 'android4' ) | (enumLiteral_3= 'android2' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt65=1;
                }
                break;
            case 78:
                {
                alt65=2;
                }
                break;
            case 79:
                {
                alt65=3;
                }
                break;
            case 80:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4384:2: (enumLiteral_0= 'iphone' )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4384:2: (enumLiteral_0= 'iphone' )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4384:4: enumLiteral_0= 'iphone'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleDevice10488); 

                            current = grammarAccess.getDeviceAccess().getIphoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDeviceAccess().getIphoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4390:6: (enumLiteral_1= 'ipad' )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4390:6: (enumLiteral_1= 'ipad' )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4390:8: enumLiteral_1= 'ipad'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleDevice10505); 

                            current = grammarAccess.getDeviceAccess().getIpadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDeviceAccess().getIpadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4396:6: (enumLiteral_2= 'android4' )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4396:6: (enumLiteral_2= 'android4' )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4396:8: enumLiteral_2= 'android4'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleDevice10522); 

                            current = grammarAccess.getDeviceAccess().getAndroid4EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDeviceAccess().getAndroid4EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4402:6: (enumLiteral_3= 'android2' )
                    {
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4402:6: (enumLiteral_3= 'android2' )
                    // ../com.nagarro.appbuilder/src-gen/com/nagarro/parser/antlr/internal/InternalAppBuilderDSL.g:4402:8: enumLiteral_3= 'android2'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_80_in_ruleDevice10539); 

                            current = grammarAccess.getDeviceAccess().getAndroid2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDeviceAccess().getAndroid2EnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleDevice"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAppBuilder_in_entryRuleAppBuilder75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppBuilder85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleAppBuilder130 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclation_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclation_in_entryRuleNamespaceDeclation285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclation295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNamespaceDeclation332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespaceDeclation353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName441 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName475 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSystem569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem586 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSystem603 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBusiness_in_ruleSystem624 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleUi_in_ruleSystem645 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSystem657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusiness_in_entryRuleBusiness693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusiness703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBusiness749 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusiness761 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleService_in_ruleBusiness782 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleBusiness795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceService_in_ruleService887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceService_in_entryRuleInstanceService921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceService931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInstanceService968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceService989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUi_in_entryRuleUi1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUi1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleUi1072 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUi1084 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleMain_in_ruleUi1105 = new BitSet(new long[]{0x0000000040028000L});
    public static final BitSet FOLLOW_ruleService_in_ruleUi1126 = new BitSet(new long[]{0x0000000040028000L});
    public static final BitSet FOLLOW_ruleScreen_in_ruleUi1148 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_15_in_ruleUi1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMain1253 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMain1265 = new BitSet(new long[]{0x0000000018E00000L});
    public static final BitSet FOLLOW_21_in_ruleMain1323 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleMain1339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMain1355 = new BitSet(new long[]{0x000000003AE00000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleMain1377 = new BitSet(new long[]{0x0000000038E00000L});
    public static final BitSet FOLLOW_22_in_ruleMain1446 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleMain1462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMain1478 = new BitSet(new long[]{0x000000003AE00000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleMain1500 = new BitSet(new long[]{0x0000000038E00000L});
    public static final BitSet FOLLOW_23_in_ruleMain1569 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleMain1585 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMain1596 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleMain1618 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleMain1631 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleMain1652 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleMain1667 = new BitSet(new long[]{0x000000003AE00000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleMain1684 = new BitSet(new long[]{0x0000000038E00000L});
    public static final BitSet FOLLOW_27_in_ruleMain1753 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleMain1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMain1788 = new BitSet(new long[]{0x000000003AE00000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleMain1805 = new BitSet(new long[]{0x0000000038E00000L});
    public static final BitSet FOLLOW_28_in_ruleMain1874 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleMain1890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMain1906 = new BitSet(new long[]{0x000000003AE00000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleMain1928 = new BitSet(new long[]{0x0000000038E00000L});
    public static final BitSet FOLLOW_29_in_ruleMain1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreen_in_entryRuleScreen2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreen2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleScreen_in_ruleScreen2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeScreen_in_ruleScreen2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleScreen_in_entryRuleSimpleScreen2143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleScreen2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSimpleScreen2190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleScreen2207 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSimpleScreen2224 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_ruleEntryParameters_in_ruleSimpleScreen2245 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_ruleModel_in_ruleSimpleScreen2267 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleView_in_ruleSimpleScreen2288 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleController_in_ruleSimpleScreen2309 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSimpleScreen2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryParameters_in_entryRuleEntryParameters2357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryParameters2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntryParameters2404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntryParameters2416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntryParameters2437 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEntryParameters2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleController_in_entryRuleController2486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleController2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleController2533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleController2545 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleInitAction_in_ruleController2566 = new BitSet(new long[]{0x0000220000008000L});
    public static final BitSet FOLLOW_ruleValidator_in_ruleController2587 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleController2609 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_15_in_ruleController2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitAction_in_entryRuleInitAction2658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitAction2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInitAction2714 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInitAction2726 = new BitSet(new long[]{0x0001C05400008000L});
    public static final BitSet FOLLOW_ruleDataBinding_in_ruleInitAction2747 = new BitSet(new long[]{0x0001C05400008000L});
    public static final BitSet FOLLOW_ruleUiListenerBinding_in_ruleInitAction2769 = new BitSet(new long[]{0x0001C01400008000L});
    public static final BitSet FOLLOW_ruleValidationBinding_in_ruleInitAction2791 = new BitSet(new long[]{0x0001C00400008000L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleInitAction2813 = new BitSet(new long[]{0x0001C00000008000L});
    public static final BitSet FOLLOW_15_in_ruleInitAction2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidationBinding_in_entryRuleValidationBinding2862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidationBinding2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleValidationBinding2909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidationBinding2929 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleValidationBinding2941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidationBinding2961 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleValidationBinding2974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValidationBinding2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUiListenerBinding_in_entryRuleUiListenerBinding3033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUiListenerBinding3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUiListenerBinding3080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUiListenerBinding3100 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleUiListenerBinding3112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUiListenerBinding3132 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleUiListenerBinding3145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUiListenerBinding3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBinding_in_entryRuleDataBinding3204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataBinding3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataBinding_in_ruleDataBinding3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDataBinding_in_ruleDataBinding3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataBinding_in_entryRuleSimpleDataBinding3323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDataBinding3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSimpleDataBinding3370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleDataBinding3390 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimpleDataBinding3403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleDataBinding3424 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSimpleDataBinding3438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleDataBinding3458 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleSimpleDataBinding3471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleDataBinding3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDataBinding_in_entryRuleEnumDataBinding3530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDataBinding3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEnumDataBinding3577 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEnumDataBinding3589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumDataBinding3601 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEnumDataBinding3613 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleEnumDataBinding3629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumDataBinding3645 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumDataBinding3662 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEnumDataBinding3674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDataBinding3694 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEnumDataBinding3707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEnumDataBinding3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidator_in_entryRuleValidator3766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidator3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleValidator3822 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleValidator3834 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleValidator3855 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_15_in_ruleValidator3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition3904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCondition3951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCondition3968 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCondition3985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConditionExpression_in_ruleCondition4006 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCondition4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionExpression_in_entryRuleConditionExpression4054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpression4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleConditionExpression_in_ruleConditionExpression4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeConditionExpression_in_ruleConditionExpression4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleConditionExpression_in_entryRuleSimpleConditionExpression4173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleConditionExpression4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleConditionExpression4225 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleSimpleConditionExpression4246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleSimpleConditionExpression4261 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSimpleConditionExpression4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeConditionExpression_in_entryRuleCompositeConditionExpression4308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeConditionExpression4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeConditionExpression4363 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleCompositeConditionExpression4376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeConditionExpression4396 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUiAction_in_ruleAction4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUiAction_in_entryRuleUiAction4524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUiAction4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleUiAction4571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUiAction4588 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUiAction4605 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleUiAction4626 = new BitSet(new long[]{0x0001C00000008000L});
    public static final BitSet FOLLOW_15_in_ruleUiAction4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction4675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetInstruction_in_ruleInstruction4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigate_in_ruleInstruction4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteAction_in_ruleInstruction4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetInstruction_in_entryRuleSetInstruction4821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetInstruction4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSetInstruction4868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetInstruction4888 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_12_in_ruleSetInstruction4901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSetInstruction4922 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSetInstruction4936 = new BitSet(new long[]{0x0004000000100070L});
    public static final BitSet FOLLOW_ruleSetInstructionAssignment_in_ruleSetInstruction4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigate_in_entryRuleNavigate4993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigate5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNavigate5040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNavigate5060 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleNavigate5073 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleNavigate5095 = new BitSet(new long[]{0x0002000022000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleNavigate5112 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNavigate5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteAction_in_entryRuleExecuteAction5165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteAction5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExecuteAction5212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecuteAction5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters5269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleParameters5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetInstructionAssignment_in_entryRuleSetInstructionAssignment5356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetInstructionAssignment5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestCall_in_ruleSetInstructionAssignment5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSetInstructionAssignment5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSetInstructionAssignment5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicValue_in_ruleSetInstructionAssignment5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlValue_in_ruleSetInstructionAssignment5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestCall_in_entryRuleRestCall5556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestCall5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleRestCall5603 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRestCall5615 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleRestCall5628 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleRestCall5644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleURL_in_ruleRestCall5664 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleRestCall5681 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleRestCall5693 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleRestCall5709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleRestCall5724 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRestCall5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControlValue_in_entryRuleControlValue5772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControlValue5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleControlValue5827 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleControlValue5840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleControlValue5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURL_in_entryRuleURL5900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURL5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURL5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel5994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleModel6050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel6062 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleModel6083 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleModel6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView6132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleView6179 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleView6191 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleView6212 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleView6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout6260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayout6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridLayout_in_ruleLayout6318 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleRowLayout_in_ruleLayout6345 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLayout6357 = new BitSet(new long[]{0x2080000040008000L,0x0000000000000034L});
    public static final BitSet FOLLOW_ruleControl_in_ruleLayout6378 = new BitSet(new long[]{0x2080000040008000L,0x0000000000000034L});
    public static final BitSet FOLLOW_15_in_ruleLayout6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridLayout_in_entryRuleGridLayout6427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridLayout6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleGridLayout6474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGridLayout6486 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleGridLayout6498 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleGridLayout6510 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleGridLayout6528 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleGridLayout6557 = new BitSet(new long[]{0x0800000020000000L});
    public static final BitSet FOLLOW_59_in_ruleGridLayout6569 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleGridLayout6585 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGridLayout6601 = new BitSet(new long[]{0x0000000022000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleGridLayout6623 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGridLayout6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRowLayout_in_entryRuleRowLayout6674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRowLayout6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRowLayout6721 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRowLayout6733 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleRowLayout6745 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleRowLayout6757 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRowLayout6775 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRowLayout6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControl_in_entryRuleControl6836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControl6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleControl6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenLayout_in_ruleControl6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleControl6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleControl6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleControl7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleControl7028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenLayout_in_entryRuleScreenLayout7063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenLayout7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleScreenLayout7110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScreenLayout7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList7166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleList7213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleList7230 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleList7247 = new BitSet(new long[]{0xC000000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62_in_ruleList7305 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleList7321 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleList7341 = new BitSet(new long[]{0xC000000022000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleList7358 = new BitSet(new long[]{0xC000000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleList7427 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleList7443 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleList7463 = new BitSet(new long[]{0xC000000022000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleList7480 = new BitSet(new long[]{0xC000000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleList7549 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleList7565 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleList7585 = new BitSet(new long[]{0xC000000022000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleList7602 = new BitSet(new long[]{0xC000000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29_in_ruleList7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue7692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicValue_in_ruleValue7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicValue_in_entryRuleDynamicValue7827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicValue7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDynamicValue7874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDynamicValue7891 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDynamicValue7908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleDynamicValue7929 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDynamicValue7941 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDynamicValue7962 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDynamicValue7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression8010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleExpression8066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleExpression8079 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleExpression8100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExpressionTerm8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExpressionTerm8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpressionTerm8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText8294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleText8341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText8358 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleText8375 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_ruleText8433 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleText8449 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleText8469 = new BitSet(new long[]{0x8000000022000000L,0x0000000000000088L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleText8486 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleText8555 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleText8571 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleText8591 = new BitSet(new long[]{0x8000000022000000L,0x0000000000000088L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleText8608 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_ruleText8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton8698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleButton8745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton8762 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleButton8779 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_ruleButton8837 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleButton8853 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleButton8873 = new BitSet(new long[]{0x8000000022000000L,0x0000000000000088L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleButton8890 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleButton8959 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleButton8975 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleButton8995 = new BitSet(new long[]{0x8000000022000000L,0x0000000000000088L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_ruleButton9012 = new BitSet(new long[]{0x8000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_ruleButton9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel9102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLabel9149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel9166 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLabel9183 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleLabel9196 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleLabel9212 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLabel9232 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLabel9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute9282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute9334 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_ruleAttribute9355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute9375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType9412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributeType9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeScreen_in_entryRuleCompositeScreen9513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeScreen9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCompositeScreen9560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeScreen9577 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompositeScreen9594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleCompositeScreen9606 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompositeScreen9618 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleLayout_in_ruleCompositeScreen9639 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompositeScreen9651 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompositeScreen9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVSEPARATOR_in_entryRuleVSEPARATOR9700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVSEPARATOR9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleVSEPARATOR9748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASEPARATOR_in_entryRuleASEPARATOR9788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASEPARATOR9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleASEPARATOR9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleASEPARATOR9856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleQualifiedNameWithWildcard9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType10020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType10030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDataType10067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity10125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleEntity10172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity10189 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleEntity10207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity10230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity10244 = new BitSet(new long[]{0x0000000000008010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity10265 = new BitSet(new long[]{0x0000000000008010L,0x0000000000001000L});
    public static final BitSet FOLLOW_15_in_ruleEntity10278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature10314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleFeature10367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature10398 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleFeature10415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature10438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDevice10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDevice10505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDevice10522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDevice10539 = new BitSet(new long[]{0x0000000000000002L});

}
