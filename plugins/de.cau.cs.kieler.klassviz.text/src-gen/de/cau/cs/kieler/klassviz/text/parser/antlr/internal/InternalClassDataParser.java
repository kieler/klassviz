package de.cau.cs.kieler.klassviz.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassDataParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_TFLOAT", "RULE_NATURAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'project'", "'bundle'", "'='", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'('", "','", "')'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_TFLOAT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalClassDataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClassDataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClassDataParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g"; }



     	private ClassDataGrammarAccess grammarAccess;
     	
        public InternalClassDataParser(TokenStream input, ClassDataGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "KClassModel";	
       	}
       	
       	@Override
       	protected ClassDataGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleKClassModel"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:67:1: entryRuleKClassModel returns [EObject current=null] : iv_ruleKClassModel= ruleKClassModel EOF ;
    public final EObject entryRuleKClassModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKClassModel = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:68:2: (iv_ruleKClassModel= ruleKClassModel EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:69:2: iv_ruleKClassModel= ruleKClassModel EOF
            {
             newCompositeNode(grammarAccess.getKClassModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKClassModel_in_entryRuleKClassModel75);
            iv_ruleKClassModel=ruleKClassModel();

            state._fsp--;

             current =iv_ruleKClassModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKClassModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKClassModel"


    // $ANTLR start "ruleKClassModel"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:76:1: ruleKClassModel returns [EObject current=null] : ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* ) ;
    public final EObject ruleKClassModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_javaProjects_3_0 = null;

        AntlrDatatypeRuleToken lv_bundles_5_0 = null;

        EObject lv_options_6_0 = null;

        EObject lv_packages_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:79:28: ( ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:1: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:1: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:2: () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )*
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:2: ()
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKClassModelAccess().getKClassModelAction_0(),
                        current);
                

            }

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:86:2: (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:86:4: otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKClassModel132); 

            	        	newLeafNode(otherlv_1, grammarAccess.getKClassModelAccess().getImportKeyword_1_0());
            	        
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:90:1: ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:90:2: (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) )
            	            {
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:90:2: (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:90:4: otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) )
            	            {
            	            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleKClassModel146); 

            	                	newLeafNode(otherlv_2, grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0());
            	                
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:94:1: ( (lv_javaProjects_3_0= ruleQualifiedID ) )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:95:1: (lv_javaProjects_3_0= ruleQualifiedID )
            	            {
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:95:1: (lv_javaProjects_3_0= ruleQualifiedID )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:96:3: lv_javaProjects_3_0= ruleQualifiedID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getKClassModelAccess().getJavaProjectsQualifiedIDParserRuleCall_1_1_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKClassModel167);
            	            lv_javaProjects_3_0=ruleQualifiedID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"javaProjects",
            	                    		lv_javaProjects_3_0, 
            	                    		"QualifiedID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:113:6: (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) )
            	            {
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:113:6: (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:113:8: otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) )
            	            {
            	            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKClassModel187); 

            	                	newLeafNode(otherlv_4, grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0());
            	                
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:117:1: ( (lv_bundles_5_0= ruleQualifiedID ) )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:118:1: (lv_bundles_5_0= ruleQualifiedID )
            	            {
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:118:1: (lv_bundles_5_0= ruleQualifiedID )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:119:3: lv_bundles_5_0= ruleQualifiedID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKClassModel208);
            	            lv_bundles_5_0=ruleQualifiedID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"bundles",
            	                    		lv_bundles_5_0, 
            	                    		"QualifiedID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:135:6: ( (lv_options_6_0= ruleKOption ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:136:1: (lv_options_6_0= ruleKOption )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:136:1: (lv_options_6_0= ruleKOption )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:137:3: lv_options_6_0= ruleKOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKOption_in_ruleKClassModel233);
            	    lv_options_6_0=ruleKOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_6_0, 
            	            		"KOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:153:3: ( (lv_packages_7_0= ruleKPackage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:154:1: (lv_packages_7_0= ruleKPackage )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:154:1: (lv_packages_7_0= ruleKPackage )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:155:3: lv_packages_7_0= ruleKPackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_ruleKClassModel255);
            	    lv_packages_7_0=ruleKPackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_7_0, 
            	            		"KPackage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleKClassModel"


    // $ANTLR start "entryRuleKOption"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:179:1: entryRuleKOption returns [EObject current=null] : iv_ruleKOption= ruleKOption EOF ;
    public final EObject entryRuleKOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOption = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:180:2: (iv_ruleKOption= ruleKOption EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:181:2: iv_ruleKOption= ruleKOption EOF
            {
             newCompositeNode(grammarAccess.getKOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKOption_in_entryRuleKOption292);
            iv_ruleKOption=ruleKOption();

            state._fsp--;

             current =iv_ruleKOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKOption302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKOption"


    // $ANTLR start "ruleKOption"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:188:1: ruleKOption returns [EObject current=null] : ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) ) ;
    public final EObject ruleKOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:191:28: ( ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:192:1: ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:192:1: ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:192:2: () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:192:2: ()
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:193:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKOptionAccess().getKOptionAction_0(),
                        current);
                

            }

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:198:2: ( (lv_key_1_0= ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:199:1: (lv_key_1_0= ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:199:1: (lv_key_1_0= ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:200:3: lv_key_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKOption357);
            lv_key_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKOptionRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKOption369); 

                	newLeafNode(otherlv_2, grammarAccess.getKOptionAccess().getEqualsSignKeyword_2());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:220:1: ( (lv_value_3_0= rulePropertyValue ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:221:1: (lv_value_3_0= rulePropertyValue )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:221:1: (lv_value_3_0= rulePropertyValue )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:222:3: lv_value_3_0= rulePropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_ruleKOption390);
            lv_value_3_0=rulePropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKOptionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"PropertyValue");
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
    // $ANTLR end "ruleKOption"


    // $ANTLR start "entryRuleKPackage"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:246:1: entryRuleKPackage returns [EObject current=null] : iv_ruleKPackage= ruleKPackage EOF ;
    public final EObject entryRuleKPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPackage = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:247:2: (iv_ruleKPackage= ruleKPackage EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:248:2: iv_ruleKPackage= ruleKPackage EOF
            {
             newCompositeNode(grammarAccess.getKPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_entryRuleKPackage426);
            iv_ruleKPackage=ruleKPackage();

            state._fsp--;

             current =iv_ruleKPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKPackage436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKPackage"


    // $ANTLR start "ruleKPackage"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:255:1: ruleKPackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' ) ;
    public final EObject ruleKPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:258:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:259:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:259:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:259:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKPackage473); 

                	newLeafNode(otherlv_0, grammarAccess.getKPackageAccess().getPackageKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:263:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:264:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:264:1: (lv_name_1_0= ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:265:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKPackage494);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKPackage506); 

                	newLeafNode(otherlv_2, grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:285:1: ( (lv_types_3_0= ruleKType ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:286:1: (lv_types_3_0= ruleKType )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:286:1: (lv_types_3_0= ruleKType )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:287:3: lv_types_3_0= ruleKType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKType_in_ruleKPackage527);
            	    lv_types_3_0=ruleKType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"KType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKPackage540); 

                	newLeafNode(otherlv_4, grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleKPackage"


    // $ANTLR start "entryRuleKType"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:315:1: entryRuleKType returns [EObject current=null] : iv_ruleKType= ruleKType EOF ;
    public final EObject entryRuleKType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKType = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:316:2: (iv_ruleKType= ruleKType EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:317:2: iv_ruleKType= ruleKType EOF
            {
             newCompositeNode(grammarAccess.getKTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_entryRuleKType576);
            iv_ruleKType=ruleKType();

            state._fsp--;

             current =iv_ruleKType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKType586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKType"


    // $ANTLR start "ruleKType"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:324:1: ruleKType returns [EObject current=null] : (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) ;
    public final EObject ruleKType() throws RecognitionException {
        EObject current = null;

        EObject this_KClass_0 = null;

        EObject this_KInterface_1 = null;

        EObject this_KEnum_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:327:28: ( (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:328:1: (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:328:1: (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:329:5: this_KClass_0= ruleKClass
                    {
                     
                            newCompositeNode(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKClass_in_ruleKType633);
                    this_KClass_0=ruleKClass();

                    state._fsp--;

                     
                            current = this_KClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:339:5: this_KInterface_1= ruleKInterface
                    {
                     
                            newCompositeNode(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_ruleKType660);
                    this_KInterface_1=ruleKInterface();

                    state._fsp--;

                     
                            current = this_KInterface_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:349:5: this_KEnum_2= ruleKEnum
                    {
                     
                            newCompositeNode(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_ruleKType687);
                    this_KEnum_2=ruleKEnum();

                    state._fsp--;

                     
                            current = this_KEnum_2; 
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
    // $ANTLR end "ruleKType"


    // $ANTLR start "entryRuleKClass"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:365:1: entryRuleKClass returns [EObject current=null] : iv_ruleKClass= ruleKClass EOF ;
    public final EObject entryRuleKClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKClass = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:366:2: (iv_ruleKClass= ruleKClass EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:367:2: iv_ruleKClass= ruleKClass EOF
            {
             newCompositeNode(grammarAccess.getKClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKClass_in_entryRuleKClass722);
            iv_ruleKClass=ruleKClass();

            state._fsp--;

             current =iv_ruleKClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKClass732); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKClass"


    // $ANTLR start "ruleKClass"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:374:1: ruleKClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleKClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:377:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:378:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:378:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:378:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKClass769); 

                	newLeafNode(otherlv_0, grammarAccess.getKClassAccess().getClassKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:382:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:383:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:383:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:384:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKClass786); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:400:2: (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:400:4: otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKClass804); 

                        	newLeafNode(otherlv_2, grammarAccess.getKClassAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:404:1: ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==22) ) {
                                alt7=2;
                            }
                            else if ( (LA7_2==RULE_ID||LA7_2==18) ) {
                                alt7=1;
                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:404:2: ( (lv_fields_3_0= ruleKField ) )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:404:2: ( (lv_fields_3_0= ruleKField ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:405:1: (lv_fields_3_0= ruleKField )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:405:1: (lv_fields_3_0= ruleKField )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:406:3: lv_fields_3_0= ruleKField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKClassAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKField_in_ruleKClass826);
                    	    lv_fields_3_0=ruleKField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fields",
                    	            		lv_fields_3_0, 
                    	            		"KField");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:423:6: ( (lv_methods_4_0= ruleKMethod ) )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:423:6: ( (lv_methods_4_0= ruleKMethod ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:424:1: (lv_methods_4_0= ruleKMethod )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:424:1: (lv_methods_4_0= ruleKMethod )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:425:3: lv_methods_4_0= ruleKMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKClassAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_ruleKClass853);
                    	    lv_methods_4_0=ruleKMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"methods",
                    	            		lv_methods_4_0, 
                    	            		"KMethod");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKClass867); 

                        	newLeafNode(otherlv_5, grammarAccess.getKClassAccess().getRightCurlyBracketKeyword_2_2());
                        

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
    // $ANTLR end "ruleKClass"


    // $ANTLR start "entryRuleKInterface"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:453:1: entryRuleKInterface returns [EObject current=null] : iv_ruleKInterface= ruleKInterface EOF ;
    public final EObject entryRuleKInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKInterface = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:454:2: (iv_ruleKInterface= ruleKInterface EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:455:2: iv_ruleKInterface= ruleKInterface EOF
            {
             newCompositeNode(grammarAccess.getKInterfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_entryRuleKInterface905);
            iv_ruleKInterface=ruleKInterface();

            state._fsp--;

             current =iv_ruleKInterface; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKInterface915); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKInterface"


    // $ANTLR start "ruleKInterface"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:462:1: ruleKInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleKInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:465:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:466:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:466:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:466:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKInterface952); 

                	newLeafNode(otherlv_0, grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:470:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:471:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:471:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:472:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKInterface969); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:488:2: (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:488:4: otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKInterface987); 

                        	newLeafNode(otherlv_2, grammarAccess.getKInterfaceAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:492:1: ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==RULE_ID||LA9_2==18) ) {
                                alt9=1;
                            }
                            else if ( (LA9_2==22) ) {
                                alt9=2;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:492:2: ( (lv_fields_3_0= ruleKField ) )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:492:2: ( (lv_fields_3_0= ruleKField ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:493:1: (lv_fields_3_0= ruleKField )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:493:1: (lv_fields_3_0= ruleKField )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:494:3: lv_fields_3_0= ruleKField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKInterfaceAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKField_in_ruleKInterface1009);
                    	    lv_fields_3_0=ruleKField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKInterfaceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fields",
                    	            		lv_fields_3_0, 
                    	            		"KField");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:511:6: ( (lv_methods_4_0= ruleKMethod ) )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:511:6: ( (lv_methods_4_0= ruleKMethod ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:512:1: (lv_methods_4_0= ruleKMethod )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:512:1: (lv_methods_4_0= ruleKMethod )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:513:3: lv_methods_4_0= ruleKMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKInterfaceAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_ruleKInterface1036);
                    	    lv_methods_4_0=ruleKMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKInterfaceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"methods",
                    	            		lv_methods_4_0, 
                    	            		"KMethod");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKInterface1050); 

                        	newLeafNode(otherlv_5, grammarAccess.getKInterfaceAccess().getRightCurlyBracketKeyword_2_2());
                        

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
    // $ANTLR end "ruleKInterface"


    // $ANTLR start "entryRuleKEnum"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:541:1: entryRuleKEnum returns [EObject current=null] : iv_ruleKEnum= ruleKEnum EOF ;
    public final EObject entryRuleKEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKEnum = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:542:2: (iv_ruleKEnum= ruleKEnum EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:543:2: iv_ruleKEnum= ruleKEnum EOF
            {
             newCompositeNode(grammarAccess.getKEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_entryRuleKEnum1088);
            iv_ruleKEnum=ruleKEnum();

            state._fsp--;

             current =iv_ruleKEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKEnum1098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEnum"


    // $ANTLR start "ruleKEnum"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:550:1: ruleKEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleKEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:553:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:554:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:554:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )? )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:554:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKEnum1135); 

                	newLeafNode(otherlv_0, grammarAccess.getKEnumAccess().getEnumKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:558:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:559:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:559:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:560:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKEnum1152); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:576:2: (otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:576:4: otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKEnum1170); 

                        	newLeafNode(otherlv_2, grammarAccess.getKEnumAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:580:1: ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==22) ) {
                                alt11=2;
                            }
                            else if ( (LA11_2==RULE_ID||LA11_2==18) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:580:2: ( (lv_fields_3_0= ruleKField ) )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:580:2: ( (lv_fields_3_0= ruleKField ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:581:1: (lv_fields_3_0= ruleKField )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:581:1: (lv_fields_3_0= ruleKField )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:582:3: lv_fields_3_0= ruleKField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKEnumAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKField_in_ruleKEnum1192);
                    	    lv_fields_3_0=ruleKField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fields",
                    	            		lv_fields_3_0, 
                    	            		"KField");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:599:6: ( (lv_methods_4_0= ruleKMethod ) )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:599:6: ( (lv_methods_4_0= ruleKMethod ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:600:1: (lv_methods_4_0= ruleKMethod )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:600:1: (lv_methods_4_0= ruleKMethod )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:601:3: lv_methods_4_0= ruleKMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKEnumAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_ruleKEnum1219);
                    	    lv_methods_4_0=ruleKMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKEnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"methods",
                    	            		lv_methods_4_0, 
                    	            		"KMethod");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKEnum1233); 

                        	newLeafNode(otherlv_5, grammarAccess.getKEnumAccess().getRightCurlyBracketKeyword_2_2());
                        

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
    // $ANTLR end "ruleKEnum"


    // $ANTLR start "entryRuleKField"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:629:1: entryRuleKField returns [EObject current=null] : iv_ruleKField= ruleKField EOF ;
    public final EObject entryRuleKField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKField = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:630:2: (iv_ruleKField= ruleKField EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:631:2: iv_ruleKField= ruleKField EOF
            {
             newCompositeNode(grammarAccess.getKFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_entryRuleKField1271);
            iv_ruleKField=ruleKField();

            state._fsp--;

             current =iv_ruleKField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKField1281); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKField"


    // $ANTLR start "ruleKField"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:638:1: ruleKField returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:641:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:642:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:642:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:643:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:643:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:644:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKField1322); 

            			newLeafNode(lv_name_0_0, grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleKField"


    // $ANTLR start "entryRuleKMethod"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:668:1: entryRuleKMethod returns [EObject current=null] : iv_ruleKMethod= ruleKMethod EOF ;
    public final EObject entryRuleKMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKMethod = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:669:2: (iv_ruleKMethod= ruleKMethod EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:670:2: iv_ruleKMethod= ruleKMethod EOF
            {
             newCompositeNode(grammarAccess.getKMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_entryRuleKMethod1362);
            iv_ruleKMethod=ruleKMethod();

            state._fsp--;

             current =iv_ruleKMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKMethod1372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKMethod"


    // $ANTLR start "ruleKMethod"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:677:1: ruleKMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleKMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:680:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:681:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:681:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:681:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')'
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:681:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:682:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:682:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:683:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKMethod1414); 

            			newLeafNode(lv_name_0_0, grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleKMethod1431); 

                	newLeafNode(otherlv_1, grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:703:1: ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:703:2: ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )*
                    {
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:703:2: ( (lv_parameters_2_0= ruleKTypeReference ) )
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:704:1: (lv_parameters_2_0= ruleKTypeReference )
                    {
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:704:1: (lv_parameters_2_0= ruleKTypeReference )
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:705:3: lv_parameters_2_0= ruleKTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_ruleKMethod1453);
                    lv_parameters_2_0=ruleKTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"KTypeReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:721:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:721:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleKMethod1466); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:725:1: ( (lv_parameters_4_0= ruleKTypeReference ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:726:1: (lv_parameters_4_0= ruleKTypeReference )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:726:1: (lv_parameters_4_0= ruleKTypeReference )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:727:3: lv_parameters_4_0= ruleKTypeReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_ruleKMethod1487);
                    	    lv_parameters_4_0=ruleKTypeReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_4_0, 
                    	            		"KTypeReference");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleKMethod1503); 

                	newLeafNode(otherlv_5, grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleKMethod"


    // $ANTLR start "entryRuleKTypeReference"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:755:1: entryRuleKTypeReference returns [EObject current=null] : iv_ruleKTypeReference= ruleKTypeReference EOF ;
    public final EObject entryRuleKTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKTypeReference = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:756:2: (iv_ruleKTypeReference= ruleKTypeReference EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:757:2: iv_ruleKTypeReference= ruleKTypeReference EOF
            {
             newCompositeNode(grammarAccess.getKTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference1539);
            iv_ruleKTypeReference=ruleKTypeReference();

            state._fsp--;

             current =iv_ruleKTypeReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKTypeReference1549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKTypeReference"


    // $ANTLR start "ruleKTypeReference"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:764:1: ruleKTypeReference returns [EObject current=null] : ( (lv_signature_0_0= RULE_ID ) ) ;
    public final EObject ruleKTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_signature_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:767:28: ( ( (lv_signature_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:768:1: ( (lv_signature_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:768:1: ( (lv_signature_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:769:1: (lv_signature_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:769:1: (lv_signature_0_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:770:3: lv_signature_0_0= RULE_ID
            {
            lv_signature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKTypeReference1590); 

            			newLeafNode(lv_signature_0_0, grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKTypeReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"signature",
                    		lv_signature_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleKTypeReference"


    // $ANTLR start "entryRuleQualifiedID"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:794:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:795:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:796:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1631);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID1642); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:803:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:806:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:807:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:807:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:807:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID1682); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:814:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:815:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleQualifiedID1701); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID1716); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRulePropertyValue"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:835:1: entryRulePropertyValue returns [String current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final String entryRulePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyValue = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:836:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:837:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_entryRulePropertyValue1764);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValue1775); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:844:1: rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID ) ;
    public final AntlrDatatypeRuleToken rulePropertyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_Float_2 = null;

        AntlrDatatypeRuleToken this_QualifiedID_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:847:28: ( (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:848:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:848:1: (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case RULE_TFLOAT:
            case RULE_NATURAL:
                {
                alt16=3;
                }
                break;
            case RULE_ID:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:848:6: this_BOOLEAN_0= RULE_BOOLEAN
                    {
                    this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rulePropertyValue1815); 

                    		current.merge(this_BOOLEAN_0);
                        
                     
                        newLeafNode(this_BOOLEAN_0, grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:856:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePropertyValue1841); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:865:5: this_Float_2= ruleFloat
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFloat_in_rulePropertyValue1874);
                    this_Float_2=ruleFloat();

                    state._fsp--;


                    		current.merge(this_Float_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:877:5: this_QualifiedID_3= ruleQualifiedID
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rulePropertyValue1907);
                    this_QualifiedID_3=ruleQualifiedID();

                    state._fsp--;


                    		current.merge(this_QualifiedID_3);
                        
                     
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleFloat"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:895:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:896:2: (iv_ruleFloat= ruleFloat EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:897:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat1953);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat1964); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:904:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TFLOAT_0=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:907:28: ( (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:908:1: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:908:1: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_TFLOAT) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_NATURAL) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:908:6: this_TFLOAT_0= RULE_TFLOAT
                    {
                    this_TFLOAT_0=(Token)match(input,RULE_TFLOAT,FollowSets000.FOLLOW_RULE_TFLOAT_in_ruleFloat2004); 

                    		current.merge(this_TFLOAT_0);
                        
                     
                        newLeafNode(this_TFLOAT_0, grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:916:10: this_NATURAL_1= RULE_NATURAL
                    {
                    this_NATURAL_1=(Token)match(input,RULE_NATURAL,FollowSets000.FOLLOW_RULE_NATURAL_in_ruleFloat2030); 

                    		current.merge(this_NATURAL_1);
                        
                     
                        newLeafNode(this_NATURAL_1, grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleFloat"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleKClassModel_in_entryRuleKClassModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKClassModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleKClassModel132 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleKClassModel146 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKClassModel167 = new BitSet(new long[]{0x0000000000011012L});
        public static final BitSet FOLLOW_14_in_ruleKClassModel187 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKClassModel208 = new BitSet(new long[]{0x0000000000011012L});
        public static final BitSet FOLLOW_ruleKOption_in_ruleKClassModel233 = new BitSet(new long[]{0x0000000000010012L});
        public static final BitSet FOLLOW_ruleKPackage_in_ruleKClassModel255 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleKOption_in_entryRuleKOption292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKOption302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKOption357 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleKOption369 = new BitSet(new long[]{0x00000000000001F0L});
        public static final BitSet FOLLOW_rulePropertyValue_in_ruleKOption390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKPackage_in_entryRuleKPackage426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKPackage436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleKPackage473 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKPackage494 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleKPackage506 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_ruleKType_in_ruleKPackage527 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_18_in_ruleKPackage540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKType_in_entryRuleKType576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKType586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_ruleKType633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_ruleKType660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_ruleKType687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_entryRuleKClass722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKClass732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleKClass769 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKClass786 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleKClass804 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleKField_in_ruleKClass826 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleKMethod_in_ruleKClass853 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_18_in_ruleKClass867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_entryRuleKInterface905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKInterface915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleKInterface952 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKInterface969 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleKInterface987 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleKField_in_ruleKInterface1009 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleKMethod_in_ruleKInterface1036 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_18_in_ruleKInterface1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_entryRuleKEnum1088 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKEnum1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleKEnum1135 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKEnum1152 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleKEnum1170 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleKField_in_ruleKEnum1192 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleKMethod_in_ruleKEnum1219 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_18_in_ruleKEnum1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_entryRuleKField1271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKField1281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKField1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_entryRuleKMethod1362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKMethod1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKMethod1414 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleKMethod1431 = new BitSet(new long[]{0x0000000001000010L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_ruleKMethod1453 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleKMethod1466 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_ruleKMethod1487 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleKMethod1503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference1539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKTypeReference1549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKTypeReference1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1682 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleQualifiedID1701 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1716 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue1764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rulePropertyValue1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_rulePropertyValue1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rulePropertyValue1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat1953 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TFLOAT_in_ruleFloat2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NATURAL_in_ruleFloat2030 = new BitSet(new long[]{0x0000000000000002L});
    }


}