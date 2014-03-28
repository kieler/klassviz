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
import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
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
import de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.model.classdata.KField

/**
 * Synthesis of class diagrams using the Classdata meta model.
 * 
 * @author ems
 */
class ClassDataDiagramSynthesis extends AbstractDiagramSynthesis<KTypeSelection> {
    
    public static val SYNTHESIS_ID = "de.cau.cs.kieler.klassviz.ClassDataDiagramSynthesis"

	@Inject
	extension KNodeExtensions

	@Inject
	extension KEdgeExtensions

	@Inject
	extension KPortExtensions

	@Inject
	extension KLabelExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KContainerRenderingExtensions

	@Inject
	extension KPolylineExtensions

	@Inject
	extension KColorExtensions

	private static val SynthesisOption GENERAL_SEPARATOR = SynthesisOption::createSeparator("General")
	private static val SynthesisOption COLOR_GRADIENT = SynthesisOption::createCheckOption("Use Color Gradient", true)
	private static val SynthesisOption VISUALIZE_PACKAGES = SynthesisOption::createCheckOption("Show Packagehierarchy",
		false)
	private static val VISUALIZE_SELECTION = "Visualize Selection"
	private static val VISUALIZE_ALL = "Visualize All"
	private static val SynthesisOption VISUALIZE_ALL_OR_SELECTION = SynthesisOption::createChoiceOption(
		"Visualization of Attributes/Methods", ImmutableList::of(VISUALIZE_SELECTION, VISUALIZE_ALL),
		VISUALIZE_SELECTION)

	private static val SynthesisOption CLASSES_SEPARATOR = SynthesisOption::createSeparator("Classes")
	private static val SynthesisOption CLASSES_FQNAME = SynthesisOption::createCheckOption("Fully Qualified Name", false)

	private static val SynthesisOption ATTRIBUTES_SEPARATOR = SynthesisOption::createSeparator("Attributes")
	private static val SynthesisOption ATTRIBUTES_PRIVATE = SynthesisOption::createCheckOption("Private Attributes",
		true)
	private static val SynthesisOption ATTRIBUTES_TYPE = SynthesisOption::createCheckOption("Type", true)
	private static val SynthesisOption ATTRIBUTES_VISIBILITY = SynthesisOption::createCheckOption("Show Visibility",
		true)

	private static val SynthesisOption METHODS_SEPARATOR = SynthesisOption::createSeparator("Methods")
	private static val SynthesisOption METHODS_PRIVATE = SynthesisOption::createCheckOption("Private Methods", true)
	private static val SynthesisOption METHODS_TYPE = SynthesisOption::createCheckOption("Type", true)
	private static val SynthesisOption METHODS_VISIBILITY = SynthesisOption::createCheckOption("Show Visibility", true)
	private static val SynthesisOption METHODS_PARAMETERS = SynthesisOption::createCheckOption("Parameters", true)

	private static val SynthesisOption EDGES_SEPARATOR = SynthesisOption::createSeparator("Edges")
	private static val SynthesisOption EDGES_INHERITANCE = SynthesisOption::createCheckOption("Inheritance", true)
	private static val SynthesisOption EDGES_ASSOCIATION = SynthesisOption::createCheckOption("Associations", true)

	override public getDisplayedSynthesisOptions() {
		return ImmutableList::of(GENERAL_SEPARATOR, COLOR_GRADIENT, VISUALIZE_PACKAGES, VISUALIZE_ALL_OR_SELECTION,
			CLASSES_SEPARATOR, CLASSES_FQNAME, ATTRIBUTES_SEPARATOR, ATTRIBUTES_PRIVATE, ATTRIBUTES_TYPE,
			ATTRIBUTES_VISIBILITY, METHODS_SEPARATOR, METHODS_PRIVATE, METHODS_TYPE, METHODS_VISIBILITY,
			METHODS_PARAMETERS, EDGES_SEPARATOR, EDGES_INHERITANCE, EDGES_ASSOCIATION)
	}

	override public getDisplayedLayoutOptions() {
		return ImmutableList::of(
			specifyLayoutOption(LayoutOptions::DIRECTION, Direction::values().drop(1).sortBy[it.name]),
			specifyLayoutOption(LayoutOptions::SPACING, newArrayList(0, 255))
		);
	}

	// Transform ClassDataSelection model to diagram.
	override KNode transform(KTypeSelection model) {
		val classDiagramRoot = model.createNode().putToLookUpWith(model) => [
			var List<IPackageFragment> packageFragments
			// If packages should be visualized get all package nodes and 
			// create each package including their contents.
			if (VISUALIZE_PACKAGES.booleanValue) {
				packageFragments = model.types.map [
					it.type.packageFragment
				]
				it.children += packageFragments.map [
					it.createPackageNode(model)
				]
			} else {

				// If not just create all class nodes including their contents
				it.children += model.types.map [
					it.createClassNode(model)
				].filterNull
			}
			it.setLayoutOption(LayoutOptions.SPACING, 50f)
			// Layout depends if we have hierarchy (visualize packages) or not.
			// If we have hierarchy use 'klay.layered'-algorithm with hierarchy.
			// If we have no hierarchy use planarization-algorithm.
			if (VISUALIZE_PACKAGES.booleanValue) {
				it.setLayoutOption(LayoutOptions.ALGORITHM, "de.cau.cs.kieler.klay.layered")
				it.setLayoutOption(LayoutOptions.LAYOUT_HIERARCHY, true)
			} else {
				it.setLayoutOption(LayoutOptions.ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization")
			}
			// Edges shall be orthogonal.
			it.setLayoutOption(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
		]

		// If inheritance shall be visualized, create all inheritance edges.
		if (EDGES_INHERITANCE.booleanValue) {
			model.createInheritanceEdges
		}

		// If associations shall be visualized, create all association edges with there multiplicities for each node.
		if (EDGES_ASSOCIATION.booleanValue) {
			model.types.forEach [
				it.createAssociationEdges(model)
			]
		}

		// Return the finished diagram.
		return classDiagramRoot;
	}

	// Create a node for each package. And add the content.
	def KNode createPackageNode(IPackageFragment fragment, KTypeSelection classDataSelection) {
		return fragment.createNode.putToLookUpWith(fragment) => [ packageNode |
			// Add a gray rectangle for each package
			packageNode.addRectangle => [ rect |
				// If Layout shall be with gradient use gradient, else not.
				if (COLOR_GRADIENT.booleanValue) {
					rect.setBackgroundGradient("gray".color, "white".color, 90)
				} else {
					rect.setBackground("gray".color)
				}
				// For each type create a class node in this package if it is related to it.
				packageNode.children += classDataSelection.types.map [
					if (it.type.packageFragment == fragment) {
						it.createClassNode(classDataSelection)
					}
				].filterNull
			]
		]
	}

	// Create a node for each class. And add the content.
	def createClassNode(KType classData, KTypeSelection classDataSelection) {
		return classData.createNode.putToLookUpWith(classData) => [
			it.addRoundedRectangle(5, 5) => [ rect |
				rect.setGridPlacement(1).from(LEFT, 2, 0, TOP, 2, 0).to(RIGHT, 2, 0, BOTTOM, 0, 0)
				// If Layout shall be with gradient use gradient, else not.
				// Node Color depends on classtype.
				if (COLOR_GRADIENT.booleanValue) {
					rect.setBackgroundGradient(getNodeColor(classData), "white".color, 90)
				} else {
					rect.setBackground(getNodeColor(classData))
				}
				// Add Label depending on classtype
				if (Flags.isAbstract(classData.type.flags)) {
					rect.addText("<<Abstract>>")
				}
				if (classData.type.isInterface) {
					rect.addText("<<Interface>>")
				}
				if (classData.type.isEnum) {
					rect.addText("<<Enumeration>>")
				}
				// Add fully qualified name or just the name.
				if (CLASSES_FQNAME.booleanValue) {
					rect.addText(classData.type.fullyQualifiedName)
				} else {
					rect.addText(classData.type.elementName)
				}
				rect.addChild = createHorizontalLineInRectangle
				// Add all fields that have no association-relation or have association relation but associations shouldn't be visualized.
				val boolean[] addedField = #[false];
				classData.fields.forEach [ eField |
					if (!hasDependency(classData, classDataSelection, eField).get(0) || !EDGES_ASSOCIATION.booleanValue) {

						// If only private fields shall be added only add non private fields...
						if (!(Flags.isPrivate(eField.field.flags) && !ATTRIBUTES_PRIVATE.booleanValue)) {

							// if only selected fields shall be visualized only add selected fields.
							// Else add all.
							if (VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_SELECTION) {
								if (eField.isSelected) {
									rect.addText(eField.field.getAttributeData) => [
										it.setHorizontalAlignment(H_LEFT)
									]
									addedField.set(0, true)
								}
							} else {
								rect.addText(eField.field.getAttributeData) => [
									it.setHorizontalAlignment(H_LEFT)
								]
								addedField.set(0, true)
							}
						}
					}
				]
				if (!addedField.get(0)) {
					rect.addText("")
				}
				rect.addChild = createHorizontalLineInRectangle
				val boolean[] addedMethod = #[false];
				classData.methods.forEach [
					// If only private methods shall be added only add non private methods...
					if (!(Flags.isPrivate(it.method.flags) && !METHODS_PRIVATE.booleanValue)) {

						// if only selected methods shall be visualized only add selected methods.
						// Else add all.
						if (VISUALIZE_ALL_OR_SELECTION.objectValue == VISUALIZE_SELECTION) {
							if (it.isSelected) {
								rect.addText(it.method.getMethodData) => [
									it.setHorizontalAlignment(H_LEFT)
								]
								addedMethod.set(0, true)
							}
						} else {
							rect.addText(it.method.getMethodData) => [
								it.setHorizontalAlignment(H_LEFT)
							]
							addedMethod.set(0, true)
						}
					}
				]
				if (!addedMethod.get(0)) {
					rect.addText("")
				}
			]
		]
	}

	// Get the color depending on the class type.
	def KColor getNodeColor(KType classData) {
		if (classData.type.isClass) {
			return "#A4D3EE".color
		}
		if (Flags.isAbstract(classData.type.flags)) {
			return "#A4D3EE".color
		}
		if (classData.type.isInterface) {
			return "#F0FFF0".color
		}
		if (classData.type.isEnum) {
			return "#EFD7FF".color
		}
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

	// Creates a horizontal Line in a rectangle
	def KPolyline createHorizontalLineInRectangle() {
		return RENDERING_FACTORY.createKPolyline() => [
			it.points += createKPosition(LEFT, -1, 0, TOP, 0, 0)
			it.points += createKPosition(LEFT, 1, 1, TOP, 0, 0)
		]
	}

	// Create inheritance of classes and interfaces.
	def void createInheritanceEdges(KTypeSelection classDataSelection) {
		classDataSelection.types.forEach [
			if (it.type.superclassName != null) {
				it.createClassInheritanceEdge(classDataSelection)
			}
		]
		classDataSelection.types.forEach [
			it.createInterfaceInheritanceEdge(classDataSelection)
		]
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
						]
						var String multiplicity = ""
//						if (classHasAssociationToThisClass.get(1).intValue == -1) {
//							multiplicity = Integer.toString(classHasAssociationToThisClass.get(0)) + "..*"
//						} else {
//							multiplicity = Integer.toString(classHasAssociationToThisClass.get(0))
//						}
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

	// Get the field data depending on the synthesis options
	def String getAttributeData(IField field) {
		var String attributeType = ""
		var String visibility = ""
		if (ATTRIBUTES_VISIBILITY.booleanValue) {
			visibility = getVisibility(field.flags)
		}

		if (ATTRIBUTES_TYPE.booleanValue) {
			attributeType = " : " + Signature.getSignatureSimpleName(field.typeSignature)
		}
		return visibility + field.elementName + attributeType
	}

	// Extract visibility indicator of the given flag.
	def getVisibility(int i) {
		if (Flags.isPrivate(i)) {
			return "\u2212"
		} else {
			if (Flags.isPublic(i)) {
				return "+"
			} else {
				if (Flags.isProtected(i)) {
					return "#"
				} else {
					return ""
				}
			}
		}
	}

	// Get the method data depending on the synthesis options
	def String getMethodData(IMethod method) {
		var String methodReturnType = ""
		var String visibility = ""
		if (METHODS_VISIBILITY.booleanValue) {
			visibility = getVisibility(method.flags)
		}
		val parameters = newLinkedList();
		if (METHODS_PARAMETERS.booleanValue) {
			method.parameterNames.forEach [ parameterName, index |
				val parameterType = " : " + Signature.getSignatureSimpleName(method.parameterTypes.get(index))
				if (METHODS_TYPE.booleanValue) {
					parameters += parameterName + parameterType
				} else {
					parameters += parameterName
				}
			]
		}
		if (METHODS_TYPE.booleanValue) {
			methodReturnType = " : " + Signature.getSignatureSimpleName(method.returnType)
		}
		parameters.fold("")[prev, next|prev + next];
		if (METHODS_PARAMETERS.booleanValue) {
			return visibility + method.elementName + " (" + Joiner.on(", ").join(parameters) + ")" + methodReturnType
		} else {
			return visibility + method.elementName + methodReturnType
		}
	}

	// Arrowdecorator for associations
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
