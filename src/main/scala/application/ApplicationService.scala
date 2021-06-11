package application
import scala.io.Source
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import model.in.{AnimeIn, GenreIn}
import utils.converters.AnimeConverter

object ApplicationService {
  def process() = {
    // Logique de l'application
    val url = "https://api.jikan.moe/v3/anime/1"

    // Lire les données => API ou Fichier
    val result = Source.fromURL(url).mkString

    // Convertir et parser les données
    println(parse(result))

    val decodedAnime = decode[AnimeIn](result)
    println(decodedAnime.toSeq(0))

    val Anime = AnimeConverter.convert(decodedAnime.toSeq(0))
    println(Anime)
  }
}
//Anime
//Manga
//Genre
//Season
//User