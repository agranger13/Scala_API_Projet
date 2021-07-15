package utils.converters

import model.in.{AnimeIn, MangaIn}
import model.out.{Anime, Genre, Manga}

import java.sql.Timestamp
import java.time.LocalDateTime

object MangaConverter extends Converter[MangaIn, Manga] {
  override def convert(input: MangaIn): Manga = {
    val today = LocalDateTime.now()
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
      adaptation = if(input.related.get.Adaptation == None) Seq[Int]()
        else input.related.get.Adaptation.get.foldLeft(Seq[Int](input.related.get.Adaptation.get.length))((list,x)=> list :+ x.mal_id),
      genres = input.genres.foldLeft(Seq[Int](input.genres.length))((list,x)=> list :+ x.mal_id),
      published_from = if(input.published.from == "null") Timestamp.valueOf(today) else Timestamp.valueOf(input.published.from.substring(0,19).replace("T", " ")),
      published_to = if(input.published.to == "null") Timestamp.valueOf(today) else Timestamp.valueOf(input.published.to.substring(0,19).replace("T", " "))
    )
  }
}
