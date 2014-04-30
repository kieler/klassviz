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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_TFLOAT", "RULE_NATURAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'*'", "'import'", "'project'", "'bundle'", "'='", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'depend'", "'('", "')'", "','", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
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


    // $ANTLR start "entryRuleQualifiedID"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:368:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:369:1: ( ruleQualifiedID EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:370:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID721);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID728); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:377:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:381:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:382:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:382:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:383:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:384:1: ( rule__QualifiedID__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:384:2: rule__QualifiedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID754);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:396:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:397:1: ( rulePropertyValue EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:398:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_entryRulePropertyValue781);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValue788); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:405:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:409:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:410:1: ( ( rule__PropertyValue__Alternatives ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:410:1: ( ( rule__PropertyValue__Alternatives ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:411:1: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:412:1: ( rule__PropertyValue__Alternatives )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:412:2: rule__PropertyValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValue__Alternatives_in_rulePropertyValue814);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:424:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:425:1: ( ruleFloat EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:426:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat841);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat848); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:433:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:437:2: ( ( ( rule__Float__Alternatives ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:438:1: ( ( rule__Float__Alternatives ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:438:1: ( ( rule__Float__Alternatives ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:439:1: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:440:1: ( rule__Float__Alternatives )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:440:2: rule__Float__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Float__Alternatives_in_ruleFloat874);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:452:1: rule__KClassModel__Alternatives_1_1 : ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) );
    public final void rule__KClassModel__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:456:1: ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:457:1: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:457:1: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:458:1: ( rule__KClassModel__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:459:1: ( rule__KClassModel__Group_1_1_0__0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:459:2: rule__KClassModel__Group_1_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__0_in_rule__KClassModel__Alternatives_1_1910);
                    rule__KClassModel__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:463:6: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:463:6: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:464:1: ( rule__KClassModel__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:465:1: ( rule__KClassModel__Group_1_1_1__0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:465:2: rule__KClassModel__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__0_in_rule__KClassModel__Alternatives_1_1928);
                    rule__KClassModel__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:474:1: rule__KType__Alternatives_0 : ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) );
    public final void rule__KType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:478:1: ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) )
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:479:1: ( ruleKClass )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:479:1: ( ruleKClass )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:480:1: ruleKClass
                    {
                     before(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKClass_in_rule__KType__Alternatives_0961);
                    ruleKClass();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:485:6: ( ruleKInterface )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:485:6: ( ruleKInterface )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:486:1: ruleKInterface
                    {
                     before(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_rule__KType__Alternatives_0978);
                    ruleKInterface();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:491:6: ( ruleKEnum )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:491:6: ( ruleKEnum )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:492:1: ruleKEnum
                    {
                     before(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_rule__KType__Alternatives_0995);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:502:1: rule__KType__Alternatives_1_1 : ( ( ( rule__KType__FieldsAssignment_1_1_0 ) ) | ( ( rule__KType__MethodsAssignment_1_1_1 ) ) | ( ( rule__KType__DependenciesAssignment_1_1_2 ) ) );
    public final void rule__KType__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:506:1: ( ( ( rule__KType__FieldsAssignment_1_1_0 ) ) | ( ( rule__KType__MethodsAssignment_1_1_1 ) ) | ( ( rule__KType__DependenciesAssignment_1_1_2 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID||LA3_1==19||LA3_1==23) ) {
                    alt3=1;
                }
                else if ( (LA3_1==24) ) {
                    alt3=2;
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:507:1: ( ( rule__KType__FieldsAssignment_1_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:507:1: ( ( rule__KType__FieldsAssignment_1_1_0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:508:1: ( rule__KType__FieldsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:509:1: ( rule__KType__FieldsAssignment_1_1_0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:509:2: rule__KType__FieldsAssignment_1_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__FieldsAssignment_1_1_0_in_rule__KType__Alternatives_1_11027);
                    rule__KType__FieldsAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:513:6: ( ( rule__KType__MethodsAssignment_1_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:513:6: ( ( rule__KType__MethodsAssignment_1_1_1 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:514:1: ( rule__KType__MethodsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:515:1: ( rule__KType__MethodsAssignment_1_1_1 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:515:2: rule__KType__MethodsAssignment_1_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__MethodsAssignment_1_1_1_in_rule__KType__Alternatives_1_11045);
                    rule__KType__MethodsAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:519:6: ( ( rule__KType__DependenciesAssignment_1_1_2 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:519:6: ( ( rule__KType__DependenciesAssignment_1_1_2 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:520:1: ( rule__KType__DependenciesAssignment_1_1_2 )
                    {
                     before(grammarAccess.getKTypeAccess().getDependenciesAssignment_1_1_2()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:521:1: ( rule__KType__DependenciesAssignment_1_1_2 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:521:2: rule__KType__DependenciesAssignment_1_1_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__DependenciesAssignment_1_1_2_in_rule__KType__Alternatives_1_11063);
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


    // $ANTLR start "rule__KClass__NameAlternatives_1_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:530:1: rule__KClass__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__KClass__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:534:1: ( ( RULE_ID ) | ( '*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:535:1: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:535:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:536:1: RULE_ID
                    {
                     before(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KClass__NameAlternatives_1_01096); 
                     after(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:541:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:541:6: ( '*' )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:542:1: '*'
                    {
                     before(grammarAccess.getKClassAccess().getNameAsteriskKeyword_1_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__KClass__NameAlternatives_1_01114); 
                     after(grammarAccess.getKClassAccess().getNameAsteriskKeyword_1_0_1()); 

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
    // $ANTLR end "rule__KClass__NameAlternatives_1_0"


    // $ANTLR start "rule__KInterface__NameAlternatives_1_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:554:1: rule__KInterface__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__KInterface__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:558:1: ( ( RULE_ID ) | ( '*' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:559:1: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:559:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:560:1: RULE_ID
                    {
                     before(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KInterface__NameAlternatives_1_01148); 
                     after(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:565:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:565:6: ( '*' )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:566:1: '*'
                    {
                     before(grammarAccess.getKInterfaceAccess().getNameAsteriskKeyword_1_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__KInterface__NameAlternatives_1_01166); 
                     after(grammarAccess.getKInterfaceAccess().getNameAsteriskKeyword_1_0_1()); 

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
    // $ANTLR end "rule__KInterface__NameAlternatives_1_0"


    // $ANTLR start "rule__KEnum__NameAlternatives_1_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:578:1: rule__KEnum__NameAlternatives_1_0 : ( ( RULE_ID ) | ( '*' ) );
    public final void rule__KEnum__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:582:1: ( ( RULE_ID ) | ( '*' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:583:1: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:583:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:584:1: RULE_ID
                    {
                     before(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KEnum__NameAlternatives_1_01200); 
                     after(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:589:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:589:6: ( '*' )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:590:1: '*'
                    {
                     before(grammarAccess.getKEnumAccess().getNameAsteriskKeyword_1_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__KEnum__NameAlternatives_1_01218); 
                     after(grammarAccess.getKEnumAccess().getNameAsteriskKeyword_1_0_1()); 

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
    // $ANTLR end "rule__KEnum__NameAlternatives_1_0"


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:602:1: rule__PropertyValue__Alternatives : ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:606:1: ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_TFLOAT:
            case RULE_NATURAL:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:607:1: ( RULE_BOOLEAN )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:607:1: ( RULE_BOOLEAN )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:608:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1252); 
                     after(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:613:6: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:613:6: ( RULE_STRING )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:614:1: RULE_STRING
                    {
                     before(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1269); 
                     after(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:619:6: ( ruleFloat )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:619:6: ( ruleFloat )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:620:1: ruleFloat
                    {
                     before(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1286);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:625:6: ( ruleQualifiedID )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:625:6: ( ruleQualifiedID )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:626:1: ruleQualifiedID
                    {
                     before(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1303);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:636:1: rule__Float__Alternatives : ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:640:1: ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) )
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:641:1: ( RULE_TFLOAT )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:641:1: ( RULE_TFLOAT )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:642:1: RULE_TFLOAT
                    {
                     before(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                    match(input,RULE_TFLOAT,FollowSets000.FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1335); 
                     after(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:647:6: ( RULE_NATURAL )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:647:6: ( RULE_NATURAL )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:648:1: RULE_NATURAL
                    {
                     before(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); 
                    match(input,RULE_NATURAL,FollowSets000.FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1352); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:660:1: rule__KClassModel__Group__0 : rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 ;
    public final void rule__KClassModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:664:1: ( rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:665:2: rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01382);
            rule__KClassModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01385);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:672:1: rule__KClassModel__Group__0__Impl : ( () ) ;
    public final void rule__KClassModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:676:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:677:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:677:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:678:1: ()
            {
             before(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:679:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:681:1: 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:691:1: rule__KClassModel__Group__1 : rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 ;
    public final void rule__KClassModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:695:1: ( rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:696:2: rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11443);
            rule__KClassModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11446);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:703:1: rule__KClassModel__Group__1__Impl : ( ( rule__KClassModel__Group_1__0 )* ) ;
    public final void rule__KClassModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:707:1: ( ( ( rule__KClassModel__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:708:1: ( ( rule__KClassModel__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:708:1: ( ( rule__KClassModel__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:709:1: ( rule__KClassModel__Group_1__0 )*
            {
             before(grammarAccess.getKClassModelAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:710:1: ( rule__KClassModel__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:710:2: rule__KClassModel__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1473);
            	    rule__KClassModel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:720:1: rule__KClassModel__Group__2 : rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 ;
    public final void rule__KClassModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:724:1: ( rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:725:2: rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21504);
            rule__KClassModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21507);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:732:1: rule__KClassModel__Group__2__Impl : ( ( rule__KClassModel__OptionsAssignment_2 )* ) ;
    public final void rule__KClassModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:736:1: ( ( ( rule__KClassModel__OptionsAssignment_2 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:737:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:737:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:738:1: ( rule__KClassModel__OptionsAssignment_2 )*
            {
             before(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:739:1: ( rule__KClassModel__OptionsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:739:2: rule__KClassModel__OptionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1534);
            	    rule__KClassModel__OptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:749:1: rule__KClassModel__Group__3 : rule__KClassModel__Group__3__Impl ;
    public final void rule__KClassModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:753:1: ( rule__KClassModel__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:754:2: rule__KClassModel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31565);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:760:1: rule__KClassModel__Group__3__Impl : ( ( rule__KClassModel__PackagesAssignment_3 )* ) ;
    public final void rule__KClassModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:764:1: ( ( ( rule__KClassModel__PackagesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:765:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:765:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:766:1: ( rule__KClassModel__PackagesAssignment_3 )*
            {
             before(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:767:1: ( rule__KClassModel__PackagesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:767:2: rule__KClassModel__PackagesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1592);
            	    rule__KClassModel__PackagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:785:1: rule__KClassModel__Group_1__0 : rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 ;
    public final void rule__KClassModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:789:1: ( rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:790:2: rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01631);
            rule__KClassModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01634);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:797:1: rule__KClassModel__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__KClassModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:801:1: ( ( 'import' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:802:1: ( 'import' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:802:1: ( 'import' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:803:1: 'import'
            {
             before(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__KClassModel__Group_1__0__Impl1662); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:816:1: rule__KClassModel__Group_1__1 : rule__KClassModel__Group_1__1__Impl ;
    public final void rule__KClassModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:820:1: ( rule__KClassModel__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:821:2: rule__KClassModel__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11693);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:827:1: rule__KClassModel__Group_1__1__Impl : ( ( rule__KClassModel__Alternatives_1_1 ) ) ;
    public final void rule__KClassModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:831:1: ( ( ( rule__KClassModel__Alternatives_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:832:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:832:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:833:1: ( rule__KClassModel__Alternatives_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:834:1: ( rule__KClassModel__Alternatives_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:834:2: rule__KClassModel__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1720);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:848:1: rule__KClassModel__Group_1_1_0__0 : rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 ;
    public final void rule__KClassModel__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:852:1: ( rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:853:2: rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01754);
            rule__KClassModel__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01757);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:860:1: rule__KClassModel__Group_1_1_0__0__Impl : ( 'project' ) ;
    public final void rule__KClassModel__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:864:1: ( ( 'project' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:865:1: ( 'project' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:865:1: ( 'project' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:866:1: 'project'
            {
             before(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KClassModel__Group_1_1_0__0__Impl1785); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:879:1: rule__KClassModel__Group_1_1_0__1 : rule__KClassModel__Group_1_1_0__1__Impl ;
    public final void rule__KClassModel__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:883:1: ( rule__KClassModel__Group_1_1_0__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:884:2: rule__KClassModel__Group_1_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11816);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:890:1: rule__KClassModel__Group_1_1_0__1__Impl : ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:894:1: ( ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:895:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:895:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:896:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:897:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:897:2: rule__KClassModel__JavaProjectsAssignment_1_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1843);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:911:1: rule__KClassModel__Group_1_1_1__0 : rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 ;
    public final void rule__KClassModel__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:915:1: ( rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:916:2: rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01877);
            rule__KClassModel__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01880);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:923:1: rule__KClassModel__Group_1_1_1__0__Impl : ( 'bundle' ) ;
    public final void rule__KClassModel__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:927:1: ( ( 'bundle' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:928:1: ( 'bundle' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:928:1: ( 'bundle' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:929:1: 'bundle'
            {
             before(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KClassModel__Group_1_1_1__0__Impl1908); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:942:1: rule__KClassModel__Group_1_1_1__1 : rule__KClassModel__Group_1_1_1__1__Impl ;
    public final void rule__KClassModel__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:946:1: ( rule__KClassModel__Group_1_1_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:947:2: rule__KClassModel__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11939);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:953:1: rule__KClassModel__Group_1_1_1__1__Impl : ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:957:1: ( ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:958:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:958:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:959:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:960:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:960:2: rule__KClassModel__BundlesAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1966);
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


    // $ANTLR start "rule__KOption__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:974:1: rule__KOption__Group__0 : rule__KOption__Group__0__Impl rule__KOption__Group__1 ;
    public final void rule__KOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:978:1: ( rule__KOption__Group__0__Impl rule__KOption__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:979:2: rule__KOption__Group__0__Impl rule__KOption__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__02000);
            rule__KOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__02003);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:986:1: rule__KOption__Group__0__Impl : ( () ) ;
    public final void rule__KOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:990:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:991:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:991:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:992:1: ()
            {
             before(grammarAccess.getKOptionAccess().getKOptionAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:993:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:995:1: 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1005:1: rule__KOption__Group__1 : rule__KOption__Group__1__Impl rule__KOption__Group__2 ;
    public final void rule__KOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1009:1: ( rule__KOption__Group__1__Impl rule__KOption__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1010:2: rule__KOption__Group__1__Impl rule__KOption__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__12061);
            rule__KOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__12064);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1017:1: rule__KOption__Group__1__Impl : ( ( rule__KOption__KeyAssignment_1 ) ) ;
    public final void rule__KOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1021:1: ( ( ( rule__KOption__KeyAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1022:1: ( ( rule__KOption__KeyAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1022:1: ( ( rule__KOption__KeyAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1023:1: ( rule__KOption__KeyAssignment_1 )
            {
             before(grammarAccess.getKOptionAccess().getKeyAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1024:1: ( rule__KOption__KeyAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1024:2: rule__KOption__KeyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl2091);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1034:1: rule__KOption__Group__2 : rule__KOption__Group__2__Impl rule__KOption__Group__3 ;
    public final void rule__KOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1038:1: ( rule__KOption__Group__2__Impl rule__KOption__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1039:2: rule__KOption__Group__2__Impl rule__KOption__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__22121);
            rule__KOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__22124);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1046:1: rule__KOption__Group__2__Impl : ( '=' ) ;
    public final void rule__KOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1050:1: ( ( '=' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1051:1: ( '=' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1051:1: ( '=' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1052:1: '='
            {
             before(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KOption__Group__2__Impl2152); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1065:1: rule__KOption__Group__3 : rule__KOption__Group__3__Impl ;
    public final void rule__KOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1069:1: ( rule__KOption__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1070:2: rule__KOption__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32183);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1076:1: rule__KOption__Group__3__Impl : ( ( rule__KOption__ValueAssignment_3 ) ) ;
    public final void rule__KOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1080:1: ( ( ( rule__KOption__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1081:1: ( ( rule__KOption__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1081:1: ( ( rule__KOption__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1082:1: ( rule__KOption__ValueAssignment_3 )
            {
             before(grammarAccess.getKOptionAccess().getValueAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1083:1: ( rule__KOption__ValueAssignment_3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1083:2: rule__KOption__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2210);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1101:1: rule__KPackage__Group__0 : rule__KPackage__Group__0__Impl rule__KPackage__Group__1 ;
    public final void rule__KPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:1: ( rule__KPackage__Group__0__Impl rule__KPackage__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1106:2: rule__KPackage__Group__0__Impl rule__KPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02248);
            rule__KPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02251);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1113:1: rule__KPackage__Group__0__Impl : ( 'package' ) ;
    public final void rule__KPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1117:1: ( ( 'package' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1118:1: ( 'package' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1118:1: ( 'package' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1119:1: 'package'
            {
             before(grammarAccess.getKPackageAccess().getPackageKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KPackage__Group__0__Impl2279); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1132:1: rule__KPackage__Group__1 : rule__KPackage__Group__1__Impl rule__KPackage__Group__2 ;
    public final void rule__KPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1136:1: ( rule__KPackage__Group__1__Impl rule__KPackage__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1137:2: rule__KPackage__Group__1__Impl rule__KPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12310);
            rule__KPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12313);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1144:1: rule__KPackage__Group__1__Impl : ( ( rule__KPackage__NameAssignment_1 ) ) ;
    public final void rule__KPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1148:1: ( ( ( rule__KPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1149:1: ( ( rule__KPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1149:1: ( ( rule__KPackage__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1150:1: ( rule__KPackage__NameAssignment_1 )
            {
             before(grammarAccess.getKPackageAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1151:1: ( rule__KPackage__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1151:2: rule__KPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2340);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1161:1: rule__KPackage__Group__2 : rule__KPackage__Group__2__Impl rule__KPackage__Group__3 ;
    public final void rule__KPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1165:1: ( rule__KPackage__Group__2__Impl rule__KPackage__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1166:2: rule__KPackage__Group__2__Impl rule__KPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22370);
            rule__KPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22373);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1173:1: rule__KPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__KPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1177:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1178:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1178:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1179:1: '{'
            {
             before(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KPackage__Group__2__Impl2401); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1192:1: rule__KPackage__Group__3 : rule__KPackage__Group__3__Impl rule__KPackage__Group__4 ;
    public final void rule__KPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1196:1: ( rule__KPackage__Group__3__Impl rule__KPackage__Group__4 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1197:2: rule__KPackage__Group__3__Impl rule__KPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32432);
            rule__KPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32435);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1204:1: rule__KPackage__Group__3__Impl : ( ( rule__KPackage__TypesAssignment_3 )* ) ;
    public final void rule__KPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1208:1: ( ( ( rule__KPackage__TypesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1209:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1209:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1210:1: ( rule__KPackage__TypesAssignment_3 )*
            {
             before(grammarAccess.getKPackageAccess().getTypesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1211:1: ( rule__KPackage__TypesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=20 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1211:2: rule__KPackage__TypesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2462);
            	    rule__KPackage__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1221:1: rule__KPackage__Group__4 : rule__KPackage__Group__4__Impl ;
    public final void rule__KPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1225:1: ( rule__KPackage__Group__4__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1226:2: rule__KPackage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42493);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1232:1: rule__KPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__KPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1236:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1237:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1237:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1238:1: '}'
            {
             before(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__KPackage__Group__4__Impl2521); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1261:1: rule__KType__Group__0 : rule__KType__Group__0__Impl rule__KType__Group__1 ;
    public final void rule__KType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1265:1: ( rule__KType__Group__0__Impl rule__KType__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1266:2: rule__KType__Group__0__Impl rule__KType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__0__Impl_in_rule__KType__Group__02562);
            rule__KType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__1_in_rule__KType__Group__02565);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1273:1: rule__KType__Group__0__Impl : ( ( rule__KType__Alternatives_0 ) ) ;
    public final void rule__KType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1277:1: ( ( ( rule__KType__Alternatives_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1278:1: ( ( rule__KType__Alternatives_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1278:1: ( ( rule__KType__Alternatives_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1279:1: ( rule__KType__Alternatives_0 )
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1280:1: ( rule__KType__Alternatives_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1280:2: rule__KType__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Alternatives_0_in_rule__KType__Group__0__Impl2592);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1290:1: rule__KType__Group__1 : rule__KType__Group__1__Impl ;
    public final void rule__KType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1294:1: ( rule__KType__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1295:2: rule__KType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__1__Impl_in_rule__KType__Group__12622);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1301:1: rule__KType__Group__1__Impl : ( ( rule__KType__Group_1__0 )? ) ;
    public final void rule__KType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1305:1: ( ( ( rule__KType__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1306:1: ( ( rule__KType__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1306:1: ( ( rule__KType__Group_1__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1307:1: ( rule__KType__Group_1__0 )?
            {
             before(grammarAccess.getKTypeAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1308:1: ( rule__KType__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1308:2: rule__KType__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__0_in_rule__KType__Group__1__Impl2649);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1322:1: rule__KType__Group_1__0 : rule__KType__Group_1__0__Impl rule__KType__Group_1__1 ;
    public final void rule__KType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1326:1: ( rule__KType__Group_1__0__Impl rule__KType__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1327:2: rule__KType__Group_1__0__Impl rule__KType__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__0__Impl_in_rule__KType__Group_1__02684);
            rule__KType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__1_in_rule__KType__Group_1__02687);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1334:1: rule__KType__Group_1__0__Impl : ( '{' ) ;
    public final void rule__KType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1338:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1339:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1339:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1340:1: '{'
            {
             before(grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KType__Group_1__0__Impl2715); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1353:1: rule__KType__Group_1__1 : rule__KType__Group_1__1__Impl rule__KType__Group_1__2 ;
    public final void rule__KType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1357:1: ( rule__KType__Group_1__1__Impl rule__KType__Group_1__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1358:2: rule__KType__Group_1__1__Impl rule__KType__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__1__Impl_in_rule__KType__Group_1__12746);
            rule__KType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__2_in_rule__KType__Group_1__12749);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1365:1: rule__KType__Group_1__1__Impl : ( ( rule__KType__Alternatives_1_1 )* ) ;
    public final void rule__KType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1369:1: ( ( ( rule__KType__Alternatives_1_1 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1370:1: ( ( rule__KType__Alternatives_1_1 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1370:1: ( ( rule__KType__Alternatives_1_1 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1371:1: ( rule__KType__Alternatives_1_1 )*
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1372:1: ( rule__KType__Alternatives_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1372:2: rule__KType__Alternatives_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KType__Alternatives_1_1_in_rule__KType__Group_1__1__Impl2776);
            	    rule__KType__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1382:1: rule__KType__Group_1__2 : rule__KType__Group_1__2__Impl ;
    public final void rule__KType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1386:1: ( rule__KType__Group_1__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1387:2: rule__KType__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__2__Impl_in_rule__KType__Group_1__22807);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1393:1: rule__KType__Group_1__2__Impl : ( '}' ) ;
    public final void rule__KType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1397:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1398:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1398:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1399:1: '}'
            {
             before(grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__KType__Group_1__2__Impl2835); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1418:1: rule__KClass__Group__0 : rule__KClass__Group__0__Impl rule__KClass__Group__1 ;
    public final void rule__KClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1422:1: ( rule__KClass__Group__0__Impl rule__KClass__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1423:2: rule__KClass__Group__0__Impl rule__KClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02872);
            rule__KClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02875);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1430:1: rule__KClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__KClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1434:1: ( ( 'class' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1435:1: ( 'class' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1435:1: ( 'class' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1436:1: 'class'
            {
             before(grammarAccess.getKClassAccess().getClassKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__KClass__Group__0__Impl2903); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1449:1: rule__KClass__Group__1 : rule__KClass__Group__1__Impl ;
    public final void rule__KClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1453:1: ( rule__KClass__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1454:2: rule__KClass__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12934);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1460:1: rule__KClass__Group__1__Impl : ( ( rule__KClass__NameAssignment_1 ) ) ;
    public final void rule__KClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1464:1: ( ( ( rule__KClass__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1465:1: ( ( rule__KClass__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1465:1: ( ( rule__KClass__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1466:1: ( rule__KClass__NameAssignment_1 )
            {
             before(grammarAccess.getKClassAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1467:1: ( rule__KClass__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1467:2: rule__KClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl2961);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1481:1: rule__KInterface__Group__0 : rule__KInterface__Group__0__Impl rule__KInterface__Group__1 ;
    public final void rule__KInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1485:1: ( rule__KInterface__Group__0__Impl rule__KInterface__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1486:2: rule__KInterface__Group__0__Impl rule__KInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__02995);
            rule__KInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__02998);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1493:1: rule__KInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__KInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1497:1: ( ( 'interface' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1498:1: ( 'interface' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1498:1: ( 'interface' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1499:1: 'interface'
            {
             before(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__KInterface__Group__0__Impl3026); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1512:1: rule__KInterface__Group__1 : rule__KInterface__Group__1__Impl ;
    public final void rule__KInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1516:1: ( rule__KInterface__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1517:2: rule__KInterface__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__13057);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1523:1: rule__KInterface__Group__1__Impl : ( ( rule__KInterface__NameAssignment_1 ) ) ;
    public final void rule__KInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1527:1: ( ( ( rule__KInterface__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1528:1: ( ( rule__KInterface__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1528:1: ( ( rule__KInterface__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1529:1: ( rule__KInterface__NameAssignment_1 )
            {
             before(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1530:1: ( rule__KInterface__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1530:2: rule__KInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl3084);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1544:1: rule__KEnum__Group__0 : rule__KEnum__Group__0__Impl rule__KEnum__Group__1 ;
    public final void rule__KEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1548:1: ( rule__KEnum__Group__0__Impl rule__KEnum__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1549:2: rule__KEnum__Group__0__Impl rule__KEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__03118);
            rule__KEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__03121);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1556:1: rule__KEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__KEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1560:1: ( ( 'enum' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1561:1: ( 'enum' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1561:1: ( 'enum' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1562:1: 'enum'
            {
             before(grammarAccess.getKEnumAccess().getEnumKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__KEnum__Group__0__Impl3149); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1575:1: rule__KEnum__Group__1 : rule__KEnum__Group__1__Impl ;
    public final void rule__KEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1579:1: ( rule__KEnum__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1580:2: rule__KEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13180);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1586:1: rule__KEnum__Group__1__Impl : ( ( rule__KEnum__NameAssignment_1 ) ) ;
    public final void rule__KEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1590:1: ( ( ( rule__KEnum__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1591:1: ( ( rule__KEnum__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1591:1: ( ( rule__KEnum__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1592:1: ( rule__KEnum__NameAssignment_1 )
            {
             before(grammarAccess.getKEnumAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1593:1: ( rule__KEnum__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1593:2: rule__KEnum__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3207);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1607:1: rule__KDependency__Group__0 : rule__KDependency__Group__0__Impl rule__KDependency__Group__1 ;
    public final void rule__KDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1611:1: ( rule__KDependency__Group__0__Impl rule__KDependency__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1612:2: rule__KDependency__Group__0__Impl rule__KDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__0__Impl_in_rule__KDependency__Group__03241);
            rule__KDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__1_in_rule__KDependency__Group__03244);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1619:1: rule__KDependency__Group__0__Impl : ( 'depend' ) ;
    public final void rule__KDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1623:1: ( ( 'depend' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1624:1: ( 'depend' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1624:1: ( 'depend' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1625:1: 'depend'
            {
             before(grammarAccess.getKDependencyAccess().getDependKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__KDependency__Group__0__Impl3272); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1638:1: rule__KDependency__Group__1 : rule__KDependency__Group__1__Impl rule__KDependency__Group__2 ;
    public final void rule__KDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1642:1: ( rule__KDependency__Group__1__Impl rule__KDependency__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1643:2: rule__KDependency__Group__1__Impl rule__KDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__1__Impl_in_rule__KDependency__Group__13303);
            rule__KDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__2_in_rule__KDependency__Group__13306);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1650:1: rule__KDependency__Group__1__Impl : ( ( rule__KDependency__LabelAssignment_1 )? ) ;
    public final void rule__KDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1654:1: ( ( ( rule__KDependency__LabelAssignment_1 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1655:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1655:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1656:1: ( rule__KDependency__LabelAssignment_1 )?
            {
             before(grammarAccess.getKDependencyAccess().getLabelAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1657:1: ( rule__KDependency__LabelAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1657:2: rule__KDependency__LabelAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KDependency__LabelAssignment_1_in_rule__KDependency__Group__1__Impl3333);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1667:1: rule__KDependency__Group__2 : rule__KDependency__Group__2__Impl ;
    public final void rule__KDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1671:1: ( rule__KDependency__Group__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1672:2: rule__KDependency__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__2__Impl_in_rule__KDependency__Group__23364);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1678:1: rule__KDependency__Group__2__Impl : ( ( rule__KDependency__TargetAssignment_2 ) ) ;
    public final void rule__KDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1682:1: ( ( ( rule__KDependency__TargetAssignment_2 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1683:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1683:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1684:1: ( rule__KDependency__TargetAssignment_2 )
            {
             before(grammarAccess.getKDependencyAccess().getTargetAssignment_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1685:1: ( rule__KDependency__TargetAssignment_2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1685:2: rule__KDependency__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__TargetAssignment_2_in_rule__KDependency__Group__2__Impl3391);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1701:1: rule__KMethod__Group__0 : rule__KMethod__Group__0__Impl rule__KMethod__Group__1 ;
    public final void rule__KMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1705:1: ( rule__KMethod__Group__0__Impl rule__KMethod__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1706:2: rule__KMethod__Group__0__Impl rule__KMethod__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03427);
            rule__KMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03430);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1713:1: rule__KMethod__Group__0__Impl : ( ( rule__KMethod__NameAssignment_0 ) ) ;
    public final void rule__KMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1717:1: ( ( ( rule__KMethod__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1718:1: ( ( rule__KMethod__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1718:1: ( ( rule__KMethod__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1719:1: ( rule__KMethod__NameAssignment_0 )
            {
             before(grammarAccess.getKMethodAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1720:1: ( rule__KMethod__NameAssignment_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1720:2: rule__KMethod__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3457);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1730:1: rule__KMethod__Group__1 : rule__KMethod__Group__1__Impl rule__KMethod__Group__2 ;
    public final void rule__KMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1734:1: ( rule__KMethod__Group__1__Impl rule__KMethod__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1735:2: rule__KMethod__Group__1__Impl rule__KMethod__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13487);
            rule__KMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13490);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1742:1: rule__KMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__KMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1746:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1747:1: ( '(' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1747:1: ( '(' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1748:1: '('
            {
             before(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__KMethod__Group__1__Impl3518); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1761:1: rule__KMethod__Group__2 : rule__KMethod__Group__2__Impl rule__KMethod__Group__3 ;
    public final void rule__KMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1765:1: ( rule__KMethod__Group__2__Impl rule__KMethod__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1766:2: rule__KMethod__Group__2__Impl rule__KMethod__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23549);
            rule__KMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23552);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1773:1: rule__KMethod__Group__2__Impl : ( ( rule__KMethod__Group_2__0 )? ) ;
    public final void rule__KMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1777:1: ( ( ( rule__KMethod__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1778:1: ( ( rule__KMethod__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1778:1: ( ( rule__KMethod__Group_2__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1779:1: ( rule__KMethod__Group_2__0 )?
            {
             before(grammarAccess.getKMethodAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1780:1: ( rule__KMethod__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1780:2: rule__KMethod__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3579);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1790:1: rule__KMethod__Group__3 : rule__KMethod__Group__3__Impl ;
    public final void rule__KMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1794:1: ( rule__KMethod__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1795:2: rule__KMethod__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33610);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1801:1: rule__KMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__KMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1805:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1806:1: ( ')' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1806:1: ( ')' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1807:1: ')'
            {
             before(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__KMethod__Group__3__Impl3638); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1828:1: rule__KMethod__Group_2__0 : rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 ;
    public final void rule__KMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1832:1: ( rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1833:2: rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03677);
            rule__KMethod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03680);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1840:1: rule__KMethod__Group_2__0__Impl : ( ( rule__KMethod__ParametersAssignment_2_0 ) ) ;
    public final void rule__KMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1844:1: ( ( ( rule__KMethod__ParametersAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1845:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1845:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1846:1: ( rule__KMethod__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1847:1: ( rule__KMethod__ParametersAssignment_2_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1847:2: rule__KMethod__ParametersAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3707);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1857:1: rule__KMethod__Group_2__1 : rule__KMethod__Group_2__1__Impl ;
    public final void rule__KMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1861:1: ( rule__KMethod__Group_2__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1862:2: rule__KMethod__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13737);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1868:1: rule__KMethod__Group_2__1__Impl : ( ( rule__KMethod__Group_2_1__0 )* ) ;
    public final void rule__KMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1872:1: ( ( ( rule__KMethod__Group_2_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1873:1: ( ( rule__KMethod__Group_2_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1873:1: ( ( rule__KMethod__Group_2_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1874:1: ( rule__KMethod__Group_2_1__0 )*
            {
             before(grammarAccess.getKMethodAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1875:1: ( rule__KMethod__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1875:2: rule__KMethod__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3764);
            	    rule__KMethod__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1889:1: rule__KMethod__Group_2_1__0 : rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 ;
    public final void rule__KMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1893:1: ( rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1894:2: rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03799);
            rule__KMethod__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03802);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1901:1: rule__KMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1905:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1906:1: ( ',' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1906:1: ( ',' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1907:1: ','
            {
             before(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__KMethod__Group_2_1__0__Impl3830); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1920:1: rule__KMethod__Group_2_1__1 : rule__KMethod__Group_2_1__1__Impl ;
    public final void rule__KMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1924:1: ( rule__KMethod__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1925:2: rule__KMethod__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13861);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1931:1: rule__KMethod__Group_2_1__1__Impl : ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__KMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1935:1: ( ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1936:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1936:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1937:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1938:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1938:2: rule__KMethod__ParametersAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl3888);
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


    // $ANTLR start "rule__QualifiedID__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1952:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1956:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1957:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03922);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03925);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1964:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1968:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1969:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1969:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1970:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3952); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1981:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1985:1: ( rule__QualifiedID__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1986:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13981);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1992:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1996:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1997:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1997:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1998:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1999:1: ( rule__QualifiedID__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1999:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl4008);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2013:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2017:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2018:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__04043);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__04046);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2025:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2029:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2030:1: ( '.' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2030:1: ( '.' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2031:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__QualifiedID__Group_1__0__Impl4074); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2044:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2048:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2049:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__14105);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2055:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2059:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2060:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2060:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2061:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl4132); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2077:1: rule__KClassModel__JavaProjectsAssignment_1_1_0_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__JavaProjectsAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2081:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2082:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2082:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2083:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsQualifiedIDParserRuleCall_1_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14170);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2092:1: rule__KClassModel__BundlesAssignment_1_1_1_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__BundlesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2096:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2097:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2097:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2098:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14201);
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


    // $ANTLR start "rule__KClassModel__OptionsAssignment_2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2107:1: rule__KClassModel__OptionsAssignment_2 : ( ruleKOption ) ;
    public final void rule__KClassModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2111:1: ( ( ruleKOption ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2112:1: ( ruleKOption )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2112:1: ( ruleKOption )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2113:1: ruleKOption
            {
             before(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24232);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2122:1: rule__KClassModel__PackagesAssignment_3 : ( ruleKPackage ) ;
    public final void rule__KClassModel__PackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2126:1: ( ( ruleKPackage ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2127:1: ( ruleKPackage )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2127:1: ( ruleKPackage )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2128:1: ruleKPackage
            {
             before(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34263);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2137:1: rule__KOption__KeyAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KOption__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2141:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2142:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2142:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2143:1: ruleQualifiedID
            {
             before(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14294);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2152:1: rule__KOption__ValueAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__KOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2156:1: ( ( rulePropertyValue ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2157:1: ( rulePropertyValue )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2157:1: ( rulePropertyValue )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2158:1: rulePropertyValue
            {
             before(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34325);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2167:1: rule__KPackage__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2171:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2172:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2172:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2173:1: ruleQualifiedID
            {
             before(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14356);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2182:1: rule__KPackage__TypesAssignment_3 : ( ruleKType ) ;
    public final void rule__KPackage__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2186:1: ( ( ruleKType ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2187:1: ( ruleKType )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2187:1: ( ruleKType )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2188:1: ruleKType
            {
             before(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34387);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2197:1: rule__KType__FieldsAssignment_1_1_0 : ( ruleKField ) ;
    public final void rule__KType__FieldsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2201:1: ( ( ruleKField ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2202:1: ( ruleKField )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2202:1: ( ruleKField )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2203:1: ruleKField
            {
             before(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_rule__KType__FieldsAssignment_1_1_04418);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2212:1: rule__KType__MethodsAssignment_1_1_1 : ( ruleKMethod ) ;
    public final void rule__KType__MethodsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2216:1: ( ( ruleKMethod ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2217:1: ( ruleKMethod )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2217:1: ( ruleKMethod )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2218:1: ruleKMethod
            {
             before(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_rule__KType__MethodsAssignment_1_1_14449);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2227:1: rule__KType__DependenciesAssignment_1_1_2 : ( ruleKDependency ) ;
    public final void rule__KType__DependenciesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2231:1: ( ( ruleKDependency ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2232:1: ( ruleKDependency )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2232:1: ( ruleKDependency )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2233:1: ruleKDependency
            {
             before(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKDependency_in_rule__KType__DependenciesAssignment_1_1_24480);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2242:1: rule__KClass__NameAssignment_1 : ( ( rule__KClass__NameAlternatives_1_0 ) ) ;
    public final void rule__KClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2246:1: ( ( ( rule__KClass__NameAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2247:1: ( ( rule__KClass__NameAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2247:1: ( ( rule__KClass__NameAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2248:1: ( rule__KClass__NameAlternatives_1_0 )
            {
             before(grammarAccess.getKClassAccess().getNameAlternatives_1_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2249:1: ( rule__KClass__NameAlternatives_1_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2249:2: rule__KClass__NameAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__NameAlternatives_1_0_in_rule__KClass__NameAssignment_14511);
            rule__KClass__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getKClassAccess().getNameAlternatives_1_0()); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2258:1: rule__KInterface__NameAssignment_1 : ( ( rule__KInterface__NameAlternatives_1_0 ) ) ;
    public final void rule__KInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2262:1: ( ( ( rule__KInterface__NameAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2263:1: ( ( rule__KInterface__NameAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2263:1: ( ( rule__KInterface__NameAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2264:1: ( rule__KInterface__NameAlternatives_1_0 )
            {
             before(grammarAccess.getKInterfaceAccess().getNameAlternatives_1_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2265:1: ( rule__KInterface__NameAlternatives_1_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2265:2: rule__KInterface__NameAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__NameAlternatives_1_0_in_rule__KInterface__NameAssignment_14544);
            rule__KInterface__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getKInterfaceAccess().getNameAlternatives_1_0()); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2274:1: rule__KEnum__NameAssignment_1 : ( ( rule__KEnum__NameAlternatives_1_0 ) ) ;
    public final void rule__KEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2278:1: ( ( ( rule__KEnum__NameAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2279:1: ( ( rule__KEnum__NameAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2279:1: ( ( rule__KEnum__NameAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2280:1: ( rule__KEnum__NameAlternatives_1_0 )
            {
             before(grammarAccess.getKEnumAccess().getNameAlternatives_1_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2281:1: ( rule__KEnum__NameAlternatives_1_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2281:2: rule__KEnum__NameAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__NameAlternatives_1_0_in_rule__KEnum__NameAssignment_14577);
            rule__KEnum__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getKEnumAccess().getNameAlternatives_1_0()); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2290:1: rule__KDependency__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__KDependency__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2294:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2295:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2295:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2296:1: RULE_STRING
            {
             before(grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__KDependency__LabelAssignment_14610); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2305:1: rule__KDependency__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__KDependency__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2309:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2310:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2310:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2311:1: ( RULE_ID )
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2312:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2313:1: RULE_ID
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KDependency__TargetAssignment_24645); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2324:1: rule__KField__NameAssignment : ( RULE_ID ) ;
    public final void rule__KField__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2328:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2329:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2329:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2330:1: RULE_ID
            {
             before(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KField__NameAssignment4680); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2339:1: rule__KMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__KMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2343:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2344:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2344:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2345:1: RULE_ID
            {
             before(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_04711); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2354:1: rule__KMethod__ParametersAssignment_2_0 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2358:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2359:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2359:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2360:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_04742);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2369:1: rule__KMethod__ParametersAssignment_2_1_1 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2373:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2374:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2374:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2375:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_14773);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2384:1: rule__KTypeReference__SignatureAssignment : ( RULE_ID ) ;
    public final void rule__KTypeReference__SignatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2388:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2389:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2389:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2390:1: RULE_ID
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment4804); 
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
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValue__Alternatives_in_rulePropertyValue814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Float__Alternatives_in_ruleFloat874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__0_in_rule__KClassModel__Alternatives_1_1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__0_in_rule__KClassModel__Alternatives_1_1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_rule__KType__Alternatives_0961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_rule__KType__Alternatives_0978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_rule__KType__Alternatives_0995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__FieldsAssignment_1_1_0_in_rule__KType__Alternatives_1_11027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__MethodsAssignment_1_1_1_in_rule__KType__Alternatives_1_11045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__DependenciesAssignment_1_1_2_in_rule__KType__Alternatives_1_11063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KClass__NameAlternatives_1_01096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KClass__NameAlternatives_1_01114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KInterface__NameAlternatives_1_01148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KInterface__NameAlternatives_1_01166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KEnum__NameAlternatives_1_01200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KEnum__NameAlternatives_1_01218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01382 = new BitSet(new long[]{0x0000000000022010L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11443 = new BitSet(new long[]{0x0000000000022010L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1473 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21504 = new BitSet(new long[]{0x0000000000022010L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1534 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1592 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01631 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__KClassModel__Group_1__0__Impl1662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01754 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KClassModel__Group_1_1_0__0__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01877 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KClassModel__Group_1_1_1__0__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__02000 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__02003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__12061 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__12064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__22121 = new BitSet(new long[]{0x00000000000001F0L});
        public static final BitSet FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__22124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KOption__Group__2__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02248 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KPackage__Group__0__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12310 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22370 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KPackage__Group__2__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32432 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2462 = new BitSet(new long[]{0x0000000000700002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__KPackage__Group__4__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group__0__Impl_in_rule__KType__Group__02562 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__KType__Group__1_in_rule__KType__Group__02565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Alternatives_0_in_rule__KType__Group__0__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group__1__Impl_in_rule__KType__Group__12622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__0_in_rule__KType__Group__1__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__0__Impl_in_rule__KType__Group_1__02684 = new BitSet(new long[]{0x0000000000880010L});
        public static final BitSet FOLLOW_rule__KType__Group_1__1_in_rule__KType__Group_1__02687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KType__Group_1__0__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__1__Impl_in_rule__KType__Group_1__12746 = new BitSet(new long[]{0x0000000000880010L});
        public static final BitSet FOLLOW_rule__KType__Group_1__2_in_rule__KType__Group_1__12749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Alternatives_1_1_in_rule__KType__Group_1__1__Impl2776 = new BitSet(new long[]{0x0000000000800012L});
        public static final BitSet FOLLOW_rule__KType__Group_1__2__Impl_in_rule__KType__Group_1__22807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__KType__Group_1__2__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02872 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__KClass__Group__0__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__02995 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__02998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__KInterface__Group__0__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__13057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__03118 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__03121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__KEnum__Group__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__0__Impl_in_rule__KDependency__Group__03241 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__KDependency__Group__1_in_rule__KDependency__Group__03244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__KDependency__Group__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__1__Impl_in_rule__KDependency__Group__13303 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__KDependency__Group__2_in_rule__KDependency__Group__13306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__LabelAssignment_1_in_rule__KDependency__Group__1__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__2__Impl_in_rule__KDependency__Group__23364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__TargetAssignment_2_in_rule__KDependency__Group__2__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03427 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13487 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__KMethod__Group__1__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23549 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__KMethod__Group__3__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03677 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3764 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03799 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__KMethod__Group_2_1__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03922 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl4008 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__04043 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__04046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__QualifiedID__Group_1__0__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__14105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_rule__KType__FieldsAssignment_1_1_04418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_rule__KType__MethodsAssignment_1_1_14449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKDependency_in_rule__KType__DependenciesAssignment_1_1_24480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__NameAlternatives_1_0_in_rule__KClass__NameAssignment_14511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__NameAlternatives_1_0_in_rule__KInterface__NameAssignment_14544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__NameAlternatives_1_0_in_rule__KEnum__NameAssignment_14577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__KDependency__LabelAssignment_14610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KDependency__TargetAssignment_24645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KField__NameAssignment4680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_04711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_04742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_14773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment4804 = new BitSet(new long[]{0x0000000000000002L});
    }


}