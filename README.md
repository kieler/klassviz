KlassViz - Kieler Class Diagram Visualization
=============================================

KlassViz provides a way to dynamically show class diagrams just by clicking a context menu entry on your Eclipse project browser. The project also provides a textual language to describe and save diagrams. The whole thing is based on the [KIELER Lightweight Diagrams (KLighD)](http://www.informatik.uni-kiel.de/rtsys/kieler/) framework.


Using KlassViz
--------------

To use KlassViz, install it into your existing Eclipse installation from our Nightly Builds update site as explained below. Once that is done, there are two ways to use KlassViz: through context menus or through class diagram files.


### Using KlassViz through Context Menus

To quickly pull up a bunch of classes in a class diagram, simply select your source files (or the types contained therein) in the project explorer, right-click, and select _Class Diagram from Selection_. In the class diagram view, use the panel to the right to customize what gets shown in the diagram.

KlassViz saves the last type selection on a per-project basis. To restore the most recent class diagram generated for a given project, right-click that project and select _Restore Project's Previous Class Diagram_.


### Using KlassViz through Class Diagram Files

Generating class diagrams through the context menu is quick and easy, but offers only a limited subset of the vast, nearly endless degrees of artistic freedom KlassViz gives you. To unlock its full potential, use the KlassViz Language to specify what to show in your class diagram and how to show it.

To create a new class diagram file, simply create a new plain file with the file extension `.klaviz`. Here's an example of what such a file could look like (this example assumes that you have pulled the `de.cau.cs.kieler.debukviz` project into your IDE):

    // Import one or more projects whose classes to show in the diagram
    import project de.cau.cs.kieler.debukviz
    
    // Modify some of the colors
    classdata.classColor2="#c4cde2"
    classdata.abstractClassColor1="#fbe8c4"
    classdata.abstractClassColor2="#eac47c"
    
    // Layout options. See the Kieler Layout project for details
    de.cau.cs.kieler.algorithm="de.cau.cs.kieler.klay.layered"
    de.cau.cs.kieler.direction=DOWN
    
    // List the different packages whose classes to include
    package de.cau.cs.kieler.debukviz {
        // List the different classes and their members to include
        class DebuKVizSynthesis {
            transform(IVariable)
            
            // "depend" adds additional arrows
            depend "invokes" VariableTransformation
        }
        
        class DebuKVizTransformationService {
            transformationFor(IVariable)
            
            depend "manages" VariableTransformation
        }
        
        class VariableTransformation {
            transform(IVariable, KNode, VariableTransformationContext)
            
            depend "uses" VariableTransformationContext
        }
        
        class VariableTransformationContext {
            associateWith(IVariable, KNode)
            findAssociation(IVariable)
        }
    }

KlassViz supports the following options:

Name                                  | Description
--------------------------------------|--------------------------------------------------------------
`classdata.borderColor`               | The color of borders around types.
`classdata.edgeColor`                 | The color of edges.
`classdata.classColor1`               | First background color of the gradient for classes.
`classdata.classColor2`               | Second background color of the gradient for classes.
`classdata.abstractClassColor1`       | First background color of the gradient for abstract classes.
`classdata.abstractClassColor2`       | Second background color of the gradient for abstract classes.
`classdata.interfaceColor1`           | First background color of the gradient for interfaces.
`classdata.interfaceColor2`           | Second background color of the gradient for interfaces.
`classdata.enumColor1`                | First background color of the gradient for enumerations.
`classdata.enumColor2`                | Second background color of the gradient for enumerations.
`classdata.shadow`                    | Whether types should have a subtle shadow (`true`) or not (`false`).
`classdata.fontName`                  | The font used throughout the diagram.
`classdata.printMethodParameterNames` | Whether to show the actual names of method parameters.


Nightly Builds
--------------

Automatic builds are done every night by the [KIELER Bamboo build system](http://rtsys.informatik.uni-kiel.de/bamboo). To install KlassViz, open your Eclipse installation and select _Install New Software..._ from the _Help_ menu. Use the following update site:

> http://rtsys.informatik.uni-kiel.de/~kieler/updatesite/nightly-openkieler/


Building
--------

To build KlassViz manually from the sources, make sure you have Maven installed. Change into the build directory and execute this command:

    bash
    mvn clean package


Releases
--------

There are no official releases, only the nightly builds. With our development model, we try to ensure that only stable code gets into the master branch that is built each night.


Development
-----------

Our development process is quite easy: the master branch is supposed to always be stable. All development takes place in feature branches. Once a feature is deemed stable enough, the code is merged into the master branch and thus gets shipped through the nightly builds.
