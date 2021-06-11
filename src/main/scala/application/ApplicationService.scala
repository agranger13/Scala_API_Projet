package application
import scala.io.Source
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import model.in.{AnimeIn, GenreIn}

object ApplicationService {
  def process() = {
    // Logique de l'application
    val url = "https://api.jikan.moe/v3/anime/1"
    val result = Source.fromURL(url).mkString
    println(result)
    println(parse(result))
    val decodedFoo = decode[AnimeIn](result)
    println(decodedFoo)
    decodedFoo.toSeq(0)

    // Convertir et parser les données

    // Envoyer les données sur notre BDD
  }
}
//Anime
//Manga
//Genre
//Season