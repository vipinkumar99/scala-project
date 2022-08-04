package day17_functional_programming

object DemoHCarryingFunction {

  def main(args: Array[String]): Unit = {
    val str1 = "Hello"
    val str2 = "World"
  //  val byeFunction = printSomething("Bye") _
    /* println("str1,str2 " + printSomething(str1, str2))*/
    /*println("str1,str2 " + printSomething(str1)(str2))*/
   // println("str1,str2 " + byeFunction(str2))
  }

  /* def printSomething(str1: String, str2: String): String = {
     str1 + " " + str2
   }*/

  /* def printSomething(str1: String)(str2: String): String = {
     str1 + " " + str2
   }*/


  def printSomething(str1: String) = (str2: String) => str1 + " " + str2


}
