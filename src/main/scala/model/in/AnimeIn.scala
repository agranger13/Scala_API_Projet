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
                    related: Related,
                    studios: Array[Id_Type_Name]  = Array[Id_Type_Name](),
                    genres: Array[Id_Type_Name]  = Array[Id_Type_Name]()
                )

