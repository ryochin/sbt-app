import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.myproject",
      scalaVersion := "2.12.4",
      version      := "0.1"
    )),
    name := "$name$",
    mainClass in Compile := Some("Main"),
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
    javaOptions += "-Dfile.encoding=UTF-8 -Duser.timezone=Asia/Tokyo -Xmx2G -XX:+CMSClassUnloadingEnabled -XX:MaxMetaspaceSize=2G -XX:MaxPermSize=2G",
    scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint", "-Xfatal-warnings"),
    scalacOptions ++= Seq("-Ywarn-dead-code",
                          "-Ywarn-numeric-widen",
                          "-Ywarn-unused",
                          "-Ywarn-unused-import",
                          "-Ywarn-value-discard",
                          "-encoding", "utf8"),
    scalacOptions in Test ++= Seq("-Yrangepos"),
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    resolvers += Resolver.sonatypeRepo("public"),
    libraryDependencies ++= Seq(
      "ch.qos.logback"             %  "logback-classic" % "1.2.3",
      "com.github.scopt"           %% "scopt"           % "3.7.0",
      "com.typesafe.akka"          %% "akka-actor"      % "2.5.8",
      "com.typesafe"               %  "config"          % "1.3.2",
      "com.typesafe.scala-logging" %% "scala-logging"   % "3.7.2",
      "org.slf4j"                  %  "slf4j-api"       % "1.7.25",
      "org.specs2"                 %% "specs2-core"     % "4.0.3" % Test
    ),
    Revolver.settings,
    publishArtifact in (Compile, packageDoc) := false,
    initialCommands in console := """
    System.setProperty("skinny.env", "development")
    new AnyRef with qubit.Base // for env
    // skinny.DBSettings.initialize()
    // implicit val session = scalikejdbc.AutoSession
    """
  )
  .enablePlugins(JavaServerAppPackaging)
