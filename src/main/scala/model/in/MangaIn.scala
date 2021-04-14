package model.in

case class MangaIn(
                  mal_id: Int,
                  title: String,
                  synopsis: String,
                  publishing: String,
                  published: Array[String],
                  score: Double,
                  scored_by: Double,
                  rank: Int,
                  popularity: Int,
                  favorites :Int,
                  Adaptation: Array[Int],
                  authors: Array[Int],
                  genres: Array[Int],
                  recommendation: Array[Int]
                  )
