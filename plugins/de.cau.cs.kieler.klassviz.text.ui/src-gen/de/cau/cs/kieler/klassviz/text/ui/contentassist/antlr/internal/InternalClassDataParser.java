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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_STRING", "RULE_TFLOAT", "RULE_NATURAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'project'", "'bundle'", "'='", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'('", "')'", "','", "'.'"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_ID=8;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:153:1: ruleKType : ( ( rule__KType__Alternatives ) ) ;
    public final void ruleKType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:157:2: ( ( ( rule__KType__Alternatives ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:158:1: ( ( rule__KType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:158:1: ( ( rule__KType__Alternatives ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:159:1: ( rule__KType__Alternatives )
            {
             before(grammarAccess.getKTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:160:1: ( rule__KType__Alternatives )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:160:2: rule__KType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Alternatives_in_ruleKType274);
            rule__KType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKTypeAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleKField"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:256:1: entryRuleKField : ruleKField EOF ;
    public final void entryRuleKField() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:257:1: ( ruleKField EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:258:1: ruleKField EOF
            {
             before(grammarAccess.getKFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_entryRuleKField481);
            ruleKField();

            state._fsp--;

             after(grammarAccess.getKFieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKField488); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:265:1: ruleKField : ( ( rule__KField__NameAssignment ) ) ;
    public final void ruleKField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:269:2: ( ( ( rule__KField__NameAssignment ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:270:1: ( ( rule__KField__NameAssignment ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:270:1: ( ( rule__KField__NameAssignment ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:271:1: ( rule__KField__NameAssignment )
            {
             before(grammarAccess.getKFieldAccess().getNameAssignment()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:272:1: ( rule__KField__NameAssignment )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:272:2: rule__KField__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__KField__NameAssignment_in_ruleKField514);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:284:1: entryRuleKMethod : ruleKMethod EOF ;
    public final void entryRuleKMethod() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:285:1: ( ruleKMethod EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:286:1: ruleKMethod EOF
            {
             before(grammarAccess.getKMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_entryRuleKMethod541);
            ruleKMethod();

            state._fsp--;

             after(grammarAccess.getKMethodRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKMethod548); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:293:1: ruleKMethod : ( ( rule__KMethod__Group__0 ) ) ;
    public final void ruleKMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:297:2: ( ( ( rule__KMethod__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:298:1: ( ( rule__KMethod__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:298:1: ( ( rule__KMethod__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:299:1: ( rule__KMethod__Group__0 )
            {
             before(grammarAccess.getKMethodAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:300:1: ( rule__KMethod__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:300:2: rule__KMethod__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__0_in_ruleKMethod574);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:312:1: entryRuleKTypeReference : ruleKTypeReference EOF ;
    public final void entryRuleKTypeReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:313:1: ( ruleKTypeReference EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:314:1: ruleKTypeReference EOF
            {
             before(grammarAccess.getKTypeReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference601);
            ruleKTypeReference();

            state._fsp--;

             after(grammarAccess.getKTypeReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKTypeReference608); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:321:1: ruleKTypeReference : ( ( rule__KTypeReference__SignatureAssignment ) ) ;
    public final void ruleKTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:325:2: ( ( ( rule__KTypeReference__SignatureAssignment ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:326:1: ( ( rule__KTypeReference__SignatureAssignment ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:326:1: ( ( rule__KTypeReference__SignatureAssignment ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:327:1: ( rule__KTypeReference__SignatureAssignment )
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureAssignment()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:328:1: ( rule__KTypeReference__SignatureAssignment )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:328:2: rule__KTypeReference__SignatureAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__KTypeReference__SignatureAssignment_in_ruleKTypeReference634);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:340:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:341:1: ( ruleQualifiedID EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:342:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID661);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedID668); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:349:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:353:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:354:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:354:1: ( ( rule__QualifiedID__Group__0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:355:1: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:356:1: ( rule__QualifiedID__Group__0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:356:2: rule__QualifiedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID694);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:368:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:369:1: ( rulePropertyValue EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:370:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_entryRulePropertyValue721);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValue728); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:377:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:381:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:382:1: ( ( rule__PropertyValue__Alternatives ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:382:1: ( ( rule__PropertyValue__Alternatives ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:383:1: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:384:1: ( rule__PropertyValue__Alternatives )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:384:2: rule__PropertyValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValue__Alternatives_in_rulePropertyValue754);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:396:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:397:1: ( ruleFloat EOF )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:398:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat781);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat788); 

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:405:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:409:2: ( ( ( rule__Float__Alternatives ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:410:1: ( ( rule__Float__Alternatives ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:410:1: ( ( rule__Float__Alternatives ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:411:1: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:412:1: ( rule__Float__Alternatives )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:412:2: rule__Float__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Float__Alternatives_in_ruleFloat814);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:424:1: rule__KClassModel__Alternatives_1_1 : ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) );
    public final void rule__KClassModel__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:428:1: ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) )
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:429:1: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:429:1: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:430:1: ( rule__KClassModel__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:431:1: ( rule__KClassModel__Group_1_1_0__0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:431:2: rule__KClassModel__Group_1_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__0_in_rule__KClassModel__Alternatives_1_1850);
                    rule__KClassModel__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:435:6: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:435:6: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:436:1: ( rule__KClassModel__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:437:1: ( rule__KClassModel__Group_1_1_1__0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:437:2: rule__KClassModel__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__0_in_rule__KClassModel__Alternatives_1_1868);
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


    // $ANTLR start "rule__KType__Alternatives"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:446:1: rule__KType__Alternatives : ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) );
    public final void rule__KType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:450:1: ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:451:1: ( ruleKClass )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:451:1: ( ruleKClass )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:452:1: ruleKClass
                    {
                     before(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKClass_in_rule__KType__Alternatives901);
                    ruleKClass();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:457:6: ( ruleKInterface )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:457:6: ( ruleKInterface )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:458:1: ruleKInterface
                    {
                     before(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKInterface_in_rule__KType__Alternatives918);
                    ruleKInterface();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:463:6: ( ruleKEnum )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:463:6: ( ruleKEnum )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:464:1: ruleKEnum
                    {
                     before(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKEnum_in_rule__KType__Alternatives935);
                    ruleKEnum();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_2()); 

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
    // $ANTLR end "rule__KType__Alternatives"


    // $ANTLR start "rule__KClass__Alternatives_2_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:474:1: rule__KClass__Alternatives_2_1 : ( ( ( rule__KClass__FieldsAssignment_2_1_0 ) ) | ( ( rule__KClass__MethodsAssignment_2_1_1 ) ) );
    public final void rule__KClass__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:478:1: ( ( ( rule__KClass__FieldsAssignment_2_1_0 ) ) | ( ( rule__KClass__MethodsAssignment_2_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID||LA3_1==18) ) {
                    alt3=1;
                }
                else if ( (LA3_1==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:479:1: ( ( rule__KClass__FieldsAssignment_2_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:479:1: ( ( rule__KClass__FieldsAssignment_2_1_0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:480:1: ( rule__KClass__FieldsAssignment_2_1_0 )
                    {
                     before(grammarAccess.getKClassAccess().getFieldsAssignment_2_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:481:1: ( rule__KClass__FieldsAssignment_2_1_0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:481:2: rule__KClass__FieldsAssignment_2_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClass__FieldsAssignment_2_1_0_in_rule__KClass__Alternatives_2_1967);
                    rule__KClass__FieldsAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassAccess().getFieldsAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:485:6: ( ( rule__KClass__MethodsAssignment_2_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:485:6: ( ( rule__KClass__MethodsAssignment_2_1_1 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:486:1: ( rule__KClass__MethodsAssignment_2_1_1 )
                    {
                     before(grammarAccess.getKClassAccess().getMethodsAssignment_2_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:487:1: ( rule__KClass__MethodsAssignment_2_1_1 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:487:2: rule__KClass__MethodsAssignment_2_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClass__MethodsAssignment_2_1_1_in_rule__KClass__Alternatives_2_1985);
                    rule__KClass__MethodsAssignment_2_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassAccess().getMethodsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KClass__Alternatives_2_1"


    // $ANTLR start "rule__KInterface__Alternatives_2_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:496:1: rule__KInterface__Alternatives_2_1 : ( ( ( rule__KInterface__FieldsAssignment_2_1_0 ) ) | ( ( rule__KInterface__MethodsAssignment_2_1_1 ) ) );
    public final void rule__KInterface__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:500:1: ( ( ( rule__KInterface__FieldsAssignment_2_1_0 ) ) | ( ( rule__KInterface__MethodsAssignment_2_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID||LA4_1==18) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:501:1: ( ( rule__KInterface__FieldsAssignment_2_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:501:1: ( ( rule__KInterface__FieldsAssignment_2_1_0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:502:1: ( rule__KInterface__FieldsAssignment_2_1_0 )
                    {
                     before(grammarAccess.getKInterfaceAccess().getFieldsAssignment_2_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:503:1: ( rule__KInterface__FieldsAssignment_2_1_0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:503:2: rule__KInterface__FieldsAssignment_2_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KInterface__FieldsAssignment_2_1_0_in_rule__KInterface__Alternatives_2_11018);
                    rule__KInterface__FieldsAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKInterfaceAccess().getFieldsAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:507:6: ( ( rule__KInterface__MethodsAssignment_2_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:507:6: ( ( rule__KInterface__MethodsAssignment_2_1_1 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:508:1: ( rule__KInterface__MethodsAssignment_2_1_1 )
                    {
                     before(grammarAccess.getKInterfaceAccess().getMethodsAssignment_2_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:509:1: ( rule__KInterface__MethodsAssignment_2_1_1 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:509:2: rule__KInterface__MethodsAssignment_2_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KInterface__MethodsAssignment_2_1_1_in_rule__KInterface__Alternatives_2_11036);
                    rule__KInterface__MethodsAssignment_2_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKInterfaceAccess().getMethodsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KInterface__Alternatives_2_1"


    // $ANTLR start "rule__KEnum__Alternatives_2_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:518:1: rule__KEnum__Alternatives_2_1 : ( ( ( rule__KEnum__FieldsAssignment_2_1_0 ) ) | ( ( rule__KEnum__MethodsAssignment_2_1_1 ) ) );
    public final void rule__KEnum__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:522:1: ( ( ( rule__KEnum__FieldsAssignment_2_1_0 ) ) | ( ( rule__KEnum__MethodsAssignment_2_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==22) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_ID||LA5_1==18) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:523:1: ( ( rule__KEnum__FieldsAssignment_2_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:523:1: ( ( rule__KEnum__FieldsAssignment_2_1_0 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:524:1: ( rule__KEnum__FieldsAssignment_2_1_0 )
                    {
                     before(grammarAccess.getKEnumAccess().getFieldsAssignment_2_1_0()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:525:1: ( rule__KEnum__FieldsAssignment_2_1_0 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:525:2: rule__KEnum__FieldsAssignment_2_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KEnum__FieldsAssignment_2_1_0_in_rule__KEnum__Alternatives_2_11069);
                    rule__KEnum__FieldsAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKEnumAccess().getFieldsAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:529:6: ( ( rule__KEnum__MethodsAssignment_2_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:529:6: ( ( rule__KEnum__MethodsAssignment_2_1_1 ) )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:530:1: ( rule__KEnum__MethodsAssignment_2_1_1 )
                    {
                     before(grammarAccess.getKEnumAccess().getMethodsAssignment_2_1_1()); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:531:1: ( rule__KEnum__MethodsAssignment_2_1_1 )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:531:2: rule__KEnum__MethodsAssignment_2_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KEnum__MethodsAssignment_2_1_1_in_rule__KEnum__Alternatives_2_11087);
                    rule__KEnum__MethodsAssignment_2_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKEnumAccess().getMethodsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__KEnum__Alternatives_2_1"


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:540:1: rule__PropertyValue__Alternatives : ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:544:1: ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_TFLOAT:
            case RULE_NATURAL:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:545:1: ( RULE_BOOLEAN )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:545:1: ( RULE_BOOLEAN )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:546:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1120); 
                     after(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:551:6: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:551:6: ( RULE_STRING )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:552:1: RULE_STRING
                    {
                     before(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1137); 
                     after(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:557:6: ( ruleFloat )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:557:6: ( ruleFloat )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:558:1: ruleFloat
                    {
                     before(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1154);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:563:6: ( ruleQualifiedID )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:563:6: ( ruleQualifiedID )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:564:1: ruleQualifiedID
                    {
                     before(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1171);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:574:1: rule__Float__Alternatives : ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:578:1: ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TFLOAT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_NATURAL) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:579:1: ( RULE_TFLOAT )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:579:1: ( RULE_TFLOAT )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:580:1: RULE_TFLOAT
                    {
                     before(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                    match(input,RULE_TFLOAT,FollowSets000.FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1203); 
                     after(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:585:6: ( RULE_NATURAL )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:585:6: ( RULE_NATURAL )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:586:1: RULE_NATURAL
                    {
                     before(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); 
                    match(input,RULE_NATURAL,FollowSets000.FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1220); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:598:1: rule__KClassModel__Group__0 : rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 ;
    public final void rule__KClassModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:602:1: ( rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:603:2: rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01250);
            rule__KClassModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01253);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:610:1: rule__KClassModel__Group__0__Impl : ( () ) ;
    public final void rule__KClassModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:614:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:615:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:615:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:616:1: ()
            {
             before(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:617:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:619:1: 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:629:1: rule__KClassModel__Group__1 : rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 ;
    public final void rule__KClassModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:633:1: ( rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:634:2: rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11311);
            rule__KClassModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11314);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:641:1: rule__KClassModel__Group__1__Impl : ( ( rule__KClassModel__Group_1__0 )* ) ;
    public final void rule__KClassModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:645:1: ( ( ( rule__KClassModel__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:646:1: ( ( rule__KClassModel__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:646:1: ( ( rule__KClassModel__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:647:1: ( rule__KClassModel__Group_1__0 )*
            {
             before(grammarAccess.getKClassModelAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:648:1: ( rule__KClassModel__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:648:2: rule__KClassModel__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1341);
            	    rule__KClassModel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:658:1: rule__KClassModel__Group__2 : rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 ;
    public final void rule__KClassModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:662:1: ( rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:663:2: rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21372);
            rule__KClassModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21375);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:670:1: rule__KClassModel__Group__2__Impl : ( ( rule__KClassModel__OptionsAssignment_2 )* ) ;
    public final void rule__KClassModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:674:1: ( ( ( rule__KClassModel__OptionsAssignment_2 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:675:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:675:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:676:1: ( rule__KClassModel__OptionsAssignment_2 )*
            {
             before(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:677:1: ( rule__KClassModel__OptionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:677:2: rule__KClassModel__OptionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1402);
            	    rule__KClassModel__OptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:687:1: rule__KClassModel__Group__3 : rule__KClassModel__Group__3__Impl ;
    public final void rule__KClassModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:691:1: ( rule__KClassModel__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:692:2: rule__KClassModel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31433);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:698:1: rule__KClassModel__Group__3__Impl : ( ( rule__KClassModel__PackagesAssignment_3 )* ) ;
    public final void rule__KClassModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:702:1: ( ( ( rule__KClassModel__PackagesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:703:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:703:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:704:1: ( rule__KClassModel__PackagesAssignment_3 )*
            {
             before(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:705:1: ( rule__KClassModel__PackagesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:705:2: rule__KClassModel__PackagesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1460);
            	    rule__KClassModel__PackagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:723:1: rule__KClassModel__Group_1__0 : rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 ;
    public final void rule__KClassModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:727:1: ( rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:728:2: rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01499);
            rule__KClassModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01502);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:735:1: rule__KClassModel__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__KClassModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:739:1: ( ( 'import' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:740:1: ( 'import' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:740:1: ( 'import' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:741:1: 'import'
            {
             before(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__KClassModel__Group_1__0__Impl1530); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:754:1: rule__KClassModel__Group_1__1 : rule__KClassModel__Group_1__1__Impl ;
    public final void rule__KClassModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:758:1: ( rule__KClassModel__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:759:2: rule__KClassModel__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11561);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:765:1: rule__KClassModel__Group_1__1__Impl : ( ( rule__KClassModel__Alternatives_1_1 ) ) ;
    public final void rule__KClassModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:769:1: ( ( ( rule__KClassModel__Alternatives_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:770:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:770:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:771:1: ( rule__KClassModel__Alternatives_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:772:1: ( rule__KClassModel__Alternatives_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:772:2: rule__KClassModel__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1588);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:786:1: rule__KClassModel__Group_1_1_0__0 : rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 ;
    public final void rule__KClassModel__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:790:1: ( rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:791:2: rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01622);
            rule__KClassModel__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01625);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:798:1: rule__KClassModel__Group_1_1_0__0__Impl : ( 'project' ) ;
    public final void rule__KClassModel__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:802:1: ( ( 'project' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:803:1: ( 'project' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:803:1: ( 'project' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:804:1: 'project'
            {
             before(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__KClassModel__Group_1_1_0__0__Impl1653); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:817:1: rule__KClassModel__Group_1_1_0__1 : rule__KClassModel__Group_1_1_0__1__Impl ;
    public final void rule__KClassModel__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:821:1: ( rule__KClassModel__Group_1_1_0__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:822:2: rule__KClassModel__Group_1_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11684);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:828:1: rule__KClassModel__Group_1_1_0__1__Impl : ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:832:1: ( ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:833:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:833:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:834:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:835:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:835:2: rule__KClassModel__JavaProjectsAssignment_1_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1711);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:849:1: rule__KClassModel__Group_1_1_1__0 : rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 ;
    public final void rule__KClassModel__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:853:1: ( rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:854:2: rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01745);
            rule__KClassModel__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01748);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:861:1: rule__KClassModel__Group_1_1_1__0__Impl : ( 'bundle' ) ;
    public final void rule__KClassModel__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:865:1: ( ( 'bundle' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:866:1: ( 'bundle' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:866:1: ( 'bundle' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:867:1: 'bundle'
            {
             before(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KClassModel__Group_1_1_1__0__Impl1776); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:880:1: rule__KClassModel__Group_1_1_1__1 : rule__KClassModel__Group_1_1_1__1__Impl ;
    public final void rule__KClassModel__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:884:1: ( rule__KClassModel__Group_1_1_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:885:2: rule__KClassModel__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11807);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:891:1: rule__KClassModel__Group_1_1_1__1__Impl : ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:895:1: ( ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:896:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:896:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:897:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:898:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:898:2: rule__KClassModel__BundlesAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1834);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:912:1: rule__KOption__Group__0 : rule__KOption__Group__0__Impl rule__KOption__Group__1 ;
    public final void rule__KOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:916:1: ( rule__KOption__Group__0__Impl rule__KOption__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:917:2: rule__KOption__Group__0__Impl rule__KOption__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__01868);
            rule__KOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__01871);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:924:1: rule__KOption__Group__0__Impl : ( () ) ;
    public final void rule__KOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:928:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:929:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:929:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:930:1: ()
            {
             before(grammarAccess.getKOptionAccess().getKOptionAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:931:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:933:1: 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:943:1: rule__KOption__Group__1 : rule__KOption__Group__1__Impl rule__KOption__Group__2 ;
    public final void rule__KOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:947:1: ( rule__KOption__Group__1__Impl rule__KOption__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:948:2: rule__KOption__Group__1__Impl rule__KOption__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__11929);
            rule__KOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__11932);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:955:1: rule__KOption__Group__1__Impl : ( ( rule__KOption__KeyAssignment_1 ) ) ;
    public final void rule__KOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:959:1: ( ( ( rule__KOption__KeyAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:960:1: ( ( rule__KOption__KeyAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:960:1: ( ( rule__KOption__KeyAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:961:1: ( rule__KOption__KeyAssignment_1 )
            {
             before(grammarAccess.getKOptionAccess().getKeyAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:962:1: ( rule__KOption__KeyAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:962:2: rule__KOption__KeyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl1959);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:972:1: rule__KOption__Group__2 : rule__KOption__Group__2__Impl rule__KOption__Group__3 ;
    public final void rule__KOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:976:1: ( rule__KOption__Group__2__Impl rule__KOption__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:977:2: rule__KOption__Group__2__Impl rule__KOption__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__21989);
            rule__KOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__21992);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:984:1: rule__KOption__Group__2__Impl : ( '=' ) ;
    public final void rule__KOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:988:1: ( ( '=' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:989:1: ( '=' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:989:1: ( '=' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:990:1: '='
            {
             before(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KOption__Group__2__Impl2020); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1003:1: rule__KOption__Group__3 : rule__KOption__Group__3__Impl ;
    public final void rule__KOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1007:1: ( rule__KOption__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1008:2: rule__KOption__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32051);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1014:1: rule__KOption__Group__3__Impl : ( ( rule__KOption__ValueAssignment_3 ) ) ;
    public final void rule__KOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1018:1: ( ( ( rule__KOption__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1019:1: ( ( rule__KOption__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1019:1: ( ( rule__KOption__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1020:1: ( rule__KOption__ValueAssignment_3 )
            {
             before(grammarAccess.getKOptionAccess().getValueAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1021:1: ( rule__KOption__ValueAssignment_3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1021:2: rule__KOption__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2078);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1039:1: rule__KPackage__Group__0 : rule__KPackage__Group__0__Impl rule__KPackage__Group__1 ;
    public final void rule__KPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1043:1: ( rule__KPackage__Group__0__Impl rule__KPackage__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1044:2: rule__KPackage__Group__0__Impl rule__KPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02116);
            rule__KPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02119);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1051:1: rule__KPackage__Group__0__Impl : ( 'package' ) ;
    public final void rule__KPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1055:1: ( ( 'package' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1056:1: ( 'package' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1056:1: ( 'package' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1057:1: 'package'
            {
             before(grammarAccess.getKPackageAccess().getPackageKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KPackage__Group__0__Impl2147); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1070:1: rule__KPackage__Group__1 : rule__KPackage__Group__1__Impl rule__KPackage__Group__2 ;
    public final void rule__KPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1074:1: ( rule__KPackage__Group__1__Impl rule__KPackage__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1075:2: rule__KPackage__Group__1__Impl rule__KPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12178);
            rule__KPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12181);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1082:1: rule__KPackage__Group__1__Impl : ( ( rule__KPackage__NameAssignment_1 ) ) ;
    public final void rule__KPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1086:1: ( ( ( rule__KPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1087:1: ( ( rule__KPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1087:1: ( ( rule__KPackage__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1088:1: ( rule__KPackage__NameAssignment_1 )
            {
             before(grammarAccess.getKPackageAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1089:1: ( rule__KPackage__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1089:2: rule__KPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2208);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1099:1: rule__KPackage__Group__2 : rule__KPackage__Group__2__Impl rule__KPackage__Group__3 ;
    public final void rule__KPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1103:1: ( rule__KPackage__Group__2__Impl rule__KPackage__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1104:2: rule__KPackage__Group__2__Impl rule__KPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22238);
            rule__KPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22241);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1111:1: rule__KPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__KPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1116:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1116:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1117:1: '{'
            {
             before(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KPackage__Group__2__Impl2269); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1130:1: rule__KPackage__Group__3 : rule__KPackage__Group__3__Impl rule__KPackage__Group__4 ;
    public final void rule__KPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1134:1: ( rule__KPackage__Group__3__Impl rule__KPackage__Group__4 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1135:2: rule__KPackage__Group__3__Impl rule__KPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32300);
            rule__KPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32303);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1142:1: rule__KPackage__Group__3__Impl : ( ( rule__KPackage__TypesAssignment_3 )* ) ;
    public final void rule__KPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1146:1: ( ( ( rule__KPackage__TypesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1147:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1147:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1148:1: ( rule__KPackage__TypesAssignment_3 )*
            {
             before(grammarAccess.getKPackageAccess().getTypesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1149:1: ( rule__KPackage__TypesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=21)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1149:2: rule__KPackage__TypesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2330);
            	    rule__KPackage__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1159:1: rule__KPackage__Group__4 : rule__KPackage__Group__4__Impl ;
    public final void rule__KPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1163:1: ( rule__KPackage__Group__4__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1164:2: rule__KPackage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42361);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1170:1: rule__KPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__KPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1174:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1175:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1175:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1176:1: '}'
            {
             before(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KPackage__Group__4__Impl2389); 
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


    // $ANTLR start "rule__KClass__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1199:1: rule__KClass__Group__0 : rule__KClass__Group__0__Impl rule__KClass__Group__1 ;
    public final void rule__KClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1203:1: ( rule__KClass__Group__0__Impl rule__KClass__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1204:2: rule__KClass__Group__0__Impl rule__KClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02430);
            rule__KClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02433);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1211:1: rule__KClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__KClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1215:1: ( ( 'class' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1216:1: ( 'class' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1216:1: ( 'class' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1217:1: 'class'
            {
             before(grammarAccess.getKClassAccess().getClassKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__KClass__Group__0__Impl2461); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1230:1: rule__KClass__Group__1 : rule__KClass__Group__1__Impl rule__KClass__Group__2 ;
    public final void rule__KClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1234:1: ( rule__KClass__Group__1__Impl rule__KClass__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1235:2: rule__KClass__Group__1__Impl rule__KClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12492);
            rule__KClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__2_in_rule__KClass__Group__12495);
            rule__KClass__Group__2();

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1242:1: rule__KClass__Group__1__Impl : ( ( rule__KClass__NameAssignment_1 ) ) ;
    public final void rule__KClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1246:1: ( ( ( rule__KClass__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1247:1: ( ( rule__KClass__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1247:1: ( ( rule__KClass__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1248:1: ( rule__KClass__NameAssignment_1 )
            {
             before(grammarAccess.getKClassAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1249:1: ( rule__KClass__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1249:2: rule__KClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl2522);
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


    // $ANTLR start "rule__KClass__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1259:1: rule__KClass__Group__2 : rule__KClass__Group__2__Impl ;
    public final void rule__KClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1263:1: ( rule__KClass__Group__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1264:2: rule__KClass__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__2__Impl_in_rule__KClass__Group__22552);
            rule__KClass__Group__2__Impl();

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
    // $ANTLR end "rule__KClass__Group__2"


    // $ANTLR start "rule__KClass__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1270:1: rule__KClass__Group__2__Impl : ( ( rule__KClass__Group_2__0 )? ) ;
    public final void rule__KClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1274:1: ( ( ( rule__KClass__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1275:1: ( ( rule__KClass__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1275:1: ( ( rule__KClass__Group_2__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1276:1: ( rule__KClass__Group_2__0 )?
            {
             before(grammarAccess.getKClassAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1277:1: ( rule__KClass__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1277:2: rule__KClass__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KClass__Group_2__0_in_rule__KClass__Group__2__Impl2579);
                    rule__KClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKClassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KClass__Group__2__Impl"


    // $ANTLR start "rule__KClass__Group_2__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1293:1: rule__KClass__Group_2__0 : rule__KClass__Group_2__0__Impl rule__KClass__Group_2__1 ;
    public final void rule__KClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1297:1: ( rule__KClass__Group_2__0__Impl rule__KClass__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1298:2: rule__KClass__Group_2__0__Impl rule__KClass__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group_2__0__Impl_in_rule__KClass__Group_2__02616);
            rule__KClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group_2__1_in_rule__KClass__Group_2__02619);
            rule__KClass__Group_2__1();

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
    // $ANTLR end "rule__KClass__Group_2__0"


    // $ANTLR start "rule__KClass__Group_2__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1305:1: rule__KClass__Group_2__0__Impl : ( '{' ) ;
    public final void rule__KClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1309:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1310:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1310:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1311:1: '{'
            {
             before(grammarAccess.getKClassAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KClass__Group_2__0__Impl2647); 
             after(grammarAccess.getKClassAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__KClass__Group_2__0__Impl"


    // $ANTLR start "rule__KClass__Group_2__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1324:1: rule__KClass__Group_2__1 : rule__KClass__Group_2__1__Impl rule__KClass__Group_2__2 ;
    public final void rule__KClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1328:1: ( rule__KClass__Group_2__1__Impl rule__KClass__Group_2__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1329:2: rule__KClass__Group_2__1__Impl rule__KClass__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group_2__1__Impl_in_rule__KClass__Group_2__12678);
            rule__KClass__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group_2__2_in_rule__KClass__Group_2__12681);
            rule__KClass__Group_2__2();

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
    // $ANTLR end "rule__KClass__Group_2__1"


    // $ANTLR start "rule__KClass__Group_2__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1336:1: rule__KClass__Group_2__1__Impl : ( ( rule__KClass__Alternatives_2_1 )* ) ;
    public final void rule__KClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1340:1: ( ( ( rule__KClass__Alternatives_2_1 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1341:1: ( ( rule__KClass__Alternatives_2_1 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1341:1: ( ( rule__KClass__Alternatives_2_1 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1342:1: ( rule__KClass__Alternatives_2_1 )*
            {
             before(grammarAccess.getKClassAccess().getAlternatives_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1343:1: ( rule__KClass__Alternatives_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1343:2: rule__KClass__Alternatives_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClass__Alternatives_2_1_in_rule__KClass__Group_2__1__Impl2708);
            	    rule__KClass__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getKClassAccess().getAlternatives_2_1()); 

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
    // $ANTLR end "rule__KClass__Group_2__1__Impl"


    // $ANTLR start "rule__KClass__Group_2__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1353:1: rule__KClass__Group_2__2 : rule__KClass__Group_2__2__Impl ;
    public final void rule__KClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1357:1: ( rule__KClass__Group_2__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1358:2: rule__KClass__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group_2__2__Impl_in_rule__KClass__Group_2__22739);
            rule__KClass__Group_2__2__Impl();

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
    // $ANTLR end "rule__KClass__Group_2__2"


    // $ANTLR start "rule__KClass__Group_2__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1364:1: rule__KClass__Group_2__2__Impl : ( '}' ) ;
    public final void rule__KClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1368:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1369:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1369:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1370:1: '}'
            {
             before(grammarAccess.getKClassAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KClass__Group_2__2__Impl2767); 
             after(grammarAccess.getKClassAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__KClass__Group_2__2__Impl"


    // $ANTLR start "rule__KInterface__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1389:1: rule__KInterface__Group__0 : rule__KInterface__Group__0__Impl rule__KInterface__Group__1 ;
    public final void rule__KInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1393:1: ( rule__KInterface__Group__0__Impl rule__KInterface__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1394:2: rule__KInterface__Group__0__Impl rule__KInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__02804);
            rule__KInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__02807);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1401:1: rule__KInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__KInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1405:1: ( ( 'interface' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1406:1: ( 'interface' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1406:1: ( 'interface' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1407:1: 'interface'
            {
             before(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__KInterface__Group__0__Impl2835); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1420:1: rule__KInterface__Group__1 : rule__KInterface__Group__1__Impl rule__KInterface__Group__2 ;
    public final void rule__KInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1424:1: ( rule__KInterface__Group__1__Impl rule__KInterface__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1425:2: rule__KInterface__Group__1__Impl rule__KInterface__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__12866);
            rule__KInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__2_in_rule__KInterface__Group__12869);
            rule__KInterface__Group__2();

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1432:1: rule__KInterface__Group__1__Impl : ( ( rule__KInterface__NameAssignment_1 ) ) ;
    public final void rule__KInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1436:1: ( ( ( rule__KInterface__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1437:1: ( ( rule__KInterface__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1437:1: ( ( rule__KInterface__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1438:1: ( rule__KInterface__NameAssignment_1 )
            {
             before(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1439:1: ( rule__KInterface__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1439:2: rule__KInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl2896);
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


    // $ANTLR start "rule__KInterface__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1449:1: rule__KInterface__Group__2 : rule__KInterface__Group__2__Impl ;
    public final void rule__KInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1453:1: ( rule__KInterface__Group__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1454:2: rule__KInterface__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__2__Impl_in_rule__KInterface__Group__22926);
            rule__KInterface__Group__2__Impl();

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
    // $ANTLR end "rule__KInterface__Group__2"


    // $ANTLR start "rule__KInterface__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1460:1: rule__KInterface__Group__2__Impl : ( ( rule__KInterface__Group_2__0 )? ) ;
    public final void rule__KInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1464:1: ( ( ( rule__KInterface__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1465:1: ( ( rule__KInterface__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1465:1: ( ( rule__KInterface__Group_2__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1466:1: ( rule__KInterface__Group_2__0 )?
            {
             before(grammarAccess.getKInterfaceAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1467:1: ( rule__KInterface__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1467:2: rule__KInterface__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group_2__0_in_rule__KInterface__Group__2__Impl2953);
                    rule__KInterface__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKInterfaceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KInterface__Group__2__Impl"


    // $ANTLR start "rule__KInterface__Group_2__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1483:1: rule__KInterface__Group_2__0 : rule__KInterface__Group_2__0__Impl rule__KInterface__Group_2__1 ;
    public final void rule__KInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1487:1: ( rule__KInterface__Group_2__0__Impl rule__KInterface__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1488:2: rule__KInterface__Group_2__0__Impl rule__KInterface__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group_2__0__Impl_in_rule__KInterface__Group_2__02990);
            rule__KInterface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group_2__1_in_rule__KInterface__Group_2__02993);
            rule__KInterface__Group_2__1();

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
    // $ANTLR end "rule__KInterface__Group_2__0"


    // $ANTLR start "rule__KInterface__Group_2__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1495:1: rule__KInterface__Group_2__0__Impl : ( '{' ) ;
    public final void rule__KInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1499:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1500:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1500:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1501:1: '{'
            {
             before(grammarAccess.getKInterfaceAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KInterface__Group_2__0__Impl3021); 
             after(grammarAccess.getKInterfaceAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__KInterface__Group_2__0__Impl"


    // $ANTLR start "rule__KInterface__Group_2__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1514:1: rule__KInterface__Group_2__1 : rule__KInterface__Group_2__1__Impl rule__KInterface__Group_2__2 ;
    public final void rule__KInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1518:1: ( rule__KInterface__Group_2__1__Impl rule__KInterface__Group_2__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1519:2: rule__KInterface__Group_2__1__Impl rule__KInterface__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group_2__1__Impl_in_rule__KInterface__Group_2__13052);
            rule__KInterface__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group_2__2_in_rule__KInterface__Group_2__13055);
            rule__KInterface__Group_2__2();

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
    // $ANTLR end "rule__KInterface__Group_2__1"


    // $ANTLR start "rule__KInterface__Group_2__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1526:1: rule__KInterface__Group_2__1__Impl : ( ( rule__KInterface__Alternatives_2_1 )* ) ;
    public final void rule__KInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1530:1: ( ( ( rule__KInterface__Alternatives_2_1 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1531:1: ( ( rule__KInterface__Alternatives_2_1 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1531:1: ( ( rule__KInterface__Alternatives_2_1 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1532:1: ( rule__KInterface__Alternatives_2_1 )*
            {
             before(grammarAccess.getKInterfaceAccess().getAlternatives_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1533:1: ( rule__KInterface__Alternatives_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1533:2: rule__KInterface__Alternatives_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KInterface__Alternatives_2_1_in_rule__KInterface__Group_2__1__Impl3082);
            	    rule__KInterface__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getKInterfaceAccess().getAlternatives_2_1()); 

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
    // $ANTLR end "rule__KInterface__Group_2__1__Impl"


    // $ANTLR start "rule__KInterface__Group_2__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1543:1: rule__KInterface__Group_2__2 : rule__KInterface__Group_2__2__Impl ;
    public final void rule__KInterface__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1547:1: ( rule__KInterface__Group_2__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1548:2: rule__KInterface__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group_2__2__Impl_in_rule__KInterface__Group_2__23113);
            rule__KInterface__Group_2__2__Impl();

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
    // $ANTLR end "rule__KInterface__Group_2__2"


    // $ANTLR start "rule__KInterface__Group_2__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1554:1: rule__KInterface__Group_2__2__Impl : ( '}' ) ;
    public final void rule__KInterface__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1558:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1559:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1559:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1560:1: '}'
            {
             before(grammarAccess.getKInterfaceAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KInterface__Group_2__2__Impl3141); 
             after(grammarAccess.getKInterfaceAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__KInterface__Group_2__2__Impl"


    // $ANTLR start "rule__KEnum__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1579:1: rule__KEnum__Group__0 : rule__KEnum__Group__0__Impl rule__KEnum__Group__1 ;
    public final void rule__KEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1583:1: ( rule__KEnum__Group__0__Impl rule__KEnum__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1584:2: rule__KEnum__Group__0__Impl rule__KEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__03178);
            rule__KEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__03181);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1591:1: rule__KEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__KEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1595:1: ( ( 'enum' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1596:1: ( 'enum' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1596:1: ( 'enum' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1597:1: 'enum'
            {
             before(grammarAccess.getKEnumAccess().getEnumKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__KEnum__Group__0__Impl3209); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1610:1: rule__KEnum__Group__1 : rule__KEnum__Group__1__Impl rule__KEnum__Group__2 ;
    public final void rule__KEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1614:1: ( rule__KEnum__Group__1__Impl rule__KEnum__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1615:2: rule__KEnum__Group__1__Impl rule__KEnum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13240);
            rule__KEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__2_in_rule__KEnum__Group__13243);
            rule__KEnum__Group__2();

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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1622:1: rule__KEnum__Group__1__Impl : ( ( rule__KEnum__NameAssignment_1 ) ) ;
    public final void rule__KEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1626:1: ( ( ( rule__KEnum__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1627:1: ( ( rule__KEnum__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1627:1: ( ( rule__KEnum__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1628:1: ( rule__KEnum__NameAssignment_1 )
            {
             before(grammarAccess.getKEnumAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1629:1: ( rule__KEnum__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1629:2: rule__KEnum__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3270);
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


    // $ANTLR start "rule__KEnum__Group__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1639:1: rule__KEnum__Group__2 : rule__KEnum__Group__2__Impl ;
    public final void rule__KEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1643:1: ( rule__KEnum__Group__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1644:2: rule__KEnum__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__2__Impl_in_rule__KEnum__Group__23300);
            rule__KEnum__Group__2__Impl();

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
    // $ANTLR end "rule__KEnum__Group__2"


    // $ANTLR start "rule__KEnum__Group__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1650:1: rule__KEnum__Group__2__Impl : ( ( rule__KEnum__Group_2__0 )? ) ;
    public final void rule__KEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1654:1: ( ( ( rule__KEnum__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1655:1: ( ( rule__KEnum__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1655:1: ( ( rule__KEnum__Group_2__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1656:1: ( rule__KEnum__Group_2__0 )?
            {
             before(grammarAccess.getKEnumAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1657:1: ( rule__KEnum__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1657:2: rule__KEnum__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group_2__0_in_rule__KEnum__Group__2__Impl3327);
                    rule__KEnum__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKEnumAccess().getGroup_2()); 

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
    // $ANTLR end "rule__KEnum__Group__2__Impl"


    // $ANTLR start "rule__KEnum__Group_2__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1673:1: rule__KEnum__Group_2__0 : rule__KEnum__Group_2__0__Impl rule__KEnum__Group_2__1 ;
    public final void rule__KEnum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1677:1: ( rule__KEnum__Group_2__0__Impl rule__KEnum__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1678:2: rule__KEnum__Group_2__0__Impl rule__KEnum__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group_2__0__Impl_in_rule__KEnum__Group_2__03364);
            rule__KEnum__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group_2__1_in_rule__KEnum__Group_2__03367);
            rule__KEnum__Group_2__1();

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
    // $ANTLR end "rule__KEnum__Group_2__0"


    // $ANTLR start "rule__KEnum__Group_2__0__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1685:1: rule__KEnum__Group_2__0__Impl : ( '{' ) ;
    public final void rule__KEnum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1689:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1690:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1690:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1691:1: '{'
            {
             before(grammarAccess.getKEnumAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KEnum__Group_2__0__Impl3395); 
             after(grammarAccess.getKEnumAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__KEnum__Group_2__0__Impl"


    // $ANTLR start "rule__KEnum__Group_2__1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1704:1: rule__KEnum__Group_2__1 : rule__KEnum__Group_2__1__Impl rule__KEnum__Group_2__2 ;
    public final void rule__KEnum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1708:1: ( rule__KEnum__Group_2__1__Impl rule__KEnum__Group_2__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1709:2: rule__KEnum__Group_2__1__Impl rule__KEnum__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group_2__1__Impl_in_rule__KEnum__Group_2__13426);
            rule__KEnum__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group_2__2_in_rule__KEnum__Group_2__13429);
            rule__KEnum__Group_2__2();

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
    // $ANTLR end "rule__KEnum__Group_2__1"


    // $ANTLR start "rule__KEnum__Group_2__1__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1716:1: rule__KEnum__Group_2__1__Impl : ( ( rule__KEnum__Alternatives_2_1 )* ) ;
    public final void rule__KEnum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1720:1: ( ( ( rule__KEnum__Alternatives_2_1 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1721:1: ( ( rule__KEnum__Alternatives_2_1 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1721:1: ( ( rule__KEnum__Alternatives_2_1 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1722:1: ( rule__KEnum__Alternatives_2_1 )*
            {
             before(grammarAccess.getKEnumAccess().getAlternatives_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1723:1: ( rule__KEnum__Alternatives_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1723:2: rule__KEnum__Alternatives_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KEnum__Alternatives_2_1_in_rule__KEnum__Group_2__1__Impl3456);
            	    rule__KEnum__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getKEnumAccess().getAlternatives_2_1()); 

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
    // $ANTLR end "rule__KEnum__Group_2__1__Impl"


    // $ANTLR start "rule__KEnum__Group_2__2"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1733:1: rule__KEnum__Group_2__2 : rule__KEnum__Group_2__2__Impl ;
    public final void rule__KEnum__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1737:1: ( rule__KEnum__Group_2__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1738:2: rule__KEnum__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group_2__2__Impl_in_rule__KEnum__Group_2__23487);
            rule__KEnum__Group_2__2__Impl();

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
    // $ANTLR end "rule__KEnum__Group_2__2"


    // $ANTLR start "rule__KEnum__Group_2__2__Impl"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1744:1: rule__KEnum__Group_2__2__Impl : ( '}' ) ;
    public final void rule__KEnum__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1748:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1749:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1749:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1750:1: '}'
            {
             before(grammarAccess.getKEnumAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KEnum__Group_2__2__Impl3515); 
             after(grammarAccess.getKEnumAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__KEnum__Group_2__2__Impl"


    // $ANTLR start "rule__KMethod__Group__0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1769:1: rule__KMethod__Group__0 : rule__KMethod__Group__0__Impl rule__KMethod__Group__1 ;
    public final void rule__KMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1773:1: ( rule__KMethod__Group__0__Impl rule__KMethod__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1774:2: rule__KMethod__Group__0__Impl rule__KMethod__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03552);
            rule__KMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03555);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1781:1: rule__KMethod__Group__0__Impl : ( ( rule__KMethod__NameAssignment_0 ) ) ;
    public final void rule__KMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1785:1: ( ( ( rule__KMethod__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1786:1: ( ( rule__KMethod__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1786:1: ( ( rule__KMethod__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1787:1: ( rule__KMethod__NameAssignment_0 )
            {
             before(grammarAccess.getKMethodAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1788:1: ( rule__KMethod__NameAssignment_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1788:2: rule__KMethod__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3582);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1798:1: rule__KMethod__Group__1 : rule__KMethod__Group__1__Impl rule__KMethod__Group__2 ;
    public final void rule__KMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1802:1: ( rule__KMethod__Group__1__Impl rule__KMethod__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1803:2: rule__KMethod__Group__1__Impl rule__KMethod__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13612);
            rule__KMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13615);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1810:1: rule__KMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__KMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1814:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1815:1: ( '(' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1815:1: ( '(' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1816:1: '('
            {
             before(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__KMethod__Group__1__Impl3643); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1829:1: rule__KMethod__Group__2 : rule__KMethod__Group__2__Impl rule__KMethod__Group__3 ;
    public final void rule__KMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1833:1: ( rule__KMethod__Group__2__Impl rule__KMethod__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1834:2: rule__KMethod__Group__2__Impl rule__KMethod__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23674);
            rule__KMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23677);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1841:1: rule__KMethod__Group__2__Impl : ( ( rule__KMethod__Group_2__0 )? ) ;
    public final void rule__KMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1845:1: ( ( ( rule__KMethod__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1846:1: ( ( rule__KMethod__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1846:1: ( ( rule__KMethod__Group_2__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1847:1: ( rule__KMethod__Group_2__0 )?
            {
             before(grammarAccess.getKMethodAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1848:1: ( rule__KMethod__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1848:2: rule__KMethod__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3704);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1858:1: rule__KMethod__Group__3 : rule__KMethod__Group__3__Impl ;
    public final void rule__KMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1862:1: ( rule__KMethod__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1863:2: rule__KMethod__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33735);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1869:1: rule__KMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__KMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1873:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1874:1: ( ')' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1874:1: ( ')' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1875:1: ')'
            {
             before(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__KMethod__Group__3__Impl3763); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1896:1: rule__KMethod__Group_2__0 : rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 ;
    public final void rule__KMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1900:1: ( rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1901:2: rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03802);
            rule__KMethod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03805);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1908:1: rule__KMethod__Group_2__0__Impl : ( ( rule__KMethod__ParametersAssignment_2_0 ) ) ;
    public final void rule__KMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1912:1: ( ( ( rule__KMethod__ParametersAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1913:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1913:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1914:1: ( rule__KMethod__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1915:1: ( rule__KMethod__ParametersAssignment_2_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1915:2: rule__KMethod__ParametersAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3832);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1925:1: rule__KMethod__Group_2__1 : rule__KMethod__Group_2__1__Impl ;
    public final void rule__KMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1929:1: ( rule__KMethod__Group_2__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1930:2: rule__KMethod__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13862);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1936:1: rule__KMethod__Group_2__1__Impl : ( ( rule__KMethod__Group_2_1__0 )* ) ;
    public final void rule__KMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1940:1: ( ( ( rule__KMethod__Group_2_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1941:1: ( ( rule__KMethod__Group_2_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1941:1: ( ( rule__KMethod__Group_2_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1942:1: ( rule__KMethod__Group_2_1__0 )*
            {
             before(grammarAccess.getKMethodAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1943:1: ( rule__KMethod__Group_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1943:2: rule__KMethod__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3889);
            	    rule__KMethod__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1957:1: rule__KMethod__Group_2_1__0 : rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 ;
    public final void rule__KMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1961:1: ( rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1962:2: rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03924);
            rule__KMethod__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03927);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1969:1: rule__KMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1973:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1974:1: ( ',' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1974:1: ( ',' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1975:1: ','
            {
             before(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__KMethod__Group_2_1__0__Impl3955); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1988:1: rule__KMethod__Group_2_1__1 : rule__KMethod__Group_2_1__1__Impl ;
    public final void rule__KMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1992:1: ( rule__KMethod__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1993:2: rule__KMethod__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13986);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1999:1: rule__KMethod__Group_2_1__1__Impl : ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__KMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2003:1: ( ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2004:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2004:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2005:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2006:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2006:2: rule__KMethod__ParametersAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl4013);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2020:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2024:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2025:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__04047);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__04050);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2032:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2036:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2037:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2037:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2038:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl4077); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2049:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2053:1: ( rule__QualifiedID__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2054:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__14106);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2060:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2064:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2065:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2065:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2066:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2067:1: ( rule__QualifiedID__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2067:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl4133);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2081:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2085:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2086:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__04168);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__04171);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2093:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2097:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2098:1: ( '.' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2098:1: ( '.' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2099:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__QualifiedID__Group_1__0__Impl4199); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2112:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2116:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2117:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__14230);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2123:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2127:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2128:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2128:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2129:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl4257); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2145:1: rule__KClassModel__JavaProjectsAssignment_1_1_0_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__JavaProjectsAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2149:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2150:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2150:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2151:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsQualifiedIDParserRuleCall_1_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14295);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2160:1: rule__KClassModel__BundlesAssignment_1_1_1_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__BundlesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2164:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2165:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2165:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2166:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14326);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2175:1: rule__KClassModel__OptionsAssignment_2 : ( ruleKOption ) ;
    public final void rule__KClassModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2179:1: ( ( ruleKOption ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2180:1: ( ruleKOption )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2180:1: ( ruleKOption )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2181:1: ruleKOption
            {
             before(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24357);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2190:1: rule__KClassModel__PackagesAssignment_3 : ( ruleKPackage ) ;
    public final void rule__KClassModel__PackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2194:1: ( ( ruleKPackage ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2195:1: ( ruleKPackage )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2195:1: ( ruleKPackage )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2196:1: ruleKPackage
            {
             before(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34388);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2205:1: rule__KOption__KeyAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KOption__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2209:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2210:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2210:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2211:1: ruleQualifiedID
            {
             before(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14419);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2220:1: rule__KOption__ValueAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__KOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2224:1: ( ( rulePropertyValue ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2225:1: ( rulePropertyValue )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2225:1: ( rulePropertyValue )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2226:1: rulePropertyValue
            {
             before(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34450);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2235:1: rule__KPackage__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2239:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2240:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2240:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2241:1: ruleQualifiedID
            {
             before(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14481);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2250:1: rule__KPackage__TypesAssignment_3 : ( ruleKType ) ;
    public final void rule__KPackage__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2254:1: ( ( ruleKType ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2255:1: ( ruleKType )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2255:1: ( ruleKType )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2256:1: ruleKType
            {
             before(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34512);
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


    // $ANTLR start "rule__KClass__NameAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2265:1: rule__KClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2269:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2270:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2270:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2271:1: RULE_ID
            {
             before(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KClass__NameAssignment_14543); 
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


    // $ANTLR start "rule__KClass__FieldsAssignment_2_1_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2280:1: rule__KClass__FieldsAssignment_2_1_0 : ( ruleKField ) ;
    public final void rule__KClass__FieldsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2284:1: ( ( ruleKField ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2285:1: ( ruleKField )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2285:1: ( ruleKField )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2286:1: ruleKField
            {
             before(grammarAccess.getKClassAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_rule__KClass__FieldsAssignment_2_1_04574);
            ruleKField();

            state._fsp--;

             after(grammarAccess.getKClassAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__KClass__FieldsAssignment_2_1_0"


    // $ANTLR start "rule__KClass__MethodsAssignment_2_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2295:1: rule__KClass__MethodsAssignment_2_1_1 : ( ruleKMethod ) ;
    public final void rule__KClass__MethodsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2299:1: ( ( ruleKMethod ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2300:1: ( ruleKMethod )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2300:1: ( ruleKMethod )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2301:1: ruleKMethod
            {
             before(grammarAccess.getKClassAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_rule__KClass__MethodsAssignment_2_1_14605);
            ruleKMethod();

            state._fsp--;

             after(grammarAccess.getKClassAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__KClass__MethodsAssignment_2_1_1"


    // $ANTLR start "rule__KInterface__NameAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2310:1: rule__KInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2314:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2315:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2315:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2316:1: RULE_ID
            {
             before(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KInterface__NameAssignment_14636); 
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


    // $ANTLR start "rule__KInterface__FieldsAssignment_2_1_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2325:1: rule__KInterface__FieldsAssignment_2_1_0 : ( ruleKField ) ;
    public final void rule__KInterface__FieldsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2329:1: ( ( ruleKField ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2330:1: ( ruleKField )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2330:1: ( ruleKField )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2331:1: ruleKField
            {
             before(grammarAccess.getKInterfaceAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_rule__KInterface__FieldsAssignment_2_1_04667);
            ruleKField();

            state._fsp--;

             after(grammarAccess.getKInterfaceAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__KInterface__FieldsAssignment_2_1_0"


    // $ANTLR start "rule__KInterface__MethodsAssignment_2_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2340:1: rule__KInterface__MethodsAssignment_2_1_1 : ( ruleKMethod ) ;
    public final void rule__KInterface__MethodsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2344:1: ( ( ruleKMethod ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2345:1: ( ruleKMethod )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2345:1: ( ruleKMethod )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2346:1: ruleKMethod
            {
             before(grammarAccess.getKInterfaceAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_rule__KInterface__MethodsAssignment_2_1_14698);
            ruleKMethod();

            state._fsp--;

             after(grammarAccess.getKInterfaceAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__KInterface__MethodsAssignment_2_1_1"


    // $ANTLR start "rule__KEnum__NameAssignment_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2355:1: rule__KEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2359:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2360:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2360:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2361:1: RULE_ID
            {
             before(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KEnum__NameAssignment_14729); 
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


    // $ANTLR start "rule__KEnum__FieldsAssignment_2_1_0"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2370:1: rule__KEnum__FieldsAssignment_2_1_0 : ( ruleKField ) ;
    public final void rule__KEnum__FieldsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2374:1: ( ( ruleKField ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2375:1: ( ruleKField )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2375:1: ( ruleKField )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2376:1: ruleKField
            {
             before(grammarAccess.getKEnumAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_rule__KEnum__FieldsAssignment_2_1_04760);
            ruleKField();

            state._fsp--;

             after(grammarAccess.getKEnumAccess().getFieldsKFieldParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__KEnum__FieldsAssignment_2_1_0"


    // $ANTLR start "rule__KEnum__MethodsAssignment_2_1_1"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2385:1: rule__KEnum__MethodsAssignment_2_1_1 : ( ruleKMethod ) ;
    public final void rule__KEnum__MethodsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2389:1: ( ( ruleKMethod ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2390:1: ( ruleKMethod )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2390:1: ( ruleKMethod )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2391:1: ruleKMethod
            {
             before(grammarAccess.getKEnumAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_rule__KEnum__MethodsAssignment_2_1_14791);
            ruleKMethod();

            state._fsp--;

             after(grammarAccess.getKEnumAccess().getMethodsKMethodParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__KEnum__MethodsAssignment_2_1_1"


    // $ANTLR start "rule__KField__NameAssignment"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2400:1: rule__KField__NameAssignment : ( RULE_ID ) ;
    public final void rule__KField__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2404:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2405:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2405:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2406:1: RULE_ID
            {
             before(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KField__NameAssignment4822); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2415:1: rule__KMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__KMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2419:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2420:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2420:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2421:1: RULE_ID
            {
             before(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_04853); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2430:1: rule__KMethod__ParametersAssignment_2_0 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2434:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2435:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2435:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2436:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_04884);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2445:1: rule__KMethod__ParametersAssignment_2_1_1 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2449:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2450:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2450:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2451:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_14915);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2460:1: rule__KTypeReference__SignatureAssignment : ( RULE_ID ) ;
    public final void rule__KTypeReference__SignatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2464:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2465:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2465:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2466:1: RULE_ID
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment4946); 
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
        public static final BitSet FOLLOW_rule__KType__Alternatives_in_ruleKType274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_entryRuleKClass301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKClass308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__0_in_ruleKClass334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_entryRuleKInterface361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKInterface368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__0_in_ruleKInterface394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_entryRuleKEnum421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKEnum428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__0_in_ruleKEnum454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_entryRuleKField481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKField488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KField__NameAssignment_in_ruleKField514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_entryRuleKMethod541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKMethod548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__0_in_ruleKMethod574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_entryRuleKTypeReference601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKTypeReference608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KTypeReference__SignatureAssignment_in_ruleKTypeReference634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_entryRuleQualifiedID661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedID668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__0_in_ruleQualifiedID694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValue__Alternatives_in_rulePropertyValue754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Float__Alternatives_in_ruleFloat814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__0_in_rule__KClassModel__Alternatives_1_1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__0_in_rule__KClassModel__Alternatives_1_1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKClass_in_rule__KType__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKInterface_in_rule__KType__Alternatives918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKEnum_in_rule__KType__Alternatives935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__FieldsAssignment_2_1_0_in_rule__KClass__Alternatives_2_1967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__MethodsAssignment_2_1_1_in_rule__KClass__Alternatives_2_1985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__FieldsAssignment_2_1_0_in_rule__KInterface__Alternatives_2_11018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__MethodsAssignment_2_1_1_in_rule__KInterface__Alternatives_2_11036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__FieldsAssignment_2_1_0_in_rule__KEnum__Alternatives_2_11069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__MethodsAssignment_2_1_1_in_rule__KEnum__Alternatives_2_11087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01250 = new BitSet(new long[]{0x0000000000011100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11311 = new BitSet(new long[]{0x0000000000011100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1341 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21372 = new BitSet(new long[]{0x0000000000011100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1402 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1460 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01499 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KClassModel__Group_1__0__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01622 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__KClassModel__Group_1_1_0__0__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01745 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KClassModel__Group_1_1_1__0__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__01868 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__01871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__11929 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__11932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl1959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__21989 = new BitSet(new long[]{0x00000000000001F0L});
        public static final BitSet FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__21992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KOption__Group__2__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02116 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KPackage__Group__0__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12178 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22238 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KPackage__Group__2__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32300 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2330 = new BitSet(new long[]{0x0000000000380002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KPackage__Group__4__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02430 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__KClass__Group__0__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12492 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KClass__Group__2_in_rule__KClass__Group__12495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__2__Impl_in_rule__KClass__Group__22552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group_2__0_in_rule__KClass__Group__2__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group_2__0__Impl_in_rule__KClass__Group_2__02616 = new BitSet(new long[]{0x0000000000040100L});
        public static final BitSet FOLLOW_rule__KClass__Group_2__1_in_rule__KClass__Group_2__02619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KClass__Group_2__0__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group_2__1__Impl_in_rule__KClass__Group_2__12678 = new BitSet(new long[]{0x0000000000040100L});
        public static final BitSet FOLLOW_rule__KClass__Group_2__2_in_rule__KClass__Group_2__12681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Alternatives_2_1_in_rule__KClass__Group_2__1__Impl2708 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__KClass__Group_2__2__Impl_in_rule__KClass__Group_2__22739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KClass__Group_2__2__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__02804 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__02807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__KInterface__Group__0__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__12866 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KInterface__Group__2_in_rule__KInterface__Group__12869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__2__Impl_in_rule__KInterface__Group__22926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group_2__0_in_rule__KInterface__Group__2__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group_2__0__Impl_in_rule__KInterface__Group_2__02990 = new BitSet(new long[]{0x0000000000040100L});
        public static final BitSet FOLLOW_rule__KInterface__Group_2__1_in_rule__KInterface__Group_2__02993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KInterface__Group_2__0__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group_2__1__Impl_in_rule__KInterface__Group_2__13052 = new BitSet(new long[]{0x0000000000040100L});
        public static final BitSet FOLLOW_rule__KInterface__Group_2__2_in_rule__KInterface__Group_2__13055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Alternatives_2_1_in_rule__KInterface__Group_2__1__Impl3082 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__KInterface__Group_2__2__Impl_in_rule__KInterface__Group_2__23113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KInterface__Group_2__2__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__03178 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__03181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__KEnum__Group__0__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13240 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KEnum__Group__2_in_rule__KEnum__Group__13243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__2__Impl_in_rule__KEnum__Group__23300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group_2__0_in_rule__KEnum__Group__2__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group_2__0__Impl_in_rule__KEnum__Group_2__03364 = new BitSet(new long[]{0x0000000000040100L});
        public static final BitSet FOLLOW_rule__KEnum__Group_2__1_in_rule__KEnum__Group_2__03367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KEnum__Group_2__0__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group_2__1__Impl_in_rule__KEnum__Group_2__13426 = new BitSet(new long[]{0x0000000000040100L});
        public static final BitSet FOLLOW_rule__KEnum__Group_2__2_in_rule__KEnum__Group_2__13429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Alternatives_2_1_in_rule__KEnum__Group_2__1__Impl3456 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__KEnum__Group_2__2__Impl_in_rule__KEnum__Group_2__23487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KEnum__Group_2__2__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03552 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13612 = new BitSet(new long[]{0x0000000000800100L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__KMethod__Group__1__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23674 = new BitSet(new long[]{0x0000000000800100L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__KMethod__Group__3__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03802 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3889 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03924 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__KMethod__Group_2_1__0__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl4013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__04047 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__04050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__14106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl4133 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__04168 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__04171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__QualifiedID__Group_1__0__Impl4199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__14230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KClass__NameAssignment_14543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_rule__KClass__FieldsAssignment_2_1_04574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_rule__KClass__MethodsAssignment_2_1_14605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KInterface__NameAssignment_14636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_rule__KInterface__FieldsAssignment_2_1_04667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_rule__KInterface__MethodsAssignment_2_1_14698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KEnum__NameAssignment_14729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_rule__KEnum__FieldsAssignment_2_1_04760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_rule__KEnum__MethodsAssignment_2_1_14791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KField__NameAssignment4822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_04853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_04884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_14915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment4946 = new BitSet(new long[]{0x0000000000000002L});
    }


}