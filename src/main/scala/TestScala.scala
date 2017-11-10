import org.apache.spark.{SparkConf, SparkContext}

object TestScala {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.setAppName("Spark App")
    conf.setMaster("local[2]")

    val sc = new SparkContext(conf)
    val pagecounts = sc.textFile("2008.csv")

    // Imprime las 10 primeras líneas del dataset
    val prueba = pagecounts.take(10)
    for (i <- 0 to 9) {
      println(prueba(i))
    }

  }
}