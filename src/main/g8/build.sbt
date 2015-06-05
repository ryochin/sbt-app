name := "$name$"

version := "0.1"

organization := "org.myproject"

scalaVersion := "2.11.6"

mainClass in (Compile, assembly) := Some("Main")

assemblyJarName in assembly := "$name$-" + version.value + ".jar"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

javaOptions += "-Xmx2G -XX:+CMSClassUnloadingEnabled -XX:MaxMetaspaceSize=512M"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")

scalacOptions ++= Seq("-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard")

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
//  "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
//  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.3",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3"
)

// spec2
// libraryDependencies ++= Seq(
//   "org.specs2" %% "specs2-core" % "3.3.1" % "test",
//   "org.scalacheck" %% "scalacheck" % "1.12.2" % "test",
//   "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test"
// )
