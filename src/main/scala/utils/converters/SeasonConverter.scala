package utils.converters
import model.in.SeasonIn
import model.out.Season

object SeasonConverter extends Converter[SeasonIn, Season] {
  override def convert(input: SeasonIn): Season = {
    Season(
      season_name = input.season_name,
      season_year = input.season_year,
      anime_season = input.anime
    )
  }
}
