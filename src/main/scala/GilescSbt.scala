package com.gilesc

import sbt._
import sbt.Keys._
import complete.DefaultParsers._

object GilescSbt extends sbt.AutoPlugin {
  val commonSettings = Seq(
    organization := "com.gilesc"
  // Scalaform.scalaformSettings
  )

  def createProject(name: String) = {
    Project(name, file(name)).
      settings(commonSettings: _*)
  }

  // import autoImport._

  // override def projectSettings = Seq(
  //   extTask := {
  //     val args: Seq[String] = spaceDelimited("<arg>").parsed
  //     streams.value.log.info("Hello depend " + args.mkString(","))
  //   }
  // )

  // override def trigger = Plugins.allRequirements

  // object autoImport {
  //   lazy val extTask = InputKey[Unit]("depend", "Prints hello.")
  // }
}
