version := "1.0"
sbtPlugin := true
organization := "com.gilesc"
name := "gilesc-sbt"

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.11")
// addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.0")
