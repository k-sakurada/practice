name := "circleci"

version := "0.1"

scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.2",
  "org.apache.spark" % "spark-sql_2.11" % "2.1.2",
  "org.apache.spark" % "spark-streaming_2.11" % "2.1.2",
  "org.apache.spark" % "spark-mllib_2.11" % "2.1.2",
  "org.jmockit" % "jmockit" % "1.34" % "test"
)
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.pegdown"    %  "pegdown"     % "1.6.0"  % "test"
libraryDependencies += "com.typesafe" % "config" % "1.3.2"
libraryDependencies += "com.microsoft.azure" % "azure-storage" % "7.0.0"
scalacOptions in (Compile,doc) ++= Seq("-groups", "-implicits", "-diagrams")
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "docs/test/", "-eNDXEHLO")