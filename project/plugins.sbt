// Make fat jar with all dependencies
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")

// Support building Eclipse project files by running `sbt eclipse`
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")