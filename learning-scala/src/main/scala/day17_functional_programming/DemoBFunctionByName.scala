package day17_functional_programming

object DemoBFunctionByName {

  def main(args: Array[String]): Unit = {
    /*println("Main Function :" + exec(time1()))*/
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

  def exec(t: => Long): Long = {
    println("Inside exec function")
    println("Time :" + t)
    println("Exiting from the function")
    return t
  }

  def exec(t: => Long, u: => Long): Long = {
    println("Inside exec function")
    println("Time :" + t)
    println("Time :" + u)
    println("Exiting from the function")
    return t
  }

  // Note:-
  //1. It will first execute the outside function "exec()" and then execute the inside
  // function "time()" every time t is being referred
  //2.Since outside function "exec()" got executed first, it calls inside function "time()"
  //using the reference variable t,  it is called as "Function by Name"
}

