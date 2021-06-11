package model.in

case class FavoritesIn(
                      anime : Array[AnimeIn] = Array[AnimeIn](),
                      manga : Array[MangaIn] = Array[MangaIn]()
                    )
