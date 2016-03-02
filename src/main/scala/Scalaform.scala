package com.gilesc

import sbt._
import sbt.Keys._
import complete.DefaultParsers._
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

import scalariform.formatter.preferences._

object Scalaform extends sbt.AutoPlugin {
  lazy val scalaformSettings =
    ScalariformKeys.preferences := ScalariformKeys.preferences.value
      .setPreference(RewriteArrowSymbols, false)
      .setPreference(IndentSpaces, 2)
      .setPreference(SpaceBeforeColon, false)
      .setPreference(CompactStringConcatenation, false)
      .setPreference(PreserveSpaceBeforeArguments, false)
      .setPreference(AlignParameters, false)
      .setPreference(AlignArguments, false)
      .setPreference(DoubleIndentClassDeclaration, true)
      .setPreference(FormatXml, true)
      .setPreference(IndentPackageBlocks, true)
      .setPreference(AlignSingleLineCaseStatements, false)
      .setPreference(IndentLocalDefs, false)
      .setPreference(DanglingCloseParenthesis, Prevent)
      .setPreference(SpaceInsideParentheses, false)
      .setPreference(SpaceInsideBrackets, false)
      .setPreference(SpacesWithinPatternBinders, true)
      .setPreference(MultilineScaladocCommentsStartOnFirstLine, false)
      .setPreference(IndentWithTabs, false)
      .setPreference(CompactControlReadability, false)
      .setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk, true)
      .setPreference(SpacesAroundMultiImports, false)

  override def trigger = Plugins.allRequirements
  override def requires = GilescSbt
}
