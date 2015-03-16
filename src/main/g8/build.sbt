name := "$name$"

version := "0.1"

organization := "org.myproject"

scalaVersion := "2.11.5"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

javaOptions += "-Xmx2G"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")

scalacOptions ++= Seq("-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard")

libraryDependencies ++= Seq(
//  "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
