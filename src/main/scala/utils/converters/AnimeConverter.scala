package utils.converters

import model.in.AnimeIn
import model.out.{Anime, Genre}

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.time.LocalDateTime

object AnimeConverter extends Converter[AnimeIn, Anime] {

  override def convert(input: AnimeIn): Anime = {
    val today = LocalDateTime.now()
    Anime(
      id = input.mal_id,
      title = input.title,
      synopsis = input.synopsis,
      status = input.status,
      rating = input.rating,
      score = input.score,
      scored_by = input.scored_by,
      rank = input.rank,
      popularity = input.popularity,
      favorites = input.favorites,
      season = input.premiered,
      adaptation = if(input.related.Adaptation == None) Seq[Int]()
          else input.related.Adaptation.get.foldLeft(Seq[Int](input.related.Adaptation.get.length))((list,x)=> list :+ x.mal_id),
      genres = input.genres.foldLeft(Seq[Int](input.genres.length))((list,x)=> list :+ x.mal_id),
      published_from = if(input.aired.from == "null") Timestamp.valueOf(today) else Timestamp.valueOf(input.aired.from.substring(0,19).replace("T", " ")),
      published_to = if(input.aired.to == "null") Timestamp.valueOf(today) else Timestamp.valueOf(input.aired.to.substring(0,19).replace("T", " "))
    )
  }
}
