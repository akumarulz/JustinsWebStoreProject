name := """justinWebStore"""
organization := "xyz.taylor"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

libraryDependencies += ws


PlayKeys.devSettings := Seq("play.server.http.port" -> "8980" ,
  "play.http.context" -> "/blkmgk")

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "xyz.taylor.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "xyz.taylor.binders._"
