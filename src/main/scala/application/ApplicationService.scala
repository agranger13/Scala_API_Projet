package application
import scala.io.Source
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import model.in.{AnimeIn, GenreIn, MangaIn, SeasonIn}
import utils.converters.{AnimeConverter, MangaConverter, SeasonConverter}

object ApplicationService {
  def process() = {
    // Logique de l'application
    val url = "https://api.jikan.moe/v3/user/Nekomata1037"

    // Lire les données => API ou Fichier
    val result = Source.fromURL(url).mkString
    println(parse(result))

    // Convertir et parser les données
    val decodedSeason = decode[SeasonIn](result)
    println(decodedSeason)
    val Season = SeasonConverter.convert(decodedSeason.toSeq(0))
    println(Season)
  }
}
//Anime
//Manga
//Genre
//Season
//User