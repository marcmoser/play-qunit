play-qunit
==========

QUnit module for Play Framework 2.2, written in Scala. This has been heavily inspired by https://github.com/gcusnieux/play20-qunit

How to use ?
------------

* clone the repo
* execute 'play publish-local' in main
* add the dependency in your project

build.sbt :

	libraryDependencies ++= Seq(
		// Add your project dependencies here,
	        "me.moser" %% "play-qunit" % "1.0-SNAPSHOT"
    	)

* includes module routes

routes :

	# Include play-qunit routes
	-> /qunit qunit.Routes

* create the folder 'qunit' at the root of your project
* add tests in folder
* each test consists of at least a js file, and an optional html file which must have the same name if present

