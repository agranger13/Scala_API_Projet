package model.in

case class AnimeIn(
                mal_id: Int,
                title: String = "",
                synopsis: String  = "",
                status: String  = "",
                rating: String  = "",
                score: Double  = -1,
                scored_by: Double  = -1,
                rank: Int  = -1,
                popularity: Int  = -1,
                favorites :Int  = -1,
                premiered: String  = "",
                aired: Aired  = null,
                Adaptation: Array[MangaIn]  = Array[MangaIn](),
                studios: Array[StudioIn] = Array[StudioIn](),
                genres: Array[GenreIn]  = Array[GenreIn]()
                )

