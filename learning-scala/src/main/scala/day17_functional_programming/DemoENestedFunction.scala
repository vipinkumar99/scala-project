package day17_functional_programming

object DemoENestedFunction {

  def main(args: Array[String]): Unit = {

    var printHello = (msg: String) => println("Hello " + msg)
    /*def printHello(msg: String): Unit = {
      println("Hello " + msg)
    }*/

    printHello("World")
    printHello("India")


  }


}
