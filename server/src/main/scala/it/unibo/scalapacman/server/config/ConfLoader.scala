package it.unibo.scalapacman.server.config

import java.io.File

import com.typesafe.config.{Config, ConfigFactory}

/**
 * Utility per caricamento file di configurazione
 */
object ConfLoader {
  private val defaultConf : Config = ConfigFactory.load()
  val appConf             : Config = ConfigFactory.parseFile(new File("application-server.conf")).withFallback(defaultConf)
  val akkaConf            : Config = appConf.getConfig("akka-conf")
}
