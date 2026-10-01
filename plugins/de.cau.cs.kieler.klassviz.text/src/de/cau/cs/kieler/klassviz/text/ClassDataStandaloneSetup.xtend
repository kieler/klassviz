package de.cau.cs.kieler.klassviz.text

import com.google.inject.Injector
import de.cau.cs.kieler.core.services.KielerLanguage
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ClassDataStandaloneSetup extends ClassDataStandaloneSetupGenerated implements KielerLanguage {

    protected static Injector injector

    def static Injector doSetup() {
        if (injector === null) {
            ClassdataPackage.eINSTANCE.eClass()
            injector = new ClassDataStandaloneSetup().createInjectorAndDoEMFRegistration()
        }
        return injector
    }
    
    override register(Injector injector) {
        super.register(injector)
        ClassdataPackage.eINSTANCE.eClass()
    }
    
    override getInjector() {
        return doSetup()
    }

    override getSupportedModels() {
        return #[KClassModel]
    }
    
    override getSupportedResourceExtensions() {
        return #["klaviz"]
    }
}
