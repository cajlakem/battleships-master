Battleships
----------
This repo contains the project requirements of ASD Course Exercise-2.

How to setup and Run the Game [IntelliJ IDE Guide]
------------------------------
This guide explains how to run this project in IntelliJ IDEA.

1. Clone the repo locally `git clone https://github.com/cajlakem/battleships-master.git`
2. Open the project in intelliJ
3. Project structure > Project > Project SDK > <ins> You have to set your java path here (Java version >11)</ins>
4. Project structure > Project > Project compiler output > <ins>Select the out file on the current project </ins>
5. Project structure > Modules > Click Sources > <ins> Set src folder as Source </ins>
6. Download JavaFX [from here](https://gluonhq.com/products/javafx/) and set on Project structure > Libraries > New (+) > <ins> Lib folder from Javafx </ins> > Add > Apply
7.  Run > Edit configurations:
- Set main class
- Set JRE path
- Select the VM option from modify list
- VM Options:
`--module-path "" --add-modules javafx.controls,javafx.fxml --add-exports javafx.graphics/com.sun.javafx.prism=ALL-UNNAMED` where at `--module-path` you have to set the lib folder of downloaded JavaFx

Now you can run the application and enjoy the application features :) 

Contributors:  Emir Cajlakovic, Dennis Addo, Lulzim Bulica


--------- cut here -------
[![Build Status](https://travisci.com/USERNAME/PROJECTNAME.svg)](https://travis-ci.com/github/cajlakem/battleships-master)
--------- cut here -------
