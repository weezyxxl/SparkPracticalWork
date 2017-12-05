import org.apache.spark.{SparkConf, SparkContext}

object TestScala {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.setAppName("Spark App")
    conf.setMaster("local[2]")

    val sc = new SparkContext(conf)
    

    //FASE 1: Cargar los datos
    val inputRDD = sc.textFile("2008.csv")
    // Imprime las 10 primeras líneas del dataset
    val prueba = inputRDD.take(10)
    for (i <- 0 to 9) {
      println(prueba(i))
    }

    //FASE 2: Procesar los datos
    //2.1) Seleccionar las variables a usar (filter)
   // val selectedRDD = prueba.map(x => (x.))
    //2.2) Transformar las variables que no se van a usar o que no se puedan usar en
    //su forma cruda
    //2.3) Crear nuevas variables derivadas que puedan ser útiles para formar un modelo mejor


    //FASE 3: Crear el modelo
    //Despues de seleccionar las variables definitivas, se tiene que entrenar el modelo usando
    //como target ArrDelay
    //Se puede seleccionar cualquier técnica de machine learning que proporcione la Api de Spark
    //Se tendrá que justificar el método empleado


    //FASE 4: Validar el modelo
    //Proporcionar alguna medida de precisión
    //Seleccionar la técnica de validación
    //Justificar técnica empleada

  }
}