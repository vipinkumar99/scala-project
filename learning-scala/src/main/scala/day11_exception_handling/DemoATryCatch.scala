package day11_exception_handling

import java.io.{FileNotFoundException, FileReader, IOException}

object DemoATryCatch {

  def main(args: Array[String]): Unit = {
    try {
      var file = new FileReader("C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\test.txt");
      // val a = 10 / 0
      val array = Array(0)
      println(array(11))

    } catch {
      case ex: FileNotFoundException => {
        println("File not found exception!" + ex)
      }
      case zz: IOException => {
        println("Error while reading the file!" + zz.getMessage)
      }
      case e: ArithmeticException => {
        println("Arithmetic Exception" + e.getMessage)
      }
      case e: ArrayIndexOutOfBoundsException => {
        println("ArrayIndexOutOfBoundsException")
      }
      case e: Exception => {
        println("catch all exception")
      }
    } finally {
      println("It will always execute")
    }

  }
}
