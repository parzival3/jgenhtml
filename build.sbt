ThisBuild / organization := "io.github.parzival3"
ThisBuild / organizationName := "parzival3"
ThisBuild / organizationHomepage := Some(url("https://www.github.com/parzival3"))
ThisBuild / version := "0.1"

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/parzival3/jgenhtml"),
    "scm:git@github.com:parzival3/jgenhtml.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "parzival3",
    name  = "Enrico Tolotto",
    email = "etolotto@gmail.com",
    url   = url("https://www.github.com/parzival3")
  )
)

ThisBuild / description := "Personal fork of https://github.com/ricksbrown/jgenhtml"
ThisBuild / licenses := List("GPLv3" -> new URL("https://www.gnu.org/licenses/gpl-3.0.html"))
ThisBuild / homepage := Some(url("https://github.com/parzival3/jgenhtml"))

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true


scalaVersion := "2.12.10"
scalacOptions := Seq("-Xsource:2.11")


resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases"),
)

libraryDependencies ++= Seq(
  "commons-cli" % "commons-cli" % "1.4",
  "commons-io" % "commons-io" % "2.8.0",
)

