import org.specs2._

class MainSpec extends Specification {
  def is = s2"""

  main() tests

  hello
    contains string hello        \$p1
  """

  def p1 = "hello world".matches("hello.+")
}
