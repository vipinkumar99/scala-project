package day16_functional_programming

object DemoDFunctionCallByName {


  def main(args: Array[String]): Unit = {
    /*  printIncrementValue(2);*/
    /* printIncrementValue(increment());*/
    printValue(increment())
    printValue(decrement())
  }

  /*  def printIncrementValue(x: Int): Unit = {
    println("Addition value is:" + increment(x))
     }
   */


  /*def printIncrementValue(m: => Int): Unit = {
    println("Addition value is:" + m)
  }*/

  def printValue(m: => Int): Unit = {
    println("Value is:" + m)
  }


  /*def increment(y: Int): Int = {
    println("value before increment:" + y)
    var z = y + 1
    println("value after increment:" + z)
    z
  }*/

  def increment(): Int = {
    var y = 2
    println("value before increment:" + y)
    var z = y + 1
    println("value after increment:" + z)
    z
  }

  def decrement(): Int = {
    var y = 2
    println("value before decrement:" + y)
    var z = y - 1
    println("value after decrement:" + z)
    z
  }

}
