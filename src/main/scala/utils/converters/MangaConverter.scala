package utils.converters

import model.in.{AnimeIn, MangaIn}
import model.out.{Anime, Genre, Manga}

import java.sql.Timestamp

object MangaConverter extends Converter[MangaIn, Manga] {
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
      adaptation = input.related.Adaptation.foldLeft(new Array[Int](input.related.Adaptation.length))((list,x)=> list :+ x.mal_id),
      genres = input.genres.foldLeft(new Array[Int](input.genres.length))((list,x)=> list :+ x.mal_id),
      published_from = Timestamp.valueOf(input.aired.from.substring(0,19).replace("T", " ")),
      published_to = Timestamp.valueOf(input.aired.to.substring(0,19).replace("T", " "))
    )
  }
}
