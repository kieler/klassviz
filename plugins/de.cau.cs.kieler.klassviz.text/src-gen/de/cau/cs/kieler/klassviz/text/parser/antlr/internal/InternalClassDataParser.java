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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TFLOAT", "RULE_NATURAL", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'project'", "'bundle'", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'('", "','", "')'", "'.'", "'<'", "'?'", "'>'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:76:1: ruleKClassModel returns [EObject current=null] : ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_packages_6_0= ruleKPackage ) )* ) ;
    public final EObject ruleKClassModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_javaProjects_3_0 = null;

        AntlrDatatypeRuleToken lv_bundles_5_0 = null;

        EObject lv_packages_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:79:28: ( ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_packages_6_0= ruleKPackage ) )* ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:1: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_packages_6_0= ruleKPackage ) )* )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:1: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_packages_6_0= ruleKPackage ) )* )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:80:2: () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= ruleQualifiedID ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_packages_6_0= ruleKPackage ) )*
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

            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:135:6: ( (lv_packages_6_0= ruleKPackage ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:136:1: (lv_packages_6_0= ruleKPackage )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:136:1: (lv_packages_6_0= ruleKPackage )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:137:3: lv_packages_6_0= ruleKPackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_ruleKClassModel233);
            	    lv_packages_6_0=ruleKPackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_6_0, 
            	            		"KPackage");
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
    // $ANTLR end "ruleKClassModel"


    // $ANTLR start "entryRuleKPackage"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:161:1: entryRuleKPackage returns [EObject current=null] : iv_ruleKPackage= ruleKPackage EOF ;
    public final EObject entryRuleKPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPackage = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:162:2: (iv_ruleKPackage= ruleKPackage EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:163:2: iv_ruleKPackage= ruleKPackage EOF
            {
             newCompositeNode(grammarAccess.getKPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_entryRuleKPackage270);
            iv_ruleKPackage=ruleKPackage();

            state._fsp--;

             current =iv_ruleKPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKPackage280); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:170:1: ruleKPackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' ) ;
    public final EObject ruleKPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_types_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:173:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:174:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:174:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:174:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKPackage317); 

                	newLeafNode(otherlv_0, grammarAccess.getKPackageAccess().getPackageKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:178:1: ( (lv_name_1_0= ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:179:1: (lv_name_1_0= ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:179:1: (lv_name_1_0= ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:180:3: lv_name_1_0= ruleQualifiedID
            {
             
            	        newCompositeNode(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleKPackage338);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKPackage350); 

                	newLeafNode(otherlv_2, grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:200:1: ( (lv_types_3_0= ruleKType ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:201:1: (lv_types_3_0= ruleKType )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:201:1: (lv_types_3_0= ruleKType )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:202:3: lv_types_3_0= ruleKType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKType_in_ruleKPackage371);
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKPackage384); 

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:230:1: entryRuleKType returns [EObject current=null] : iv_ruleKType= ruleKType EOF ;
    public final EObject entryRuleKType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKType = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:231:2: (iv_ruleKType= ruleKType EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:232:2: iv_ruleKType= ruleKType EOF
            {
             newCompositeNode(grammarAccess.getKTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_entryRuleKType420);
            iv_ruleKType=ruleKType();

            state._fsp--;

             current =iv_ruleKType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKType430); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:239:1: ruleKType returns [EObject current=null] : (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) ;
    public final EObject ruleKType() throws RecognitionException {
        EObject current = null;

        EObject this_KClass_0 = null;

        EObject this_KInterface_1 = null;

        EObject this_KEnum_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:242:28: ( (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:243:1: (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:243:1: (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:244:5: this_KClass_0= ruleKClass
                    {
                     
                            newCompositeNode(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKClass_in_ruleKType477);
                    this_KClass_0=ruleKClass();

                    state._fsp--;

                     
                            current = this_KClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:254:5: this_KInterface_1= ruleKInterface
                    {
                     
                            newCompositeNode(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_ruleKType504);
                    this_KInterface_1=ruleKInterface();

                    state._fsp--;

                     
                            current = this_KInterface_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:264:5: this_KEnum_2= ruleKEnum
                    {
                     
                            newCompositeNode(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_ruleKType531);
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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:280:1: entryRuleKClass returns [EObject current=null] : iv_ruleKClass= ruleKClass EOF ;
    public final EObject entryRuleKClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKClass = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:281:2: (iv_ruleKClass= ruleKClass EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:282:2: iv_ruleKClass= ruleKClass EOF
            {
             newCompositeNode(grammarAccess.getKClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKClass_in_entryRuleKClass566);
            iv_ruleKClass=ruleKClass();

            state._fsp--;

             current =iv_ruleKClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKClass576); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:289:1: ruleKClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) ;
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
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:292:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:293:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:293:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:293:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleKClass613); 

                	newLeafNode(otherlv_0, grammarAccess.getKClassAccess().getClassKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:297:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:298:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:298:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:299:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKClass630); 

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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKClass647); 

                	newLeafNode(otherlv_2, grammarAccess.getKClassAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:319:1: ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==21) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==RULE_ID||LA6_2==17) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:319:2: ( (lv_fields_3_0= ruleKField ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:319:2: ( (lv_fields_3_0= ruleKField ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:320:1: (lv_fields_3_0= ruleKField )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:320:1: (lv_fields_3_0= ruleKField )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:321:3: lv_fields_3_0= ruleKField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKClassAccess().getFieldsKFieldParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKField_in_ruleKClass669);
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
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:338:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:338:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:339:1: (lv_methods_4_0= ruleKMethod )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:339:1: (lv_methods_4_0= ruleKMethod )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:340:3: lv_methods_4_0= ruleKMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKClassAccess().getMethodsKMethodParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_ruleKClass696);
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
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKClass710); 

                	newLeafNode(otherlv_5, grammarAccess.getKClassAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:368:1: entryRuleKInterface returns [EObject current=null] : iv_ruleKInterface= ruleKInterface EOF ;
    public final EObject entryRuleKInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKInterface = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:369:2: (iv_ruleKInterface= ruleKInterface EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:370:2: iv_ruleKInterface= ruleKInterface EOF
            {
             newCompositeNode(grammarAccess.getKInterfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_entryRuleKInterface746);
            iv_ruleKInterface=ruleKInterface();

            state._fsp--;

             current =iv_ruleKInterface; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKInterface756); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:377:1: ruleKInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) ;
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
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:380:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:381:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:381:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:381:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKInterface793); 

                	newLeafNode(otherlv_0, grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:385:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:386:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:386:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:387:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKInterface810); 

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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKInterface827); 

                	newLeafNode(otherlv_2, grammarAccess.getKInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:407:1: ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==21) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==RULE_ID||LA7_2==17) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:407:2: ( (lv_fields_3_0= ruleKField ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:407:2: ( (lv_fields_3_0= ruleKField ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:408:1: (lv_fields_3_0= ruleKField )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:408:1: (lv_fields_3_0= ruleKField )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:409:3: lv_fields_3_0= ruleKField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKInterfaceAccess().getFieldsKFieldParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKField_in_ruleKInterface849);
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
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:426:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:426:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:427:1: (lv_methods_4_0= ruleKMethod )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:427:1: (lv_methods_4_0= ruleKMethod )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:428:3: lv_methods_4_0= ruleKMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKInterfaceAccess().getMethodsKMethodParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_ruleKInterface876);
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
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKInterface890); 

                	newLeafNode(otherlv_5, grammarAccess.getKInterfaceAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:456:1: entryRuleKEnum returns [EObject current=null] : iv_ruleKEnum= ruleKEnum EOF ;
    public final EObject entryRuleKEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKEnum = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:457:2: (iv_ruleKEnum= ruleKEnum EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:458:2: iv_ruleKEnum= ruleKEnum EOF
            {
             newCompositeNode(grammarAccess.getKEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_entryRuleKEnum926);
            iv_ruleKEnum=ruleKEnum();

            state._fsp--;

             current =iv_ruleKEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKEnum936); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:465:1: ruleKEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) ;
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
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:468:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:469:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:469:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:469:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKEnum973); 

                	newLeafNode(otherlv_0, grammarAccess.getKEnumAccess().getEnumKeyword_0());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:473:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:474:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:474:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:475:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKEnum990); 

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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKEnum1007); 

                	newLeafNode(otherlv_2, grammarAccess.getKEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:495:1: ( ( (lv_fields_3_0= ruleKField ) ) | ( (lv_methods_4_0= ruleKMethod ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==21) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==RULE_ID||LA8_2==17) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:495:2: ( (lv_fields_3_0= ruleKField ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:495:2: ( (lv_fields_3_0= ruleKField ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:496:1: (lv_fields_3_0= ruleKField )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:496:1: (lv_fields_3_0= ruleKField )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:497:3: lv_fields_3_0= ruleKField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKEnumAccess().getFieldsKFieldParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKField_in_ruleKEnum1029);
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
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:514:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:514:6: ( (lv_methods_4_0= ruleKMethod ) )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:515:1: (lv_methods_4_0= ruleKMethod )
            	    {
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:515:1: (lv_methods_4_0= ruleKMethod )
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:516:3: lv_methods_4_0= ruleKMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKEnumAccess().getMethodsKMethodParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_ruleKEnum1056);
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
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleKEnum1070); 

                	newLeafNode(otherlv_5, grammarAccess.getKEnumAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:544:1: entryRuleKField returns [EObject current=null] : iv_ruleKField= ruleKField EOF ;
    public final EObject entryRuleKField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKField = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:545:2: (iv_ruleKField= ruleKField EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:546:2: iv_ruleKField= ruleKField EOF
            {
             newCompositeNode(grammarAccess.getKFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_entryRuleKField1106);
            iv_ruleKField=ruleKField();

            state._fsp--;

             current =iv_ruleKField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKField1116); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:553:1: ruleKField returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:556:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:557:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:557:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:558:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:558:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:559:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKField1157); 

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:583:1: entryRuleKMethod returns [EObject current=null] : iv_ruleKMethod= ruleKMethod EOF ;
    public final EObject entryRuleKMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKMethod = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:584:2: (iv_ruleKMethod= ruleKMethod EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:585:2: iv_ruleKMethod= ruleKMethod EOF
            {
             newCompositeNode(grammarAccess.getKMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_entryRuleKMethod1197);
            iv_ruleKMethod=ruleKMethod();

            state._fsp--;

             current =iv_ruleKMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKMethod1207); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:592:1: ruleKMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' ) ;
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
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:595:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:596:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:596:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:596:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')'
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:596:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:597:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:597:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:598:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKMethod1249); 

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

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKMethod1266); 

                	newLeafNode(otherlv_1, grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1());
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:618:1: ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:618:2: ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )*
                    {
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:618:2: ( (lv_parameters_2_0= ruleKTypeReference ) )
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:619:1: (lv_parameters_2_0= ruleKTypeReference )
                    {
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:619:1: (lv_parameters_2_0= ruleKTypeReference )
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:620:3: lv_parameters_2_0= ruleKTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_ruleKMethod1288);
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

                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:636:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:636:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleKMethod1301); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:640:1: ( (lv_parameters_4_0= ruleKTypeReference ) )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:641:1: (lv_parameters_4_0= ruleKTypeReference )
                    	    {
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:641:1: (lv_parameters_4_0= ruleKTypeReference )
                    	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:642:3: lv_parameters_4_0= ruleKTypeReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_ruleKMethod1322);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleKMethod1338); 

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:670:1: entryRuleKTypeReference returns [EObject current=null] : iv_ruleKTypeReference= ruleKTypeReference EOF ;
    public final EObject entryRuleKTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKTypeReference = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:671:2: (iv_ruleKTypeReference= ruleKTypeReference EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:672:2: iv_ruleKTypeReference= ruleKTypeReference EOF
            {
             newCompositeNode(grammarAccess.getKTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference1374);
            iv_ruleKTypeReference=ruleKTypeReference();

            state._fsp--;

             current =iv_ruleKTypeReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKTypeReference1384); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:679:1: ruleKTypeReference returns [EObject current=null] : ( (lv_signature_0_0= ruleTypeSignature ) ) ;
    public final EObject ruleKTypeReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_signature_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:682:28: ( ( (lv_signature_0_0= ruleTypeSignature ) ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:683:1: ( (lv_signature_0_0= ruleTypeSignature ) )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:683:1: ( (lv_signature_0_0= ruleTypeSignature ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:684:1: (lv_signature_0_0= ruleTypeSignature )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:684:1: (lv_signature_0_0= ruleTypeSignature )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:685:3: lv_signature_0_0= ruleTypeSignature
            {
             
            	        newCompositeNode(grammarAccess.getKTypeReferenceAccess().getSignatureTypeSignatureParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeSignature_in_ruleKTypeReference1429);
            lv_signature_0_0=ruleTypeSignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKTypeReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"signature",
                    		lv_signature_0_0, 
                    		"TypeSignature");
            	        afterParserOrEnumRuleCall();
            	    

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:709:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:710:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:711:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1465);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID1476); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:718:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:721:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:722:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:722:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:722:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID1516); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:729:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:730:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleQualifiedID1535); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedID1550); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleTypeSignature"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:750:1: entryRuleTypeSignature returns [String current=null] : iv_ruleTypeSignature= ruleTypeSignature EOF ;
    public final String entryRuleTypeSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSignature = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:751:2: (iv_ruleTypeSignature= ruleTypeSignature EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:752:2: iv_ruleTypeSignature= ruleTypeSignature EOF
            {
             newCompositeNode(grammarAccess.getTypeSignatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeSignature_in_entryRuleTypeSignature1598);
            iv_ruleTypeSignature=ruleTypeSignature();

            state._fsp--;

             current =iv_ruleTypeSignature.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeSignature1609); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSignature"


    // $ANTLR start "ruleTypeSignature"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:759:1: ruleTypeSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedID_0= ruleQualifiedID (kw= '<' (kw= '?' | this_TypeSignature_3= ruleTypeSignature ) kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleTypeSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedID_0 = null;

        AntlrDatatypeRuleToken this_TypeSignature_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:762:28: ( (this_QualifiedID_0= ruleQualifiedID (kw= '<' (kw= '?' | this_TypeSignature_3= ruleTypeSignature ) kw= '>' )? ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:763:1: (this_QualifiedID_0= ruleQualifiedID (kw= '<' (kw= '?' | this_TypeSignature_3= ruleTypeSignature ) kw= '>' )? )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:763:1: (this_QualifiedID_0= ruleQualifiedID (kw= '<' (kw= '?' | this_TypeSignature_3= ruleTypeSignature ) kw= '>' )? )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:764:5: this_QualifiedID_0= ruleQualifiedID (kw= '<' (kw= '?' | this_TypeSignature_3= ruleTypeSignature ) kw= '>' )?
            {
             
                    newCompositeNode(grammarAccess.getTypeSignatureAccess().getQualifiedIDParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_ruleTypeSignature1656);
            this_QualifiedID_0=ruleQualifiedID();

            state._fsp--;


            		current.merge(this_QualifiedID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:774:1: (kw= '<' (kw= '?' | this_TypeSignature_3= ruleTypeSignature ) kw= '>' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:775:2: kw= '<' (kw= '?' | this_TypeSignature_3= ruleTypeSignature ) kw= '>'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTypeSignature1675); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeSignatureAccess().getLessThanSignKeyword_1_0()); 
                        
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:780:1: (kw= '?' | this_TypeSignature_3= ruleTypeSignature )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:781:2: kw= '?'
                            {
                            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeSignature1689); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeSignatureAccess().getQuestionMarkKeyword_1_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:788:5: this_TypeSignature_3= ruleTypeSignature
                            {
                             
                                    newCompositeNode(grammarAccess.getTypeSignatureAccess().getTypeSignatureParserRuleCall_1_1_1()); 
                                
                            pushFollow(FollowSets000.FOLLOW_ruleTypeSignature_in_ruleTypeSignature1717);
                            this_TypeSignature_3=ruleTypeSignature();

                            state._fsp--;


                            		current.merge(this_TypeSignature_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTypeSignature1736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeSignatureAccess().getGreaterThanSignKeyword_1_2()); 
                        

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
    // $ANTLR end "ruleTypeSignature"


    // $ANTLR start "entryRuleFloat"
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:814:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:815:2: (iv_ruleFloat= ruleFloat EOF )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:816:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat1781);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat1792); 

            }

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
    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:823:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TFLOAT_0=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:826:28: ( (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) )
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:827:1: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
            {
            // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:827:1: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_TFLOAT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_NATURAL) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:827:6: this_TFLOAT_0= RULE_TFLOAT
                    {
                    this_TFLOAT_0=(Token)match(input,RULE_TFLOAT,FollowSets000.FOLLOW_RULE_TFLOAT_in_ruleFloat1832); 

                    		current.merge(this_TFLOAT_0);
                        
                     
                        newLeafNode(this_TFLOAT_0, grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text/src-gen/de/cau/cs/kieler/klassviz/text/parser/antlr/internal/InternalClassData.g:835:10: this_NATURAL_1= RULE_NATURAL
                    {
                    this_NATURAL_1=(Token)match(input,RULE_NATURAL,FollowSets000.FOLLOW_RULE_NATURAL_in_ruleFloat1858); 

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
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKClassModel167 = new BitSet(new long[]{0x0000000000009002L});
        public static final BitSet FOLLOW_14_in_ruleKClassModel187 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKClassModel208 = new BitSet(new long[]{0x0000000000009002L});
        public static final BitSet FOLLOW_ruleKPackage_in_ruleKClassModel233 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleKPackage_in_entryRuleKPackage270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKPackage280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKPackage317 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleKPackage338 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleKPackage350 = new BitSet(new long[]{0x00000000001E0000L});
        public static final BitSet FOLLOW_ruleKType_in_ruleKPackage371 = new BitSet(new long[]{0x00000000001E0000L});
        public static final BitSet FOLLOW_17_in_ruleKPackage384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKType_in_entryRuleKType420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKType430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_ruleKType477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_ruleKType504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_ruleKType531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_entryRuleKClass566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKClass576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleKClass613 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKClass630 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleKClass647 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKField_in_ruleKClass669 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKMethod_in_ruleKClass696 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleKClass710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_entryRuleKInterface746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKInterface756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleKInterface793 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKInterface810 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleKInterface827 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKField_in_ruleKInterface849 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKMethod_in_ruleKInterface876 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleKInterface890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_entryRuleKEnum926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKEnum936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleKEnum973 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKEnum990 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleKEnum1007 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKField_in_ruleKEnum1029 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleKMethod_in_ruleKEnum1056 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleKEnum1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_entryRuleKField1106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKField1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKField1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_entryRuleKMethod1197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKMethod1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKMethod1249 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleKMethod1266 = new BitSet(new long[]{0x0000000000800010L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_ruleKMethod1288 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleKMethod1301 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_ruleKMethod1322 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleKMethod1338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference1374 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKTypeReference1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSignature_in_ruleKTypeReference1429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID1465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1516 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleQualifiedID1535 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedID1550 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleTypeSignature_in_entryRuleTypeSignature1598 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeSignature1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_ruleTypeSignature1656 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleTypeSignature1675 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_26_in_ruleTypeSignature1689 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleTypeSignature_in_ruleTypeSignature1717 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTypeSignature1736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat1781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat1792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TFLOAT_in_ruleFloat1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NATURAL_in_ruleFloat1858 = new BitSet(new long[]{0x0000000000000002L});
    }


}