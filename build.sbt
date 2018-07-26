organization in ThisBuild := "org.chgrivas"
scalaVersion in ThisBuild := "2.12.6"
version in ThisBuild := "1.0.0-SNAPSHOT"

val macwire = "com.softwaremill.macwire" %% "macros" % "2.3.0" % "provided"
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % Test

lazy val `scalarat` = (project in file("."))
  .aggregate(`scalarat-api`, `scalarat-impl`, `sample`)

lazy val `scalarat-api` = (project in file("scalarat-api"))
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslApi
    )
  )

lazy val `scalarat-impl` = (project in file("scalarat-impl"))
  .enablePlugins(LagomScala)
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslPersistenceCassandra,
      lagomScaladslKafkaBroker,
      lagomScaladslTestKit,
      macwire,
      scalaTest
    )
  )
  .settings(lagomForkedTestSettings: _*)
  .dependsOn(`scalarat-api`)

lazy val sample = (project in file("sample"))
  .settings(
    name := "sample",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
