package model.out

import java.sql.Timestamp

case class Anime(
                  id: Int,
                  title: String,
                  synopsis: String,
                  status: String,
                  rating: String,
                  score: Double,
                  scored_by: Double,
                  rank: Int,
                  popularity: Int,
                  favorites :Int,
                  season: String,
                  published_from: Timestamp,
                  published_to: Timestamp,
                  adaptation: Array[Int],
                  studios: Array[Int],
                  genres: Array[Int],
                  recommendation: Array[Int]
                )
