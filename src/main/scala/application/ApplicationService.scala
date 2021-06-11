package application
import scala.io.Source
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import model.in.{AnimeIn, GenreIn, MangaIn}
import utils.converters.{AnimeConverter, MangaConverter}

object ApplicationService {
  def process() = {
    // Logique de l'application
    val url = "https://api.jikan.moe/v3/manga/1"

    // Lire les données => API ou Fichier
    val result = Source.fromURL(url).mkString
    println(parse(result))

    // Convertir et parser les données
    val decodedManga = decode[MangaIn](result)
    println(decodedManga)
    val Manga = MangaConverter.convert(decodedManga.toSeq(0))
    println(Manga)
  }
}
//Anime
//Manga
//Genre
//Season
//User