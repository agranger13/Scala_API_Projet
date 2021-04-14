package utils.converters

import model.in.AnimeIn
import model.out.Anime

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
      adaptation = input.Adaptation,
      studios = input.studios,
      genres = input.genres,
      recommendation = input.recommendation,
      published_from = Timestamp.valueOf(input.published(0)),
      published_to = Timestamp.valueOf(input.published(1))
    )
  }
}
