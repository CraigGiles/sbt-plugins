version := "1.0"
sbtPlugin := true
organization := "com.gilesc"
name := "gilesc-sbt"

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.6")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.3")
