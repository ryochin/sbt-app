name := "$name$"

version := "0.1"

organization := "org.myproject"

scalaVersion := "2.11.8"

mainClass in Compile := Some("Main")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

javaOptions += "-Dfile.encoding=UTF-8 -Duser.timezone=Asia/Tokyo -Xmx2G -XX:+CMSClassUnloadingEnabled -XX:MaxMetaspaceSize=2G -XX:MaxPermSize=2G"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")

scalacOptions ++= Seq("-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard", "-encoding", "utf8")

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

// libraryDependencies ++= Seq(
//   "org.scala-lang"         %  "scala-reflect"            % "2.11.8",
//   "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
//   "org.scala-lang.modules" %% "scala-xml"                % "1.0.6"
// )

// libraryDependencies ++= Seq(
//   "com.typesafe.akka"         %% "akka-actor"       % "2.4.14",
//   "com.typesafe.akka"         %% "akka-remote"      % "2.4.14",
//   "com.typesafe.akka"         %% "akka-persistence" % "2.4.14",
//   "com.typesafe.akka"         %% "akka-testkit"     % "2.4.17" % "test"
// )

libraryDependencies ++= Seq(
  "ch.qos.logback"                %  "logback-classic" % "1.2.1",
  "com.github.scala-incubator.io" %% "scala-io-core"   % "0.4.3",
  "com.github.scopt"              %% "scopt"           % "3.5.0",
  "com.typesafe"                  %  "config"          % "1.3.0",
  "com.typesafe.scala-logging"    %% "scala-logging"   % "3.5.0",
  "org.scalaz"                    %% "scalaz-core"     % "7.2.8",
  "org.slf4j"                     %  "slf4j-api"       % "1.7.10",
  "org.specs2"                    %% "specs2-core"     % "3.8.5.1" % "test"
)

enablePlugins(JavaAppPackaging)

publishArtifact in (Compile, packageDoc) := false

initialCommands in console := ""
