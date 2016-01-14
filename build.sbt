name := """Thunderbit"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

resolvers += "ylemoigne-maven" at "https://dl.bintray.com/ylemoigne/maven/"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.mongodb" % "mongodb-driver-async" % "3.2.0",
  "fr.javatic.mongo" % "mongo-jackson-codec" % "3.2.0__0.3",
  "junit" % "junit" % "4.11",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.10.44"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
