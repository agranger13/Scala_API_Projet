package application
import scala.io.Source
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import model.in.{AnimeIn, AuthorIn, GenreIn, MangaIn, SeasonIn}
import model.out.{Anime, Author, Genre, Manga, Season}
import utils.converters.{AnimeConverter, MangaConverter, SeasonConverter}
import utils.handlers.{AbstractApiConverter, AbstractApiReader}

object ApplicationService {
  def process() = {
    // Logique de l'application
    val conf = ApplicationConfiguration

    val url_season = conf.base_url + "season/" + "2020/summer"
    val url_anime = conf.base_url + "anime/" + "1/"
    val url_author = conf.base_url + "person/" + "1/"
    val url_manga = conf.base_url + "manga/" + "1/"
    val url_genre = conf.base_url + "genre/" + "anime/1/"
    println(url_genre)

    val resultApiSeason = AbstractApiReader.read(url_season)
    val resultObjSeason = AbstractApiConverter.convert[SeasonIn,Season](resultApiSeason)
    println(resultObjSeason)

    val resultApiManga = AbstractApiReader.read(url_manga)
    val resultObjManga = AbstractApiConverter.convert[MangaIn,Manga](resultApiManga)
    println(resultObjManga)

    val resultApiAnime = AbstractApiReader.read(url_anime)
    val resultObjAnime = AbstractApiConverter.convert[AnimeIn,Anime](resultApiAnime)
    println(resultObjAnime)

    val resultApiAuthor = AbstractApiReader.read(url_author)
    val resultObjAuthor = AbstractApiConverter.convert[AuthorIn,Author](resultApiAuthor)
    println(resultObjAuthor)

    val resultApiGenre = AbstractApiReader.read(url_genre)
    val resultObjGenre = AbstractApiConverter.convert[GenreIn,Genre](resultApiGenre)
    println(resultObjGenre)

  }
}
//Anime
//Manga
//Genre
//Season
//User