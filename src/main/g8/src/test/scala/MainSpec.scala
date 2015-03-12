import org.scalatest.FunSpec
import org.scalatest.Matchers._

class MainSpec extends FunSpec {
  describe("first test") {
    it("contains string hello") {
      "hello world" should include("hello")
    }
  }
}
