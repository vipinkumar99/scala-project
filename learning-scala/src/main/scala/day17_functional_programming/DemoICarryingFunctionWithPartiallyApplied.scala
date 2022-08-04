package day17_functional_programming

object DemoICarryingFunctionWithPartiallyApplied {

  def add(a: Int)(b: Int) = a + b

  def main(args: Array[String]): Unit = {
    val sum = add(29) _; //partially Applied Function
    println(sum(5))
  }

  //Function chaining (result you get is chain of function)
  //=Function currying (separate parameters in different brackets )
  //partially applied function (i.e use _ )
}
