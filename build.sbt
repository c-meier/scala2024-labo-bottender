val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Bot-tender",
    version := "0.2.1",
    scalaVersion := scala3Version,
    libraryDependencies ++= List(
        "org.scalactic" %% "scalactic" % "3.2.18",
        "org.scalatest" %% "scalatest" % "3.2.18" % "test",
    ),
  )
