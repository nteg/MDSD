package org.example.domainmodel.parser.antlr.internal; 

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
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'import'", "'.*'", "'datatype'", "'mappedto'", "'config'", "'init'", "'persistable'", "'namespace'", "'{'", "'}'", "'one2one'", "'one2many'", "'many2one'", "'many2many'", "'ref'", "':'", "'domainentity'", "'GET'", "'POST'", "'PUT'", "'@rest{'", "', '", "'Method.'", "'('", "')'", "'operation'", "'[]'", "'interface'", "'provides'", "'requires'", "'stateless-component'", "'domainrepository'", "'for'", "'entryParameters'", "'ordered'", "'model'", "'view'", "'validate'", "'on'", "'attach'", "'to'", "'enumDataSource'", "'className'", "'bind'", "'initaction'", "'and'", "'condition'", "'validator'", "'navigateto'", "'execute'", "'url'", "'returnType'", "'id'", "'update'", "'restcall'", "'set'", "'uiaction'", "'controller'", "'screen'", "'appName'", "'appVersion'", "'entryScreen'", "'devices'", "'style'", "'main'", "'uiSystem'", "'instance'", "'=>'", "'businessSystem'", "'system'", "'text'", "'button'", "'label'", "'list'", "'image'", "'labelProvider'", "'cssItem'", "'tooltip'", "'resourceKey'", "'path'", "'type'", "'columns'", "'layout'", "'selection'", "'values'", "'onSelection'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;
     	
        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:68:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:69:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:70:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:77:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:80:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==81) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:83:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:107:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:108:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:109:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:116:1: ruleAbstractElement returns [EObject current=null] : (this_NamespaceDeclaration_0= ruleNamespaceDeclaration | this_SystemDefinition_1= ruleSystemDefinition ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceDeclaration_0 = null;

        EObject this_SystemDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:28: ( (this_NamespaceDeclaration_0= ruleNamespaceDeclaration | this_SystemDefinition_1= ruleSystemDefinition ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:120:1: (this_NamespaceDeclaration_0= ruleNamespaceDeclaration | this_SystemDefinition_1= ruleSystemDefinition )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:120:1: (this_NamespaceDeclaration_0= ruleNamespaceDeclaration | this_SystemDefinition_1= ruleSystemDefinition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==81) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:121:5: this_NamespaceDeclaration_0= ruleNamespaceDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getNamespaceDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamespaceDeclaration_in_ruleAbstractElement223);
                    this_NamespaceDeclaration_0=ruleNamespaceDeclaration();

                    state._fsp--;

                     
                            current = this_NamespaceDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:131:5: this_SystemDefinition_1= ruleSystemDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSystemDefinition_in_ruleAbstractElement250);
                    this_SystemDefinition_1=ruleSystemDefinition();

                    state._fsp--;

                     
                            current = this_SystemDefinition_1; 
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:149:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:150:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:151:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName288);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName299); 

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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:158:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:161:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:162:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:162:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:162:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName339); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:169:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:170:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedName358); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName373); 

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


    // $ANTLR start "entryRuleImport"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:190:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:191:2: (iv_ruleImport= ruleImport EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:192:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport420);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport430); 

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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:199:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:202:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:203:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:203:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:203:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport467); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:207:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:208:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:208:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:209:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport488);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:233:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:234:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:235:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard525);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard536); 

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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:242:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:245:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:246:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:246:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:247:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard583);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:257:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:258:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildcard602); 

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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:271:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:272:2: (iv_ruleDataType= ruleDataType EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:273:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType644);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType654); 

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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:280:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mappedto' ( (lv_mappedType_3_0= ruleQualifiedName ) ) (otherlv_4= 'config' )? (otherlv_5= 'init' ( (lv_initValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'persistable' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_initValue_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_mappedType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:283:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mappedto' ( (lv_mappedType_3_0= ruleQualifiedName ) ) (otherlv_4= 'config' )? (otherlv_5= 'init' ( (lv_initValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'persistable' )? ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:284:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mappedto' ( (lv_mappedType_3_0= ruleQualifiedName ) ) (otherlv_4= 'config' )? (otherlv_5= 'init' ( (lv_initValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'persistable' )? )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:284:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mappedto' ( (lv_mappedType_3_0= ruleQualifiedName ) ) (otherlv_4= 'config' )? (otherlv_5= 'init' ( (lv_initValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'persistable' )? )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:284:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mappedto' ( (lv_mappedType_3_0= ruleQualifiedName ) ) (otherlv_4= 'config' )? (otherlv_5= 'init' ( (lv_initValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'persistable' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDataType691); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:288:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:289:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:289:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:290:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType708); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDataType725); 

                	newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getMappedtoKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:310:1: ( (lv_mappedType_3_0= ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:311:1: (lv_mappedType_3_0= ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:311:1: (lv_mappedType_3_0= ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:312:3: lv_mappedType_3_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getMappedTypeQualifiedNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataType746);
            lv_mappedType_3_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"mappedType",
                    		lv_mappedType_3_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:328:2: (otherlv_4= 'config' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:328:4: otherlv_4= 'config'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDataType759); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getConfigKeyword_4());
                        

                    }
                    break;

            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:332:3: (otherlv_5= 'init' ( (lv_initValue_6_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:332:5: otherlv_5= 'init' ( (lv_initValue_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleDataType774); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getInitKeyword_5_0());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:336:1: ( (lv_initValue_6_0= RULE_STRING ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:337:1: (lv_initValue_6_0= RULE_STRING )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:337:1: (lv_initValue_6_0= RULE_STRING )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:338:3: lv_initValue_6_0= RULE_STRING
                    {
                    lv_initValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataType791); 

                    			newLeafNode(lv_initValue_6_0, grammarAccess.getDataTypeAccess().getInitValueSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"initValue",
                            		lv_initValue_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:354:4: (otherlv_7= 'persistable' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:354:6: otherlv_7= 'persistable'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleDataType811); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getPersistableKeyword_6());
                        

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleNamespaceDeclaration"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:366:1: entryRuleNamespaceDeclaration returns [EObject current=null] : iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF ;
    public final EObject entryRuleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceDeclaration = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:367:2: (iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:368:2: iv_ruleNamespaceDeclaration= ruleNamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration849);
            iv_ruleNamespaceDeclaration=ruleNamespaceDeclaration();

            state._fsp--;

             current =iv_ruleNamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDeclaration859); 

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
    // $ANTLR end "entryRuleNamespaceDeclaration"


    // $ANTLR start "ruleNamespaceDeclaration"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:375:1: ruleNamespaceDeclaration returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_namespaceElements_3_0= ruleAbstractNamespaceElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleNamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespaceElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:378:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_namespaceElements_3_0= ruleAbstractNamespaceElement ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:379:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_namespaceElements_3_0= ruleAbstractNamespaceElement ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:379:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_namespaceElements_3_0= ruleAbstractNamespaceElement ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:379:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_namespaceElements_3_0= ruleAbstractNamespaceElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleNamespaceDeclaration896); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:383:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:384:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:384:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:385:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespaceDeclaration917);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleNamespaceDeclaration929); 

                	newLeafNode(otherlv_2, grammarAccess.getNamespaceDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:405:1: ( (lv_namespaceElements_3_0= ruleAbstractNamespaceElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12||LA8_0==14||LA8_0==28||LA8_0==39||(LA8_0>=42 && LA8_0<=43)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:406:1: (lv_namespaceElements_3_0= ruleAbstractNamespaceElement )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:406:1: (lv_namespaceElements_3_0= ruleAbstractNamespaceElement )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:407:3: lv_namespaceElements_3_0= ruleAbstractNamespaceElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getNamespaceElementsAbstractNamespaceElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractNamespaceElement_in_ruleNamespaceDeclaration950);
            	    lv_namespaceElements_3_0=ruleAbstractNamespaceElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"namespaceElements",
            	            		lv_namespaceElements_3_0, 
            	            		"AbstractNamespaceElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleNamespaceDeclaration963); 

                	newLeafNode(otherlv_4, grammarAccess.getNamespaceDeclarationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleNamespaceDeclaration"


    // $ANTLR start "entryRuleAbstractNamespaceElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:435:1: entryRuleAbstractNamespaceElement returns [EObject current=null] : iv_ruleAbstractNamespaceElement= ruleAbstractNamespaceElement EOF ;
    public final EObject entryRuleAbstractNamespaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNamespaceElement = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:436:2: (iv_ruleAbstractNamespaceElement= ruleAbstractNamespaceElement EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:437:2: iv_ruleAbstractNamespaceElement= ruleAbstractNamespaceElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractNamespaceElementRule()); 
            pushFollow(FOLLOW_ruleAbstractNamespaceElement_in_entryRuleAbstractNamespaceElement999);
            iv_ruleAbstractNamespaceElement=ruleAbstractNamespaceElement();

            state._fsp--;

             current =iv_ruleAbstractNamespaceElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNamespaceElement1009); 

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
    // $ANTLR end "entryRuleAbstractNamespaceElement"


    // $ANTLR start "ruleAbstractNamespaceElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:444:1: ruleAbstractNamespaceElement returns [EObject current=null] : (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_StatelessComponent_1= ruleStatelessComponent | this_DomainRepository_2= ruleDomainRepository | this_DomainEntity_3= ruleDomainEntity | this_DataType_4= ruleDataType | this_Import_5= ruleImport ) ;
    public final EObject ruleAbstractNamespaceElement() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDeclaration_0 = null;

        EObject this_StatelessComponent_1 = null;

        EObject this_DomainRepository_2 = null;

        EObject this_DomainEntity_3 = null;

        EObject this_DataType_4 = null;

        EObject this_Import_5 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:447:28: ( (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_StatelessComponent_1= ruleStatelessComponent | this_DomainRepository_2= ruleDomainRepository | this_DomainEntity_3= ruleDomainEntity | this_DataType_4= ruleDataType | this_Import_5= ruleImport ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:448:1: (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_StatelessComponent_1= ruleStatelessComponent | this_DomainRepository_2= ruleDomainRepository | this_DomainEntity_3= ruleDomainEntity | this_DataType_4= ruleDataType | this_Import_5= ruleImport )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:448:1: (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_StatelessComponent_1= ruleStatelessComponent | this_DomainRepository_2= ruleDomainRepository | this_DomainEntity_3= ruleDomainEntity | this_DataType_4= ruleDataType | this_Import_5= ruleImport )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 43:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 14:
                {
                alt9=5;
                }
                break;
            case 12:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:449:5: this_InterfaceDeclaration_0= ruleInterfaceDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamespaceElementAccess().getInterfaceDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterfaceDeclaration_in_ruleAbstractNamespaceElement1056);
                    this_InterfaceDeclaration_0=ruleInterfaceDeclaration();

                    state._fsp--;

                     
                            current = this_InterfaceDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:459:5: this_StatelessComponent_1= ruleStatelessComponent
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamespaceElementAccess().getStatelessComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStatelessComponent_in_ruleAbstractNamespaceElement1083);
                    this_StatelessComponent_1=ruleStatelessComponent();

                    state._fsp--;

                     
                            current = this_StatelessComponent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:469:5: this_DomainRepository_2= ruleDomainRepository
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamespaceElementAccess().getDomainRepositoryParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDomainRepository_in_ruleAbstractNamespaceElement1110);
                    this_DomainRepository_2=ruleDomainRepository();

                    state._fsp--;

                     
                            current = this_DomainRepository_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:479:5: this_DomainEntity_3= ruleDomainEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamespaceElementAccess().getDomainEntityParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDomainEntity_in_ruleAbstractNamespaceElement1137);
                    this_DomainEntity_3=ruleDomainEntity();

                    state._fsp--;

                     
                            current = this_DomainEntity_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:489:5: this_DataType_4= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamespaceElementAccess().getDataTypeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleAbstractNamespaceElement1164);
                    this_DataType_4=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:499:5: this_Import_5= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNamespaceElementAccess().getImportParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractNamespaceElement1191);
                    this_Import_5=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_5; 
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
    // $ANTLR end "ruleAbstractNamespaceElement"


    // $ANTLR start "entryRuleFeatureMappingOptions"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:515:1: entryRuleFeatureMappingOptions returns [String current=null] : iv_ruleFeatureMappingOptions= ruleFeatureMappingOptions EOF ;
    public final String entryRuleFeatureMappingOptions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureMappingOptions = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:516:2: (iv_ruleFeatureMappingOptions= ruleFeatureMappingOptions EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:517:2: iv_ruleFeatureMappingOptions= ruleFeatureMappingOptions EOF
            {
             newCompositeNode(grammarAccess.getFeatureMappingOptionsRule()); 
            pushFollow(FOLLOW_ruleFeatureMappingOptions_in_entryRuleFeatureMappingOptions1227);
            iv_ruleFeatureMappingOptions=ruleFeatureMappingOptions();

            state._fsp--;

             current =iv_ruleFeatureMappingOptions.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMappingOptions1238); 

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
    // $ANTLR end "entryRuleFeatureMappingOptions"


    // $ANTLR start "ruleFeatureMappingOptions"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:524:1: ruleFeatureMappingOptions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'one2one' | kw= 'one2many' | kw= 'many2one' | kw= 'many2many' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureMappingOptions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:527:28: ( (kw= 'one2one' | kw= 'one2many' | kw= 'many2one' | kw= 'many2many' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:528:1: (kw= 'one2one' | kw= 'one2many' | kw= 'many2one' | kw= 'many2many' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:528:1: (kw= 'one2one' | kw= 'one2many' | kw= 'many2one' | kw= 'many2many' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:529:2: kw= 'one2one'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleFeatureMappingOptions1276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeatureMappingOptionsAccess().getOne2oneKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:536:2: kw= 'one2many'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleFeatureMappingOptions1295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeatureMappingOptionsAccess().getOne2manyKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:543:2: kw= 'many2one'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleFeatureMappingOptions1314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeatureMappingOptionsAccess().getMany2oneKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:550:2: kw= 'many2many'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleFeatureMappingOptions1333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeatureMappingOptionsAccess().getMany2manyKeyword_3()); 
                        

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
    // $ANTLR end "ruleFeatureMappingOptions"


    // $ANTLR start "entryRuleFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:563:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:564:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:565:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1373);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1383); 

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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:572:1: ruleFeature returns [EObject current=null] : ( (otherlv_0= 'ref' )? ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) ) ( (lv_mapName_3_0= RULE_ID ) ) )? otherlv_4= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_mapName_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_mappingOption_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:575:28: ( ( (otherlv_0= 'ref' )? ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) ) ( (lv_mapName_3_0= RULE_ID ) ) )? otherlv_4= ':' ( ( ruleQualifiedName ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:576:1: ( (otherlv_0= 'ref' )? ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) ) ( (lv_mapName_3_0= RULE_ID ) ) )? otherlv_4= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:576:1: ( (otherlv_0= 'ref' )? ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) ) ( (lv_mapName_3_0= RULE_ID ) ) )? otherlv_4= ':' ( ( ruleQualifiedName ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:576:2: (otherlv_0= 'ref' )? ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) ) ( (lv_mapName_3_0= RULE_ID ) ) )? otherlv_4= ':' ( ( ruleQualifiedName ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:576:2: (otherlv_0= 'ref' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:576:4: otherlv_0= 'ref'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFeature1421); 

                        	newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getRefKeyword_0());
                        

                    }
                    break;

            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:580:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:581:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:581:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:582:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1440); 

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

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:598:2: ( ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) ) ( (lv_mapName_3_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=22 && LA12_0<=25)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:598:3: ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) ) ( (lv_mapName_3_0= RULE_ID ) )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:598:3: ( (lv_mappingOption_2_0= ruleFeatureMappingOptions ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:599:1: (lv_mappingOption_2_0= ruleFeatureMappingOptions )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:599:1: (lv_mappingOption_2_0= ruleFeatureMappingOptions )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:600:3: lv_mappingOption_2_0= ruleFeatureMappingOptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getMappingOptionFeatureMappingOptionsParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureMappingOptions_in_ruleFeature1467);
                    lv_mappingOption_2_0=ruleFeatureMappingOptions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"mappingOption",
                            		lv_mappingOption_2_0, 
                            		"FeatureMappingOptions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:616:2: ( (lv_mapName_3_0= RULE_ID ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:617:1: (lv_mapName_3_0= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:617:1: (lv_mapName_3_0= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:618:3: lv_mapName_3_0= RULE_ID
                    {
                    lv_mapName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1484); 

                    			newLeafNode(lv_mapName_3_0, grammarAccess.getFeatureAccess().getMapNameIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mapName",
                            		lv_mapName_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleFeature1503); 

                	newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getColonKeyword_3());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:638:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:639:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:639:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:640:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature1526);
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


    // $ANTLR start "entryRuleDomainEntity"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:661:1: entryRuleDomainEntity returns [EObject current=null] : iv_ruleDomainEntity= ruleDomainEntity EOF ;
    public final EObject entryRuleDomainEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainEntity = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:662:2: (iv_ruleDomainEntity= ruleDomainEntity EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:663:2: iv_ruleDomainEntity= ruleDomainEntity EOF
            {
             newCompositeNode(grammarAccess.getDomainEntityRule()); 
            pushFollow(FOLLOW_ruleDomainEntity_in_entryRuleDomainEntity1562);
            iv_ruleDomainEntity=ruleDomainEntity();

            state._fsp--;

             current =iv_ruleDomainEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainEntity1572); 

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
    // $ANTLR end "entryRuleDomainEntity"


    // $ANTLR start "ruleDomainEntity"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:670:1: ruleDomainEntity returns [EObject current=null] : (otherlv_0= 'domainentity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleDomainEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:673:28: ( (otherlv_0= 'domainentity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:674:1: (otherlv_0= 'domainentity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:674:1: (otherlv_0= 'domainentity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:674:3: otherlv_0= 'domainentity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDomainEntity1609); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainEntityAccess().getDomainentityKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:678:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:679:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:679:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:680:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainEntity1626); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDomainEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDomainEntity1643); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:700:1: ( (lv_features_3_0= ruleFeature ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:701:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:701:1: (lv_features_3_0= ruleFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:702:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleDomainEntity1664);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleDomainEntity1677); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleDomainEntity"


    // $ANTLR start "entryRuleRestMethodCall"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:730:1: entryRuleRestMethodCall returns [String current=null] : iv_ruleRestMethodCall= ruleRestMethodCall EOF ;
    public final String entryRuleRestMethodCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRestMethodCall = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:731:2: (iv_ruleRestMethodCall= ruleRestMethodCall EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:732:2: iv_ruleRestMethodCall= ruleRestMethodCall EOF
            {
             newCompositeNode(grammarAccess.getRestMethodCallRule()); 
            pushFollow(FOLLOW_ruleRestMethodCall_in_entryRuleRestMethodCall1714);
            iv_ruleRestMethodCall=ruleRestMethodCall();

            state._fsp--;

             current =iv_ruleRestMethodCall.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestMethodCall1725); 

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
    // $ANTLR end "entryRuleRestMethodCall"


    // $ANTLR start "ruleRestMethodCall"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:739:1: ruleRestMethodCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'GET' | kw= 'POST' | kw= 'PUT' ) ;
    public final AntlrDatatypeRuleToken ruleRestMethodCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:742:28: ( (kw= 'GET' | kw= 'POST' | kw= 'PUT' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:743:1: (kw= 'GET' | kw= 'POST' | kw= 'PUT' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:743:1: (kw= 'GET' | kw= 'POST' | kw= 'PUT' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:744:2: kw= 'GET'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleRestMethodCall1763); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRestMethodCallAccess().getGETKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:751:2: kw= 'POST'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleRestMethodCall1782); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRestMethodCallAccess().getPOSTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:758:2: kw= 'PUT'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleRestMethodCall1801); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRestMethodCallAccess().getPUTKeyword_2()); 
                        

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
    // $ANTLR end "ruleRestMethodCall"


    // $ANTLR start "entryRuleRestOperation"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:771:1: entryRuleRestOperation returns [String current=null] : iv_ruleRestOperation= ruleRestOperation EOF ;
    public final String entryRuleRestOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRestOperation = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:772:2: (iv_ruleRestOperation= ruleRestOperation EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:2: iv_ruleRestOperation= ruleRestOperation EOF
            {
             newCompositeNode(grammarAccess.getRestOperationRule()); 
            pushFollow(FOLLOW_ruleRestOperation_in_entryRuleRestOperation1842);
            iv_ruleRestOperation=ruleRestOperation();

            state._fsp--;

             current =iv_ruleRestOperation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestOperation1853); 

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
    // $ANTLR end "entryRuleRestOperation"


    // $ANTLR start "ruleRestOperation"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:780:1: ruleRestOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@rest{' this_STRING_1= RULE_STRING kw= ', ' kw= 'Method.' this_RestMethodCall_4= ruleRestMethodCall kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleRestOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_RestMethodCall_4 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:783:28: ( (kw= '@rest{' this_STRING_1= RULE_STRING kw= ', ' kw= 'Method.' this_RestMethodCall_4= ruleRestMethodCall kw= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:784:1: (kw= '@rest{' this_STRING_1= RULE_STRING kw= ', ' kw= 'Method.' this_RestMethodCall_4= ruleRestMethodCall kw= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:784:1: (kw= '@rest{' this_STRING_1= RULE_STRING kw= ', ' kw= 'Method.' this_RestMethodCall_4= ruleRestMethodCall kw= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:785:2: kw= '@rest{' this_STRING_1= RULE_STRING kw= ', ' kw= 'Method.' this_RestMethodCall_4= ruleRestMethodCall kw= '}'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleRestOperation1891); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRestOperationAccess().getRestKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRestOperation1906); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getRestOperationAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,33,FOLLOW_33_in_ruleRestOperation1924); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRestOperationAccess().getCommaSpaceKeyword_2()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleRestOperation1937); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRestOperationAccess().getMethodKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getRestOperationAccess().getRestMethodCallParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleRestMethodCall_in_ruleRestOperation1959);
            this_RestMethodCall_4=ruleRestMethodCall();

            state._fsp--;


            		current.merge(this_RestMethodCall_4);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,21,FOLLOW_21_in_ruleRestOperation1977); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRestOperationAccess().getRightCurlyBracketKeyword_5()); 
                

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
    // $ANTLR end "ruleRestOperation"


    // $ANTLR start "entryRuleMethodParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:834:1: entryRuleMethodParameter returns [EObject current=null] : iv_ruleMethodParameter= ruleMethodParameter EOF ;
    public final EObject entryRuleMethodParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodParameter = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:835:2: (iv_ruleMethodParameter= ruleMethodParameter EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:836:2: iv_ruleMethodParameter= ruleMethodParameter EOF
            {
             newCompositeNode(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter2017);
            iv_ruleMethodParameter=ruleMethodParameter();

            state._fsp--;

             current =iv_ruleMethodParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodParameter2027); 

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
    // $ANTLR end "entryRuleMethodParameter"


    // $ANTLR start "ruleMethodParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:843:1: ruleMethodParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMethodParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:846:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:847:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:847:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:847:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:847:2: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:848:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:848:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:849:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMethodParameterAccess().getTypeTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethodParameter2075);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:862:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:863:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:863:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:864:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodParameter2092); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodParameterRule());
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
    // $ANTLR end "ruleMethodParameter"


    // $ANTLR start "entryRuleMethodParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:888:1: entryRuleMethodParameters returns [EObject current=null] : iv_ruleMethodParameters= ruleMethodParameters EOF ;
    public final EObject entryRuleMethodParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodParameters = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:889:2: (iv_ruleMethodParameters= ruleMethodParameters EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:890:2: iv_ruleMethodParameters= ruleMethodParameters EOF
            {
             newCompositeNode(grammarAccess.getMethodParametersRule()); 
            pushFollow(FOLLOW_ruleMethodParameters_in_entryRuleMethodParameters2133);
            iv_ruleMethodParameters=ruleMethodParameters();

            state._fsp--;

             current =iv_ruleMethodParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodParameters2143); 

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
    // $ANTLR end "entryRuleMethodParameters"


    // $ANTLR start "ruleMethodParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:897:1: ruleMethodParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleMethodParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleMethodParameter ) ) )* ) ;
    public final EObject ruleMethodParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:900:28: ( ( ( (lv_parameters_0_0= ruleMethodParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleMethodParameter ) ) )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:1: ( ( (lv_parameters_0_0= ruleMethodParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleMethodParameter ) ) )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:1: ( ( (lv_parameters_0_0= ruleMethodParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleMethodParameter ) ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:2: ( (lv_parameters_0_0= ruleMethodParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleMethodParameter ) ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:2: ( (lv_parameters_0_0= ruleMethodParameter ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:902:1: (lv_parameters_0_0= ruleMethodParameter )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:902:1: (lv_parameters_0_0= ruleMethodParameter )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:903:3: lv_parameters_0_0= ruleMethodParameter
            {
             
            	        newCompositeNode(grammarAccess.getMethodParametersAccess().getParametersMethodParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodParameter_in_ruleMethodParameters2189);
            lv_parameters_0_0=ruleMethodParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodParametersRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"MethodParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:919:2: (otherlv_1= ', ' ( (lv_parameters_2_0= ruleMethodParameter ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:919:4: otherlv_1= ', ' ( (lv_parameters_2_0= ruleMethodParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMethodParameters2202); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMethodParametersAccess().getCommaSpaceKeyword_1_0());
            	        
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:923:1: ( (lv_parameters_2_0= ruleMethodParameter ) )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:924:1: (lv_parameters_2_0= ruleMethodParameter )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:924:1: (lv_parameters_2_0= ruleMethodParameter )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:925:3: lv_parameters_2_0= ruleMethodParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodParametersAccess().getParametersMethodParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodParameter_in_ruleMethodParameters2223);
            	    lv_parameters_2_0=ruleMethodParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"MethodParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleMethodParameters"


    // $ANTLR start "entryRuleMethodCall"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:949:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:950:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:951:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall2261);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall2271); 

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:958:1: ruleMethodCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleMethodParameters ) )? otherlv_3= ')' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:961:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleMethodParameters ) )? otherlv_3= ')' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:962:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleMethodParameters ) )? otherlv_3= ')' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:962:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleMethodParameters ) )? otherlv_3= ')' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:962:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleMethodParameters ) )? otherlv_3= ')'
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:962:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:963:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:963:1: (lv_name_0_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:964:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodCall2313); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMethodCallAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodCallRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleMethodCall2330); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:984:1: ( (lv_parameters_2_0= ruleMethodParameters ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:985:1: (lv_parameters_2_0= ruleMethodParameters )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:985:1: (lv_parameters_2_0= ruleMethodParameters )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:986:3: lv_parameters_2_0= ruleMethodParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodCallAccess().getParametersMethodParametersParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMethodParameters_in_ruleMethodCall2351);
                    lv_parameters_2_0=ruleMethodParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"MethodParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleMethodCall2364); 

                	newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleInterfaceOperation"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1014:1: entryRuleInterfaceOperation returns [EObject current=null] : iv_ruleInterfaceOperation= ruleInterfaceOperation EOF ;
    public final EObject entryRuleInterfaceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceOperation = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1015:2: (iv_ruleInterfaceOperation= ruleInterfaceOperation EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1016:2: iv_ruleInterfaceOperation= ruleInterfaceOperation EOF
            {
             newCompositeNode(grammarAccess.getInterfaceOperationRule()); 
            pushFollow(FOLLOW_ruleInterfaceOperation_in_entryRuleInterfaceOperation2400);
            iv_ruleInterfaceOperation=ruleInterfaceOperation();

            state._fsp--;

             current =iv_ruleInterfaceOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceOperation2410); 

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
    // $ANTLR end "entryRuleInterfaceOperation"


    // $ANTLR start "ruleInterfaceOperation"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1023:1: ruleInterfaceOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_restOperation_1_0= ruleRestOperation ) )? ( (lv_methodCall_2_0= ruleMethodCall ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= '[]' )? ) ;
    public final EObject ruleInterfaceOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_restOperation_1_0 = null;

        EObject lv_methodCall_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1026:28: ( (otherlv_0= 'operation' ( (lv_restOperation_1_0= ruleRestOperation ) )? ( (lv_methodCall_2_0= ruleMethodCall ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= '[]' )? ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1027:1: (otherlv_0= 'operation' ( (lv_restOperation_1_0= ruleRestOperation ) )? ( (lv_methodCall_2_0= ruleMethodCall ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= '[]' )? )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1027:1: (otherlv_0= 'operation' ( (lv_restOperation_1_0= ruleRestOperation ) )? ( (lv_methodCall_2_0= ruleMethodCall ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= '[]' )? )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1027:3: otherlv_0= 'operation' ( (lv_restOperation_1_0= ruleRestOperation ) )? ( (lv_methodCall_2_0= ruleMethodCall ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= '[]' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleInterfaceOperation2447); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceOperationAccess().getOperationKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1031:1: ( (lv_restOperation_1_0= ruleRestOperation ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1032:1: (lv_restOperation_1_0= ruleRestOperation )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1032:1: (lv_restOperation_1_0= ruleRestOperation )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1033:3: lv_restOperation_1_0= ruleRestOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterfaceOperationAccess().getRestOperationRestOperationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRestOperation_in_ruleInterfaceOperation2468);
                    lv_restOperation_1_0=ruleRestOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterfaceOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"restOperation",
                            		lv_restOperation_1_0, 
                            		"RestOperation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1049:3: ( (lv_methodCall_2_0= ruleMethodCall ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1050:1: (lv_methodCall_2_0= ruleMethodCall )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1050:1: (lv_methodCall_2_0= ruleMethodCall )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1051:3: lv_methodCall_2_0= ruleMethodCall
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceOperationAccess().getMethodCallMethodCallParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodCall_in_ruleInterfaceOperation2490);
            lv_methodCall_2_0=ruleMethodCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceOperationRule());
            	        }
                   		set(
                   			current, 
                   			"methodCall",
                    		lv_methodCall_2_0, 
                    		"MethodCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleInterfaceOperation2502); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceOperationAccess().getColonKeyword_3());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1071:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1072:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1072:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1073:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceOperationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInterfaceOperationAccess().getTypeTypeCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceOperation2525);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1086:2: (otherlv_5= '[]' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1086:4: otherlv_5= '[]'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleInterfaceOperation2538); 

                        	newLeafNode(otherlv_5, grammarAccess.getInterfaceOperationAccess().getLeftSquareBracketRightSquareBracketKeyword_5());
                        

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
    // $ANTLR end "ruleInterfaceOperation"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1098:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1099:2: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1100:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInterfaceDeclarationRule()); 
            pushFollow(FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration2576);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();

            state._fsp--;

             current =iv_ruleInterfaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDeclaration2586); 

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
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1107:1: ruleInterfaceDeclaration returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1110:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperation ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1111:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperation ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1111:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperation ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1111:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleInterfaceDeclaration2623); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1115:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1116:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1116:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1117:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDeclaration2640); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleInterfaceDeclaration2657); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1137:1: ( (lv_operations_3_0= ruleInterfaceOperation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1138:1: (lv_operations_3_0= ruleInterfaceOperation )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1138:1: (lv_operations_3_0= ruleInterfaceOperation )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1139:3: lv_operations_3_0= ruleInterfaceOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getOperationsInterfaceOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaceOperation_in_ruleInterfaceDeclaration2678);
            	    lv_operations_3_0=ruleInterfaceOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_3_0, 
            	            		"InterfaceOperation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleInterfaceDeclaration2691); 

                	newLeafNode(otherlv_4, grammarAccess.getInterfaceDeclarationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleInterfaceOperationUsageRule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1167:1: entryRuleInterfaceOperationUsageRule returns [EObject current=null] : iv_ruleInterfaceOperationUsageRule= ruleInterfaceOperationUsageRule EOF ;
    public final EObject entryRuleInterfaceOperationUsageRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceOperationUsageRule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1168:2: (iv_ruleInterfaceOperationUsageRule= ruleInterfaceOperationUsageRule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1169:2: iv_ruleInterfaceOperationUsageRule= ruleInterfaceOperationUsageRule EOF
            {
             newCompositeNode(grammarAccess.getInterfaceOperationUsageRuleRule()); 
            pushFollow(FOLLOW_ruleInterfaceOperationUsageRule_in_entryRuleInterfaceOperationUsageRule2727);
            iv_ruleInterfaceOperationUsageRule=ruleInterfaceOperationUsageRule();

            state._fsp--;

             current =iv_ruleInterfaceOperationUsageRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceOperationUsageRule2737); 

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
    // $ANTLR end "entryRuleInterfaceOperationUsageRule"


    // $ANTLR start "ruleInterfaceOperationUsageRule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1176:1: ruleInterfaceOperationUsageRule returns [EObject current=null] : ( (otherlv_0= 'provides' | otherlv_1= 'requires' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleInterfaceOperationUsageRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1179:28: ( ( (otherlv_0= 'provides' | otherlv_1= 'requires' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1180:1: ( (otherlv_0= 'provides' | otherlv_1= 'requires' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1180:1: ( (otherlv_0= 'provides' | otherlv_1= 'requires' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1180:2: (otherlv_0= 'provides' | otherlv_1= 'requires' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1180:2: (otherlv_0= 'provides' | otherlv_1= 'requires' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1180:4: otherlv_0= 'provides'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleInterfaceOperationUsageRule2775); 

                        	newLeafNode(otherlv_0, grammarAccess.getInterfaceOperationUsageRuleAccess().getProvidesKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1185:7: otherlv_1= 'requires'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleInterfaceOperationUsageRule2793); 

                        	newLeafNode(otherlv_1, grammarAccess.getInterfaceOperationUsageRuleAccess().getRequiresKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1189:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1190:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1190:1: (lv_name_2_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1191:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceOperationUsageRule2811); 

            			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceOperationUsageRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceOperationUsageRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleInterfaceOperationUsageRule2828); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceOperationUsageRuleAccess().getColonKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1212:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1212:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1213:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceOperationUsageRuleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInterfaceOperationUsageRuleAccess().getInterfaceNameInterfaceDeclarationCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceOperationUsageRule2851);
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
    // $ANTLR end "ruleInterfaceOperationUsageRule"


    // $ANTLR start "entryRuleInterfaceOperationsUsageRule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1234:1: entryRuleInterfaceOperationsUsageRule returns [EObject current=null] : iv_ruleInterfaceOperationsUsageRule= ruleInterfaceOperationsUsageRule EOF ;
    public final EObject entryRuleInterfaceOperationsUsageRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceOperationsUsageRule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1235:2: (iv_ruleInterfaceOperationsUsageRule= ruleInterfaceOperationsUsageRule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1236:2: iv_ruleInterfaceOperationsUsageRule= ruleInterfaceOperationsUsageRule EOF
            {
             newCompositeNode(grammarAccess.getInterfaceOperationsUsageRuleRule()); 
            pushFollow(FOLLOW_ruleInterfaceOperationsUsageRule_in_entryRuleInterfaceOperationsUsageRule2887);
            iv_ruleInterfaceOperationsUsageRule=ruleInterfaceOperationsUsageRule();

            state._fsp--;

             current =iv_ruleInterfaceOperationsUsageRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceOperationsUsageRule2897); 

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
    // $ANTLR end "entryRuleInterfaceOperationsUsageRule"


    // $ANTLR start "ruleInterfaceOperationsUsageRule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1243:1: ruleInterfaceOperationsUsageRule returns [EObject current=null] : ( ( (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule ) ) ( (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule ) )* ) ;
    public final EObject ruleInterfaceOperationsUsageRule() throws RecognitionException {
        EObject current = null;

        EObject lv_usageOperations_0_0 = null;

        EObject lv_usageOperations_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1246:28: ( ( ( (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule ) ) ( (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule ) )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1247:1: ( ( (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule ) ) ( (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule ) )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1247:1: ( ( (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule ) ) ( (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1247:2: ( (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule ) ) ( (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1247:2: ( (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1248:1: (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1248:1: (lv_usageOperations_0_0= ruleInterfaceOperationUsageRule )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1249:3: lv_usageOperations_0_0= ruleInterfaceOperationUsageRule
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceOperationsUsageRuleAccess().getUsageOperationsInterfaceOperationUsageRuleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceOperationUsageRule_in_ruleInterfaceOperationsUsageRule2943);
            lv_usageOperations_0_0=ruleInterfaceOperationUsageRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceOperationsUsageRuleRule());
            	        }
                   		add(
                   			current, 
                   			"usageOperations",
                    		lv_usageOperations_0_0, 
                    		"InterfaceOperationUsageRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1265:2: ( (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=40 && LA21_0<=41)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1266:1: (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1266:1: (lv_usageOperations_1_0= ruleInterfaceOperationUsageRule )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1267:3: lv_usageOperations_1_0= ruleInterfaceOperationUsageRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceOperationsUsageRuleAccess().getUsageOperationsInterfaceOperationUsageRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaceOperationUsageRule_in_ruleInterfaceOperationsUsageRule2964);
            	    lv_usageOperations_1_0=ruleInterfaceOperationUsageRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceOperationsUsageRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usageOperations",
            	            		lv_usageOperations_1_0, 
            	            		"InterfaceOperationUsageRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleInterfaceOperationsUsageRule"


    // $ANTLR start "entryRuleStatelessComponent"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1291:1: entryRuleStatelessComponent returns [EObject current=null] : iv_ruleStatelessComponent= ruleStatelessComponent EOF ;
    public final EObject entryRuleStatelessComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatelessComponent = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1292:2: (iv_ruleStatelessComponent= ruleStatelessComponent EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1293:2: iv_ruleStatelessComponent= ruleStatelessComponent EOF
            {
             newCompositeNode(grammarAccess.getStatelessComponentRule()); 
            pushFollow(FOLLOW_ruleStatelessComponent_in_entryRuleStatelessComponent3001);
            iv_ruleStatelessComponent=ruleStatelessComponent();

            state._fsp--;

             current =iv_ruleStatelessComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatelessComponent3011); 

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
    // $ANTLR end "entryRuleStatelessComponent"


    // $ANTLR start "ruleStatelessComponent"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1300:1: ruleStatelessComponent returns [EObject current=null] : (otherlv_0= 'stateless-component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperationsUsageRule ) )? otherlv_4= '}' ) ;
    public final EObject ruleStatelessComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1303:28: ( (otherlv_0= 'stateless-component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperationsUsageRule ) )? otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1304:1: (otherlv_0= 'stateless-component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperationsUsageRule ) )? otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1304:1: (otherlv_0= 'stateless-component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperationsUsageRule ) )? otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1304:3: otherlv_0= 'stateless-component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleInterfaceOperationsUsageRule ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleStatelessComponent3048); 

                	newLeafNode(otherlv_0, grammarAccess.getStatelessComponentAccess().getStatelessComponentKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1309:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1309:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatelessComponent3065); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStatelessComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatelessComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleStatelessComponent3082); 

                	newLeafNode(otherlv_2, grammarAccess.getStatelessComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1330:1: ( (lv_operations_3_0= ruleInterfaceOperationsUsageRule ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=40 && LA22_0<=41)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1331:1: (lv_operations_3_0= ruleInterfaceOperationsUsageRule )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1331:1: (lv_operations_3_0= ruleInterfaceOperationsUsageRule )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1332:3: lv_operations_3_0= ruleInterfaceOperationsUsageRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatelessComponentAccess().getOperationsInterfaceOperationsUsageRuleParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterfaceOperationsUsageRule_in_ruleStatelessComponent3103);
                    lv_operations_3_0=ruleInterfaceOperationsUsageRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatelessComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"operations",
                            		lv_operations_3_0, 
                            		"InterfaceOperationsUsageRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleStatelessComponent3116); 

                	newLeafNode(otherlv_4, grammarAccess.getStatelessComponentAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleStatelessComponent"


    // $ANTLR start "entryRuleDomainRepository"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1360:1: entryRuleDomainRepository returns [EObject current=null] : iv_ruleDomainRepository= ruleDomainRepository EOF ;
    public final EObject entryRuleDomainRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRepository = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1361:2: (iv_ruleDomainRepository= ruleDomainRepository EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1362:2: iv_ruleDomainRepository= ruleDomainRepository EOF
            {
             newCompositeNode(grammarAccess.getDomainRepositoryRule()); 
            pushFollow(FOLLOW_ruleDomainRepository_in_entryRuleDomainRepository3152);
            iv_ruleDomainRepository=ruleDomainRepository();

            state._fsp--;

             current =iv_ruleDomainRepository; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainRepository3162); 

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
    // $ANTLR end "entryRuleDomainRepository"


    // $ANTLR start "ruleDomainRepository"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1369:1: ruleDomainRepository returns [EObject current=null] : (otherlv_0= 'domainrepository' otherlv_1= 'for' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleInterfaceOperationsUsageRule ) )? otherlv_6= '}' ) ;
    public final EObject ruleDomainRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_operations_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1372:28: ( (otherlv_0= 'domainrepository' otherlv_1= 'for' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleInterfaceOperationsUsageRule ) )? otherlv_6= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1373:1: (otherlv_0= 'domainrepository' otherlv_1= 'for' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleInterfaceOperationsUsageRule ) )? otherlv_6= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1373:1: (otherlv_0= 'domainrepository' otherlv_1= 'for' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleInterfaceOperationsUsageRule ) )? otherlv_6= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1373:3: otherlv_0= 'domainrepository' otherlv_1= 'for' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleInterfaceOperationsUsageRule ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleDomainRepository3199); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainRepositoryAccess().getDomainrepositoryKeyword_0());
                
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDomainRepository3211); 

                	newLeafNode(otherlv_1, grammarAccess.getDomainRepositoryAccess().getForKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1381:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1382:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1382:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1383:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainRepositoryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDomainRepositoryAccess().getEntityTypeDomainEntityCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDomainRepository3234);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1396:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1397:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1397:1: (lv_name_3_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1398:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainRepository3251); 

            			newLeafNode(lv_name_3_0, grammarAccess.getDomainRepositoryAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainRepositoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleDomainRepository3268); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainRepositoryAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1418:1: ( (lv_operations_5_0= ruleInterfaceOperationsUsageRule ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=40 && LA23_0<=41)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1419:1: (lv_operations_5_0= ruleInterfaceOperationsUsageRule )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1419:1: (lv_operations_5_0= ruleInterfaceOperationsUsageRule )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1420:3: lv_operations_5_0= ruleInterfaceOperationsUsageRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getDomainRepositoryAccess().getOperationsInterfaceOperationsUsageRuleParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterfaceOperationsUsageRule_in_ruleDomainRepository3289);
                    lv_operations_5_0=ruleInterfaceOperationsUsageRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDomainRepositoryRule());
                    	        }
                           		set(
                           			current, 
                           			"operations",
                            		lv_operations_5_0, 
                            		"InterfaceOperationsUsageRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleDomainRepository3302); 

                	newLeafNode(otherlv_6, grammarAccess.getDomainRepositoryAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleDomainRepository"


    // $ANTLR start "entryRuleEntryParametersModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1448:1: entryRuleEntryParametersModule returns [EObject current=null] : iv_ruleEntryParametersModule= ruleEntryParametersModule EOF ;
    public final EObject entryRuleEntryParametersModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryParametersModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1449:2: (iv_ruleEntryParametersModule= ruleEntryParametersModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1450:2: iv_ruleEntryParametersModule= ruleEntryParametersModule EOF
            {
             newCompositeNode(grammarAccess.getEntryParametersModuleRule()); 
            pushFollow(FOLLOW_ruleEntryParametersModule_in_entryRuleEntryParametersModule3338);
            iv_ruleEntryParametersModule=ruleEntryParametersModule();

            state._fsp--;

             current =iv_ruleEntryParametersModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryParametersModule3348); 

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
    // $ANTLR end "entryRuleEntryParametersModule"


    // $ANTLR start "ruleEntryParametersModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1457:1: ruleEntryParametersModule returns [EObject current=null] : (otherlv_0= 'entryParameters' otherlv_1= '{' ( (lv_entryFeatures_2_0= ruleModelFeature ) ) ( (lv_entryFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntryParametersModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_entryFeatures_2_0 = null;

        EObject lv_entryFeatures_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1460:28: ( (otherlv_0= 'entryParameters' otherlv_1= '{' ( (lv_entryFeatures_2_0= ruleModelFeature ) ) ( (lv_entryFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1461:1: (otherlv_0= 'entryParameters' otherlv_1= '{' ( (lv_entryFeatures_2_0= ruleModelFeature ) ) ( (lv_entryFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1461:1: (otherlv_0= 'entryParameters' otherlv_1= '{' ( (lv_entryFeatures_2_0= ruleModelFeature ) ) ( (lv_entryFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1461:3: otherlv_0= 'entryParameters' otherlv_1= '{' ( (lv_entryFeatures_2_0= ruleModelFeature ) ) ( (lv_entryFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleEntryParametersModule3385); 

                	newLeafNode(otherlv_0, grammarAccess.getEntryParametersModuleAccess().getEntryParametersKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEntryParametersModule3397); 

                	newLeafNode(otherlv_1, grammarAccess.getEntryParametersModuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1469:1: ( (lv_entryFeatures_2_0= ruleModelFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1470:1: (lv_entryFeatures_2_0= ruleModelFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1470:1: (lv_entryFeatures_2_0= ruleModelFeature )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1471:3: lv_entryFeatures_2_0= ruleModelFeature
            {
             
            	        newCompositeNode(grammarAccess.getEntryParametersModuleAccess().getEntryFeaturesModelFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleModelFeature_in_ruleEntryParametersModule3418);
            lv_entryFeatures_2_0=ruleModelFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntryParametersModuleRule());
            	        }
                   		add(
                   			current, 
                   			"entryFeatures",
                    		lv_entryFeatures_2_0, 
                    		"ModelFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1487:2: ( (lv_entryFeatures_3_0= ruleModelFeature ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1488:1: (lv_entryFeatures_3_0= ruleModelFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1488:1: (lv_entryFeatures_3_0= ruleModelFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1489:3: lv_entryFeatures_3_0= ruleModelFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntryParametersModuleAccess().getEntryFeaturesModelFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelFeature_in_ruleEntryParametersModule3439);
            	    lv_entryFeatures_3_0=ruleModelFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntryParametersModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entryFeatures",
            	            		lv_entryFeatures_3_0, 
            	            		"ModelFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEntryParametersModule3452); 

                	newLeafNode(otherlv_4, grammarAccess.getEntryParametersModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEntryParametersModule"


    // $ANTLR start "entryRuleModelFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1517:1: entryRuleModelFeature returns [EObject current=null] : iv_ruleModelFeature= ruleModelFeature EOF ;
    public final EObject entryRuleModelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1518:2: (iv_ruleModelFeature= ruleModelFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1519:2: iv_ruleModelFeature= ruleModelFeature EOF
            {
             newCompositeNode(grammarAccess.getModelFeatureRule()); 
            pushFollow(FOLLOW_ruleModelFeature_in_entryRuleModelFeature3488);
            iv_ruleModelFeature=ruleModelFeature();

            state._fsp--;

             current =iv_ruleModelFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFeature3498); 

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
    // $ANTLR end "entryRuleModelFeature"


    // $ANTLR start "ruleModelFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1526:1: ruleModelFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= '[]' (otherlv_4= 'ordered' )? )? ) ;
    public final EObject ruleModelFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1529:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= '[]' (otherlv_4= 'ordered' )? )? ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1530:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= '[]' (otherlv_4= 'ordered' )? )? )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1530:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= '[]' (otherlv_4= 'ordered' )? )? )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1530:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= '[]' (otherlv_4= 'ordered' )? )?
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1530:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1531:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1531:1: (lv_name_0_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1532:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelFeature3540); 

            			newLeafNode(lv_name_0_0, grammarAccess.getModelFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleModelFeature3557); 

                	newLeafNode(otherlv_1, grammarAccess.getModelFeatureAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1552:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1553:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1553:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1554:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModelFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getModelFeatureAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModelFeature3580);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1567:2: (otherlv_3= '[]' (otherlv_4= 'ordered' )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1567:4: otherlv_3= '[]' (otherlv_4= 'ordered' )?
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleModelFeature3593); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelFeatureAccess().getLeftSquareBracketRightSquareBracketKeyword_3_0());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1571:1: (otherlv_4= 'ordered' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==46) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1571:3: otherlv_4= 'ordered'
                            {
                            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleModelFeature3606); 

                                	newLeafNode(otherlv_4, grammarAccess.getModelFeatureAccess().getOrderedKeyword_3_1());
                                

                            }
                            break;

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
    // $ANTLR end "ruleModelFeature"


    // $ANTLR start "entryRuleModelModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1583:1: entryRuleModelModule returns [EObject current=null] : iv_ruleModelModule= ruleModelModule EOF ;
    public final EObject entryRuleModelModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1584:2: (iv_ruleModelModule= ruleModelModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1585:2: iv_ruleModelModule= ruleModelModule EOF
            {
             newCompositeNode(grammarAccess.getModelModuleRule()); 
            pushFollow(FOLLOW_ruleModelModule_in_entryRuleModelModule3646);
            iv_ruleModelModule=ruleModelModule();

            state._fsp--;

             current =iv_ruleModelModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelModule3656); 

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
    // $ANTLR end "entryRuleModelModule"


    // $ANTLR start "ruleModelModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1592:1: ruleModelModule returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= '{' ( (lv_modelFeatures_2_0= ruleModelFeature ) ) ( (lv_modelFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_modelFeatures_2_0 = null;

        EObject lv_modelFeatures_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1595:28: ( (otherlv_0= 'model' otherlv_1= '{' ( (lv_modelFeatures_2_0= ruleModelFeature ) ) ( (lv_modelFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1596:1: (otherlv_0= 'model' otherlv_1= '{' ( (lv_modelFeatures_2_0= ruleModelFeature ) ) ( (lv_modelFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1596:1: (otherlv_0= 'model' otherlv_1= '{' ( (lv_modelFeatures_2_0= ruleModelFeature ) ) ( (lv_modelFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1596:3: otherlv_0= 'model' otherlv_1= '{' ( (lv_modelFeatures_2_0= ruleModelFeature ) ) ( (lv_modelFeatures_3_0= ruleModelFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleModelModule3693); 

                	newLeafNode(otherlv_0, grammarAccess.getModelModuleAccess().getModelKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleModelModule3705); 

                	newLeafNode(otherlv_1, grammarAccess.getModelModuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1604:1: ( (lv_modelFeatures_2_0= ruleModelFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1605:1: (lv_modelFeatures_2_0= ruleModelFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1605:1: (lv_modelFeatures_2_0= ruleModelFeature )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1606:3: lv_modelFeatures_2_0= ruleModelFeature
            {
             
            	        newCompositeNode(grammarAccess.getModelModuleAccess().getModelFeaturesModelFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleModelFeature_in_ruleModelModule3726);
            lv_modelFeatures_2_0=ruleModelFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelModuleRule());
            	        }
                   		add(
                   			current, 
                   			"modelFeatures",
                    		lv_modelFeatures_2_0, 
                    		"ModelFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1622:2: ( (lv_modelFeatures_3_0= ruleModelFeature ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1623:1: (lv_modelFeatures_3_0= ruleModelFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1623:1: (lv_modelFeatures_3_0= ruleModelFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1624:3: lv_modelFeatures_3_0= ruleModelFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelModuleAccess().getModelFeaturesModelFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelFeature_in_ruleModelModule3747);
            	    lv_modelFeatures_3_0=ruleModelFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modelFeatures",
            	            		lv_modelFeatures_3_0, 
            	            		"ModelFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleModelModule3760); 

                	newLeafNode(otherlv_4, grammarAccess.getModelModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModelModule"


    // $ANTLR start "entryRuleElementFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1652:1: entryRuleElementFeature returns [EObject current=null] : iv_ruleElementFeature= ruleElementFeature EOF ;
    public final EObject entryRuleElementFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1653:2: (iv_ruleElementFeature= ruleElementFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1654:2: iv_ruleElementFeature= ruleElementFeature EOF
            {
             newCompositeNode(grammarAccess.getElementFeatureRule()); 
            pushFollow(FOLLOW_ruleElementFeature_in_entryRuleElementFeature3796);
            iv_ruleElementFeature=ruleElementFeature();

            state._fsp--;

             current =iv_ruleElementFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementFeature3806); 

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
    // $ANTLR end "entryRuleElementFeature"


    // $ANTLR start "ruleElementFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1661:1: ruleElementFeature returns [EObject current=null] : ( ( (lv_propertyName_0_0= rulePropertyNameLiteral ) ) otherlv_1= ':' ( (lv_propertyValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleElementFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_propertyValue_2_0=null;
        Enumerator lv_propertyName_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1664:28: ( ( ( (lv_propertyName_0_0= rulePropertyNameLiteral ) ) otherlv_1= ':' ( (lv_propertyValue_2_0= RULE_STRING ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1665:1: ( ( (lv_propertyName_0_0= rulePropertyNameLiteral ) ) otherlv_1= ':' ( (lv_propertyValue_2_0= RULE_STRING ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1665:1: ( ( (lv_propertyName_0_0= rulePropertyNameLiteral ) ) otherlv_1= ':' ( (lv_propertyValue_2_0= RULE_STRING ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1665:2: ( (lv_propertyName_0_0= rulePropertyNameLiteral ) ) otherlv_1= ':' ( (lv_propertyValue_2_0= RULE_STRING ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1665:2: ( (lv_propertyName_0_0= rulePropertyNameLiteral ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1666:1: (lv_propertyName_0_0= rulePropertyNameLiteral )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1666:1: (lv_propertyName_0_0= rulePropertyNameLiteral )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1667:3: lv_propertyName_0_0= rulePropertyNameLiteral
            {
             
            	        newCompositeNode(grammarAccess.getElementFeatureAccess().getPropertyNamePropertyNameLiteralEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyNameLiteral_in_ruleElementFeature3852);
            lv_propertyName_0_0=rulePropertyNameLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"PropertyNameLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleElementFeature3864); 

                	newLeafNode(otherlv_1, grammarAccess.getElementFeatureAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1687:1: ( (lv_propertyValue_2_0= RULE_STRING ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1688:1: (lv_propertyValue_2_0= RULE_STRING )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1688:1: (lv_propertyValue_2_0= RULE_STRING )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1689:3: lv_propertyValue_2_0= RULE_STRING
            {
            lv_propertyValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementFeature3881); 

            			newLeafNode(lv_propertyValue_2_0, grammarAccess.getElementFeatureAccess().getPropertyValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyValue",
                    		lv_propertyValue_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleElementFeature"


    // $ANTLR start "entryRuleContentElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1713:1: entryRuleContentElement returns [EObject current=null] : iv_ruleContentElement= ruleContentElement EOF ;
    public final EObject entryRuleContentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1714:2: (iv_ruleContentElement= ruleContentElement EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1715:2: iv_ruleContentElement= ruleContentElement EOF
            {
             newCompositeNode(grammarAccess.getContentElementRule()); 
            pushFollow(FOLLOW_ruleContentElement_in_entryRuleContentElement3922);
            iv_ruleContentElement=ruleContentElement();

            state._fsp--;

             current =iv_ruleContentElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentElement3932); 

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
    // $ANTLR end "entryRuleContentElement"


    // $ANTLR start "ruleContentElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1722:1: ruleContentElement returns [EObject current=null] : ( ( (lv_contentElement_0_0= ruleContentElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleContentElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_contentElement_0_0 = null;

        EObject lv_features_3_0 = null;

        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1725:28: ( ( ( (lv_contentElement_0_0= ruleContentElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* )? otherlv_6= ')' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1726:1: ( ( (lv_contentElement_0_0= ruleContentElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* )? otherlv_6= ')' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1726:1: ( ( (lv_contentElement_0_0= ruleContentElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* )? otherlv_6= ')' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1726:2: ( (lv_contentElement_0_0= ruleContentElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* )? otherlv_6= ')'
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1726:2: ( (lv_contentElement_0_0= ruleContentElementLiteral ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1727:1: (lv_contentElement_0_0= ruleContentElementLiteral )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1727:1: (lv_contentElement_0_0= ruleContentElementLiteral )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1728:3: lv_contentElement_0_0= ruleContentElementLiteral
            {
             
            	        newCompositeNode(grammarAccess.getContentElementAccess().getContentElementContentElementLiteralEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleContentElementLiteral_in_ruleContentElement3978);
            lv_contentElement_0_0=ruleContentElementLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentElementRule());
            	        }
                   		set(
                   			current, 
                   			"contentElement",
                    		lv_contentElement_0_0, 
                    		"ContentElementLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1744:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1745:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1745:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1746:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentElement3995); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContentElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContentElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleContentElement4012); 

                	newLeafNode(otherlv_2, grammarAccess.getContentElementAccess().getLeftParenthesisKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1766:1: ( ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==75||(LA29_0>=87 && LA29_0<=93)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1766:2: ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )*
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1766:2: ( (lv_features_3_0= ruleElementFeature ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1767:1: (lv_features_3_0= ruleElementFeature )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1767:1: (lv_features_3_0= ruleElementFeature )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1768:3: lv_features_3_0= ruleElementFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentElementAccess().getFeaturesElementFeatureParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementFeature_in_ruleContentElement4034);
                    lv_features_3_0=ruleElementFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentElementRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_3_0, 
                            		"ElementFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1784:2: (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==33) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1784:4: otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleContentElement4047); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getContentElementAccess().getCommaSpaceKeyword_3_1_0());
                    	        
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1788:1: ( (lv_features_5_0= ruleElementFeature ) )
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1789:1: (lv_features_5_0= ruleElementFeature )
                    	    {
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1789:1: (lv_features_5_0= ruleElementFeature )
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1790:3: lv_features_5_0= ruleElementFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContentElementAccess().getFeaturesElementFeatureParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleElementFeature_in_ruleContentElement4068);
                    	    lv_features_5_0=ruleElementFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContentElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_5_0, 
                    	            		"ElementFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleContentElement4084); 

                	newLeafNode(otherlv_6, grammarAccess.getContentElementAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleContentElement"


    // $ANTLR start "entryRuleContainerElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1818:1: entryRuleContainerElement returns [EObject current=null] : iv_ruleContainerElement= ruleContainerElement EOF ;
    public final EObject entryRuleContainerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerElement = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1819:2: (iv_ruleContainerElement= ruleContainerElement EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1820:2: iv_ruleContainerElement= ruleContainerElement EOF
            {
             newCompositeNode(grammarAccess.getContainerElementRule()); 
            pushFollow(FOLLOW_ruleContainerElement_in_entryRuleContainerElement4120);
            iv_ruleContainerElement=ruleContainerElement();

            state._fsp--;

             current =iv_ruleContainerElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerElement4130); 

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
    // $ANTLR end "entryRuleContainerElement"


    // $ANTLR start "ruleContainerElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1827:1: ruleContainerElement returns [EObject current=null] : ( ( (lv_container_0_0= ruleContainerElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '(' ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* otherlv_6= ')' )? (otherlv_7= '{' ( (lv_elements_8_0= ruleViewElement ) ) ( (lv_elements_9_0= ruleViewElement ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleContainerElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Enumerator lv_container_0_0 = null;

        EObject lv_features_3_0 = null;

        EObject lv_features_5_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1830:28: ( ( ( (lv_container_0_0= ruleContainerElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '(' ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* otherlv_6= ')' )? (otherlv_7= '{' ( (lv_elements_8_0= ruleViewElement ) ) ( (lv_elements_9_0= ruleViewElement ) )* otherlv_10= '}' )? ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1831:1: ( ( (lv_container_0_0= ruleContainerElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '(' ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* otherlv_6= ')' )? (otherlv_7= '{' ( (lv_elements_8_0= ruleViewElement ) ) ( (lv_elements_9_0= ruleViewElement ) )* otherlv_10= '}' )? )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1831:1: ( ( (lv_container_0_0= ruleContainerElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '(' ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* otherlv_6= ')' )? (otherlv_7= '{' ( (lv_elements_8_0= ruleViewElement ) ) ( (lv_elements_9_0= ruleViewElement ) )* otherlv_10= '}' )? )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1831:2: ( (lv_container_0_0= ruleContainerElementLiteral ) ) ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '(' ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* otherlv_6= ')' )? (otherlv_7= '{' ( (lv_elements_8_0= ruleViewElement ) ) ( (lv_elements_9_0= ruleViewElement ) )* otherlv_10= '}' )?
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1831:2: ( (lv_container_0_0= ruleContainerElementLiteral ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1832:1: (lv_container_0_0= ruleContainerElementLiteral )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1832:1: (lv_container_0_0= ruleContainerElementLiteral )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1833:3: lv_container_0_0= ruleContainerElementLiteral
            {
             
            	        newCompositeNode(grammarAccess.getContainerElementAccess().getContainerContainerElementLiteralEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleContainerElementLiteral_in_ruleContainerElement4176);
            lv_container_0_0=ruleContainerElementLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerElementRule());
            	        }
                   		set(
                   			current, 
                   			"container",
                    		lv_container_0_0, 
                    		"ContainerElementLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1849:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1850:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1850:1: (lv_name_1_0= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1851:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerElement4193); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getContainerElementAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1867:3: (otherlv_2= '(' ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* otherlv_6= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1867:5: otherlv_2= '(' ( (lv_features_3_0= ruleElementFeature ) ) (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleContainerElement4212); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainerElementAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1871:1: ( (lv_features_3_0= ruleElementFeature ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1872:1: (lv_features_3_0= ruleElementFeature )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1872:1: (lv_features_3_0= ruleElementFeature )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:3: lv_features_3_0= ruleElementFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerElementAccess().getFeaturesElementFeatureParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementFeature_in_ruleContainerElement4233);
                    lv_features_3_0=ruleElementFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerElementRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_3_0, 
                            		"ElementFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1889:2: (otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==33) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1889:4: otherlv_4= ', ' ( (lv_features_5_0= ruleElementFeature ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleContainerElement4246); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getContainerElementAccess().getCommaSpaceKeyword_2_2_0());
                    	        
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1893:1: ( (lv_features_5_0= ruleElementFeature ) )
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1894:1: (lv_features_5_0= ruleElementFeature )
                    	    {
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1894:1: (lv_features_5_0= ruleElementFeature )
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1895:3: lv_features_5_0= ruleElementFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerElementAccess().getFeaturesElementFeatureParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleElementFeature_in_ruleContainerElement4267);
                    	    lv_features_5_0=ruleElementFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainerElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_5_0, 
                    	            		"ElementFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleContainerElement4281); 

                        	newLeafNode(otherlv_6, grammarAccess.getContainerElementAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1915:3: (otherlv_7= '{' ( (lv_elements_8_0= ruleViewElement ) ) ( (lv_elements_9_0= ruleViewElement ) )* otherlv_10= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1915:5: otherlv_7= '{' ( (lv_elements_8_0= ruleViewElement ) ) ( (lv_elements_9_0= ruleViewElement ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleContainerElement4296); 

                        	newLeafNode(otherlv_7, grammarAccess.getContainerElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1919:1: ( (lv_elements_8_0= ruleViewElement ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1920:1: (lv_elements_8_0= ruleViewElement )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1920:1: (lv_elements_8_0= ruleViewElement )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1921:3: lv_elements_8_0= ruleViewElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerElementAccess().getElementsViewElementParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleViewElement_in_ruleContainerElement4317);
                    lv_elements_8_0=ruleViewElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerElementRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_8_0, 
                            		"ViewElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1937:2: ( (lv_elements_9_0= ruleViewElement ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==70||(LA33_0>=82 && LA33_0<=86)||LA33_0==94) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1938:1: (lv_elements_9_0= ruleViewElement )
                    	    {
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1938:1: (lv_elements_9_0= ruleViewElement )
                    	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1939:3: lv_elements_9_0= ruleViewElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerElementAccess().getElementsViewElementParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleViewElement_in_ruleContainerElement4338);
                    	    lv_elements_9_0=ruleViewElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainerElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_9_0, 
                    	            		"ViewElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleContainerElement4351); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerElementAccess().getRightCurlyBracketKeyword_3_3());
                        

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
    // $ANTLR end "ruleContainerElement"


    // $ANTLR start "entryRuleViewElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1967:1: entryRuleViewElement returns [EObject current=null] : iv_ruleViewElement= ruleViewElement EOF ;
    public final EObject entryRuleViewElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewElement = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1968:2: (iv_ruleViewElement= ruleViewElement EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1969:2: iv_ruleViewElement= ruleViewElement EOF
            {
             newCompositeNode(grammarAccess.getViewElementRule()); 
            pushFollow(FOLLOW_ruleViewElement_in_entryRuleViewElement4389);
            iv_ruleViewElement=ruleViewElement();

            state._fsp--;

             current =iv_ruleViewElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewElement4399); 

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
    // $ANTLR end "entryRuleViewElement"


    // $ANTLR start "ruleViewElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1976:1: ruleViewElement returns [EObject current=null] : (this_ContainerElement_0= ruleContainerElement | this_ContentElement_1= ruleContentElement ) ;
    public final EObject ruleViewElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerElement_0 = null;

        EObject this_ContentElement_1 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1979:28: ( (this_ContainerElement_0= ruleContainerElement | this_ContentElement_1= ruleContentElement ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1980:1: (this_ContainerElement_0= ruleContainerElement | this_ContentElement_1= ruleContentElement )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1980:1: (this_ContainerElement_0= ruleContainerElement | this_ContentElement_1= ruleContentElement )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70||LA35_0==94) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=82 && LA35_0<=86)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1981:5: this_ContainerElement_0= ruleContainerElement
                    {
                     
                            newCompositeNode(grammarAccess.getViewElementAccess().getContainerElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContainerElement_in_ruleViewElement4446);
                    this_ContainerElement_0=ruleContainerElement();

                    state._fsp--;

                     
                            current = this_ContainerElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1991:5: this_ContentElement_1= ruleContentElement
                    {
                     
                            newCompositeNode(grammarAccess.getViewElementAccess().getContentElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContentElement_in_ruleViewElement4473);
                    this_ContentElement_1=ruleContentElement();

                    state._fsp--;

                     
                            current = this_ContentElement_1; 
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
    // $ANTLR end "ruleViewElement"


    // $ANTLR start "entryRuleViewModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2007:1: entryRuleViewModule returns [EObject current=null] : iv_ruleViewModule= ruleViewModule EOF ;
    public final EObject entryRuleViewModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2008:2: (iv_ruleViewModule= ruleViewModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2009:2: iv_ruleViewModule= ruleViewModule EOF
            {
             newCompositeNode(grammarAccess.getViewModuleRule()); 
            pushFollow(FOLLOW_ruleViewModule_in_entryRuleViewModule4508);
            iv_ruleViewModule=ruleViewModule();

            state._fsp--;

             current =iv_ruleViewModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewModule4518); 

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
    // $ANTLR end "entryRuleViewModule"


    // $ANTLR start "ruleViewModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2016:1: ruleViewModule returns [EObject current=null] : (otherlv_0= 'view' otherlv_1= '{' ( (lv_elements_2_0= ruleViewElement ) ) otherlv_3= '}' ) ;
    public final EObject ruleViewModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2019:28: ( (otherlv_0= 'view' otherlv_1= '{' ( (lv_elements_2_0= ruleViewElement ) ) otherlv_3= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2020:1: (otherlv_0= 'view' otherlv_1= '{' ( (lv_elements_2_0= ruleViewElement ) ) otherlv_3= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2020:1: (otherlv_0= 'view' otherlv_1= '{' ( (lv_elements_2_0= ruleViewElement ) ) otherlv_3= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2020:3: otherlv_0= 'view' otherlv_1= '{' ( (lv_elements_2_0= ruleViewElement ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleViewModule4555); 

                	newLeafNode(otherlv_0, grammarAccess.getViewModuleAccess().getViewKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleViewModule4567); 

                	newLeafNode(otherlv_1, grammarAccess.getViewModuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2028:1: ( (lv_elements_2_0= ruleViewElement ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2029:1: (lv_elements_2_0= ruleViewElement )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2029:1: (lv_elements_2_0= ruleViewElement )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2030:3: lv_elements_2_0= ruleViewElement
            {
             
            	        newCompositeNode(grammarAccess.getViewModuleAccess().getElementsViewElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleViewElement_in_ruleViewModule4588);
            lv_elements_2_0=ruleViewElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewModuleRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"ViewElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleViewModule4600); 

                	newLeafNode(otherlv_3, grammarAccess.getViewModuleAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleViewModule"


    // $ANTLR start "entryRuleValidateAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2058:1: entryRuleValidateAction returns [EObject current=null] : iv_ruleValidateAction= ruleValidateAction EOF ;
    public final EObject entryRuleValidateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidateAction = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2059:2: (iv_ruleValidateAction= ruleValidateAction EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2060:2: iv_ruleValidateAction= ruleValidateAction EOF
            {
             newCompositeNode(grammarAccess.getValidateActionRule()); 
            pushFollow(FOLLOW_ruleValidateAction_in_entryRuleValidateAction4636);
            iv_ruleValidateAction=ruleValidateAction();

            state._fsp--;

             current =iv_ruleValidateAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidateAction4646); 

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
    // $ANTLR end "entryRuleValidateAction"


    // $ANTLR start "ruleValidateAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2067:1: ruleValidateAction returns [EObject current=null] : (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) ) ;
    public final EObject ruleValidateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_uiReceiver_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2070:28: ( (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2071:1: (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2071:1: (otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2071:3: otherlv_0= 'validate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleValidateAction4683); 

                	newLeafNode(otherlv_0, grammarAccess.getValidateActionAccess().getValidateKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2075:1: ( (otherlv_1= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2076:1: (otherlv_1= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2076:1: (otherlv_1= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2077:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidateActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidateAction4703); 

            		newLeafNode(otherlv_1, grammarAccess.getValidateActionAccess().getConditionValidatorFeatureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleValidateAction4715); 

                	newLeafNode(otherlv_2, grammarAccess.getValidateActionAccess().getOnKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2092:1: ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2093:1: (lv_uiReceiver_3_0= ruleSetUIElementReceiver )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2093:1: (lv_uiReceiver_3_0= ruleSetUIElementReceiver )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2094:3: lv_uiReceiver_3_0= ruleSetUIElementReceiver
            {
             
            	        newCompositeNode(grammarAccess.getValidateActionAccess().getUiReceiverSetUIElementReceiverParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSetUIElementReceiver_in_ruleValidateAction4736);
            lv_uiReceiver_3_0=ruleSetUIElementReceiver();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidateActionRule());
            	        }
                   		set(
                   			current, 
                   			"uiReceiver",
                    		lv_uiReceiver_3_0, 
                    		"SetUIElementReceiver");
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
    // $ANTLR end "ruleValidateAction"


    // $ANTLR start "entryRuleAttachAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2118:1: entryRuleAttachAction returns [EObject current=null] : iv_ruleAttachAction= ruleAttachAction EOF ;
    public final EObject entryRuleAttachAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachAction = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2119:2: (iv_ruleAttachAction= ruleAttachAction EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2120:2: iv_ruleAttachAction= ruleAttachAction EOF
            {
             newCompositeNode(grammarAccess.getAttachActionRule()); 
            pushFollow(FOLLOW_ruleAttachAction_in_entryRuleAttachAction4772);
            iv_ruleAttachAction=ruleAttachAction();

            state._fsp--;

             current =iv_ruleAttachAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachAction4782); 

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
    // $ANTLR end "entryRuleAttachAction"


    // $ANTLR start "ruleAttachAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2127:1: ruleAttachAction returns [EObject current=null] : (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) ) ;
    public final EObject ruleAttachAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_uiReceiver_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2130:28: ( (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2131:1: (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2131:1: (otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2131:3: otherlv_0= 'attach' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleAttachAction4819); 

                	newLeafNode(otherlv_0, grammarAccess.getAttachActionAccess().getAttachKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2135:1: ( (otherlv_1= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2136:1: (otherlv_1= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2136:1: (otherlv_1= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2137:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttachActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttachAction4839); 

            		newLeafNode(otherlv_1, grammarAccess.getAttachActionAccess().getUiActionUIActionModuleCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleAttachAction4851); 

                	newLeafNode(otherlv_2, grammarAccess.getAttachActionAccess().getToKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2152:1: ( (lv_uiReceiver_3_0= ruleSetUIElementReceiver ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2153:1: (lv_uiReceiver_3_0= ruleSetUIElementReceiver )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2153:1: (lv_uiReceiver_3_0= ruleSetUIElementReceiver )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2154:3: lv_uiReceiver_3_0= ruleSetUIElementReceiver
            {
             
            	        newCompositeNode(grammarAccess.getAttachActionAccess().getUiReceiverSetUIElementReceiverParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSetUIElementReceiver_in_ruleAttachAction4872);
            lv_uiReceiver_3_0=ruleSetUIElementReceiver();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttachActionRule());
            	        }
                   		set(
                   			current, 
                   			"uiReceiver",
                    		lv_uiReceiver_3_0, 
                    		"SetUIElementReceiver");
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
    // $ANTLR end "ruleAttachAction"


    // $ANTLR start "entryRuleBindEnumSource"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2178:1: entryRuleBindEnumSource returns [EObject current=null] : iv_ruleBindEnumSource= ruleBindEnumSource EOF ;
    public final EObject entryRuleBindEnumSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindEnumSource = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2179:2: (iv_ruleBindEnumSource= ruleBindEnumSource EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2180:2: iv_ruleBindEnumSource= ruleBindEnumSource EOF
            {
             newCompositeNode(grammarAccess.getBindEnumSourceRule()); 
            pushFollow(FOLLOW_ruleBindEnumSource_in_entryRuleBindEnumSource4908);
            iv_ruleBindEnumSource=ruleBindEnumSource();

            state._fsp--;

             current =iv_ruleBindEnumSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindEnumSource4918); 

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
    // $ANTLR end "entryRuleBindEnumSource"


    // $ANTLR start "ruleBindEnumSource"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2187:1: ruleBindEnumSource returns [EObject current=null] : (otherlv_0= 'enumDataSource' otherlv_1= '(' otherlv_2= 'className' otherlv_3= ':' ( (lv_enumType_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleBindEnumSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_enumType_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2190:28: ( (otherlv_0= 'enumDataSource' otherlv_1= '(' otherlv_2= 'className' otherlv_3= ':' ( (lv_enumType_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2191:1: (otherlv_0= 'enumDataSource' otherlv_1= '(' otherlv_2= 'className' otherlv_3= ':' ( (lv_enumType_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2191:1: (otherlv_0= 'enumDataSource' otherlv_1= '(' otherlv_2= 'className' otherlv_3= ':' ( (lv_enumType_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2191:3: otherlv_0= 'enumDataSource' otherlv_1= '(' otherlv_2= 'className' otherlv_3= ':' ( (lv_enumType_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleBindEnumSource4955); 

                	newLeafNode(otherlv_0, grammarAccess.getBindEnumSourceAccess().getEnumDataSourceKeyword_0());
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleBindEnumSource4967); 

                	newLeafNode(otherlv_1, grammarAccess.getBindEnumSourceAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBindEnumSource4979); 

                	newLeafNode(otherlv_2, grammarAccess.getBindEnumSourceAccess().getClassNameKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleBindEnumSource4991); 

                	newLeafNode(otherlv_3, grammarAccess.getBindEnumSourceAccess().getColonKeyword_3());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2207:1: ( (lv_enumType_4_0= RULE_STRING ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2208:1: (lv_enumType_4_0= RULE_STRING )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2208:1: (lv_enumType_4_0= RULE_STRING )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2209:3: lv_enumType_4_0= RULE_STRING
            {
            lv_enumType_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBindEnumSource5008); 

            			newLeafNode(lv_enumType_4_0, grammarAccess.getBindEnumSourceAccess().getEnumTypeSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBindEnumSourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enumType",
                    		lv_enumType_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleBindEnumSource5025); 

                	newLeafNode(otherlv_5, grammarAccess.getBindEnumSourceAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleBindEnumSource"


    // $ANTLR start "entryRuleBindSource"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2237:1: entryRuleBindSource returns [EObject current=null] : iv_ruleBindSource= ruleBindSource EOF ;
    public final EObject entryRuleBindSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindSource = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2238:2: (iv_ruleBindSource= ruleBindSource EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2239:2: iv_ruleBindSource= ruleBindSource EOF
            {
             newCompositeNode(grammarAccess.getBindSourceRule()); 
            pushFollow(FOLLOW_ruleBindSource_in_entryRuleBindSource5061);
            iv_ruleBindSource=ruleBindSource();

            state._fsp--;

             current =iv_ruleBindSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindSource5071); 

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
    // $ANTLR end "entryRuleBindSource"


    // $ANTLR start "ruleBindSource"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2246:1: ruleBindSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_BindEnumSource_1= ruleBindEnumSource ) ;
    public final EObject ruleBindSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_BindEnumSource_1 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2249:28: ( ( ( (otherlv_0= RULE_ID ) ) | this_BindEnumSource_1= ruleBindEnumSource ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2250:1: ( ( (otherlv_0= RULE_ID ) ) | this_BindEnumSource_1= ruleBindEnumSource )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2250:1: ( ( (otherlv_0= RULE_ID ) ) | this_BindEnumSource_1= ruleBindEnumSource )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==53) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2250:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2250:2: ( (otherlv_0= RULE_ID ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2251:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2251:1: (otherlv_0= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2252:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBindSourceRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindSource5116); 

                    		newLeafNode(otherlv_0, grammarAccess.getBindSourceAccess().getModelFeatureNameModelFeatureCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2265:5: this_BindEnumSource_1= ruleBindEnumSource
                    {
                     
                            newCompositeNode(grammarAccess.getBindSourceAccess().getBindEnumSourceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBindEnumSource_in_ruleBindSource5144);
                    this_BindEnumSource_1=ruleBindEnumSource();

                    state._fsp--;

                     
                            current = this_BindEnumSource_1; 
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
    // $ANTLR end "ruleBindSource"


    // $ANTLR start "entryRuleBindAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2281:1: entryRuleBindAction returns [EObject current=null] : iv_ruleBindAction= ruleBindAction EOF ;
    public final EObject entryRuleBindAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindAction = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2282:2: (iv_ruleBindAction= ruleBindAction EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2283:2: iv_ruleBindAction= ruleBindAction EOF
            {
             newCompositeNode(grammarAccess.getBindActionRule()); 
            pushFollow(FOLLOW_ruleBindAction_in_entryRuleBindAction5179);
            iv_ruleBindAction=ruleBindAction();

            state._fsp--;

             current =iv_ruleBindAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindAction5189); 

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
    // $ANTLR end "entryRuleBindAction"


    // $ANTLR start "ruleBindAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2290:1: ruleBindAction returns [EObject current=null] : (otherlv_0= 'bind' ( (lv_bindSource_1_0= ruleBindSource ) ) (otherlv_2= '.' ( (lv_attribute_3_0= RULE_ID ) ) )? otherlv_4= 'to' ( (lv_uiReceiver_5_0= ruleSetUIElementReceiver ) ) ) ;
    public final EObject ruleBindAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_attribute_3_0=null;
        Token otherlv_4=null;
        EObject lv_bindSource_1_0 = null;

        EObject lv_uiReceiver_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2293:28: ( (otherlv_0= 'bind' ( (lv_bindSource_1_0= ruleBindSource ) ) (otherlv_2= '.' ( (lv_attribute_3_0= RULE_ID ) ) )? otherlv_4= 'to' ( (lv_uiReceiver_5_0= ruleSetUIElementReceiver ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2294:1: (otherlv_0= 'bind' ( (lv_bindSource_1_0= ruleBindSource ) ) (otherlv_2= '.' ( (lv_attribute_3_0= RULE_ID ) ) )? otherlv_4= 'to' ( (lv_uiReceiver_5_0= ruleSetUIElementReceiver ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2294:1: (otherlv_0= 'bind' ( (lv_bindSource_1_0= ruleBindSource ) ) (otherlv_2= '.' ( (lv_attribute_3_0= RULE_ID ) ) )? otherlv_4= 'to' ( (lv_uiReceiver_5_0= ruleSetUIElementReceiver ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2294:3: otherlv_0= 'bind' ( (lv_bindSource_1_0= ruleBindSource ) ) (otherlv_2= '.' ( (lv_attribute_3_0= RULE_ID ) ) )? otherlv_4= 'to' ( (lv_uiReceiver_5_0= ruleSetUIElementReceiver ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleBindAction5226); 

                	newLeafNode(otherlv_0, grammarAccess.getBindActionAccess().getBindKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2298:1: ( (lv_bindSource_1_0= ruleBindSource ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2299:1: (lv_bindSource_1_0= ruleBindSource )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2299:1: (lv_bindSource_1_0= ruleBindSource )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2300:3: lv_bindSource_1_0= ruleBindSource
            {
             
            	        newCompositeNode(grammarAccess.getBindActionAccess().getBindSourceBindSourceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBindSource_in_ruleBindAction5247);
            lv_bindSource_1_0=ruleBindSource();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBindActionRule());
            	        }
                   		set(
                   			current, 
                   			"bindSource",
                    		lv_bindSource_1_0, 
                    		"BindSource");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2316:2: (otherlv_2= '.' ( (lv_attribute_3_0= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==11) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2316:4: otherlv_2= '.' ( (lv_attribute_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleBindAction5260); 

                        	newLeafNode(otherlv_2, grammarAccess.getBindActionAccess().getFullStopKeyword_2_0());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2320:1: ( (lv_attribute_3_0= RULE_ID ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2321:1: (lv_attribute_3_0= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2321:1: (lv_attribute_3_0= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2322:3: lv_attribute_3_0= RULE_ID
                    {
                    lv_attribute_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindAction5277); 

                    			newLeafNode(lv_attribute_3_0, grammarAccess.getBindActionAccess().getAttributeIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBindActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleBindAction5296); 

                	newLeafNode(otherlv_4, grammarAccess.getBindActionAccess().getToKeyword_3());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2342:1: ( (lv_uiReceiver_5_0= ruleSetUIElementReceiver ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2343:1: (lv_uiReceiver_5_0= ruleSetUIElementReceiver )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2343:1: (lv_uiReceiver_5_0= ruleSetUIElementReceiver )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2344:3: lv_uiReceiver_5_0= ruleSetUIElementReceiver
            {
             
            	        newCompositeNode(grammarAccess.getBindActionAccess().getUiReceiverSetUIElementReceiverParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSetUIElementReceiver_in_ruleBindAction5317);
            lv_uiReceiver_5_0=ruleSetUIElementReceiver();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBindActionRule());
            	        }
                   		set(
                   			current, 
                   			"uiReceiver",
                    		lv_uiReceiver_5_0, 
                    		"SetUIElementReceiver");
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
    // $ANTLR end "ruleBindAction"


    // $ANTLR start "entryRuleInitActionFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2368:1: entryRuleInitActionFeature returns [EObject current=null] : iv_ruleInitActionFeature= ruleInitActionFeature EOF ;
    public final EObject entryRuleInitActionFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitActionFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2369:2: (iv_ruleInitActionFeature= ruleInitActionFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2370:2: iv_ruleInitActionFeature= ruleInitActionFeature EOF
            {
             newCompositeNode(grammarAccess.getInitActionFeatureRule()); 
            pushFollow(FOLLOW_ruleInitActionFeature_in_entryRuleInitActionFeature5353);
            iv_ruleInitActionFeature=ruleInitActionFeature();

            state._fsp--;

             current =iv_ruleInitActionFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitActionFeature5363); 

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
    // $ANTLR end "entryRuleInitActionFeature"


    // $ANTLR start "ruleInitActionFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2377:1: ruleInitActionFeature returns [EObject current=null] : (this_SetAction_0= ruleSetAction | this_AttachAction_1= ruleAttachAction | this_ValidateAction_2= ruleValidateAction | this_BindAction_3= ruleBindAction ) ;
    public final EObject ruleInitActionFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SetAction_0 = null;

        EObject this_AttachAction_1 = null;

        EObject this_ValidateAction_2 = null;

        EObject this_BindAction_3 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2380:28: ( (this_SetAction_0= ruleSetAction | this_AttachAction_1= ruleAttachAction | this_ValidateAction_2= ruleValidateAction | this_BindAction_3= ruleBindAction ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2381:1: (this_SetAction_0= ruleSetAction | this_AttachAction_1= ruleAttachAction | this_ValidateAction_2= ruleValidateAction | this_BindAction_3= ruleBindAction )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2381:1: (this_SetAction_0= ruleSetAction | this_AttachAction_1= ruleAttachAction | this_ValidateAction_2= ruleValidateAction | this_BindAction_3= ruleBindAction )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt38=1;
                }
                break;
            case 51:
                {
                alt38=2;
                }
                break;
            case 49:
                {
                alt38=3;
                }
                break;
            case 55:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2382:5: this_SetAction_0= ruleSetAction
                    {
                     
                            newCompositeNode(grammarAccess.getInitActionFeatureAccess().getSetActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSetAction_in_ruleInitActionFeature5410);
                    this_SetAction_0=ruleSetAction();

                    state._fsp--;

                     
                            current = this_SetAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2392:5: this_AttachAction_1= ruleAttachAction
                    {
                     
                            newCompositeNode(grammarAccess.getInitActionFeatureAccess().getAttachActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttachAction_in_ruleInitActionFeature5437);
                    this_AttachAction_1=ruleAttachAction();

                    state._fsp--;

                     
                            current = this_AttachAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2402:5: this_ValidateAction_2= ruleValidateAction
                    {
                     
                            newCompositeNode(grammarAccess.getInitActionFeatureAccess().getValidateActionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleValidateAction_in_ruleInitActionFeature5464);
                    this_ValidateAction_2=ruleValidateAction();

                    state._fsp--;

                     
                            current = this_ValidateAction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2412:5: this_BindAction_3= ruleBindAction
                    {
                     
                            newCompositeNode(grammarAccess.getInitActionFeatureAccess().getBindActionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBindAction_in_ruleInitActionFeature5491);
                    this_BindAction_3=ruleBindAction();

                    state._fsp--;

                     
                            current = this_BindAction_3; 
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
    // $ANTLR end "ruleInitActionFeature"


    // $ANTLR start "entryRuleInitActionModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2428:1: entryRuleInitActionModule returns [EObject current=null] : iv_ruleInitActionModule= ruleInitActionModule EOF ;
    public final EObject entryRuleInitActionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitActionModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2429:2: (iv_ruleInitActionModule= ruleInitActionModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2430:2: iv_ruleInitActionModule= ruleInitActionModule EOF
            {
             newCompositeNode(grammarAccess.getInitActionModuleRule()); 
            pushFollow(FOLLOW_ruleInitActionModule_in_entryRuleInitActionModule5526);
            iv_ruleInitActionModule=ruleInitActionModule();

            state._fsp--;

             current =iv_ruleInitActionModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitActionModule5536); 

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
    // $ANTLR end "entryRuleInitActionModule"


    // $ANTLR start "ruleInitActionModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2437:1: ruleInitActionModule returns [EObject current=null] : (otherlv_0= 'initaction' otherlv_1= '{' ( (lv_initActionFeatures_2_0= ruleInitActionFeature ) ) ( (lv_initActionFeatures_3_0= ruleInitActionFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleInitActionModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_initActionFeatures_2_0 = null;

        EObject lv_initActionFeatures_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2440:28: ( (otherlv_0= 'initaction' otherlv_1= '{' ( (lv_initActionFeatures_2_0= ruleInitActionFeature ) ) ( (lv_initActionFeatures_3_0= ruleInitActionFeature ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2441:1: (otherlv_0= 'initaction' otherlv_1= '{' ( (lv_initActionFeatures_2_0= ruleInitActionFeature ) ) ( (lv_initActionFeatures_3_0= ruleInitActionFeature ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2441:1: (otherlv_0= 'initaction' otherlv_1= '{' ( (lv_initActionFeatures_2_0= ruleInitActionFeature ) ) ( (lv_initActionFeatures_3_0= ruleInitActionFeature ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2441:3: otherlv_0= 'initaction' otherlv_1= '{' ( (lv_initActionFeatures_2_0= ruleInitActionFeature ) ) ( (lv_initActionFeatures_3_0= ruleInitActionFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleInitActionModule5573); 

                	newLeafNode(otherlv_0, grammarAccess.getInitActionModuleAccess().getInitactionKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleInitActionModule5585); 

                	newLeafNode(otherlv_1, grammarAccess.getInitActionModuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2449:1: ( (lv_initActionFeatures_2_0= ruleInitActionFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2450:1: (lv_initActionFeatures_2_0= ruleInitActionFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2450:1: (lv_initActionFeatures_2_0= ruleInitActionFeature )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2451:3: lv_initActionFeatures_2_0= ruleInitActionFeature
            {
             
            	        newCompositeNode(grammarAccess.getInitActionModuleAccess().getInitActionFeaturesInitActionFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInitActionFeature_in_ruleInitActionModule5606);
            lv_initActionFeatures_2_0=ruleInitActionFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitActionModuleRule());
            	        }
                   		add(
                   			current, 
                   			"initActionFeatures",
                    		lv_initActionFeatures_2_0, 
                    		"InitActionFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2467:2: ( (lv_initActionFeatures_3_0= ruleInitActionFeature ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==49||LA39_0==51||LA39_0==55||LA39_0==67) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2468:1: (lv_initActionFeatures_3_0= ruleInitActionFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2468:1: (lv_initActionFeatures_3_0= ruleInitActionFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2469:3: lv_initActionFeatures_3_0= ruleInitActionFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitActionModuleAccess().getInitActionFeaturesInitActionFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInitActionFeature_in_ruleInitActionModule5627);
            	    lv_initActionFeatures_3_0=ruleInitActionFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitActionModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"initActionFeatures",
            	            		lv_initActionFeatures_3_0, 
            	            		"InitActionFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleInitActionModule5640); 

                	newLeafNode(otherlv_4, grammarAccess.getInitActionModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleInitActionModule"


    // $ANTLR start "entryRuleValidatorRule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2497:1: entryRuleValidatorRule returns [EObject current=null] : iv_ruleValidatorRule= ruleValidatorRule EOF ;
    public final EObject entryRuleValidatorRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatorRule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2498:2: (iv_ruleValidatorRule= ruleValidatorRule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2499:2: iv_ruleValidatorRule= ruleValidatorRule EOF
            {
             newCompositeNode(grammarAccess.getValidatorRuleRule()); 
            pushFollow(FOLLOW_ruleValidatorRule_in_entryRuleValidatorRule5676);
            iv_ruleValidatorRule=ruleValidatorRule();

            state._fsp--;

             current =iv_ruleValidatorRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidatorRule5686); 

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
    // $ANTLR end "entryRuleValidatorRule"


    // $ANTLR start "ruleValidatorRule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2506:1: ruleValidatorRule returns [EObject current=null] : ( ( (lv_stringRule_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleValidatorRule() throws RecognitionException {
        EObject current = null;

        Token lv_stringRule_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2509:28: ( ( ( (lv_stringRule_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2510:1: ( ( (lv_stringRule_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2510:1: ( ( (lv_stringRule_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2510:2: ( (lv_stringRule_0_0= RULE_STRING ) )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2510:2: ( (lv_stringRule_0_0= RULE_STRING ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2511:1: (lv_stringRule_0_0= RULE_STRING )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2511:1: (lv_stringRule_0_0= RULE_STRING )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2512:3: lv_stringRule_0_0= RULE_STRING
                    {
                    lv_stringRule_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValidatorRule5728); 

                    			newLeafNode(lv_stringRule_0_0, grammarAccess.getValidatorRuleAccess().getStringRuleSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidatorRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringRule",
                            		lv_stringRule_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2529:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2529:6: ( (otherlv_1= RULE_ID ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2530:1: (otherlv_1= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2530:1: (otherlv_1= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2531:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidatorRuleRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidatorRule5759); 

                    		newLeafNode(otherlv_1, grammarAccess.getValidatorRuleAccess().getConditionNameValidatorFeatureCrossReference_1_0()); 
                    	

                    }


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
    // $ANTLR end "ruleValidatorRule"


    // $ANTLR start "entryRuleValidatorRules"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2550:1: entryRuleValidatorRules returns [EObject current=null] : iv_ruleValidatorRules= ruleValidatorRules EOF ;
    public final EObject entryRuleValidatorRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatorRules = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2551:2: (iv_ruleValidatorRules= ruleValidatorRules EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2552:2: iv_ruleValidatorRules= ruleValidatorRules EOF
            {
             newCompositeNode(grammarAccess.getValidatorRulesRule()); 
            pushFollow(FOLLOW_ruleValidatorRules_in_entryRuleValidatorRules5795);
            iv_ruleValidatorRules=ruleValidatorRules();

            state._fsp--;

             current =iv_ruleValidatorRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidatorRules5805); 

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
    // $ANTLR end "entryRuleValidatorRules"


    // $ANTLR start "ruleValidatorRules"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2559:1: ruleValidatorRules returns [EObject current=null] : ( ( (lv_validatorRules_0_0= ruleValidatorRule ) ) (otherlv_1= 'and' ( (lv_validatorRules_2_0= ruleValidatorRule ) ) )* ) ;
    public final EObject ruleValidatorRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_validatorRules_0_0 = null;

        EObject lv_validatorRules_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2562:28: ( ( ( (lv_validatorRules_0_0= ruleValidatorRule ) ) (otherlv_1= 'and' ( (lv_validatorRules_2_0= ruleValidatorRule ) ) )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2563:1: ( ( (lv_validatorRules_0_0= ruleValidatorRule ) ) (otherlv_1= 'and' ( (lv_validatorRules_2_0= ruleValidatorRule ) ) )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2563:1: ( ( (lv_validatorRules_0_0= ruleValidatorRule ) ) (otherlv_1= 'and' ( (lv_validatorRules_2_0= ruleValidatorRule ) ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2563:2: ( (lv_validatorRules_0_0= ruleValidatorRule ) ) (otherlv_1= 'and' ( (lv_validatorRules_2_0= ruleValidatorRule ) ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2563:2: ( (lv_validatorRules_0_0= ruleValidatorRule ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2564:1: (lv_validatorRules_0_0= ruleValidatorRule )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2564:1: (lv_validatorRules_0_0= ruleValidatorRule )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2565:3: lv_validatorRules_0_0= ruleValidatorRule
            {
             
            	        newCompositeNode(grammarAccess.getValidatorRulesAccess().getValidatorRulesValidatorRuleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValidatorRule_in_ruleValidatorRules5851);
            lv_validatorRules_0_0=ruleValidatorRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidatorRulesRule());
            	        }
                   		add(
                   			current, 
                   			"validatorRules",
                    		lv_validatorRules_0_0, 
                    		"ValidatorRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2581:2: (otherlv_1= 'and' ( (lv_validatorRules_2_0= ruleValidatorRule ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==57) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2581:4: otherlv_1= 'and' ( (lv_validatorRules_2_0= ruleValidatorRule ) )
            	    {
            	    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleValidatorRules5864); 

            	        	newLeafNode(otherlv_1, grammarAccess.getValidatorRulesAccess().getAndKeyword_1_0());
            	        
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2585:1: ( (lv_validatorRules_2_0= ruleValidatorRule ) )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2586:1: (lv_validatorRules_2_0= ruleValidatorRule )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2586:1: (lv_validatorRules_2_0= ruleValidatorRule )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2587:3: lv_validatorRules_2_0= ruleValidatorRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValidatorRulesAccess().getValidatorRulesValidatorRuleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValidatorRule_in_ruleValidatorRules5885);
            	    lv_validatorRules_2_0=ruleValidatorRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValidatorRulesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"validatorRules",
            	            		lv_validatorRules_2_0, 
            	            		"ValidatorRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleValidatorRules"


    // $ANTLR start "entryRuleValidatorFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2611:1: entryRuleValidatorFeature returns [EObject current=null] : iv_ruleValidatorFeature= ruleValidatorFeature EOF ;
    public final EObject entryRuleValidatorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatorFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2612:2: (iv_ruleValidatorFeature= ruleValidatorFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2613:2: iv_ruleValidatorFeature= ruleValidatorFeature EOF
            {
             newCompositeNode(grammarAccess.getValidatorFeatureRule()); 
            pushFollow(FOLLOW_ruleValidatorFeature_in_entryRuleValidatorFeature5923);
            iv_ruleValidatorFeature=ruleValidatorFeature();

            state._fsp--;

             current =iv_ruleValidatorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidatorFeature5933); 

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
    // $ANTLR end "entryRuleValidatorFeature"


    // $ANTLR start "ruleValidatorFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2620:1: ruleValidatorFeature returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_validatorRules_3_0= ruleValidatorRules ) ) otherlv_4= ')' ) ;
    public final EObject ruleValidatorFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_validatorRules_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2623:28: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_validatorRules_3_0= ruleValidatorRules ) ) otherlv_4= ')' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2624:1: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_validatorRules_3_0= ruleValidatorRules ) ) otherlv_4= ')' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2624:1: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_validatorRules_3_0= ruleValidatorRules ) ) otherlv_4= ')' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2624:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_validatorRules_3_0= ruleValidatorRules ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleValidatorFeature5970); 

                	newLeafNode(otherlv_0, grammarAccess.getValidatorFeatureAccess().getConditionKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2628:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2629:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2629:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2630:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidatorFeature5987); 

            			newLeafNode(lv_name_1_0, grammarAccess.getValidatorFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValidatorFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleValidatorFeature6004); 

                	newLeafNode(otherlv_2, grammarAccess.getValidatorFeatureAccess().getLeftParenthesisKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2650:1: ( (lv_validatorRules_3_0= ruleValidatorRules ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2651:1: (lv_validatorRules_3_0= ruleValidatorRules )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2651:1: (lv_validatorRules_3_0= ruleValidatorRules )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2652:3: lv_validatorRules_3_0= ruleValidatorRules
            {
             
            	        newCompositeNode(grammarAccess.getValidatorFeatureAccess().getValidatorRulesValidatorRulesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValidatorRules_in_ruleValidatorFeature6025);
            lv_validatorRules_3_0=ruleValidatorRules();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidatorFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"validatorRules",
                    		lv_validatorRules_3_0, 
                    		"ValidatorRules");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleValidatorFeature6037); 

                	newLeafNode(otherlv_4, grammarAccess.getValidatorFeatureAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleValidatorFeature"


    // $ANTLR start "entryRuleValidatorModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2680:1: entryRuleValidatorModule returns [EObject current=null] : iv_ruleValidatorModule= ruleValidatorModule EOF ;
    public final EObject entryRuleValidatorModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatorModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2681:2: (iv_ruleValidatorModule= ruleValidatorModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2682:2: iv_ruleValidatorModule= ruleValidatorModule EOF
            {
             newCompositeNode(grammarAccess.getValidatorModuleRule()); 
            pushFollow(FOLLOW_ruleValidatorModule_in_entryRuleValidatorModule6073);
            iv_ruleValidatorModule=ruleValidatorModule();

            state._fsp--;

             current =iv_ruleValidatorModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidatorModule6083); 

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
    // $ANTLR end "entryRuleValidatorModule"


    // $ANTLR start "ruleValidatorModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2689:1: ruleValidatorModule returns [EObject current=null] : (otherlv_0= 'validator' otherlv_1= '{' ( (lv_validatorFeatures_2_0= ruleValidatorFeature ) ) ( (lv_validatorFeatures_3_0= ruleValidatorFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleValidatorModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_validatorFeatures_2_0 = null;

        EObject lv_validatorFeatures_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2692:28: ( (otherlv_0= 'validator' otherlv_1= '{' ( (lv_validatorFeatures_2_0= ruleValidatorFeature ) ) ( (lv_validatorFeatures_3_0= ruleValidatorFeature ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2693:1: (otherlv_0= 'validator' otherlv_1= '{' ( (lv_validatorFeatures_2_0= ruleValidatorFeature ) ) ( (lv_validatorFeatures_3_0= ruleValidatorFeature ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2693:1: (otherlv_0= 'validator' otherlv_1= '{' ( (lv_validatorFeatures_2_0= ruleValidatorFeature ) ) ( (lv_validatorFeatures_3_0= ruleValidatorFeature ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2693:3: otherlv_0= 'validator' otherlv_1= '{' ( (lv_validatorFeatures_2_0= ruleValidatorFeature ) ) ( (lv_validatorFeatures_3_0= ruleValidatorFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleValidatorModule6120); 

                	newLeafNode(otherlv_0, grammarAccess.getValidatorModuleAccess().getValidatorKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleValidatorModule6132); 

                	newLeafNode(otherlv_1, grammarAccess.getValidatorModuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2701:1: ( (lv_validatorFeatures_2_0= ruleValidatorFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2702:1: (lv_validatorFeatures_2_0= ruleValidatorFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2702:1: (lv_validatorFeatures_2_0= ruleValidatorFeature )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2703:3: lv_validatorFeatures_2_0= ruleValidatorFeature
            {
             
            	        newCompositeNode(grammarAccess.getValidatorModuleAccess().getValidatorFeaturesValidatorFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValidatorFeature_in_ruleValidatorModule6153);
            lv_validatorFeatures_2_0=ruleValidatorFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidatorModuleRule());
            	        }
                   		add(
                   			current, 
                   			"validatorFeatures",
                    		lv_validatorFeatures_2_0, 
                    		"ValidatorFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2719:2: ( (lv_validatorFeatures_3_0= ruleValidatorFeature ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==58) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2720:1: (lv_validatorFeatures_3_0= ruleValidatorFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2720:1: (lv_validatorFeatures_3_0= ruleValidatorFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2721:3: lv_validatorFeatures_3_0= ruleValidatorFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValidatorModuleAccess().getValidatorFeaturesValidatorFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValidatorFeature_in_ruleValidatorModule6174);
            	    lv_validatorFeatures_3_0=ruleValidatorFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValidatorModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"validatorFeatures",
            	            		lv_validatorFeatures_3_0, 
            	            		"ValidatorFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleValidatorModule6187); 

                	newLeafNode(otherlv_4, grammarAccess.getValidatorModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleValidatorModule"


    // $ANTLR start "entryRuleScreenModelParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2749:1: entryRuleScreenModelParameter returns [EObject current=null] : iv_ruleScreenModelParameter= ruleScreenModelParameter EOF ;
    public final EObject entryRuleScreenModelParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenModelParameter = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2750:2: (iv_ruleScreenModelParameter= ruleScreenModelParameter EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2751:2: iv_ruleScreenModelParameter= ruleScreenModelParameter EOF
            {
             newCompositeNode(grammarAccess.getScreenModelParameterRule()); 
            pushFollow(FOLLOW_ruleScreenModelParameter_in_entryRuleScreenModelParameter6223);
            iv_ruleScreenModelParameter=ruleScreenModelParameter();

            state._fsp--;

             current =iv_ruleScreenModelParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenModelParameter6233); 

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
    // $ANTLR end "entryRuleScreenModelParameter"


    // $ANTLR start "ruleScreenModelParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2758:1: ruleScreenModelParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_modelFeatureValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleScreenModelParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_modelFeatureValue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2761:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_modelFeatureValue_2_0= RULE_STRING ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2762:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_modelFeatureValue_2_0= RULE_STRING ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2762:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_modelFeatureValue_2_0= RULE_STRING ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2762:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_modelFeatureValue_2_0= RULE_STRING ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2762:2: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2763:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2763:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2764:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getScreenModelParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getScreenModelParameterAccess().getModelFeatureNameModelFeatureCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleScreenModelParameter6281);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleScreenModelParameter6293); 

                	newLeafNode(otherlv_1, grammarAccess.getScreenModelParameterAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2781:1: ( (lv_modelFeatureValue_2_0= RULE_STRING ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2782:1: (lv_modelFeatureValue_2_0= RULE_STRING )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2782:1: (lv_modelFeatureValue_2_0= RULE_STRING )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2783:3: lv_modelFeatureValue_2_0= RULE_STRING
            {
            lv_modelFeatureValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScreenModelParameter6310); 

            			newLeafNode(lv_modelFeatureValue_2_0, grammarAccess.getScreenModelParameterAccess().getModelFeatureValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScreenModelParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modelFeatureValue",
                    		lv_modelFeatureValue_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleScreenModelParameter"


    // $ANTLR start "entryRuleScreenModelParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2807:1: entryRuleScreenModelParameters returns [EObject current=null] : iv_ruleScreenModelParameters= ruleScreenModelParameters EOF ;
    public final EObject entryRuleScreenModelParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenModelParameters = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2808:2: (iv_ruleScreenModelParameters= ruleScreenModelParameters EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2809:2: iv_ruleScreenModelParameters= ruleScreenModelParameters EOF
            {
             newCompositeNode(grammarAccess.getScreenModelParametersRule()); 
            pushFollow(FOLLOW_ruleScreenModelParameters_in_entryRuleScreenModelParameters6351);
            iv_ruleScreenModelParameters=ruleScreenModelParameters();

            state._fsp--;

             current =iv_ruleScreenModelParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenModelParameters6361); 

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
    // $ANTLR end "entryRuleScreenModelParameters"


    // $ANTLR start "ruleScreenModelParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2816:1: ruleScreenModelParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleScreenModelParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleScreenModelParameter ) ) )* ) ;
    public final EObject ruleScreenModelParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2819:28: ( ( ( (lv_parameters_0_0= ruleScreenModelParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleScreenModelParameter ) ) )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2820:1: ( ( (lv_parameters_0_0= ruleScreenModelParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleScreenModelParameter ) ) )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2820:1: ( ( (lv_parameters_0_0= ruleScreenModelParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleScreenModelParameter ) ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2820:2: ( (lv_parameters_0_0= ruleScreenModelParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleScreenModelParameter ) ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2820:2: ( (lv_parameters_0_0= ruleScreenModelParameter ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2821:1: (lv_parameters_0_0= ruleScreenModelParameter )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2821:1: (lv_parameters_0_0= ruleScreenModelParameter )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2822:3: lv_parameters_0_0= ruleScreenModelParameter
            {
             
            	        newCompositeNode(grammarAccess.getScreenModelParametersAccess().getParametersScreenModelParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleScreenModelParameter_in_ruleScreenModelParameters6407);
            lv_parameters_0_0=ruleScreenModelParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScreenModelParametersRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"ScreenModelParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2838:2: (otherlv_1= ', ' ( (lv_parameters_2_0= ruleScreenModelParameter ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==33) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2838:4: otherlv_1= ', ' ( (lv_parameters_2_0= ruleScreenModelParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleScreenModelParameters6420); 

            	        	newLeafNode(otherlv_1, grammarAccess.getScreenModelParametersAccess().getCommaSpaceKeyword_1_0());
            	        
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2842:1: ( (lv_parameters_2_0= ruleScreenModelParameter ) )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2843:1: (lv_parameters_2_0= ruleScreenModelParameter )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2843:1: (lv_parameters_2_0= ruleScreenModelParameter )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2844:3: lv_parameters_2_0= ruleScreenModelParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenModelParametersAccess().getParametersScreenModelParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScreenModelParameter_in_ruleScreenModelParameters6441);
            	    lv_parameters_2_0=ruleScreenModelParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScreenModelParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"ScreenModelParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "ruleScreenModelParameters"


    // $ANTLR start "entryRuleNavigateToAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2868:1: entryRuleNavigateToAction returns [EObject current=null] : iv_ruleNavigateToAction= ruleNavigateToAction EOF ;
    public final EObject entryRuleNavigateToAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigateToAction = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2869:2: (iv_ruleNavigateToAction= ruleNavigateToAction EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2870:2: iv_ruleNavigateToAction= ruleNavigateToAction EOF
            {
             newCompositeNode(grammarAccess.getNavigateToActionRule()); 
            pushFollow(FOLLOW_ruleNavigateToAction_in_entryRuleNavigateToAction6479);
            iv_ruleNavigateToAction=ruleNavigateToAction();

            state._fsp--;

             current =iv_ruleNavigateToAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigateToAction6489); 

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
    // $ANTLR end "entryRuleNavigateToAction"


    // $ANTLR start "ruleNavigateToAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2877:1: ruleNavigateToAction returns [EObject current=null] : (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleNavigateToAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modelFeatures_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2880:28: ( (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) ) otherlv_4= ')' )? ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2881:1: (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) ) otherlv_4= ')' )? )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2881:1: (otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) ) otherlv_4= ')' )? )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2881:3: otherlv_0= 'navigateto' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleNavigateToAction6526); 

                	newLeafNode(otherlv_0, grammarAccess.getNavigateToActionAccess().getNavigatetoKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2885:1: ( (otherlv_1= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2886:1: (otherlv_1= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2886:1: (otherlv_1= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2887:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNavigateToActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNavigateToAction6546); 

            		newLeafNode(otherlv_1, grammarAccess.getNavigateToActionAccess().getScreenElementIdScreenFeatureCrossReference_1_0()); 
            	

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2898:2: (otherlv_2= '(' ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) ) otherlv_4= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2898:4: otherlv_2= '(' ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleNavigateToAction6559); 

                        	newLeafNode(otherlv_2, grammarAccess.getNavigateToActionAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2902:1: ( (lv_modelFeatures_3_0= ruleScreenModelParameters ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2903:1: (lv_modelFeatures_3_0= ruleScreenModelParameters )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2903:1: (lv_modelFeatures_3_0= ruleScreenModelParameters )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2904:3: lv_modelFeatures_3_0= ruleScreenModelParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getNavigateToActionAccess().getModelFeaturesScreenModelParametersParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScreenModelParameters_in_ruleNavigateToAction6580);
                    lv_modelFeatures_3_0=ruleScreenModelParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNavigateToActionRule());
                    	        }
                           		set(
                           			current, 
                           			"modelFeatures",
                            		lv_modelFeatures_3_0, 
                            		"ScreenModelParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleNavigateToAction6592); 

                        	newLeafNode(otherlv_4, grammarAccess.getNavigateToActionAccess().getRightParenthesisKeyword_2_2());
                        

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
    // $ANTLR end "ruleNavigateToAction"


    // $ANTLR start "entryRuleExecuteAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2932:1: entryRuleExecuteAction returns [EObject current=null] : iv_ruleExecuteAction= ruleExecuteAction EOF ;
    public final EObject entryRuleExecuteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteAction = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2933:2: (iv_ruleExecuteAction= ruleExecuteAction EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2934:2: iv_ruleExecuteAction= ruleExecuteAction EOF
            {
             newCompositeNode(grammarAccess.getExecuteActionRule()); 
            pushFollow(FOLLOW_ruleExecuteAction_in_entryRuleExecuteAction6630);
            iv_ruleExecuteAction=ruleExecuteAction();

            state._fsp--;

             current =iv_ruleExecuteAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteAction6640); 

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
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2941:1: ruleExecuteAction returns [EObject current=null] : (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExecuteAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2944:28: ( (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2945:1: (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2945:1: (otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2945:3: otherlv_0= 'execute' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleExecuteAction6677); 

                	newLeafNode(otherlv_0, grammarAccess.getExecuteActionAccess().getExecuteKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2949:1: ( (otherlv_1= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2950:1: (otherlv_1= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2950:1: (otherlv_1= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2951:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecuteActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecuteAction6697); 

            		newLeafNode(otherlv_1, grammarAccess.getExecuteActionAccess().getUiActionNameUIActionModuleCrossReference_1_0()); 
            	

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


    // $ANTLR start "entryRuleSetRestCallReceiverURLParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2970:1: entryRuleSetRestCallReceiverURLParameter returns [EObject current=null] : iv_ruleSetRestCallReceiverURLParameter= ruleSetRestCallReceiverURLParameter EOF ;
    public final EObject entryRuleSetRestCallReceiverURLParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRestCallReceiverURLParameter = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2971:2: (iv_ruleSetRestCallReceiverURLParameter= ruleSetRestCallReceiverURLParameter EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2972:2: iv_ruleSetRestCallReceiverURLParameter= ruleSetRestCallReceiverURLParameter EOF
            {
             newCompositeNode(grammarAccess.getSetRestCallReceiverURLParameterRule()); 
            pushFollow(FOLLOW_ruleSetRestCallReceiverURLParameter_in_entryRuleSetRestCallReceiverURLParameter6733);
            iv_ruleSetRestCallReceiverURLParameter=ruleSetRestCallReceiverURLParameter();

            state._fsp--;

             current =iv_ruleSetRestCallReceiverURLParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetRestCallReceiverURLParameter6743); 

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
    // $ANTLR end "entryRuleSetRestCallReceiverURLParameter"


    // $ANTLR start "ruleSetRestCallReceiverURLParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2979:1: ruleSetRestCallReceiverURLParameter returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= ':' ( (lv_parameterType_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSetRestCallReceiverURLParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_parameterType_2_0=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2982:28: ( (otherlv_0= 'url' otherlv_1= ':' ( (lv_parameterType_2_0= RULE_STRING ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2983:1: (otherlv_0= 'url' otherlv_1= ':' ( (lv_parameterType_2_0= RULE_STRING ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2983:1: (otherlv_0= 'url' otherlv_1= ':' ( (lv_parameterType_2_0= RULE_STRING ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2983:3: otherlv_0= 'url' otherlv_1= ':' ( (lv_parameterType_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleSetRestCallReceiverURLParameter6780); 

                	newLeafNode(otherlv_0, grammarAccess.getSetRestCallReceiverURLParameterAccess().getUrlKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSetRestCallReceiverURLParameter6792); 

                	newLeafNode(otherlv_1, grammarAccess.getSetRestCallReceiverURLParameterAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2991:1: ( (lv_parameterType_2_0= RULE_STRING ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2992:1: (lv_parameterType_2_0= RULE_STRING )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2992:1: (lv_parameterType_2_0= RULE_STRING )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2993:3: lv_parameterType_2_0= RULE_STRING
            {
            lv_parameterType_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSetRestCallReceiverURLParameter6809); 

            			newLeafNode(lv_parameterType_2_0, grammarAccess.getSetRestCallReceiverURLParameterAccess().getParameterTypeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRestCallReceiverURLParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameterType",
                    		lv_parameterType_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleSetRestCallReceiverURLParameter"


    // $ANTLR start "entryRuleSetRestCallReceiverReturnTypeParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3017:1: entryRuleSetRestCallReceiverReturnTypeParameter returns [EObject current=null] : iv_ruleSetRestCallReceiverReturnTypeParameter= ruleSetRestCallReceiverReturnTypeParameter EOF ;
    public final EObject entryRuleSetRestCallReceiverReturnTypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRestCallReceiverReturnTypeParameter = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3018:2: (iv_ruleSetRestCallReceiverReturnTypeParameter= ruleSetRestCallReceiverReturnTypeParameter EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3019:2: iv_ruleSetRestCallReceiverReturnTypeParameter= ruleSetRestCallReceiverReturnTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getSetRestCallReceiverReturnTypeParameterRule()); 
            pushFollow(FOLLOW_ruleSetRestCallReceiverReturnTypeParameter_in_entryRuleSetRestCallReceiverReturnTypeParameter6850);
            iv_ruleSetRestCallReceiverReturnTypeParameter=ruleSetRestCallReceiverReturnTypeParameter();

            state._fsp--;

             current =iv_ruleSetRestCallReceiverReturnTypeParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetRestCallReceiverReturnTypeParameter6860); 

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
    // $ANTLR end "entryRuleSetRestCallReceiverReturnTypeParameter"


    // $ANTLR start "ruleSetRestCallReceiverReturnTypeParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3026:1: ruleSetRestCallReceiverReturnTypeParameter returns [EObject current=null] : (otherlv_0= 'returnType' otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSetRestCallReceiverReturnTypeParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3029:28: ( (otherlv_0= 'returnType' otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3030:1: (otherlv_0= 'returnType' otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3030:1: (otherlv_0= 'returnType' otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3030:3: otherlv_0= 'returnType' otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleSetRestCallReceiverReturnTypeParameter6897); 

                	newLeafNode(otherlv_0, grammarAccess.getSetRestCallReceiverReturnTypeParameterAccess().getReturnTypeKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSetRestCallReceiverReturnTypeParameter6909); 

                	newLeafNode(otherlv_1, grammarAccess.getSetRestCallReceiverReturnTypeParameterAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3038:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3039:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3039:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3040:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRestCallReceiverReturnTypeParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSetRestCallReceiverReturnTypeParameterAccess().getParameterTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSetRestCallReceiverReturnTypeParameter6932);
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
    // $ANTLR end "ruleSetRestCallReceiverReturnTypeParameter"


    // $ANTLR start "entryRuleSetRestCallReceiverIDParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3061:1: entryRuleSetRestCallReceiverIDParameter returns [EObject current=null] : iv_ruleSetRestCallReceiverIDParameter= ruleSetRestCallReceiverIDParameter EOF ;
    public final EObject entryRuleSetRestCallReceiverIDParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRestCallReceiverIDParameter = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3062:2: (iv_ruleSetRestCallReceiverIDParameter= ruleSetRestCallReceiverIDParameter EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3063:2: iv_ruleSetRestCallReceiverIDParameter= ruleSetRestCallReceiverIDParameter EOF
            {
             newCompositeNode(grammarAccess.getSetRestCallReceiverIDParameterRule()); 
            pushFollow(FOLLOW_ruleSetRestCallReceiverIDParameter_in_entryRuleSetRestCallReceiverIDParameter6968);
            iv_ruleSetRestCallReceiverIDParameter=ruleSetRestCallReceiverIDParameter();

            state._fsp--;

             current =iv_ruleSetRestCallReceiverIDParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetRestCallReceiverIDParameter6978); 

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
    // $ANTLR end "entryRuleSetRestCallReceiverIDParameter"


    // $ANTLR start "ruleSetRestCallReceiverIDParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3070:1: ruleSetRestCallReceiverIDParameter returns [EObject current=null] : ( (otherlv_0= 'id' | otherlv_1= 'update' ) otherlv_2= ':' ( (lv_parameterType_3_0= RULE_ID ) ) ) ;
    public final EObject ruleSetRestCallReceiverIDParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_parameterType_3_0=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3073:28: ( ( (otherlv_0= 'id' | otherlv_1= 'update' ) otherlv_2= ':' ( (lv_parameterType_3_0= RULE_ID ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3074:1: ( (otherlv_0= 'id' | otherlv_1= 'update' ) otherlv_2= ':' ( (lv_parameterType_3_0= RULE_ID ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3074:1: ( (otherlv_0= 'id' | otherlv_1= 'update' ) otherlv_2= ':' ( (lv_parameterType_3_0= RULE_ID ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3074:2: (otherlv_0= 'id' | otherlv_1= 'update' ) otherlv_2= ':' ( (lv_parameterType_3_0= RULE_ID ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3074:2: (otherlv_0= 'id' | otherlv_1= 'update' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==64) ) {
                alt45=1;
            }
            else if ( (LA45_0==65) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3074:4: otherlv_0= 'id'
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleSetRestCallReceiverIDParameter7016); 

                        	newLeafNode(otherlv_0, grammarAccess.getSetRestCallReceiverIDParameterAccess().getIdKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3079:7: otherlv_1= 'update'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleSetRestCallReceiverIDParameter7034); 

                        	newLeafNode(otherlv_1, grammarAccess.getSetRestCallReceiverIDParameterAccess().getUpdateKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSetRestCallReceiverIDParameter7047); 

                	newLeafNode(otherlv_2, grammarAccess.getSetRestCallReceiverIDParameterAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3087:1: ( (lv_parameterType_3_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3088:1: (lv_parameterType_3_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3088:1: (lv_parameterType_3_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3089:3: lv_parameterType_3_0= RULE_ID
            {
            lv_parameterType_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetRestCallReceiverIDParameter7064); 

            			newLeafNode(lv_parameterType_3_0, grammarAccess.getSetRestCallReceiverIDParameterAccess().getParameterTypeIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRestCallReceiverIDParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameterType",
                    		lv_parameterType_3_0, 
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
    // $ANTLR end "ruleSetRestCallReceiverIDParameter"


    // $ANTLR start "entryRuleSetRestCallReceiverParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3113:1: entryRuleSetRestCallReceiverParameter returns [EObject current=null] : iv_ruleSetRestCallReceiverParameter= ruleSetRestCallReceiverParameter EOF ;
    public final EObject entryRuleSetRestCallReceiverParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRestCallReceiverParameter = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3114:2: (iv_ruleSetRestCallReceiverParameter= ruleSetRestCallReceiverParameter EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3115:2: iv_ruleSetRestCallReceiverParameter= ruleSetRestCallReceiverParameter EOF
            {
             newCompositeNode(grammarAccess.getSetRestCallReceiverParameterRule()); 
            pushFollow(FOLLOW_ruleSetRestCallReceiverParameter_in_entryRuleSetRestCallReceiverParameter7105);
            iv_ruleSetRestCallReceiverParameter=ruleSetRestCallReceiverParameter();

            state._fsp--;

             current =iv_ruleSetRestCallReceiverParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetRestCallReceiverParameter7115); 

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
    // $ANTLR end "entryRuleSetRestCallReceiverParameter"


    // $ANTLR start "ruleSetRestCallReceiverParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3122:1: ruleSetRestCallReceiverParameter returns [EObject current=null] : (this_SetRestCallReceiverURLParameter_0= ruleSetRestCallReceiverURLParameter | this_SetRestCallReceiverReturnTypeParameter_1= ruleSetRestCallReceiverReturnTypeParameter | this_SetRestCallReceiverIDParameter_2= ruleSetRestCallReceiverIDParameter ) ;
    public final EObject ruleSetRestCallReceiverParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SetRestCallReceiverURLParameter_0 = null;

        EObject this_SetRestCallReceiverReturnTypeParameter_1 = null;

        EObject this_SetRestCallReceiverIDParameter_2 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3125:28: ( (this_SetRestCallReceiverURLParameter_0= ruleSetRestCallReceiverURLParameter | this_SetRestCallReceiverReturnTypeParameter_1= ruleSetRestCallReceiverReturnTypeParameter | this_SetRestCallReceiverIDParameter_2= ruleSetRestCallReceiverIDParameter ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3126:1: (this_SetRestCallReceiverURLParameter_0= ruleSetRestCallReceiverURLParameter | this_SetRestCallReceiverReturnTypeParameter_1= ruleSetRestCallReceiverReturnTypeParameter | this_SetRestCallReceiverIDParameter_2= ruleSetRestCallReceiverIDParameter )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3126:1: (this_SetRestCallReceiverURLParameter_0= ruleSetRestCallReceiverURLParameter | this_SetRestCallReceiverReturnTypeParameter_1= ruleSetRestCallReceiverReturnTypeParameter | this_SetRestCallReceiverIDParameter_2= ruleSetRestCallReceiverIDParameter )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt46=1;
                }
                break;
            case 63:
                {
                alt46=2;
                }
                break;
            case 64:
            case 65:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3127:5: this_SetRestCallReceiverURLParameter_0= ruleSetRestCallReceiverURLParameter
                    {
                     
                            newCompositeNode(grammarAccess.getSetRestCallReceiverParameterAccess().getSetRestCallReceiverURLParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSetRestCallReceiverURLParameter_in_ruleSetRestCallReceiverParameter7162);
                    this_SetRestCallReceiverURLParameter_0=ruleSetRestCallReceiverURLParameter();

                    state._fsp--;

                     
                            current = this_SetRestCallReceiverURLParameter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3137:5: this_SetRestCallReceiverReturnTypeParameter_1= ruleSetRestCallReceiverReturnTypeParameter
                    {
                     
                            newCompositeNode(grammarAccess.getSetRestCallReceiverParameterAccess().getSetRestCallReceiverReturnTypeParameterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSetRestCallReceiverReturnTypeParameter_in_ruleSetRestCallReceiverParameter7189);
                    this_SetRestCallReceiverReturnTypeParameter_1=ruleSetRestCallReceiverReturnTypeParameter();

                    state._fsp--;

                     
                            current = this_SetRestCallReceiverReturnTypeParameter_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3147:5: this_SetRestCallReceiverIDParameter_2= ruleSetRestCallReceiverIDParameter
                    {
                     
                            newCompositeNode(grammarAccess.getSetRestCallReceiverParameterAccess().getSetRestCallReceiverIDParameterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSetRestCallReceiverIDParameter_in_ruleSetRestCallReceiverParameter7216);
                    this_SetRestCallReceiverIDParameter_2=ruleSetRestCallReceiverIDParameter();

                    state._fsp--;

                     
                            current = this_SetRestCallReceiverIDParameter_2; 
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
    // $ANTLR end "ruleSetRestCallReceiverParameter"


    // $ANTLR start "entryRuleSetRestCallReceiverParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3163:1: entryRuleSetRestCallReceiverParameters returns [EObject current=null] : iv_ruleSetRestCallReceiverParameters= ruleSetRestCallReceiverParameters EOF ;
    public final EObject entryRuleSetRestCallReceiverParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRestCallReceiverParameters = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3164:2: (iv_ruleSetRestCallReceiverParameters= ruleSetRestCallReceiverParameters EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3165:2: iv_ruleSetRestCallReceiverParameters= ruleSetRestCallReceiverParameters EOF
            {
             newCompositeNode(grammarAccess.getSetRestCallReceiverParametersRule()); 
            pushFollow(FOLLOW_ruleSetRestCallReceiverParameters_in_entryRuleSetRestCallReceiverParameters7251);
            iv_ruleSetRestCallReceiverParameters=ruleSetRestCallReceiverParameters();

            state._fsp--;

             current =iv_ruleSetRestCallReceiverParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetRestCallReceiverParameters7261); 

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
    // $ANTLR end "entryRuleSetRestCallReceiverParameters"


    // $ANTLR start "ruleSetRestCallReceiverParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3172:1: ruleSetRestCallReceiverParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleSetRestCallReceiverParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) ) )* ) ;
    public final EObject ruleSetRestCallReceiverParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3175:28: ( ( ( (lv_parameters_0_0= ruleSetRestCallReceiverParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) ) )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3176:1: ( ( (lv_parameters_0_0= ruleSetRestCallReceiverParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) ) )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3176:1: ( ( (lv_parameters_0_0= ruleSetRestCallReceiverParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3176:2: ( (lv_parameters_0_0= ruleSetRestCallReceiverParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3176:2: ( (lv_parameters_0_0= ruleSetRestCallReceiverParameter ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3177:1: (lv_parameters_0_0= ruleSetRestCallReceiverParameter )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3177:1: (lv_parameters_0_0= ruleSetRestCallReceiverParameter )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3178:3: lv_parameters_0_0= ruleSetRestCallReceiverParameter
            {
             
            	        newCompositeNode(grammarAccess.getSetRestCallReceiverParametersAccess().getParametersSetRestCallReceiverParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSetRestCallReceiverParameter_in_ruleSetRestCallReceiverParameters7307);
            lv_parameters_0_0=ruleSetRestCallReceiverParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetRestCallReceiverParametersRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"SetRestCallReceiverParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3194:2: (otherlv_1= ', ' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3194:4: otherlv_1= ', ' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSetRestCallReceiverParameters7320); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSetRestCallReceiverParametersAccess().getCommaSpaceKeyword_1_0());
            	        
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3198:1: ( (lv_parameters_2_0= ruleSetRestCallReceiverParameter ) )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3199:1: (lv_parameters_2_0= ruleSetRestCallReceiverParameter )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3199:1: (lv_parameters_2_0= ruleSetRestCallReceiverParameter )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3200:3: lv_parameters_2_0= ruleSetRestCallReceiverParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSetRestCallReceiverParametersAccess().getParametersSetRestCallReceiverParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSetRestCallReceiverParameter_in_ruleSetRestCallReceiverParameters7341);
            	    lv_parameters_2_0=ruleSetRestCallReceiverParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSetRestCallReceiverParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"SetRestCallReceiverParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end "ruleSetRestCallReceiverParameters"


    // $ANTLR start "entryRuleSetRestCallReceiver"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3224:1: entryRuleSetRestCallReceiver returns [EObject current=null] : iv_ruleSetRestCallReceiver= ruleSetRestCallReceiver EOF ;
    public final EObject entryRuleSetRestCallReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetRestCallReceiver = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3225:2: (iv_ruleSetRestCallReceiver= ruleSetRestCallReceiver EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3226:2: iv_ruleSetRestCallReceiver= ruleSetRestCallReceiver EOF
            {
             newCompositeNode(grammarAccess.getSetRestCallReceiverRule()); 
            pushFollow(FOLLOW_ruleSetRestCallReceiver_in_entryRuleSetRestCallReceiver7379);
            iv_ruleSetRestCallReceiver=ruleSetRestCallReceiver();

            state._fsp--;

             current =iv_ruleSetRestCallReceiver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetRestCallReceiver7389); 

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
    // $ANTLR end "entryRuleSetRestCallReceiver"


    // $ANTLR start "ruleSetRestCallReceiver"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3233:1: ruleSetRestCallReceiver returns [EObject current=null] : (otherlv_0= 'restcall' otherlv_1= '(' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameters ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetRestCallReceiver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3236:28: ( (otherlv_0= 'restcall' otherlv_1= '(' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameters ) ) otherlv_3= ')' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3237:1: (otherlv_0= 'restcall' otherlv_1= '(' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameters ) ) otherlv_3= ')' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3237:1: (otherlv_0= 'restcall' otherlv_1= '(' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameters ) ) otherlv_3= ')' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3237:3: otherlv_0= 'restcall' otherlv_1= '(' ( (lv_parameters_2_0= ruleSetRestCallReceiverParameters ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleSetRestCallReceiver7426); 

                	newLeafNode(otherlv_0, grammarAccess.getSetRestCallReceiverAccess().getRestcallKeyword_0());
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleSetRestCallReceiver7438); 

                	newLeafNode(otherlv_1, grammarAccess.getSetRestCallReceiverAccess().getLeftParenthesisKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3245:1: ( (lv_parameters_2_0= ruleSetRestCallReceiverParameters ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3246:1: (lv_parameters_2_0= ruleSetRestCallReceiverParameters )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3246:1: (lv_parameters_2_0= ruleSetRestCallReceiverParameters )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3247:3: lv_parameters_2_0= ruleSetRestCallReceiverParameters
            {
             
            	        newCompositeNode(grammarAccess.getSetRestCallReceiverAccess().getParametersSetRestCallReceiverParametersParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSetRestCallReceiverParameters_in_ruleSetRestCallReceiver7459);
            lv_parameters_2_0=ruleSetRestCallReceiverParameters();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetRestCallReceiverRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"SetRestCallReceiverParameters");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleSetRestCallReceiver7471); 

                	newLeafNode(otherlv_3, grammarAccess.getSetRestCallReceiverAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSetRestCallReceiver"


    // $ANTLR start "entryRuleSetUIElementReceiver"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3275:1: entryRuleSetUIElementReceiver returns [EObject current=null] : iv_ruleSetUIElementReceiver= ruleSetUIElementReceiver EOF ;
    public final EObject entryRuleSetUIElementReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetUIElementReceiver = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3276:2: (iv_ruleSetUIElementReceiver= ruleSetUIElementReceiver EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3277:2: iv_ruleSetUIElementReceiver= ruleSetUIElementReceiver EOF
            {
             newCompositeNode(grammarAccess.getSetUIElementReceiverRule()); 
            pushFollow(FOLLOW_ruleSetUIElementReceiver_in_entryRuleSetUIElementReceiver7507);
            iv_ruleSetUIElementReceiver=ruleSetUIElementReceiver();

            state._fsp--;

             current =iv_ruleSetUIElementReceiver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetUIElementReceiver7517); 

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
    // $ANTLR end "entryRuleSetUIElementReceiver"


    // $ANTLR start "ruleSetUIElementReceiver"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3284:1: ruleSetUIElementReceiver returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_uiKey_2_0= ruleUIElementReceiverKey ) ) ) ;
    public final EObject ruleSetUIElementReceiver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_uiKey_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3287:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_uiKey_2_0= ruleUIElementReceiverKey ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3288:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_uiKey_2_0= ruleUIElementReceiverKey ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3288:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_uiKey_2_0= ruleUIElementReceiverKey ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3288:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_uiKey_2_0= ruleUIElementReceiverKey ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3288:2: ( (otherlv_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3289:1: (otherlv_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3289:1: (otherlv_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3290:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetUIElementReceiverRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetUIElementReceiver7562); 

            		newLeafNode(otherlv_0, grammarAccess.getSetUIElementReceiverAccess().getWidgetNameViewElementCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSetUIElementReceiver7574); 

                	newLeafNode(otherlv_1, grammarAccess.getSetUIElementReceiverAccess().getFullStopKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3305:1: ( (lv_uiKey_2_0= ruleUIElementReceiverKey ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3306:1: (lv_uiKey_2_0= ruleUIElementReceiverKey )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3306:1: (lv_uiKey_2_0= ruleUIElementReceiverKey )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3307:3: lv_uiKey_2_0= ruleUIElementReceiverKey
            {
             
            	        newCompositeNode(grammarAccess.getSetUIElementReceiverAccess().getUiKeyUIElementReceiverKeyEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUIElementReceiverKey_in_ruleSetUIElementReceiver7595);
            lv_uiKey_2_0=ruleUIElementReceiverKey();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetUIElementReceiverRule());
            	        }
                   		set(
                   			current, 
                   			"uiKey",
                    		lv_uiKey_2_0, 
                    		"UIElementReceiverKey");
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
    // $ANTLR end "ruleSetUIElementReceiver"


    // $ANTLR start "entryRuleSetActionReceiver"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3331:1: entryRuleSetActionReceiver returns [EObject current=null] : iv_ruleSetActionReceiver= ruleSetActionReceiver EOF ;
    public final EObject entryRuleSetActionReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetActionReceiver = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3332:2: (iv_ruleSetActionReceiver= ruleSetActionReceiver EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3333:2: iv_ruleSetActionReceiver= ruleSetActionReceiver EOF
            {
             newCompositeNode(grammarAccess.getSetActionReceiverRule()); 
            pushFollow(FOLLOW_ruleSetActionReceiver_in_entryRuleSetActionReceiver7631);
            iv_ruleSetActionReceiver=ruleSetActionReceiver();

            state._fsp--;

             current =iv_ruleSetActionReceiver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetActionReceiver7641); 

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
    // $ANTLR end "entryRuleSetActionReceiver"


    // $ANTLR start "ruleSetActionReceiver"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3340:1: ruleSetActionReceiver returns [EObject current=null] : (this_SetRestCallReceiver_0= ruleSetRestCallReceiver | this_SetUIElementReceiver_1= ruleSetUIElementReceiver ) ;
    public final EObject ruleSetActionReceiver() throws RecognitionException {
        EObject current = null;

        EObject this_SetRestCallReceiver_0 = null;

        EObject this_SetUIElementReceiver_1 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3343:28: ( (this_SetRestCallReceiver_0= ruleSetRestCallReceiver | this_SetUIElementReceiver_1= ruleSetUIElementReceiver ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3344:1: (this_SetRestCallReceiver_0= ruleSetRestCallReceiver | this_SetUIElementReceiver_1= ruleSetUIElementReceiver )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3344:1: (this_SetRestCallReceiver_0= ruleSetRestCallReceiver | this_SetUIElementReceiver_1= ruleSetUIElementReceiver )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==66) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3345:5: this_SetRestCallReceiver_0= ruleSetRestCallReceiver
                    {
                     
                            newCompositeNode(grammarAccess.getSetActionReceiverAccess().getSetRestCallReceiverParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSetRestCallReceiver_in_ruleSetActionReceiver7688);
                    this_SetRestCallReceiver_0=ruleSetRestCallReceiver();

                    state._fsp--;

                     
                            current = this_SetRestCallReceiver_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3355:5: this_SetUIElementReceiver_1= ruleSetUIElementReceiver
                    {
                     
                            newCompositeNode(grammarAccess.getSetActionReceiverAccess().getSetUIElementReceiverParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSetUIElementReceiver_in_ruleSetActionReceiver7715);
                    this_SetUIElementReceiver_1=ruleSetUIElementReceiver();

                    state._fsp--;

                     
                            current = this_SetUIElementReceiver_1; 
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
    // $ANTLR end "ruleSetActionReceiver"


    // $ANTLR start "entryRuleSetAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3371:1: entryRuleSetAction returns [EObject current=null] : iv_ruleSetAction= ruleSetAction EOF ;
    public final EObject entryRuleSetAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAction = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3372:2: (iv_ruleSetAction= ruleSetAction EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3373:2: iv_ruleSetAction= ruleSetAction EOF
            {
             newCompositeNode(grammarAccess.getSetActionRule()); 
            pushFollow(FOLLOW_ruleSetAction_in_entryRuleSetAction7750);
            iv_ruleSetAction=ruleSetAction();

            state._fsp--;

             current =iv_ruleSetAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetAction7760); 

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
    // $ANTLR end "entryRuleSetAction"


    // $ANTLR start "ruleSetAction"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3380:1: ruleSetAction returns [EObject current=null] : (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_setActionReceiver_3_0= ruleSetActionReceiver ) ) ) ;
    public final EObject ruleSetAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_setActionReceiver_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3383:28: ( (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_setActionReceiver_3_0= ruleSetActionReceiver ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3384:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_setActionReceiver_3_0= ruleSetActionReceiver ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3384:1: (otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_setActionReceiver_3_0= ruleSetActionReceiver ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3384:3: otherlv_0= 'set' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (lv_setActionReceiver_3_0= ruleSetActionReceiver ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleSetAction7797); 

                	newLeafNode(otherlv_0, grammarAccess.getSetActionAccess().getSetKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3388:1: ( (otherlv_1= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3389:1: (otherlv_1= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3389:1: (otherlv_1= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3390:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSetActionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSetAction7817); 

            		newLeafNode(otherlv_1, grammarAccess.getSetActionAccess().getModelFeatureNameModelFeatureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleSetAction7829); 

                	newLeafNode(otherlv_2, grammarAccess.getSetActionAccess().getToKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3405:1: ( (lv_setActionReceiver_3_0= ruleSetActionReceiver ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3406:1: (lv_setActionReceiver_3_0= ruleSetActionReceiver )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3406:1: (lv_setActionReceiver_3_0= ruleSetActionReceiver )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3407:3: lv_setActionReceiver_3_0= ruleSetActionReceiver
            {
             
            	        newCompositeNode(grammarAccess.getSetActionAccess().getSetActionReceiverSetActionReceiverParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSetActionReceiver_in_ruleSetAction7850);
            lv_setActionReceiver_3_0=ruleSetActionReceiver();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetActionRule());
            	        }
                   		set(
                   			current, 
                   			"setActionReceiver",
                    		lv_setActionReceiver_3_0, 
                    		"SetActionReceiver");
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
    // $ANTLR end "ruleSetAction"


    // $ANTLR start "entryRuleInterfaceMethodCallParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3431:1: entryRuleInterfaceMethodCallParameter returns [EObject current=null] : iv_ruleInterfaceMethodCallParameter= ruleInterfaceMethodCallParameter EOF ;
    public final EObject entryRuleInterfaceMethodCallParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceMethodCallParameter = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3432:2: (iv_ruleInterfaceMethodCallParameter= ruleInterfaceMethodCallParameter EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3433:2: iv_ruleInterfaceMethodCallParameter= ruleInterfaceMethodCallParameter EOF
            {
             newCompositeNode(grammarAccess.getInterfaceMethodCallParameterRule()); 
            pushFollow(FOLLOW_ruleInterfaceMethodCallParameter_in_entryRuleInterfaceMethodCallParameter7886);
            iv_ruleInterfaceMethodCallParameter=ruleInterfaceMethodCallParameter();

            state._fsp--;

             current =iv_ruleInterfaceMethodCallParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceMethodCallParameter7896); 

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
    // $ANTLR end "entryRuleInterfaceMethodCallParameter"


    // $ANTLR start "ruleInterfaceMethodCallParameter"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3440:1: ruleInterfaceMethodCallParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleInterfaceMethodCallParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_parameterType_2_1=null;
        Token lv_parameterType_2_2=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3443:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3444:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3444:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3444:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3444:2: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3445:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3445:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3446:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceMethodCallParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInterfaceMethodCallParameterAccess().getParameterNameMethodParameterCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceMethodCallParameter7944);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleInterfaceMethodCallParameter7956); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceMethodCallParameterAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3463:1: ( ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3464:1: ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3464:1: ( (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3465:1: (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3465:1: (lv_parameterType_2_1= RULE_ID | lv_parameterType_2_2= RULE_STRING )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_STRING) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3466:3: lv_parameterType_2_1= RULE_ID
                    {
                    lv_parameterType_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceMethodCallParameter7975); 

                    			newLeafNode(lv_parameterType_2_1, grammarAccess.getInterfaceMethodCallParameterAccess().getParameterTypeIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceMethodCallParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parameterType",
                            		lv_parameterType_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3481:8: lv_parameterType_2_2= RULE_STRING
                    {
                    lv_parameterType_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterfaceMethodCallParameter7995); 

                    			newLeafNode(lv_parameterType_2_2, grammarAccess.getInterfaceMethodCallParameterAccess().getParameterTypeSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceMethodCallParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parameterType",
                            		lv_parameterType_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleInterfaceMethodCallParameter"


    // $ANTLR start "entryRuleInterfaceMethodCallParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3507:1: entryRuleInterfaceMethodCallParameters returns [EObject current=null] : iv_ruleInterfaceMethodCallParameters= ruleInterfaceMethodCallParameters EOF ;
    public final EObject entryRuleInterfaceMethodCallParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceMethodCallParameters = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3508:2: (iv_ruleInterfaceMethodCallParameters= ruleInterfaceMethodCallParameters EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3509:2: iv_ruleInterfaceMethodCallParameters= ruleInterfaceMethodCallParameters EOF
            {
             newCompositeNode(grammarAccess.getInterfaceMethodCallParametersRule()); 
            pushFollow(FOLLOW_ruleInterfaceMethodCallParameters_in_entryRuleInterfaceMethodCallParameters8039);
            iv_ruleInterfaceMethodCallParameters=ruleInterfaceMethodCallParameters();

            state._fsp--;

             current =iv_ruleInterfaceMethodCallParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceMethodCallParameters8049); 

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
    // $ANTLR end "entryRuleInterfaceMethodCallParameters"


    // $ANTLR start "ruleInterfaceMethodCallParameters"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3516:1: ruleInterfaceMethodCallParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleInterfaceMethodCallParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) ) )* ) ;
    public final EObject ruleInterfaceMethodCallParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3519:28: ( ( ( (lv_parameters_0_0= ruleInterfaceMethodCallParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) ) )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3520:1: ( ( (lv_parameters_0_0= ruleInterfaceMethodCallParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) ) )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3520:1: ( ( (lv_parameters_0_0= ruleInterfaceMethodCallParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3520:2: ( (lv_parameters_0_0= ruleInterfaceMethodCallParameter ) ) (otherlv_1= ', ' ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3520:2: ( (lv_parameters_0_0= ruleInterfaceMethodCallParameter ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3521:1: (lv_parameters_0_0= ruleInterfaceMethodCallParameter )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3521:1: (lv_parameters_0_0= ruleInterfaceMethodCallParameter )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3522:3: lv_parameters_0_0= ruleInterfaceMethodCallParameter
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceMethodCallParametersAccess().getParametersInterfaceMethodCallParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceMethodCallParameter_in_ruleInterfaceMethodCallParameters8095);
            lv_parameters_0_0=ruleInterfaceMethodCallParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceMethodCallParametersRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"InterfaceMethodCallParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3538:2: (otherlv_1= ', ' ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==33) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3538:4: otherlv_1= ', ' ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleInterfaceMethodCallParameters8108); 

            	        	newLeafNode(otherlv_1, grammarAccess.getInterfaceMethodCallParametersAccess().getCommaSpaceKeyword_1_0());
            	        
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3542:1: ( (lv_parameters_2_0= ruleInterfaceMethodCallParameter ) )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3543:1: (lv_parameters_2_0= ruleInterfaceMethodCallParameter )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3543:1: (lv_parameters_2_0= ruleInterfaceMethodCallParameter )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3544:3: lv_parameters_2_0= ruleInterfaceMethodCallParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceMethodCallParametersAccess().getParametersInterfaceMethodCallParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaceMethodCallParameter_in_ruleInterfaceMethodCallParameters8129);
            	    lv_parameters_2_0=ruleInterfaceMethodCallParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceMethodCallParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"InterfaceMethodCallParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleInterfaceMethodCallParameters"


    // $ANTLR start "entryRuleInterfaceMethodCall"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3568:1: entryRuleInterfaceMethodCall returns [EObject current=null] : iv_ruleInterfaceMethodCall= ruleInterfaceMethodCall EOF ;
    public final EObject entryRuleInterfaceMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceMethodCall = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3569:2: (iv_ruleInterfaceMethodCall= ruleInterfaceMethodCall EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3570:2: iv_ruleInterfaceMethodCall= ruleInterfaceMethodCall EOF
            {
             newCompositeNode(grammarAccess.getInterfaceMethodCallRule()); 
            pushFollow(FOLLOW_ruleInterfaceMethodCall_in_entryRuleInterfaceMethodCall8167);
            iv_ruleInterfaceMethodCall=ruleInterfaceMethodCall();

            state._fsp--;

             current =iv_ruleInterfaceMethodCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceMethodCall8177); 

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
    // $ANTLR end "entryRuleInterfaceMethodCall"


    // $ANTLR start "ruleInterfaceMethodCall"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3577:1: ruleInterfaceMethodCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleInterfaceMethodCallParameters ) ) otherlv_5= ')' ) ;
    public final EObject ruleInterfaceMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3580:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleInterfaceMethodCallParameters ) ) otherlv_5= ')' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3581:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleInterfaceMethodCallParameters ) ) otherlv_5= ')' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3581:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleInterfaceMethodCallParameters ) ) otherlv_5= ')' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3581:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleInterfaceMethodCallParameters ) ) otherlv_5= ')'
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3581:2: ( (otherlv_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3582:1: (otherlv_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3582:1: (otherlv_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3583:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceMethodCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceMethodCall8222); 

            		newLeafNode(otherlv_0, grammarAccess.getInterfaceMethodCallAccess().getInterfaceInstanceNameBusinessFeatureCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleInterfaceMethodCall8234); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceMethodCallAccess().getFullStopKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3598:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3599:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3599:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3600:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceMethodCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInterfaceMethodCallAccess().getMethodNameMethodCallCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceMethodCall8257);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleInterfaceMethodCall8269); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceMethodCallAccess().getLeftParenthesisKeyword_3());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3617:1: ( (lv_parameters_4_0= ruleInterfaceMethodCallParameters ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3618:1: (lv_parameters_4_0= ruleInterfaceMethodCallParameters )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3618:1: (lv_parameters_4_0= ruleInterfaceMethodCallParameters )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3619:3: lv_parameters_4_0= ruleInterfaceMethodCallParameters
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceMethodCallAccess().getParametersInterfaceMethodCallParametersParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceMethodCallParameters_in_ruleInterfaceMethodCall8290);
            lv_parameters_4_0=ruleInterfaceMethodCallParameters();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceMethodCallRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_4_0, 
                    		"InterfaceMethodCallParameters");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleInterfaceMethodCall8302); 

                	newLeafNode(otherlv_5, grammarAccess.getInterfaceMethodCallAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleInterfaceMethodCall"


    // $ANTLR start "entryRuleUIActionFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3647:1: entryRuleUIActionFeature returns [EObject current=null] : iv_ruleUIActionFeature= ruleUIActionFeature EOF ;
    public final EObject entryRuleUIActionFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3648:2: (iv_ruleUIActionFeature= ruleUIActionFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3649:2: iv_ruleUIActionFeature= ruleUIActionFeature EOF
            {
             newCompositeNode(grammarAccess.getUIActionFeatureRule()); 
            pushFollow(FOLLOW_ruleUIActionFeature_in_entryRuleUIActionFeature8338);
            iv_ruleUIActionFeature=ruleUIActionFeature();

            state._fsp--;

             current =iv_ruleUIActionFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionFeature8348); 

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
    // $ANTLR end "entryRuleUIActionFeature"


    // $ANTLR start "ruleUIActionFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3656:1: ruleUIActionFeature returns [EObject current=null] : (this_NavigateToAction_0= ruleNavigateToAction | this_ExecuteAction_1= ruleExecuteAction | this_SetAction_2= ruleSetAction | this_InterfaceMethodCall_3= ruleInterfaceMethodCall ) ;
    public final EObject ruleUIActionFeature() throws RecognitionException {
        EObject current = null;

        EObject this_NavigateToAction_0 = null;

        EObject this_ExecuteAction_1 = null;

        EObject this_SetAction_2 = null;

        EObject this_InterfaceMethodCall_3 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3659:28: ( (this_NavigateToAction_0= ruleNavigateToAction | this_ExecuteAction_1= ruleExecuteAction | this_SetAction_2= ruleSetAction | this_InterfaceMethodCall_3= ruleInterfaceMethodCall ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3660:1: (this_NavigateToAction_0= ruleNavigateToAction | this_ExecuteAction_1= ruleExecuteAction | this_SetAction_2= ruleSetAction | this_InterfaceMethodCall_3= ruleInterfaceMethodCall )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3660:1: (this_NavigateToAction_0= ruleNavigateToAction | this_ExecuteAction_1= ruleExecuteAction | this_SetAction_2= ruleSetAction | this_InterfaceMethodCall_3= ruleInterfaceMethodCall )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt51=1;
                }
                break;
            case 61:
                {
                alt51=2;
                }
                break;
            case 67:
                {
                alt51=3;
                }
                break;
            case RULE_ID:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3661:5: this_NavigateToAction_0= ruleNavigateToAction
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionFeatureAccess().getNavigateToActionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNavigateToAction_in_ruleUIActionFeature8395);
                    this_NavigateToAction_0=ruleNavigateToAction();

                    state._fsp--;

                     
                            current = this_NavigateToAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3671:5: this_ExecuteAction_1= ruleExecuteAction
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionFeatureAccess().getExecuteActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExecuteAction_in_ruleUIActionFeature8422);
                    this_ExecuteAction_1=ruleExecuteAction();

                    state._fsp--;

                     
                            current = this_ExecuteAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3681:5: this_SetAction_2= ruleSetAction
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionFeatureAccess().getSetActionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSetAction_in_ruleUIActionFeature8449);
                    this_SetAction_2=ruleSetAction();

                    state._fsp--;

                     
                            current = this_SetAction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3691:5: this_InterfaceMethodCall_3= ruleInterfaceMethodCall
                    {
                     
                            newCompositeNode(grammarAccess.getUIActionFeatureAccess().getInterfaceMethodCallParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInterfaceMethodCall_in_ruleUIActionFeature8476);
                    this_InterfaceMethodCall_3=ruleInterfaceMethodCall();

                    state._fsp--;

                     
                            current = this_InterfaceMethodCall_3; 
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
    // $ANTLR end "ruleUIActionFeature"


    // $ANTLR start "entryRuleUIActionModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3707:1: entryRuleUIActionModule returns [EObject current=null] : iv_ruleUIActionModule= ruleUIActionModule EOF ;
    public final EObject entryRuleUIActionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIActionModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3708:2: (iv_ruleUIActionModule= ruleUIActionModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3709:2: iv_ruleUIActionModule= ruleUIActionModule EOF
            {
             newCompositeNode(grammarAccess.getUIActionModuleRule()); 
            pushFollow(FOLLOW_ruleUIActionModule_in_entryRuleUIActionModule8511);
            iv_ruleUIActionModule=ruleUIActionModule();

            state._fsp--;

             current =iv_ruleUIActionModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIActionModule8521); 

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
    // $ANTLR end "entryRuleUIActionModule"


    // $ANTLR start "ruleUIActionModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3716:1: ruleUIActionModule returns [EObject current=null] : (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiActionFeatures_3_0= ruleUIActionFeature ) ) ( (lv_uiActionFeatures_4_0= ruleUIActionFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleUIActionModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_uiActionFeatures_3_0 = null;

        EObject lv_uiActionFeatures_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3719:28: ( (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiActionFeatures_3_0= ruleUIActionFeature ) ) ( (lv_uiActionFeatures_4_0= ruleUIActionFeature ) )* otherlv_5= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3720:1: (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiActionFeatures_3_0= ruleUIActionFeature ) ) ( (lv_uiActionFeatures_4_0= ruleUIActionFeature ) )* otherlv_5= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3720:1: (otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiActionFeatures_3_0= ruleUIActionFeature ) ) ( (lv_uiActionFeatures_4_0= ruleUIActionFeature ) )* otherlv_5= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3720:3: otherlv_0= 'uiaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiActionFeatures_3_0= ruleUIActionFeature ) ) ( (lv_uiActionFeatures_4_0= ruleUIActionFeature ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleUIActionModule8558); 

                	newLeafNode(otherlv_0, grammarAccess.getUIActionModuleAccess().getUiactionKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3724:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3725:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3725:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3726:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUIActionModule8575); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUIActionModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUIActionModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleUIActionModule8592); 

                	newLeafNode(otherlv_2, grammarAccess.getUIActionModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3746:1: ( (lv_uiActionFeatures_3_0= ruleUIActionFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3747:1: (lv_uiActionFeatures_3_0= ruleUIActionFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3747:1: (lv_uiActionFeatures_3_0= ruleUIActionFeature )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3748:3: lv_uiActionFeatures_3_0= ruleUIActionFeature
            {
             
            	        newCompositeNode(grammarAccess.getUIActionModuleAccess().getUiActionFeaturesUIActionFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUIActionFeature_in_ruleUIActionModule8613);
            lv_uiActionFeatures_3_0=ruleUIActionFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIActionModuleRule());
            	        }
                   		add(
                   			current, 
                   			"uiActionFeatures",
                    		lv_uiActionFeatures_3_0, 
                    		"UIActionFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3764:2: ( (lv_uiActionFeatures_4_0= ruleUIActionFeature ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID||(LA52_0>=60 && LA52_0<=61)||LA52_0==67) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3765:1: (lv_uiActionFeatures_4_0= ruleUIActionFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3765:1: (lv_uiActionFeatures_4_0= ruleUIActionFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3766:3: lv_uiActionFeatures_4_0= ruleUIActionFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIActionModuleAccess().getUiActionFeaturesUIActionFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIActionFeature_in_ruleUIActionModule8634);
            	    lv_uiActionFeatures_4_0=ruleUIActionFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIActionModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uiActionFeatures",
            	            		lv_uiActionFeatures_4_0, 
            	            		"UIActionFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleUIActionModule8647); 

                	newLeafNode(otherlv_5, grammarAccess.getUIActionModuleAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleUIActionModule"


    // $ANTLR start "entryRuleControllerElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3794:1: entryRuleControllerElement returns [EObject current=null] : iv_ruleControllerElement= ruleControllerElement EOF ;
    public final EObject entryRuleControllerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerElement = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3795:2: (iv_ruleControllerElement= ruleControllerElement EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3796:2: iv_ruleControllerElement= ruleControllerElement EOF
            {
             newCompositeNode(grammarAccess.getControllerElementRule()); 
            pushFollow(FOLLOW_ruleControllerElement_in_entryRuleControllerElement8683);
            iv_ruleControllerElement=ruleControllerElement();

            state._fsp--;

             current =iv_ruleControllerElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControllerElement8693); 

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
    // $ANTLR end "entryRuleControllerElement"


    // $ANTLR start "ruleControllerElement"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3803:1: ruleControllerElement returns [EObject current=null] : (this_UIActionModule_0= ruleUIActionModule | this_InitActionModule_1= ruleInitActionModule | this_ValidatorModule_2= ruleValidatorModule ) ;
    public final EObject ruleControllerElement() throws RecognitionException {
        EObject current = null;

        EObject this_UIActionModule_0 = null;

        EObject this_InitActionModule_1 = null;

        EObject this_ValidatorModule_2 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3806:28: ( (this_UIActionModule_0= ruleUIActionModule | this_InitActionModule_1= ruleInitActionModule | this_ValidatorModule_2= ruleValidatorModule ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3807:1: (this_UIActionModule_0= ruleUIActionModule | this_InitActionModule_1= ruleInitActionModule | this_ValidatorModule_2= ruleValidatorModule )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3807:1: (this_UIActionModule_0= ruleUIActionModule | this_InitActionModule_1= ruleInitActionModule | this_ValidatorModule_2= ruleValidatorModule )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt53=1;
                }
                break;
            case 56:
                {
                alt53=2;
                }
                break;
            case 59:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3808:5: this_UIActionModule_0= ruleUIActionModule
                    {
                     
                            newCompositeNode(grammarAccess.getControllerElementAccess().getUIActionModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUIActionModule_in_ruleControllerElement8740);
                    this_UIActionModule_0=ruleUIActionModule();

                    state._fsp--;

                     
                            current = this_UIActionModule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3818:5: this_InitActionModule_1= ruleInitActionModule
                    {
                     
                            newCompositeNode(grammarAccess.getControllerElementAccess().getInitActionModuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInitActionModule_in_ruleControllerElement8767);
                    this_InitActionModule_1=ruleInitActionModule();

                    state._fsp--;

                     
                            current = this_InitActionModule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3828:5: this_ValidatorModule_2= ruleValidatorModule
                    {
                     
                            newCompositeNode(grammarAccess.getControllerElementAccess().getValidatorModuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleValidatorModule_in_ruleControllerElement8794);
                    this_ValidatorModule_2=ruleValidatorModule();

                    state._fsp--;

                     
                            current = this_ValidatorModule_2; 
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
    // $ANTLR end "ruleControllerElement"


    // $ANTLR start "entryRuleControllerModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3844:1: entryRuleControllerModule returns [EObject current=null] : iv_ruleControllerModule= ruleControllerModule EOF ;
    public final EObject entryRuleControllerModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControllerModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3845:2: (iv_ruleControllerModule= ruleControllerModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3846:2: iv_ruleControllerModule= ruleControllerModule EOF
            {
             newCompositeNode(grammarAccess.getControllerModuleRule()); 
            pushFollow(FOLLOW_ruleControllerModule_in_entryRuleControllerModule8829);
            iv_ruleControllerModule=ruleControllerModule();

            state._fsp--;

             current =iv_ruleControllerModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControllerModule8839); 

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
    // $ANTLR end "entryRuleControllerModule"


    // $ANTLR start "ruleControllerModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3853:1: ruleControllerModule returns [EObject current=null] : (otherlv_0= 'controller' otherlv_1= '{' ( (lv_elements_2_0= ruleControllerElement ) ) ( (lv_elements_3_0= ruleControllerElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleControllerModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3856:28: ( (otherlv_0= 'controller' otherlv_1= '{' ( (lv_elements_2_0= ruleControllerElement ) ) ( (lv_elements_3_0= ruleControllerElement ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3857:1: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_elements_2_0= ruleControllerElement ) ) ( (lv_elements_3_0= ruleControllerElement ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3857:1: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_elements_2_0= ruleControllerElement ) ) ( (lv_elements_3_0= ruleControllerElement ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3857:3: otherlv_0= 'controller' otherlv_1= '{' ( (lv_elements_2_0= ruleControllerElement ) ) ( (lv_elements_3_0= ruleControllerElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleControllerModule8876); 

                	newLeafNode(otherlv_0, grammarAccess.getControllerModuleAccess().getControllerKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleControllerModule8888); 

                	newLeafNode(otherlv_1, grammarAccess.getControllerModuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3865:1: ( (lv_elements_2_0= ruleControllerElement ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3866:1: (lv_elements_2_0= ruleControllerElement )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3866:1: (lv_elements_2_0= ruleControllerElement )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3867:3: lv_elements_2_0= ruleControllerElement
            {
             
            	        newCompositeNode(grammarAccess.getControllerModuleAccess().getElementsControllerElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleControllerElement_in_ruleControllerModule8909);
            lv_elements_2_0=ruleControllerElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControllerModuleRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"ControllerElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3883:2: ( (lv_elements_3_0= ruleControllerElement ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==56||LA54_0==59||LA54_0==68) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3884:1: (lv_elements_3_0= ruleControllerElement )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3884:1: (lv_elements_3_0= ruleControllerElement )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3885:3: lv_elements_3_0= ruleControllerElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getControllerModuleAccess().getElementsControllerElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleControllerElement_in_ruleControllerModule8930);
            	    lv_elements_3_0=ruleControllerElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getControllerModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"ControllerElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleControllerModule8943); 

                	newLeafNode(otherlv_4, grammarAccess.getControllerModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleControllerModule"


    // $ANTLR start "entryRuleScreenModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3913:1: entryRuleScreenModule returns [EObject current=null] : iv_ruleScreenModule= ruleScreenModule EOF ;
    public final EObject entryRuleScreenModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3914:2: (iv_ruleScreenModule= ruleScreenModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3915:2: iv_ruleScreenModule= ruleScreenModule EOF
            {
             newCompositeNode(grammarAccess.getScreenModuleRule()); 
            pushFollow(FOLLOW_ruleScreenModule_in_entryRuleScreenModule8979);
            iv_ruleScreenModule=ruleScreenModule();

            state._fsp--;

             current =iv_ruleScreenModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenModule8989); 

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
    // $ANTLR end "entryRuleScreenModule"


    // $ANTLR start "ruleScreenModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3922:1: ruleScreenModule returns [EObject current=null] : (this_EntryParametersModule_0= ruleEntryParametersModule | this_ModelModule_1= ruleModelModule | this_ViewModule_2= ruleViewModule | this_ControllerModule_3= ruleControllerModule ) ;
    public final EObject ruleScreenModule() throws RecognitionException {
        EObject current = null;

        EObject this_EntryParametersModule_0 = null;

        EObject this_ModelModule_1 = null;

        EObject this_ViewModule_2 = null;

        EObject this_ControllerModule_3 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3925:28: ( (this_EntryParametersModule_0= ruleEntryParametersModule | this_ModelModule_1= ruleModelModule | this_ViewModule_2= ruleViewModule | this_ControllerModule_3= ruleControllerModule ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3926:1: (this_EntryParametersModule_0= ruleEntryParametersModule | this_ModelModule_1= ruleModelModule | this_ViewModule_2= ruleViewModule | this_ControllerModule_3= ruleControllerModule )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3926:1: (this_EntryParametersModule_0= ruleEntryParametersModule | this_ModelModule_1= ruleModelModule | this_ViewModule_2= ruleViewModule | this_ControllerModule_3= ruleControllerModule )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt55=1;
                }
                break;
            case 47:
                {
                alt55=2;
                }
                break;
            case 48:
                {
                alt55=3;
                }
                break;
            case 69:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3927:5: this_EntryParametersModule_0= ruleEntryParametersModule
                    {
                     
                            newCompositeNode(grammarAccess.getScreenModuleAccess().getEntryParametersModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntryParametersModule_in_ruleScreenModule9036);
                    this_EntryParametersModule_0=ruleEntryParametersModule();

                    state._fsp--;

                     
                            current = this_EntryParametersModule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3937:5: this_ModelModule_1= ruleModelModule
                    {
                     
                            newCompositeNode(grammarAccess.getScreenModuleAccess().getModelModuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModelModule_in_ruleScreenModule9063);
                    this_ModelModule_1=ruleModelModule();

                    state._fsp--;

                     
                            current = this_ModelModule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3947:5: this_ViewModule_2= ruleViewModule
                    {
                     
                            newCompositeNode(grammarAccess.getScreenModuleAccess().getViewModuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleViewModule_in_ruleScreenModule9090);
                    this_ViewModule_2=ruleViewModule();

                    state._fsp--;

                     
                            current = this_ViewModule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3957:5: this_ControllerModule_3= ruleControllerModule
                    {
                     
                            newCompositeNode(grammarAccess.getScreenModuleAccess().getControllerModuleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleControllerModule_in_ruleScreenModule9117);
                    this_ControllerModule_3=ruleControllerModule();

                    state._fsp--;

                     
                            current = this_ControllerModule_3; 
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
    // $ANTLR end "ruleScreenModule"


    // $ANTLR start "entryRuleScreenFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3973:1: entryRuleScreenFeature returns [EObject current=null] : iv_ruleScreenFeature= ruleScreenFeature EOF ;
    public final EObject entryRuleScreenFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreenFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3974:2: (iv_ruleScreenFeature= ruleScreenFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3975:2: iv_ruleScreenFeature= ruleScreenFeature EOF
            {
             newCompositeNode(grammarAccess.getScreenFeatureRule()); 
            pushFollow(FOLLOW_ruleScreenFeature_in_entryRuleScreenFeature9152);
            iv_ruleScreenFeature=ruleScreenFeature();

            state._fsp--;

             current =iv_ruleScreenFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScreenFeature9162); 

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
    // $ANTLR end "entryRuleScreenFeature"


    // $ANTLR start "ruleScreenFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3982:1: ruleScreenFeature returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screenModules_3_0= ruleScreenModule ) ) ( (lv_screenModules_4_0= ruleScreenModule ) )* otherlv_5= '}' ) ;
    public final EObject ruleScreenFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_screenModules_3_0 = null;

        EObject lv_screenModules_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3985:28: ( (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screenModules_3_0= ruleScreenModule ) ) ( (lv_screenModules_4_0= ruleScreenModule ) )* otherlv_5= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3986:1: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screenModules_3_0= ruleScreenModule ) ) ( (lv_screenModules_4_0= ruleScreenModule ) )* otherlv_5= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3986:1: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screenModules_3_0= ruleScreenModule ) ) ( (lv_screenModules_4_0= ruleScreenModule ) )* otherlv_5= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3986:3: otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_screenModules_3_0= ruleScreenModule ) ) ( (lv_screenModules_4_0= ruleScreenModule ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleScreenFeature9199); 

                	newLeafNode(otherlv_0, grammarAccess.getScreenFeatureAccess().getScreenKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3990:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3991:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3991:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3992:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScreenFeature9216); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScreenFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScreenFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleScreenFeature9233); 

                	newLeafNode(otherlv_2, grammarAccess.getScreenFeatureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4012:1: ( (lv_screenModules_3_0= ruleScreenModule ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4013:1: (lv_screenModules_3_0= ruleScreenModule )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4013:1: (lv_screenModules_3_0= ruleScreenModule )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4014:3: lv_screenModules_3_0= ruleScreenModule
            {
             
            	        newCompositeNode(grammarAccess.getScreenFeatureAccess().getScreenModulesScreenModuleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleScreenModule_in_ruleScreenFeature9254);
            lv_screenModules_3_0=ruleScreenModule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScreenFeatureRule());
            	        }
                   		add(
                   			current, 
                   			"screenModules",
                    		lv_screenModules_3_0, 
                    		"ScreenModule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4030:2: ( (lv_screenModules_4_0= ruleScreenModule ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==45||(LA56_0>=47 && LA56_0<=48)||LA56_0==69) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4031:1: (lv_screenModules_4_0= ruleScreenModule )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4031:1: (lv_screenModules_4_0= ruleScreenModule )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4032:3: lv_screenModules_4_0= ruleScreenModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreenFeatureAccess().getScreenModulesScreenModuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScreenModule_in_ruleScreenFeature9275);
            	    lv_screenModules_4_0=ruleScreenModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScreenFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"screenModules",
            	            		lv_screenModules_4_0, 
            	            		"ScreenModule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleScreenFeature9288); 

                	newLeafNode(otherlv_5, grammarAccess.getScreenFeatureAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleScreenFeature"


    // $ANTLR start "entryRuleMainFeatureOption"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4060:1: entryRuleMainFeatureOption returns [EObject current=null] : iv_ruleMainFeatureOption= ruleMainFeatureOption EOF ;
    public final EObject entryRuleMainFeatureOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFeatureOption = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4061:2: (iv_ruleMainFeatureOption= ruleMainFeatureOption EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4062:2: iv_ruleMainFeatureOption= ruleMainFeatureOption EOF
            {
             newCompositeNode(grammarAccess.getMainFeatureOptionRule()); 
            pushFollow(FOLLOW_ruleMainFeatureOption_in_entryRuleMainFeatureOption9324);
            iv_ruleMainFeatureOption=ruleMainFeatureOption();

            state._fsp--;

             current =iv_ruleMainFeatureOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainFeatureOption9334); 

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
    // $ANTLR end "entryRuleMainFeatureOption"


    // $ANTLR start "ruleMainFeatureOption"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4069:1: ruleMainFeatureOption returns [EObject current=null] : ( (otherlv_0= 'appName' | otherlv_1= 'appVersion' | otherlv_2= 'entryScreen' | otherlv_3= 'devices' | otherlv_4= 'style' ) otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleMainFeatureOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4072:28: ( ( (otherlv_0= 'appName' | otherlv_1= 'appVersion' | otherlv_2= 'entryScreen' | otherlv_3= 'devices' | otherlv_4= 'style' ) otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4073:1: ( (otherlv_0= 'appName' | otherlv_1= 'appVersion' | otherlv_2= 'entryScreen' | otherlv_3= 'devices' | otherlv_4= 'style' ) otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4073:1: ( (otherlv_0= 'appName' | otherlv_1= 'appVersion' | otherlv_2= 'entryScreen' | otherlv_3= 'devices' | otherlv_4= 'style' ) otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4073:2: (otherlv_0= 'appName' | otherlv_1= 'appVersion' | otherlv_2= 'entryScreen' | otherlv_3= 'devices' | otherlv_4= 'style' ) otherlv_5= ':' ( (lv_name_6_0= RULE_STRING ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4073:2: (otherlv_0= 'appName' | otherlv_1= 'appVersion' | otherlv_2= 'entryScreen' | otherlv_3= 'devices' | otherlv_4= 'style' )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt57=1;
                }
                break;
            case 72:
                {
                alt57=2;
                }
                break;
            case 73:
                {
                alt57=3;
                }
                break;
            case 74:
                {
                alt57=4;
                }
                break;
            case 75:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4073:4: otherlv_0= 'appName'
                    {
                    otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleMainFeatureOption9372); 

                        	newLeafNode(otherlv_0, grammarAccess.getMainFeatureOptionAccess().getAppNameKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4078:7: otherlv_1= 'appVersion'
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleMainFeatureOption9390); 

                        	newLeafNode(otherlv_1, grammarAccess.getMainFeatureOptionAccess().getAppVersionKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4083:7: otherlv_2= 'entryScreen'
                    {
                    otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleMainFeatureOption9408); 

                        	newLeafNode(otherlv_2, grammarAccess.getMainFeatureOptionAccess().getEntryScreenKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4088:7: otherlv_3= 'devices'
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleMainFeatureOption9426); 

                        	newLeafNode(otherlv_3, grammarAccess.getMainFeatureOptionAccess().getDevicesKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4093:7: otherlv_4= 'style'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleMainFeatureOption9444); 

                        	newLeafNode(otherlv_4, grammarAccess.getMainFeatureOptionAccess().getStyleKeyword_0_4());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleMainFeatureOption9457); 

                	newLeafNode(otherlv_5, grammarAccess.getMainFeatureOptionAccess().getColonKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4101:1: ( (lv_name_6_0= RULE_STRING ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4102:1: (lv_name_6_0= RULE_STRING )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4102:1: (lv_name_6_0= RULE_STRING )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4103:3: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMainFeatureOption9474); 

            			newLeafNode(lv_name_6_0, grammarAccess.getMainFeatureOptionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMainFeatureOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleMainFeatureOption"


    // $ANTLR start "entryRuleMainFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4127:1: entryRuleMainFeature returns [EObject current=null] : iv_ruleMainFeature= ruleMainFeature EOF ;
    public final EObject entryRuleMainFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4128:2: (iv_ruleMainFeature= ruleMainFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4129:2: iv_ruleMainFeature= ruleMainFeature EOF
            {
             newCompositeNode(grammarAccess.getMainFeatureRule()); 
            pushFollow(FOLLOW_ruleMainFeature_in_entryRuleMainFeature9515);
            iv_ruleMainFeature=ruleMainFeature();

            state._fsp--;

             current =iv_ruleMainFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainFeature9525); 

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
    // $ANTLR end "entryRuleMainFeature"


    // $ANTLR start "ruleMainFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4136:1: ruleMainFeature returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '(' ( (lv_features_2_0= ruleMainFeatureOption ) ) (otherlv_3= ', ' ( (lv_features_4_0= ruleMainFeatureOption ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleMainFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_2_0 = null;

        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4139:28: ( (otherlv_0= 'main' otherlv_1= '(' ( (lv_features_2_0= ruleMainFeatureOption ) ) (otherlv_3= ', ' ( (lv_features_4_0= ruleMainFeatureOption ) ) )* otherlv_5= ')' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4140:1: (otherlv_0= 'main' otherlv_1= '(' ( (lv_features_2_0= ruleMainFeatureOption ) ) (otherlv_3= ', ' ( (lv_features_4_0= ruleMainFeatureOption ) ) )* otherlv_5= ')' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4140:1: (otherlv_0= 'main' otherlv_1= '(' ( (lv_features_2_0= ruleMainFeatureOption ) ) (otherlv_3= ', ' ( (lv_features_4_0= ruleMainFeatureOption ) ) )* otherlv_5= ')' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4140:3: otherlv_0= 'main' otherlv_1= '(' ( (lv_features_2_0= ruleMainFeatureOption ) ) (otherlv_3= ', ' ( (lv_features_4_0= ruleMainFeatureOption ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleMainFeature9562); 

                	newLeafNode(otherlv_0, grammarAccess.getMainFeatureAccess().getMainKeyword_0());
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleMainFeature9574); 

                	newLeafNode(otherlv_1, grammarAccess.getMainFeatureAccess().getLeftParenthesisKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4148:1: ( (lv_features_2_0= ruleMainFeatureOption ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4149:1: (lv_features_2_0= ruleMainFeatureOption )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4149:1: (lv_features_2_0= ruleMainFeatureOption )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4150:3: lv_features_2_0= ruleMainFeatureOption
            {
             
            	        newCompositeNode(grammarAccess.getMainFeatureAccess().getFeaturesMainFeatureOptionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMainFeatureOption_in_ruleMainFeature9595);
            lv_features_2_0=ruleMainFeatureOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMainFeatureRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_2_0, 
                    		"MainFeatureOption");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4166:2: (otherlv_3= ', ' ( (lv_features_4_0= ruleMainFeatureOption ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==33) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4166:4: otherlv_3= ', ' ( (lv_features_4_0= ruleMainFeatureOption ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleMainFeature9608); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMainFeatureAccess().getCommaSpaceKeyword_3_0());
            	        
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4170:1: ( (lv_features_4_0= ruleMainFeatureOption ) )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4171:1: (lv_features_4_0= ruleMainFeatureOption )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4171:1: (lv_features_4_0= ruleMainFeatureOption )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4172:3: lv_features_4_0= ruleMainFeatureOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainFeatureAccess().getFeaturesMainFeatureOptionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMainFeatureOption_in_ruleMainFeature9629);
            	    lv_features_4_0=ruleMainFeatureOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_4_0, 
            	            		"MainFeatureOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleMainFeature9643); 

                	newLeafNode(otherlv_5, grammarAccess.getMainFeatureAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMainFeature"


    // $ANTLR start "entryRuleUIFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4200:1: entryRuleUIFeature returns [EObject current=null] : iv_ruleUIFeature= ruleUIFeature EOF ;
    public final EObject entryRuleUIFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4201:2: (iv_ruleUIFeature= ruleUIFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4202:2: iv_ruleUIFeature= ruleUIFeature EOF
            {
             newCompositeNode(grammarAccess.getUIFeatureRule()); 
            pushFollow(FOLLOW_ruleUIFeature_in_entryRuleUIFeature9679);
            iv_ruleUIFeature=ruleUIFeature();

            state._fsp--;

             current =iv_ruleUIFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIFeature9689); 

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
    // $ANTLR end "entryRuleUIFeature"


    // $ANTLR start "ruleUIFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4209:1: ruleUIFeature returns [EObject current=null] : (this_MainFeature_0= ruleMainFeature | this_ScreenFeature_1= ruleScreenFeature ) ;
    public final EObject ruleUIFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MainFeature_0 = null;

        EObject this_ScreenFeature_1 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4212:28: ( (this_MainFeature_0= ruleMainFeature | this_ScreenFeature_1= ruleScreenFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4213:1: (this_MainFeature_0= ruleMainFeature | this_ScreenFeature_1= ruleScreenFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4213:1: (this_MainFeature_0= ruleMainFeature | this_ScreenFeature_1= ruleScreenFeature )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==76) ) {
                alt59=1;
            }
            else if ( (LA59_0==70) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4214:5: this_MainFeature_0= ruleMainFeature
                    {
                     
                            newCompositeNode(grammarAccess.getUIFeatureAccess().getMainFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMainFeature_in_ruleUIFeature9736);
                    this_MainFeature_0=ruleMainFeature();

                    state._fsp--;

                     
                            current = this_MainFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4224:5: this_ScreenFeature_1= ruleScreenFeature
                    {
                     
                            newCompositeNode(grammarAccess.getUIFeatureAccess().getScreenFeatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleScreenFeature_in_ruleUIFeature9763);
                    this_ScreenFeature_1=ruleScreenFeature();

                    state._fsp--;

                     
                            current = this_ScreenFeature_1; 
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
    // $ANTLR end "ruleUIFeature"


    // $ANTLR start "entryRuleUIModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4240:1: entryRuleUIModule returns [EObject current=null] : iv_ruleUIModule= ruleUIModule EOF ;
    public final EObject entryRuleUIModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4241:2: (iv_ruleUIModule= ruleUIModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4242:2: iv_ruleUIModule= ruleUIModule EOF
            {
             newCompositeNode(grammarAccess.getUIModuleRule()); 
            pushFollow(FOLLOW_ruleUIModule_in_entryRuleUIModule9798);
            iv_ruleUIModule=ruleUIModule();

            state._fsp--;

             current =iv_ruleUIModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModule9808); 

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
    // $ANTLR end "entryRuleUIModule"


    // $ANTLR start "ruleUIModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4249:1: ruleUIModule returns [EObject current=null] : (otherlv_0= 'uiSystem' otherlv_1= '{' ( (lv_uiFeatures_2_0= ruleUIFeature ) ) ( (lv_uiFeatures_3_0= ruleUIFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleUIModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_uiFeatures_2_0 = null;

        EObject lv_uiFeatures_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4252:28: ( (otherlv_0= 'uiSystem' otherlv_1= '{' ( (lv_uiFeatures_2_0= ruleUIFeature ) ) ( (lv_uiFeatures_3_0= ruleUIFeature ) )* otherlv_4= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4253:1: (otherlv_0= 'uiSystem' otherlv_1= '{' ( (lv_uiFeatures_2_0= ruleUIFeature ) ) ( (lv_uiFeatures_3_0= ruleUIFeature ) )* otherlv_4= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4253:1: (otherlv_0= 'uiSystem' otherlv_1= '{' ( (lv_uiFeatures_2_0= ruleUIFeature ) ) ( (lv_uiFeatures_3_0= ruleUIFeature ) )* otherlv_4= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4253:3: otherlv_0= 'uiSystem' otherlv_1= '{' ( (lv_uiFeatures_2_0= ruleUIFeature ) ) ( (lv_uiFeatures_3_0= ruleUIFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleUIModule9845); 

                	newLeafNode(otherlv_0, grammarAccess.getUIModuleAccess().getUiSystemKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleUIModule9857); 

                	newLeafNode(otherlv_1, grammarAccess.getUIModuleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4261:1: ( (lv_uiFeatures_2_0= ruleUIFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4262:1: (lv_uiFeatures_2_0= ruleUIFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4262:1: (lv_uiFeatures_2_0= ruleUIFeature )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4263:3: lv_uiFeatures_2_0= ruleUIFeature
            {
             
            	        newCompositeNode(grammarAccess.getUIModuleAccess().getUiFeaturesUIFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUIFeature_in_ruleUIModule9878);
            lv_uiFeatures_2_0=ruleUIFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUIModuleRule());
            	        }
                   		add(
                   			current, 
                   			"uiFeatures",
                    		lv_uiFeatures_2_0, 
                    		"UIFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4279:2: ( (lv_uiFeatures_3_0= ruleUIFeature ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==70||LA60_0==76) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4280:1: (lv_uiFeatures_3_0= ruleUIFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4280:1: (lv_uiFeatures_3_0= ruleUIFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4281:3: lv_uiFeatures_3_0= ruleUIFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUIModuleAccess().getUiFeaturesUIFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIFeature_in_ruleUIModule9899);
            	    lv_uiFeatures_3_0=ruleUIFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUIModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uiFeatures",
            	            		lv_uiFeatures_3_0, 
            	            		"UIFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleUIModule9912); 

                	newLeafNode(otherlv_4, grammarAccess.getUIModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleUIModule"


    // $ANTLR start "entryRuleBusinessFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4311:1: entryRuleBusinessFeature returns [EObject current=null] : iv_ruleBusinessFeature= ruleBusinessFeature EOF ;
    public final EObject entryRuleBusinessFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessFeature = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4312:2: (iv_ruleBusinessFeature= ruleBusinessFeature EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4313:2: iv_ruleBusinessFeature= ruleBusinessFeature EOF
            {
             newCompositeNode(grammarAccess.getBusinessFeatureRule()); 
            pushFollow(FOLLOW_ruleBusinessFeature_in_entryRuleBusinessFeature9950);
            iv_ruleBusinessFeature=ruleBusinessFeature();

            state._fsp--;

             current =iv_ruleBusinessFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessFeature9960); 

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
    // $ANTLR end "entryRuleBusinessFeature"


    // $ANTLR start "ruleBusinessFeature"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4320:1: ruleBusinessFeature returns [EObject current=null] : (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_connectPoint1_5_0= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '=>' ( (lv_connectEnd_9_0= RULE_ID ) ) otherlv_10= '}' )? ) ;
    public final EObject ruleBusinessFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_connectPoint1_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_connectEnd_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4323:28: ( (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_connectPoint1_5_0= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '=>' ( (lv_connectEnd_9_0= RULE_ID ) ) otherlv_10= '}' )? ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4324:1: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_connectPoint1_5_0= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '=>' ( (lv_connectEnd_9_0= RULE_ID ) ) otherlv_10= '}' )? )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4324:1: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_connectPoint1_5_0= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '=>' ( (lv_connectEnd_9_0= RULE_ID ) ) otherlv_10= '}' )? )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4324:3: otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '{' ( (lv_connectPoint1_5_0= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '=>' ( (lv_connectEnd_9_0= RULE_ID ) ) otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleBusinessFeature9997); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessFeatureAccess().getInstanceKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4328:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4329:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4329:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4330:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessFeature10014); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBusinessFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBusinessFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleBusinessFeature10031); 

                	newLeafNode(otherlv_2, grammarAccess.getBusinessFeatureAccess().getColonKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4350:1: ( ( ruleQualifiedName ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4351:1: ( ruleQualifiedName )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4351:1: ( ruleQualifiedName )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4352:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBusinessFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBusinessFeatureAccess().getTypeBusinessFeatureTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBusinessFeature10054);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4365:2: (otherlv_4= '{' ( (lv_connectPoint1_5_0= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '=>' ( (lv_connectEnd_9_0= RULE_ID ) ) otherlv_10= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==20) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4365:4: otherlv_4= '{' ( (lv_connectPoint1_5_0= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '=>' ( (lv_connectEnd_9_0= RULE_ID ) ) otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleBusinessFeature10067); 

                        	newLeafNode(otherlv_4, grammarAccess.getBusinessFeatureAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4369:1: ( (lv_connectPoint1_5_0= RULE_ID ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4370:1: (lv_connectPoint1_5_0= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4370:1: (lv_connectPoint1_5_0= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4371:3: lv_connectPoint1_5_0= RULE_ID
                    {
                    lv_connectPoint1_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessFeature10084); 

                    			newLeafNode(lv_connectPoint1_5_0, grammarAccess.getBusinessFeatureAccess().getConnectPoint1IDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBusinessFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"connectPoint1",
                            		lv_connectPoint1_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleBusinessFeature10101); 

                        	newLeafNode(otherlv_6, grammarAccess.getBusinessFeatureAccess().getToKeyword_4_2());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4391:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4392:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4392:1: (otherlv_7= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4393:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBusinessFeatureRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessFeature10121); 

                    		newLeafNode(otherlv_7, grammarAccess.getBusinessFeatureAccess().getConnectPoint2BusinessFeatureCrossReference_4_3_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,79,FOLLOW_79_in_ruleBusinessFeature10133); 

                        	newLeafNode(otherlv_8, grammarAccess.getBusinessFeatureAccess().getEqualsSignGreaterThanSignKeyword_4_4());
                        
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4408:1: ( (lv_connectEnd_9_0= RULE_ID ) )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4409:1: (lv_connectEnd_9_0= RULE_ID )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4409:1: (lv_connectEnd_9_0= RULE_ID )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4410:3: lv_connectEnd_9_0= RULE_ID
                    {
                    lv_connectEnd_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessFeature10150); 

                    			newLeafNode(lv_connectEnd_9_0, grammarAccess.getBusinessFeatureAccess().getConnectEndIDTerminalRuleCall_4_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBusinessFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"connectEnd",
                            		lv_connectEnd_9_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleBusinessFeature10167); 

                        	newLeafNode(otherlv_10, grammarAccess.getBusinessFeatureAccess().getRightCurlyBracketKeyword_4_6());
                        

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
    // $ANTLR end "ruleBusinessFeature"


    // $ANTLR start "entryRuleBusinessFeatures"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4438:1: entryRuleBusinessFeatures returns [EObject current=null] : iv_ruleBusinessFeatures= ruleBusinessFeatures EOF ;
    public final EObject entryRuleBusinessFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessFeatures = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4439:2: (iv_ruleBusinessFeatures= ruleBusinessFeatures EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4440:2: iv_ruleBusinessFeatures= ruleBusinessFeatures EOF
            {
             newCompositeNode(grammarAccess.getBusinessFeaturesRule()); 
            pushFollow(FOLLOW_ruleBusinessFeatures_in_entryRuleBusinessFeatures10205);
            iv_ruleBusinessFeatures=ruleBusinessFeatures();

            state._fsp--;

             current =iv_ruleBusinessFeatures; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessFeatures10215); 

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
    // $ANTLR end "entryRuleBusinessFeatures"


    // $ANTLR start "ruleBusinessFeatures"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4447:1: ruleBusinessFeatures returns [EObject current=null] : ( ( (lv_features_0_0= ruleBusinessFeature ) ) ( (lv_features_1_0= ruleBusinessFeature ) )* ) ;
    public final EObject ruleBusinessFeatures() throws RecognitionException {
        EObject current = null;

        EObject lv_features_0_0 = null;

        EObject lv_features_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4450:28: ( ( ( (lv_features_0_0= ruleBusinessFeature ) ) ( (lv_features_1_0= ruleBusinessFeature ) )* ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4451:1: ( ( (lv_features_0_0= ruleBusinessFeature ) ) ( (lv_features_1_0= ruleBusinessFeature ) )* )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4451:1: ( ( (lv_features_0_0= ruleBusinessFeature ) ) ( (lv_features_1_0= ruleBusinessFeature ) )* )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4451:2: ( (lv_features_0_0= ruleBusinessFeature ) ) ( (lv_features_1_0= ruleBusinessFeature ) )*
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4451:2: ( (lv_features_0_0= ruleBusinessFeature ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4452:1: (lv_features_0_0= ruleBusinessFeature )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4452:1: (lv_features_0_0= ruleBusinessFeature )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4453:3: lv_features_0_0= ruleBusinessFeature
            {
             
            	        newCompositeNode(grammarAccess.getBusinessFeaturesAccess().getFeaturesBusinessFeatureParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBusinessFeature_in_ruleBusinessFeatures10261);
            lv_features_0_0=ruleBusinessFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessFeaturesRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_0_0, 
                    		"BusinessFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4469:2: ( (lv_features_1_0= ruleBusinessFeature ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==78) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4470:1: (lv_features_1_0= ruleBusinessFeature )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4470:1: (lv_features_1_0= ruleBusinessFeature )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4471:3: lv_features_1_0= ruleBusinessFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBusinessFeaturesAccess().getFeaturesBusinessFeatureParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBusinessFeature_in_ruleBusinessFeatures10282);
            	    lv_features_1_0=ruleBusinessFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBusinessFeaturesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_1_0, 
            	            		"BusinessFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleBusinessFeatures"


    // $ANTLR start "entryRuleBusinessModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4495:1: entryRuleBusinessModule returns [EObject current=null] : iv_ruleBusinessModule= ruleBusinessModule EOF ;
    public final EObject entryRuleBusinessModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4496:2: (iv_ruleBusinessModule= ruleBusinessModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4497:2: iv_ruleBusinessModule= ruleBusinessModule EOF
            {
             newCompositeNode(grammarAccess.getBusinessModuleRule()); 
            pushFollow(FOLLOW_ruleBusinessModule_in_entryRuleBusinessModule10319);
            iv_ruleBusinessModule=ruleBusinessModule();

            state._fsp--;

             current =iv_ruleBusinessModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessModule10329); 

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
    // $ANTLR end "entryRuleBusinessModule"


    // $ANTLR start "ruleBusinessModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4504:1: ruleBusinessModule returns [EObject current=null] : (otherlv_0= 'businessSystem' otherlv_1= '{' this_BusinessFeatures_2= ruleBusinessFeatures otherlv_3= '}' ) ;
    public final EObject ruleBusinessModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BusinessFeatures_2 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4507:28: ( (otherlv_0= 'businessSystem' otherlv_1= '{' this_BusinessFeatures_2= ruleBusinessFeatures otherlv_3= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4508:1: (otherlv_0= 'businessSystem' otherlv_1= '{' this_BusinessFeatures_2= ruleBusinessFeatures otherlv_3= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4508:1: (otherlv_0= 'businessSystem' otherlv_1= '{' this_BusinessFeatures_2= ruleBusinessFeatures otherlv_3= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4508:3: otherlv_0= 'businessSystem' otherlv_1= '{' this_BusinessFeatures_2= ruleBusinessFeatures otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleBusinessModule10366); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessModuleAccess().getBusinessSystemKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBusinessModule10378); 

                	newLeafNode(otherlv_1, grammarAccess.getBusinessModuleAccess().getLeftCurlyBracketKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getBusinessModuleAccess().getBusinessFeaturesParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleBusinessFeatures_in_ruleBusinessModule10400);
            this_BusinessFeatures_2=ruleBusinessFeatures();

            state._fsp--;

             
                    current = this_BusinessFeatures_2; 
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBusinessModule10411); 

                	newLeafNode(otherlv_3, grammarAccess.getBusinessModuleAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBusinessModule"


    // $ANTLR start "entryRuleSystemModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4537:1: entryRuleSystemModule returns [EObject current=null] : iv_ruleSystemModule= ruleSystemModule EOF ;
    public final EObject entryRuleSystemModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemModule = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4538:2: (iv_ruleSystemModule= ruleSystemModule EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4539:2: iv_ruleSystemModule= ruleSystemModule EOF
            {
             newCompositeNode(grammarAccess.getSystemModuleRule()); 
            pushFollow(FOLLOW_ruleSystemModule_in_entryRuleSystemModule10447);
            iv_ruleSystemModule=ruleSystemModule();

            state._fsp--;

             current =iv_ruleSystemModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemModule10457); 

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
    // $ANTLR end "entryRuleSystemModule"


    // $ANTLR start "ruleSystemModule"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4546:1: ruleSystemModule returns [EObject current=null] : (this_BusinessModule_0= ruleBusinessModule | this_UIModule_1= ruleUIModule ) ;
    public final EObject ruleSystemModule() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessModule_0 = null;

        EObject this_UIModule_1 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4549:28: ( (this_BusinessModule_0= ruleBusinessModule | this_UIModule_1= ruleUIModule ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4550:1: (this_BusinessModule_0= ruleBusinessModule | this_UIModule_1= ruleUIModule )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4550:1: (this_BusinessModule_0= ruleBusinessModule | this_UIModule_1= ruleUIModule )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==80) ) {
                alt63=1;
            }
            else if ( (LA63_0==77) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4551:5: this_BusinessModule_0= ruleBusinessModule
                    {
                     
                            newCompositeNode(grammarAccess.getSystemModuleAccess().getBusinessModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBusinessModule_in_ruleSystemModule10504);
                    this_BusinessModule_0=ruleBusinessModule();

                    state._fsp--;

                     
                            current = this_BusinessModule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4561:5: this_UIModule_1= ruleUIModule
                    {
                     
                            newCompositeNode(grammarAccess.getSystemModuleAccess().getUIModuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUIModule_in_ruleSystemModule10531);
                    this_UIModule_1=ruleUIModule();

                    state._fsp--;

                     
                            current = this_UIModule_1; 
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
    // $ANTLR end "ruleSystemModule"


    // $ANTLR start "entryRuleSystemDefinition"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4577:1: entryRuleSystemDefinition returns [EObject current=null] : iv_ruleSystemDefinition= ruleSystemDefinition EOF ;
    public final EObject entryRuleSystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDefinition = null;


        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4578:2: (iv_ruleSystemDefinition= ruleSystemDefinition EOF )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4579:2: iv_ruleSystemDefinition= ruleSystemDefinition EOF
            {
             newCompositeNode(grammarAccess.getSystemDefinitionRule()); 
            pushFollow(FOLLOW_ruleSystemDefinition_in_entryRuleSystemDefinition10566);
            iv_ruleSystemDefinition=ruleSystemDefinition();

            state._fsp--;

             current =iv_ruleSystemDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemDefinition10576); 

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
    // $ANTLR end "entryRuleSystemDefinition"


    // $ANTLR start "ruleSystemDefinition"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4586:1: ruleSystemDefinition returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleSystemModule ) ) ( (lv_modules_4_0= ruleSystemModule ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_modules_3_0 = null;

        EObject lv_modules_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4589:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleSystemModule ) ) ( (lv_modules_4_0= ruleSystemModule ) )* otherlv_5= '}' ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4590:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleSystemModule ) ) ( (lv_modules_4_0= ruleSystemModule ) )* otherlv_5= '}' )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4590:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleSystemModule ) ) ( (lv_modules_4_0= ruleSystemModule ) )* otherlv_5= '}' )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4590:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleSystemModule ) ) ( (lv_modules_4_0= ruleSystemModule ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleSystemDefinition10613); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemDefinitionAccess().getSystemKeyword_0());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4594:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4595:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4595:1: (lv_name_1_0= RULE_ID )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4596:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemDefinition10630); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSystemDefinition10647); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4616:1: ( (lv_modules_3_0= ruleSystemModule ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4617:1: (lv_modules_3_0= ruleSystemModule )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4617:1: (lv_modules_3_0= ruleSystemModule )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4618:3: lv_modules_3_0= ruleSystemModule
            {
             
            	        newCompositeNode(grammarAccess.getSystemDefinitionAccess().getModulesSystemModuleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSystemModule_in_ruleSystemDefinition10668);
            lv_modules_3_0=ruleSystemModule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"modules",
                    		lv_modules_3_0, 
                    		"SystemModule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4634:2: ( (lv_modules_4_0= ruleSystemModule ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==77||LA64_0==80) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4635:1: (lv_modules_4_0= ruleSystemModule )
            	    {
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4635:1: (lv_modules_4_0= ruleSystemModule )
            	    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4636:3: lv_modules_4_0= ruleSystemModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemDefinitionAccess().getModulesSystemModuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystemModule_in_ruleSystemDefinition10689);
            	    lv_modules_4_0=ruleSystemModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modules",
            	            		lv_modules_4_0, 
            	            		"SystemModule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSystemDefinition10702); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemDefinitionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSystemDefinition"


    // $ANTLR start "ruleContentElementLiteral"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4664:1: ruleContentElementLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'button' ) | (enumLiteral_2= 'label' ) | (enumLiteral_3= 'list' ) | (enumLiteral_4= 'image' ) ) ;
    public final Enumerator ruleContentElementLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4666:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'button' ) | (enumLiteral_2= 'label' ) | (enumLiteral_3= 'list' ) | (enumLiteral_4= 'image' ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4667:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'button' ) | (enumLiteral_2= 'label' ) | (enumLiteral_3= 'list' ) | (enumLiteral_4= 'image' ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4667:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'button' ) | (enumLiteral_2= 'label' ) | (enumLiteral_3= 'list' ) | (enumLiteral_4= 'image' ) )
            int alt65=5;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt65=1;
                }
                break;
            case 83:
                {
                alt65=2;
                }
                break;
            case 84:
                {
                alt65=3;
                }
                break;
            case 85:
                {
                alt65=4;
                }
                break;
            case 86:
                {
                alt65=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4667:2: (enumLiteral_0= 'text' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4667:2: (enumLiteral_0= 'text' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4667:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleContentElementLiteral10752); 

                            current = grammarAccess.getContentElementLiteralAccess().getTEXTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContentElementLiteralAccess().getTEXTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4673:6: (enumLiteral_1= 'button' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4673:6: (enumLiteral_1= 'button' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4673:8: enumLiteral_1= 'button'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleContentElementLiteral10769); 

                            current = grammarAccess.getContentElementLiteralAccess().getBUTTONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContentElementLiteralAccess().getBUTTONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4679:6: (enumLiteral_2= 'label' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4679:6: (enumLiteral_2= 'label' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4679:8: enumLiteral_2= 'label'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_84_in_ruleContentElementLiteral10786); 

                            current = grammarAccess.getContentElementLiteralAccess().getLABELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContentElementLiteralAccess().getLABELEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4685:6: (enumLiteral_3= 'list' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4685:6: (enumLiteral_3= 'list' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4685:8: enumLiteral_3= 'list'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_85_in_ruleContentElementLiteral10803); 

                            current = grammarAccess.getContentElementLiteralAccess().getLISTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContentElementLiteralAccess().getLISTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4691:6: (enumLiteral_4= 'image' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4691:6: (enumLiteral_4= 'image' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4691:8: enumLiteral_4= 'image'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_86_in_ruleContentElementLiteral10820); 

                            current = grammarAccess.getContentElementLiteralAccess().getIMAGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContentElementLiteralAccess().getIMAGEEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleContentElementLiteral"


    // $ANTLR start "rulePropertyNameLiteral"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4701:1: rulePropertyNameLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'labelProvider' ) | (enumLiteral_1= 'cssItem' ) | (enumLiteral_2= 'tooltip' ) | (enumLiteral_3= 'resourceKey' ) | (enumLiteral_4= 'style' ) | (enumLiteral_5= 'path' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'columns' ) ) ;
    public final Enumerator rulePropertyNameLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4703:28: ( ( (enumLiteral_0= 'labelProvider' ) | (enumLiteral_1= 'cssItem' ) | (enumLiteral_2= 'tooltip' ) | (enumLiteral_3= 'resourceKey' ) | (enumLiteral_4= 'style' ) | (enumLiteral_5= 'path' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'columns' ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4704:1: ( (enumLiteral_0= 'labelProvider' ) | (enumLiteral_1= 'cssItem' ) | (enumLiteral_2= 'tooltip' ) | (enumLiteral_3= 'resourceKey' ) | (enumLiteral_4= 'style' ) | (enumLiteral_5= 'path' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'columns' ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4704:1: ( (enumLiteral_0= 'labelProvider' ) | (enumLiteral_1= 'cssItem' ) | (enumLiteral_2= 'tooltip' ) | (enumLiteral_3= 'resourceKey' ) | (enumLiteral_4= 'style' ) | (enumLiteral_5= 'path' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'columns' ) )
            int alt66=8;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt66=1;
                }
                break;
            case 88:
                {
                alt66=2;
                }
                break;
            case 89:
                {
                alt66=3;
                }
                break;
            case 90:
                {
                alt66=4;
                }
                break;
            case 75:
                {
                alt66=5;
                }
                break;
            case 91:
                {
                alt66=6;
                }
                break;
            case 92:
                {
                alt66=7;
                }
                break;
            case 93:
                {
                alt66=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4704:2: (enumLiteral_0= 'labelProvider' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4704:2: (enumLiteral_0= 'labelProvider' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4704:4: enumLiteral_0= 'labelProvider'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_rulePropertyNameLiteral10865); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getLABEL_PROVIDEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPropertyNameLiteralAccess().getLABEL_PROVIDEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4710:6: (enumLiteral_1= 'cssItem' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4710:6: (enumLiteral_1= 'cssItem' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4710:8: enumLiteral_1= 'cssItem'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_rulePropertyNameLiteral10882); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getCSS_ITEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPropertyNameLiteralAccess().getCSS_ITEMEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4716:6: (enumLiteral_2= 'tooltip' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4716:6: (enumLiteral_2= 'tooltip' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4716:8: enumLiteral_2= 'tooltip'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_89_in_rulePropertyNameLiteral10899); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getTOOLTIPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPropertyNameLiteralAccess().getTOOLTIPEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4722:6: (enumLiteral_3= 'resourceKey' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4722:6: (enumLiteral_3= 'resourceKey' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4722:8: enumLiteral_3= 'resourceKey'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_90_in_rulePropertyNameLiteral10916); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getRESOURCE_KEYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPropertyNameLiteralAccess().getRESOURCE_KEYEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4728:6: (enumLiteral_4= 'style' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4728:6: (enumLiteral_4= 'style' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4728:8: enumLiteral_4= 'style'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_75_in_rulePropertyNameLiteral10933); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getSTYLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPropertyNameLiteralAccess().getSTYLEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4734:6: (enumLiteral_5= 'path' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4734:6: (enumLiteral_5= 'path' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4734:8: enumLiteral_5= 'path'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_91_in_rulePropertyNameLiteral10950); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getPATHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPropertyNameLiteralAccess().getPATHEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4740:6: (enumLiteral_6= 'type' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4740:6: (enumLiteral_6= 'type' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4740:8: enumLiteral_6= 'type'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_92_in_rulePropertyNameLiteral10967); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getTYPEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPropertyNameLiteralAccess().getTYPEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4746:6: (enumLiteral_7= 'columns' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4746:6: (enumLiteral_7= 'columns' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4746:8: enumLiteral_7= 'columns'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_93_in_rulePropertyNameLiteral10984); 

                            current = grammarAccess.getPropertyNameLiteralAccess().getCOLUMNSEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPropertyNameLiteralAccess().getCOLUMNSEnumLiteralDeclaration_7()); 
                        

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
    // $ANTLR end "rulePropertyNameLiteral"


    // $ANTLR start "ruleContainerElementLiteral"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4756:1: ruleContainerElementLiteral returns [Enumerator current=null] : ( (enumLiteral_0= 'layout' ) | (enumLiteral_1= 'screen' ) ) ;
    public final Enumerator ruleContainerElementLiteral() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4758:28: ( ( (enumLiteral_0= 'layout' ) | (enumLiteral_1= 'screen' ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4759:1: ( (enumLiteral_0= 'layout' ) | (enumLiteral_1= 'screen' ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4759:1: ( (enumLiteral_0= 'layout' ) | (enumLiteral_1= 'screen' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==94) ) {
                alt67=1;
            }
            else if ( (LA67_0==70) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4759:2: (enumLiteral_0= 'layout' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4759:2: (enumLiteral_0= 'layout' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4759:4: enumLiteral_0= 'layout'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_94_in_ruleContainerElementLiteral11029); 

                            current = grammarAccess.getContainerElementLiteralAccess().getLAYOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContainerElementLiteralAccess().getLAYOUTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4765:6: (enumLiteral_1= 'screen' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4765:6: (enumLiteral_1= 'screen' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4765:8: enumLiteral_1= 'screen'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleContainerElementLiteral11046); 

                            current = grammarAccess.getContainerElementLiteralAccess().getSCREENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContainerElementLiteralAccess().getSCREENEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleContainerElementLiteral"


    // $ANTLR start "ruleUIElementReceiverKey"
    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4775:1: ruleUIElementReceiverKey returns [Enumerator current=null] : ( (enumLiteral_0= 'selection' ) | (enumLiteral_1= 'values' ) | (enumLiteral_2= 'onSelection' ) | (enumLiteral_3= 'text' ) ) ;
    public final Enumerator ruleUIElementReceiverKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4777:28: ( ( (enumLiteral_0= 'selection' ) | (enumLiteral_1= 'values' ) | (enumLiteral_2= 'onSelection' ) | (enumLiteral_3= 'text' ) ) )
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4778:1: ( (enumLiteral_0= 'selection' ) | (enumLiteral_1= 'values' ) | (enumLiteral_2= 'onSelection' ) | (enumLiteral_3= 'text' ) )
            {
            // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4778:1: ( (enumLiteral_0= 'selection' ) | (enumLiteral_1= 'values' ) | (enumLiteral_2= 'onSelection' ) | (enumLiteral_3= 'text' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt68=1;
                }
                break;
            case 96:
                {
                alt68=2;
                }
                break;
            case 97:
                {
                alt68=3;
                }
                break;
            case 82:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4778:2: (enumLiteral_0= 'selection' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4778:2: (enumLiteral_0= 'selection' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4778:4: enumLiteral_0= 'selection'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_95_in_ruleUIElementReceiverKey11091); 

                            current = grammarAccess.getUIElementReceiverKeyAccess().getSELECTIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUIElementReceiverKeyAccess().getSELECTIONEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4784:6: (enumLiteral_1= 'values' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4784:6: (enumLiteral_1= 'values' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4784:8: enumLiteral_1= 'values'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_96_in_ruleUIElementReceiverKey11108); 

                            current = grammarAccess.getUIElementReceiverKeyAccess().getVALUES_EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUIElementReceiverKeyAccess().getVALUES_EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4790:6: (enumLiteral_2= 'onSelection' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4790:6: (enumLiteral_2= 'onSelection' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4790:8: enumLiteral_2= 'onSelection'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_97_in_ruleUIElementReceiverKey11125); 

                            current = grammarAccess.getUIElementReceiverKeyAccess().getON_SELECTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUIElementReceiverKeyAccess().getON_SELECTIONEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4796:6: (enumLiteral_3= 'text' )
                    {
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4796:6: (enumLiteral_3= 'text' )
                    // ../de.nagarro.nteg.domain.model/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4796:8: enumLiteral_3= 'text'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_82_in_ruleUIElementReceiverKey11142); 

                            current = grammarAccess.getUIElementReceiverKeyAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getUIElementReceiverKeyAccess().getTEXTEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleUIElementReceiverKey"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000080002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDefinition_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName339 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName373 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard583 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildcard602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDataType691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType708 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataType725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataType746 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_16_in_ruleDataType759 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleDataType774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataType791 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDataType811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDeclaration_in_entryRuleNamespaceDeclaration849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDeclaration859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNamespaceDeclaration896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespaceDeclaration917 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNamespaceDeclaration929 = new BitSet(new long[]{0x00000C8010205000L});
    public static final BitSet FOLLOW_ruleAbstractNamespaceElement_in_ruleNamespaceDeclaration950 = new BitSet(new long[]{0x00000C8010205000L});
    public static final BitSet FOLLOW_21_in_ruleNamespaceDeclaration963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNamespaceElement_in_entryRuleAbstractNamespaceElement999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNamespaceElement1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_ruleAbstractNamespaceElement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatelessComponent_in_ruleAbstractNamespaceElement1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainRepository_in_ruleAbstractNamespaceElement1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainEntity_in_ruleAbstractNamespaceElement1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAbstractNamespaceElement1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractNamespaceElement1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMappingOptions_in_entryRuleFeatureMappingOptions1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMappingOptions1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFeatureMappingOptions1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureMappingOptions1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFeatureMappingOptions1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFeatureMappingOptions1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFeature1421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1440 = new BitSet(new long[]{0x000000000BC00000L});
    public static final BitSet FOLLOW_ruleFeatureMappingOptions_in_ruleFeature1467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1484 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFeature1503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainEntity_in_entryRuleDomainEntity1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainEntity1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDomainEntity1609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainEntity1626 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDomainEntity1643 = new BitSet(new long[]{0x0000000004200010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleDomainEntity1664 = new BitSet(new long[]{0x0000000004200010L});
    public static final BitSet FOLLOW_21_in_ruleDomainEntity1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestMethodCall_in_entryRuleRestMethodCall1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestMethodCall1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRestMethodCall1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRestMethodCall1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRestMethodCall1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestOperation_in_entryRuleRestOperation1842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestOperation1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRestOperation1891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRestOperation1906 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleRestOperation1924 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRestOperation1937 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleRestMethodCall_in_ruleRestOperation1959 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRestOperation1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter2017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodParameter2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethodParameter2075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodParameter2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameters_in_entryRuleMethodParameters2133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodParameters2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_ruleMethodParameters2189 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleMethodParameters2202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_ruleMethodParameters2223 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodCall2313 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMethodCall2330 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleMethodParameters_in_ruleMethodCall2351 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMethodCall2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceOperation_in_entryRuleInterfaceOperation2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceOperation2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInterfaceOperation2447 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleRestOperation_in_ruleInterfaceOperation2468 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleMethodCall_in_ruleInterfaceOperation2490 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInterfaceOperation2502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceOperation2525 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleInterfaceOperation2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInterfaceDeclaration2623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDeclaration2640 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceDeclaration2657 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_ruleInterfaceOperation_in_ruleInterfaceDeclaration2678 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_21_in_ruleInterfaceDeclaration2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceOperationUsageRule_in_entryRuleInterfaceOperationUsageRule2727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceOperationUsageRule2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInterfaceOperationUsageRule2775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41_in_ruleInterfaceOperationUsageRule2793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceOperationUsageRule2811 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInterfaceOperationUsageRule2828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceOperationUsageRule2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceOperationsUsageRule_in_entryRuleInterfaceOperationsUsageRule2887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceOperationsUsageRule2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceOperationUsageRule_in_ruleInterfaceOperationsUsageRule2943 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleInterfaceOperationUsageRule_in_ruleInterfaceOperationsUsageRule2964 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleStatelessComponent_in_entryRuleStatelessComponent3001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatelessComponent3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleStatelessComponent3048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatelessComponent3065 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatelessComponent3082 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_ruleInterfaceOperationsUsageRule_in_ruleStatelessComponent3103 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStatelessComponent3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainRepository_in_entryRuleDomainRepository3152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainRepository3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDomainRepository3199 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDomainRepository3211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDomainRepository3234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainRepository3251 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDomainRepository3268 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_ruleInterfaceOperationsUsageRule_in_ruleDomainRepository3289 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDomainRepository3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryParametersModule_in_entryRuleEntryParametersModule3338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryParametersModule3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEntryParametersModule3385 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntryParametersModule3397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModelFeature_in_ruleEntryParametersModule3418 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleModelFeature_in_ruleEntryParametersModule3439 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleEntryParametersModule3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFeature_in_entryRuleModelFeature3488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFeature3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelFeature3540 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModelFeature3557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModelFeature3580 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleModelFeature3593 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleModelFeature3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelModule_in_entryRuleModelModule3646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelModule3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleModelModule3693 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModelModule3705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModelFeature_in_ruleModelModule3726 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleModelFeature_in_ruleModelModule3747 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleModelModule3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementFeature_in_entryRuleElementFeature3796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementFeature3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyNameLiteral_in_ruleElementFeature3852 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleElementFeature3864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementFeature3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentElement_in_entryRuleContentElement3922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentElement3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentElementLiteral_in_ruleContentElement3978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentElement3995 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleContentElement4012 = new BitSet(new long[]{0x0000001000000000L,0x000000003F800800L});
    public static final BitSet FOLLOW_ruleElementFeature_in_ruleContentElement4034 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_ruleContentElement4047 = new BitSet(new long[]{0x0000000000000000L,0x000000003F800800L});
    public static final BitSet FOLLOW_ruleElementFeature_in_ruleContentElement4068 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_36_in_ruleContentElement4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElement_in_entryRuleContainerElement4120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerElement4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElementLiteral_in_ruleContainerElement4176 = new BitSet(new long[]{0x0000000800100012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerElement4193 = new BitSet(new long[]{0x0000000800100002L});
    public static final BitSet FOLLOW_35_in_ruleContainerElement4212 = new BitSet(new long[]{0x0000000000000000L,0x000000003F800800L});
    public static final BitSet FOLLOW_ruleElementFeature_in_ruleContainerElement4233 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_ruleContainerElement4246 = new BitSet(new long[]{0x0000000000000000L,0x000000003F800800L});
    public static final BitSet FOLLOW_ruleElementFeature_in_ruleContainerElement4267 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_36_in_ruleContainerElement4281 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleContainerElement4296 = new BitSet(new long[]{0x0000000000000000L,0x00000000407C0040L});
    public static final BitSet FOLLOW_ruleViewElement_in_ruleContainerElement4317 = new BitSet(new long[]{0x0000000000200000L,0x00000000407C0040L});
    public static final BitSet FOLLOW_ruleViewElement_in_ruleContainerElement4338 = new BitSet(new long[]{0x0000000000200000L,0x00000000407C0040L});
    public static final BitSet FOLLOW_21_in_ruleContainerElement4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewElement_in_entryRuleViewElement4389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewElement4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElement_in_ruleViewElement4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentElement_in_ruleViewElement4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewModule_in_entryRuleViewModule4508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewModule4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleViewModule4555 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleViewModule4567 = new BitSet(new long[]{0x0000000000000000L,0x00000000407C0040L});
    public static final BitSet FOLLOW_ruleViewElement_in_ruleViewModule4588 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleViewModule4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidateAction_in_entryRuleValidateAction4636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidateAction4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValidateAction4683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidateAction4703 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleValidateAction4715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSetUIElementReceiver_in_ruleValidateAction4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachAction_in_entryRuleAttachAction4772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachAction4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAttachAction4819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttachAction4839 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAttachAction4851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSetUIElementReceiver_in_ruleAttachAction4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindEnumSource_in_entryRuleBindEnumSource4908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindEnumSource4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBindEnumSource4955 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindEnumSource4967 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleBindEnumSource4979 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBindEnumSource4991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBindEnumSource5008 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindEnumSource5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindSource_in_entryRuleBindSource5061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindSource5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindSource5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindEnumSource_in_ruleBindSource5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindAction_in_entryRuleBindAction5179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindAction5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBindAction5226 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_ruleBindSource_in_ruleBindAction5247 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBindAction5260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindAction5277 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleBindAction5296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSetUIElementReceiver_in_ruleBindAction5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitActionFeature_in_entryRuleInitActionFeature5353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitActionFeature5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAction_in_ruleInitActionFeature5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachAction_in_ruleInitActionFeature5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidateAction_in_ruleInitActionFeature5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindAction_in_ruleInitActionFeature5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitActionModule_in_entryRuleInitActionModule5526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitActionModule5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInitActionModule5573 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInitActionModule5585 = new BitSet(new long[]{0x008A000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleInitActionFeature_in_ruleInitActionModule5606 = new BitSet(new long[]{0x008A000000200000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleInitActionFeature_in_ruleInitActionModule5627 = new BitSet(new long[]{0x008A000000200000L,0x0000000000000008L});
    public static final BitSet FOLLOW_21_in_ruleInitActionModule5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidatorRule_in_entryRuleValidatorRule5676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidatorRule5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValidatorRule5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidatorRule5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidatorRules_in_entryRuleValidatorRules5795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidatorRules5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidatorRule_in_ruleValidatorRules5851 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleValidatorRules5864 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValidatorRule_in_ruleValidatorRules5885 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleValidatorFeature_in_entryRuleValidatorFeature5923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidatorFeature5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleValidatorFeature5970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidatorFeature5987 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleValidatorFeature6004 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValidatorRules_in_ruleValidatorFeature6025 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleValidatorFeature6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidatorModule_in_entryRuleValidatorModule6073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidatorModule6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValidatorModule6120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleValidatorModule6132 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValidatorFeature_in_ruleValidatorModule6153 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_ruleValidatorFeature_in_ruleValidatorModule6174 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_21_in_ruleValidatorModule6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenModelParameter_in_entryRuleScreenModelParameter6223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenModelParameter6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleScreenModelParameter6281 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleScreenModelParameter6293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScreenModelParameter6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenModelParameters_in_entryRuleScreenModelParameters6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenModelParameters6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenModelParameter_in_ruleScreenModelParameters6407 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleScreenModelParameters6420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleScreenModelParameter_in_ruleScreenModelParameters6441 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleNavigateToAction_in_entryRuleNavigateToAction6479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigateToAction6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNavigateToAction6526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNavigateToAction6546 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleNavigateToAction6559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleScreenModelParameters_in_ruleNavigateToAction6580 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleNavigateToAction6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteAction_in_entryRuleExecuteAction6630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteAction6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleExecuteAction6677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecuteAction6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverURLParameter_in_entryRuleSetRestCallReceiverURLParameter6733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetRestCallReceiverURLParameter6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSetRestCallReceiverURLParameter6780 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSetRestCallReceiverURLParameter6792 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSetRestCallReceiverURLParameter6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverReturnTypeParameter_in_entryRuleSetRestCallReceiverReturnTypeParameter6850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetRestCallReceiverReturnTypeParameter6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSetRestCallReceiverReturnTypeParameter6897 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSetRestCallReceiverReturnTypeParameter6909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSetRestCallReceiverReturnTypeParameter6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverIDParameter_in_entryRuleSetRestCallReceiverIDParameter6968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetRestCallReceiverIDParameter6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSetRestCallReceiverIDParameter7016 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_65_in_ruleSetRestCallReceiverIDParameter7034 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSetRestCallReceiverIDParameter7047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetRestCallReceiverIDParameter7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverParameter_in_entryRuleSetRestCallReceiverParameter7105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetRestCallReceiverParameter7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverURLParameter_in_ruleSetRestCallReceiverParameter7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverReturnTypeParameter_in_ruleSetRestCallReceiverParameter7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverIDParameter_in_ruleSetRestCallReceiverParameter7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverParameters_in_entryRuleSetRestCallReceiverParameters7251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetRestCallReceiverParameters7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverParameter_in_ruleSetRestCallReceiverParameters7307 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleSetRestCallReceiverParameters7320 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverParameter_in_ruleSetRestCallReceiverParameters7341 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiver_in_entryRuleSetRestCallReceiver7379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetRestCallReceiver7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSetRestCallReceiver7426 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSetRestCallReceiver7438 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiverParameters_in_ruleSetRestCallReceiver7459 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSetRestCallReceiver7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetUIElementReceiver_in_entryRuleSetUIElementReceiver7507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetUIElementReceiver7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetUIElementReceiver7562 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSetUIElementReceiver7574 = new BitSet(new long[]{0x0000000000000000L,0x0000000380040000L});
    public static final BitSet FOLLOW_ruleUIElementReceiverKey_in_ruleSetUIElementReceiver7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetActionReceiver_in_entryRuleSetActionReceiver7631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetActionReceiver7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetRestCallReceiver_in_ruleSetActionReceiver7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetUIElementReceiver_in_ruleSetActionReceiver7715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAction_in_entryRuleSetAction7750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetAction7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSetAction7797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSetAction7817 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleSetAction7829 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSetActionReceiver_in_ruleSetAction7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceMethodCallParameter_in_entryRuleInterfaceMethodCallParameter7886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceMethodCallParameter7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceMethodCallParameter7944 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInterfaceMethodCallParameter7956 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceMethodCallParameter7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterfaceMethodCallParameter7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceMethodCallParameters_in_entryRuleInterfaceMethodCallParameters8039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceMethodCallParameters8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceMethodCallParameter_in_ruleInterfaceMethodCallParameters8095 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleInterfaceMethodCallParameters8108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInterfaceMethodCallParameter_in_ruleInterfaceMethodCallParameters8129 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleInterfaceMethodCall_in_entryRuleInterfaceMethodCall8167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceMethodCall8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceMethodCall8222 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleInterfaceMethodCall8234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceMethodCall8257 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInterfaceMethodCall8269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInterfaceMethodCallParameters_in_ruleInterfaceMethodCall8290 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInterfaceMethodCall8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionFeature_in_entryRuleUIActionFeature8338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionFeature8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigateToAction_in_ruleUIActionFeature8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteAction_in_ruleUIActionFeature8422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetAction_in_ruleUIActionFeature8449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceMethodCall_in_ruleUIActionFeature8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionModule_in_entryRuleUIActionModule8511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIActionModule8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleUIActionModule8558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUIActionModule8575 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUIActionModule8592 = new BitSet(new long[]{0x3000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleUIActionFeature_in_ruleUIActionModule8613 = new BitSet(new long[]{0x3000000000200010L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleUIActionFeature_in_ruleUIActionModule8634 = new BitSet(new long[]{0x3000000000200010L,0x0000000000000008L});
    public static final BitSet FOLLOW_21_in_ruleUIActionModule8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControllerElement_in_entryRuleControllerElement8683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControllerElement8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIActionModule_in_ruleControllerElement8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitActionModule_in_ruleControllerElement8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidatorModule_in_ruleControllerElement8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControllerModule_in_entryRuleControllerModule8829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControllerModule8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleControllerModule8876 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleControllerModule8888 = new BitSet(new long[]{0x0900000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleControllerElement_in_ruleControllerModule8909 = new BitSet(new long[]{0x0900000000200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleControllerElement_in_ruleControllerModule8930 = new BitSet(new long[]{0x0900000000200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleControllerModule8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenModule_in_entryRuleScreenModule8979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenModule8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryParametersModule_in_ruleScreenModule9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelModule_in_ruleScreenModule9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewModule_in_ruleScreenModule9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControllerModule_in_ruleScreenModule9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenFeature_in_entryRuleScreenFeature9152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScreenFeature9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleScreenFeature9199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScreenFeature9216 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleScreenFeature9233 = new BitSet(new long[]{0x0001A00000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScreenModule_in_ruleScreenFeature9254 = new BitSet(new long[]{0x0001A00000200000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScreenModule_in_ruleScreenFeature9275 = new BitSet(new long[]{0x0001A00000200000L,0x0000000000000020L});
    public static final BitSet FOLLOW_21_in_ruleScreenFeature9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainFeatureOption_in_entryRuleMainFeatureOption9324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainFeatureOption9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleMainFeatureOption9372 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_72_in_ruleMainFeatureOption9390 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_73_in_ruleMainFeatureOption9408 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_74_in_ruleMainFeatureOption9426 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_75_in_ruleMainFeatureOption9444 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMainFeatureOption9457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMainFeatureOption9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainFeature_in_entryRuleMainFeature9515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainFeature9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleMainFeature9562 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMainFeature9574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_ruleMainFeatureOption_in_ruleMainFeature9595 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_ruleMainFeature9608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_ruleMainFeatureOption_in_ruleMainFeature9629 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_36_in_ruleMainFeature9643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIFeature_in_entryRuleUIFeature9679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIFeature9689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainFeature_in_ruleUIFeature9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScreenFeature_in_ruleUIFeature9763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModule_in_entryRuleUIModule9798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModule9808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUIModule9845 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUIModule9857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L});
    public static final BitSet FOLLOW_ruleUIFeature_in_ruleUIModule9878 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001040L});
    public static final BitSet FOLLOW_ruleUIFeature_in_ruleUIModule9899 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001040L});
    public static final BitSet FOLLOW_21_in_ruleUIModule9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessFeature_in_entryRuleBusinessFeature9950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessFeature9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleBusinessFeature9997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessFeature10014 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBusinessFeature10031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBusinessFeature10054 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleBusinessFeature10067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessFeature10084 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleBusinessFeature10101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessFeature10121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleBusinessFeature10133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessFeature10150 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessFeature10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessFeatures_in_entryRuleBusinessFeatures10205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessFeatures10215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessFeature_in_ruleBusinessFeatures10261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBusinessFeature_in_ruleBusinessFeatures10282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBusinessModule_in_entryRuleBusinessModule10319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessModule10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBusinessModule10366 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBusinessModule10378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBusinessFeatures_in_ruleBusinessModule10400 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessModule10411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemModule_in_entryRuleSystemModule10447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemModule10457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessModule_in_ruleSystemModule10504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModule_in_ruleSystemModule10531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemDefinition_in_entryRuleSystemDefinition10566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemDefinition10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleSystemDefinition10613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemDefinition10630 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSystemDefinition10647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_ruleSystemModule_in_ruleSystemDefinition10668 = new BitSet(new long[]{0x0000000000200000L,0x0000000000012000L});
    public static final BitSet FOLLOW_ruleSystemModule_in_ruleSystemDefinition10689 = new BitSet(new long[]{0x0000000000200000L,0x0000000000012000L});
    public static final BitSet FOLLOW_21_in_ruleSystemDefinition10702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleContentElementLiteral10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleContentElementLiteral10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleContentElementLiteral10786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleContentElementLiteral10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleContentElementLiteral10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rulePropertyNameLiteral10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rulePropertyNameLiteral10882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rulePropertyNameLiteral10899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulePropertyNameLiteral10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePropertyNameLiteral10933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rulePropertyNameLiteral10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulePropertyNameLiteral10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rulePropertyNameLiteral10984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleContainerElementLiteral11029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleContainerElementLiteral11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleUIElementReceiverKey11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleUIElementReceiverKey11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleUIElementReceiverKey11125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleUIElementReceiverKey11142 = new BitSet(new long[]{0x0000000000000002L});

}