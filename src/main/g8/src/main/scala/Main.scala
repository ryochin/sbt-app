import scala.collection.mutable
import scala.language.postfixOps

import com.typesafe.config.{ Config, ConfigFactory }
import com.typesafe.scalalogging.StrictLogging

object Main extends StrictLogging {
  val config = ConfigFactory.load

  def main(args: Array[String]): Unit = {
    val message = config.getString("app.message")
    logger.info(message)
  }
}
