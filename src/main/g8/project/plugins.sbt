resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.4")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")

// addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
