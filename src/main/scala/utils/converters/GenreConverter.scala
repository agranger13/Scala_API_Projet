package utils.converters

import model.in.GenreIn
import model.out.Genre

object GenreConverter extends Converter[GenreIn, Genre] {

  override def convert(input: GenreIn): Genre = {
    Genre(
      id = input.mal_url.mal_id,
      typeg = input.mal_url.`type`,
      name = input.mal_url.name,
      item_count = input.item_count
    )
  }
}
