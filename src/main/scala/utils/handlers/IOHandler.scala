package utils.handlers

trait IOReader{
  def read(url: String): String
}

trait IOApiReader extends IOReader{
  override def read(url: String): String
}

object AbstractApiReader extends IOApiReader {
  override def read(url: String): String = ???
}
