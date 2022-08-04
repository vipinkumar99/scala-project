package day24_file_handling

object DemoBFileRead {

  def main(args: Array[String]): Unit = {
    var filePath = "C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\test.txt"
    println("=================Option-1===================")
    scala.io.Source.fromFile(filePath).foreach(print)
    println()
    println("=================Option-2===================")
    /* var lines = scala.io.Source.fromFile(filePath).getLines()
     lines.foreach(println)*/
    scala.io.Source.fromFile(filePath).getLines().foreach(println)
  }
}
