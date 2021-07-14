package utils.handlers

import io.circe.generic.auto._
import io.circe.parser._
import model.in.{AnimeIn, AuthorIn, GenreIn, MangaIn, ModelIN, SeasonIn}
import model.out.{Anime, Genre, Manga}
import shapeless.|∨|
import utils.converters.{AnimeConverter, AuthorConverter, Converter, GenreConverter, MangaConverter, SeasonConverter}

import scala.reflect.{ClassTag, classTag}

object AbstractApiConverter{

  def convert[IN : ClassTag,OUT](jsonString : String): OUT = {
    println(classTag[IN].runtimeClass)
    classTag[IN] match {
      case strTag if strTag == classTag[AnimeIn] => val decodedObject = decode[AnimeIn](jsonString)
        AnimeConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[MangaIn] => val decodedObject = decode[MangaIn](jsonString)
        MangaConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[AuthorIn] => val decodedObject = decode[AuthorIn](jsonString)
        AuthorConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[GenreIn] => val decodedObject = decode[GenreIn](jsonString)
        print(decodedObject)
        GenreConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[SeasonIn] => val decodedObject = decode[SeasonIn](jsonString)
        print(decodedObject)
        SeasonConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
    }

  }
}
