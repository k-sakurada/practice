import org.scalatest._
import org.scalatest.FlatSpec

class Test extends FlatSpec with DiagrammedAssertions {

  "Test" should "True" in {
    assert(true)
  }
}