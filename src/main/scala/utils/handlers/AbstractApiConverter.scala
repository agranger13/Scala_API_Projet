package utils.handlers

import io.circe.{Decoder}
import io.circe.generic.auto._
import io.circe.generic.extras.Configuration
import io.circe.parser._
import model.in.{AnimeIn, AuthorIn, GenreIn, MangaIn, SeasonIn}
import utils.converters.{AnimeConverter, AuthorConverter, GenreConverter, MangaConverter, SeasonConverter}

import scala.reflect.{ClassTag, classTag}

object AbstractApiConverter{

  def convert[IN : ClassTag,OUT](jsonString : String): OUT = {
    println(classTag[IN].runtimeClass)

    implicit def decodeString: Decoder[String] =
      Decoder.decodeOption(Decoder.decodeString).map(s=>if (s == None) "null" else s.get)
    implicit def decodeInt: Decoder[Int] =
      Decoder.decodeOption(Decoder.decodeInt).map(s=>if (s == None) -1 else s.get)
    implicit val configuration: Configuration = Configuration.default.withDefaults

    classTag[IN] match {
      case strTag if strTag == classTag[AnimeIn] => val decodedObject = decode[AnimeIn](jsonString)
        AnimeConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[MangaIn] => val decodedObject = decode[MangaIn](jsonString)
        println(decodedObject)
        MangaConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[AuthorIn] => val decodedObject = decode[AuthorIn](jsonString)
        AuthorConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[GenreIn] => val decodedObject = decode[GenreIn](jsonString)
        GenreConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
      case strTag if strTag == classTag[SeasonIn] => val decodedObject = decode[SeasonIn](jsonString)
        SeasonConverter.convert(decodedObject.toSeq(0)).asInstanceOf[OUT]
    }

  }
}
