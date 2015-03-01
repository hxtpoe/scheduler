name := "schedule"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "2.4.15" % "test",
  "org.specs2" %% "specs2-mock" % "2.4.15" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional jars and dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

lazy val hello = taskKey[Unit]("An example task")

lazy val root = (project in file(".")).
  settings(
    hello := { println("Hello!") }
  )