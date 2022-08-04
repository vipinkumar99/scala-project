package day16_functional_programming

object DemoFFunctionCallByNameCalculator {

  def main(args: Array[String]): Unit = {
    println("Addition is :" + calculator(add, 5, 2))
    println("Subtraction is :" + calculator(sub, 5, 2))
    println("Multiplication is :" + calculator(mul, 5, 2))
    println("Division is :" + calculator(div, 5, 2))
  }

  def calculator(m: (Int, Int) => Int, a: Int, b: Int): Int = {
    m(a, b)
  }

  var add = (a: Int, b: Int) => a + b
  var sub = (a: Int, b: Int) => a - b
  var mul = (a: Int, b: Int) => a * b
  var div = (a: Int, b: Int) => a / b


}
