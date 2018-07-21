ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "com.chgrivas"

lazy val scalarat = (project in file("."))
  .settings(
    name := "scalarat",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
