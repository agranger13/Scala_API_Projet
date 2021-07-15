package utils.handlers

import scala.io.Source

trait IOReader{
  def read(url: String): String
}

trait IOApiReader extends IOReader{
  override def read(url: String): String
}

object AbstractApiReader extends IOApiReader {
  override def read(url: String): String = {
    // Permet de bypass la limite de requete (2 requetes/sec)
    Thread.sleep(1500)
    try{
      val r = requests.get(url)
      r.text()
    }catch{
      case e: Exception => println(e)
        "error"
    }
  }
}
