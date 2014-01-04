name := "play-qunit-sample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  "me.moser"            %% "play-qunit"            % "1.0-SNAPSHOT"
)     

play.Project.playScalaSettings
