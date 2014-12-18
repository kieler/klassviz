package de.cau.cs.kieler.klassviz.xcore

import de.cau.cs.kieler.klassviz.model.classdata.ClassdataFactory
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KPackage
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.synthesis.IMetaModelExtensions
import java.util.Map
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xcore.XClass
import org.eclipse.emf.ecore.xcore.XClassifier
import org.eclipse.emf.ecore.xcore.XOperation
import org.eclipse.emf.ecore.xcore.XPackage
import org.eclipse.emf.ecore.xcore.XParameter
import org.eclipse.emf.ecore.xcore.XReference
import org.eclipse.emf.ecore.xcore.XStructuralFeature
import org.eclipse.emf.ecore.xcore.mappings.XcoreMapper
import de.cau.cs.kieler.klassviz.model.classdata.KField

class XcoreExtensions implements IMetaModelExtensions {

    private static Map<URI, URI> URI_MAP = EcorePlugin.computePlatformURIMap(true)
    
    extension ClassdataFactory = ClassdataFactory.eINSTANCE
    
    private ResourceSet set = new ResourceSetImpl() => [
        it.getURIConverter().getURIMap().putAll(URI_MAP);
    ];
    
    private Map<String, Resource> map = newHashMap();
    
    def private updatePackages(KClassModel classModel) {
        val packageKeys = newHashSet();
        packageKeys += map.keySet;

        for (String metamodel: classModel.getMetamodels().filter[!it.nullOrEmpty]) {
            val URI uri = URI.createPlatformResourceURI(metamodel, true);
            var Resource res = null;
            try {
                res = set.getResource(uri, true)
            } catch (Exception e) {
            }

            if (res != null && !res.contents.isEmpty()) {
                val model = res.contents.head;
                if (model instanceof XPackage) {
                	val prevRes = map.get(model.name);
                	if (res == prevRes) {
                		// if the obtained resource is already stored in the map
                		//  don't consider it any longer 
                		packageKeys.remove(model.name);
            		} else {
            			// otherwise put it into the map
                		map.put(model.name, res);                		
                    	if (prevRes != null) {
                    		// if there was a previous resource
                    		//  unload that one
                    		prevRes.unload();
                            // and consider the package to be treated as well
                            packageKeys.remove(model.name);
                    	} // otherwise ('curRes' == 'null') 'model.name' cannot be contained in 'keys'
                	}
                }
            }
        }

        for (String package : packageKeys) {
        	map.remove(package).unload()
        }
    }

    def getMetaModelPackage(KPackage kPackage) {
        return map.get(kPackage.name).contents.head;
    }

    override isMetaModelPackage(KPackage kPackage, KClassModel classModel) {
    	classModel.updatePackages;
        return map.get(kPackage.name) != null;
    }

    override getMetaModelPackage(KPackage kPackage, KClassModel classModel) {
        classModel.updatePackages;
        return kPackage.getMetaModelPackage();
    }

    override isMetaModelType(KType type) {
        return type.getMetaModelType != null;
    }

    override XClassifier getMetaModelType(KType type) {
        val package = type.eContainer as KPackage;
        val xPackage = map.get(package.name).contents.head as XPackage
        
        return xPackage.classifiers.findFirst[it.name == type.name];
    }

    override isMetaModelField(KField field) {
        return field.getMetaModelField() != null;
    }

    override XStructuralFeature getMetaModelField(KField field) {
        val xType = (field.eContainer as KType).getMetaModelType();
        if (xType instanceof XClass) {
            return xType.members.filter(XStructuralFeature).findFirst[
                it.name == field.name
            ];
        } else {
            return null;
        }
    }

    override isMetaModelMethod(KMethod method) {
        return method.getMetaModelMethod() != null;
    }

    override getMetaModelMethod(KMethod method) {
        val type = method.eContainer as KType;
        val xType = type.getMetaModelType();

        if (xType instanceof XClass) {
            val xOp = xType.members.filter(XOperation).filter[
                it.name == method.name && it.parameters.size == method.parameters.size
            ].findFirst[
                val paramsIt = method.parameters.iterator;
                for (XParameter xParam : it.parameters) {
                    val paramTypeName = paramsIt.next.signature;
                    val xParamType = xParam.type.type;
                    
                    val xParamTypeName = switch (xParamType) {
                        GenClassifier: xParamType.ecoreClassifier.instanceClassName
                    }
                                        
                    if (paramTypeName != xParamTypeName) {
                        return false;
                    }
                }
                return true;
            ];
            
            return xOp;
        }
        return null;
    }

    extension XcoreMapper = new XcoreMapper

    override resolve(KClassModel classModel) {
        classModel.updatePackages();
        
        val packageMap = newHashMap();
        val typeMap = newLinkedHashMap();
        
        for (package : classModel.packages) {
            packageMap.put(package.getMetaModelPackage(), package);
            for (kType : package.types) {
                val xType = kType.getMetaModelType;
                if (xType instanceof XClass) {
                    typeMap.put(xType, kType);
                    kType.selected = true;
                }
            }
        }

        for (entry : typeMap.entrySet) {
            val xType = entry.key;
            val kType = entry.value;

            val fields = newHashMap();

            for (kField : kType.fields) {
                val xField = kField.getMetaModelField();
                if (xField instanceof XReference) {
                    fields.put(xField, kField)
                    kField.selected = true;

                    // initialize the 'type' value in 'kField' if it is 'null' (via the '?:' op)
                    kField.type = kField.type?:createKTypeReference
                    kField.type.referenceType = typeMap.get(xField.type.type.xcoreElement)
                }
            }
            
            for (xField : xType.members.filter(XStructuralFeature).filter[ !fields.containsKey(it) ]) {
                kType.fields += createKField => [
                    it.name = xField.name;
                    it.type = createKTypeReference
                    it.type.referenceType = typeMap.get(xField.type.type.xcoreElement)
                ]
            }

//            for (method : kType.methods) {
//                method.selected = method.isMetaModelMethod
//            }
        }

        for (res : set.resources) {
            res.unload;
            map.remove(res);
        }

        return classModel
    }    
}