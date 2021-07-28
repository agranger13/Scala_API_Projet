name := "API_MyAnimeList"

version := "0.1"

scalaVersion := "2.12.13"
libraryDependencies += "com.lihaoyi" %% "upickle" % "0.9.5"
libraryDependencies += "com.lihaoyi" %% "os-lib" % "0.7.3"
libraryDependencies += "com.lihaoyi" %% "requests" % "0.6.9"

libraryDependencies += "io.circe" %% "circe-core" % "0.14.1"
libraryDependencies += "io.circe" %% "circe-parser" % "0.14.1"
libraryDependencies += "io.circe" %% "circe-generic" % "0.14.1"
libraryDependencies += "io.circe" %% "circe-generic-extras" % "0.14.1"

libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "4.3.0"
