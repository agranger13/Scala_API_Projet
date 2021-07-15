package model.in

import io.circe.generic.extras.Configuration

case class Related(
                         Adaptation: Option[Array[Id_Type_Name]]  = Option(Array[Id_Type_Name]())
                         )
object Related{
  implicit val configuration: Configuration = Configuration.default.withDefaults
}