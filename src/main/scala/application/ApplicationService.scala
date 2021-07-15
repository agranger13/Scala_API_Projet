package application
import model.in.{AnimeIn, AuthorIn, GenreIn, MangaIn, SeasonIn}
import model.out.{Anime, Author, Genre, Manga, Season}
import utils.handlers.{AbstractApiConverter, AbstractApiReader, WriteToMongoDB}

object ApplicationService {
  def process() = {
    // Logique de l'application
    val conf = ApplicationConfiguration

    val url_season = conf.base_url + "season/" + "2021/summer"
    val url_anime = conf.base_url + "anime/"
    val url_author = conf.base_url + "person/"
    val url_manga = conf.base_url + "manga/"
    val url_genre = conf.base_url + "genre/"

    val resultApiSeason = AbstractApiReader.read(url_season)
    if(resultApiSeason != "error") {
      val resultObjSeason = AbstractApiConverter.convert[SeasonIn, Season](resultApiSeason)
      println("\nresult : ")
      println(resultObjSeason)
      println(WriteToMongoDB.write[Season](resultObjSeason))
    }
    (1 to 30).foreach(i=>{
      val resultApiManga = AbstractApiReader.read(url_manga + i)
      if(resultApiManga != "error") {
        val resultObjManga = AbstractApiConverter.convert[MangaIn,Manga](resultApiManga)
        println("\nresult : ")
        println(resultObjManga)
        println(WriteToMongoDB.write[Manga](resultObjManga))
      }
    })
    (1 to 30).foreach(i=> {
      val resultApiAnime = AbstractApiReader.read(url_anime+i)
      if(resultApiAnime != "error") {
        val resultObjAnime = AbstractApiConverter.convert[AnimeIn, Anime](resultApiAnime)
        println("\nresult : ")
        println(resultObjAnime)
        println(WriteToMongoDB.write[Anime](resultObjAnime))
      }
    })
    (1 to 30).foreach(i=> {
      val resultApiAuthor = AbstractApiReader.read(url_author+i)
      if(resultApiAuthor != "error") {
        val resultObjAuthor = AbstractApiConverter.convert[AuthorIn, Author](resultApiAuthor)
        println("\nresult : ")
        println(resultObjAuthor)
        println(WriteToMongoDB.write[Author](resultObjAuthor))
      }
    })
    (1 to 30).foreach(i=> {
      val resultApiGenre = AbstractApiReader.read(url_genre + "anime/" + i)
      if(resultApiGenre != "error") {
        val resultObjGenre = AbstractApiConverter.convert[GenreIn, Genre](resultApiGenre)
        println("\nresult : ")
        println(resultObjGenre)
        println(WriteToMongoDB.write[Genre](resultObjGenre))
      }
    })
    (1 to 30).foreach(i=> {
      val resultApiGenre = AbstractApiReader.read(url_genre + "manga/" + i)
      if(resultApiGenre != "error") {
        val resultObjGenre = AbstractApiConverter.convert[GenreIn, Genre](resultApiGenre)
        println("\nresult : ")
        println(resultObjGenre)
        println(WriteToMongoDB.write[Genre](resultObjGenre))
      }
    })

  }
}
