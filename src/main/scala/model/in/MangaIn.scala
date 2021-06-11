package model.in

case class MangaIn(
                  mal_id: Int,
                  title: String = "",
                  synopsis: String = "",
                  publishing: Boolean = false,
                  published: Aired = null,
                  score: Double = -1,
                  scored_by: Double = -1,
                  rank: Int = -1,
                  popularity: Int = -1,
                  favorites :Int = -1,
                  related: Related,
                  authors: Array[Id_Type_Name] = Array[Id_Type_Name](),
                  genres: Array[Id_Type_Name]  = Array[Id_Type_Name]()
                  )
