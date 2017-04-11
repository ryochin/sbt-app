// import scala.language.postfixOps
// import scala.collection.mutable

import com.typesafe.config.{ ConfigFactory }
import com.typesafe.scalalogging.StrictLogging

object Main extends StrictLogging {
  val config = ConfigFactory.load

  def main(args: Array[String]): Unit = {
    val message = config.getString("app.message")
    logger.info(message)
  }
}
