package de.cau.cs.kieler.klassviz.text.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassDataParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_STRING", "RULE_TFLOAT", "RULE_NATURAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'project'", "'bundle'", "'metamodel'", "'='", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'depend'", "'('", "')'", "','", "'/'", "'.'"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_ID=8;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_TFLOAT=6;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g"; }


     
     	private ClassDataGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ClassDataGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleKClassModel"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:60:1: entryRuleKClassModel : ruleKClassModel EOF ;
    public final void entryRuleKClassModel() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:61:1: ( ruleKClassModel EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:62:1: ruleKClassModel EOF
            {
             before(grammarAccess.getKClassModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKClassModel_in_entryRuleKClassModel61);
            ruleKClassModel();

            state._fsp--;

             after(grammarAccess.getKClassModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKClassModel68); 

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
    // $ANTLR end "entryRuleKClassModel"


    // $ANTLR start "ruleKClassModel"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:69:1: ruleKClassModel : ( ( rule__KClassModel__Group__0 ) ) ;
    public final void ruleKClassModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:73:2: ( ( ( rule__KClassModel__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:74:1: ( ( rule__KClassModel__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:74:1: ( ( rule__KClassModel__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:75:1: ( rule__KClassModel__Group__0 )
            {
             before(grammarAccess.getKClassModelAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:76:1: ( rule__KClassModel__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:76:2: rule__KClassModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__0_in_ruleKClassModel94);
            rule__KClassModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKClassModelAccess().getGroup()); 

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
    // $ANTLR end "ruleKClassModel"


    // $ANTLR start "entryRuleKOption"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:88:1: entryRuleKOption : ruleKOption EOF ;
    public final void entryRuleKOption() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:89:1: ( ruleKOption EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:90:1: ruleKOption EOF
            {
             before(grammarAccess.getKOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKOption_in_entryRuleKOption121);
            ruleKOption();

            state._fsp--;

             after(grammarAccess.getKOptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKOption128); 

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
    // $ANTLR end "entryRuleKOption"


    // $ANTLR start "ruleKOption"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:97:1: ruleKOption : ( ( rule__KOption__Group__0 ) ) ;
    public final void ruleKOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:101:2: ( ( ( rule__KOption__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:102:1: ( ( rule__KOption__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:102:1: ( ( rule__KOption__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:103:1: ( rule__KOption__Group__0 )
            {
             before(grammarAccess.getKOptionAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:104:1: ( rule__KOption__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:104:2: rule__KOption__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__0_in_ruleKOption154);
            rule__KOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleKOption"


    // $ANTLR start "entryRuleKPackage"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:116:1: entryRuleKPackage : ruleKPackage EOF ;
    public final void entryRuleKPackage() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:117:1: ( ruleKPackage EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:118:1: ruleKPackage EOF
            {
             before(grammarAccess.getKPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_entryRuleKPackage181);
            ruleKPackage();

            state._fsp--;

             after(grammarAccess.getKPackageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKPackage188); 

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
    // $ANTLR end "entryRuleKPackage"


    // $ANTLR start "ruleKPackage"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:125:1: ruleKPackage : ( ( rule__KPackage__Group__0 ) ) ;
    public final void ruleKPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:129:2: ( ( ( rule__KPackage__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:130:1: ( ( rule__KPackage__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:130:1: ( ( rule__KPackage__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:131:1: ( rule__KPackage__Group__0 )
            {
             before(grammarAccess.getKPackageAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:132:1: ( rule__KPackage__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:132:2: rule__KPackage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__0_in_ruleKPackage214);
            rule__KPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKPackageAccess().getGroup()); 

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
    // $ANTLR end "ruleKPackage"


    // $ANTLR start "entryRuleKType"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:144:1: entryRuleKType : ruleKType EOF ;
    public final void entryRuleKType() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:145:1: ( ruleKType EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:146:1: ruleKType EOF
            {
             before(grammarAccess.getKTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_entryRuleKType241);
            ruleKType();

            state._fsp--;

             after(grammarAccess.getKTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKType248); 

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
    // $ANTLR end "entryRuleKType"


    // $ANTLR start "ruleKType"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:153:1: ruleKType : ( ( rule__KType__Group__0 ) ) ;
    public final void ruleKType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:157:2: ( ( ( rule__KType__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:158:1: ( ( rule__KType__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:158:1: ( ( rule__KType__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:159:1: ( rule__KType__Group__0 )
            {
             before(grammarAccess.getKTypeAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:160:1: ( rule__KType__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:160:2: rule__KType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__0_in_ruleKType274);
            rule__KType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleKType"


    // $ANTLR start "entryRuleKClass"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:172:1: entryRuleKClass : ruleKClass EOF ;
    public final void entryRuleKClass() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:173:1: ( ruleKClass EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:174:1: ruleKClass EOF
            {
             before(grammarAccess.getKClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKClass_in_entryRuleKClass301);
            ruleKClass();

            state._fsp--;

             after(grammarAccess.getKClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKClass308); 

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
    // $ANTLR end "entryRuleKClass"


    // $ANTLR start "ruleKClass"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:181:1: ruleKClass : ( ( rule__KClass__Group__0 ) ) ;
    public final void ruleKClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:185:2: ( ( ( rule__KClass__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:186:1: ( ( rule__KClass__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:186:1: ( ( rule__KClass__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:187:1: ( rule__KClass__Group__0 )
            {
             before(grammarAccess.getKClassAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:188:1: ( rule__KClass__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:188:2: rule__KClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__0_in_ruleKClass334);
            rule__KClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKClassAccess().getGroup()); 

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
    // $ANTLR end "ruleKClass"


    // $ANTLR start "entryRuleKInterface"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:200:1: entryRuleKInterface : ruleKInterface EOF ;
    public final void entryRuleKInterface() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:201:1: ( ruleKInterface EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:202:1: ruleKInterface EOF
            {
             before(grammarAccess.getKInterfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_entryRuleKInterface361);
            ruleKInterface();

            state._fsp--;

             after(grammarAccess.getKInterfaceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKInterface368); 

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
    // $ANTLR end "entryRuleKInterface"


    // $ANTLR start "ruleKInterface"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:209:1: ruleKInterface : ( ( rule__KInterface__Group__0 ) ) ;
    public final void ruleKInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:213:2: ( ( ( rule__KInterface__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:214:1: ( ( rule__KInterface__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:214:1: ( ( rule__KInterface__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:215:1: ( rule__KInterface__Group__0 )
            {
             before(grammarAccess.getKInterfaceAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:216:1: ( rule__KInterface__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:216:2: rule__KInterface__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__0_in_ruleKInterface394);
            rule__KInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleKInterface"


    // $ANTLR start "entryRuleKEnum"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:228:1: entryRuleKEnum : ruleKEnum EOF ;
    public final void entryRuleKEnum() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:229:1: ( ruleKEnum EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:230:1: ruleKEnum EOF
            {
             before(grammarAccess.getKEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_entryRuleKEnum421);
            ruleKEnum();

            state._fsp--;

             after(grammarAccess.getKEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKEnum428); 

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
    // $ANTLR end "entryRuleKEnum"


    // $ANTLR start "ruleKEnum"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:237:1: ruleKEnum : ( ( rule__KEnum__Group__0 ) ) ;
    public final void ruleKEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:241:2: ( ( ( rule__KEnum__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:242:1: ( ( rule__KEnum__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:242:1: ( ( rule__KEnum__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:243:1: ( rule__KEnum__Group__0 )
            {
             before(grammarAccess.getKEnumAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:244:1: ( rule__KEnum__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:244:2: rule__KEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__0_in_ruleKEnum454);
            rule__KEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleKEnum"


    // $ANTLR start "entryRuleKDependency"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:256:1: entryRuleKDependency : ruleKDependency EOF ;
    public final void entryRuleKDependency() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:257:1: ( ruleKDependency EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:258:1: ruleKDependency EOF
            {
             before(grammarAccess.getKDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKDependency_in_entryRuleKDependency481);
            ruleKDependency();

            state._fsp--;

             after(grammarAccess.getKDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKDependency488); 

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
    // $ANTLR end "entryRuleKDependency"


    // $ANTLR start "ruleKDependency"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:265:1: ruleKDependency : ( ( rule__KDependency__Group__0 ) ) ;
    public final void ruleKDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:269:2: ( ( ( rule__KDependency__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:270:1: ( ( rule__KDependency__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:270:1: ( ( rule__KDependency__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:271:1: ( rule__KDependency__Group__0 )
            {
             before(grammarAccess.getKDependencyAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:272:1: ( rule__KDependency__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:272:2: rule__KDependency__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__0_in_ruleKDependency514);
            rule__KDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleKDependency"


    // $ANTLR start "entryRuleKField"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:284:1: entryRuleKField : ruleKField EOF ;
    public final void entryRuleKField() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:285:1: ( ruleKField EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:286:1: ruleKField EOF
            {
             before(grammarAccess.getKFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_entryRuleKField541);
            ruleKField();

            state._fsp--;

             after(grammarAccess.getKFieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKField548); 

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
    // $ANTLR end "entryRuleKField"


    // $ANTLR start "ruleKField"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:293:1: ruleKField : ( ( rule__KField__NameAssignment ) ) ;
    public final void ruleKField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:297:2: ( ( ( rule__KField__NameAssignment ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:298:1: ( ( rule__KField__NameAssignment ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:298:1: ( ( rule__KField__NameAssignment ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:299:1: ( rule__KField__NameAssignment )
            {
             before(grammarAccess.getKFieldAccess().getNameAssignment()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:300:1: ( rule__KField__NameAssignment )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:300:2: rule__KField__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__KField__NameAssignment_in_ruleKField574);
            rule__KField__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKFieldAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleKField"


    // $ANTLR start "entryRuleKMethod"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:312:1: entryRuleKMethod : ruleKMethod EOF ;
    public final void entryRuleKMethod() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:313:1: ( ruleKMethod EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:314:1: ruleKMethod EOF
            {
             before(grammarAccess.getKMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_entryRuleKMethod601);
            ruleKMethod();

            state._fsp--;

             after(grammarAccess.getKMethodRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKMethod608); 

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
    // $ANTLR end "entryRuleKMethod"


    // $ANTLR start "ruleKMethod"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:321:1: ruleKMethod : ( ( rule__KMethod__Group__0 ) ) ;
    public final void ruleKMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:325:2: ( ( ( rule__KMethod__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:326:1: ( ( rule__KMethod__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:326:1: ( ( rule__KMethod__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:327:1: ( rule__KMethod__Group__0 )
            {
             before(grammarAccess.getKMethodAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:328:1: ( rule__KMethod__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:328:2: rule__KMethod__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__0_in_ruleKMethod634);
            rule__KMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleKMethod"


    // $ANTLR start "entryRuleKTypeReference"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:340:1: entryRuleKTypeReference : ruleKTypeReference EOF ;
    public final void entryRuleKTypeReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:341:1: ( ruleKTypeReference EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:342:1: ruleKTypeReference EOF
            {
             before(grammarAccess.getKTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference661);
            ruleKTypeReference();

            state._fsp--;

             after(grammarAccess.getKTypeReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKTypeReference668); 

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
    // $ANTLR end "entryRuleKTypeReference"


    // $ANTLR start "ruleKTypeReference"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:349:1: ruleKTypeReference : ( ( rule__KTypeReference__SignatureAssignment ) ) ;
    public final void ruleKTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:353:2: ( ( ( rule__KTypeReference__SignatureAssignment ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:354:1: ( ( rule__KTypeReference__SignatureAssignment ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:354:1: ( ( rule__KTypeReference__SignatureAssignment ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:355:1: ( rule__KTypeReference__SignatureAssignment )
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureAssignment()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:356:1: ( rule__KTypeReference__SignatureAssignment )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:356:2: rule__KTypeReference__SignatureAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__KTypeReference__SignatureAssignment_in_ruleKTypeReference694);
            rule__KTypeReference__SignatureAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKTypeReferenceAccess().getSignatureAssignment()); 

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
    // $ANTLR end "ruleKTypeReference"


    // $ANTLR start "entryRuleMetaModelID"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:368:1: entryRuleMetaModelID : ruleMetaModelID EOF ;
    public final void entryRuleMetaModelID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:369:1: ( ruleMetaModelID EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:370:1: ruleMetaModelID EOF
            {
             before(grammarAccess.getMetaModelIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaModelID_in_entryRuleMetaModelID721);
            ruleMetaModelID();

            state._fsp--;

             after(grammarAccess.getMetaModelIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaModelID728); 

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
    // $ANTLR end "entryRuleMetaModelID"


    // $ANTLR start "ruleMetaModelID"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:377:1: ruleMetaModelID : ( ( rule__MetaModelID__Group__0 ) ) ;
    public final void ruleMetaModelID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:381:2: ( ( ( rule__MetaModelID__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:382:1: ( ( rule__MetaModelID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:382:1: ( ( rule__MetaModelID__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:383:1: ( rule__MetaModelID__Group__0 )
            {
             before(grammarAccess.getMetaModelIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:384:1: ( rule__MetaModelID__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:384:2: rule__MetaModelID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__0_in_ruleMetaModelID754);
            rule__MetaModelID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaModelIDAccess().getGroup()); 

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
    // $ANTLR end "ruleMetaModelID"


    // $ANTLR start "entryRuleQualifiedID"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:396:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:397:1: ( ruleQualifiedID EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:398:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID781);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID788); 

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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:405:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:409:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:410:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:410:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:411:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:412:1: ( rule__QualifiedID__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:412:2: rule__QualifiedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID814);
            rule__QualifiedID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRulePropertyValue"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:424:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:425:1: ( rulePropertyValue EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:426:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_entryRulePropertyValue841);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValue848); 

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:433:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:437:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:438:1: ( ( rule__PropertyValue__Alternatives ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:438:1: ( ( rule__PropertyValue__Alternatives ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:439:1: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:440:1: ( rule__PropertyValue__Alternatives )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:440:2: rule__PropertyValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValue__Alternatives_in_rulePropertyValue874);
            rule__PropertyValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getAlternatives()); 

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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleFloat"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:452:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:453:1: ( ruleFloat EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:454:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat901);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat908); 

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:461:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:465:2: ( ( ( rule__Float__Alternatives ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:466:1: ( ( rule__Float__Alternatives ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:466:1: ( ( rule__Float__Alternatives ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:467:1: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:468:1: ( rule__Float__Alternatives )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:468:2: rule__Float__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Float__Alternatives_in_ruleFloat934);
            rule__Float__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "rule__KClassModel__Alternatives_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:480:1: rule__KClassModel__Alternatives_1_1 : ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) | ( ( rule__KClassModel__Group_1_1_2__0 ) ) );
    public final void rule__KClassModel__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:484:1: ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) | ( ( rule__KClassModel__Group_1_1_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:485:1: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:485:1: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:486:1: ( rule__KClassModel__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:487:1: ( rule__KClassModel__Group_1_1_0__0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:487:2: rule__KClassModel__Group_1_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__0_in_rule__KClassModel__Alternatives_1_1970);
                    rule__KClassModel__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:491:6: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:491:6: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:492:1: ( rule__KClassModel__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:493:1: ( rule__KClassModel__Group_1_1_1__0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:493:2: rule__KClassModel__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__0_in_rule__KClassModel__Alternatives_1_1988);
                    rule__KClassModel__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:497:6: ( ( rule__KClassModel__Group_1_1_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:497:6: ( ( rule__KClassModel__Group_1_1_2__0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:498:1: ( rule__KClassModel__Group_1_1_2__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_2()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:499:1: ( rule__KClassModel__Group_1_1_2__0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:499:2: rule__KClassModel__Group_1_1_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_2__0_in_rule__KClassModel__Alternatives_1_11006);
                    rule__KClassModel__Group_1_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassModelAccess().getGroup_1_1_2()); 

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
    // $ANTLR end "rule__KClassModel__Alternatives_1_1"


    // $ANTLR start "rule__KType__Alternatives_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:508:1: rule__KType__Alternatives_0 : ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) );
    public final void rule__KType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:512:1: ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:513:1: ( ruleKClass )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:513:1: ( ruleKClass )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:514:1: ruleKClass
                    {
                     before(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKClass_in_rule__KType__Alternatives_01039);
                    ruleKClass();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:519:6: ( ruleKInterface )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:519:6: ( ruleKInterface )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:520:1: ruleKInterface
                    {
                     before(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_rule__KType__Alternatives_01056);
                    ruleKInterface();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:525:6: ( ruleKEnum )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:525:6: ( ruleKEnum )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:526:1: ruleKEnum
                    {
                     before(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_rule__KType__Alternatives_01073);
                    ruleKEnum();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__KType__Alternatives_0"


    // $ANTLR start "rule__KType__Alternatives_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:536:1: rule__KType__Alternatives_1_1 : ( ( ( rule__KType__FieldsAssignment_1_1_0 ) ) | ( ( rule__KType__MethodsAssignment_1_1_1 ) ) | ( ( rule__KType__DependenciesAssignment_1_1_2 ) ) );
    public final void rule__KType__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:540:1: ( ( ( rule__KType__FieldsAssignment_1_1_0 ) ) | ( ( rule__KType__MethodsAssignment_1_1_1 ) ) | ( ( rule__KType__DependenciesAssignment_1_1_2 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==24) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID||LA3_1==19||LA3_1==23) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==23) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:541:1: ( ( rule__KType__FieldsAssignment_1_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:541:1: ( ( rule__KType__FieldsAssignment_1_1_0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:542:1: ( rule__KType__FieldsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:543:1: ( rule__KType__FieldsAssignment_1_1_0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:543:2: rule__KType__FieldsAssignment_1_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__FieldsAssignment_1_1_0_in_rule__KType__Alternatives_1_11105);
                    rule__KType__FieldsAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:547:6: ( ( rule__KType__MethodsAssignment_1_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:547:6: ( ( rule__KType__MethodsAssignment_1_1_1 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:548:1: ( rule__KType__MethodsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:549:1: ( rule__KType__MethodsAssignment_1_1_1 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:549:2: rule__KType__MethodsAssignment_1_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__MethodsAssignment_1_1_1_in_rule__KType__Alternatives_1_11123);
                    rule__KType__MethodsAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:553:6: ( ( rule__KType__DependenciesAssignment_1_1_2 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:553:6: ( ( rule__KType__DependenciesAssignment_1_1_2 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:554:1: ( rule__KType__DependenciesAssignment_1_1_2 )
                    {
                     before(grammarAccess.getKTypeAccess().getDependenciesAssignment_1_1_2()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:555:1: ( rule__KType__DependenciesAssignment_1_1_2 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:555:2: rule__KType__DependenciesAssignment_1_1_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__DependenciesAssignment_1_1_2_in_rule__KType__Alternatives_1_11141);
                    rule__KType__DependenciesAssignment_1_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getKTypeAccess().getDependenciesAssignment_1_1_2()); 

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
    // $ANTLR end "rule__KType__Alternatives_1_1"


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:564:1: rule__PropertyValue__Alternatives : ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:568:1: ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_TFLOAT:
            case RULE_NATURAL:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:569:1: ( RULE_BOOLEAN )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:569:1: ( RULE_BOOLEAN )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:570:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1174); 
                     after(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:575:6: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:575:6: ( RULE_STRING )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:576:1: RULE_STRING
                    {
                     before(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1191); 
                     after(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:581:6: ( ruleFloat )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:581:6: ( ruleFloat )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:582:1: ruleFloat
                    {
                     before(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1208);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:587:6: ( ruleQualifiedID )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:587:6: ( ruleQualifiedID )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:588:1: ruleQualifiedID
                    {
                     before(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1225);
                    ruleQualifiedID();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); 

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
    // $ANTLR end "rule__PropertyValue__Alternatives"


    // $ANTLR start "rule__Float__Alternatives"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:598:1: rule__Float__Alternatives : ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:602:1: ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_TFLOAT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NATURAL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:603:1: ( RULE_TFLOAT )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:603:1: ( RULE_TFLOAT )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:604:1: RULE_TFLOAT
                    {
                     before(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                    match(input,RULE_TFLOAT,FollowSets000.FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1257); 
                     after(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:609:6: ( RULE_NATURAL )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:609:6: ( RULE_NATURAL )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:610:1: RULE_NATURAL
                    {
                     before(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); 
                    match(input,RULE_NATURAL,FollowSets000.FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1274); 
                     after(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Float__Alternatives"


    // $ANTLR start "rule__KClassModel__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:622:1: rule__KClassModel__Group__0 : rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 ;
    public final void rule__KClassModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:626:1: ( rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:627:2: rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01304);
            rule__KClassModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01307);
            rule__KClassModel__Group__1();

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
    // $ANTLR end "rule__KClassModel__Group__0"


    // $ANTLR start "rule__KClassModel__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:634:1: rule__KClassModel__Group__0__Impl : ( () ) ;
    public final void rule__KClassModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:638:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:639:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:639:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:640:1: ()
            {
             before(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:641:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:643:1: 
            {
            }

             after(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KClassModel__Group__0__Impl"


    // $ANTLR start "rule__KClassModel__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:653:1: rule__KClassModel__Group__1 : rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 ;
    public final void rule__KClassModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:657:1: ( rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:658:2: rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11365);
            rule__KClassModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11368);
            rule__KClassModel__Group__2();

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
    // $ANTLR end "rule__KClassModel__Group__1"


    // $ANTLR start "rule__KClassModel__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:665:1: rule__KClassModel__Group__1__Impl : ( ( rule__KClassModel__Group_1__0 )* ) ;
    public final void rule__KClassModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:669:1: ( ( ( rule__KClassModel__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:670:1: ( ( rule__KClassModel__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:670:1: ( ( rule__KClassModel__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:671:1: ( rule__KClassModel__Group_1__0 )*
            {
             before(grammarAccess.getKClassModelAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:672:1: ( rule__KClassModel__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:672:2: rule__KClassModel__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1395);
            	    rule__KClassModel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getKClassModelAccess().getGroup_1()); 

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
    // $ANTLR end "rule__KClassModel__Group__1__Impl"


    // $ANTLR start "rule__KClassModel__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:682:1: rule__KClassModel__Group__2 : rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 ;
    public final void rule__KClassModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:686:1: ( rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:687:2: rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21426);
            rule__KClassModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21429);
            rule__KClassModel__Group__3();

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
    // $ANTLR end "rule__KClassModel__Group__2"


    // $ANTLR start "rule__KClassModel__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:694:1: rule__KClassModel__Group__2__Impl : ( ( rule__KClassModel__OptionsAssignment_2 )* ) ;
    public final void rule__KClassModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:698:1: ( ( ( rule__KClassModel__OptionsAssignment_2 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:699:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:699:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:700:1: ( rule__KClassModel__OptionsAssignment_2 )*
            {
             before(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:701:1: ( rule__KClassModel__OptionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:701:2: rule__KClassModel__OptionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1456);
            	    rule__KClassModel__OptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); 

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
    // $ANTLR end "rule__KClassModel__Group__2__Impl"


    // $ANTLR start "rule__KClassModel__Group__3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:711:1: rule__KClassModel__Group__3 : rule__KClassModel__Group__3__Impl ;
    public final void rule__KClassModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:715:1: ( rule__KClassModel__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:716:2: rule__KClassModel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31487);
            rule__KClassModel__Group__3__Impl();

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
    // $ANTLR end "rule__KClassModel__Group__3"


    // $ANTLR start "rule__KClassModel__Group__3__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:722:1: rule__KClassModel__Group__3__Impl : ( ( rule__KClassModel__PackagesAssignment_3 )* ) ;
    public final void rule__KClassModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:726:1: ( ( ( rule__KClassModel__PackagesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:727:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:727:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:728:1: ( rule__KClassModel__PackagesAssignment_3 )*
            {
             before(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:729:1: ( rule__KClassModel__PackagesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:729:2: rule__KClassModel__PackagesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1514);
            	    rule__KClassModel__PackagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); 

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
    // $ANTLR end "rule__KClassModel__Group__3__Impl"


    // $ANTLR start "rule__KClassModel__Group_1__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:747:1: rule__KClassModel__Group_1__0 : rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 ;
    public final void rule__KClassModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:751:1: ( rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:752:2: rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01553);
            rule__KClassModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01556);
            rule__KClassModel__Group_1__1();

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
    // $ANTLR end "rule__KClassModel__Group_1__0"


    // $ANTLR start "rule__KClassModel__Group_1__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:759:1: rule__KClassModel__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__KClassModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:763:1: ( ( 'import' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:764:1: ( 'import' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:764:1: ( 'import' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:765:1: 'import'
            {
             before(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__KClassModel__Group_1__0__Impl1584); 
             after(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); 

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
    // $ANTLR end "rule__KClassModel__Group_1__0__Impl"


    // $ANTLR start "rule__KClassModel__Group_1__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:778:1: rule__KClassModel__Group_1__1 : rule__KClassModel__Group_1__1__Impl ;
    public final void rule__KClassModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:782:1: ( rule__KClassModel__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:783:2: rule__KClassModel__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11615);
            rule__KClassModel__Group_1__1__Impl();

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
    // $ANTLR end "rule__KClassModel__Group_1__1"


    // $ANTLR start "rule__KClassModel__Group_1__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:789:1: rule__KClassModel__Group_1__1__Impl : ( ( rule__KClassModel__Alternatives_1_1 ) ) ;
    public final void rule__KClassModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:793:1: ( ( ( rule__KClassModel__Alternatives_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:794:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:794:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:795:1: ( rule__KClassModel__Alternatives_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:796:1: ( rule__KClassModel__Alternatives_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:796:2: rule__KClassModel__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1642);
            rule__KClassModel__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__KClassModel__Group_1__1__Impl"


    // $ANTLR start "rule__KClassModel__Group_1_1_0__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:810:1: rule__KClassModel__Group_1_1_0__0 : rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 ;
    public final void rule__KClassModel__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:814:1: ( rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:815:2: rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01676);
            rule__KClassModel__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01679);
            rule__KClassModel__Group_1_1_0__1();

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
    // $ANTLR end "rule__KClassModel__Group_1_1_0__0"


    // $ANTLR start "rule__KClassModel__Group_1_1_0__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:822:1: rule__KClassModel__Group_1_1_0__0__Impl : ( 'project' ) ;
    public final void rule__KClassModel__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:826:1: ( ( 'project' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:827:1: ( 'project' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:827:1: ( 'project' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:828:1: 'project'
            {
             before(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__KClassModel__Group_1_1_0__0__Impl1707); 
             after(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); 

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
    // $ANTLR end "rule__KClassModel__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__KClassModel__Group_1_1_0__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:841:1: rule__KClassModel__Group_1_1_0__1 : rule__KClassModel__Group_1_1_0__1__Impl ;
    public final void rule__KClassModel__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:845:1: ( rule__KClassModel__Group_1_1_0__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:846:2: rule__KClassModel__Group_1_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11738);
            rule__KClassModel__Group_1_1_0__1__Impl();

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
    // $ANTLR end "rule__KClassModel__Group_1_1_0__1"


    // $ANTLR start "rule__KClassModel__Group_1_1_0__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:852:1: rule__KClassModel__Group_1_1_0__1__Impl : ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:856:1: ( ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:857:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:857:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:858:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:859:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:859:2: rule__KClassModel__JavaProjectsAssignment_1_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1765);
            rule__KClassModel__JavaProjectsAssignment_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); 

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
    // $ANTLR end "rule__KClassModel__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__KClassModel__Group_1_1_1__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:873:1: rule__KClassModel__Group_1_1_1__0 : rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 ;
    public final void rule__KClassModel__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:877:1: ( rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:878:2: rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01799);
            rule__KClassModel__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01802);
            rule__KClassModel__Group_1_1_1__1();

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
    // $ANTLR end "rule__KClassModel__Group_1_1_1__0"


    // $ANTLR start "rule__KClassModel__Group_1_1_1__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:885:1: rule__KClassModel__Group_1_1_1__0__Impl : ( 'bundle' ) ;
    public final void rule__KClassModel__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:889:1: ( ( 'bundle' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:890:1: ( 'bundle' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:890:1: ( 'bundle' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:891:1: 'bundle'
            {
             before(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KClassModel__Group_1_1_1__0__Impl1830); 
             after(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__KClassModel__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__KClassModel__Group_1_1_1__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:904:1: rule__KClassModel__Group_1_1_1__1 : rule__KClassModel__Group_1_1_1__1__Impl ;
    public final void rule__KClassModel__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:908:1: ( rule__KClassModel__Group_1_1_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:909:2: rule__KClassModel__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11861);
            rule__KClassModel__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__KClassModel__Group_1_1_1__1"


    // $ANTLR start "rule__KClassModel__Group_1_1_1__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:915:1: rule__KClassModel__Group_1_1_1__1__Impl : ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:919:1: ( ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:920:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:920:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:921:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:922:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:922:2: rule__KClassModel__BundlesAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1888);
            rule__KClassModel__BundlesAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__KClassModel__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__KClassModel__Group_1_1_2__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:936:1: rule__KClassModel__Group_1_1_2__0 : rule__KClassModel__Group_1_1_2__0__Impl rule__KClassModel__Group_1_1_2__1 ;
    public final void rule__KClassModel__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:940:1: ( rule__KClassModel__Group_1_1_2__0__Impl rule__KClassModel__Group_1_1_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:941:2: rule__KClassModel__Group_1_1_2__0__Impl rule__KClassModel__Group_1_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_2__0__Impl_in_rule__KClassModel__Group_1_1_2__01922);
            rule__KClassModel__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_2__1_in_rule__KClassModel__Group_1_1_2__01925);
            rule__KClassModel__Group_1_1_2__1();

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
    // $ANTLR end "rule__KClassModel__Group_1_1_2__0"


    // $ANTLR start "rule__KClassModel__Group_1_1_2__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:948:1: rule__KClassModel__Group_1_1_2__0__Impl : ( 'metamodel' ) ;
    public final void rule__KClassModel__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:952:1: ( ( 'metamodel' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:953:1: ( 'metamodel' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:953:1: ( 'metamodel' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:954:1: 'metamodel'
            {
             before(grammarAccess.getKClassModelAccess().getMetamodelKeyword_1_1_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KClassModel__Group_1_1_2__0__Impl1953); 
             after(grammarAccess.getKClassModelAccess().getMetamodelKeyword_1_1_2_0()); 

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
    // $ANTLR end "rule__KClassModel__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__KClassModel__Group_1_1_2__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:967:1: rule__KClassModel__Group_1_1_2__1 : rule__KClassModel__Group_1_1_2__1__Impl ;
    public final void rule__KClassModel__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:971:1: ( rule__KClassModel__Group_1_1_2__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:972:2: rule__KClassModel__Group_1_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_2__1__Impl_in_rule__KClassModel__Group_1_1_2__11984);
            rule__KClassModel__Group_1_1_2__1__Impl();

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
    // $ANTLR end "rule__KClassModel__Group_1_1_2__1"


    // $ANTLR start "rule__KClassModel__Group_1_1_2__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:978:1: rule__KClassModel__Group_1_1_2__1__Impl : ( ( rule__KClassModel__MetamodelsAssignment_1_1_2_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:982:1: ( ( ( rule__KClassModel__MetamodelsAssignment_1_1_2_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:983:1: ( ( rule__KClassModel__MetamodelsAssignment_1_1_2_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:983:1: ( ( rule__KClassModel__MetamodelsAssignment_1_1_2_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:984:1: ( rule__KClassModel__MetamodelsAssignment_1_1_2_1 )
            {
             before(grammarAccess.getKClassModelAccess().getMetamodelsAssignment_1_1_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:985:1: ( rule__KClassModel__MetamodelsAssignment_1_1_2_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:985:2: rule__KClassModel__MetamodelsAssignment_1_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__MetamodelsAssignment_1_1_2_1_in_rule__KClassModel__Group_1_1_2__1__Impl2011);
            rule__KClassModel__MetamodelsAssignment_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getKClassModelAccess().getMetamodelsAssignment_1_1_2_1()); 

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
    // $ANTLR end "rule__KClassModel__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__KOption__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:999:1: rule__KOption__Group__0 : rule__KOption__Group__0__Impl rule__KOption__Group__1 ;
    public final void rule__KOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1003:1: ( rule__KOption__Group__0__Impl rule__KOption__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1004:2: rule__KOption__Group__0__Impl rule__KOption__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__02045);
            rule__KOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__02048);
            rule__KOption__Group__1();

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
    // $ANTLR end "rule__KOption__Group__0"


    // $ANTLR start "rule__KOption__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1011:1: rule__KOption__Group__0__Impl : ( () ) ;
    public final void rule__KOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1015:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1016:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1016:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1017:1: ()
            {
             before(grammarAccess.getKOptionAccess().getKOptionAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1018:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1020:1: 
            {
            }

             after(grammarAccess.getKOptionAccess().getKOptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KOption__Group__0__Impl"


    // $ANTLR start "rule__KOption__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1030:1: rule__KOption__Group__1 : rule__KOption__Group__1__Impl rule__KOption__Group__2 ;
    public final void rule__KOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1034:1: ( rule__KOption__Group__1__Impl rule__KOption__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1035:2: rule__KOption__Group__1__Impl rule__KOption__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__12106);
            rule__KOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__12109);
            rule__KOption__Group__2();

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
    // $ANTLR end "rule__KOption__Group__1"


    // $ANTLR start "rule__KOption__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1042:1: rule__KOption__Group__1__Impl : ( ( rule__KOption__KeyAssignment_1 ) ) ;
    public final void rule__KOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1046:1: ( ( ( rule__KOption__KeyAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1047:1: ( ( rule__KOption__KeyAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1047:1: ( ( rule__KOption__KeyAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1048:1: ( rule__KOption__KeyAssignment_1 )
            {
             before(grammarAccess.getKOptionAccess().getKeyAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1049:1: ( rule__KOption__KeyAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1049:2: rule__KOption__KeyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl2136);
            rule__KOption__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKOptionAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__KOption__Group__1__Impl"


    // $ANTLR start "rule__KOption__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1059:1: rule__KOption__Group__2 : rule__KOption__Group__2__Impl rule__KOption__Group__3 ;
    public final void rule__KOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1063:1: ( rule__KOption__Group__2__Impl rule__KOption__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1064:2: rule__KOption__Group__2__Impl rule__KOption__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__22166);
            rule__KOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__22169);
            rule__KOption__Group__3();

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
    // $ANTLR end "rule__KOption__Group__2"


    // $ANTLR start "rule__KOption__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1071:1: rule__KOption__Group__2__Impl : ( '=' ) ;
    public final void rule__KOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1075:1: ( ( '=' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1076:1: ( '=' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1076:1: ( '=' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1077:1: '='
            {
             before(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KOption__Group__2__Impl2197); 
             after(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__KOption__Group__2__Impl"


    // $ANTLR start "rule__KOption__Group__3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1090:1: rule__KOption__Group__3 : rule__KOption__Group__3__Impl ;
    public final void rule__KOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1094:1: ( rule__KOption__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1095:2: rule__KOption__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32228);
            rule__KOption__Group__3__Impl();

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
    // $ANTLR end "rule__KOption__Group__3"


    // $ANTLR start "rule__KOption__Group__3__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1101:1: rule__KOption__Group__3__Impl : ( ( rule__KOption__ValueAssignment_3 ) ) ;
    public final void rule__KOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:1: ( ( ( rule__KOption__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1106:1: ( ( rule__KOption__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1106:1: ( ( rule__KOption__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1107:1: ( rule__KOption__ValueAssignment_3 )
            {
             before(grammarAccess.getKOptionAccess().getValueAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1108:1: ( rule__KOption__ValueAssignment_3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1108:2: rule__KOption__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2255);
            rule__KOption__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKOptionAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__KOption__Group__3__Impl"


    // $ANTLR start "rule__KPackage__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1126:1: rule__KPackage__Group__0 : rule__KPackage__Group__0__Impl rule__KPackage__Group__1 ;
    public final void rule__KPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1130:1: ( rule__KPackage__Group__0__Impl rule__KPackage__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1131:2: rule__KPackage__Group__0__Impl rule__KPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02293);
            rule__KPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02296);
            rule__KPackage__Group__1();

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
    // $ANTLR end "rule__KPackage__Group__0"


    // $ANTLR start "rule__KPackage__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1138:1: rule__KPackage__Group__0__Impl : ( 'package' ) ;
    public final void rule__KPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1142:1: ( ( 'package' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1143:1: ( 'package' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1143:1: ( 'package' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1144:1: 'package'
            {
             before(grammarAccess.getKPackageAccess().getPackageKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KPackage__Group__0__Impl2324); 
             after(grammarAccess.getKPackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__KPackage__Group__0__Impl"


    // $ANTLR start "rule__KPackage__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1157:1: rule__KPackage__Group__1 : rule__KPackage__Group__1__Impl rule__KPackage__Group__2 ;
    public final void rule__KPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1161:1: ( rule__KPackage__Group__1__Impl rule__KPackage__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1162:2: rule__KPackage__Group__1__Impl rule__KPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12355);
            rule__KPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12358);
            rule__KPackage__Group__2();

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
    // $ANTLR end "rule__KPackage__Group__1"


    // $ANTLR start "rule__KPackage__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1169:1: rule__KPackage__Group__1__Impl : ( ( rule__KPackage__NameAssignment_1 ) ) ;
    public final void rule__KPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1173:1: ( ( ( rule__KPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1174:1: ( ( rule__KPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1174:1: ( ( rule__KPackage__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1175:1: ( rule__KPackage__NameAssignment_1 )
            {
             before(grammarAccess.getKPackageAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1176:1: ( rule__KPackage__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1176:2: rule__KPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2385);
            rule__KPackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKPackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__KPackage__Group__1__Impl"


    // $ANTLR start "rule__KPackage__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1186:1: rule__KPackage__Group__2 : rule__KPackage__Group__2__Impl rule__KPackage__Group__3 ;
    public final void rule__KPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1190:1: ( rule__KPackage__Group__2__Impl rule__KPackage__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1191:2: rule__KPackage__Group__2__Impl rule__KPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22415);
            rule__KPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22418);
            rule__KPackage__Group__3();

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
    // $ANTLR end "rule__KPackage__Group__2"


    // $ANTLR start "rule__KPackage__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1198:1: rule__KPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__KPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1202:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1203:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1203:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1204:1: '{'
            {
             before(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KPackage__Group__2__Impl2446); 
             after(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__KPackage__Group__2__Impl"


    // $ANTLR start "rule__KPackage__Group__3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1217:1: rule__KPackage__Group__3 : rule__KPackage__Group__3__Impl rule__KPackage__Group__4 ;
    public final void rule__KPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1221:1: ( rule__KPackage__Group__3__Impl rule__KPackage__Group__4 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1222:2: rule__KPackage__Group__3__Impl rule__KPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32477);
            rule__KPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32480);
            rule__KPackage__Group__4();

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
    // $ANTLR end "rule__KPackage__Group__3"


    // $ANTLR start "rule__KPackage__Group__3__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1229:1: rule__KPackage__Group__3__Impl : ( ( rule__KPackage__TypesAssignment_3 )* ) ;
    public final void rule__KPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1233:1: ( ( ( rule__KPackage__TypesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1234:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1234:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1235:1: ( rule__KPackage__TypesAssignment_3 )*
            {
             before(grammarAccess.getKPackageAccess().getTypesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1236:1: ( rule__KPackage__TypesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=20 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1236:2: rule__KPackage__TypesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2507);
            	    rule__KPackage__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getKPackageAccess().getTypesAssignment_3()); 

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
    // $ANTLR end "rule__KPackage__Group__3__Impl"


    // $ANTLR start "rule__KPackage__Group__4"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1246:1: rule__KPackage__Group__4 : rule__KPackage__Group__4__Impl ;
    public final void rule__KPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1250:1: ( rule__KPackage__Group__4__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1251:2: rule__KPackage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42538);
            rule__KPackage__Group__4__Impl();

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
    // $ANTLR end "rule__KPackage__Group__4"


    // $ANTLR start "rule__KPackage__Group__4__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1257:1: rule__KPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__KPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1261:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1262:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1262:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1263:1: '}'
            {
             before(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__KPackage__Group__4__Impl2566); 
             after(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__KPackage__Group__4__Impl"


    // $ANTLR start "rule__KType__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1286:1: rule__KType__Group__0 : rule__KType__Group__0__Impl rule__KType__Group__1 ;
    public final void rule__KType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1290:1: ( rule__KType__Group__0__Impl rule__KType__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1291:2: rule__KType__Group__0__Impl rule__KType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__0__Impl_in_rule__KType__Group__02607);
            rule__KType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__1_in_rule__KType__Group__02610);
            rule__KType__Group__1();

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
    // $ANTLR end "rule__KType__Group__0"


    // $ANTLR start "rule__KType__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1298:1: rule__KType__Group__0__Impl : ( ( rule__KType__Alternatives_0 ) ) ;
    public final void rule__KType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1302:1: ( ( ( rule__KType__Alternatives_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1303:1: ( ( rule__KType__Alternatives_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1303:1: ( ( rule__KType__Alternatives_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1304:1: ( rule__KType__Alternatives_0 )
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1305:1: ( rule__KType__Alternatives_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1305:2: rule__KType__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Alternatives_0_in_rule__KType__Group__0__Impl2637);
            rule__KType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getKTypeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__KType__Group__0__Impl"


    // $ANTLR start "rule__KType__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1315:1: rule__KType__Group__1 : rule__KType__Group__1__Impl ;
    public final void rule__KType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1319:1: ( rule__KType__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1320:2: rule__KType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__1__Impl_in_rule__KType__Group__12667);
            rule__KType__Group__1__Impl();

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
    // $ANTLR end "rule__KType__Group__1"


    // $ANTLR start "rule__KType__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1326:1: rule__KType__Group__1__Impl : ( ( rule__KType__Group_1__0 )? ) ;
    public final void rule__KType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1330:1: ( ( ( rule__KType__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1331:1: ( ( rule__KType__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1331:1: ( ( rule__KType__Group_1__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1332:1: ( rule__KType__Group_1__0 )?
            {
             before(grammarAccess.getKTypeAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1333:1: ( rule__KType__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1333:2: rule__KType__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__0_in_rule__KType__Group__1__Impl2694);
                    rule__KType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__KType__Group__1__Impl"


    // $ANTLR start "rule__KType__Group_1__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1347:1: rule__KType__Group_1__0 : rule__KType__Group_1__0__Impl rule__KType__Group_1__1 ;
    public final void rule__KType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1351:1: ( rule__KType__Group_1__0__Impl rule__KType__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1352:2: rule__KType__Group_1__0__Impl rule__KType__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__0__Impl_in_rule__KType__Group_1__02729);
            rule__KType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__1_in_rule__KType__Group_1__02732);
            rule__KType__Group_1__1();

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
    // $ANTLR end "rule__KType__Group_1__0"


    // $ANTLR start "rule__KType__Group_1__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1359:1: rule__KType__Group_1__0__Impl : ( '{' ) ;
    public final void rule__KType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1363:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1364:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1364:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1365:1: '{'
            {
             before(grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KType__Group_1__0__Impl2760); 
             after(grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__KType__Group_1__0__Impl"


    // $ANTLR start "rule__KType__Group_1__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1378:1: rule__KType__Group_1__1 : rule__KType__Group_1__1__Impl rule__KType__Group_1__2 ;
    public final void rule__KType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1382:1: ( rule__KType__Group_1__1__Impl rule__KType__Group_1__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1383:2: rule__KType__Group_1__1__Impl rule__KType__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__1__Impl_in_rule__KType__Group_1__12791);
            rule__KType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__2_in_rule__KType__Group_1__12794);
            rule__KType__Group_1__2();

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
    // $ANTLR end "rule__KType__Group_1__1"


    // $ANTLR start "rule__KType__Group_1__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1390:1: rule__KType__Group_1__1__Impl : ( ( rule__KType__Alternatives_1_1 )* ) ;
    public final void rule__KType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1394:1: ( ( ( rule__KType__Alternatives_1_1 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1395:1: ( ( rule__KType__Alternatives_1_1 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1395:1: ( ( rule__KType__Alternatives_1_1 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1396:1: ( rule__KType__Alternatives_1_1 )*
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1397:1: ( rule__KType__Alternatives_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1397:2: rule__KType__Alternatives_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KType__Alternatives_1_1_in_rule__KType__Group_1__1__Impl2821);
            	    rule__KType__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getKTypeAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__KType__Group_1__1__Impl"


    // $ANTLR start "rule__KType__Group_1__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1407:1: rule__KType__Group_1__2 : rule__KType__Group_1__2__Impl ;
    public final void rule__KType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1411:1: ( rule__KType__Group_1__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1412:2: rule__KType__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__2__Impl_in_rule__KType__Group_1__22852);
            rule__KType__Group_1__2__Impl();

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
    // $ANTLR end "rule__KType__Group_1__2"


    // $ANTLR start "rule__KType__Group_1__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1418:1: rule__KType__Group_1__2__Impl : ( '}' ) ;
    public final void rule__KType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1422:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1423:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1423:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1424:1: '}'
            {
             before(grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__KType__Group_1__2__Impl2880); 
             after(grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__KType__Group_1__2__Impl"


    // $ANTLR start "rule__KClass__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1443:1: rule__KClass__Group__0 : rule__KClass__Group__0__Impl rule__KClass__Group__1 ;
    public final void rule__KClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1447:1: ( rule__KClass__Group__0__Impl rule__KClass__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1448:2: rule__KClass__Group__0__Impl rule__KClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02917);
            rule__KClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02920);
            rule__KClass__Group__1();

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
    // $ANTLR end "rule__KClass__Group__0"


    // $ANTLR start "rule__KClass__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1455:1: rule__KClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__KClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1459:1: ( ( 'class' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1460:1: ( 'class' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1460:1: ( 'class' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1461:1: 'class'
            {
             before(grammarAccess.getKClassAccess().getClassKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__KClass__Group__0__Impl2948); 
             after(grammarAccess.getKClassAccess().getClassKeyword_0()); 

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
    // $ANTLR end "rule__KClass__Group__0__Impl"


    // $ANTLR start "rule__KClass__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1474:1: rule__KClass__Group__1 : rule__KClass__Group__1__Impl ;
    public final void rule__KClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1478:1: ( rule__KClass__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1479:2: rule__KClass__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12979);
            rule__KClass__Group__1__Impl();

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
    // $ANTLR end "rule__KClass__Group__1"


    // $ANTLR start "rule__KClass__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1485:1: rule__KClass__Group__1__Impl : ( ( rule__KClass__NameAssignment_1 ) ) ;
    public final void rule__KClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1489:1: ( ( ( rule__KClass__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1490:1: ( ( rule__KClass__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1490:1: ( ( rule__KClass__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1491:1: ( rule__KClass__NameAssignment_1 )
            {
             before(grammarAccess.getKClassAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1492:1: ( rule__KClass__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1492:2: rule__KClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl3006);
            rule__KClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__KClass__Group__1__Impl"


    // $ANTLR start "rule__KInterface__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1506:1: rule__KInterface__Group__0 : rule__KInterface__Group__0__Impl rule__KInterface__Group__1 ;
    public final void rule__KInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1510:1: ( rule__KInterface__Group__0__Impl rule__KInterface__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1511:2: rule__KInterface__Group__0__Impl rule__KInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__03040);
            rule__KInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__03043);
            rule__KInterface__Group__1();

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
    // $ANTLR end "rule__KInterface__Group__0"


    // $ANTLR start "rule__KInterface__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1518:1: rule__KInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__KInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1522:1: ( ( 'interface' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1523:1: ( 'interface' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1523:1: ( 'interface' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1524:1: 'interface'
            {
             before(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__KInterface__Group__0__Impl3071); 
             after(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__KInterface__Group__0__Impl"


    // $ANTLR start "rule__KInterface__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1537:1: rule__KInterface__Group__1 : rule__KInterface__Group__1__Impl ;
    public final void rule__KInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1541:1: ( rule__KInterface__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1542:2: rule__KInterface__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__13102);
            rule__KInterface__Group__1__Impl();

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
    // $ANTLR end "rule__KInterface__Group__1"


    // $ANTLR start "rule__KInterface__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1548:1: rule__KInterface__Group__1__Impl : ( ( rule__KInterface__NameAssignment_1 ) ) ;
    public final void rule__KInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1552:1: ( ( ( rule__KInterface__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1553:1: ( ( rule__KInterface__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1553:1: ( ( rule__KInterface__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1554:1: ( rule__KInterface__NameAssignment_1 )
            {
             before(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1555:1: ( rule__KInterface__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1555:2: rule__KInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl3129);
            rule__KInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__KInterface__Group__1__Impl"


    // $ANTLR start "rule__KEnum__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1569:1: rule__KEnum__Group__0 : rule__KEnum__Group__0__Impl rule__KEnum__Group__1 ;
    public final void rule__KEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1573:1: ( rule__KEnum__Group__0__Impl rule__KEnum__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1574:2: rule__KEnum__Group__0__Impl rule__KEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__03163);
            rule__KEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__03166);
            rule__KEnum__Group__1();

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
    // $ANTLR end "rule__KEnum__Group__0"


    // $ANTLR start "rule__KEnum__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1581:1: rule__KEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__KEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1585:1: ( ( 'enum' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1586:1: ( 'enum' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1586:1: ( 'enum' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1587:1: 'enum'
            {
             before(grammarAccess.getKEnumAccess().getEnumKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__KEnum__Group__0__Impl3194); 
             after(grammarAccess.getKEnumAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__KEnum__Group__0__Impl"


    // $ANTLR start "rule__KEnum__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1600:1: rule__KEnum__Group__1 : rule__KEnum__Group__1__Impl ;
    public final void rule__KEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1604:1: ( rule__KEnum__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1605:2: rule__KEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13225);
            rule__KEnum__Group__1__Impl();

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
    // $ANTLR end "rule__KEnum__Group__1"


    // $ANTLR start "rule__KEnum__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1611:1: rule__KEnum__Group__1__Impl : ( ( rule__KEnum__NameAssignment_1 ) ) ;
    public final void rule__KEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1615:1: ( ( ( rule__KEnum__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1616:1: ( ( rule__KEnum__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1616:1: ( ( rule__KEnum__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1617:1: ( rule__KEnum__NameAssignment_1 )
            {
             before(grammarAccess.getKEnumAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1618:1: ( rule__KEnum__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1618:2: rule__KEnum__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3252);
            rule__KEnum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKEnumAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__KEnum__Group__1__Impl"


    // $ANTLR start "rule__KDependency__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1632:1: rule__KDependency__Group__0 : rule__KDependency__Group__0__Impl rule__KDependency__Group__1 ;
    public final void rule__KDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1636:1: ( rule__KDependency__Group__0__Impl rule__KDependency__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1637:2: rule__KDependency__Group__0__Impl rule__KDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__0__Impl_in_rule__KDependency__Group__03286);
            rule__KDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__1_in_rule__KDependency__Group__03289);
            rule__KDependency__Group__1();

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
    // $ANTLR end "rule__KDependency__Group__0"


    // $ANTLR start "rule__KDependency__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1644:1: rule__KDependency__Group__0__Impl : ( 'depend' ) ;
    public final void rule__KDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1648:1: ( ( 'depend' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1649:1: ( 'depend' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1649:1: ( 'depend' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1650:1: 'depend'
            {
             before(grammarAccess.getKDependencyAccess().getDependKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__KDependency__Group__0__Impl3317); 
             after(grammarAccess.getKDependencyAccess().getDependKeyword_0()); 

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
    // $ANTLR end "rule__KDependency__Group__0__Impl"


    // $ANTLR start "rule__KDependency__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1663:1: rule__KDependency__Group__1 : rule__KDependency__Group__1__Impl rule__KDependency__Group__2 ;
    public final void rule__KDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1667:1: ( rule__KDependency__Group__1__Impl rule__KDependency__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1668:2: rule__KDependency__Group__1__Impl rule__KDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__1__Impl_in_rule__KDependency__Group__13348);
            rule__KDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__2_in_rule__KDependency__Group__13351);
            rule__KDependency__Group__2();

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
    // $ANTLR end "rule__KDependency__Group__1"


    // $ANTLR start "rule__KDependency__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1675:1: rule__KDependency__Group__1__Impl : ( ( rule__KDependency__LabelAssignment_1 )? ) ;
    public final void rule__KDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1679:1: ( ( ( rule__KDependency__LabelAssignment_1 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1680:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1680:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1681:1: ( rule__KDependency__LabelAssignment_1 )?
            {
             before(grammarAccess.getKDependencyAccess().getLabelAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1682:1: ( rule__KDependency__LabelAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1682:2: rule__KDependency__LabelAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KDependency__LabelAssignment_1_in_rule__KDependency__Group__1__Impl3378);
                    rule__KDependency__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKDependencyAccess().getLabelAssignment_1()); 

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
    // $ANTLR end "rule__KDependency__Group__1__Impl"


    // $ANTLR start "rule__KDependency__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1692:1: rule__KDependency__Group__2 : rule__KDependency__Group__2__Impl ;
    public final void rule__KDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1696:1: ( rule__KDependency__Group__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1697:2: rule__KDependency__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__2__Impl_in_rule__KDependency__Group__23409);
            rule__KDependency__Group__2__Impl();

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
    // $ANTLR end "rule__KDependency__Group__2"


    // $ANTLR start "rule__KDependency__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1703:1: rule__KDependency__Group__2__Impl : ( ( rule__KDependency__TargetAssignment_2 ) ) ;
    public final void rule__KDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1707:1: ( ( ( rule__KDependency__TargetAssignment_2 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1708:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1708:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1709:1: ( rule__KDependency__TargetAssignment_2 )
            {
             before(grammarAccess.getKDependencyAccess().getTargetAssignment_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1710:1: ( rule__KDependency__TargetAssignment_2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1710:2: rule__KDependency__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__TargetAssignment_2_in_rule__KDependency__Group__2__Impl3436);
            rule__KDependency__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKDependencyAccess().getTargetAssignment_2()); 

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
    // $ANTLR end "rule__KDependency__Group__2__Impl"


    // $ANTLR start "rule__KMethod__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1726:1: rule__KMethod__Group__0 : rule__KMethod__Group__0__Impl rule__KMethod__Group__1 ;
    public final void rule__KMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1730:1: ( rule__KMethod__Group__0__Impl rule__KMethod__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1731:2: rule__KMethod__Group__0__Impl rule__KMethod__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03472);
            rule__KMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03475);
            rule__KMethod__Group__1();

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
    // $ANTLR end "rule__KMethod__Group__0"


    // $ANTLR start "rule__KMethod__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1738:1: rule__KMethod__Group__0__Impl : ( ( rule__KMethod__NameAssignment_0 ) ) ;
    public final void rule__KMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1742:1: ( ( ( rule__KMethod__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1743:1: ( ( rule__KMethod__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1743:1: ( ( rule__KMethod__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1744:1: ( rule__KMethod__NameAssignment_0 )
            {
             before(grammarAccess.getKMethodAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1745:1: ( rule__KMethod__NameAssignment_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1745:2: rule__KMethod__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3502);
            rule__KMethod__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKMethodAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__KMethod__Group__0__Impl"


    // $ANTLR start "rule__KMethod__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1755:1: rule__KMethod__Group__1 : rule__KMethod__Group__1__Impl rule__KMethod__Group__2 ;
    public final void rule__KMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1759:1: ( rule__KMethod__Group__1__Impl rule__KMethod__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1760:2: rule__KMethod__Group__1__Impl rule__KMethod__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13532);
            rule__KMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13535);
            rule__KMethod__Group__2();

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
    // $ANTLR end "rule__KMethod__Group__1"


    // $ANTLR start "rule__KMethod__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1767:1: rule__KMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__KMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1771:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1772:1: ( '(' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1772:1: ( '(' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1773:1: '('
            {
             before(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__KMethod__Group__1__Impl3563); 
             after(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__KMethod__Group__1__Impl"


    // $ANTLR start "rule__KMethod__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1786:1: rule__KMethod__Group__2 : rule__KMethod__Group__2__Impl rule__KMethod__Group__3 ;
    public final void rule__KMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1790:1: ( rule__KMethod__Group__2__Impl rule__KMethod__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1791:2: rule__KMethod__Group__2__Impl rule__KMethod__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23594);
            rule__KMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23597);
            rule__KMethod__Group__3();

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
    // $ANTLR end "rule__KMethod__Group__2"


    // $ANTLR start "rule__KMethod__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1798:1: rule__KMethod__Group__2__Impl : ( ( rule__KMethod__Group_2__0 )? ) ;
    public final void rule__KMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1802:1: ( ( ( rule__KMethod__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1803:1: ( ( rule__KMethod__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1803:1: ( ( rule__KMethod__Group_2__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1804:1: ( rule__KMethod__Group_2__0 )?
            {
             before(grammarAccess.getKMethodAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1805:1: ( rule__KMethod__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1805:2: rule__KMethod__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3624);
                    rule__KMethod__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKMethodAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KMethod__Group__2__Impl"


    // $ANTLR start "rule__KMethod__Group__3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1815:1: rule__KMethod__Group__3 : rule__KMethod__Group__3__Impl ;
    public final void rule__KMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1819:1: ( rule__KMethod__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1820:2: rule__KMethod__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33655);
            rule__KMethod__Group__3__Impl();

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
    // $ANTLR end "rule__KMethod__Group__3"


    // $ANTLR start "rule__KMethod__Group__3__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1826:1: rule__KMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__KMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1830:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1831:1: ( ')' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1831:1: ( ')' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1832:1: ')'
            {
             before(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__KMethod__Group__3__Impl3683); 
             after(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__KMethod__Group__3__Impl"


    // $ANTLR start "rule__KMethod__Group_2__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1853:1: rule__KMethod__Group_2__0 : rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 ;
    public final void rule__KMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1857:1: ( rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1858:2: rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03722);
            rule__KMethod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03725);
            rule__KMethod__Group_2__1();

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
    // $ANTLR end "rule__KMethod__Group_2__0"


    // $ANTLR start "rule__KMethod__Group_2__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1865:1: rule__KMethod__Group_2__0__Impl : ( ( rule__KMethod__ParametersAssignment_2_0 ) ) ;
    public final void rule__KMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1869:1: ( ( ( rule__KMethod__ParametersAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1870:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1870:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1871:1: ( rule__KMethod__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1872:1: ( rule__KMethod__ParametersAssignment_2_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1872:2: rule__KMethod__ParametersAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3752);
            rule__KMethod__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); 

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
    // $ANTLR end "rule__KMethod__Group_2__0__Impl"


    // $ANTLR start "rule__KMethod__Group_2__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1882:1: rule__KMethod__Group_2__1 : rule__KMethod__Group_2__1__Impl ;
    public final void rule__KMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1886:1: ( rule__KMethod__Group_2__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1887:2: rule__KMethod__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13782);
            rule__KMethod__Group_2__1__Impl();

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
    // $ANTLR end "rule__KMethod__Group_2__1"


    // $ANTLR start "rule__KMethod__Group_2__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1893:1: rule__KMethod__Group_2__1__Impl : ( ( rule__KMethod__Group_2_1__0 )* ) ;
    public final void rule__KMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1897:1: ( ( ( rule__KMethod__Group_2_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1898:1: ( ( rule__KMethod__Group_2_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1898:1: ( ( rule__KMethod__Group_2_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1899:1: ( rule__KMethod__Group_2_1__0 )*
            {
             before(grammarAccess.getKMethodAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1900:1: ( rule__KMethod__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1900:2: rule__KMethod__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3809);
            	    rule__KMethod__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getKMethodAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__KMethod__Group_2__1__Impl"


    // $ANTLR start "rule__KMethod__Group_2_1__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1914:1: rule__KMethod__Group_2_1__0 : rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 ;
    public final void rule__KMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1918:1: ( rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1919:2: rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03844);
            rule__KMethod__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03847);
            rule__KMethod__Group_2_1__1();

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
    // $ANTLR end "rule__KMethod__Group_2_1__0"


    // $ANTLR start "rule__KMethod__Group_2_1__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1926:1: rule__KMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1930:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1931:1: ( ',' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1931:1: ( ',' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1932:1: ','
            {
             before(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__KMethod__Group_2_1__0__Impl3875); 
             after(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__KMethod__Group_2_1__0__Impl"


    // $ANTLR start "rule__KMethod__Group_2_1__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1945:1: rule__KMethod__Group_2_1__1 : rule__KMethod__Group_2_1__1__Impl ;
    public final void rule__KMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1949:1: ( rule__KMethod__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1950:2: rule__KMethod__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13906);
            rule__KMethod__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__KMethod__Group_2_1__1"


    // $ANTLR start "rule__KMethod__Group_2_1__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1956:1: rule__KMethod__Group_2_1__1__Impl : ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__KMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1960:1: ( ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1961:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1961:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1962:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1963:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1963:2: rule__KMethod__ParametersAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl3933);
            rule__KMethod__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KMethod__Group_2_1__1__Impl"


    // $ANTLR start "rule__MetaModelID__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1977:1: rule__MetaModelID__Group__0 : rule__MetaModelID__Group__0__Impl rule__MetaModelID__Group__1 ;
    public final void rule__MetaModelID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1981:1: ( rule__MetaModelID__Group__0__Impl rule__MetaModelID__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1982:2: rule__MetaModelID__Group__0__Impl rule__MetaModelID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__0__Impl_in_rule__MetaModelID__Group__03967);
            rule__MetaModelID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__1_in_rule__MetaModelID__Group__03970);
            rule__MetaModelID__Group__1();

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
    // $ANTLR end "rule__MetaModelID__Group__0"


    // $ANTLR start "rule__MetaModelID__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1989:1: rule__MetaModelID__Group__0__Impl : ( ruleQualifiedID ) ;
    public final void rule__MetaModelID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1993:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1994:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1994:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1995:1: ruleQualifiedID
            {
             before(grammarAccess.getMetaModelIDAccess().getQualifiedIDParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__MetaModelID__Group__0__Impl3997);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMetaModelIDAccess().getQualifiedIDParserRuleCall_0()); 

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
    // $ANTLR end "rule__MetaModelID__Group__0__Impl"


    // $ANTLR start "rule__MetaModelID__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2006:1: rule__MetaModelID__Group__1 : rule__MetaModelID__Group__1__Impl rule__MetaModelID__Group__2 ;
    public final void rule__MetaModelID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2010:1: ( rule__MetaModelID__Group__1__Impl rule__MetaModelID__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2011:2: rule__MetaModelID__Group__1__Impl rule__MetaModelID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__1__Impl_in_rule__MetaModelID__Group__14026);
            rule__MetaModelID__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__2_in_rule__MetaModelID__Group__14029);
            rule__MetaModelID__Group__2();

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
    // $ANTLR end "rule__MetaModelID__Group__1"


    // $ANTLR start "rule__MetaModelID__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2018:1: rule__MetaModelID__Group__1__Impl : ( '/' ) ;
    public final void rule__MetaModelID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2022:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2023:1: ( '/' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2023:1: ( '/' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2024:1: '/'
            {
             before(grammarAccess.getMetaModelIDAccess().getSolidusKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MetaModelID__Group__1__Impl4057); 
             after(grammarAccess.getMetaModelIDAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__MetaModelID__Group__1__Impl"


    // $ANTLR start "rule__MetaModelID__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2037:1: rule__MetaModelID__Group__2 : rule__MetaModelID__Group__2__Impl rule__MetaModelID__Group__3 ;
    public final void rule__MetaModelID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2041:1: ( rule__MetaModelID__Group__2__Impl rule__MetaModelID__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2042:2: rule__MetaModelID__Group__2__Impl rule__MetaModelID__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__2__Impl_in_rule__MetaModelID__Group__24088);
            rule__MetaModelID__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__3_in_rule__MetaModelID__Group__24091);
            rule__MetaModelID__Group__3();

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
    // $ANTLR end "rule__MetaModelID__Group__2"


    // $ANTLR start "rule__MetaModelID__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2049:1: rule__MetaModelID__Group__2__Impl : ( ( rule__MetaModelID__Group_2__0 )* ) ;
    public final void rule__MetaModelID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2053:1: ( ( ( rule__MetaModelID__Group_2__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2054:1: ( ( rule__MetaModelID__Group_2__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2054:1: ( ( rule__MetaModelID__Group_2__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2055:1: ( rule__MetaModelID__Group_2__0 )*
            {
             before(grammarAccess.getMetaModelIDAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2056:1: ( rule__MetaModelID__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==27) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2056:2: rule__MetaModelID__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group_2__0_in_rule__MetaModelID__Group__2__Impl4118);
            	    rule__MetaModelID__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMetaModelIDAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MetaModelID__Group__2__Impl"


    // $ANTLR start "rule__MetaModelID__Group__3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2066:1: rule__MetaModelID__Group__3 : rule__MetaModelID__Group__3__Impl ;
    public final void rule__MetaModelID__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2070:1: ( rule__MetaModelID__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2071:2: rule__MetaModelID__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group__3__Impl_in_rule__MetaModelID__Group__34149);
            rule__MetaModelID__Group__3__Impl();

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
    // $ANTLR end "rule__MetaModelID__Group__3"


    // $ANTLR start "rule__MetaModelID__Group__3__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2077:1: rule__MetaModelID__Group__3__Impl : ( ruleQualifiedID ) ;
    public final void rule__MetaModelID__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2081:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2082:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2082:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2083:1: ruleQualifiedID
            {
             before(grammarAccess.getMetaModelIDAccess().getQualifiedIDParserRuleCall_3()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__MetaModelID__Group__3__Impl4176);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMetaModelIDAccess().getQualifiedIDParserRuleCall_3()); 

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
    // $ANTLR end "rule__MetaModelID__Group__3__Impl"


    // $ANTLR start "rule__MetaModelID__Group_2__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2102:1: rule__MetaModelID__Group_2__0 : rule__MetaModelID__Group_2__0__Impl rule__MetaModelID__Group_2__1 ;
    public final void rule__MetaModelID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2106:1: ( rule__MetaModelID__Group_2__0__Impl rule__MetaModelID__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2107:2: rule__MetaModelID__Group_2__0__Impl rule__MetaModelID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group_2__0__Impl_in_rule__MetaModelID__Group_2__04213);
            rule__MetaModelID__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group_2__1_in_rule__MetaModelID__Group_2__04216);
            rule__MetaModelID__Group_2__1();

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
    // $ANTLR end "rule__MetaModelID__Group_2__0"


    // $ANTLR start "rule__MetaModelID__Group_2__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2114:1: rule__MetaModelID__Group_2__0__Impl : ( RULE_ID ) ;
    public final void rule__MetaModelID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2118:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2119:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2119:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2120:1: RULE_ID
            {
             before(grammarAccess.getMetaModelIDAccess().getIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaModelID__Group_2__0__Impl4243); 
             after(grammarAccess.getMetaModelIDAccess().getIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MetaModelID__Group_2__0__Impl"


    // $ANTLR start "rule__MetaModelID__Group_2__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2131:1: rule__MetaModelID__Group_2__1 : rule__MetaModelID__Group_2__1__Impl ;
    public final void rule__MetaModelID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2135:1: ( rule__MetaModelID__Group_2__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2136:2: rule__MetaModelID__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaModelID__Group_2__1__Impl_in_rule__MetaModelID__Group_2__14272);
            rule__MetaModelID__Group_2__1__Impl();

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
    // $ANTLR end "rule__MetaModelID__Group_2__1"


    // $ANTLR start "rule__MetaModelID__Group_2__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2142:1: rule__MetaModelID__Group_2__1__Impl : ( '/' ) ;
    public final void rule__MetaModelID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2146:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2147:1: ( '/' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2147:1: ( '/' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2148:1: '/'
            {
             before(grammarAccess.getMetaModelIDAccess().getSolidusKeyword_2_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__MetaModelID__Group_2__1__Impl4300); 
             after(grammarAccess.getMetaModelIDAccess().getSolidusKeyword_2_1()); 

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
    // $ANTLR end "rule__MetaModelID__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedID__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2165:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2169:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2170:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__04335);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__04338);
            rule__QualifiedID__Group__1();

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
    // $ANTLR end "rule__QualifiedID__Group__0"


    // $ANTLR start "rule__QualifiedID__Group__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2177:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2181:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2182:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2182:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2183:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl4365); 
             after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedID__Group__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2194:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2198:1: ( rule__QualifiedID__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2199:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__14394);
            rule__QualifiedID__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedID__Group__1"


    // $ANTLR start "rule__QualifiedID__Group__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2205:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2209:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2210:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2210:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2211:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2212:1: ( rule__QualifiedID__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2212:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl4421);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getQualifiedIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedID__Group__1__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2226:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2230:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2231:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__04456);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__04459);
            rule__QualifiedID__Group_1__1();

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
    // $ANTLR end "rule__QualifiedID__Group_1__0"


    // $ANTLR start "rule__QualifiedID__Group_1__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2238:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2242:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2243:1: ( '.' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2243:1: ( '.' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2244:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__QualifiedID__Group_1__0__Impl4487); 
             after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedID__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2257:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2261:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2262:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__14518);
            rule__QualifiedID__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedID__Group_1__1"


    // $ANTLR start "rule__QualifiedID__Group_1__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2268:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2272:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2273:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2273:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2274:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl4545); 
             after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedID__Group_1__1__Impl"


    // $ANTLR start "rule__KClassModel__JavaProjectsAssignment_1_1_0_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2290:1: rule__KClassModel__JavaProjectsAssignment_1_1_0_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__JavaProjectsAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2294:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2295:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2295:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2296:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsQualifiedIDParserRuleCall_1_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14583);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getKClassModelAccess().getJavaProjectsQualifiedIDParserRuleCall_1_1_0_1_0()); 

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
    // $ANTLR end "rule__KClassModel__JavaProjectsAssignment_1_1_0_1"


    // $ANTLR start "rule__KClassModel__BundlesAssignment_1_1_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2305:1: rule__KClassModel__BundlesAssignment_1_1_1_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__BundlesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2309:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2310:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2310:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2311:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14614);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__KClassModel__BundlesAssignment_1_1_1_1"


    // $ANTLR start "rule__KClassModel__MetamodelsAssignment_1_1_2_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2320:1: rule__KClassModel__MetamodelsAssignment_1_1_2_1 : ( ruleMetaModelID ) ;
    public final void rule__KClassModel__MetamodelsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2324:1: ( ( ruleMetaModelID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2325:1: ( ruleMetaModelID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2325:1: ( ruleMetaModelID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2326:1: ruleMetaModelID
            {
             before(grammarAccess.getKClassModelAccess().getMetamodelsMetaModelIDParserRuleCall_1_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaModelID_in_rule__KClassModel__MetamodelsAssignment_1_1_2_14645);
            ruleMetaModelID();

            state._fsp--;

             after(grammarAccess.getKClassModelAccess().getMetamodelsMetaModelIDParserRuleCall_1_1_2_1_0()); 

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
    // $ANTLR end "rule__KClassModel__MetamodelsAssignment_1_1_2_1"


    // $ANTLR start "rule__KClassModel__OptionsAssignment_2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2335:1: rule__KClassModel__OptionsAssignment_2 : ( ruleKOption ) ;
    public final void rule__KClassModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2339:1: ( ( ruleKOption ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2340:1: ( ruleKOption )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2340:1: ( ruleKOption )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2341:1: ruleKOption
            {
             before(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24676);
            ruleKOption();

            state._fsp--;

             after(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__KClassModel__OptionsAssignment_2"


    // $ANTLR start "rule__KClassModel__PackagesAssignment_3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2350:1: rule__KClassModel__PackagesAssignment_3 : ( ruleKPackage ) ;
    public final void rule__KClassModel__PackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2354:1: ( ( ruleKPackage ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2355:1: ( ruleKPackage )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2355:1: ( ruleKPackage )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2356:1: ruleKPackage
            {
             before(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34707);
            ruleKPackage();

            state._fsp--;

             after(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__KClassModel__PackagesAssignment_3"


    // $ANTLR start "rule__KOption__KeyAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2365:1: rule__KOption__KeyAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KOption__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2369:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2370:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2370:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2371:1: ruleQualifiedID
            {
             before(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14738);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__KOption__KeyAssignment_1"


    // $ANTLR start "rule__KOption__ValueAssignment_3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2380:1: rule__KOption__ValueAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__KOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2384:1: ( ( rulePropertyValue ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2385:1: ( rulePropertyValue )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2385:1: ( rulePropertyValue )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2386:1: rulePropertyValue
            {
             before(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34769);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__KOption__ValueAssignment_3"


    // $ANTLR start "rule__KPackage__NameAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2395:1: rule__KPackage__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2399:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2400:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2400:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2401:1: ruleQualifiedID
            {
             before(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14800);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__KPackage__NameAssignment_1"


    // $ANTLR start "rule__KPackage__TypesAssignment_3"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2410:1: rule__KPackage__TypesAssignment_3 : ( ruleKType ) ;
    public final void rule__KPackage__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2414:1: ( ( ruleKType ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2415:1: ( ruleKType )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2415:1: ( ruleKType )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2416:1: ruleKType
            {
             before(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34831);
            ruleKType();

            state._fsp--;

             after(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__KPackage__TypesAssignment_3"


    // $ANTLR start "rule__KType__FieldsAssignment_1_1_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2425:1: rule__KType__FieldsAssignment_1_1_0 : ( ruleKField ) ;
    public final void rule__KType__FieldsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2429:1: ( ( ruleKField ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2430:1: ( ruleKField )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2430:1: ( ruleKField )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2431:1: ruleKField
            {
             before(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_rule__KType__FieldsAssignment_1_1_04862);
            ruleKField();

            state._fsp--;

             after(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__KType__FieldsAssignment_1_1_0"


    // $ANTLR start "rule__KType__MethodsAssignment_1_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2440:1: rule__KType__MethodsAssignment_1_1_1 : ( ruleKMethod ) ;
    public final void rule__KType__MethodsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2444:1: ( ( ruleKMethod ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2445:1: ( ruleKMethod )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2445:1: ( ruleKMethod )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2446:1: ruleKMethod
            {
             before(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_rule__KType__MethodsAssignment_1_1_14893);
            ruleKMethod();

            state._fsp--;

             after(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__KType__MethodsAssignment_1_1_1"


    // $ANTLR start "rule__KType__DependenciesAssignment_1_1_2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2455:1: rule__KType__DependenciesAssignment_1_1_2 : ( ruleKDependency ) ;
    public final void rule__KType__DependenciesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2459:1: ( ( ruleKDependency ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2460:1: ( ruleKDependency )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2460:1: ( ruleKDependency )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2461:1: ruleKDependency
            {
             before(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKDependency_in_rule__KType__DependenciesAssignment_1_1_24924);
            ruleKDependency();

            state._fsp--;

             after(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__KType__DependenciesAssignment_1_1_2"


    // $ANTLR start "rule__KClass__NameAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2470:1: rule__KClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2474:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2475:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2475:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2476:1: RULE_ID
            {
             before(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KClass__NameAssignment_14955); 
             after(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__KClass__NameAssignment_1"


    // $ANTLR start "rule__KInterface__NameAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2485:1: rule__KInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2489:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2490:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2490:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2491:1: RULE_ID
            {
             before(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KInterface__NameAssignment_14986); 
             after(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__KInterface__NameAssignment_1"


    // $ANTLR start "rule__KEnum__NameAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2500:1: rule__KEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2504:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2505:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2505:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2506:1: RULE_ID
            {
             before(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KEnum__NameAssignment_15017); 
             after(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__KEnum__NameAssignment_1"


    // $ANTLR start "rule__KDependency__LabelAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2515:1: rule__KDependency__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__KDependency__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2519:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2520:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2520:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2521:1: RULE_STRING
            {
             before(grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__KDependency__LabelAssignment_15048); 
             after(grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__KDependency__LabelAssignment_1"


    // $ANTLR start "rule__KDependency__TargetAssignment_2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2530:1: rule__KDependency__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__KDependency__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2534:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2535:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2535:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2536:1: ( RULE_ID )
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2537:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2538:1: RULE_ID
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KDependency__TargetAssignment_25083); 
             after(grammarAccess.getKDependencyAccess().getTargetKTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__KDependency__TargetAssignment_2"


    // $ANTLR start "rule__KField__NameAssignment"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2549:1: rule__KField__NameAssignment : ( RULE_ID ) ;
    public final void rule__KField__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2553:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2554:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2554:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2555:1: RULE_ID
            {
             before(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KField__NameAssignment5118); 
             after(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__KField__NameAssignment"


    // $ANTLR start "rule__KMethod__NameAssignment_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2564:1: rule__KMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__KMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2568:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2569:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2569:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2570:1: RULE_ID
            {
             before(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_05149); 
             after(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__KMethod__NameAssignment_0"


    // $ANTLR start "rule__KMethod__ParametersAssignment_2_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2579:1: rule__KMethod__ParametersAssignment_2_0 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2583:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2584:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2584:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2585:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_05180);
            ruleKTypeReference();

            state._fsp--;

             after(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__KMethod__ParametersAssignment_2_0"


    // $ANTLR start "rule__KMethod__ParametersAssignment_2_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2594:1: rule__KMethod__ParametersAssignment_2_1_1 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2598:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2599:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2599:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2600:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_15211);
            ruleKTypeReference();

            state._fsp--;

             after(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__KMethod__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__KTypeReference__SignatureAssignment"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2609:1: rule__KTypeReference__SignatureAssignment : ( RULE_ID ) ;
    public final void rule__KTypeReference__SignatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2613:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2614:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2614:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2615:1: RULE_ID
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment5242); 
             after(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__KTypeReference__SignatureAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleKClassModel_in_entryRuleKClassModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKClassModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__0_in_ruleKClassModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKOption_in_entryRuleKOption121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKOption128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__0_in_ruleKOption154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKPackage_in_entryRuleKPackage181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKPackage188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__0_in_ruleKPackage214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKType_in_entryRuleKType241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKType248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group__0_in_ruleKType274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_entryRuleKClass301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKClass308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__0_in_ruleKClass334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_entryRuleKInterface361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKInterface368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__0_in_ruleKInterface394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_entryRuleKEnum421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKEnum428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__0_in_ruleKEnum454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKDependency_in_entryRuleKDependency481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKDependency488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__0_in_ruleKDependency514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_entryRuleKField541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKField548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KField__NameAssignment_in_ruleKField574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_entryRuleKMethod601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKMethod608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__0_in_ruleKMethod634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKTypeReference668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KTypeReference__SignatureAssignment_in_ruleKTypeReference694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaModelID_in_entryRuleMetaModelID721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaModelID728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__0_in_ruleMetaModelID754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValue__Alternatives_in_rulePropertyValue874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Float__Alternatives_in_ruleFloat934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__0_in_rule__KClassModel__Alternatives_1_1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__0_in_rule__KClassModel__Alternatives_1_1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_2__0_in_rule__KClassModel__Alternatives_1_11006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_rule__KType__Alternatives_01039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_rule__KType__Alternatives_01056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_rule__KType__Alternatives_01073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__FieldsAssignment_1_1_0_in_rule__KType__Alternatives_1_11105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__MethodsAssignment_1_1_1_in_rule__KType__Alternatives_1_11123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__DependenciesAssignment_1_1_2_in_rule__KType__Alternatives_1_11141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01304 = new BitSet(new long[]{0x0000000000021100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11365 = new BitSet(new long[]{0x0000000000021100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1395 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21426 = new BitSet(new long[]{0x0000000000021100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1456 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1514 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01553 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KClassModel__Group_1__0__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01676 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__KClassModel__Group_1_1_0__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01799 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KClassModel__Group_1_1_1__0__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_2__0__Impl_in_rule__KClassModel__Group_1_1_2__01922 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_2__1_in_rule__KClassModel__Group_1_1_2__01925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KClassModel__Group_1_1_2__0__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_2__1__Impl_in_rule__KClassModel__Group_1_1_2__11984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__MetamodelsAssignment_1_1_2_1_in_rule__KClassModel__Group_1_1_2__1__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__02045 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__02048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__12106 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__12109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__22166 = new BitSet(new long[]{0x00000000000001F0L});
        public static final BitSet FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__22169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KOption__Group__2__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02293 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KPackage__Group__0__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12355 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22415 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KPackage__Group__2__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32477 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2507 = new BitSet(new long[]{0x0000000000700002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__KPackage__Group__4__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group__0__Impl_in_rule__KType__Group__02607 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__KType__Group__1_in_rule__KType__Group__02610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Alternatives_0_in_rule__KType__Group__0__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group__1__Impl_in_rule__KType__Group__12667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__0_in_rule__KType__Group__1__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__0__Impl_in_rule__KType__Group_1__02729 = new BitSet(new long[]{0x0000000000880100L});
        public static final BitSet FOLLOW_rule__KType__Group_1__1_in_rule__KType__Group_1__02732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KType__Group_1__0__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__1__Impl_in_rule__KType__Group_1__12791 = new BitSet(new long[]{0x0000000000880100L});
        public static final BitSet FOLLOW_rule__KType__Group_1__2_in_rule__KType__Group_1__12794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Alternatives_1_1_in_rule__KType__Group_1__1__Impl2821 = new BitSet(new long[]{0x0000000000800102L});
        public static final BitSet FOLLOW_rule__KType__Group_1__2__Impl_in_rule__KType__Group_1__22852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__KType__Group_1__2__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02917 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__KClass__Group__0__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__03040 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__03043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__KInterface__Group__0__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__13102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__03163 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__03166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__KEnum__Group__0__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__0__Impl_in_rule__KDependency__Group__03286 = new BitSet(new long[]{0x0000000000000120L});
        public static final BitSet FOLLOW_rule__KDependency__Group__1_in_rule__KDependency__Group__03289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__KDependency__Group__0__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__1__Impl_in_rule__KDependency__Group__13348 = new BitSet(new long[]{0x0000000000000120L});
        public static final BitSet FOLLOW_rule__KDependency__Group__2_in_rule__KDependency__Group__13351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__LabelAssignment_1_in_rule__KDependency__Group__1__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__2__Impl_in_rule__KDependency__Group__23409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__TargetAssignment_2_in_rule__KDependency__Group__2__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03472 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13532 = new BitSet(new long[]{0x0000000002000100L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__KMethod__Group__1__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23594 = new BitSet(new long[]{0x0000000002000100L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__KMethod__Group__3__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03722 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3809 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03844 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__KMethod__Group_2_1__0__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__0__Impl_in_rule__MetaModelID__Group__03967 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__1_in_rule__MetaModelID__Group__03970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MetaModelID__Group__0__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__1__Impl_in_rule__MetaModelID__Group__14026 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__2_in_rule__MetaModelID__Group__14029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MetaModelID__Group__1__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__2__Impl_in_rule__MetaModelID__Group__24088 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__3_in_rule__MetaModelID__Group__24091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group_2__0_in_rule__MetaModelID__Group__2__Impl4118 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group__3__Impl_in_rule__MetaModelID__Group__34149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__MetaModelID__Group__3__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group_2__0__Impl_in_rule__MetaModelID__Group_2__04213 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group_2__1_in_rule__MetaModelID__Group_2__04216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaModelID__Group_2__0__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaModelID__Group_2__1__Impl_in_rule__MetaModelID__Group_2__14272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__MetaModelID__Group_2__1__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__04335 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__04338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__14394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl4421 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__04456 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__04459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__QualifiedID__Group_1__0__Impl4487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__14518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaModelID_in_rule__KClassModel__MetamodelsAssignment_1_1_2_14645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_rule__KType__FieldsAssignment_1_1_04862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_rule__KType__MethodsAssignment_1_1_14893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKDependency_in_rule__KType__DependenciesAssignment_1_1_24924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KClass__NameAssignment_14955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KInterface__NameAssignment_14986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KEnum__NameAssignment_15017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__KDependency__LabelAssignment_15048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KDependency__TargetAssignment_25083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KField__NameAssignment5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_05149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_05180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_15211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment5242 = new BitSet(new long[]{0x0000000000000002L});
    }


}