package model.in

import io.circe.generic.extras.Configuration

case class Related(
                         Adaptation: Option[Array[Id_Type_Name]]  = Option(Array[Id_Type_Name]())
                         )
