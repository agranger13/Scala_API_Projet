package model.in

case class AuthorIn(
                   mal_id: String,
                   name: String,
                   member_favorites: Int,
                   about: String,
                   published_manga: Array[Int]
                   )
