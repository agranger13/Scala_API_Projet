package model.out

import java.sql.Timestamp

case class Manga(
                 id: Int,
                 title: String,
                 synopsis: String,
                 publishing: String,
                 published_from: Timestamp,
                 published_to: Timestamp,
                 score: Double,
                 scored_by: Double,
                 rank: Int,
                 popularity: Int,
                 favorites :Int,
                 adaptation: Array[Int],
                 authors: Array[Int],
                 genres: Array[Int],
                 recommendation: Array[Int]
                )
