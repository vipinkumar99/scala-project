package day17_functional_programming

object DemoAFunctionByValue {

  def main(args: Array[String]): Unit = {
    /* println("Main Function :" + exec(time1()))*/
    println("Main Function :" + exec(time1(), time2()))
  }

  def time1(): Long = {
    println("Inside time-1 function")
    return System.nanoTime()
  }

  def time2(): Long = {
    println("Inside time-2 function")
    return System.nanoTime()
  }

  def exec(t: Long): Long = {
    println("Inside exec function")
    println("Time :" + t)
    println("Exiting from the function")
    return t
  }

  def exec(t: Long, u: Long): Long = {
    println("Inside exec function")
    println("Time-t :" + t)
    println("Time-u :" + u)
    println("Exiting from the function")
    return t
  }

  // Note:-
  //1. It will first execute the inside function "time()" and then execute the outside
  // function "exec(1506256161324800)"
  //2.Since inside function "time()" get executed first, it calls outside function "exec(1506256161324800)"
  //using the value 1506256161324800 it is called as "Function by value"
}

