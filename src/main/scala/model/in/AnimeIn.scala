package model.in

case class AnimeIn(
                mal_id: String,
                title: String,
                synopsis: String,
                status: String,
                rating: String,
                score: Double,
                scored_by: Double,
                rank: Int,
                popularity: Int,
                favorites :Int,
                premiered: String,
                Adaptation: Array[Int],
                studios: Array[Int],
                genres: Array[Int]
                )

// MangaIn
// StudioIn
// GenreIn
// UserIn
// SeasonIn
// AuthorIn
//
