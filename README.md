README
======

A simple but complete "Hello World Starter Kit" for Scala 2.11.

* appropriate options
* auto formatting
* scalatest
* assembly

Setup Java
----------

go to https://www.java.com/en/download/ and install Java8.

Setup Scala
-----------

### OSX

	brew install scala sbt
	brew install giter8

Usage
-----

	g8 ryochin/sbt-app
	cd my-app

	vi src/main/scala/Main.scala

	sbt compile
	sbt test
	sbt run

	sbt assembly
	java -classpath target/scala-2.11/my-app-0.1.jar Main
