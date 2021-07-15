package model.out

case class Author(
             id: Int,
             name: String,
             member_favorites: Int,
             about: String,
             published_manga: Seq[Int]
           )
