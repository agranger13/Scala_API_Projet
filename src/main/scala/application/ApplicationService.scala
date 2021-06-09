package application
import utils.handlers.AbstractApiReader

import scala.io.Source
object ApplicationService extends App {
  def process() = {
    // Logique de l'application
    val url = "https://api.jikan.moe/v3/anime/1/episodes/2"
    //val result = Source.fromURL(url).mkString
    val result = AbstractApiReader.read(url)
    println(result)
    // Lire les données => API ou Fichier

    // Convertir et parser les données

    // Envoyer les données sur notre BDD
  }
}
