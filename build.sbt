name := """neo4jdemo"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"
resolvers += "Local Maven Repository" at "file:///"+Path.userHome.absolutePath+"/.m2/repository"
// add resolver for deadbolt and easymail snapshots
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.neo4j" % "neo4j-ogm" % "1.1.2-PLAY-SNAPSHOT",
  "org.apache.httpcomponents" % "httpclient" % "4.3.4",
  "be.objectify"  %% "deadbolt-java"     % "2.4.0",
  // Comment the next line for local development of the Play Authentication core:
  "com.feth"      %% "play-authenticate" % "0.7.0-SNAPSHOT",
  "org.webjars" % "bootstrap" % "3.2.0"
)


// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
//routesGenerator := InjectedRoutesGenerator


lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
