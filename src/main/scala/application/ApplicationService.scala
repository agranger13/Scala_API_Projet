package application
import scala.io.Source
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import model.in.{AnimeIn, GenreIn, MangaIn, AuthorIn}
import utils.converters.{AnimeConverter, MangaConverter, AuthorConverter}

object ApplicationService {
  def process() = {
    // Logique de l'application
    val url = "https://api.jikan.moe/v3/person/5678"

    // Lire les données => API ou Fichier
    val result = Source.fromURL(url).mkString
    println(parse(result))

    // Convertir et parser les données
    val decodedAuthor = decode[AuthorIn](result)
    println(decodedAuthor)
    val Author = AuthorConverter.convert(decodedAuthor.toSeq(0))
    println(Author)
  }
}
//Anime
//Manga
//Genre
//Season
//User