import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(List(organization := "com.dali",
    scalaVersion := "2.12.5",
    version := "0.1.0-SNAPSHOT")),
    name := "KafkaHalloWorld",
    libraryDependencies ++=
    Seq(
      kafkaClient,
      scalaTest % Test
    )
)

scalafmtConfig in Compile := file(".scalafmt.conf")
