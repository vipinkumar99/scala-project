package day17_functional_programming

object DemoFNestedFunction {

  def main(args: Array[String]): Unit = {
    printHello("World")
    printHello("India")
  }

  /*def printHello(str: String): Unit = {
    def printSomething(str1: String, str2: String): Unit = {
      println(str1.toUpperCase() + " " + str2.toUpperCase())
    }

    printSomething("Hello", str)
  }*/

  def printHello(str: String): Unit = {

    def printSomething(str1: String, str2: String): Unit = {
      printSomethingElse(str1 + " " + str2)

      def printSomethingElse(str1: String): Unit = {
        println(str1.toUpperCase())
      }
    }

    printSomething("Hello", str)
  }
}
