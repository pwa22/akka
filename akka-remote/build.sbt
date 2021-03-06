import akka.{AkkaBuild, Dependencies, Formatting, OSGi}
import com.typesafe.tools.mima.plugin.MimaKeys

AkkaBuild.defaultSettings

Formatting.formatSettings

OSGi.remote

Dependencies.remote

parallelExecution in Test := false

MimaKeys.previousArtifact := akkaPreviousArtifact("akka-remote").value
