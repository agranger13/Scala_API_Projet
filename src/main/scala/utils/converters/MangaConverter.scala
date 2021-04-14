package utils.converters

import model.in.{AnimeIn, MangaIn}
import model.out.{Anime, Manga}

import java.sql.Timestamp

class MangaConverter extends Converter[MangaIn, Manga] {
  override def convert(input: MangaIn): Manga = {
    Manga(
      id = input.mal_id,
      title = input.title,
      synopsis = input.synopsis,
      publishing = input.publishing,
      score = input.score,
      scored_by = input.scored_by,
      rank = input.rank,
      popularity = input.popularity,
      favorites = input.favorites,
      adaptation = input.Adaptation,
      authors = input.authors,
      genres = input.genres,
      recommendation = input.recommendation,
      published_from = Timestamp.valueOf(input.published(0)),
      published_to = Timestamp.valueOf(input.published(1))
    )
  }
}
