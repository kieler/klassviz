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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TFLOAT", "RULE_NATURAL", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'project'", "'bundle'", "'type'", "'{'", "'}'", "'('", "','", "')'", "'.'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_TFLOAT=5;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
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
        	return "KTypeSelection";	
       	}
       	
       	@Override
       	protected ClassDataGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleKTypeSelection"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:67:1: entryRuleKTypeSelection returns [EObject current=null] : iv_ruleKTypeSelection= ruleKTypeSelection EOF ;
    public final EObject entryRuleKTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKTypeSelection = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:68:2: (iv_ruleKTypeSelection= ruleKTypeSelection EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:69:2: iv_ruleKTypeSelection= ruleKTypeSelection EOF
            {
             newCompositeNode(grammarAccess.getKTypeSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeSelection_in_entryRuleKTypeSelection75);
            iv_ruleKTypeSelection=ruleKTypeSelection();

            state._fsp--;

             current =iv_ruleKTypeSelection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKTypeSelection85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKTypeSelection"


    // $ANTLR start "ruleKTypeSelection"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:76:1: ruleKTypeSelection returns [EObject current=null] : ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_types_6_0= ruleKType ) )* ) ;
    public final EObject ruleKTypeSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_javaProjects_3_0 = null;

        AntlrDatatypeRuleToken lv_bundles_5_0 = null;

        EObject lv_types_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:79:28: ( ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_types_6_0= ruleKType ) )* ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:1: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_types_6_0= ruleKType ) )* )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:1: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_types_6_0= ruleKType ) )* )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:2: () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_types_6_0= ruleKType ) )*
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:2: ()
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKTypeSelectionAccess().getKTypeSelectionAction_0(),
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
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKTypeSelection132); 

            	        	newLeafNode(otherlv_1, grammarAccess.getKTypeSelectionAccess().getImportKeyword_1_0());
            	        
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
            	            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleKTypeSelection146); 

            	                	newLeafNode(otherlv_2, grammarAccess.getKTypeSelectionAccess().getProjectKeyword_1_1_0_0());
            	                
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:94:1: ( (lv_javaProjects_3_0= ruleQualifiedID ) )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:95:1: (lv_javaProjects_3_0= ruleQualifiedID )
            	            {
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:95:1: (lv_javaProjects_3_0= ruleQualifiedID )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:96:3: lv_javaProjects_3_0= ruleQualifiedID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getKTypeSelectionAccess().getJavaProjectsQualifiedIDParserRuleCall_1_1_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKTypeSelection167);
            	            lv_javaProjects_3_0=ruleQualifiedID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getKTypeSelectionRule());
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
            	            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKTypeSelection187); 

            	                	newLeafNode(otherlv_4, grammarAccess.getKTypeSelectionAccess().getBundleKeyword_1_1_1_0());
            	                
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:117:1: ( (lv_bundles_5_0= ruleQualifiedID ) )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:118:1: (lv_bundles_5_0= ruleQualifiedID )
            	            {
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:118:1: (lv_bundles_5_0= ruleQualifiedID )
            	            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:119:3: lv_bundles_5_0= ruleQualifiedID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getKTypeSelectionAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKTypeSelection208);
            	            lv_bundles_5_0=ruleQualifiedID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getKTypeSelectionRule());
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

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:135:6: ( (lv_types_6_0= ruleKType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:136:1: (lv_types_6_0= ruleKType )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:136:1: (lv_types_6_0= ruleKType )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:137:3: lv_types_6_0= ruleKType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKTypeSelectionAccess().getTypesKTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKType_in_ruleKTypeSelection233);
            	    lv_types_6_0=ruleKType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKTypeSelectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_6_0, 
            	            		"KType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleKTypeSelection"


    // $ANTLR start "entryRuleKType"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:161:1: entryRuleKType returns [EObject current=null] : iv_ruleKType= ruleKType EOF ;
    public final EObject entryRuleKType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKType = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:162:2: (iv_ruleKType= ruleKType EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:163:2: iv_ruleKType= ruleKType EOF
            {
             newCompositeNode(grammarAccess.getKTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_entryRuleKType270);
            iv_ruleKType=ruleKType();

            state._fsp--;

             current =iv_ruleKType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKType280); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:170:1: ruleKType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_qualifiedName_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleKType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_qualifiedName_1_0 = null;

        EObject lv_fields_3_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:173:28: ( (otherlv_0= 'type' ( (lv_qualifiedName_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:174:1: (otherlv_0= 'type' ( (lv_qualifiedName_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:174:1: (otherlv_0= 'type' ( (lv_qualifiedName_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:174:3: otherlv_0= 'type' ( (lv_qualifiedName_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKType317); 

                	newLeafNode(otherlv_0, grammarAccess.getKTypeAccess().getTypeKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:178:1: ( (lv_qualifiedName_1_0= ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:179:1: (lv_qualifiedName_1_0= ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:179:1: (lv_qualifiedName_1_0= ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:180:3: lv_qualifiedName_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getKTypeAccess().getQualifiedNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKType338);
            lv_qualifiedName_1_0=ruleQualifiedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKTypeRule());
            	        }
                   		set(
                   			current, 
                   			"qualifiedName",
                    		lv_qualifiedName_1_0, 
                    		"QualifiedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKType350); 

                	newLeafNode(otherlv_2, grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:200:1: ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==18) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==RULE_ID||LA4_2==17) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:200:2: ( (lv_fields_3_0= ruleKField ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:200:2: ( (lv_fields_3_0= ruleKField ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:201:1: (lv_fields_3_0= ruleKField )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:201:1: (lv_fields_3_0= ruleKField )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:202:3: lv_fields_3_0= ruleKField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKField_in_ruleKType372);
            	    lv_fields_3_0=ruleKField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKTypeRule());
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
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:219:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:219:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:220:1: (lv_methods_4_0= ruleKMethod )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:220:1: (lv_methods_4_0= ruleKMethod )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:221:3: lv_methods_4_0= ruleKMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_ruleKType399);
            	    lv_methods_4_0=ruleKMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKTypeRule());
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
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKType413); 

                	newLeafNode(otherlv_5, grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleKField"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:249:1: entryRuleKField returns [EObject current=null] : iv_ruleKField= ruleKField EOF ;
    public final EObject entryRuleKField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKField = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:250:2: (iv_ruleKField= ruleKField EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:251:2: iv_ruleKField= ruleKField EOF
            {
             newCompositeNode(grammarAccess.getKFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_entryRuleKField449);
            iv_ruleKField=ruleKField();

            state._fsp--;

             current =iv_ruleKField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKField459); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:258:1: ruleKField returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:261:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:262:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:262:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:263:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:263:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:264:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKField500); 

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:288:1: entryRuleKMethod returns [EObject current=null] : iv_ruleKMethod= ruleKMethod EOF ;
    public final EObject entryRuleKMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKMethod = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:289:2: (iv_ruleKMethod= ruleKMethod EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:290:2: iv_ruleKMethod= ruleKMethod EOF
            {
             newCompositeNode(grammarAccess.getKMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_entryRuleKMethod540);
            iv_ruleKMethod=ruleKMethod();

            state._fsp--;

             current =iv_ruleKMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKMethod550); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:297:1: ruleKMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) ) (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleKMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterTypeSignatures_2_0 = null;

        EObject lv_parameterTypeSignatures_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:300:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) ) (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )* )? otherlv_5= ')' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:301:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) ) (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )* )? otherlv_5= ')' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:301:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) ) (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )* )? otherlv_5= ')' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:301:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) ) (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )* )? otherlv_5= ')'
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:301:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:302:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:302:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:303:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKMethod592); 

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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKMethod609); 

                	newLeafNode(otherlv_1, grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:323:1: ( ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) ) (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:323:2: ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) ) (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )*
                    {
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:323:2: ( (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature ) )
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:324:1: (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature )
                    {
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:324:1: (lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature )
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:325:3: lv_parameterTypeSignatures_2_0= ruleKParameterTypeSignature
                    {
                     
                    	        newCompositeNode(grammarAccess.getKMethodAccess().getParameterTypeSignaturesKParameterTypeSignatureParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKParameterTypeSignature_in_ruleKMethod631);
                    lv_parameterTypeSignatures_2_0=ruleKParameterTypeSignature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterTypeSignatures",
                            		lv_parameterTypeSignatures_2_0, 
                            		"KParameterTypeSignature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:341:2: (otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:341:4: otherlv_3= ',' ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKMethod644); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:345:1: ( (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:346:1: (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:346:1: (lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:347:3: lv_parameterTypeSignatures_4_0= ruleKParameterTypeSignature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKMethodAccess().getParameterTypeSignaturesKParameterTypeSignatureParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKParameterTypeSignature_in_ruleKMethod665);
                    	    lv_parameterTypeSignatures_4_0=ruleKParameterTypeSignature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getKMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterTypeSignatures",
                    	            		lv_parameterTypeSignatures_4_0, 
                    	            		"KParameterTypeSignature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKMethod681); 

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


    // $ANTLR start "entryRuleKParameterTypeSignature"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:375:1: entryRuleKParameterTypeSignature returns [EObject current=null] : iv_ruleKParameterTypeSignature= ruleKParameterTypeSignature EOF ;
    public final EObject entryRuleKParameterTypeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKParameterTypeSignature = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:376:2: (iv_ruleKParameterTypeSignature= ruleKParameterTypeSignature EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:377:2: iv_ruleKParameterTypeSignature= ruleKParameterTypeSignature EOF
            {
             newCompositeNode(grammarAccess.getKParameterTypeSignatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKParameterTypeSignature_in_entryRuleKParameterTypeSignature717);
            iv_ruleKParameterTypeSignature=ruleKParameterTypeSignature();

            state._fsp--;

             current =iv_ruleKParameterTypeSignature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKParameterTypeSignature727); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKParameterTypeSignature"


    // $ANTLR start "ruleKParameterTypeSignature"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:384:1: ruleKParameterTypeSignature returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleKParameterTypeSignature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:387:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:388:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:388:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:388:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:388:2: ()
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:389:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKParameterTypeSignatureAccess().getKParameterTypeSignatureAction_0(),
                        current);
                

            }

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:394:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:395:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:395:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:396:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKParameterTypeSignature778); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKParameterTypeSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKParameterTypeSignatureRule());
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
    // $ANTLR end "ruleKParameterTypeSignature"


    // $ANTLR start "entryRuleQualifiedID"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:420:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:421:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:422:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID820);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID831); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:429:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:432:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:433:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:433:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:433:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID871); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:440:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:441:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQualifiedID890); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID905); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "entryRuleFloat"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:463:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:464:2: (iv_ruleFloat= ruleFloat EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:465:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat955);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat966); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:472:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TFLOAT_0=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:475:28: ( (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:476:1: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:476:1: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TFLOAT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_NATURAL) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:476:6: this_TFLOAT_0= RULE_TFLOAT
                    {
                    this_TFLOAT_0=(Token)match(input,RULE_TFLOAT,FollowSets000.FOLLOW_RULE_TFLOAT_in_ruleFloat1006); 

                    		current.merge(this_TFLOAT_0);
                        
                     
                        newLeafNode(this_TFLOAT_0, grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:484:10: this_NATURAL_1= RULE_NATURAL
                    {
                    this_NATURAL_1=(Token)match(input,RULE_NATURAL,FollowSets000.FOLLOW_RULE_NATURAL_in_ruleFloat1032); 

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
        public static final BitSet FOLLOW_ruleKTypeSelection_in_entryRuleKTypeSelection75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKTypeSelection85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleKTypeSelection132 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleKTypeSelection146 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKTypeSelection167 = new BitSet(new long[]{0x0000000000009002L});
        public static final BitSet FOLLOW_14_in_ruleKTypeSelection187 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKTypeSelection208 = new BitSet(new long[]{0x0000000000009002L});
        public static final BitSet FOLLOW_ruleKType_in_ruleKTypeSelection233 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleKType_in_entryRuleKType270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKType280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKType317 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKType338 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleKType350 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKField_in_ruleKType372 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKMethod_in_ruleKType399 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleKType413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_entryRuleKField449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKField459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKField500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_entryRuleKMethod540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKMethod550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKMethod592 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleKMethod609 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleKParameterTypeSignature_in_ruleKMethod631 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleKMethod644 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleKParameterTypeSignature_in_ruleKMethod665 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleKMethod681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKParameterTypeSignature_in_entryRuleKParameterTypeSignature717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKParameterTypeSignature727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKParameterTypeSignature778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID871 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleQualifiedID890 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID905 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TFLOAT_in_ruleFloat1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NATURAL_in_ruleFloat1032 = new BitSet(new long[]{0x0000000000000002L});
    }


}