package utils.handlers
import model.out.{Anime, Author, Genre, Manga, Season}
import org.bson.codecs.configuration.CodecRegistries.{fromProviders, fromRegistries}

import org.mongodb.scala.bson.codecs.Macros._
import org.mongodb.scala.MongoClient.DEFAULT_CODEC_REGISTRY
import org.mongodb.scala.{MongoClient, MongoCollection, MongoDatabase}

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.reflect.ClassTag



object WriteToMongoDB {

  def write[OUT:ClassTag](objApi : OUT) = {
    val customCodecs = fromProviders(classOf[Season],classOf[Genre],classOf[Anime],classOf[Manga],classOf[Author])

    val mongoClient: MongoClient = MongoClient()
    val codecRegistry = fromRegistries(customCodecs, DEFAULT_CODEC_REGISTRY )
    val database: MongoDatabase = mongoClient.getDatabase("API_MyAnimeList").withCodecRegistry(codecRegistry)
    val collection: MongoCollection[OUT] = database.getCollection(objApi.getClass.getSimpleName)
    Await.result(collection.insertOne(objApi).toFuture(),5 seconds)
  }

}
