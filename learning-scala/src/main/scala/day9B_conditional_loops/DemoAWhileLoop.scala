package day9B_conditional_loops

object DemoAWhileLoop {


  def main(args: Array[String]): Unit = {
    var x = 1
    println("while loop")
    while (x < 10) {
      println("value of x is = " + x)
      x = x + 1
    }

    println("do while loop")
    var y = 1
    do {
      println("value of y is = " + y)
      y = y + 1
    } while (y < 10)
  }
}
