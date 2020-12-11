name := "jgenhtml"
version := "0.1"
organization := "parzival3"

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

