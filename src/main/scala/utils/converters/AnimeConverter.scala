package utils.converters

import model.in.AnimeIn
import model.out.{Anime, Genre}

import java.sql.Timestamp
import java.text.SimpleDateFormat

object AnimeConverter extends Converter[AnimeIn, Anime] {

  override def convert(input: AnimeIn): Anime = {
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
      adaptation = input.related.Adaptation.foldLeft(new Array[Int](input.related.Adaptation.length))((list,x)=> list :+ x.mal_id),
      genres = input.genres.foldLeft(new Array[Int](input.genres.length))((list,x)=> list :+ x.mal_id),
      published_from = Timestamp.valueOf(input.aired.from.substring(0,19).replace("T", " ")),
      published_to = Timestamp.valueOf(input.aired.to.substring(0,19).replace("T", " "))
    )
  }
}
