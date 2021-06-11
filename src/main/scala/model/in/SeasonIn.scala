package model.in

case class SeasonIn(
                   season_name: String = "",
                   season_year: String = "",
                   anime : Array[AnimeIn] = Array[AnimeIn]()
                   )