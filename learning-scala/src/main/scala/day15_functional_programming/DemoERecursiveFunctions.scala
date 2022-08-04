package day15_functional_programming

object DemoERecursiveFunctions {


  def factorial(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }


  def main(args: Array[String]): Unit = {
    val fact = factorial(5)
    println(fact)
  }
}
