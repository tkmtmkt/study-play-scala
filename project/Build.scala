import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "study-scala-play"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "com.itextpdf" % "itextpdf" % "5.4.0",
    "org.mongodb" %% "casbah" % "2.5.1",
    // for logging
    "org.slf4j" % "slf4j-simple" % "1.7.3",
    // for test
    "org.mockito" % "mockito-core" % "1.9.0" % "test",
    "org.specs2" %% "specs2" % "1.12.4" % "test",
    "junit" % "junit" % "4.10" % "test",
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}