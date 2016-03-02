package com.gilesc

import sbt._
import sbt.Keys._

object AkkaDeps extends sbt.AutoPlugin {
  val version = SettingKey[String]("akka-version")

  def akkaModule(module: String, v: String) =
    "com.typesafe.akka" %% ("akka-" + module) % v

  val settings: Seq[Setting[_]] = Seq(
    version := "2.4.0",
    libraryDependencies <++= (version) { (v) =>
      Seq(
        akkaModule("actor", v),
        akkaModule("remote", v),
        akkaModule("slf4j", v),
        akkaModule("testkit", v) % "test"
      )
    }
  )
}
