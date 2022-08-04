package day15_functional_programming

object DemoAFunctions {

  def sum(x: Int, y: Int): Int = {
    println("value of x=" + x)
    println("value of y=" + y)
    var sum = x + y
    return sum
  }

  def main(args: Array[String]): Unit = {
    println(sum(2, 3))
    println(sum(y = 10, x = 5))
  }
}
