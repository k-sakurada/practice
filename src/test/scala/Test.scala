import org.apache.spark.sql.{DataFrame, SparkSession}
import org.scalatest._
import org.scalatest.FlatSpec

class Test extends FlatSpec with DiagrammedAssertions with GivenWhenThen with Matchers {
  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .master("local[*]")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

  import spark.implicits._
  "Test" should "True" in {
    assert(true)
  }

  "df count" should "2" in {
    Given("2行のdfを作成")
    val df: DataFrame = Seq(1,2).toDF

    When("df.count")
    val count: Long = df.count()

    Then("countが2であること")
    assert(count == 2)
  }
}