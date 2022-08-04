package day16_functional_programming

object DemoEFunctionCallByName {

  def main(args: Array[String]): Unit = {
    printValue(increment, 2)
    printValue(decrement, 2)
  }


  def printValue(m: (Int) => Int, x: Int): Unit = {
    println("Value is:" + m(x))
  }


  def increment(y: Int): Int = {
    println("value before increment:" + y)
    var z = y + 1
    println("value after increment:" + z)
    z
  }

  def decrement(y: Int): Int = {
    println("value before decrement:" + y)
    var z = y - 1
    println("value after decrement:" + z)
    z
  }

}
