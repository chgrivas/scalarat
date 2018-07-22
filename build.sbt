lazy val commonSettings = Seq(
  scalaVersion := "2.12.6",
  organization := "com.chgrivas",
  version := "0.1.0"
)

lazy val root = (project in file("."))
  .aggregate(sample)

lazy val sample = (project in file("sample"))
  .settings(
    commonSettings,
    name := "sample",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
