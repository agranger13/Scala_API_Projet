package model.in
import io.circe.generic.extras.Configuration

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
                  related: Option[Related],
                  authors: Array[Id_Type_Name] = Array[Id_Type_Name](),
                  genres: Array[Id_Type_Name]  = Array[Id_Type_Name]()
                  )
object MangaIn{
  implicit val configuration: Configuration = Configuration.default.withDefaults
}