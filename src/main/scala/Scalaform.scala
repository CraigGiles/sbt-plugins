package com.gilesc

import sbt._
import sbt.Keys._
import complete.DefaultParsers._
import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import com.typesafe.sbt.SbtMultiJvm.MultiJvmKeys.MultiJvm

import scalariform.formatter.preferences._

object Scalaform extends sbt.AutoPlugin {
  lazy val settings = SbtScalariform.scalariformSettings ++ Seq(
    ScalariformKeys.preferences in Compile  := formattingPreferences,
    ScalariformKeys.preferences in Test     := formattingPreferences,
    ScalariformKeys.preferences in MultiJvm := formattingPreferences
  )

  def formattingPreferences = {
    import scalariform.formatter.preferences._
    FormattingPreferences()
      .setPreference(DoubleIndentClassDeclaration, true)
      .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)
      .setPreference(PreserveSpaceBeforeArguments, false)
      .setPreference(DanglingCloseParenthesis, Prevent)
  }

  override def trigger = Plugins.allRequirements
  override def requires = GilescSbt
}
