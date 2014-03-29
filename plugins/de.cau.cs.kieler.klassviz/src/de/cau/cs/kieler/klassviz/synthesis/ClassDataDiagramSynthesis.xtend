/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klassviz.synthesis

import com.google.common.base.Joiner
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KContainerRendering
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.ArrayList
import java.util.Collection
import java.util.LinkedList
import java.util.List
import java.util.Map
import javax.inject.Inject
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jdt.core.Flags
import org.eclipse.jdt.core.IField
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.Signature

/**
 * Synthesis of class diagrams using the Classdata meta model.
 * 
 * @author ems
 */
class ClassDataDiagramSynthesis extends AbstractDiagramSynthesis<KTypeSelection> {
    
    public static val SYNTHESIS_ID = "de.cau.cs.kieler.klassviz.ClassDataDiagramSynthesis"
    
    // Various extensions that make it easier to generate a KGraph
    @Inject extension KColorExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KNodeExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KRenderingExtensions
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Constants
    
    /** The color of borders around nodes. */
    private static val BORDER_COLOR = "gray"
    /** Color used for edges. */
    private static val EDGE_COLOR = "#404040"
    /** Space between the border of a class node and its content. */
    private static val CLASS_NODE_INSETS = 5
    /** Amount of space to be left between the elements of a class node. */
    private static val CLASS_NODE_PADDING = 5
    /** Start color of the background gradient for classes. */
    private static val CLASS_BACKGROUND_1 = "#F8F9FD"
    /** End color of the background gradient for classes. */
    private static val CLASS_BACKGROUND_2 = "#CDDCF3"
    /** Start color of the background gradient for abstract classes. */
    private static val ABSTRACT_CLASS_BACKGROUND_1 = "#F8F9FD"
    /** End color of the background gradient for abstract classes. */
    private static val ABSTRACT_CLASS_BACKGROUND_2 = "#CDDCF3"
    /** Start color of the background gradient for interfaces. */
    private static val INTERFACE_BACKGROUND_1 = "#FEFFE8"
    /** End color of the background gradient for interfaces. */
    private static val INTERFACE_BACKGROUND_2 = "#dadbb5"
    /** Start color of the background gradient for enumerations. */
    private static val ENUM_BACKGROUND_1 = "#dfffea"
    /** End color of the background gradient for enumerations. */
    private static val ENUM_BACKGROUND_2 = "#badfc6"
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Synthesis Options
    
    private static val SynthesisOption GENERAL_SEPARATOR =
        SynthesisOption::createSeparator("General")
    
    private static val SynthesisOption COLOR_GRADIENT =
        SynthesisOption::createCheckOption("Use Color Gradient", true)
    
    private static val SynthesisOption VISUALIZE_PACKAGES =
        SynthesisOption::createCheckOption("Show Packagehierarchy", false)
    
    private static val VISUALIZE_SELECTION = "Visualize Selection"
    private static val VISUALIZE_ALL = "Visualize All"
    private static val SynthesisOption VISUALIZE_ALL_OR_SELECTION =
        SynthesisOption::createChoiceOption(
            "Visualization of Attributes/Methods",
            ImmutableList::of(VISUALIZE_SELECTION, VISUALIZE_ALL),
            VISUALIZE_SELECTION)

    private static val SynthesisOption CLASSES_SEPARATOR =
        SynthesisOption::createSeparator("Classes")
    private static val SynthesisOption CLASSES_FQNAME =
        SynthesisOption::createCheckOption("Fully Qualified Name", false)

    private static val SynthesisOption ATTRIBUTES_SEPARATOR =
        SynthesisOption::createSeparator("Attributes")
    private static val SynthesisOption ATTRIBUTES_PRIVATE =
        SynthesisOption::createCheckOption("Private Attributes", true)
    private static val SynthesisOption ATTRIBUTES_TYPE =
        SynthesisOption::createCheckOption("Type", true)
    private static val SynthesisOption ATTRIBUTES_VISIBILITY =
        SynthesisOption::createCheckOption("Show Visibility", true)

    private static val SynthesisOption METHODS_SEPARATOR =
        SynthesisOption::createSeparator("Methods")
    private static val SynthesisOption METHODS_PRIVATE =
        SynthesisOption::createCheckOption("Private Methods", true)
    private static val SynthesisOption METHODS_TYPE =
        SynthesisOption::createCheckOption("Type", true)
    private static val SynthesisOption METHODS_VISIBILITY =
        SynthesisOption::createCheckOption("Show Visibility", true)
    private static val SynthesisOption METHODS_PARAMETERS =
        SynthesisOption::createCheckOption("Parameters", true)

    private static val SynthesisOption EDGES_SEPARATOR =
        SynthesisOption::createSeparator("Edges")
    private static val SynthesisOption EDGES_INHERITANCE =
        SynthesisOption::createCheckOption("Inheritance", true)
    private static val SynthesisOption EDGES_ASSOCIATION =
        SynthesisOption::createCheckOption("Associations", true)
    
    /**
     * Returns our list of synthesis options to be displayed.
     */
    override public getDisplayedSynthesisOptions() {
        return ImmutableList::of(GENERAL_SEPARATOR, COLOR_GRADIENT, VISUALIZE_PACKAGES,
            VISUALIZE_ALL_OR_SELECTION, CLASSES_SEPARATOR, CLASSES_FQNAME, ATTRIBUTES_SEPARATOR,
            ATTRIBUTES_PRIVATE, ATTRIBUTES_TYPE, ATTRIBUTES_VISIBILITY, METHODS_SEPARATOR,
            METHODS_PRIVATE, METHODS_TYPE, METHODS_VISIBILITY, METHODS_PARAMETERS, EDGES_SEPARATOR,
            EDGES_INHERITANCE, EDGES_ASSOCIATION)
    }
    
    /**
     * Returns the list of layout options we want to provide to the user.
     */
    override public getDisplayedLayoutOptions() {
        return ImmutableList::of(
            specifyLayoutOption(LayoutOptions::DIRECTION, Direction::values().drop(1).sortBy[it.name]),
            specifyLayoutOption(LayoutOptions::SPACING, newArrayList(0, 255))
        );
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Transformation
    
    /**
     * Transforms a given selection of Java project elements into a class diagram.
     * 
     * @param model the model that captures the selection of Java project elements.
     * @return a KGraph that defines the class diagram.
     */
    override KNode transform(KTypeSelection model) {
        val classDiagramRoot = model.createNode().putToLookUpWith(model) => [ rootNode |
            // If packages should be visualized get all package nodes and create each package including
            // their contents
            if (VISUALIZE_PACKAGES.booleanValue) {
                rootNode.children += model.types.map [
                    it.type.packageFragment
                ].toSet.map [
                    it.createPackageNode(model)
                ]
            } else {
                // If not just create all class nodes including their contents
                rootNode.children += model.types.map [
                    it.createClassNode(model)
                ].filterNull
            }
            
            // Layout depends on whether we have hierarchy (visualize packages) or not. If we have,
            // hierarchy, we use KLay Layered; otherwise, we use a planarization algorithm.
            if (VISUALIZE_PACKAGES.booleanValue) {
                rootNode.setLayoutOption(LayoutOptions.ALGORITHM,
                    "de.cau.cs.kieler.klay.layered")
                rootNode.setLayoutOption(LayoutOptions.LAYOUT_HIERARCHY, true)
            } else {
                rootNode.setLayoutOption(LayoutOptions.ALGORITHM,
                    "de.cau.cs.kieler.kiml.ogdf.planarization")
            }
            
            // General layout options
            rootNode.setLayoutOption(LayoutOptions.SPACING, 50f)
            rootNode.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
        ]

        // If inheritance shall be visualized, create all inheritance edges
        if (EDGES_INHERITANCE.booleanValue) {
            model.createInheritanceEdges
        }

        // If associations shall be visualized, create all association edges with theirs multiplicities
        // for each node
        if (EDGES_ASSOCIATION.booleanValue) {
            model.types.forEach [
                it.createAssociationEdges(model)
            ]
        }

        // Return the finished diagram
        return classDiagramRoot
    }
    
    /**
     * Creates a node that represents the given Java package and adds all classes in the package to
     * the package node.
     * 
     * @param fragment the package to create a node for.
     * @param classDataSelection Java elements selected by the user.
     * @return node representing the package, including all classes.
     */
    def KNode createPackageNode(IPackageFragment fragment, KTypeSelection classDataSelection) {
        return fragment.createNode.putToLookUpWith(fragment) => [ packageNode |
            // Add a gray rectangle for each package
            packageNode.addRectangle => [ rect |
                // If Layout shall be with gradient use gradient, else not
                if (COLOR_GRADIENT.booleanValue) {
                    rect.setBackgroundGradient("gray".color, "white".color, 90)
                } else {
                    rect.setBackground("gray".color)
                }
                
                // For each type create a class node in this package if it is related to it.
                packageNode.children += classDataSelection.types.map[ classSelection |
                    if (classSelection.type.packageFragment == fragment) {
                        classSelection.createClassNode(classDataSelection)
                    }
                ].filterNull
            ]
        ]
    }
    
    /**
     * Creates a node for the given class.
     * 
     * @param classData the class to create a node for.
     * @param classDataSelection Java elements selected by the user.
     * @return node representing the class.
     */
    def KNode createClassNode(KType classData, KTypeSelection classDataSelection) {
        return classData.createNode.putToLookUpWith(classData) => [
            it.addRoundedRectangle(5, 5) => [ rect |
                rect.foreground = BORDER_COLOR.color
                rect.configureBackground(classData)
                rect.shadow = "black".color;
                rect.shadow.XOffset = 4;
                rect.shadow.YOffset = 4;
                rect.setGridPlacement(1)
                    .from(LEFT, CLASS_NODE_INSETS, 0, TOP, CLASS_NODE_INSETS, 0)
                    .to(RIGHT, CLASS_NODE_INSETS, 0, BOTTOM, CLASS_NODE_INSETS, 0)
                
                // Possibly add a modifier
                var isAbstract = false
                if (Flags.isAbstract(classData.type.flags)) {
                    rect.addClassModifier("Abstract")
                    isAbstract = true
                } else if (classData.type.isInterface) {
                    rect.addClassModifier("Interface")
                    isAbstract = true
                } else if (classData.type.isEnum) {
                    rect.addClassModifier("Enumeration")
                }
                
                // Add the class name
                if (CLASSES_FQNAME.booleanValue) {
                    rect.addClassName(classData.type.fullyQualifiedName, isAbstract)
                } else {
                    rect.addClassName(classData.type.elementName, isAbstract)
                }
                
                // Add all fields that have no association-relation or have association relation but
                // associations shouldn't be visualized
                val List<String> fields = new ArrayList(classData.fields.size)
                classData.fields.forEach [ eField |
                    // If the field will be visualized as a dependency, we don't need to process it
                    // at this point
                    if (!hasDependency(classData, classDataSelection, eField).get(0)
                        || !EDGES_ASSOCIATION.booleanValue) {

                        // If only private fields shall be added only add non private fields...
                        if (!Flags.isPrivate(eField.field.flags)  || ATTRIBUTES_PRIVATE.booleanValue) {
                            // If only selected fields shall be visualized only add selected fields
                            if (VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_SELECTION) {
                                if (eField.isSelected) {
                                    fields.add(eField.field.buildDisplayString)
                                }
                            } else {
                                fields.add(eField.field.buildDisplayString)
                            }
                        }
                    }
                ]
                
                // Add all methods
                val List<String> methods = new ArrayList(classData.methods.size)
                classData.methods.forEach [
                    // If only private methods shall be added only add non private methods...
                    if (!(Flags.isPrivate(it.method.flags) && !METHODS_PRIVATE.booleanValue)) {
                        // if only selected methods shall be visualized only add selected methods
                        if (VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_SELECTION) {
                            if (it.isSelected) {
                                methods.add(it.method.buildDisplayString)
                            }
                        } else {
                            methods.add(it.method.buildDisplayString)
                        }
                    }
                ]
                
                // Add all fields
                if (!(fields.empty && methods.empty)) {
                    rect.addSeparator
                    
                    fields.forEach [ field |
                        rect.addClassMember(field)
                    ]
                }
                
                // Add all methods
                if (!methods.empty) {
                    rect.addSeparator
                    
                    methods.forEach [ method |
                        rect.addClassMember(method)
                    ]
                }
            ]
        ]
    }
    
    def void createInheritanceEdges(KTypeSelection classDataSelection) {
        classDataSelection.types.forEach [ typeSelection |
            if (typeSelection.type.superclassName != null) {
                typeSelection.createClassInheritanceEdge(classDataSelection)
            }
            typeSelection.createInterfaceInheritanceEdge(classDataSelection)
        ]
    }
    
    

    // Check if field has an association-dependency.
    // A field has dependency when it's type equals one of the visualized classes
    // or a generic parameter type equals one of the visualized classes. 
    def List<Boolean> create fieldHasDependency : new LinkedList<Boolean>() hasDependency(KType classData,
        KTypeSelection classDataSelection, KField eField) {
        fieldHasDependency.add(false)
        val String[][] fieldType = classData.type.resolveType(
            Signature.getSignatureSimpleName(eField.field.typeSignature))
        if (!fieldType.nullOrEmpty) {
            val String fieldTypeFQN = Signature.toQualifiedName(fieldType.get(0))
            if (Signature.getQualifier(fieldTypeFQN).equals("java.util")) {
                val String generic = Signature.getSignatureSimpleName(eField.field.typeSignature)
                if (Collection.isAssignableFrom(Class.forName(fieldTypeFQN))) {
                    var String genericOfList = generic.substring(generic.indexOf("<") + 1,
                        generic.lastIndexOf(">"))
                    val genericOfListVal = genericOfList
                    val boolean fieldHasDependencyVal = classDataSelection.types.map [ classDataToBeCompared |
                        if (genericOfListVal.equals(classDataToBeCompared.type.elementName)) {
                            return true
                        }
                        return false
                    ].fold(false)[first, second|first || second]
                    fieldHasDependency.set(0, fieldHasDependencyVal)
                } else {
                    if (Map.isAssignableFrom(Class.forName(fieldTypeFQN))) {
                        var String genericsOfMap = generic.substring(generic.indexOf("<") + 1,
                            generic.lastIndexOf(">"))
                        var String[] seperatedGenericsOfMap = genericsOfMap.split(",")
                        val seperatedGenericsOfMapVal = seperatedGenericsOfMap
                        val boolean fieldHasDependencyVal = classDataSelection.types.map [ classDataToBeCompared |
                            return seperatedGenericsOfMapVal.map [
                                if (it.equals(classDataToBeCompared.type.elementName)) {
                                    return true
                                }
                                return false
                            ].fold(false)[first, second|first || second]
                        ].fold(false)[first, second|first || second]
                        fieldHasDependency.set(0, fieldHasDependencyVal)
                    }
                }
            } else {
                val boolean fieldHasDependencyVal = classDataSelection.types.map [ classDataToBeCompared |
                    if (fieldTypeFQN.equals(classDataToBeCompared.type.fullyQualifiedName)) {
                        return true
                    }
                    return false
                ].fold(false)[first, second|first || second]
                fieldHasDependency.set(0, fieldHasDependencyVal)
            }
        }
    }

    // For each class visualize all relationships to super classes that are visualized.
    def createClassInheritanceEdge(KType classData, KTypeSelection classDataSelection) {
        classDataSelection.types.forEach [ classDataToBeCompared |
            val IType superClass = classData.type.newSupertypeHierarchy(new NullProgressMonitor).
                getSuperclass(classData.type);
            if (classDataToBeCompared.type == superClass) {
                createEdge.putToLookUpWith(classData) => [
                    it.source = classData.node
                    it.target = classDataToBeCompared.node
                    it.addPolyline().putToLookUpWith(classData) => [
                        it.addInheritanceTriangleArrowDecorator()
                        it.foreground = EDGE_COLOR.color
                    ]
                ]
            }
        ]
    }

    // For each class visualize all relationships to super interfaces that are visualized.
    def createInterfaceInheritanceEdge(KType classData, KTypeSelection classDataSelection) {
        classDataSelection.types.forEach [ classDataToBeCompared |
            val IType[] directSuperInterfaces = classData.type.newSupertypeHierarchy(new NullProgressMonitor).
                getSuperInterfaces(classData.type);
            if (directSuperInterfaces.contains(classDataToBeCompared.type)) {
                createEdge.putToLookUpWith(classData) => [
                    it.source = classData.node
                    it.target = classDataToBeCompared.node
                    it.addPolyline().putToLookUpWith(classData) => [
                        if (classData.type.isInterface) {
                            // if interface has super interface the line is solid.
                            it.lineStyle = LineStyle::SOLID
                        } else {
                            // if class has super interface the line is dashed.
                            it.lineStyle = LineStyle::DASH
                        }
                        it.addInheritanceTriangleArrowDecorator()
                        it.foreground = EDGE_COLOR.color
                    ]
                ]
            }
        ]
    }

    // For each field in each class add their associations if there are any. Also add the multiplicities.
    def createAssociationEdges(KType classData, KTypeSelection classDataSelection) {
        classDataSelection.types.forEach [ classDataToBeCompared |
            val int[] classHasAssociationToThisClass = #[0, 0]
            classData.fields.forEach [ eField |
                // Don't check again if the field has no association relation anyways.
                if (!hasDependency(classData, classDataSelection, eField).get(0)) {
                    return
                }
                val String[][] fieldType = classData.type.resolveType(
                    Signature.getSignatureSimpleName(eField.field.typeSignature))
                if (!fieldType.nullOrEmpty) {
                    val String fieldTypeFQN = Signature.toQualifiedName(fieldType.get(0))
                    if (Signature.getQualifier(fieldTypeFQN).equals("java.util")) {
                        val String generic = Signature.getSignatureSimpleName(eField.field.typeSignature)

                        if (Collection.isAssignableFrom(Class.forName(fieldTypeFQN))) {

                            var String genericOfCollection = generic.substring(generic.indexOf("<") + 1,
                                generic.lastIndexOf(">"))
                            if (genericOfCollection.equals(classDataToBeCompared.type.elementName)) {

                                // If the field's generic parameter type is the checked class, 
                                // set the upper bound of the multiplicity to infinity (-1).
                                classHasAssociationToThisClass.set(1, -1)
                            }
                        }
                        if (Map.isAssignableFrom(Class.forName(fieldTypeFQN))) {
                            var String genericsOfMap = generic.substring(generic.indexOf("<") + 1,
                                generic.lastIndexOf(">"))
                            var String[] seperatedGenericsOfMap = genericsOfMap.split(",")
                            seperatedGenericsOfMap.forEach [
                                if (it.equals(classDataToBeCompared.type.elementName)) {

                                    // If the field's generic parameter type is the checked class, 
                                    // set the upper bound of the multiplicity to infinity (-1).
                                    classHasAssociationToThisClass.set(1, -1)
                                }
                            ]
                        }
                    }
                    if (fieldTypeFQN.equals(classDataToBeCompared.type.fullyQualifiedName)) {

                        // If the field's type is the checked class, 
                        // set the increment the lower bound of the multiplicity.
                        classHasAssociationToThisClass.set(0, classHasAssociationToThisClass.get(0).intValue + 1)
                    }

                }
            ]
            if (classHasAssociationToThisClass.get(0).intValue != 0 ||
                classHasAssociationToThisClass.get(1).intValue != 0) {

                // TODO: Self-associations not supported yet.
                if (!(classData.node == classDataToBeCompared.node)) {

                    // Add an edge labeled with the multiplicities.
                    createEdge.putToLookUpWith(classData) => [
                        it.source = classData.node
                        it.target = classDataToBeCompared.node
                        it.addPolyline().putToLookUpWith(classData) => [
                            it.addAssociationArrowDecorator
                            it.foreground = EDGE_COLOR.color
                        ]
                        var String multiplicity = ""
//                        if (classHasAssociationToThisClass.get(1).intValue == -1) {
//                            multiplicity = Integer.toString(classHasAssociationToThisClass.get(0)) + "..*"
//                        } else {
//                            multiplicity = Integer.toString(classHasAssociationToThisClass.get(0))
//                        }
                        if (classHasAssociationToThisClass.get(1).intValue == -1) {
                            multiplicity = "0..*"
                        } else {
                            multiplicity = "0.." + Integer.toString(classHasAssociationToThisClass.get(0))
                        }
                        it.createLabel().configureHeadEdgeLabel(multiplicity, KlighdConstants::DEFAULT_FONT_SIZE,
                            KlighdConstants::DEFAULT_FONT_NAME).putToLookUpWith(classData)
                    ]
                }
            }
        ]
    }

    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Class Diagram Utility Methods
    
    /**
     * Returns a displayable string for the given method. What kinds of information are included in the
     * string depends on the synthesis options.
     * 
     * @param method the method whose display string to build.
     */
    def String buildDisplayString(IMethod method) {
        // Visibility modifier
        val String visibility =
            if (METHODS_VISIBILITY.booleanValue) {
                getVisibility(method.flags)
            } else {
                ""
            }
        
        // Method parameters
        val parameters = newLinkedList();
        if (METHODS_PARAMETERS.booleanValue) {
            method.parameterNames.forEach [ parameterName, index |
                if (METHODS_TYPE.booleanValue) {
                    val parameterType =
                        " : " + Signature.getSignatureSimpleName(method.parameterTypes.get(index))
                    parameters += parameterName + parameterType
                } else {
                    parameters += parameterName
                }
            ]
        }
        
        // Return type
        val String methodReturnType =
            if (METHODS_TYPE.booleanValue) {
                " : " + Signature.getSignatureSimpleName(method.returnType)
            } else {
                ""
            }
        
        // Build the actual display string
        if (METHODS_PARAMETERS.booleanValue) {
            return visibility
                + method.elementName
                + " (" + Joiner.on(", ").join(parameters) + ")"
                + methodReturnType
        } else {
            return visibility + method.elementName + methodReturnType
        }
    }

    /**
     * Returns a displayable string for the given field. What kinds of information are included in
     * the string depends on the synthesis options.
     * 
     * @param field the field whose display string to build.
     */
    def String buildDisplayString(IField field) {
        var String fieldType = ""
        var String visibility = ""
        if (ATTRIBUTES_VISIBILITY.booleanValue) {
            visibility = getVisibility(field.flags)
        }

        if (ATTRIBUTES_TYPE.booleanValue) {
            fieldType = " : " + Signature.getSignatureSimpleName(field.typeSignature)
        }
        return visibility + field.elementName + fieldType
    }
    
    /**
     * Turns the given bit mask into a proper visibility modifier.
     * 
     * @param mask the visibility bit mask.
     * @return UML visibility modifier.
     */
    def getVisibility(int mask) {
        if (Flags.isPrivate(mask)) {
            return "\u2212"
        } else if (Flags.isPublic(mask)) {
            return "+"
        } else if (Flags.isProtected(mask)) {
            return "#"
        } else {
            return ""
        }
    }

    /**
     * Configures the background of the rendering that represents the given class.
     * 
     * @param rendering the rendering whose background to configure.
     * @param classData the corresponding class.
     */
    def void configureBackground(KRendering rendering, KType classData) {
        // Check if we should use gradients or not
        if (COLOR_GRADIENT.booleanValue) {
            if (classData.type.isClass) {
                if (Flags.isAbstract(classData.type.flags)) {
                    rendering.setBackgroundGradient(
                        ABSTRACT_CLASS_BACKGROUND_1.color,
                        ABSTRACT_CLASS_BACKGROUND_2.color,
                        90)
                } else {
                    rendering.setBackgroundGradient(
                        CLASS_BACKGROUND_1.color,
                        CLASS_BACKGROUND_2.color,
                        90)
                }
            } else if (classData.type.isInterface) {
                rendering.setBackgroundGradient(
                    INTERFACE_BACKGROUND_1.color,
                    INTERFACE_BACKGROUND_2.color,
                    90)
            } else if (classData.type.isEnum) {
                rendering.setBackgroundGradient(
                    ENUM_BACKGROUND_1.color,
                    ENUM_BACKGROUND_2.color,
                    90)
            }
        } else {
            if (classData.type.isClass) {
                if (Flags.isAbstract(classData.type.flags)) {
                    rendering.setBackground(ABSTRACT_CLASS_BACKGROUND_2.color)
                } else {
                    rendering.setBackground(CLASS_BACKGROUND_2.color)
                }
            } else if (classData.type.isInterface) {
                rendering.setBackground(INTERFACE_BACKGROUND_2.color)
            } else if (classData.type.isEnum) {
                rendering.setBackground(ENUM_BACKGROUND_2.color)
            }
        }
    }
    
    /**
     * Adds a label to the container with the given content, formatted as a class modifier.
     * 
     * @param container the container to add the label to.
     * @param modifier text for the label.
     * @return the container.
     */
    def KContainerRendering addClassModifier(KContainerRendering container, String modifier) {
        container.addText("<<" + modifier + ">>") => [ text |
            text.setGridPlacementData(
                0,
                0,
                createKPosition(LEFT, 0, 0, TOP, 0, 0),
                createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
        ]
        return container
    }
    
    /**
     * Adds a label to the container with the given content, formatted as a class name.
     * 
     * @param container the container to add the label to.
     * @param name text for the label.
     * @param isAbstract {@code true} if the class is an abstract class or an interface.
     * @return the container.
     */
    def KContainerRendering addClassName(KContainerRendering container, String name,
        boolean isAbstract) {
        
        container.addText(name) => [ text |
            text.fontSize = KlighdConstants.DEFAULT_FONT_SIZE + 2
            text.fontBold = true
            text.fontItalic = isAbstract
            text.setGridPlacementData(
                0,
                0,
                createKPosition(LEFT, 0, 0, TOP, 0, 0),
                createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
        ]
        return container
    }
    
    /**
     * Adds a label to the container with the given content, formatted as a class member. Class members
     * are fields or methods.
     * 
     * @param container the container to add the label to.
     * @param name text for the label.
     * @return the container.
     */
    def KContainerRendering addClassMember(KContainerRendering container, String name) {
        container.addText(name) => [ text |
            text.horizontalAlignment = H_LEFT
            text.setGridPlacementData(
                0,
                0,
                createKPosition(LEFT, 0, 0, TOP, CLASS_NODE_PADDING, 0),
                createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
        ]
        return container
    }

    /**
     * Adds a simple horizontal line that can be used for whatever simple horizontal lines are used
     * for. Separators in class nodes, for instance.
     * 
     * @param container the container to add the line to, managed by a grid layout.
     * @return the container rendering.
     */
    def KContainerRendering addSeparator(KContainerRendering container) {
        container.children += RENDERING_FACTORY.createKPolyline() => [
            it.setGridPlacementData(
                0,
                CLASS_NODE_PADDING,
                createKPosition(LEFT, 0, 0, TOP, 0, 0),
                createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
            it.points += createKPosition(LEFT, -CLASS_NODE_INSETS, 0, BOTTOM, 0, 0)
            it.points += createKPosition(RIGHT, -CLASS_NODE_INSETS, 0, BOTTOM, 0, 0)
            it.foreground = BORDER_COLOR.color
        ]
        
        return container
    }
    
    /**
     * Adds an arrow decorator suitable for associations to the given polyline.
     * 
     * @param pl the polyline to add the decorator to.
     * @return the given polyline.
     */
    def KRendering addAssociationArrowDecorator(KPolyline pl) {
        return pl => [
            it.addPolygon() => [
                it.points += createKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)
                it.points += createKPosition(RIGHT, 0, 0.5f, TOP, 0, 0)
                it.setDecoratorPlacementData(24, 12, -12, 1.0f, true)
                it.foreground = "black".color
            ]
            it.addPolygon() => [
                it.points += createKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)
                it.points += createKPosition(RIGHT, 0, 0.5f, BOTTOM, 0, 0)
                it.setDecoratorPlacementData(24, 12, -12, 1.0f, true)
                it.foreground = "black".color
            ]
        ]
    }
}
