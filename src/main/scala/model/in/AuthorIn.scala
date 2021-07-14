package model.in

case class AuthorIn(
                   mal_id: Int ,
                   name: String = "",
                   member_favorites: Int = -1,
                   about: String = "",
                   published_manga: Array[OeuvreIn] = Array[OeuvreIn]()
                   ) extends ModelIN
