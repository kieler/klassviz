KlassViz - Kieler Class Diagram Visualization
=============================================

KlassViz provides a way to dynamically show class diagrams just by clicking a context menu entry on your Eclipse project browser. The project also provides a textual language to describe and save diagrams. The whole thing is based on the [KIELER Lightweight Diagrams (KLighD)](http://www.informatik.uni-kiel.de/rtsys/kieler/) framework.


Building
--------

To build KlassViz, make sure you have Maven installed. Change into the
build directory and execute this command:

```bash
mvn clean package
```


Nightly Builds
--------------

Automatic builds are done every night by the [KIELER Bamboo build system](http://rtsys.informatik.uni-kiel.de/bamboo). To install KlassViz, open your Eclipse installation and select _Install New Software..._ from the _Help_ menu. Use the following update site:

> http://rtsys.informatik.uni-kiel.de/~kieler/updatesite/nightly-openkieler/


Releases
--------

There are no official releases, only the nightly builds. With our development model, we try to ensure that only stable code gets into the master branch that is built each night.


Development
-----------

Our development process is quite easy: the master branch is supposed to always be stable. All development takes place in feature branches. Once a feature is deemed stable enough, the code is merged into the master branch and thus gets shipped through the nightly builds.
