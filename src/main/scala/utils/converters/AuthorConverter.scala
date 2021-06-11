package utils.converters
import model.in.AuthorIn
import model.out.Author

object AuthorConverter extends Converter[AuthorIn, Author] {
  override def convert(input: AuthorIn): Author =
    Author(
      id = input.mal_id,
      name = input.name,
      member_favorites = input.member_favorites,
      about = input.about,

      published_manga = input.published_manga.foldLeft(new Array[Int](input.published_manga.length))((list,x)=> list :+ x.mal_id)
    )

}