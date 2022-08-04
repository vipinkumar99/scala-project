package day15_functional_programming

object DemoDDefaultParameter {

  def div(x: Int = 5, y: Int = 1): Double = {
    println("value of x is:" + x)
    println("value of y is:" + y)
    return x / y.toDouble
  }

  def main(args: Array[String]): Unit = {
    println("Enter 2 numbers")
    var a: Int = readInt()
    var b: Int = readInt()
    println(div(a, b))
    println(div(2, 3))
    println(div(2, 0))
    println(div(2))
    println(div(y = 2))
  }
}
