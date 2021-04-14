package model.out

case class Author(
             id: String,
             name: String,
             member_favorites: Int,
             about: String,
             published_manga: Array[Int]
           )
