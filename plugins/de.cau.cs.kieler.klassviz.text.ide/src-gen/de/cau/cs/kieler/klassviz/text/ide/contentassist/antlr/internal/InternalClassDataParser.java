package de.cau.cs.kieler.klassviz.text.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassDataParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_STRING", "RULE_TFLOAT", "RULE_NATURAL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'project'", "'bundle'", "'='", "'package'", "'{'", "'}'", "'class'", "'interface'", "'enum'", "'depend'", "'('", "')'", "','", "'.'"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_TFLOAT=6;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_NATURAL=7;
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
    // InternalClassData.g:64:1: entryRuleKClassModel : ruleKClassModel EOF ;
    public final void entryRuleKClassModel() throws RecognitionException {
        try {
            // InternalClassData.g:65:1: ( ruleKClassModel EOF )
            // InternalClassData.g:66:1: ruleKClassModel EOF
            {
             before(grammarAccess.getKClassModelRule()); 
            pushFollow(FOLLOW_1);
            ruleKClassModel();

            state._fsp--;

             after(grammarAccess.getKClassModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:73:1: ruleKClassModel : ( ( rule__KClassModel__Group__0 ) ) ;
    public final void ruleKClassModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:77:2: ( ( ( rule__KClassModel__Group__0 ) ) )
            // InternalClassData.g:78:2: ( ( rule__KClassModel__Group__0 ) )
            {
            // InternalClassData.g:78:2: ( ( rule__KClassModel__Group__0 ) )
            // InternalClassData.g:79:3: ( rule__KClassModel__Group__0 )
            {
             before(grammarAccess.getKClassModelAccess().getGroup()); 
            // InternalClassData.g:80:3: ( rule__KClassModel__Group__0 )
            // InternalClassData.g:80:4: rule__KClassModel__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:89:1: entryRuleKOption : ruleKOption EOF ;
    public final void entryRuleKOption() throws RecognitionException {
        try {
            // InternalClassData.g:90:1: ( ruleKOption EOF )
            // InternalClassData.g:91:1: ruleKOption EOF
            {
             before(grammarAccess.getKOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleKOption();

            state._fsp--;

             after(grammarAccess.getKOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:98:1: ruleKOption : ( ( rule__KOption__Group__0 ) ) ;
    public final void ruleKOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:102:2: ( ( ( rule__KOption__Group__0 ) ) )
            // InternalClassData.g:103:2: ( ( rule__KOption__Group__0 ) )
            {
            // InternalClassData.g:103:2: ( ( rule__KOption__Group__0 ) )
            // InternalClassData.g:104:3: ( rule__KOption__Group__0 )
            {
             before(grammarAccess.getKOptionAccess().getGroup()); 
            // InternalClassData.g:105:3: ( rule__KOption__Group__0 )
            // InternalClassData.g:105:4: rule__KOption__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:114:1: entryRuleKPackage : ruleKPackage EOF ;
    public final void entryRuleKPackage() throws RecognitionException {
        try {
            // InternalClassData.g:115:1: ( ruleKPackage EOF )
            // InternalClassData.g:116:1: ruleKPackage EOF
            {
             before(grammarAccess.getKPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleKPackage();

            state._fsp--;

             after(grammarAccess.getKPackageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:123:1: ruleKPackage : ( ( rule__KPackage__Group__0 ) ) ;
    public final void ruleKPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:127:2: ( ( ( rule__KPackage__Group__0 ) ) )
            // InternalClassData.g:128:2: ( ( rule__KPackage__Group__0 ) )
            {
            // InternalClassData.g:128:2: ( ( rule__KPackage__Group__0 ) )
            // InternalClassData.g:129:3: ( rule__KPackage__Group__0 )
            {
             before(grammarAccess.getKPackageAccess().getGroup()); 
            // InternalClassData.g:130:3: ( rule__KPackage__Group__0 )
            // InternalClassData.g:130:4: rule__KPackage__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:139:1: entryRuleKType : ruleKType EOF ;
    public final void entryRuleKType() throws RecognitionException {
        try {
            // InternalClassData.g:140:1: ( ruleKType EOF )
            // InternalClassData.g:141:1: ruleKType EOF
            {
             before(grammarAccess.getKTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleKType();

            state._fsp--;

             after(grammarAccess.getKTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:148:1: ruleKType : ( ( rule__KType__Group__0 ) ) ;
    public final void ruleKType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:152:2: ( ( ( rule__KType__Group__0 ) ) )
            // InternalClassData.g:153:2: ( ( rule__KType__Group__0 ) )
            {
            // InternalClassData.g:153:2: ( ( rule__KType__Group__0 ) )
            // InternalClassData.g:154:3: ( rule__KType__Group__0 )
            {
             before(grammarAccess.getKTypeAccess().getGroup()); 
            // InternalClassData.g:155:3: ( rule__KType__Group__0 )
            // InternalClassData.g:155:4: rule__KType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:164:1: entryRuleKClass : ruleKClass EOF ;
    public final void entryRuleKClass() throws RecognitionException {
        try {
            // InternalClassData.g:165:1: ( ruleKClass EOF )
            // InternalClassData.g:166:1: ruleKClass EOF
            {
             before(grammarAccess.getKClassRule()); 
            pushFollow(FOLLOW_1);
            ruleKClass();

            state._fsp--;

             after(grammarAccess.getKClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:173:1: ruleKClass : ( ( rule__KClass__Group__0 ) ) ;
    public final void ruleKClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:177:2: ( ( ( rule__KClass__Group__0 ) ) )
            // InternalClassData.g:178:2: ( ( rule__KClass__Group__0 ) )
            {
            // InternalClassData.g:178:2: ( ( rule__KClass__Group__0 ) )
            // InternalClassData.g:179:3: ( rule__KClass__Group__0 )
            {
             before(grammarAccess.getKClassAccess().getGroup()); 
            // InternalClassData.g:180:3: ( rule__KClass__Group__0 )
            // InternalClassData.g:180:4: rule__KClass__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:189:1: entryRuleKInterface : ruleKInterface EOF ;
    public final void entryRuleKInterface() throws RecognitionException {
        try {
            // InternalClassData.g:190:1: ( ruleKInterface EOF )
            // InternalClassData.g:191:1: ruleKInterface EOF
            {
             before(grammarAccess.getKInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleKInterface();

            state._fsp--;

             after(grammarAccess.getKInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:198:1: ruleKInterface : ( ( rule__KInterface__Group__0 ) ) ;
    public final void ruleKInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:202:2: ( ( ( rule__KInterface__Group__0 ) ) )
            // InternalClassData.g:203:2: ( ( rule__KInterface__Group__0 ) )
            {
            // InternalClassData.g:203:2: ( ( rule__KInterface__Group__0 ) )
            // InternalClassData.g:204:3: ( rule__KInterface__Group__0 )
            {
             before(grammarAccess.getKInterfaceAccess().getGroup()); 
            // InternalClassData.g:205:3: ( rule__KInterface__Group__0 )
            // InternalClassData.g:205:4: rule__KInterface__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:214:1: entryRuleKEnum : ruleKEnum EOF ;
    public final void entryRuleKEnum() throws RecognitionException {
        try {
            // InternalClassData.g:215:1: ( ruleKEnum EOF )
            // InternalClassData.g:216:1: ruleKEnum EOF
            {
             before(grammarAccess.getKEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleKEnum();

            state._fsp--;

             after(grammarAccess.getKEnumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:223:1: ruleKEnum : ( ( rule__KEnum__Group__0 ) ) ;
    public final void ruleKEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:227:2: ( ( ( rule__KEnum__Group__0 ) ) )
            // InternalClassData.g:228:2: ( ( rule__KEnum__Group__0 ) )
            {
            // InternalClassData.g:228:2: ( ( rule__KEnum__Group__0 ) )
            // InternalClassData.g:229:3: ( rule__KEnum__Group__0 )
            {
             before(grammarAccess.getKEnumAccess().getGroup()); 
            // InternalClassData.g:230:3: ( rule__KEnum__Group__0 )
            // InternalClassData.g:230:4: rule__KEnum__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:239:1: entryRuleKDependency : ruleKDependency EOF ;
    public final void entryRuleKDependency() throws RecognitionException {
        try {
            // InternalClassData.g:240:1: ( ruleKDependency EOF )
            // InternalClassData.g:241:1: ruleKDependency EOF
            {
             before(grammarAccess.getKDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleKDependency();

            state._fsp--;

             after(grammarAccess.getKDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:248:1: ruleKDependency : ( ( rule__KDependency__Group__0 ) ) ;
    public final void ruleKDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:252:2: ( ( ( rule__KDependency__Group__0 ) ) )
            // InternalClassData.g:253:2: ( ( rule__KDependency__Group__0 ) )
            {
            // InternalClassData.g:253:2: ( ( rule__KDependency__Group__0 ) )
            // InternalClassData.g:254:3: ( rule__KDependency__Group__0 )
            {
             before(grammarAccess.getKDependencyAccess().getGroup()); 
            // InternalClassData.g:255:3: ( rule__KDependency__Group__0 )
            // InternalClassData.g:255:4: rule__KDependency__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:264:1: entryRuleKField : ruleKField EOF ;
    public final void entryRuleKField() throws RecognitionException {
        try {
            // InternalClassData.g:265:1: ( ruleKField EOF )
            // InternalClassData.g:266:1: ruleKField EOF
            {
             before(grammarAccess.getKFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleKField();

            state._fsp--;

             after(grammarAccess.getKFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:273:1: ruleKField : ( ( rule__KField__NameAssignment ) ) ;
    public final void ruleKField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:277:2: ( ( ( rule__KField__NameAssignment ) ) )
            // InternalClassData.g:278:2: ( ( rule__KField__NameAssignment ) )
            {
            // InternalClassData.g:278:2: ( ( rule__KField__NameAssignment ) )
            // InternalClassData.g:279:3: ( rule__KField__NameAssignment )
            {
             before(grammarAccess.getKFieldAccess().getNameAssignment()); 
            // InternalClassData.g:280:3: ( rule__KField__NameAssignment )
            // InternalClassData.g:280:4: rule__KField__NameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:289:1: entryRuleKMethod : ruleKMethod EOF ;
    public final void entryRuleKMethod() throws RecognitionException {
        try {
            // InternalClassData.g:290:1: ( ruleKMethod EOF )
            // InternalClassData.g:291:1: ruleKMethod EOF
            {
             before(grammarAccess.getKMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleKMethod();

            state._fsp--;

             after(grammarAccess.getKMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:298:1: ruleKMethod : ( ( rule__KMethod__Group__0 ) ) ;
    public final void ruleKMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:302:2: ( ( ( rule__KMethod__Group__0 ) ) )
            // InternalClassData.g:303:2: ( ( rule__KMethod__Group__0 ) )
            {
            // InternalClassData.g:303:2: ( ( rule__KMethod__Group__0 ) )
            // InternalClassData.g:304:3: ( rule__KMethod__Group__0 )
            {
             before(grammarAccess.getKMethodAccess().getGroup()); 
            // InternalClassData.g:305:3: ( rule__KMethod__Group__0 )
            // InternalClassData.g:305:4: rule__KMethod__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:314:1: entryRuleKTypeReference : ruleKTypeReference EOF ;
    public final void entryRuleKTypeReference() throws RecognitionException {
        try {
            // InternalClassData.g:315:1: ( ruleKTypeReference EOF )
            // InternalClassData.g:316:1: ruleKTypeReference EOF
            {
             before(grammarAccess.getKTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleKTypeReference();

            state._fsp--;

             after(grammarAccess.getKTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:323:1: ruleKTypeReference : ( ( rule__KTypeReference__SignatureAssignment ) ) ;
    public final void ruleKTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:327:2: ( ( ( rule__KTypeReference__SignatureAssignment ) ) )
            // InternalClassData.g:328:2: ( ( rule__KTypeReference__SignatureAssignment ) )
            {
            // InternalClassData.g:328:2: ( ( rule__KTypeReference__SignatureAssignment ) )
            // InternalClassData.g:329:3: ( rule__KTypeReference__SignatureAssignment )
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureAssignment()); 
            // InternalClassData.g:330:3: ( rule__KTypeReference__SignatureAssignment )
            // InternalClassData.g:330:4: rule__KTypeReference__SignatureAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:339:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // InternalClassData.g:340:1: ( ruleQualifiedID EOF )
            // InternalClassData.g:341:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:348:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:352:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // InternalClassData.g:353:2: ( ( rule__QualifiedID__Group__0 ) )
            {
            // InternalClassData.g:353:2: ( ( rule__QualifiedID__Group__0 ) )
            // InternalClassData.g:354:3: ( rule__QualifiedID__Group__0 )
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            // InternalClassData.g:355:3: ( rule__QualifiedID__Group__0 )
            // InternalClassData.g:355:4: rule__QualifiedID__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:364:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalClassData.g:365:1: ( rulePropertyValue EOF )
            // InternalClassData.g:366:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:373:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:377:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalClassData.g:378:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalClassData.g:378:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalClassData.g:379:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // InternalClassData.g:380:3: ( rule__PropertyValue__Alternatives )
            // InternalClassData.g:380:4: rule__PropertyValue__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:389:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalClassData.g:390:1: ( ruleFloat EOF )
            // InternalClassData.g:391:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalClassData.g:398:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:402:2: ( ( ( rule__Float__Alternatives ) ) )
            // InternalClassData.g:403:2: ( ( rule__Float__Alternatives ) )
            {
            // InternalClassData.g:403:2: ( ( rule__Float__Alternatives ) )
            // InternalClassData.g:404:3: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // InternalClassData.g:405:3: ( rule__Float__Alternatives )
            // InternalClassData.g:405:4: rule__Float__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:413:1: rule__KClassModel__Alternatives_1_1 : ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) );
    public final void rule__KClassModel__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:417:1: ( ( ( rule__KClassModel__Group_1_1_0__0 ) ) | ( ( rule__KClassModel__Group_1_1_1__0 ) ) )
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
                    // InternalClassData.g:418:2: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    {
                    // InternalClassData.g:418:2: ( ( rule__KClassModel__Group_1_1_0__0 ) )
                    // InternalClassData.g:419:3: ( rule__KClassModel__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 
                    // InternalClassData.g:420:3: ( rule__KClassModel__Group_1_1_0__0 )
                    // InternalClassData.g:420:4: rule__KClassModel__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KClassModel__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalClassData.g:424:2: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    {
                    // InternalClassData.g:424:2: ( ( rule__KClassModel__Group_1_1_1__0 ) )
                    // InternalClassData.g:425:3: ( rule__KClassModel__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); 
                    // InternalClassData.g:426:3: ( rule__KClassModel__Group_1_1_1__0 )
                    // InternalClassData.g:426:4: rule__KClassModel__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:434:1: rule__KType__Alternatives_0 : ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) );
    public final void rule__KType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:438:1: ( ( ruleKClass ) | ( ruleKInterface ) | ( ruleKEnum ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
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
                    // InternalClassData.g:439:2: ( ruleKClass )
                    {
                    // InternalClassData.g:439:2: ( ruleKClass )
                    // InternalClassData.g:440:3: ruleKClass
                    {
                     before(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKClass();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalClassData.g:445:2: ( ruleKInterface )
                    {
                    // InternalClassData.g:445:2: ( ruleKInterface )
                    // InternalClassData.g:446:3: ruleKInterface
                    {
                     before(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKInterface();

                    state._fsp--;

                     after(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalClassData.g:451:2: ( ruleKEnum )
                    {
                    // InternalClassData.g:451:2: ( ruleKEnum )
                    // InternalClassData.g:452:3: ruleKEnum
                    {
                     before(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:461:1: rule__KType__Alternatives_1_1 : ( ( ( rule__KType__FieldsAssignment_1_1_0 ) ) | ( ( rule__KType__MethodsAssignment_1_1_1 ) ) | ( ( rule__KType__DependenciesAssignment_1_1_2 ) ) );
    public final void rule__KType__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:465:1: ( ( ( rule__KType__FieldsAssignment_1_1_0 ) ) | ( ( rule__KType__MethodsAssignment_1_1_1 ) ) | ( ( rule__KType__DependenciesAssignment_1_1_2 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID||LA3_1==20||LA3_1==24) ) {
                    alt3=1;
                }
                else if ( (LA3_1==25) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==24) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalClassData.g:466:2: ( ( rule__KType__FieldsAssignment_1_1_0 ) )
                    {
                    // InternalClassData.g:466:2: ( ( rule__KType__FieldsAssignment_1_1_0 ) )
                    // InternalClassData.g:467:3: ( rule__KType__FieldsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); 
                    // InternalClassData.g:468:3: ( rule__KType__FieldsAssignment_1_1_0 )
                    // InternalClassData.g:468:4: rule__KType__FieldsAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KType__FieldsAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalClassData.g:472:2: ( ( rule__KType__MethodsAssignment_1_1_1 ) )
                    {
                    // InternalClassData.g:472:2: ( ( rule__KType__MethodsAssignment_1_1_1 ) )
                    // InternalClassData.g:473:3: ( rule__KType__MethodsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); 
                    // InternalClassData.g:474:3: ( rule__KType__MethodsAssignment_1_1_1 )
                    // InternalClassData.g:474:4: rule__KType__MethodsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__KType__MethodsAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalClassData.g:478:2: ( ( rule__KType__DependenciesAssignment_1_1_2 ) )
                    {
                    // InternalClassData.g:478:2: ( ( rule__KType__DependenciesAssignment_1_1_2 ) )
                    // InternalClassData.g:479:3: ( rule__KType__DependenciesAssignment_1_1_2 )
                    {
                     before(grammarAccess.getKTypeAccess().getDependenciesAssignment_1_1_2()); 
                    // InternalClassData.g:480:3: ( rule__KType__DependenciesAssignment_1_1_2 )
                    // InternalClassData.g:480:4: rule__KType__DependenciesAssignment_1_1_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:488:1: rule__PropertyValue__Alternatives : ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:492:1: ( ( RULE_BOOLEAN ) | ( RULE_STRING ) | ( ruleFloat ) | ( ruleQualifiedID ) )
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
                    // InternalClassData.g:493:2: ( RULE_BOOLEAN )
                    {
                    // InternalClassData.g:493:2: ( RULE_BOOLEAN )
                    // InternalClassData.g:494:3: RULE_BOOLEAN
                    {
                     before(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 
                    match(input,RULE_BOOLEAN,FOLLOW_2); 
                     after(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalClassData.g:499:2: ( RULE_STRING )
                    {
                    // InternalClassData.g:499:2: ( RULE_STRING )
                    // InternalClassData.g:500:3: RULE_STRING
                    {
                     before(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalClassData.g:505:2: ( ruleFloat )
                    {
                    // InternalClassData.g:505:2: ( ruleFloat )
                    // InternalClassData.g:506:3: ruleFloat
                    {
                     before(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalClassData.g:511:2: ( ruleQualifiedID )
                    {
                    // InternalClassData.g:511:2: ( ruleQualifiedID )
                    // InternalClassData.g:512:3: ruleQualifiedID
                    {
                     before(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:521:1: rule__Float__Alternatives : ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:525:1: ( ( RULE_TFLOAT ) | ( RULE_NATURAL ) )
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
                    // InternalClassData.g:526:2: ( RULE_TFLOAT )
                    {
                    // InternalClassData.g:526:2: ( RULE_TFLOAT )
                    // InternalClassData.g:527:3: RULE_TFLOAT
                    {
                     before(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 
                    match(input,RULE_TFLOAT,FOLLOW_2); 
                     after(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalClassData.g:532:2: ( RULE_NATURAL )
                    {
                    // InternalClassData.g:532:2: ( RULE_NATURAL )
                    // InternalClassData.g:533:3: RULE_NATURAL
                    {
                     before(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); 
                    match(input,RULE_NATURAL,FOLLOW_2); 
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
    // InternalClassData.g:542:1: rule__KClassModel__Group__0 : rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 ;
    public final void rule__KClassModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:546:1: ( rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1 )
            // InternalClassData.g:547:2: rule__KClassModel__Group__0__Impl rule__KClassModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__KClassModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:554:1: rule__KClassModel__Group__0__Impl : ( () ) ;
    public final void rule__KClassModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:558:1: ( ( () ) )
            // InternalClassData.g:559:1: ( () )
            {
            // InternalClassData.g:559:1: ( () )
            // InternalClassData.g:560:2: ()
            {
             before(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); 
            // InternalClassData.g:561:2: ()
            // InternalClassData.g:561:3: 
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
    // InternalClassData.g:569:1: rule__KClassModel__Group__1 : rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 ;
    public final void rule__KClassModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:573:1: ( rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2 )
            // InternalClassData.g:574:2: rule__KClassModel__Group__1__Impl rule__KClassModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__KClassModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:581:1: rule__KClassModel__Group__1__Impl : ( ( rule__KClassModel__Group_1__0 )* ) ;
    public final void rule__KClassModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:585:1: ( ( ( rule__KClassModel__Group_1__0 )* ) )
            // InternalClassData.g:586:1: ( ( rule__KClassModel__Group_1__0 )* )
            {
            // InternalClassData.g:586:1: ( ( rule__KClassModel__Group_1__0 )* )
            // InternalClassData.g:587:2: ( rule__KClassModel__Group_1__0 )*
            {
             before(grammarAccess.getKClassModelAccess().getGroup_1()); 
            // InternalClassData.g:588:2: ( rule__KClassModel__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalClassData.g:588:3: rule__KClassModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalClassData.g:596:1: rule__KClassModel__Group__2 : rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 ;
    public final void rule__KClassModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:600:1: ( rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3 )
            // InternalClassData.g:601:2: rule__KClassModel__Group__2__Impl rule__KClassModel__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__KClassModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:608:1: rule__KClassModel__Group__2__Impl : ( ( rule__KClassModel__OptionsAssignment_2 )* ) ;
    public final void rule__KClassModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:612:1: ( ( ( rule__KClassModel__OptionsAssignment_2 )* ) )
            // InternalClassData.g:613:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            {
            // InternalClassData.g:613:1: ( ( rule__KClassModel__OptionsAssignment_2 )* )
            // InternalClassData.g:614:2: ( rule__KClassModel__OptionsAssignment_2 )*
            {
             before(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); 
            // InternalClassData.g:615:2: ( rule__KClassModel__OptionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalClassData.g:615:3: rule__KClassModel__OptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
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
    // InternalClassData.g:623:1: rule__KClassModel__Group__3 : rule__KClassModel__Group__3__Impl ;
    public final void rule__KClassModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:627:1: ( rule__KClassModel__Group__3__Impl )
            // InternalClassData.g:628:2: rule__KClassModel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:634:1: rule__KClassModel__Group__3__Impl : ( ( rule__KClassModel__PackagesAssignment_3 )* ) ;
    public final void rule__KClassModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:638:1: ( ( ( rule__KClassModel__PackagesAssignment_3 )* ) )
            // InternalClassData.g:639:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            {
            // InternalClassData.g:639:1: ( ( rule__KClassModel__PackagesAssignment_3 )* )
            // InternalClassData.g:640:2: ( rule__KClassModel__PackagesAssignment_3 )*
            {
             before(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); 
            // InternalClassData.g:641:2: ( rule__KClassModel__PackagesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalClassData.g:641:3: rule__KClassModel__PackagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
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
    // InternalClassData.g:650:1: rule__KClassModel__Group_1__0 : rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 ;
    public final void rule__KClassModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:654:1: ( rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1 )
            // InternalClassData.g:655:2: rule__KClassModel__Group_1__0__Impl rule__KClassModel__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__KClassModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:662:1: rule__KClassModel__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__KClassModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:666:1: ( ( 'import' ) )
            // InternalClassData.g:667:1: ( 'import' )
            {
            // InternalClassData.g:667:1: ( 'import' )
            // InternalClassData.g:668:2: 'import'
            {
             before(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalClassData.g:677:1: rule__KClassModel__Group_1__1 : rule__KClassModel__Group_1__1__Impl ;
    public final void rule__KClassModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:681:1: ( rule__KClassModel__Group_1__1__Impl )
            // InternalClassData.g:682:2: rule__KClassModel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:688:1: rule__KClassModel__Group_1__1__Impl : ( ( rule__KClassModel__Alternatives_1_1 ) ) ;
    public final void rule__KClassModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:692:1: ( ( ( rule__KClassModel__Alternatives_1_1 ) ) )
            // InternalClassData.g:693:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            {
            // InternalClassData.g:693:1: ( ( rule__KClassModel__Alternatives_1_1 ) )
            // InternalClassData.g:694:2: ( rule__KClassModel__Alternatives_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); 
            // InternalClassData.g:695:2: ( rule__KClassModel__Alternatives_1_1 )
            // InternalClassData.g:695:3: rule__KClassModel__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:704:1: rule__KClassModel__Group_1_1_0__0 : rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 ;
    public final void rule__KClassModel__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:708:1: ( rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1 )
            // InternalClassData.g:709:2: rule__KClassModel__Group_1_1_0__0__Impl rule__KClassModel__Group_1_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__KClassModel__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:716:1: rule__KClassModel__Group_1_1_0__0__Impl : ( 'project' ) ;
    public final void rule__KClassModel__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:720:1: ( ( 'project' ) )
            // InternalClassData.g:721:1: ( 'project' )
            {
            // InternalClassData.g:721:1: ( 'project' )
            // InternalClassData.g:722:2: 'project'
            {
             before(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalClassData.g:731:1: rule__KClassModel__Group_1_1_0__1 : rule__KClassModel__Group_1_1_0__1__Impl ;
    public final void rule__KClassModel__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:735:1: ( rule__KClassModel__Group_1_1_0__1__Impl )
            // InternalClassData.g:736:2: rule__KClassModel__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:742:1: rule__KClassModel__Group_1_1_0__1__Impl : ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:746:1: ( ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) ) )
            // InternalClassData.g:747:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            {
            // InternalClassData.g:747:1: ( ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 ) )
            // InternalClassData.g:748:2: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); 
            // InternalClassData.g:749:2: ( rule__KClassModel__JavaProjectsAssignment_1_1_0_1 )
            // InternalClassData.g:749:3: rule__KClassModel__JavaProjectsAssignment_1_1_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:758:1: rule__KClassModel__Group_1_1_1__0 : rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 ;
    public final void rule__KClassModel__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:762:1: ( rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1 )
            // InternalClassData.g:763:2: rule__KClassModel__Group_1_1_1__0__Impl rule__KClassModel__Group_1_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__KClassModel__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:770:1: rule__KClassModel__Group_1_1_1__0__Impl : ( 'bundle' ) ;
    public final void rule__KClassModel__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:774:1: ( ( 'bundle' ) )
            // InternalClassData.g:775:1: ( 'bundle' )
            {
            // InternalClassData.g:775:1: ( 'bundle' )
            // InternalClassData.g:776:2: 'bundle'
            {
             before(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalClassData.g:785:1: rule__KClassModel__Group_1_1_1__1 : rule__KClassModel__Group_1_1_1__1__Impl ;
    public final void rule__KClassModel__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:789:1: ( rule__KClassModel__Group_1_1_1__1__Impl )
            // InternalClassData.g:790:2: rule__KClassModel__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:796:1: rule__KClassModel__Group_1_1_1__1__Impl : ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) ;
    public final void rule__KClassModel__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:800:1: ( ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) ) )
            // InternalClassData.g:801:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            {
            // InternalClassData.g:801:1: ( ( rule__KClassModel__BundlesAssignment_1_1_1_1 ) )
            // InternalClassData.g:802:2: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); 
            // InternalClassData.g:803:2: ( rule__KClassModel__BundlesAssignment_1_1_1_1 )
            // InternalClassData.g:803:3: rule__KClassModel__BundlesAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:812:1: rule__KOption__Group__0 : rule__KOption__Group__0__Impl rule__KOption__Group__1 ;
    public final void rule__KOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:816:1: ( rule__KOption__Group__0__Impl rule__KOption__Group__1 )
            // InternalClassData.g:817:2: rule__KOption__Group__0__Impl rule__KOption__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:824:1: rule__KOption__Group__0__Impl : ( () ) ;
    public final void rule__KOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:828:1: ( ( () ) )
            // InternalClassData.g:829:1: ( () )
            {
            // InternalClassData.g:829:1: ( () )
            // InternalClassData.g:830:2: ()
            {
             before(grammarAccess.getKOptionAccess().getKOptionAction_0()); 
            // InternalClassData.g:831:2: ()
            // InternalClassData.g:831:3: 
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
    // InternalClassData.g:839:1: rule__KOption__Group__1 : rule__KOption__Group__1__Impl rule__KOption__Group__2 ;
    public final void rule__KOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:843:1: ( rule__KOption__Group__1__Impl rule__KOption__Group__2 )
            // InternalClassData.g:844:2: rule__KOption__Group__1__Impl rule__KOption__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__KOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:851:1: rule__KOption__Group__1__Impl : ( ( rule__KOption__KeyAssignment_1 ) ) ;
    public final void rule__KOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:855:1: ( ( ( rule__KOption__KeyAssignment_1 ) ) )
            // InternalClassData.g:856:1: ( ( rule__KOption__KeyAssignment_1 ) )
            {
            // InternalClassData.g:856:1: ( ( rule__KOption__KeyAssignment_1 ) )
            // InternalClassData.g:857:2: ( rule__KOption__KeyAssignment_1 )
            {
             before(grammarAccess.getKOptionAccess().getKeyAssignment_1()); 
            // InternalClassData.g:858:2: ( rule__KOption__KeyAssignment_1 )
            // InternalClassData.g:858:3: rule__KOption__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:866:1: rule__KOption__Group__2 : rule__KOption__Group__2__Impl rule__KOption__Group__3 ;
    public final void rule__KOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:870:1: ( rule__KOption__Group__2__Impl rule__KOption__Group__3 )
            // InternalClassData.g:871:2: rule__KOption__Group__2__Impl rule__KOption__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__KOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:878:1: rule__KOption__Group__2__Impl : ( '=' ) ;
    public final void rule__KOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:882:1: ( ( '=' ) )
            // InternalClassData.g:883:1: ( '=' )
            {
            // InternalClassData.g:883:1: ( '=' )
            // InternalClassData.g:884:2: '='
            {
             before(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalClassData.g:893:1: rule__KOption__Group__3 : rule__KOption__Group__3__Impl ;
    public final void rule__KOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:897:1: ( rule__KOption__Group__3__Impl )
            // InternalClassData.g:898:2: rule__KOption__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:904:1: rule__KOption__Group__3__Impl : ( ( rule__KOption__ValueAssignment_3 ) ) ;
    public final void rule__KOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:908:1: ( ( ( rule__KOption__ValueAssignment_3 ) ) )
            // InternalClassData.g:909:1: ( ( rule__KOption__ValueAssignment_3 ) )
            {
            // InternalClassData.g:909:1: ( ( rule__KOption__ValueAssignment_3 ) )
            // InternalClassData.g:910:2: ( rule__KOption__ValueAssignment_3 )
            {
             before(grammarAccess.getKOptionAccess().getValueAssignment_3()); 
            // InternalClassData.g:911:2: ( rule__KOption__ValueAssignment_3 )
            // InternalClassData.g:911:3: rule__KOption__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:920:1: rule__KPackage__Group__0 : rule__KPackage__Group__0__Impl rule__KPackage__Group__1 ;
    public final void rule__KPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:924:1: ( rule__KPackage__Group__0__Impl rule__KPackage__Group__1 )
            // InternalClassData.g:925:2: rule__KPackage__Group__0__Impl rule__KPackage__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:932:1: rule__KPackage__Group__0__Impl : ( 'package' ) ;
    public final void rule__KPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:936:1: ( ( 'package' ) )
            // InternalClassData.g:937:1: ( 'package' )
            {
            // InternalClassData.g:937:1: ( 'package' )
            // InternalClassData.g:938:2: 'package'
            {
             before(grammarAccess.getKPackageAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalClassData.g:947:1: rule__KPackage__Group__1 : rule__KPackage__Group__1__Impl rule__KPackage__Group__2 ;
    public final void rule__KPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:951:1: ( rule__KPackage__Group__1__Impl rule__KPackage__Group__2 )
            // InternalClassData.g:952:2: rule__KPackage__Group__1__Impl rule__KPackage__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__KPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:959:1: rule__KPackage__Group__1__Impl : ( ( rule__KPackage__NameAssignment_1 ) ) ;
    public final void rule__KPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:963:1: ( ( ( rule__KPackage__NameAssignment_1 ) ) )
            // InternalClassData.g:964:1: ( ( rule__KPackage__NameAssignment_1 ) )
            {
            // InternalClassData.g:964:1: ( ( rule__KPackage__NameAssignment_1 ) )
            // InternalClassData.g:965:2: ( rule__KPackage__NameAssignment_1 )
            {
             before(grammarAccess.getKPackageAccess().getNameAssignment_1()); 
            // InternalClassData.g:966:2: ( rule__KPackage__NameAssignment_1 )
            // InternalClassData.g:966:3: rule__KPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:974:1: rule__KPackage__Group__2 : rule__KPackage__Group__2__Impl rule__KPackage__Group__3 ;
    public final void rule__KPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:978:1: ( rule__KPackage__Group__2__Impl rule__KPackage__Group__3 )
            // InternalClassData.g:979:2: rule__KPackage__Group__2__Impl rule__KPackage__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__KPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:986:1: rule__KPackage__Group__2__Impl : ( '{' ) ;
    public final void rule__KPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:990:1: ( ( '{' ) )
            // InternalClassData.g:991:1: ( '{' )
            {
            // InternalClassData.g:991:1: ( '{' )
            // InternalClassData.g:992:2: '{'
            {
             before(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalClassData.g:1001:1: rule__KPackage__Group__3 : rule__KPackage__Group__3__Impl rule__KPackage__Group__4 ;
    public final void rule__KPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1005:1: ( rule__KPackage__Group__3__Impl rule__KPackage__Group__4 )
            // InternalClassData.g:1006:2: rule__KPackage__Group__3__Impl rule__KPackage__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__KPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1013:1: rule__KPackage__Group__3__Impl : ( ( rule__KPackage__TypesAssignment_3 )* ) ;
    public final void rule__KPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1017:1: ( ( ( rule__KPackage__TypesAssignment_3 )* ) )
            // InternalClassData.g:1018:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            {
            // InternalClassData.g:1018:1: ( ( rule__KPackage__TypesAssignment_3 )* )
            // InternalClassData.g:1019:2: ( rule__KPackage__TypesAssignment_3 )*
            {
             before(grammarAccess.getKPackageAccess().getTypesAssignment_3()); 
            // InternalClassData.g:1020:2: ( rule__KPackage__TypesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalClassData.g:1020:3: rule__KPackage__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalClassData.g:1028:1: rule__KPackage__Group__4 : rule__KPackage__Group__4__Impl ;
    public final void rule__KPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1032:1: ( rule__KPackage__Group__4__Impl )
            // InternalClassData.g:1033:2: rule__KPackage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1039:1: rule__KPackage__Group__4__Impl : ( '}' ) ;
    public final void rule__KPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1043:1: ( ( '}' ) )
            // InternalClassData.g:1044:1: ( '}' )
            {
            // InternalClassData.g:1044:1: ( '}' )
            // InternalClassData.g:1045:2: '}'
            {
             before(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalClassData.g:1055:1: rule__KType__Group__0 : rule__KType__Group__0__Impl rule__KType__Group__1 ;
    public final void rule__KType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1059:1: ( rule__KType__Group__0__Impl rule__KType__Group__1 )
            // InternalClassData.g:1060:2: rule__KType__Group__0__Impl rule__KType__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__KType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1067:1: rule__KType__Group__0__Impl : ( ( rule__KType__Alternatives_0 ) ) ;
    public final void rule__KType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1071:1: ( ( ( rule__KType__Alternatives_0 ) ) )
            // InternalClassData.g:1072:1: ( ( rule__KType__Alternatives_0 ) )
            {
            // InternalClassData.g:1072:1: ( ( rule__KType__Alternatives_0 ) )
            // InternalClassData.g:1073:2: ( rule__KType__Alternatives_0 )
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_0()); 
            // InternalClassData.g:1074:2: ( rule__KType__Alternatives_0 )
            // InternalClassData.g:1074:3: rule__KType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1082:1: rule__KType__Group__1 : rule__KType__Group__1__Impl ;
    public final void rule__KType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1086:1: ( rule__KType__Group__1__Impl )
            // InternalClassData.g:1087:2: rule__KType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1093:1: rule__KType__Group__1__Impl : ( ( rule__KType__Group_1__0 )? ) ;
    public final void rule__KType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1097:1: ( ( ( rule__KType__Group_1__0 )? ) )
            // InternalClassData.g:1098:1: ( ( rule__KType__Group_1__0 )? )
            {
            // InternalClassData.g:1098:1: ( ( rule__KType__Group_1__0 )? )
            // InternalClassData.g:1099:2: ( rule__KType__Group_1__0 )?
            {
             before(grammarAccess.getKTypeAccess().getGroup_1()); 
            // InternalClassData.g:1100:2: ( rule__KType__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalClassData.g:1100:3: rule__KType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1109:1: rule__KType__Group_1__0 : rule__KType__Group_1__0__Impl rule__KType__Group_1__1 ;
    public final void rule__KType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1113:1: ( rule__KType__Group_1__0__Impl rule__KType__Group_1__1 )
            // InternalClassData.g:1114:2: rule__KType__Group_1__0__Impl rule__KType__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__KType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1121:1: rule__KType__Group_1__0__Impl : ( '{' ) ;
    public final void rule__KType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1125:1: ( ( '{' ) )
            // InternalClassData.g:1126:1: ( '{' )
            {
            // InternalClassData.g:1126:1: ( '{' )
            // InternalClassData.g:1127:2: '{'
            {
             before(grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalClassData.g:1136:1: rule__KType__Group_1__1 : rule__KType__Group_1__1__Impl rule__KType__Group_1__2 ;
    public final void rule__KType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1140:1: ( rule__KType__Group_1__1__Impl rule__KType__Group_1__2 )
            // InternalClassData.g:1141:2: rule__KType__Group_1__1__Impl rule__KType__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__KType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1148:1: rule__KType__Group_1__1__Impl : ( ( rule__KType__Alternatives_1_1 )* ) ;
    public final void rule__KType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1152:1: ( ( ( rule__KType__Alternatives_1_1 )* ) )
            // InternalClassData.g:1153:1: ( ( rule__KType__Alternatives_1_1 )* )
            {
            // InternalClassData.g:1153:1: ( ( rule__KType__Alternatives_1_1 )* )
            // InternalClassData.g:1154:2: ( rule__KType__Alternatives_1_1 )*
            {
             before(grammarAccess.getKTypeAccess().getAlternatives_1_1()); 
            // InternalClassData.g:1155:2: ( rule__KType__Alternatives_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalClassData.g:1155:3: rule__KType__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalClassData.g:1163:1: rule__KType__Group_1__2 : rule__KType__Group_1__2__Impl ;
    public final void rule__KType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1167:1: ( rule__KType__Group_1__2__Impl )
            // InternalClassData.g:1168:2: rule__KType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1174:1: rule__KType__Group_1__2__Impl : ( '}' ) ;
    public final void rule__KType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1178:1: ( ( '}' ) )
            // InternalClassData.g:1179:1: ( '}' )
            {
            // InternalClassData.g:1179:1: ( '}' )
            // InternalClassData.g:1180:2: '}'
            {
             before(grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalClassData.g:1190:1: rule__KClass__Group__0 : rule__KClass__Group__0__Impl rule__KClass__Group__1 ;
    public final void rule__KClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1194:1: ( rule__KClass__Group__0__Impl rule__KClass__Group__1 )
            // InternalClassData.g:1195:2: rule__KClass__Group__0__Impl rule__KClass__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1202:1: rule__KClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__KClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1206:1: ( ( 'class' ) )
            // InternalClassData.g:1207:1: ( 'class' )
            {
            // InternalClassData.g:1207:1: ( 'class' )
            // InternalClassData.g:1208:2: 'class'
            {
             before(grammarAccess.getKClassAccess().getClassKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalClassData.g:1217:1: rule__KClass__Group__1 : rule__KClass__Group__1__Impl ;
    public final void rule__KClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1221:1: ( rule__KClass__Group__1__Impl )
            // InternalClassData.g:1222:2: rule__KClass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1228:1: rule__KClass__Group__1__Impl : ( ( rule__KClass__NameAssignment_1 ) ) ;
    public final void rule__KClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1232:1: ( ( ( rule__KClass__NameAssignment_1 ) ) )
            // InternalClassData.g:1233:1: ( ( rule__KClass__NameAssignment_1 ) )
            {
            // InternalClassData.g:1233:1: ( ( rule__KClass__NameAssignment_1 ) )
            // InternalClassData.g:1234:2: ( rule__KClass__NameAssignment_1 )
            {
             before(grammarAccess.getKClassAccess().getNameAssignment_1()); 
            // InternalClassData.g:1235:2: ( rule__KClass__NameAssignment_1 )
            // InternalClassData.g:1235:3: rule__KClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1244:1: rule__KInterface__Group__0 : rule__KInterface__Group__0__Impl rule__KInterface__Group__1 ;
    public final void rule__KInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1248:1: ( rule__KInterface__Group__0__Impl rule__KInterface__Group__1 )
            // InternalClassData.g:1249:2: rule__KInterface__Group__0__Impl rule__KInterface__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1256:1: rule__KInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__KInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1260:1: ( ( 'interface' ) )
            // InternalClassData.g:1261:1: ( 'interface' )
            {
            // InternalClassData.g:1261:1: ( 'interface' )
            // InternalClassData.g:1262:2: 'interface'
            {
             before(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalClassData.g:1271:1: rule__KInterface__Group__1 : rule__KInterface__Group__1__Impl ;
    public final void rule__KInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1275:1: ( rule__KInterface__Group__1__Impl )
            // InternalClassData.g:1276:2: rule__KInterface__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1282:1: rule__KInterface__Group__1__Impl : ( ( rule__KInterface__NameAssignment_1 ) ) ;
    public final void rule__KInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1286:1: ( ( ( rule__KInterface__NameAssignment_1 ) ) )
            // InternalClassData.g:1287:1: ( ( rule__KInterface__NameAssignment_1 ) )
            {
            // InternalClassData.g:1287:1: ( ( rule__KInterface__NameAssignment_1 ) )
            // InternalClassData.g:1288:2: ( rule__KInterface__NameAssignment_1 )
            {
             before(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); 
            // InternalClassData.g:1289:2: ( rule__KInterface__NameAssignment_1 )
            // InternalClassData.g:1289:3: rule__KInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1298:1: rule__KEnum__Group__0 : rule__KEnum__Group__0__Impl rule__KEnum__Group__1 ;
    public final void rule__KEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1302:1: ( rule__KEnum__Group__0__Impl rule__KEnum__Group__1 )
            // InternalClassData.g:1303:2: rule__KEnum__Group__0__Impl rule__KEnum__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1310:1: rule__KEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__KEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1314:1: ( ( 'enum' ) )
            // InternalClassData.g:1315:1: ( 'enum' )
            {
            // InternalClassData.g:1315:1: ( 'enum' )
            // InternalClassData.g:1316:2: 'enum'
            {
             before(grammarAccess.getKEnumAccess().getEnumKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalClassData.g:1325:1: rule__KEnum__Group__1 : rule__KEnum__Group__1__Impl ;
    public final void rule__KEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1329:1: ( rule__KEnum__Group__1__Impl )
            // InternalClassData.g:1330:2: rule__KEnum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1336:1: rule__KEnum__Group__1__Impl : ( ( rule__KEnum__NameAssignment_1 ) ) ;
    public final void rule__KEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1340:1: ( ( ( rule__KEnum__NameAssignment_1 ) ) )
            // InternalClassData.g:1341:1: ( ( rule__KEnum__NameAssignment_1 ) )
            {
            // InternalClassData.g:1341:1: ( ( rule__KEnum__NameAssignment_1 ) )
            // InternalClassData.g:1342:2: ( rule__KEnum__NameAssignment_1 )
            {
             before(grammarAccess.getKEnumAccess().getNameAssignment_1()); 
            // InternalClassData.g:1343:2: ( rule__KEnum__NameAssignment_1 )
            // InternalClassData.g:1343:3: rule__KEnum__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1352:1: rule__KDependency__Group__0 : rule__KDependency__Group__0__Impl rule__KDependency__Group__1 ;
    public final void rule__KDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1356:1: ( rule__KDependency__Group__0__Impl rule__KDependency__Group__1 )
            // InternalClassData.g:1357:2: rule__KDependency__Group__0__Impl rule__KDependency__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__KDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1364:1: rule__KDependency__Group__0__Impl : ( 'depend' ) ;
    public final void rule__KDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1368:1: ( ( 'depend' ) )
            // InternalClassData.g:1369:1: ( 'depend' )
            {
            // InternalClassData.g:1369:1: ( 'depend' )
            // InternalClassData.g:1370:2: 'depend'
            {
             before(grammarAccess.getKDependencyAccess().getDependKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalClassData.g:1379:1: rule__KDependency__Group__1 : rule__KDependency__Group__1__Impl rule__KDependency__Group__2 ;
    public final void rule__KDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1383:1: ( rule__KDependency__Group__1__Impl rule__KDependency__Group__2 )
            // InternalClassData.g:1384:2: rule__KDependency__Group__1__Impl rule__KDependency__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__KDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1391:1: rule__KDependency__Group__1__Impl : ( ( rule__KDependency__LabelAssignment_1 )? ) ;
    public final void rule__KDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1395:1: ( ( ( rule__KDependency__LabelAssignment_1 )? ) )
            // InternalClassData.g:1396:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            {
            // InternalClassData.g:1396:1: ( ( rule__KDependency__LabelAssignment_1 )? )
            // InternalClassData.g:1397:2: ( rule__KDependency__LabelAssignment_1 )?
            {
             before(grammarAccess.getKDependencyAccess().getLabelAssignment_1()); 
            // InternalClassData.g:1398:2: ( rule__KDependency__LabelAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalClassData.g:1398:3: rule__KDependency__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1406:1: rule__KDependency__Group__2 : rule__KDependency__Group__2__Impl ;
    public final void rule__KDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1410:1: ( rule__KDependency__Group__2__Impl )
            // InternalClassData.g:1411:2: rule__KDependency__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1417:1: rule__KDependency__Group__2__Impl : ( ( rule__KDependency__TargetAssignment_2 ) ) ;
    public final void rule__KDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1421:1: ( ( ( rule__KDependency__TargetAssignment_2 ) ) )
            // InternalClassData.g:1422:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            {
            // InternalClassData.g:1422:1: ( ( rule__KDependency__TargetAssignment_2 ) )
            // InternalClassData.g:1423:2: ( rule__KDependency__TargetAssignment_2 )
            {
             before(grammarAccess.getKDependencyAccess().getTargetAssignment_2()); 
            // InternalClassData.g:1424:2: ( rule__KDependency__TargetAssignment_2 )
            // InternalClassData.g:1424:3: rule__KDependency__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1433:1: rule__KMethod__Group__0 : rule__KMethod__Group__0__Impl rule__KMethod__Group__1 ;
    public final void rule__KMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1437:1: ( rule__KMethod__Group__0__Impl rule__KMethod__Group__1 )
            // InternalClassData.g:1438:2: rule__KMethod__Group__0__Impl rule__KMethod__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__KMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1445:1: rule__KMethod__Group__0__Impl : ( ( rule__KMethod__NameAssignment_0 ) ) ;
    public final void rule__KMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1449:1: ( ( ( rule__KMethod__NameAssignment_0 ) ) )
            // InternalClassData.g:1450:1: ( ( rule__KMethod__NameAssignment_0 ) )
            {
            // InternalClassData.g:1450:1: ( ( rule__KMethod__NameAssignment_0 ) )
            // InternalClassData.g:1451:2: ( rule__KMethod__NameAssignment_0 )
            {
             before(grammarAccess.getKMethodAccess().getNameAssignment_0()); 
            // InternalClassData.g:1452:2: ( rule__KMethod__NameAssignment_0 )
            // InternalClassData.g:1452:3: rule__KMethod__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1460:1: rule__KMethod__Group__1 : rule__KMethod__Group__1__Impl rule__KMethod__Group__2 ;
    public final void rule__KMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1464:1: ( rule__KMethod__Group__1__Impl rule__KMethod__Group__2 )
            // InternalClassData.g:1465:2: rule__KMethod__Group__1__Impl rule__KMethod__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__KMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1472:1: rule__KMethod__Group__1__Impl : ( '(' ) ;
    public final void rule__KMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1476:1: ( ( '(' ) )
            // InternalClassData.g:1477:1: ( '(' )
            {
            // InternalClassData.g:1477:1: ( '(' )
            // InternalClassData.g:1478:2: '('
            {
             before(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalClassData.g:1487:1: rule__KMethod__Group__2 : rule__KMethod__Group__2__Impl rule__KMethod__Group__3 ;
    public final void rule__KMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1491:1: ( rule__KMethod__Group__2__Impl rule__KMethod__Group__3 )
            // InternalClassData.g:1492:2: rule__KMethod__Group__2__Impl rule__KMethod__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__KMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1499:1: rule__KMethod__Group__2__Impl : ( ( rule__KMethod__Group_2__0 )? ) ;
    public final void rule__KMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1503:1: ( ( ( rule__KMethod__Group_2__0 )? ) )
            // InternalClassData.g:1504:1: ( ( rule__KMethod__Group_2__0 )? )
            {
            // InternalClassData.g:1504:1: ( ( rule__KMethod__Group_2__0 )? )
            // InternalClassData.g:1505:2: ( rule__KMethod__Group_2__0 )?
            {
             before(grammarAccess.getKMethodAccess().getGroup_2()); 
            // InternalClassData.g:1506:2: ( rule__KMethod__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalClassData.g:1506:3: rule__KMethod__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1514:1: rule__KMethod__Group__3 : rule__KMethod__Group__3__Impl ;
    public final void rule__KMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1518:1: ( rule__KMethod__Group__3__Impl )
            // InternalClassData.g:1519:2: rule__KMethod__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1525:1: rule__KMethod__Group__3__Impl : ( ')' ) ;
    public final void rule__KMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1529:1: ( ( ')' ) )
            // InternalClassData.g:1530:1: ( ')' )
            {
            // InternalClassData.g:1530:1: ( ')' )
            // InternalClassData.g:1531:2: ')'
            {
             before(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalClassData.g:1541:1: rule__KMethod__Group_2__0 : rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 ;
    public final void rule__KMethod__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1545:1: ( rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1 )
            // InternalClassData.g:1546:2: rule__KMethod__Group_2__0__Impl rule__KMethod__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__KMethod__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1553:1: rule__KMethod__Group_2__0__Impl : ( ( rule__KMethod__ParametersAssignment_2_0 ) ) ;
    public final void rule__KMethod__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1557:1: ( ( ( rule__KMethod__ParametersAssignment_2_0 ) ) )
            // InternalClassData.g:1558:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            {
            // InternalClassData.g:1558:1: ( ( rule__KMethod__ParametersAssignment_2_0 ) )
            // InternalClassData.g:1559:2: ( rule__KMethod__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); 
            // InternalClassData.g:1560:2: ( rule__KMethod__ParametersAssignment_2_0 )
            // InternalClassData.g:1560:3: rule__KMethod__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1568:1: rule__KMethod__Group_2__1 : rule__KMethod__Group_2__1__Impl ;
    public final void rule__KMethod__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1572:1: ( rule__KMethod__Group_2__1__Impl )
            // InternalClassData.g:1573:2: rule__KMethod__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1579:1: rule__KMethod__Group_2__1__Impl : ( ( rule__KMethod__Group_2_1__0 )* ) ;
    public final void rule__KMethod__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1583:1: ( ( ( rule__KMethod__Group_2_1__0 )* ) )
            // InternalClassData.g:1584:1: ( ( rule__KMethod__Group_2_1__0 )* )
            {
            // InternalClassData.g:1584:1: ( ( rule__KMethod__Group_2_1__0 )* )
            // InternalClassData.g:1585:2: ( rule__KMethod__Group_2_1__0 )*
            {
             before(grammarAccess.getKMethodAccess().getGroup_2_1()); 
            // InternalClassData.g:1586:2: ( rule__KMethod__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalClassData.g:1586:3: rule__KMethod__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalClassData.g:1595:1: rule__KMethod__Group_2_1__0 : rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 ;
    public final void rule__KMethod__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1599:1: ( rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1 )
            // InternalClassData.g:1600:2: rule__KMethod__Group_2_1__0__Impl rule__KMethod__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__KMethod__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1607:1: rule__KMethod__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__KMethod__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1611:1: ( ( ',' ) )
            // InternalClassData.g:1612:1: ( ',' )
            {
            // InternalClassData.g:1612:1: ( ',' )
            // InternalClassData.g:1613:2: ','
            {
             before(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalClassData.g:1622:1: rule__KMethod__Group_2_1__1 : rule__KMethod__Group_2_1__1__Impl ;
    public final void rule__KMethod__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1626:1: ( rule__KMethod__Group_2_1__1__Impl )
            // InternalClassData.g:1627:2: rule__KMethod__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1633:1: rule__KMethod__Group_2_1__1__Impl : ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__KMethod__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1637:1: ( ( ( rule__KMethod__ParametersAssignment_2_1_1 ) ) )
            // InternalClassData.g:1638:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            {
            // InternalClassData.g:1638:1: ( ( rule__KMethod__ParametersAssignment_2_1_1 ) )
            // InternalClassData.g:1639:2: ( rule__KMethod__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); 
            // InternalClassData.g:1640:2: ( rule__KMethod__ParametersAssignment_2_1_1 )
            // InternalClassData.g:1640:3: rule__KMethod__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1649:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1653:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // InternalClassData.g:1654:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1661:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1665:1: ( ( RULE_ID ) )
            // InternalClassData.g:1666:1: ( RULE_ID )
            {
            // InternalClassData.g:1666:1: ( RULE_ID )
            // InternalClassData.g:1667:2: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:1676:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1680:1: ( rule__QualifiedID__Group__1__Impl )
            // InternalClassData.g:1681:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1687:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1691:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // InternalClassData.g:1692:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // InternalClassData.g:1692:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // InternalClassData.g:1693:2: ( rule__QualifiedID__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            // InternalClassData.g:1694:2: ( rule__QualifiedID__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalClassData.g:1694:3: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalClassData.g:1703:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1707:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // InternalClassData.g:1708:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1715:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1719:1: ( ( '.' ) )
            // InternalClassData.g:1720:1: ( '.' )
            {
            // InternalClassData.g:1720:1: ( '.' )
            // InternalClassData.g:1721:2: '.'
            {
             before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalClassData.g:1730:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1734:1: ( rule__QualifiedID__Group_1__1__Impl )
            // InternalClassData.g:1735:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1741:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1745:1: ( ( RULE_ID ) )
            // InternalClassData.g:1746:1: ( RULE_ID )
            {
            // InternalClassData.g:1746:1: ( RULE_ID )
            // InternalClassData.g:1747:2: RULE_ID
            {
             before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:1757:1: rule__KClassModel__JavaProjectsAssignment_1_1_0_1 : ( RULE_STRING ) ;
    public final void rule__KClassModel__JavaProjectsAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1761:1: ( ( RULE_STRING ) )
            // InternalClassData.g:1762:2: ( RULE_STRING )
            {
            // InternalClassData.g:1762:2: ( RULE_STRING )
            // InternalClassData.g:1763:3: RULE_STRING
            {
             before(grammarAccess.getKClassModelAccess().getJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKClassModelAccess().getJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0()); 

            }


            }

        }
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
    // InternalClassData.g:1772:1: rule__KClassModel__BundlesAssignment_1_1_1_1 : ( ruleQualifiedID ) ;
    public final void rule__KClassModel__BundlesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1776:1: ( ( ruleQualifiedID ) )
            // InternalClassData.g:1777:2: ( ruleQualifiedID )
            {
            // InternalClassData.g:1777:2: ( ruleQualifiedID )
            // InternalClassData.g:1778:3: ruleQualifiedID
            {
             before(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1787:1: rule__KClassModel__OptionsAssignment_2 : ( ruleKOption ) ;
    public final void rule__KClassModel__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1791:1: ( ( ruleKOption ) )
            // InternalClassData.g:1792:2: ( ruleKOption )
            {
            // InternalClassData.g:1792:2: ( ruleKOption )
            // InternalClassData.g:1793:3: ruleKOption
            {
             before(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1802:1: rule__KClassModel__PackagesAssignment_3 : ( ruleKPackage ) ;
    public final void rule__KClassModel__PackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1806:1: ( ( ruleKPackage ) )
            // InternalClassData.g:1807:2: ( ruleKPackage )
            {
            // InternalClassData.g:1807:2: ( ruleKPackage )
            // InternalClassData.g:1808:3: ruleKPackage
            {
             before(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1817:1: rule__KOption__KeyAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KOption__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1821:1: ( ( ruleQualifiedID ) )
            // InternalClassData.g:1822:2: ( ruleQualifiedID )
            {
            // InternalClassData.g:1822:2: ( ruleQualifiedID )
            // InternalClassData.g:1823:3: ruleQualifiedID
            {
             before(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1832:1: rule__KOption__ValueAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__KOption__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1836:1: ( ( rulePropertyValue ) )
            // InternalClassData.g:1837:2: ( rulePropertyValue )
            {
            // InternalClassData.g:1837:2: ( rulePropertyValue )
            // InternalClassData.g:1838:3: rulePropertyValue
            {
             before(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1847:1: rule__KPackage__NameAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__KPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1851:1: ( ( ruleQualifiedID ) )
            // InternalClassData.g:1852:2: ( ruleQualifiedID )
            {
            // InternalClassData.g:1852:2: ( ruleQualifiedID )
            // InternalClassData.g:1853:3: ruleQualifiedID
            {
             before(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1862:1: rule__KPackage__TypesAssignment_3 : ( ruleKType ) ;
    public final void rule__KPackage__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1866:1: ( ( ruleKType ) )
            // InternalClassData.g:1867:2: ( ruleKType )
            {
            // InternalClassData.g:1867:2: ( ruleKType )
            // InternalClassData.g:1868:3: ruleKType
            {
             before(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1877:1: rule__KType__FieldsAssignment_1_1_0 : ( ruleKField ) ;
    public final void rule__KType__FieldsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1881:1: ( ( ruleKField ) )
            // InternalClassData.g:1882:2: ( ruleKField )
            {
            // InternalClassData.g:1882:2: ( ruleKField )
            // InternalClassData.g:1883:3: ruleKField
            {
             before(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1892:1: rule__KType__MethodsAssignment_1_1_1 : ( ruleKMethod ) ;
    public final void rule__KType__MethodsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1896:1: ( ( ruleKMethod ) )
            // InternalClassData.g:1897:2: ( ruleKMethod )
            {
            // InternalClassData.g:1897:2: ( ruleKMethod )
            // InternalClassData.g:1898:3: ruleKMethod
            {
             before(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1907:1: rule__KType__DependenciesAssignment_1_1_2 : ( ruleKDependency ) ;
    public final void rule__KType__DependenciesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1911:1: ( ( ruleKDependency ) )
            // InternalClassData.g:1912:2: ( ruleKDependency )
            {
            // InternalClassData.g:1912:2: ( ruleKDependency )
            // InternalClassData.g:1913:3: ruleKDependency
            {
             before(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:1922:1: rule__KClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1926:1: ( ( RULE_ID ) )
            // InternalClassData.g:1927:2: ( RULE_ID )
            {
            // InternalClassData.g:1927:2: ( RULE_ID )
            // InternalClassData.g:1928:3: RULE_ID
            {
             before(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:1937:1: rule__KInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1941:1: ( ( RULE_ID ) )
            // InternalClassData.g:1942:2: ( RULE_ID )
            {
            // InternalClassData.g:1942:2: ( RULE_ID )
            // InternalClassData.g:1943:3: RULE_ID
            {
             before(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:1952:1: rule__KEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1956:1: ( ( RULE_ID ) )
            // InternalClassData.g:1957:2: ( RULE_ID )
            {
            // InternalClassData.g:1957:2: ( RULE_ID )
            // InternalClassData.g:1958:3: RULE_ID
            {
             before(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:1967:1: rule__KDependency__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__KDependency__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1971:1: ( ( RULE_STRING ) )
            // InternalClassData.g:1972:2: ( RULE_STRING )
            {
            // InternalClassData.g:1972:2: ( RULE_STRING )
            // InternalClassData.g:1973:3: RULE_STRING
            {
             before(grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalClassData.g:1982:1: rule__KDependency__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__KDependency__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:1986:1: ( ( ( RULE_ID ) ) )
            // InternalClassData.g:1987:2: ( ( RULE_ID ) )
            {
            // InternalClassData.g:1987:2: ( ( RULE_ID ) )
            // InternalClassData.g:1988:3: ( RULE_ID )
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0()); 
            // InternalClassData.g:1989:3: ( RULE_ID )
            // InternalClassData.g:1990:4: RULE_ID
            {
             before(grammarAccess.getKDependencyAccess().getTargetKTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:2001:1: rule__KField__NameAssignment : ( RULE_ID ) ;
    public final void rule__KField__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:2005:1: ( ( RULE_ID ) )
            // InternalClassData.g:2006:2: ( RULE_ID )
            {
            // InternalClassData.g:2006:2: ( RULE_ID )
            // InternalClassData.g:2007:3: RULE_ID
            {
             before(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:2016:1: rule__KMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__KMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:2020:1: ( ( RULE_ID ) )
            // InternalClassData.g:2021:2: ( RULE_ID )
            {
            // InternalClassData.g:2021:2: ( RULE_ID )
            // InternalClassData.g:2022:3: RULE_ID
            {
             before(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalClassData.g:2031:1: rule__KMethod__ParametersAssignment_2_0 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:2035:1: ( ( ruleKTypeReference ) )
            // InternalClassData.g:2036:2: ( ruleKTypeReference )
            {
            // InternalClassData.g:2036:2: ( ruleKTypeReference )
            // InternalClassData.g:2037:3: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:2046:1: rule__KMethod__ParametersAssignment_2_1_1 : ( ruleKTypeReference ) ;
    public final void rule__KMethod__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:2050:1: ( ( ruleKTypeReference ) )
            // InternalClassData.g:2051:2: ( ruleKTypeReference )
            {
            // InternalClassData.g:2051:2: ( ruleKTypeReference )
            // InternalClassData.g:2052:3: ruleKTypeReference
            {
             before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalClassData.g:2061:1: rule__KTypeReference__SignatureAssignment : ( RULE_ID ) ;
    public final void rule__KTypeReference__SignatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalClassData.g:2065:1: ( ( RULE_ID ) )
            // InternalClassData.g:2066:2: ( RULE_ID )
            {
            // InternalClassData.g:2066:2: ( RULE_ID )
            // InternalClassData.g:2067:3: RULE_ID
            {
             before(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000044100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001100100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000102L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});

}