package model.in

case class MangaIn(
                  mal_id: Int,
                  title: String = "",
                  synopsis: String = "",
                  publishing: String = "",
                  aired: Aired = null,
                  score: Double = -1,
                  scored_by: Double = -1,
                  rank: Int = -1,
                  popularity: Int = -1,
                  favorites :Int = -1,
                  related: RelatedMangaIn,
                  authors: Array[AuthorIn] = Array[AuthorIn](),
                  genres: Array[GenreInfo]  = Array[GenreInfo]()
                  )
