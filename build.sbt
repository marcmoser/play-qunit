name := "play-qunit"

organization := "com.plutastic"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  "com.typesafe.play"            %% "play-test"                % "2.2.1",
  "commons-io"                   %  "commons-io"               % "2.3",
  "org.webjars"                  %% "webjars-play"             % "2.2.0",
  "org.webjars"                  %  "jquery"                   % "2.0.3-1",
  "org.webjars"                  %  "qunit"                    % "1.11.0",
  "org.webjars"                  %  "sinonjs"                  % "1.7.3",
  // Selenium updates
  "org.seleniumhq.selenium"      %  "selenium-java"            % "2.39.0",
  "org.seleniumhq.selenium"      %  "selenium-firefox-driver"  % "2.39.0",
  "org.seleniumhq.selenium"      %  "selenium-htmlunit-driver" % "2.39.0",
  "com.github.detro.ghostdriver" %  "phantomjsdriver"          % "1.1.0"
)     

resolvers ++= Seq(
  "webjars" at "http://webjars.github.com/m2",
  Resolver.url("play-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns),
  Resolver.url("play-plugin-snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))(Resolver.ivyStylePatterns)
)

play.Project.playScalaSettings
