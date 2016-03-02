package com.gilesc

import sbt._
import sbt.Keys._
import complete.DefaultParsers._

object HelloPlugin extends sbt.AutoPlugin {
  lazy val hello = InputKey[Unit]("hello", "Prints Hello world.")
  lazy val helloKey = SettingKey[String]("default message for hello")

  override def trigger = Plugins.allRequirements
  override def requires = GilescSbt

  override def projectSettings = Seq(
    hello := {
      val args: Seq[String] = spaceDelimited("<arg>").parsed
      val sourceDir = (scalaSource in Compile).value
      streams.value.log.info("Hello " + helloKey.value + " " + args.mkString(",") + " " + sourceDir.getAbsolutePath)
    },
    helloKey := "default message"
  )
}
