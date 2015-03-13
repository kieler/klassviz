/*
 * KlassViz - Kieler Class Diagram Visualization
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
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
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.MapPropertyHolder
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.util.Maybe
import de.cau.cs.kieler.kiml.LayoutMetaDataService
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.EdgeType
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
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jdt.core.JavaModelException
import org.eclipse.jdt.core.Signature
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import java.util.Collections

/**
 * Synthesis of class diagrams using the Classdata meta model.
 */
final class ClassDataDiagramSynthesis extends AbstractDiagramSynthesis<KClassModel> {
    
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
    
    @Inject JdtModelTransformation jdtModelTransformation
    @Inject JavaReflectionTransformation javaReflectionTransformation
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Constants
    
    /** Space between the border of a class node and its content. */
    private static val CLASS_NODE_INSETS = 5
    /** Amount of space to be left between the elements of a class node. */
    private static val CLASS_NODE_PADDING = 5
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Synthesis Options
    
    private static val SynthesisOption GENERAL_SEPARATOR =
        SynthesisOption::createSeparator("General")
    
    private static val SynthesisOption COLOR_GRADIENT =
        SynthesisOption::createCheckOption("Color Gradient", true)
    private static val SynthesisOption USE_ICONS =
        SynthesisOption::createCheckOption("Icons", true)
    private static val SynthesisOption VISUALIZE_PACKAGES =
        SynthesisOption::createCheckOption("Package Hierarchy", false)
    
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
        SynthesisOption::createCheckOption("Private Attributes", false)
    private static val SynthesisOption ATTRIBUTES_TYPE =
        SynthesisOption::createCheckOption("Type", true)

    private static val SynthesisOption METHODS_SEPARATOR =
        SynthesisOption::createSeparator("Methods")
    private static val SynthesisOption METHODS_PRIVATE =
        SynthesisOption::createCheckOption("Private Methods", false)
    private static val SynthesisOption METHODS_TYPE =
        SynthesisOption::createCheckOption("Type", true)
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
        return ImmutableList::of(GENERAL_SEPARATOR, COLOR_GRADIENT, USE_ICONS, VISUALIZE_PACKAGES,
            VISUALIZE_ALL_OR_SELECTION, CLASSES_SEPARATOR, CLASSES_FQNAME, ATTRIBUTES_SEPARATOR,
            ATTRIBUTES_PRIVATE, ATTRIBUTES_TYPE, METHODS_SEPARATOR,
            METHODS_PRIVATE, METHODS_TYPE, METHODS_PARAMETERS, EDGES_SEPARATOR,
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
    
    /** The color of borders around nodes. */
    public static val OPTION_BORDER_COLOR = new Property("classdata.borderColor", "gray")
    /** The color used for edges. */
    public static val OPTION_EDGE_COLOR = new Property("classdata.edgeColor", "#404040")
    /** Start color of the background gradient for classes. */
    public static val OPTION_CLASS_COLOR1 = new Property("classdata.classColor1", "#f8f9fd")
    /** End color of the background gradient for classes. */
    public static val OPTION_CLASS_COLOR2 = new Property("classdata.classColor2", "#cddcf3")
    /** Start color of the background gradient for abstract classes. */
    public static val OPTION_ABSTRACT_CLASS_COLOR1 = new Property("classdata.abstractClassColor1", "#f8f9fd")
    /** End color of the background gradient for abstract classes. */
    public static val OPTION_ABSTRACT_CLASS_COLOR2 = new Property("classdata.abstractClassColor2", "#cddcf3")
    /** Start color of the background gradient for interfaces. */
    public static val OPTION_INTERFACE_COLOR1 = new Property("classdata.interfaceColor1", "#feffe8")
    /** End color of the background gradient for interfaces. */
    public static val OPTION_INTERFACE_COLOR2 = new Property("classdata.interfaceColor2", "#dadbb5")
    /** Start color of the background gradient for enumerations. */
    public static val OPTION_ENUM_COLOR1 = new Property("classdata.enumColor1", "#dfffea")
    /** End color of the background gradient for enumerations. */
    public static val OPTION_ENUM_COLOR2 = new Property("classdata.enumColor2", "#badfc6")
    /** Whether to draw shadows of classes and interfaces. */
    public static val OPTION_SHADOW = new Property("classdata.shadow", true)
    /** The font name used for all text labels. */
    public static val OPTION_FONT_NAME = new Property("classdata.fontName", KlighdConstants.DEFAULT_FONT_NAME)
    /** Whether to print names of method parameters. */
    public static val OPTION_METHOD_PARAM_NAMES = new Property("classdata.printMethodParameterNames", true)

    /** The synthesis options passed with the class model instance. */
    private val modelOptions = new MapPropertyHolder
    
    /**
     * Evaluate synthesis options and layout options stored in the given class model.
     */
    def private evaluateOptions(KClassModel classModel, KNode rootNode) {
        modelOptions.allProperties.clear
        for (option : classModel.options.filter[key != null && value != null]) {
            val property = getClass().fields.filter[
                it.isStatic && typeof(IProperty).isAssignableFrom(it.type)
            ].map[it.get(null) as IProperty<Object>].findFirst[it.id == option.key]
            
            if (property != null) {
                // Parse a synthesis option
                val value = switch (property.getDefault.class) {
                    case Integer: {
                        Integer.parseInt(option.value)
                    }
                    case Float: {
                        Float.parseFloat(option.value)
                    }
                    case Boolean: {
                        Boolean.parseBoolean(option.value)
                    }
                    default: {
                        option.value
                    }
                }
                modelOptions.setProperty(property, value)
            } else {
                // Parse a layout option
                val optionData = LayoutMetaDataService.instance.getOptionDataBySuffix(option.key)
                if (optionData != null) {
                    val value = optionData.parseValue(option.value)
                    if (value != null) {
                        rootNode.setLayoutOption(optionData, value)
                    }
                }
            }
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Transformation
    
    /**
     * Transforms a given selection of Java project elements into a class diagram.
     * 
     * @param model the model that captures the selection of Java project elements.
     * @return a KGraph that defines the class diagram.
     */
    override KNode transform(KClassModel input) {
        // If the model is not resolved yet, invoke the JDT and the Reflection resolvers
        val classModel =
            if (!input.resolved) {
                val m = EcoreUtil.copy(input)
                m.resolved = true
                try {
                    jdtModelTransformation.resolve(m)
                } catch (JavaModelException exception) {
                    // schade :-(
                }
                try {
                    javaReflectionTransformation.resolve(m)
                } catch (SecurityException exception) {
                    // schade :-(
                }
            } else input
        
        val classDiagramRoot = classModel.createNode().associateWith(classModel) => [ rootNode |
            // evaluate the options stored in the class model
            evaluateOptions(classModel, rootNode)
        
            // If packages should be visualized get all package nodes and create each package including
            // their contents
            if (VISUALIZE_PACKAGES.booleanValue) {
                rootNode.children += classModel.packages.map [
                    it.createPackageNode(classModel, rootNode)
                ]
            } else {
                // If not just create all class nodes including their contents
                val drawAllClasses = VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_ALL
                rootNode.children += classModel.packages.map [
                    it.types.filter[it.selected || drawAllClasses].map[it.createClassNode(classModel)]
                ].flatten
            }
            
            // Configure layout options
            rootNode.configureLayout
        ]

        classModel.packages.forEach [
            it.types.forEach [ type |
                // If inheritance shall be visualized, create all inheritance edges
                if (EDGES_INHERITANCE.booleanValue) {
                    if (type instanceof KClass) {
                        (type as KClass).createClassInheritanceEdge
                    }
                    type.createInterfaceInheritanceEdge
                }
                
                // If associations shall be visualized, create all association edges with their
                // multiplicities for each node
                if (EDGES_ASSOCIATION.booleanValue) {
                    type.createAssociationEdges(classModel)
                }
                
                // In any case, create the explicit dependency edges
                type.createDependencyEdges
            ]
        ]

        // Return the finished diagram
        return classDiagramRoot
    }
    
    /**
     * Creates a node that represents the given Java package and adds all classes in the package to
     * the package node.
     * 
     * @param kPackage the package to create a node for.
     * @param classModel the Java class model.
     * @param rootNode the root KNode instance
     * @return node representing the package, including all classes.
     */
    def private KNode createPackageNode(KPackage kPackage, KClassModel classModel, KNode rootNode) {
        return kPackage.createNode.associateWith(kPackage) => [ packageNode |
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
            // Copy the root node properties and then configure the layout
            packageNode.getData(typeof(KShapeLayout)).copyProperties(rootNode.getData(typeof(KShapeLayout)))
            packageNode.configureLayout
        ]
    }
    
    /**
     * Configure general layout options for a parent node (the root node or a package node).
     */
    def private configureLayout(KNode parentNode) {
        val parentLayout = parentNode.getData(typeof(KShapeLayout))
        parentLayout.setProperty(LayoutOptions.SPACING, 50f)
        if (parentLayout.getProperty(LayoutOptions.EDGE_ROUTING) == EdgeRouting.UNDEFINED) {
            parentLayout.setProperty(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
        }
        
        if (parentLayout.getProperty(LayoutOptions.ALGORITHM) == null) {
            // Layout depends on whether we have hierarchy (visualize packages) or not. If we have,
            // hierarchy, we use KLay Layered; otherwise, we use a planarization algorithm.
            if (VISUALIZE_PACKAGES.booleanValue) {
                parentLayout.setProperty(LayoutOptions.ALGORITHM, "de.cau.cs.kieler.klay.layered")
                parentLayout.setProperty(LayoutOptions.LAYOUT_HIERARCHY, true)
            } else {
                parentLayout.setProperty(LayoutOptions.ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization")
            }
        }
    }
    
    /**
     * Creates a node for the given class.
     * 
     * @param classData the class to create a node for.
     * @param classDataSelection Java elements selected by the user.
     * @return node representing the class.
     */
    def private KNode createClassNode(KType classData, KClassModel classModel) {
        return classData.createNode.associateWith(classData) => [
            it.addRoundedRectangle(5, 5) => [ rect |
                rect.foreground = modelOptions.getProperty(OPTION_BORDER_COLOR).color
                rect.configureBackground(classData)
                if (modelOptions.getProperty(OPTION_SHADOW)) {
                    rect.shadow = "black".color;
                    rect.shadow.XOffset = 4;
                    rect.shadow.YOffset = 4;
                }
                rect.setGridPlacement(1)
                    .from(LEFT, CLASS_NODE_INSETS, 0, TOP, CLASS_NODE_INSETS, 0)
                    .to(RIGHT, CLASS_NODE_INSETS, 0, BOTTOM, CLASS_NODE_INSETS, 0)
                
                // Add the main class information
                rect.addClassName(classData)
                
                // Create all fields that have no association-relation or have association relation but
                // associations shouldn't be visualized
                val List<Pair<KVisibility, String>> fields = new ArrayList(classData.fields.size)
                classData.fields.forEach [ eField |
                    // If the field will be visualized as a dependency, we don't need to process it
                    // at this point
                    if (!hasDependency(classData, classModel, eField).head
                        || !EDGES_ASSOCIATION.booleanValue) {

                        // If only private fields shall be added only add non private fields...
                        if (eField.visibility != KVisibility::PRIVATE
                                || ATTRIBUTES_PRIVATE.booleanValue) {
                            // If only selected fields shall be visualized only add selected fields
                            if (eField.selected
                                    || VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_ALL) {
                                fields.add(Pair.of(eField.visibility, eField.buildDisplayString))
                            }
                        }
                    }
                ]
                
                // Create all methods
                val List<Pair<KVisibility, String>> methods = new ArrayList(classData.methods.size)
                classData.methods.forEach [ eMethod |
                    // If only private methods shall be added only add non private methods...
                    if (eMethod.visibility != KVisibility::PRIVATE
                            || METHODS_PRIVATE.booleanValue) {
                        // if only selected methods shall be visualized only add selected methods
                        if (eMethod.selected
                                || VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_ALL) {
                            methods.add(Pair.of(eMethod.visibility, eMethod.buildDisplayString))
                        }
                    }
                ]
                
                // Add all fields
                if (!(fields.empty && methods.empty)) {
                    rect.addSeparator
                    
                    Collections.sort(fields, new PairComparator<KVisibility, String>)
                    fields.forEach [ field |
                        rect.addClassMember(field.key, field.value)
                    ]
                }
                
                // Add all methods
                if (!methods.empty) {
                    rect.addSeparator
                    
                    Collections.sort(methods, new PairComparator<KVisibility, String>)
                    methods.forEach [ method |
                        rect.addClassMember(method.key, method.value)
                    ]
                }
            ]
        ]
    }    
    
    // Check if field has an association-dependency.
    // A field has dependency when it's type equals one of the visualized classes
    // or a generic parameter type equals one of the visualized classes. 
    def private create fieldHasDependency : new Maybe<Boolean>(false)
            hasDependency(KType classData, KClassModel classModel, KField eField) {
        if (eField.type != null && eField.type.referenceType != null
                && eField.type.referenceType != classData) {
            fieldHasDependency.set(true)
            return
        } else if (eField.type == null || eField.type.signature == null) {
            return
        }
        val genericStart = eField.type.signature.indexOf('<')
        val fieldTypeFQN = if (genericStart < 0)
            eField.type.signature
            else eField.type.signature.substring(0, genericStart)
        if (Signature.getQualifier(fieldTypeFQN).equals("java.util")) {
            val referencedClazz = Class.forName(fieldTypeFQN)
            if (Collection.isAssignableFrom(referencedClazz)) {
                val genericOfCollection = Signature.getTypeErasure(eField.type.signature.substring(
                    genericStart + 1, eField.type.signature.lastIndexOf(">")).trim)
                fieldHasDependency.set(classModel.packages.exists [ pck |
                    pck.types.exists [ classDataToBeCompared |
                        genericOfCollection == classDataToBeCompared.name
                    ]
                ])
            } else if (Map.isAssignableFrom(referencedClazz)) {
                val separatedGenericsOfMap = Signature.getTypeArguments(
                        Signature.createTypeSignature(eField.type.signature, true)).map[
                    Signature.getTypeErasure(Signature.toString(it))
                ]
                fieldHasDependency.set(classModel.packages.exists [ pck |
                    pck.types.exists [ classDataToBeCompared |
                        separatedGenericsOfMap.exists [
                           it == classDataToBeCompared.name
                        ]
                    ]
                ])
            }
        }
    }

    // For each class visualize all relationships to super classes that are visualized.
    def private createClassInheritanceEdge(KClass classData) {
        if (classData.superClass != null && classData.superClass.selected) {
            createEdge.associateWith(classData) => [
                it.source = classData.node
                it.target = classData.superClass.node
                it.addPolyline().associateWith(classData) => [
                    it.addInheritanceTriangleArrowDecorator() => [
                        it.foreground = modelOptions.getProperty(OPTION_EDGE_COLOR).color
                    ]
                    it.foreground = modelOptions.getProperty(OPTION_EDGE_COLOR).color
                ]
                it.setLayoutOption(LayoutOptions::EDGE_TYPE, EdgeType::GENERALIZATION)
            ]
        }
    }

    // For each class visualize all relationships to super interfaces that are visualized.
    def private createInterfaceInheritanceEdge(KType classData) {
        (if (classData instanceof KClass)
            (classData as KClass).interfaces
        else if (classData instanceof KInterface)
            (classData as KInterface).superInterfaces
        )?.filter[it.selected]?.forEach [ kInterface |
            createEdge.associateWith(classData) => [
                it.source = classData.node
                it.target = kInterface.node
                it.addPolyline().associateWith(classData) => [
                    if (classData instanceof KInterface) {
                        // if interface has super interface the line is solid.
                        it.lineStyle = LineStyle::SOLID
                    } else {
                        // if class has super interface the line is dashed.
                        it.lineStyle = LineStyle::DASH
                    }
                    it.addInheritanceTriangleArrowDecorator() => [
                        it.foreground = modelOptions.getProperty(OPTION_EDGE_COLOR).color
                    ]
                    it.foreground = modelOptions.getProperty(OPTION_EDGE_COLOR).color
                ]
                it.setLayoutOption(LayoutOptions::EDGE_TYPE, EdgeType::GENERALIZATION)
            ]
        ]
    }

    // For each field in each class add their associations if there are any. Also add the multiplicities.
    def private createAssociationEdges(KType classData, KClassModel classModel) {
        classModel.packages.forEach [
            it.types.filter[it != classData].forEach [ classDataToBeCompared |
                val lowerBound = new Maybe(0)
                val upperBound = new Maybe(0)
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
                            val genericOfCollection = Signature.getTypeErasure(
                                eField.type.signature.substring(genericStart + 1,
                                eField.type.signature.lastIndexOf(">")).trim)
                            if (genericOfCollection == classDataToBeCompared.name) {

                                // If the field's generic parameter type is the checked class, 
                                // set the upper bound of the multiplicity to infinity (-1).
                                upperBound.set(-1)
                            }
                        } else if (Map.isAssignableFrom(referencedClazz)) {
                            val separatedGenericsOfMap = Signature.getTypeArguments(
                                    Signature.createTypeSignature(eField.type.signature, true)).map[
                                Signature.getTypeErasure(Signature.toString(it))
                            ]
                            separatedGenericsOfMap.forEach [
                                if (it == classDataToBeCompared.name) {

                                    // If the field's generic parameter type is the checked class, 
                                    // set the upper bound of the multiplicity to infinity (-1).
                                    upperBound.set(-1)
                                }
                            ]
                        }
                    }
                    if (eField.type.referenceType == classDataToBeCompared) {

                        // If the field's type is the checked class, 
                        // increment the upper bound of the multiplicity.
                        if (upperBound.get >= 0) {
                            upperBound.set(upperBound.get + 1)
                        }
                        // If the field is final, increment the lower bound, too.
                        if (eField.isFinal) {
                            lowerBound.set(lowerBound.get + 1)
                        }
                    }
                ]
                if (lowerBound.get != 0 || upperBound.get != 0) {
    
                    // TODO: Self-associations not supported yet.
                    if (!(classData.node == classDataToBeCompared.node)) {
    
                        // Add an edge labeled with the multiplicities.
                        createEdge.associateWith(classData) => [
                            it.source = classData.node
                            it.target = classDataToBeCompared.node
                            it.addPolyline().associateWith(classData) => [
                                it.addAssociationArrowDecorator
                                it.foreground = modelOptions.getProperty(OPTION_EDGE_COLOR).color
                            ]
                            val multiplicity =
                                if (upperBound.get < 0) {
                                    Integer.toString(lowerBound.get) + "..*"
                                } else if (lowerBound.get == upperBound.get) {
                                    Integer.toString(lowerBound.get)
                                } else {
                                    Integer.toString(lowerBound.get) + ".." + Integer.toString(upperBound.get)
                                }
                            it.createLabel.configureHeadEdgeLabel(multiplicity, KlighdConstants::DEFAULT_FONT_SIZE,
                                modelOptions.getProperty(OPTION_FONT_NAME)).associateWith(classData)
                            it.setLayoutOption(LayoutOptions::EDGE_TYPE, EdgeType::ASSOCIATION)
                        ]
                    }
                }
            ]
        ]
    }

    // Visualize the explicit dependencies in the model.
    def private createDependencyEdges(KType classData) {
        for (dependency : classData.dependencies) {
            createEdge.associateWith(dependency) => [
                it.source = classData.node
                it.target = dependency.target.node
                it.addPolyline().associateWith(dependency) => [
                    it.lineStyle = LineStyle::DASH
                    it.addAssociationArrowDecorator
                    it.foreground = modelOptions.getProperty(OPTION_EDGE_COLOR).color
                ]
                it.createLabel.configureCenterEdgeLabel(dependency.label, KlighdConstants::DEFAULT_FONT_SIZE,
                                modelOptions.getProperty(OPTION_FONT_NAME)).associateWith(dependency)
                it.setLayoutOption(LayoutOptions::EDGE_TYPE, EdgeType::DEPENDENCY)
            ]
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    // Class Diagram Utility Methods
    
    /**
     * Returns a displayable string for the given method. What kinds of information are included in the
     * string depends on the synthesis options.
     * 
     * @param method the method whose display string to build.
     */
    def private String buildDisplayString(KMethod method) {
        // Method parameters
        val parameters = newLinkedList();
        if (METHODS_PARAMETERS.booleanValue) {
            method.parameters.forEach [ parameter |
                if (modelOptions.getProperty(OPTION_METHOD_PARAM_NAMES) && parameter.name != null) {
                    if (METHODS_TYPE.booleanValue) {
                        parameters += parameter.name + " : " + Signature.getSimpleName(parameter.signature)
                    } else {
                        parameters += parameter.name
                    }
                } else {
                    parameters += Signature.getSimpleName(parameter.signature)
                }
            ]
        }
        
        // Return type
        val String methodReturnType =
            if (METHODS_TYPE.booleanValue && method.returnType.signature != null) {
                " : " + Signature.getSimpleName(method.returnType.signature)
            } else {
                ""
            }
        
        // Build the actual display string
        if (METHODS_PARAMETERS.booleanValue) {
            return method.name
                + " (" + Joiner.on(", ").join(parameters) + ")"
                + methodReturnType
        } else {
            return method.name + methodReturnType
        }
    }

    /**
     * Returns a displayable string for the given field. What kinds of information are included in
     * the string depends on the synthesis options.
     * 
     * @param field the field whose display string to build.
     */
    def private String buildDisplayString(KField field) {
        val String fieldType = 
            if (ATTRIBUTES_TYPE.booleanValue && field.type != null && field.type.signature != null
                && !(field.eContainer instanceof KEnum && field.type.referenceType == field.eContainer)) {
                " : " + Signature.getSimpleName(field.type.signature)
            } else {
                ""
            }
        return field.name + fieldType
    }

    /**
     * Configures the background of the rendering that represents the given class.
     * 
     * @param rendering the rendering whose background to configure.
     * @param classData the corresponding class.
     */
    def private void configureBackground(KRendering rendering, KType classData) {
        var String color1
        var String color2
        if (classData instanceof KClass) {
            if ((classData as KClass).abstract) {
                color1 = modelOptions.getProperty(OPTION_ABSTRACT_CLASS_COLOR1)
                color2 = modelOptions.getProperty(OPTION_ABSTRACT_CLASS_COLOR2)
            } else {
                color1 = modelOptions.getProperty(OPTION_CLASS_COLOR1)
                color2 = modelOptions.getProperty(OPTION_CLASS_COLOR2)
            }
        } else if (classData instanceof KInterface) {
            color1 = modelOptions.getProperty(OPTION_INTERFACE_COLOR1)
            color2 = modelOptions.getProperty(OPTION_INTERFACE_COLOR2)
        } else if (classData instanceof KEnum) {
            color1 = modelOptions.getProperty(OPTION_ENUM_COLOR1)
            color2 = modelOptions.getProperty(OPTION_ENUM_COLOR2)
        }
        
        // Check if we should use gradients or not
        if (COLOR_GRADIENT.booleanValue && color1 != color2) {
            rendering.setBackgroundGradient(color1.color, color2.color, 90)
        } else {
            rendering.setBackground(color2.color)
        }
    }
    
    /**
     * Adds a label to the container with the given content, formatted as a class modifier.
     * 
     * @param container the container to add the label to.
     * @param classData information on the class.
     * @return the rendering.
     */
    def private KRendering addTypeIndicator(KContainerRendering container, KType classData) {
        if (USE_ICONS.booleanValue) {
            val iconName =
                if (classData instanceof KInterface) {
                    "interface.gif"
                } else if (classData instanceof KEnum) {
                    "enum.gif"
                } else {
                    "class.gif"
                }
            
            return container.addImage("de.cau.cs.kieler.klassviz", "icons/" + iconName)
        } else {
            val modifierString =
                if (classData instanceof KInterface) {
                    "Interface"
                } else if (classData instanceof KEnum) {
                    "Enumeration"
                } else if (classData instanceof KClass && (classData as KClass).abstract) {
                    "Abstract"
                } else {
                    null
                }
            
            if (modifierString != null) {
                return container.addText("<<" + modifierString + ">>") => [ text |
                    text.fontName = modelOptions.getProperty(OPTION_FONT_NAME)
                ]
            }
        }
        
        return null
    }
    
    /**
     * Adds a label to the container with the given content, formatted as a class name.
     * 
     * @param container the container to add the class information to.
     * @param classData information about the class.
     */
    def private addClassName(KContainerRendering container, KType classData) {
        // Extract the class name we'll be using
        val className =
            if (CLASSES_FQNAME.booleanValue) {
                classData.qualifiedName
            } else {
                classData.name
            }
        
        // Check if the class is abstract
        val isAbstract = (classData instanceof KInterface)
            || (classData instanceof KClass && (classData as KClass).abstract)
        
        // Depending on if we will use icons or not, the rendering changes
        if (USE_ICONS.booleanValue) {
            // We need two rectangles: one that represents the grid layout cell...
            val cell = container.addRectangle() => [
                it.invisible = true
                it.setGridPlacementData(
                    0,
                    0,
                    createKPosition(LEFT, 0, 0, TOP, 0, 0),
                    createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
            ]
            
            // ...and a second one that servers as a free-floating, centrally-aligned container
            val actualContainer = cell.addRectangle() => [
                it.invisible = true
                it.setPointPlacementData(
                    LEFT, 0, 0.5f,
                    TOP, 0, 0.5f,
                    H_CENTRAL, V_CENTRAL,
                    0, 0, 0, 0)
            ]
            
            // Type indicator
            actualContainer.addTypeIndicator(classData) => [ icon |
                icon.setPointPlacementData(
                    LEFT, 10, 0,
                    TOP, 0, 0.5f,
                    H_CENTRAL, V_CENTRAL,
                    0, 0, 16, 16)
            ]
            
            // Class name
            actualContainer.addText(className) => [ text |
                text.fontName = modelOptions.getProperty(OPTION_FONT_NAME)
                text.fontSize = KlighdConstants.DEFAULT_FONT_SIZE + 2
                text.fontBold = true
                text.fontItalic = isAbstract
                text.setPointPlacementData(
                    LEFT, 25, 0,
                    TOP, 0, 0.5f,
                    H_LEFT, V_CENTRAL,
                    0, 0, 0, 0)
            ]
        } else {
            // Type indicator
            container.addTypeIndicator(classData)
            
            // Class name
            container.addText(className) => [ text |
                text.fontName = modelOptions.getProperty(OPTION_FONT_NAME)
                text.fontSize = KlighdConstants.DEFAULT_FONT_SIZE + 2
                text.fontBold = true
                text.fontItalic = isAbstract
                text.setGridPlacementData(
                    0,
                    0,
                    createKPosition(LEFT, 0, 0, TOP, 0, 0),
                    createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
            ]
        }
    }
    
    /**
     * Adds a label to the container with the given content, formatted as a class member. Class members
     * are fields or methods.
     * 
     * @param container the container to add the label to.
     * @param visibility the member's visibility.
     * @param name text for the label.
     * @return the container.
     */
    def private KContainerRendering addClassMember(KContainerRendering container, KVisibility visibility,
        String name) {
        
        // Add an invisible rectangle that will contain our visibility indicator and the member name
        val actualContainer = container.addRectangle() => [
                it.invisible = true
                it.setGridPlacementData(
                    0,
                    0,
                    createKPosition(LEFT, 0, 0, TOP, 2, 0),
                    createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
            ]
        
        actualContainer.addVisibilityIndicator(visibility) => [ indicator |
            indicator.setPointPlacementData(
                LEFT, 8, 0,
                TOP, 0, 0.5f,
                H_CENTRAL, V_CENTRAL,
                0, 0, 16, 16)
        ]
        
        actualContainer.addText(name) => [ text |
            text.fontName = modelOptions.getProperty(OPTION_FONT_NAME)
            text.setPointPlacementData(
                LEFT, 20, 0,
                TOP, 0, 0.5f,
                H_LEFT, V_CENTRAL,
                0, 0, 0, 0)
        ]
        
        return container
    }
    
    /**
     * Turns the given visibility type into a proper visibility modification rendering.
     * 
     * @param container the container the KRendering is added to.
     * @param visibility the visibility type.
     * @return visibility modification rendering.
     */
    def private KRendering addVisibilityIndicator(KContainerRendering container, KVisibility visibility) {
        if (USE_ICONS.booleanValue) {
            val iconName = switch (visibility) {
                case KVisibility::PRIVATE:
                    "private.gif"
                case KVisibility::PUBLIC:
                    "public.gif"
                case KVisibility::PROTECTED:
                    "protected.gif"
                default:
                    "default.gif"
                }
            
            return container.addImage("de.cau.cs.kieler.klassviz", "icons/" + iconName)
        } else {
            val visibilityString = switch (visibility) {
                case KVisibility::PRIVATE:
                    "\u2212"
                case KVisibility::PUBLIC:
                    "+"
                case KVisibility::PROTECTED:
                    "#"
                default:
                    ""
                }
            
            return container.addText(visibilityString) => [ text |
                text.fontName = modelOptions.getProperty(OPTION_FONT_NAME)
            ]
        }
    }

    /**
     * Adds a simple horizontal line that can be used for whatever simple horizontal lines are used
     * for. Separators in class nodes, for instance.
     * 
     * @param container the container to add the line to, managed by a grid layout.
     * @return the container rendering.
     */
    def private KContainerRendering addSeparator(KContainerRendering container) {
        container.children += RENDERING_FACTORY.createKPolyline() => [
            it.setGridPlacementData(
                0,
                CLASS_NODE_PADDING,
                createKPosition(LEFT, 0, 0, TOP, 0, 0),
                createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0))
            it.points += createKPosition(LEFT, -CLASS_NODE_INSETS, 0, BOTTOM, 0, 0)
            it.points += createKPosition(RIGHT, -CLASS_NODE_INSETS, 0, BOTTOM, 0, 0)
            it.foreground = modelOptions.getProperty(OPTION_BORDER_COLOR).color
        ]
        
        return container
    }
    
    /**
     * Adds an arrow decorator suitable for associations to the given polyline.
     * 
     * @param pl the polyline to add the decorator to.
     * @return the given polyline.
     */
    def private KRendering addAssociationArrowDecorator(KPolyline pl) {
        pl.addPolyline() => [
            it.points += createKPosition(LEFT, 0, 0, TOP, 0, 0)
            it.points += createKPosition(RIGHT, 0, 0, TOP, 0, 0.5f)
            it.points += createKPosition(LEFT, 0, 0, BOTTOM, 0, 0)
            it.setDecoratorPlacementData(12, 12, -6, 1.0f, true)
            it.foreground = modelOptions.getProperty(OPTION_EDGE_COLOR).color
        ]
    }
    
}
