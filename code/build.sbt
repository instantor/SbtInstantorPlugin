instantorSettings

sbtPlugin := true

name := "Sbt Instantor Plugin"

version := "0.3.42-SNAPSHOT"

unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := Nil

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

publicRelease

libraryDependencies ++= Seq(
  commonsIo
, ivy
, logback
, PropsLoader.Core
)

ReleaseKeys.versionFile := file("src") / "main" / "resources" / "version.sbt"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.4")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")
