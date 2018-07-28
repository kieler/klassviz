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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BOOLEAN", "RULE_TFLOAT", "RULE_NATURAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'project'", "'bundle'", "'='", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'depend'", "'('", "','", "')'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_TFLOAT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_NATURAL=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalClassDataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClassDataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClassDataParser.tokenNames; }
    public String getGrammarFileName() { return "InternalClassData.g"; }



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
    // InternalClassData.g:75:1: entryRuleKClassModel returns [EObject current=null] : iv_ruleKClassModel= ruleKClassModel EOF ;
    public final EObject entryRuleKClassModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKClassModel = null;


        try {
            // InternalClassData.g:75:52: (iv_ruleKClassModel= ruleKClassModel EOF )
            // InternalClassData.g:76:2: iv_ruleKClassModel= ruleKClassModel EOF
            {
             newCompositeNode(grammarAccess.getKClassModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKClassModel=ruleKClassModel();

            state._fsp--;

             current =iv_ruleKClassModel; 
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
    // $ANTLR end "entryRuleKClassModel"


    // $ANTLR start "ruleKClassModel"
    // InternalClassData.g:82:1: ruleKClassModel returns [EObject current=null] : ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* ) ;
    public final EObject ruleKClassModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_javaProjects_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_bundles_5_0 = null;

        EObject lv_options_6_0 = null;

        EObject lv_packages_7_0 = null;



        	enterRule();

        try {
            // InternalClassData.g:88:2: ( ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* ) )
            // InternalClassData.g:89:2: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* )
            {
            // InternalClassData.g:89:2: ( () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )* )
            // InternalClassData.g:90:3: () (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )* ( (lv_options_6_0= ruleKOption ) )* ( (lv_packages_7_0= ruleKPackage ) )*
            {
            // InternalClassData.g:90:3: ()
            // InternalClassData.g:91:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKClassModelAccess().getKClassModelAction_0(),
            					current);
            			

            }

            // InternalClassData.g:97:3: (otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalClassData.g:98:4: otherlv_1= 'import' ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getKClassModelAccess().getImportKeyword_1_0());
            	    			
            	    // InternalClassData.g:102:4: ( (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) ) | (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) ) )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==15) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==16) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalClassData.g:103:5: (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) )
            	            {
            	            // InternalClassData.g:103:5: (otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) ) )
            	            // InternalClassData.g:104:6: otherlv_2= 'project' ( (lv_javaProjects_3_0= RULE_STRING ) )
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	            						newLeafNode(otherlv_2, grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0());
            	            					
            	            // InternalClassData.g:108:6: ( (lv_javaProjects_3_0= RULE_STRING ) )
            	            // InternalClassData.g:109:7: (lv_javaProjects_3_0= RULE_STRING )
            	            {
            	            // InternalClassData.g:109:7: (lv_javaProjects_3_0= RULE_STRING )
            	            // InternalClassData.g:110:8: lv_javaProjects_3_0= RULE_STRING
            	            {
            	            lv_javaProjects_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	            								newLeafNode(lv_javaProjects_3_0, grammarAccess.getKClassModelAccess().getJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getKClassModelRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"javaProjects",
            	            									lv_javaProjects_3_0,
            	            									"org.eclipse.xtext.common.Terminals.STRING");
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalClassData.g:128:5: (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) )
            	            {
            	            // InternalClassData.g:128:5: (otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) ) )
            	            // InternalClassData.g:129:6: otherlv_4= 'bundle' ( (lv_bundles_5_0= ruleQualifiedID ) )
            	            {
            	            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            	            						newLeafNode(otherlv_4, grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0());
            	            					
            	            // InternalClassData.g:133:6: ( (lv_bundles_5_0= ruleQualifiedID ) )
            	            // InternalClassData.g:134:7: (lv_bundles_5_0= ruleQualifiedID )
            	            {
            	            // InternalClassData.g:134:7: (lv_bundles_5_0= ruleQualifiedID )
            	            // InternalClassData.g:135:8: lv_bundles_5_0= ruleQualifiedID
            	            {

            	            								newCompositeNode(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_5);
            	            lv_bundles_5_0=ruleQualifiedID();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	            								}
            	            								add(
            	            									current,
            	            									"bundles",
            	            									lv_bundles_5_0,
            	            									"de.cau.cs.kieler.klassviz.text.ClassData.QualifiedID");
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

            // InternalClassData.g:155:3: ( (lv_options_6_0= ruleKOption ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalClassData.g:156:4: (lv_options_6_0= ruleKOption )
            	    {
            	    // InternalClassData.g:156:4: (lv_options_6_0= ruleKOption )
            	    // InternalClassData.g:157:5: lv_options_6_0= ruleKOption
            	    {

            	    					newCompositeNode(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_options_6_0=ruleKOption();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"options",
            	    						lv_options_6_0,
            	    						"de.cau.cs.kieler.klassviz.text.ClassData.KOption");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalClassData.g:174:3: ( (lv_packages_7_0= ruleKPackage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalClassData.g:175:4: (lv_packages_7_0= ruleKPackage )
            	    {
            	    // InternalClassData.g:175:4: (lv_packages_7_0= ruleKPackage )
            	    // InternalClassData.g:176:5: lv_packages_7_0= ruleKPackage
            	    {

            	    					newCompositeNode(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_packages_7_0=ruleKPackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKClassModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packages",
            	    						lv_packages_7_0,
            	    						"de.cau.cs.kieler.klassviz.text.ClassData.KPackage");
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
    // InternalClassData.g:197:1: entryRuleKOption returns [EObject current=null] : iv_ruleKOption= ruleKOption EOF ;
    public final EObject entryRuleKOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOption = null;


        try {
            // InternalClassData.g:197:48: (iv_ruleKOption= ruleKOption EOF )
            // InternalClassData.g:198:2: iv_ruleKOption= ruleKOption EOF
            {
             newCompositeNode(grammarAccess.getKOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKOption=ruleKOption();

            state._fsp--;

             current =iv_ruleKOption; 
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
    // $ANTLR end "entryRuleKOption"


    // $ANTLR start "ruleKOption"
    // InternalClassData.g:204:1: ruleKOption returns [EObject current=null] : ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) ) ;
    public final EObject ruleKOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalClassData.g:210:2: ( ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) ) )
            // InternalClassData.g:211:2: ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) )
            {
            // InternalClassData.g:211:2: ( () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) ) )
            // InternalClassData.g:212:3: () ( (lv_key_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePropertyValue ) )
            {
            // InternalClassData.g:212:3: ()
            // InternalClassData.g:213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKOptionAccess().getKOptionAction_0(),
            					current);
            			

            }

            // InternalClassData.g:219:3: ( (lv_key_1_0= ruleQualifiedID ) )
            // InternalClassData.g:220:4: (lv_key_1_0= ruleQualifiedID )
            {
            // InternalClassData.g:220:4: (lv_key_1_0= ruleQualifiedID )
            // InternalClassData.g:221:5: lv_key_1_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_key_1_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"de.cau.cs.kieler.klassviz.text.ClassData.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getKOptionAccess().getEqualsSignKeyword_2());
            		
            // InternalClassData.g:242:3: ( (lv_value_3_0= rulePropertyValue ) )
            // InternalClassData.g:243:4: (lv_value_3_0= rulePropertyValue )
            {
            // InternalClassData.g:243:4: (lv_value_3_0= rulePropertyValue )
            // InternalClassData.g:244:5: lv_value_3_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=rulePropertyValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKOptionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.cau.cs.kieler.klassviz.text.ClassData.PropertyValue");
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
    // InternalClassData.g:265:1: entryRuleKPackage returns [EObject current=null] : iv_ruleKPackage= ruleKPackage EOF ;
    public final EObject entryRuleKPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPackage = null;


        try {
            // InternalClassData.g:265:49: (iv_ruleKPackage= ruleKPackage EOF )
            // InternalClassData.g:266:2: iv_ruleKPackage= ruleKPackage EOF
            {
             newCompositeNode(grammarAccess.getKPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKPackage=ruleKPackage();

            state._fsp--;

             current =iv_ruleKPackage; 
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
    // $ANTLR end "entryRuleKPackage"


    // $ANTLR start "ruleKPackage"
    // InternalClassData.g:272:1: ruleKPackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' ) ;
    public final EObject ruleKPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalClassData.g:278:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' ) )
            // InternalClassData.g:279:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' )
            {
            // InternalClassData.g:279:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}' )
            // InternalClassData.g:280:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '{' ( (lv_types_3_0= ruleKType ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getKPackageAccess().getPackageKeyword_0());
            		
            // InternalClassData.g:284:3: ( (lv_name_1_0= ruleQualifiedID ) )
            // InternalClassData.g:285:4: (lv_name_1_0= ruleQualifiedID )
            {
            // InternalClassData.g:285:4: (lv_name_1_0= ruleQualifiedID )
            // InternalClassData.g:286:5: lv_name_1_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cau.cs.kieler.klassviz.text.ClassData.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalClassData.g:307:3: ( (lv_types_3_0= ruleKType ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalClassData.g:308:4: (lv_types_3_0= ruleKType )
            	    {
            	    // InternalClassData.g:308:4: (lv_types_3_0= ruleKType )
            	    // InternalClassData.g:309:5: lv_types_3_0= ruleKType
            	    {

            	    					newCompositeNode(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_types_3_0=ruleKType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_3_0,
            	    						"de.cau.cs.kieler.klassviz.text.ClassData.KType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalClassData.g:334:1: entryRuleKType returns [EObject current=null] : iv_ruleKType= ruleKType EOF ;
    public final EObject entryRuleKType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKType = null;


        try {
            // InternalClassData.g:334:46: (iv_ruleKType= ruleKType EOF )
            // InternalClassData.g:335:2: iv_ruleKType= ruleKType EOF
            {
             newCompositeNode(grammarAccess.getKTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKType=ruleKType();

            state._fsp--;

             current =iv_ruleKType; 
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
    // $ANTLR end "entryRuleKType"


    // $ANTLR start "ruleKType"
    // InternalClassData.g:341:1: ruleKType returns [EObject current=null] : ( (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) (otherlv_3= '{' ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleKType() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject this_KClass_0 = null;

        EObject this_KInterface_1 = null;

        EObject this_KEnum_2 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_methods_5_0 = null;

        EObject lv_dependencies_6_0 = null;



        	enterRule();

        try {
            // InternalClassData.g:347:2: ( ( (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) (otherlv_3= '{' ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )* otherlv_7= '}' )? ) )
            // InternalClassData.g:348:2: ( (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) (otherlv_3= '{' ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )* otherlv_7= '}' )? )
            {
            // InternalClassData.g:348:2: ( (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) (otherlv_3= '{' ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )* otherlv_7= '}' )? )
            // InternalClassData.g:349:3: (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum ) (otherlv_3= '{' ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )* otherlv_7= '}' )?
            {
            // InternalClassData.g:349:3: (this_KClass_0= ruleKClass | this_KInterface_1= ruleKInterface | this_KEnum_2= ruleKEnum )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
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
                    // InternalClassData.g:350:4: this_KClass_0= ruleKClass
                    {

                    				newCompositeNode(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_KClass_0=ruleKClass();

                    state._fsp--;


                    				current = this_KClass_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalClassData.g:359:4: this_KInterface_1= ruleKInterface
                    {

                    				newCompositeNode(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_KInterface_1=ruleKInterface();

                    state._fsp--;


                    				current = this_KInterface_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalClassData.g:368:4: this_KEnum_2= ruleKEnum
                    {

                    				newCompositeNode(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_13);
                    this_KEnum_2=ruleKEnum();

                    state._fsp--;


                    				current = this_KEnum_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalClassData.g:377:3: (otherlv_3= '{' ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )* otherlv_7= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalClassData.g:378:4: otherlv_3= '{' ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalClassData.g:382:4: ( ( (lv_fields_4_0= ruleKField ) ) | ( (lv_methods_5_0= ruleKMethod ) ) | ( (lv_dependencies_6_0= ruleKDependency ) ) )*
                    loop7:
                    do {
                        int alt7=4;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==25) ) {
                                alt7=2;
                            }
                            else if ( (LA7_2==RULE_ID||LA7_2==20||LA7_2==24) ) {
                                alt7=1;
                            }


                        }
                        else if ( (LA7_0==24) ) {
                            alt7=3;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalClassData.g:383:5: ( (lv_fields_4_0= ruleKField ) )
                    	    {
                    	    // InternalClassData.g:383:5: ( (lv_fields_4_0= ruleKField ) )
                    	    // InternalClassData.g:384:6: (lv_fields_4_0= ruleKField )
                    	    {
                    	    // InternalClassData.g:384:6: (lv_fields_4_0= ruleKField )
                    	    // InternalClassData.g:385:7: lv_fields_4_0= ruleKField
                    	    {

                    	    							newCompositeNode(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_fields_4_0=ruleKField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_4_0,
                    	    								"de.cau.cs.kieler.klassviz.text.ClassData.KField");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalClassData.g:403:5: ( (lv_methods_5_0= ruleKMethod ) )
                    	    {
                    	    // InternalClassData.g:403:5: ( (lv_methods_5_0= ruleKMethod ) )
                    	    // InternalClassData.g:404:6: (lv_methods_5_0= ruleKMethod )
                    	    {
                    	    // InternalClassData.g:404:6: (lv_methods_5_0= ruleKMethod )
                    	    // InternalClassData.g:405:7: lv_methods_5_0= ruleKMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_methods_5_0=ruleKMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"methods",
                    	    								lv_methods_5_0,
                    	    								"de.cau.cs.kieler.klassviz.text.ClassData.KMethod");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalClassData.g:423:5: ( (lv_dependencies_6_0= ruleKDependency ) )
                    	    {
                    	    // InternalClassData.g:423:5: ( (lv_dependencies_6_0= ruleKDependency ) )
                    	    // InternalClassData.g:424:6: (lv_dependencies_6_0= ruleKDependency )
                    	    {
                    	    // InternalClassData.g:424:6: (lv_dependencies_6_0= ruleKDependency )
                    	    // InternalClassData.g:425:7: lv_dependencies_6_0= ruleKDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_dependencies_6_0=ruleKDependency();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dependencies",
                    	    								lv_dependencies_6_0,
                    	    								"de.cau.cs.kieler.klassviz.text.ClassData.KDependency");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleKType"


    // $ANTLR start "entryRuleKClass"
    // InternalClassData.g:452:1: entryRuleKClass returns [EObject current=null] : iv_ruleKClass= ruleKClass EOF ;
    public final EObject entryRuleKClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKClass = null;


        try {
            // InternalClassData.g:452:47: (iv_ruleKClass= ruleKClass EOF )
            // InternalClassData.g:453:2: iv_ruleKClass= ruleKClass EOF
            {
             newCompositeNode(grammarAccess.getKClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKClass=ruleKClass();

            state._fsp--;

             current =iv_ruleKClass; 
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
    // $ANTLR end "entryRuleKClass"


    // $ANTLR start "ruleKClass"
    // InternalClassData.g:459:1: ruleKClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleKClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalClassData.g:465:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalClassData.g:466:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalClassData.g:466:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalClassData.g:467:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getKClassAccess().getClassKeyword_0());
            		
            // InternalClassData.g:471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalClassData.g:472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalClassData.g:472:4: (lv_name_1_0= RULE_ID )
            // InternalClassData.g:473:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleKClass"


    // $ANTLR start "entryRuleKInterface"
    // InternalClassData.g:493:1: entryRuleKInterface returns [EObject current=null] : iv_ruleKInterface= ruleKInterface EOF ;
    public final EObject entryRuleKInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKInterface = null;


        try {
            // InternalClassData.g:493:51: (iv_ruleKInterface= ruleKInterface EOF )
            // InternalClassData.g:494:2: iv_ruleKInterface= ruleKInterface EOF
            {
             newCompositeNode(grammarAccess.getKInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKInterface=ruleKInterface();

            state._fsp--;

             current =iv_ruleKInterface; 
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
    // $ANTLR end "entryRuleKInterface"


    // $ANTLR start "ruleKInterface"
    // InternalClassData.g:500:1: ruleKInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleKInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalClassData.g:506:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalClassData.g:507:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalClassData.g:507:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalClassData.g:508:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalClassData.g:512:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalClassData.g:513:4: (lv_name_1_0= RULE_ID )
            {
            // InternalClassData.g:513:4: (lv_name_1_0= RULE_ID )
            // InternalClassData.g:514:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleKInterface"


    // $ANTLR start "entryRuleKEnum"
    // InternalClassData.g:534:1: entryRuleKEnum returns [EObject current=null] : iv_ruleKEnum= ruleKEnum EOF ;
    public final EObject entryRuleKEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKEnum = null;


        try {
            // InternalClassData.g:534:46: (iv_ruleKEnum= ruleKEnum EOF )
            // InternalClassData.g:535:2: iv_ruleKEnum= ruleKEnum EOF
            {
             newCompositeNode(grammarAccess.getKEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEnum=ruleKEnum();

            state._fsp--;

             current =iv_ruleKEnum; 
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
    // $ANTLR end "entryRuleKEnum"


    // $ANTLR start "ruleKEnum"
    // InternalClassData.g:541:1: ruleKEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleKEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalClassData.g:547:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalClassData.g:548:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalClassData.g:548:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalClassData.g:549:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getKEnumAccess().getEnumKeyword_0());
            		
            // InternalClassData.g:553:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalClassData.g:554:4: (lv_name_1_0= RULE_ID )
            {
            // InternalClassData.g:554:4: (lv_name_1_0= RULE_ID )
            // InternalClassData.g:555:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleKEnum"


    // $ANTLR start "entryRuleKDependency"
    // InternalClassData.g:575:1: entryRuleKDependency returns [EObject current=null] : iv_ruleKDependency= ruleKDependency EOF ;
    public final EObject entryRuleKDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKDependency = null;


        try {
            // InternalClassData.g:575:52: (iv_ruleKDependency= ruleKDependency EOF )
            // InternalClassData.g:576:2: iv_ruleKDependency= ruleKDependency EOF
            {
             newCompositeNode(grammarAccess.getKDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKDependency=ruleKDependency();

            state._fsp--;

             current =iv_ruleKDependency; 
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
    // $ANTLR end "entryRuleKDependency"


    // $ANTLR start "ruleKDependency"
    // InternalClassData.g:582:1: ruleKDependency returns [EObject current=null] : (otherlv_0= 'depend' ( (lv_label_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleKDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalClassData.g:588:2: ( (otherlv_0= 'depend' ( (lv_label_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalClassData.g:589:2: (otherlv_0= 'depend' ( (lv_label_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalClassData.g:589:2: (otherlv_0= 'depend' ( (lv_label_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) )
            // InternalClassData.g:590:3: otherlv_0= 'depend' ( (lv_label_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getKDependencyAccess().getDependKeyword_0());
            		
            // InternalClassData.g:594:3: ( (lv_label_1_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalClassData.g:595:4: (lv_label_1_0= RULE_STRING )
                    {
                    // InternalClassData.g:595:4: (lv_label_1_0= RULE_STRING )
                    // InternalClassData.g:596:5: lv_label_1_0= RULE_STRING
                    {
                    lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_label_1_0, grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKDependencyRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalClassData.g:612:3: ( (otherlv_2= RULE_ID ) )
            // InternalClassData.g:613:4: (otherlv_2= RULE_ID )
            {
            // InternalClassData.g:613:4: (otherlv_2= RULE_ID )
            // InternalClassData.g:614:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKDependencyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleKDependency"


    // $ANTLR start "entryRuleKField"
    // InternalClassData.g:629:1: entryRuleKField returns [EObject current=null] : iv_ruleKField= ruleKField EOF ;
    public final EObject entryRuleKField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKField = null;


        try {
            // InternalClassData.g:629:47: (iv_ruleKField= ruleKField EOF )
            // InternalClassData.g:630:2: iv_ruleKField= ruleKField EOF
            {
             newCompositeNode(grammarAccess.getKFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKField=ruleKField();

            state._fsp--;

             current =iv_ruleKField; 
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
    // $ANTLR end "entryRuleKField"


    // $ANTLR start "ruleKField"
    // InternalClassData.g:636:1: ruleKField returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleKField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalClassData.g:642:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalClassData.g:643:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalClassData.g:643:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalClassData.g:644:3: (lv_name_0_0= RULE_ID )
            {
            // InternalClassData.g:644:3: (lv_name_0_0= RULE_ID )
            // InternalClassData.g:645:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKFieldRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalClassData.g:664:1: entryRuleKMethod returns [EObject current=null] : iv_ruleKMethod= ruleKMethod EOF ;
    public final EObject entryRuleKMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKMethod = null;


        try {
            // InternalClassData.g:664:48: (iv_ruleKMethod= ruleKMethod EOF )
            // InternalClassData.g:665:2: iv_ruleKMethod= ruleKMethod EOF
            {
             newCompositeNode(grammarAccess.getKMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKMethod=ruleKMethod();

            state._fsp--;

             current =iv_ruleKMethod; 
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
    // $ANTLR end "entryRuleKMethod"


    // $ANTLR start "ruleKMethod"
    // InternalClassData.g:671:1: ruleKMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalClassData.g:677:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' ) )
            // InternalClassData.g:678:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' )
            {
            // InternalClassData.g:678:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')' )
            // InternalClassData.g:679:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )? otherlv_5= ')'
            {
            // InternalClassData.g:679:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalClassData.g:680:4: (lv_name_0_0= RULE_ID )
            {
            // InternalClassData.g:680:4: (lv_name_0_0= RULE_ID )
            // InternalClassData.g:681:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1());
            		
            // InternalClassData.g:701:3: ( ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalClassData.g:702:4: ( (lv_parameters_2_0= ruleKTypeReference ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )*
                    {
                    // InternalClassData.g:702:4: ( (lv_parameters_2_0= ruleKTypeReference ) )
                    // InternalClassData.g:703:5: (lv_parameters_2_0= ruleKTypeReference )
                    {
                    // InternalClassData.g:703:5: (lv_parameters_2_0= ruleKTypeReference )
                    // InternalClassData.g:704:6: lv_parameters_2_0= ruleKTypeReference
                    {

                    						newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parameters_2_0=ruleKTypeReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"de.cau.cs.kieler.klassviz.text.ClassData.KTypeReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalClassData.g:721:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==26) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalClassData.g:722:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleKTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalClassData.g:726:5: ( (lv_parameters_4_0= ruleKTypeReference ) )
                    	    // InternalClassData.g:727:6: (lv_parameters_4_0= ruleKTypeReference )
                    	    {
                    	    // InternalClassData.g:727:6: (lv_parameters_4_0= ruleKTypeReference )
                    	    // InternalClassData.g:728:7: lv_parameters_4_0= ruleKTypeReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parameters_4_0=ruleKTypeReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"de.cau.cs.kieler.klassviz.text.ClassData.KTypeReference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalClassData.g:755:1: entryRuleKTypeReference returns [EObject current=null] : iv_ruleKTypeReference= ruleKTypeReference EOF ;
    public final EObject entryRuleKTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKTypeReference = null;


        try {
            // InternalClassData.g:755:55: (iv_ruleKTypeReference= ruleKTypeReference EOF )
            // InternalClassData.g:756:2: iv_ruleKTypeReference= ruleKTypeReference EOF
            {
             newCompositeNode(grammarAccess.getKTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKTypeReference=ruleKTypeReference();

            state._fsp--;

             current =iv_ruleKTypeReference; 
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
    // $ANTLR end "entryRuleKTypeReference"


    // $ANTLR start "ruleKTypeReference"
    // InternalClassData.g:762:1: ruleKTypeReference returns [EObject current=null] : ( (lv_signature_0_0= RULE_ID ) ) ;
    public final EObject ruleKTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_signature_0_0=null;


        	enterRule();

        try {
            // InternalClassData.g:768:2: ( ( (lv_signature_0_0= RULE_ID ) ) )
            // InternalClassData.g:769:2: ( (lv_signature_0_0= RULE_ID ) )
            {
            // InternalClassData.g:769:2: ( (lv_signature_0_0= RULE_ID ) )
            // InternalClassData.g:770:3: (lv_signature_0_0= RULE_ID )
            {
            // InternalClassData.g:770:3: (lv_signature_0_0= RULE_ID )
            // InternalClassData.g:771:4: lv_signature_0_0= RULE_ID
            {
            lv_signature_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_signature_0_0, grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKTypeReferenceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"signature",
            					lv_signature_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalClassData.g:790:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalClassData.g:790:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalClassData.g:791:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalClassData.g:797:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalClassData.g:803:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalClassData.g:804:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalClassData.g:804:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalClassData.g:805:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalClassData.g:812:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalClassData.g:813:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalClassData.g:830:1: entryRulePropertyValue returns [String current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final String entryRulePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyValue = null;


        try {
            // InternalClassData.g:830:53: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalClassData.g:831:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue.getText(); 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalClassData.g:837:1: rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID ) ;
    public final AntlrDatatypeRuleToken rulePropertyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_Float_2 = null;

        AntlrDatatypeRuleToken this_QualifiedID_3 = null;



        	enterRule();

        try {
            // InternalClassData.g:843:2: ( (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID ) )
            // InternalClassData.g:844:2: (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID )
            {
            // InternalClassData.g:844:2: (this_BOOLEAN_0= RULE_BOOLEAN | this_STRING_1= RULE_STRING | this_Float_2= ruleFloat | this_QualifiedID_3= ruleQualifiedID )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case RULE_TFLOAT:
            case RULE_NATURAL:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalClassData.g:845:3: this_BOOLEAN_0= RULE_BOOLEAN
                    {
                    this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			current.merge(this_BOOLEAN_0);
                    		

                    			newLeafNode(this_BOOLEAN_0, grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalClassData.g:853:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalClassData.g:861:3: this_Float_2= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_2=ruleFloat();

                    state._fsp--;


                    			current.merge(this_Float_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalClassData.g:872:3: this_QualifiedID_3= ruleQualifiedID
                    {

                    			newCompositeNode(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:886:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalClassData.g:886:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalClassData.g:887:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalClassData.g:893:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TFLOAT_0=null;
        Token this_NATURAL_1=null;


        	enterRule();

        try {
            // InternalClassData.g:899:2: ( (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL ) )
            // InternalClassData.g:900:2: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
            {
            // InternalClassData.g:900:2: (this_TFLOAT_0= RULE_TFLOAT | this_NATURAL_1= RULE_NATURAL )
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
                    // InternalClassData.g:901:3: this_TFLOAT_0= RULE_TFLOAT
                    {
                    this_TFLOAT_0=(Token)match(input,RULE_TFLOAT,FOLLOW_2); 

                    			current.merge(this_TFLOAT_0);
                    		

                    			newLeafNode(this_TFLOAT_0, grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalClassData.g:909:3: this_NATURAL_1= RULE_NATURAL
                    {
                    this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000044022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001100020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});

}