package model.in

case class AuthorIn(
                   mal_id: Int ,
                   name: String = "",
                   member_favorites: Int = -1,
                   about: String = "",
                   published_manga: Array[Id_Type_Name]  = Array[Id_Type_Name]()
                   )
