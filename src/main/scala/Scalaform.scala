package com.gilesc

import sbt._
import sbt.Keys._
import complete.DefaultParsers._
import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

import scalariform.formatter.preferences._

object Scalaform extends sbt.AutoPlugin {
  lazy val settings = SbtScalariform.scalariformSettings ++ Seq(
    ScalariformKeys.preferences := ScalariformKeys.preferences.value
      .setPreference(DoubleIndentClassDeclaration, true)
      .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)
      .setPreference(DanglingCloseParenthesis, Prevent)
  )

  override def trigger = Plugins.allRequirements
  override def requires = GilescSbt
}
