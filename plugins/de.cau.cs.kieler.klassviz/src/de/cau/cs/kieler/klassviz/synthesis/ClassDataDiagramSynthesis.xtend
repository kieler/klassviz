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
import com.google.inject.Inject
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
import de.cau.cs.kieler.core.util.Maybe
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klassviz.model.classdata.KClass
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KEnum
import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KInterface
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KPackage
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.model.classdata.KVisibility
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.ArrayList
import java.util.Collection
import java.util.List
import java.util.Map
import org.eclipse.jdt.core.Signature

/**
 * Synthesis of class diagrams using the Classdata meta model.
 * 
 * @author ems
 */
class ClassDataDiagramSynthesis extends AbstractDiagramSynthesis<KClassModel> {
    
    public static val SYNTHESIS_ID = "de.cau.cs.kieler.klassviz.ClassDataDiagramSynthesis"
    
    // Various extensions that make it easier to generate a KGraph
    @Inject extension ClassDataExtensions
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
    override KNode transform(KClassModel model) {
        val classDiagramRoot = model.createNode().putToLookUpWith(model) => [ rootNode |
            // If packages should be visualized get all package nodes and create each package including
            // their contents
            if (VISUALIZE_PACKAGES.booleanValue) {
                rootNode.children += model.packages.map [
                    it.createPackageNode(model)
                ]
            } else {
                // If not just create all class nodes including their contents
                val drawAllClasses = VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_ALL
                rootNode.children += model.packages.map [
                    it.types.filter[it.selected || drawAllClasses].map[it.createClassNode(model)]
                ].flatten
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

        // If associations shall be visualized, create all association edges with their multiplicities
        // for each node
        if (EDGES_ASSOCIATION.booleanValue) {
            model.packages.forEach [
                it.types.forEach [
                    it.createAssociationEdges(model)
                ]
            ]
        }

        // Return the finished diagram
        return classDiagramRoot
    }
    
    /**
     * Creates a node that represents the given Java package and adds all classes in the package to
     * the package node.
     * 
     * @param kPackage the package to create a node for.
     * @param classModel the Java class model.
     * @return node representing the package, including all classes.
     */
    def KNode createPackageNode(KPackage kPackage, KClassModel classModel) {
        return kPackage.createNode.putToLookUpWith(kPackage) => [ packageNode |
            // Add a gray rectangle for each package
            packageNode.addRectangle => [ rect |
                // If Layout shall be with gradient use gradient, else not
                if (COLOR_GRADIENT.booleanValue) {
                    rect.setBackgroundGradient("gray".color, "white".color, 90)
                } else {
                    rect.setBackground("gray".color)
                }
                
                // For each type create a class node in this package if it is related to it.
                val drawAllClasses = VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_ALL
                packageNode.children += kPackage.types.filter[it.selected || drawAllClasses].map[ classSelection |
                    classSelection.createClassNode(classModel)
                ]
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
    def KNode createClassNode(KType classData, KClassModel classModel) {
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
                if (classData instanceof KInterface) {
                    rect.addClassModifier("Interface")
                    isAbstract = true
                } else if (classData instanceof KEnum) {
                    rect.addClassModifier("Enumeration")
                } else if (classData instanceof KClass && (classData as KClass).abstract) {
                    rect.addClassModifier("Abstract")
                    isAbstract = true
                }
                
                // Add the class name
                if (CLASSES_FQNAME.booleanValue) {
                    rect.addClassName(classData.qualifiedName, isAbstract)
                } else {
                    rect.addClassName(classData.name, isAbstract)
                }
                
                // Add all fields that have no association-relation or have association relation but
                // associations shouldn't be visualized
                val List<String> fields = new ArrayList(classData.fields.size)
                classData.fields.forEach [ eField |
                    // If the field will be visualized as a dependency, we don't need to process it
                    // at this point
                    if (!hasDependency(classData, classModel, eField).get(0)
                        || !EDGES_ASSOCIATION.booleanValue) {

                        // If only private fields shall be added only add non private fields...
                        if (eField.visibility != KVisibility::PRIVATE
                                || ATTRIBUTES_PRIVATE.booleanValue) {
                            // If only selected fields shall be visualized only add selected fields
                            if (eField.selected
                                    || VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_ALL) {
                                fields.add(eField.buildDisplayString)
                            }
                        }
                    }
                ]
                
                // Add all methods
                val List<String> methods = new ArrayList(classData.methods.size)
                classData.methods.forEach [ eMethod |
                    // If only private methods shall be added only add non private methods...
                    if (eMethod.visibility != KVisibility::PRIVATE
                            || METHODS_PRIVATE.booleanValue) {
                        // if only selected methods shall be visualized only add selected methods
                        if (eMethod.selected
                                || VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_ALL) {
                            methods.add(eMethod.buildDisplayString)
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
    
    def void createInheritanceEdges(KClassModel classModel) {
        classModel.packages.forEach [
            it.types.forEach [ typeSelection |
                if (typeSelection instanceof KClass) {
                    (typeSelection as KClass).createClassInheritanceEdge(classModel)
                }
                typeSelection.createInterfaceInheritanceEdge(classModel)
            ]
        ]
    }
    
    
    // Check if field has an association-dependency.
    // A field has dependency when it's type equals one of the visualized classes
    // or a generic parameter type equals one of the visualized classes. 
    def Maybe<Boolean> create fieldHasDependency : new Maybe<Boolean>(false)
            hasDependency(KType classData, KClassModel classModel, KField eField) {
        val genericStart = eField.type.signature.indexOf('<')
        val fieldTypeFQN = if (genericStart < 0)
            eField.type.signature
            else eField.type.signature.substring(0, genericStart)
        if (Signature.getQualifier(fieldTypeFQN).equals("java.util")) {
            val referencedClazz = Class.forName(fieldTypeFQN)
            if (Collection.isAssignableFrom(referencedClazz)) {
                val genericOfCollection = eField.type.signature.substring(genericStart + 1,
                    eField.type.signature.lastIndexOf(">")).trim
                fieldHasDependency.set(classModel.packages.exists [ pck |
                    pck.types.exists [ classDataToBeCompared |
                        genericOfCollection == classDataToBeCompared.name
                    ]
                ])
            } else if (Map.isAssignableFrom(referencedClazz)) {
                var String genericsOfMap = eField.type.signature.substring(genericStart + 1,
                    eField.type.signature.lastIndexOf(">"))
                val separatedGenericsOfMap = genericsOfMap.split(",")
                fieldHasDependency.set(classModel.packages.exists [ pck |
                    pck.types.exists [ classDataToBeCompared |
                        separatedGenericsOfMap.exists [
                           it.trim == classDataToBeCompared.name
                        ]
                    ]
                ])
            }
        } else {
            fieldHasDependency.set(classModel.packages.exists [ pck |
                pck.types.exists [ classDataToBeCompared |
                    fieldTypeFQN == classDataToBeCompared.name
                    || fieldTypeFQN == classDataToBeCompared.qualifiedName
                ]
            ])
        }
    }

    // For each class visualize all relationships to super classes that are visualized.
    def createClassInheritanceEdge(KClass classData, KClassModel classModel) {
        if (classData.superClass != null && classData.superClass.selected) {
            createEdge.putToLookUpWith(classData) => [
                it.source = classData.node
                it.target = classData.superClass.node
                it.addPolyline().putToLookUpWith(classData) => [
                    it.addInheritanceTriangleArrowDecorator()
                    it.foreground = EDGE_COLOR.color
                ]
            
            ]
        }
    }

    // For each class visualize all relationships to super interfaces that are visualized.
    def createInterfaceInheritanceEdge(KType classData, KClassModel classModel) {
        (if (classData instanceof KClass)
            (classData as KClass).interfaces
        else if (classData instanceof KInterface)
            (classData as KInterface).superInterfaces
        ).filter[it.selected].forEach [ kInterface |
            createEdge.putToLookUpWith(classData) => [
                it.source = classData.node
                it.target = kInterface.node
                it.addPolyline().putToLookUpWith(classData) => [
                    if (classData instanceof KInterface) {
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
        ]
    }

    // For each field in each class add their associations if there are any. Also add the multiplicities.
    def createAssociationEdges(KType classData, KClassModel classModel) {
        classModel.packages.forEach [
            it.types.forEach [ classDataToBeCompared |
                val int[] classHasAssociationToThisClass = #[0, 0]
                classData.fields.forEach [ eField |
                    // Don't check again if the field has no association relation anyways.
                    if (!hasDependency(classData, classModel, eField).get()) {
                        return
                    }
                    val genericStart = eField.type.signature.indexOf('<')
                    val fieldTypeFQN = if (genericStart < 0)
                        eField.type.signature
                        else eField.type.signature.substring(0, genericStart)
                    if (Signature.getQualifier(fieldTypeFQN).equals("java.util")) {
                        val referencedClazz = Class.forName(fieldTypeFQN)
                        if (Collection.isAssignableFrom(referencedClazz)) {
                            val genericOfCollection = eField.type.signature.substring(genericStart + 1,
                                eField.type.signature.lastIndexOf(">")).trim
                            if (genericOfCollection == classDataToBeCompared.name) {

                                // If the field's generic parameter type is the checked class, 
                                // set the upper bound of the multiplicity to infinity (-1).
                                classHasAssociationToThisClass.set(1, -1)
                            }
                        } else if (Map.isAssignableFrom(referencedClazz)) {
                            var String genericsOfMap = eField.type.signature.substring(genericStart + 1,
                                eField.type.signature.lastIndexOf(">"))
                            val separatedGenericsOfMap = genericsOfMap.split(",")
                            separatedGenericsOfMap.forEach [
                                if (it.trim == classDataToBeCompared.name) {

                                    // If the field's generic parameter type is the checked class, 
                                    // set the upper bound of the multiplicity to infinity (-1).
                                    classHasAssociationToThisClass.set(1, -1)
                                }
                            ]
                        }
                    }
                    if (fieldTypeFQN == classDataToBeCompared.qualifiedName) {

                        // If the field's type is the checked class, 
                        // set the increment the lower bound of the multiplicity.
                        classHasAssociationToThisClass.set(0, classHasAssociationToThisClass.get(0).intValue + 1)
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
//                            if (classHasAssociationToThisClass.get(1).intValue == -1) {
//                                multiplicity = Integer.toString(classHasAssociationToThisClass.get(0)) + "..*"
//                            } else {
//                                multiplicity = Integer.toString(classHasAssociationToThisClass.get(0))
//                            }
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
    def String buildDisplayString(KMethod method) {
        // Visibility modifier
        val String visibility =
            if (METHODS_VISIBILITY.booleanValue) {
                method.visibility.visibilityString
            } else {
                ""
            }
        
        // Method parameters
        val parameters = newLinkedList();
        if (METHODS_PARAMETERS.booleanValue) {
            method.parameters.forEach [ parameter |
                if (METHODS_TYPE.booleanValue) {
                    parameters += parameter.name + " : " + Signature.getSimpleName(parameter.signature)
                } else {
                    parameters += parameter.name
                }
            ]
        }
        
        // Return type
        val String methodReturnType =
            if (METHODS_TYPE.booleanValue) {
                " : " + Signature.getSimpleName(method.returnType.signature)
            } else {
                ""
            }
        
        // Build the actual display string
        if (METHODS_PARAMETERS.booleanValue) {
            return visibility
                + method.name
                + " (" + Joiner.on(", ").join(parameters) + ")"
                + methodReturnType
        } else {
            return visibility + method.name + methodReturnType
        }
    }

    /**
     * Returns a displayable string for the given field. What kinds of information are included in
     * the string depends on the synthesis options.
     * 
     * @param field the field whose display string to build.
     */
    def String buildDisplayString(KField field) {
        var String fieldType = ""
        var String visibility = ""
        if (ATTRIBUTES_VISIBILITY.booleanValue) {
            visibility = field.visibility.visibilityString
        }

        if (ATTRIBUTES_TYPE.booleanValue) {
            fieldType = " : " + Signature.getSimpleName(field.type.signature)
        }
        return visibility + field.name + fieldType
    }
    
    /**
     * Turns the given visibility type into a proper visibility modifier.
     * 
     * @param visibility the visibility type.
     * @return UML visibility modifier.
     */
    def getVisibilityString(KVisibility visibility) {
        switch (visibility) {
        case KVisibility::PRIVATE:
            return "\u2212"
        case KVisibility::PUBLIC:
            return "+"
        case KVisibility::PROTECTED:
            return "#"
        default:
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
            if (classData instanceof KClass) {
                if ((classData as KClass).abstract) {
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
            } else if (classData instanceof KInterface) {
                rendering.setBackgroundGradient(
                    INTERFACE_BACKGROUND_1.color,
                    INTERFACE_BACKGROUND_2.color,
                    90)
            } else if (classData instanceof KEnum) {
                rendering.setBackgroundGradient(
                    ENUM_BACKGROUND_1.color,
                    ENUM_BACKGROUND_2.color,
                    90)
            }
        } else {
            if (classData instanceof KClass) {
                if ((classData as KClass).abstract) {
                    rendering.setBackground(ABSTRACT_CLASS_BACKGROUND_2.color)
                } else {
                    rendering.setBackground(CLASS_BACKGROUND_2.color)
                }
            } else if (classData instanceof KInterface) {
                rendering.setBackground(INTERFACE_BACKGROUND_2.color)
            } else if (classData instanceof KEnum) {
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
