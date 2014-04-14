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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_STRING", "RULE_TFLOAT", "RULE_NATURAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'project'", "'bundle'", "'='", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'depend'", "'('", "')'", "','", "'.'"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_ID=8;
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

                if ( (LA3_1==RULE_ID||LA3_1==18||LA3_1==22) ) {
                    alt3=1;
                }
                else if ( (LA3_1==23) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==22) ) {
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


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:530:1: rule__PropertyValue__Alternatives : ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:534:1: ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) )
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:535:1: ( RULE_BOOLEAN )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:535:1: ( RULE_BOOLEAN )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:536:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1096); 
                     after(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:541:6: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:541:6: ( RULE_STRING )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:542:1: RULE_STRING
                    {
                     before(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1113); 
                     after(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:547:6: ( ruleFloat )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:547:6: ( ruleFloat )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:548:1: ruleFloat
                    {
                     before(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1130);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:553:6: ( ruleQualifiedID )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:553:6: ( ruleQualifiedID )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:554:1: ruleQualifiedID
                    {
                     before(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1147);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:564:1: rule__Float__Alternatives : ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:568:1: ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) )
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:569:1: ( RULE_TFLOAT )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:569:1: ( RULE_TFLOAT )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:570:1: RULE_TFLOAT
                    {
                     before(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                    match(input,RULE_TFLOAT,FollowSets000.FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1179); 
                     after(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:575:6: ( RULE_NATURAL )
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:575:6: ( RULE_NATURAL )
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:576:1: RULE_NATURAL
                    {
                     before(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); 
                    match(input,RULE_NATURAL,FollowSets000.FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1196); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:588:1: rule__KClassModel__Group__0 : rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 ;
    public final void rule__KClassModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:592:1: ( rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:593:2: rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01226);
            rule__KClassModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01229);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:600:1: rule__KClassModel__Group__0__Impl : ( () ) ;
    public final void rule__KClassModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:604:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:605:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:605:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:606:1: ()
            {
             before(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:607:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:609:1: 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:619:1: rule__KClassModel__Group__1 : rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 ;
    public final void rule__KClassModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:623:1: ( rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:624:2: rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11287);
            rule__KClassModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11290);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:631:1: rule__KClassModel__Group__1__Impl : ( ( rule__KClassModel__Group_1__0 )* ) ;
    public final void rule__KClassModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:635:1: ( ( ( rule__KClassModel__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:636:1: ( ( rule__KClassModel__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:636:1: ( ( rule__KClassModel__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:637:1: ( rule__KClassModel__Group_1__0 )*
            {
             before(grammarAccess.getKClassModelAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:638:1: ( rule__KClassModel__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:638:2: rule__KClassModel__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1317);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:648:1: rule__KClassModel__Group__2 : rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 ;
    public final void rule__KClassModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:652:1: ( rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:653:2: rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21348);
            rule__KClassModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21351);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:660:1: rule__KClassModel__Group__2__Impl : ( ( rule__KClassModel__OptionsAssignment_2 )* ) ;
    public final void rule__KClassModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:664:1: ( ( ( rule__KClassModel__OptionsAssignment_2 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:665:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:665:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:666:1: ( rule__KClassModel__OptionsAssignment_2 )*
            {
             before(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:667:1: ( rule__KClassModel__OptionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:667:2: rule__KClassModel__OptionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1378);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:677:1: rule__KClassModel__Group__3 : rule__KClassModel__Group__3__Impl ;
    public final void rule__KClassModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:681:1: ( rule__KClassModel__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:682:2: rule__KClassModel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31409);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:688:1: rule__KClassModel__Group__3__Impl : ( ( rule__KClassModel__PackagesAssignment_3 )* ) ;
    public final void rule__KClassModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:692:1: ( ( ( rule__KClassModel__PackagesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:693:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:693:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:694:1: ( rule__KClassModel__PackagesAssignment_3 )*
            {
             before(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:695:1: ( rule__KClassModel__PackagesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:695:2: rule__KClassModel__PackagesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1436);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:713:1: rule__KClassModel__Group_1__0 : rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 ;
    public final void rule__KClassModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:717:1: ( rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:718:2: rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01475);
            rule__KClassModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01478);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:725:1: rule__KClassModel__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__KClassModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:729:1: ( ( 'import' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:730:1: ( 'import' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:730:1: ( 'import' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:731:1: 'import'
            {
             before(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__KClassModel__Group_1__0__Impl1506); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:744:1: rule__KClassModel__Group_1__1 : rule__KClassModel__Group_1__1__Impl ;
    public final void rule__KClassModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:748:1: ( rule__KClassModel__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:749:2: rule__KClassModel__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11537);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:755:1: rule__KClassModel__Group_1__1__Impl : ( ( rule__KClassModel__Alternatives_1_1 ) ) ;
    public final void rule__KClassModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:759:1: ( ( ( rule__KClassModel__Alternatives_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:760:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:760:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:761:1: ( rule__KClassModel__Alternatives_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:762:1: ( rule__KClassModel__Alternatives_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:762:2: rule__KClassModel__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1564);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:776:1: rule__KClassModel__Group_1_1_0__0 : rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 ;
    public final void rule__KClassModel__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:780:1: ( rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:781:2: rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01598);
            rule__KClassModel__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01601);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:788:1: rule__KClassModel__Group_1_1_0__0__Impl : ( 'project' ) ;
    public final void rule__KClassModel__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:792:1: ( ( 'project' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:793:1: ( 'project' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:793:1: ( 'project' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:794:1: 'project'
            {
             before(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__KClassModel__Group_1_1_0__0__Impl1629); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:807:1: rule__KClassModel__Group_1_1_0__1 : rule__KClassModel__Group_1_1_0__1__Impl ;
    public final void rule__KClassModel__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:811:1: ( rule__KClassModel__Group_1_1_0__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:812:2: rule__KClassModel__Group_1_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11660);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:818:1: rule__KClassModel__Group_1_1_0__1__Impl : ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:822:1: ( ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:823:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:823:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:824:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:825:1: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:825:2: rule__KClassModel__JavaProjectsAssignment_1_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1687);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:839:1: rule__KClassModel__Group_1_1_1__0 : rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 ;
    public final void rule__KClassModel__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:843:1: ( rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:844:2: rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01721);
            rule__KClassModel__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01724);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:851:1: rule__KClassModel__Group_1_1_1__0__Impl : ( 'bundle' ) ;
    public final void rule__KClassModel__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:855:1: ( ( 'bundle' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:856:1: ( 'bundle' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:856:1: ( 'bundle' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:857:1: 'bundle'
            {
             before(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KClassModel__Group_1_1_1__0__Impl1752); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:870:1: rule__KClassModel__Group_1_1_1__1 : rule__KClassModel__Group_1_1_1__1__Impl ;
    public final void rule__KClassModel__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:874:1: ( rule__KClassModel__Group_1_1_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:875:2: rule__KClassModel__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11783);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:881:1: rule__KClassModel__Group_1_1_1__1__Impl : ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:885:1: ( ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:886:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:886:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:887:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:888:1: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:888:2: rule__KClassModel__BundlesAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1810);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:902:1: rule__KOption__Group__0 : rule__KOption__Group__0__Impl rule__KOption__Group__1 ;
    public final void rule__KOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:906:1: ( rule__KOption__Group__0__Impl rule__KOption__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:907:2: rule__KOption__Group__0__Impl rule__KOption__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__01844);
            rule__KOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__01847);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:914:1: rule__KOption__Group__0__Impl : ( () ) ;
    public final void rule__KOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:918:1: ( ( () ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:919:1: ( () )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:919:1: ( () )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:920:1: ()
            {
             before(grammarAccess.getKOptionAccess().getKOptionAction_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:921:1: ()
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:923:1: 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:933:1: rule__KOption__Group__1 : rule__KOption__Group__1__Impl rule__KOption__Group__2 ;
    public final void rule__KOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:937:1: ( rule__KOption__Group__1__Impl rule__KOption__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:938:2: rule__KOption__Group__1__Impl rule__KOption__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__11905);
            rule__KOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__11908);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:945:1: rule__KOption__Group__1__Impl : ( ( rule__KOption__KeyAssignment_1 ) ) ;
    public final void rule__KOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:949:1: ( ( ( rule__KOption__KeyAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:950:1: ( ( rule__KOption__KeyAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:950:1: ( ( rule__KOption__KeyAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:951:1: ( rule__KOption__KeyAssignment_1 )
            {
             before(grammarAccess.getKOptionAccess().getKeyAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:952:1: ( rule__KOption__KeyAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:952:2: rule__KOption__KeyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl1935);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:962:1: rule__KOption__Group__2 : rule__KOption__Group__2__Impl rule__KOption__Group__3 ;
    public final void rule__KOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:966:1: ( rule__KOption__Group__2__Impl rule__KOption__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:967:2: rule__KOption__Group__2__Impl rule__KOption__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__21965);
            rule__KOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__21968);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:974:1: rule__KOption__Group__2__Impl : ( '=' ) ;
    public final void rule__KOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:978:1: ( ( '=' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:979:1: ( '=' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:979:1: ( '=' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:980:1: '='
            {
             before(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KOption__Group__2__Impl1996); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:993:1: rule__KOption__Group__3 : rule__KOption__Group__3__Impl ;
    public final void rule__KOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:997:1: ( rule__KOption__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:998:2: rule__KOption__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32027);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1004:1: rule__KOption__Group__3__Impl : ( ( rule__KOption__ValueAssignment_3 ) ) ;
    public final void rule__KOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1008:1: ( ( ( rule__KOption__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1009:1: ( ( rule__KOption__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1009:1: ( ( rule__KOption__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1010:1: ( rule__KOption__ValueAssignment_3 )
            {
             before(grammarAccess.getKOptionAccess().getValueAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1011:1: ( rule__KOption__ValueAssignment_3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1011:2: rule__KOption__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2054);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1029:1: rule__KPackage__Group__0 : rule__KPackage__Group__0__Impl rule__KPackage__Group__1 ;
    public final void rule__KPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1033:1: ( rule__KPackage__Group__0__Impl rule__KPackage__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1034:2: rule__KPackage__Group__0__Impl rule__KPackage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02092);
            rule__KPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02095);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1041:1: rule__KPackage__Group__0__Impl : ( 'package' ) ;
    public final void rule__KPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1045:1: ( ( 'package' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1046:1: ( 'package' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1046:1: ( 'package' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1047:1: 'package'
            {
             before(grammarAccess.getKPackageAccess().getPackageKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KPackage__Group__0__Impl2123); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1060:1: rule__KPackage__Group__1 : rule__KPackage__Group__1__Impl rule__KPackage__Group__2 ;
    public final void rule__KPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1064:1: ( rule__KPackage__Group__1__Impl rule__KPackage__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1065:2: rule__KPackage__Group__1__Impl rule__KPackage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12154);
            rule__KPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12157);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1072:1: rule__KPackage__Group__1__Impl : ( ( rule__KPackage__NameAssignment_1 ) ) ;
    public final void rule__KPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1076:1: ( ( ( rule__KPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1077:1: ( ( rule__KPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1077:1: ( ( rule__KPackage__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1078:1: ( rule__KPackage__NameAssignment_1 )
            {
             before(grammarAccess.getKPackageAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1079:1: ( rule__KPackage__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1079:2: rule__KPackage__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2184);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1089:1: rule__KPackage__Group__2 : rule__KPackage__Group__2__Impl rule__KPackage__Group__3 ;
    public final void rule__KPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1093:1: ( rule__KPackage__Group__2__Impl rule__KPackage__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1094:2: rule__KPackage__Group__2__Impl rule__KPackage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22214);
            rule__KPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22217);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1101:1: rule__KPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__KPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1106:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1106:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1107:1: '{'
            {
             before(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KPackage__Group__2__Impl2245); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1120:1: rule__KPackage__Group__3 : rule__KPackage__Group__3__Impl rule__KPackage__Group__4 ;
    public final void rule__KPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1124:1: ( rule__KPackage__Group__3__Impl rule__KPackage__Group__4 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1125:2: rule__KPackage__Group__3__Impl rule__KPackage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32276);
            rule__KPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32279);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1132:1: rule__KPackage__Group__3__Impl : ( ( rule__KPackage__TypesAssignment_3 )* ) ;
    public final void rule__KPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1136:1: ( ( ( rule__KPackage__TypesAssignment_3 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1137:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1137:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1138:1: ( rule__KPackage__TypesAssignment_3 )*
            {
             before(grammarAccess.getKPackageAccess().getTypesAssignment_3()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1139:1: ( rule__KPackage__TypesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=19 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1139:2: rule__KPackage__TypesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2306);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1149:1: rule__KPackage__Group__4 : rule__KPackage__Group__4__Impl ;
    public final void rule__KPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1153:1: ( rule__KPackage__Group__4__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1154:2: rule__KPackage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42337);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1160:1: rule__KPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__KPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1164:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1165:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1165:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1166:1: '}'
            {
             before(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KPackage__Group__4__Impl2365); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1189:1: rule__KType__Group__0 : rule__KType__Group__0__Impl rule__KType__Group__1 ;
    public final void rule__KType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1193:1: ( rule__KType__Group__0__Impl rule__KType__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1194:2: rule__KType__Group__0__Impl rule__KType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__0__Impl_in_rule__KType__Group__02406);
            rule__KType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__1_in_rule__KType__Group__02409);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1201:1: rule__KType__Group__0__Impl : ( ( rule__KType__Alternatives_0 ) ) ;
    public final void rule__KType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1205:1: ( ( ( rule__KType__Alternatives_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1206:1: ( ( rule__KType__Alternatives_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1206:1: ( ( rule__KType__Alternatives_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1207:1: ( rule__KType__Alternatives_0 )
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1208:1: ( rule__KType__Alternatives_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1208:2: rule__KType__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Alternatives_0_in_rule__KType__Group__0__Impl2436);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1218:1: rule__KType__Group__1 : rule__KType__Group__1__Impl ;
    public final void rule__KType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1222:1: ( rule__KType__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1223:2: rule__KType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group__1__Impl_in_rule__KType__Group__12466);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1229:1: rule__KType__Group__1__Impl : ( ( rule__KType__Group_1__0 )? ) ;
    public final void rule__KType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1233:1: ( ( ( rule__KType__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1234:1: ( ( rule__KType__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1234:1: ( ( rule__KType__Group_1__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1235:1: ( rule__KType__Group_1__0 )?
            {
             before(grammarAccess.getKTypeAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1236:1: ( rule__KType__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1236:2: rule__KType__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__0_in_rule__KType__Group__1__Impl2493);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1250:1: rule__KType__Group_1__0 : rule__KType__Group_1__0__Impl rule__KType__Group_1__1 ;
    public final void rule__KType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1254:1: ( rule__KType__Group_1__0__Impl rule__KType__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1255:2: rule__KType__Group_1__0__Impl rule__KType__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__0__Impl_in_rule__KType__Group_1__02528);
            rule__KType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__1_in_rule__KType__Group_1__02531);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1262:1: rule__KType__Group_1__0__Impl : ( '{' ) ;
    public final void rule__KType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1266:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1267:1: ( '{' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1267:1: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1268:1: '{'
            {
             before(grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KType__Group_1__0__Impl2559); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1281:1: rule__KType__Group_1__1 : rule__KType__Group_1__1__Impl rule__KType__Group_1__2 ;
    public final void rule__KType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1285:1: ( rule__KType__Group_1__1__Impl rule__KType__Group_1__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1286:2: rule__KType__Group_1__1__Impl rule__KType__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__1__Impl_in_rule__KType__Group_1__12590);
            rule__KType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__2_in_rule__KType__Group_1__12593);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1293:1: rule__KType__Group_1__1__Impl : ( ( rule__KType__Alternatives_1_1 )* ) ;
    public final void rule__KType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1297:1: ( ( ( rule__KType__Alternatives_1_1 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1298:1: ( ( rule__KType__Alternatives_1_1 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1298:1: ( ( rule__KType__Alternatives_1_1 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1299:1: ( rule__KType__Alternatives_1_1 )*
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1300:1: ( rule__KType__Alternatives_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1300:2: rule__KType__Alternatives_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KType__Alternatives_1_1_in_rule__KType__Group_1__1__Impl2620);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1310:1: rule__KType__Group_1__2 : rule__KType__Group_1__2__Impl ;
    public final void rule__KType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1314:1: ( rule__KType__Group_1__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1315:2: rule__KType__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KType__Group_1__2__Impl_in_rule__KType__Group_1__22651);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1321:1: rule__KType__Group_1__2__Impl : ( '}' ) ;
    public final void rule__KType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1325:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1326:1: ( '}' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1326:1: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1327:1: '}'
            {
             before(grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__KType__Group_1__2__Impl2679); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1346:1: rule__KClass__Group__0 : rule__KClass__Group__0__Impl rule__KClass__Group__1 ;
    public final void rule__KClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1350:1: ( rule__KClass__Group__0__Impl rule__KClass__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1351:2: rule__KClass__Group__0__Impl rule__KClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02716);
            rule__KClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02719);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1358:1: rule__KClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__KClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1362:1: ( ( 'class' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1363:1: ( 'class' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1363:1: ( 'class' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1364:1: 'class'
            {
             before(grammarAccess.getKClassAccess().getClassKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__KClass__Group__0__Impl2747); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1377:1: rule__KClass__Group__1 : rule__KClass__Group__1__Impl ;
    public final void rule__KClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1381:1: ( rule__KClass__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1382:2: rule__KClass__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12778);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1388:1: rule__KClass__Group__1__Impl : ( ( rule__KClass__NameAssignment_1 ) ) ;
    public final void rule__KClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1392:1: ( ( ( rule__KClass__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1393:1: ( ( rule__KClass__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1393:1: ( ( rule__KClass__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1394:1: ( rule__KClass__NameAssignment_1 )
            {
             before(grammarAccess.getKClassAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1395:1: ( rule__KClass__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1395:2: rule__KClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl2805);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1409:1: rule__KInterface__Group__0 : rule__KInterface__Group__0__Impl rule__KInterface__Group__1 ;
    public final void rule__KInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1413:1: ( rule__KInterface__Group__0__Impl rule__KInterface__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1414:2: rule__KInterface__Group__0__Impl rule__KInterface__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__02839);
            rule__KInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__02842);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1421:1: rule__KInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__KInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1425:1: ( ( 'interface' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1426:1: ( 'interface' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1426:1: ( 'interface' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1427:1: 'interface'
            {
             before(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__KInterface__Group__0__Impl2870); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1440:1: rule__KInterface__Group__1 : rule__KInterface__Group__1__Impl ;
    public final void rule__KInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1444:1: ( rule__KInterface__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1445:2: rule__KInterface__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__12901);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1451:1: rule__KInterface__Group__1__Impl : ( ( rule__KInterface__NameAssignment_1 ) ) ;
    public final void rule__KInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1455:1: ( ( ( rule__KInterface__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1456:1: ( ( rule__KInterface__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1456:1: ( ( rule__KInterface__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1457:1: ( rule__KInterface__NameAssignment_1 )
            {
             before(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1458:1: ( rule__KInterface__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1458:2: rule__KInterface__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl2928);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1472:1: rule__KEnum__Group__0 : rule__KEnum__Group__0__Impl rule__KEnum__Group__1 ;
    public final void rule__KEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1476:1: ( rule__KEnum__Group__0__Impl rule__KEnum__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1477:2: rule__KEnum__Group__0__Impl rule__KEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__02962);
            rule__KEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__02965);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1484:1: rule__KEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__KEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1488:1: ( ( 'enum' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1489:1: ( 'enum' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1489:1: ( 'enum' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1490:1: 'enum'
            {
             before(grammarAccess.getKEnumAccess().getEnumKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__KEnum__Group__0__Impl2993); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1503:1: rule__KEnum__Group__1 : rule__KEnum__Group__1__Impl ;
    public final void rule__KEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1507:1: ( rule__KEnum__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1508:2: rule__KEnum__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13024);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1514:1: rule__KEnum__Group__1__Impl : ( ( rule__KEnum__NameAssignment_1 ) ) ;
    public final void rule__KEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1518:1: ( ( ( rule__KEnum__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1519:1: ( ( rule__KEnum__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1519:1: ( ( rule__KEnum__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1520:1: ( rule__KEnum__NameAssignment_1 )
            {
             before(grammarAccess.getKEnumAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1521:1: ( rule__KEnum__NameAssignment_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1521:2: rule__KEnum__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3051);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1535:1: rule__KDependency__Group__0 : rule__KDependency__Group__0__Impl rule__KDependency__Group__1 ;
    public final void rule__KDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1539:1: ( rule__KDependency__Group__0__Impl rule__KDependency__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1540:2: rule__KDependency__Group__0__Impl rule__KDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__0__Impl_in_rule__KDependency__Group__03085);
            rule__KDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__1_in_rule__KDependency__Group__03088);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1547:1: rule__KDependency__Group__0__Impl : ( 'depend' ) ;
    public final void rule__KDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1551:1: ( ( 'depend' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1552:1: ( 'depend' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1552:1: ( 'depend' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1553:1: 'depend'
            {
             before(grammarAccess.getKDependencyAccess().getDependKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__KDependency__Group__0__Impl3116); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1566:1: rule__KDependency__Group__1 : rule__KDependency__Group__1__Impl rule__KDependency__Group__2 ;
    public final void rule__KDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1570:1: ( rule__KDependency__Group__1__Impl rule__KDependency__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1571:2: rule__KDependency__Group__1__Impl rule__KDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__1__Impl_in_rule__KDependency__Group__13147);
            rule__KDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__2_in_rule__KDependency__Group__13150);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1578:1: rule__KDependency__Group__1__Impl : ( ( rule__KDependency__LabelAssignment_1 )? ) ;
    public final void rule__KDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1582:1: ( ( ( rule__KDependency__LabelAssignment_1 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1583:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1583:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1584:1: ( rule__KDependency__LabelAssignment_1 )?
            {
             before(grammarAccess.getKDependencyAccess().getLabelAssignment_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1585:1: ( rule__KDependency__LabelAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1585:2: rule__KDependency__LabelAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KDependency__LabelAssignment_1_in_rule__KDependency__Group__1__Impl3177);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1595:1: rule__KDependency__Group__2 : rule__KDependency__Group__2__Impl ;
    public final void rule__KDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1599:1: ( rule__KDependency__Group__2__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1600:2: rule__KDependency__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__Group__2__Impl_in_rule__KDependency__Group__23208);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1606:1: rule__KDependency__Group__2__Impl : ( ( rule__KDependency__TargetAssignment_2 ) ) ;
    public final void rule__KDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1610:1: ( ( ( rule__KDependency__TargetAssignment_2 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1611:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1611:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1612:1: ( rule__KDependency__TargetAssignment_2 )
            {
             before(grammarAccess.getKDependencyAccess().getTargetAssignment_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1613:1: ( rule__KDependency__TargetAssignment_2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1613:2: rule__KDependency__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KDependency__TargetAssignment_2_in_rule__KDependency__Group__2__Impl3235);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1629:1: rule__KMethod__Group__0 : rule__KMethod__Group__0__Impl rule__KMethod__Group__1 ;
    public final void rule__KMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1633:1: ( rule__KMethod__Group__0__Impl rule__KMethod__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1634:2: rule__KMethod__Group__0__Impl rule__KMethod__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03271);
            rule__KMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03274);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1641:1: rule__KMethod__Group__0__Impl : ( ( rule__KMethod__NameAssignment_0 ) ) ;
    public final void rule__KMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1645:1: ( ( ( rule__KMethod__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1646:1: ( ( rule__KMethod__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1646:1: ( ( rule__KMethod__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1647:1: ( rule__KMethod__NameAssignment_0 )
            {
             before(grammarAccess.getKMethodAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1648:1: ( rule__KMethod__NameAssignment_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1648:2: rule__KMethod__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3301);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1658:1: rule__KMethod__Group__1 : rule__KMethod__Group__1__Impl rule__KMethod__Group__2 ;
    public final void rule__KMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1662:1: ( rule__KMethod__Group__1__Impl rule__KMethod__Group__2 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1663:2: rule__KMethod__Group__1__Impl rule__KMethod__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13331);
            rule__KMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13334);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1670:1: rule__KMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__KMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1674:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1675:1: ( '(' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1675:1: ( '(' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1676:1: '('
            {
             before(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__KMethod__Group__1__Impl3362); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1689:1: rule__KMethod__Group__2 : rule__KMethod__Group__2__Impl rule__KMethod__Group__3 ;
    public final void rule__KMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1693:1: ( rule__KMethod__Group__2__Impl rule__KMethod__Group__3 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1694:2: rule__KMethod__Group__2__Impl rule__KMethod__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23393);
            rule__KMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23396);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1701:1: rule__KMethod__Group__2__Impl : ( ( rule__KMethod__Group_2__0 )? ) ;
    public final void rule__KMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1705:1: ( ( ( rule__KMethod__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1706:1: ( ( rule__KMethod__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1706:1: ( ( rule__KMethod__Group_2__0 )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1707:1: ( rule__KMethod__Group_2__0 )?
            {
             before(grammarAccess.getKMethodAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1708:1: ( rule__KMethod__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1708:2: rule__KMethod__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3423);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1718:1: rule__KMethod__Group__3 : rule__KMethod__Group__3__Impl ;
    public final void rule__KMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1722:1: ( rule__KMethod__Group__3__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1723:2: rule__KMethod__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33454);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1729:1: rule__KMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__KMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1733:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1734:1: ( ')' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1734:1: ( ')' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1735:1: ')'
            {
             before(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__KMethod__Group__3__Impl3482); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1756:1: rule__KMethod__Group_2__0 : rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 ;
    public final void rule__KMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1760:1: ( rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1761:2: rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03521);
            rule__KMethod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03524);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1768:1: rule__KMethod__Group_2__0__Impl : ( ( rule__KMethod__ParametersAssignment_2_0 ) ) ;
    public final void rule__KMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1772:1: ( ( ( rule__KMethod__ParametersAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1773:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1773:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1774:1: ( rule__KMethod__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1775:1: ( rule__KMethod__ParametersAssignment_2_0 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1775:2: rule__KMethod__ParametersAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3551);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1785:1: rule__KMethod__Group_2__1 : rule__KMethod__Group_2__1__Impl ;
    public final void rule__KMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1789:1: ( rule__KMethod__Group_2__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1790:2: rule__KMethod__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13581);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1796:1: rule__KMethod__Group_2__1__Impl : ( ( rule__KMethod__Group_2_1__0 )* ) ;
    public final void rule__KMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1800:1: ( ( ( rule__KMethod__Group_2_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1801:1: ( ( rule__KMethod__Group_2_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1801:1: ( ( rule__KMethod__Group_2_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1802:1: ( rule__KMethod__Group_2_1__0 )*
            {
             before(grammarAccess.getKMethodAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1803:1: ( rule__KMethod__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1803:2: rule__KMethod__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3608);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1817:1: rule__KMethod__Group_2_1__0 : rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 ;
    public final void rule__KMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1821:1: ( rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1822:2: rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03643);
            rule__KMethod__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03646);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1829:1: rule__KMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1833:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1834:1: ( ',' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1834:1: ( ',' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1835:1: ','
            {
             before(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__KMethod__Group_2_1__0__Impl3674); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1848:1: rule__KMethod__Group_2_1__1 : rule__KMethod__Group_2_1__1__Impl ;
    public final void rule__KMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1852:1: ( rule__KMethod__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1853:2: rule__KMethod__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13705);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1859:1: rule__KMethod__Group_2_1__1__Impl : ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__KMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1863:1: ( ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1864:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1864:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1865:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1866:1: ( rule__KMethod__ParametersAssignment_2_1_1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1866:2: rule__KMethod__ParametersAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl3732);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1880:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1884:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1885:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03766);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03769);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1892:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1896:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1897:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1897:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1898:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3796); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1909:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1913:1: ( rule__QualifiedID__Group__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1914:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13825);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1920:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1924:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1925:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1925:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1926:1: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1927:1: ( rule__QualifiedID__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1927:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl3852);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1941:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1945:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1946:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__03887);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__03890);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1953:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1957:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1958:1: ( '.' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1958:1: ( '.' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1959:1: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__QualifiedID__Group_1__0__Impl3918); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1972:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1976:1: ( rule__QualifiedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1977:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__13949);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1983:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1987:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1988:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1988:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1989:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl3976); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2005:1: rule__KClassModel__JavaProjectsAssignment_1_1_0_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__JavaProjectsAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2009:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2010:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2010:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2011:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsQualifiedIDParserRuleCall_1_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14014);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2020:1: rule__KClassModel__BundlesAssignment_1_1_1_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__BundlesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2024:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2025:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2025:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2026:1: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14045);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2035:1: rule__KClassModel__OptionsAssignment_2 : ( ruleKOption ) ;
    public final void rule__KClassModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2039:1: ( ( ruleKOption ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2040:1: ( ruleKOption )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2040:1: ( ruleKOption )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2041:1: ruleKOption
            {
             before(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24076);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2050:1: rule__KClassModel__PackagesAssignment_3 : ( ruleKPackage ) ;
    public final void rule__KClassModel__PackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2054:1: ( ( ruleKPackage ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2055:1: ( ruleKPackage )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2055:1: ( ruleKPackage )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2056:1: ruleKPackage
            {
             before(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34107);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2065:1: rule__KOption__KeyAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KOption__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2069:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2070:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2070:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2071:1: ruleQualifiedID
            {
             before(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14138);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2080:1: rule__KOption__ValueAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__KOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2084:1: ( ( rulePropertyValue ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2085:1: ( rulePropertyValue )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2085:1: ( rulePropertyValue )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2086:1: rulePropertyValue
            {
             before(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34169);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2095:1: rule__KPackage__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2099:1: ( ( ruleQualifiedID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2100:1: ( ruleQualifiedID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2100:1: ( ruleQualifiedID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2101:1: ruleQualifiedID
            {
             before(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14200);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2110:1: rule__KPackage__TypesAssignment_3 : ( ruleKType ) ;
    public final void rule__KPackage__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2114:1: ( ( ruleKType ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2115:1: ( ruleKType )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2115:1: ( ruleKType )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2116:1: ruleKType
            {
             before(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34231);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2125:1: rule__KType__FieldsAssignment_1_1_0 : ( ruleKField ) ;
    public final void rule__KType__FieldsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2129:1: ( ( ruleKField ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2130:1: ( ruleKField )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2130:1: ( ruleKField )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2131:1: ruleKField
            {
             before(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKField_in_rule__KType__FieldsAssignment_1_1_04262);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2140:1: rule__KType__MethodsAssignment_1_1_1 : ( ruleKMethod ) ;
    public final void rule__KType__MethodsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2144:1: ( ( ruleKMethod ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2145:1: ( ruleKMethod )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2145:1: ( ruleKMethod )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2146:1: ruleKMethod
            {
             before(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKMethod_in_rule__KType__MethodsAssignment_1_1_14293);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2155:1: rule__KType__DependenciesAssignment_1_1_2 : ( ruleKDependency ) ;
    public final void rule__KType__DependenciesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2159:1: ( ( ruleKDependency ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2160:1: ( ruleKDependency )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2160:1: ( ruleKDependency )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2161:1: ruleKDependency
            {
             before(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKDependency_in_rule__KType__DependenciesAssignment_1_1_24324);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2170:1: rule__KClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2174:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2175:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2175:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2176:1: RULE_ID
            {
             before(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KClass__NameAssignment_14355); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2185:1: rule__KInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2189:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2190:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2190:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2191:1: RULE_ID
            {
             before(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KInterface__NameAssignment_14386); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2200:1: rule__KEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2204:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2205:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2205:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2206:1: RULE_ID
            {
             before(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KEnum__NameAssignment_14417); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2215:1: rule__KDependency__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__KDependency__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2219:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2220:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2220:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2221:1: RULE_STRING
            {
             before(grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__KDependency__LabelAssignment_14448); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2230:1: rule__KDependency__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__KDependency__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2234:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2235:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2235:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2236:1: ( RULE_ID )
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0()); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2237:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2238:1: RULE_ID
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KDependency__TargetAssignment_24483); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2249:1: rule__KField__NameAssignment : ( RULE_ID ) ;
    public final void rule__KField__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2253:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2254:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2254:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2255:1: RULE_ID
            {
             before(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KField__NameAssignment4518); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2264:1: rule__KMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__KMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2268:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2269:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2269:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2270:1: RULE_ID
            {
             before(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_04549); 
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2279:1: rule__KMethod__ParametersAssignment_2_0 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2283:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2284:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2284:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2285:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_04580);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2294:1: rule__KMethod__ParametersAssignment_2_1_1 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2298:1: ( ( ruleKTypeReference ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2299:1: ( ruleKTypeReference )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2299:1: ( ruleKTypeReference )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2300:1: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_14611);
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
    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2309:1: rule__KTypeReference__SignatureAssignment : ( RULE_ID ) ;
    public final void rule__KTypeReference__SignatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2313:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2314:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2314:1: ( RULE_ID )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:2315:1: RULE_ID
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment4642); 
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
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__PropertyValue__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValue__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_rule__PropertyValue__Alternatives1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__PropertyValue__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TFLOAT_in_rule__Float__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Float__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__0__Impl_in_rule__KClassModel__Group__01226 = new BitSet(new long[]{0x0000000000011100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1_in_rule__KClassModel__Group__01229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__1__Impl_in_rule__KClassModel__Group__11287 = new BitSet(new long[]{0x0000000000011100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2_in_rule__KClassModel__Group__11290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0_in_rule__KClassModel__Group__1__Impl1317 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__2__Impl_in_rule__KClassModel__Group__21348 = new BitSet(new long[]{0x0000000000011100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3_in_rule__KClassModel__Group__21351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__OptionsAssignment_2_in_rule__KClassModel__Group__2__Impl1378 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_rule__KClassModel__Group__3__Impl_in_rule__KClassModel__Group__31409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__PackagesAssignment_3_in_rule__KClassModel__Group__3__Impl1436 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__0__Impl_in_rule__KClassModel__Group_1__01475 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1_in_rule__KClassModel__Group_1__01478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KClassModel__Group_1__0__Impl1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1__1__Impl_in_rule__KClassModel__Group_1__11537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Alternatives_1_1_in_rule__KClassModel__Group_1__1__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__0__Impl_in_rule__KClassModel__Group_1_1_0__01598 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1_in_rule__KClassModel__Group_1_1_0__01601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__KClassModel__Group_1_1_0__0__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_0__1__Impl_in_rule__KClassModel__Group_1_1_0__11660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__JavaProjectsAssignment_1_1_0_1_in_rule__KClassModel__Group_1_1_0__1__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__0__Impl_in_rule__KClassModel__Group_1_1_1__01721 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1_in_rule__KClassModel__Group_1_1_1__01724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KClassModel__Group_1_1_1__0__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__Group_1_1_1__1__Impl_in_rule__KClassModel__Group_1_1_1__11783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClassModel__BundlesAssignment_1_1_1_1_in_rule__KClassModel__Group_1_1_1__1__Impl1810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__0__Impl_in_rule__KOption__Group__01844 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KOption__Group__1_in_rule__KOption__Group__01847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__1__Impl_in_rule__KOption__Group__11905 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KOption__Group__2_in_rule__KOption__Group__11908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__KeyAssignment_1_in_rule__KOption__Group__1__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__2__Impl_in_rule__KOption__Group__21965 = new BitSet(new long[]{0x00000000000001F0L});
        public static final BitSet FOLLOW_rule__KOption__Group__3_in_rule__KOption__Group__21968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KOption__Group__2__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__Group__3__Impl_in_rule__KOption__Group__32027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KOption__ValueAssignment_3_in_rule__KOption__Group__3__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__0__Impl_in_rule__KPackage__Group__02092 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1_in_rule__KPackage__Group__02095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KPackage__Group__0__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__1__Impl_in_rule__KPackage__Group__12154 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2_in_rule__KPackage__Group__12157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__NameAssignment_1_in_rule__KPackage__Group__1__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__2__Impl_in_rule__KPackage__Group__22214 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3_in_rule__KPackage__Group__22217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KPackage__Group__2__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__3__Impl_in_rule__KPackage__Group__32276 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4_in_rule__KPackage__Group__32279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KPackage__TypesAssignment_3_in_rule__KPackage__Group__3__Impl2306 = new BitSet(new long[]{0x0000000000380002L});
        public static final BitSet FOLLOW_rule__KPackage__Group__4__Impl_in_rule__KPackage__Group__42337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KPackage__Group__4__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group__0__Impl_in_rule__KType__Group__02406 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KType__Group__1_in_rule__KType__Group__02409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Alternatives_0_in_rule__KType__Group__0__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group__1__Impl_in_rule__KType__Group__12466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__0_in_rule__KType__Group__1__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__0__Impl_in_rule__KType__Group_1__02528 = new BitSet(new long[]{0x0000000000440100L});
        public static final BitSet FOLLOW_rule__KType__Group_1__1_in_rule__KType__Group_1__02531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KType__Group_1__0__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Group_1__1__Impl_in_rule__KType__Group_1__12590 = new BitSet(new long[]{0x0000000000440100L});
        public static final BitSet FOLLOW_rule__KType__Group_1__2_in_rule__KType__Group_1__12593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KType__Alternatives_1_1_in_rule__KType__Group_1__1__Impl2620 = new BitSet(new long[]{0x0000000000400102L});
        public static final BitSet FOLLOW_rule__KType__Group_1__2__Impl_in_rule__KType__Group_1__22651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__KType__Group_1__2__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__0__Impl_in_rule__KClass__Group__02716 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KClass__Group__1_in_rule__KClass__Group__02719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__KClass__Group__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__Group__1__Impl_in_rule__KClass__Group__12778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KClass__NameAssignment_1_in_rule__KClass__Group__1__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__0__Impl_in_rule__KInterface__Group__02839 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1_in_rule__KInterface__Group__02842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__KInterface__Group__0__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__Group__1__Impl_in_rule__KInterface__Group__12901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KInterface__NameAssignment_1_in_rule__KInterface__Group__1__Impl2928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__0__Impl_in_rule__KEnum__Group__02962 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1_in_rule__KEnum__Group__02965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__KEnum__Group__0__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__Group__1__Impl_in_rule__KEnum__Group__13024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KEnum__NameAssignment_1_in_rule__KEnum__Group__1__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__0__Impl_in_rule__KDependency__Group__03085 = new BitSet(new long[]{0x0000000000000120L});
        public static final BitSet FOLLOW_rule__KDependency__Group__1_in_rule__KDependency__Group__03088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__KDependency__Group__0__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__1__Impl_in_rule__KDependency__Group__13147 = new BitSet(new long[]{0x0000000000000120L});
        public static final BitSet FOLLOW_rule__KDependency__Group__2_in_rule__KDependency__Group__13150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__LabelAssignment_1_in_rule__KDependency__Group__1__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__Group__2__Impl_in_rule__KDependency__Group__23208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KDependency__TargetAssignment_2_in_rule__KDependency__Group__2__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__0__Impl_in_rule__KMethod__Group__03271 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1_in_rule__KMethod__Group__03274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__NameAssignment_0_in_rule__KMethod__Group__0__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__1__Impl_in_rule__KMethod__Group__13331 = new BitSet(new long[]{0x0000000001000100L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2_in_rule__KMethod__Group__13334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__KMethod__Group__1__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__2__Impl_in_rule__KMethod__Group__23393 = new BitSet(new long[]{0x0000000001000100L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3_in_rule__KMethod__Group__23396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0_in_rule__KMethod__Group__2__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group__3__Impl_in_rule__KMethod__Group__33454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__KMethod__Group__3__Impl3482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__0__Impl_in_rule__KMethod__Group_2__03521 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1_in_rule__KMethod__Group_2__03524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_0_in_rule__KMethod__Group_2__0__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2__1__Impl_in_rule__KMethod__Group_2__13581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0_in_rule__KMethod__Group_2__1__Impl3608 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__0__Impl_in_rule__KMethod__Group_2_1__03643 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1_in_rule__KMethod__Group_2_1__03646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__KMethod__Group_2_1__0__Impl3674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__Group_2_1__1__Impl_in_rule__KMethod__Group_2_1__13705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KMethod__ParametersAssignment_2_1_1_in_rule__KMethod__Group_2_1__1__Impl3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__0__Impl_in_rule__QualifiedID__Group__03766 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1_in_rule__QualifiedID__Group__03769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group__0__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group__1__Impl_in_rule__QualifiedID__Group__13825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0_in_rule__QualifiedID__Group__1__Impl3852 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__0__Impl_in_rule__QualifiedID__Group_1__03887 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1_in_rule__QualifiedID__Group_1__03890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__QualifiedID__Group_1__0__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedID__Group_1__1__Impl_in_rule__QualifiedID__Group_1__13949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedID__Group_1__1__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__JavaProjectsAssignment_1_1_0_14014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KClassModel__BundlesAssignment_1_1_1_14045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKOption_in_rule__KClassModel__OptionsAssignment_24076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKPackage_in_rule__KClassModel__PackagesAssignment_34107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KOption__KeyAssignment_14138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_rule__KOption__ValueAssignment_34169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedID_in_rule__KPackage__NameAssignment_14200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKType_in_rule__KPackage__TypesAssignment_34231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKField_in_rule__KType__FieldsAssignment_1_1_04262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKMethod_in_rule__KType__MethodsAssignment_1_1_14293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKDependency_in_rule__KType__DependenciesAssignment_1_1_24324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KClass__NameAssignment_14355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KInterface__NameAssignment_14386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KEnum__NameAssignment_14417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__KDependency__LabelAssignment_14448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KDependency__TargetAssignment_24483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KField__NameAssignment4518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KMethod__NameAssignment_04549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_04580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKTypeReference_in_rule__KMethod__ParametersAssignment_2_1_14611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KTypeReference__SignatureAssignment4642 = new BitSet(new long[]{0x0000000000000002L});
    }


}