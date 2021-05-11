package utils.converters

import model.in.GenreIn
import model.out.Genre

object GenreConverter extends Converter[GenreIn, Genre] {

  override def convert(input: GenreIn): Genre = {
    Genre(
      mal_id = input.mal_id,
      typeg = input.typeg,
      name = input.name,
      item_count = input.item_count,
      anime = input.anime
    )
  }
}
