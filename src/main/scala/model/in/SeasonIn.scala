package model.in

case class SeasonIn(
                   season_name: String = "",
                   season_year: Int = -1,
                   anime : Array[Id_Type_Title] = Array[Id_Type_Title]()
                   ) extends ModelIN