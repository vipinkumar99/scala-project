package day15_functional_programming

object DemoCVariableNumberOfArgument {

  def printMultipleTimes(n: Int, args: String*): Unit = {
    for (arg <- args) {
      println(arg * n)
    }
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(2, "Hello", "World", "India")
  }
}

//Note:-
//1.Variable number argument args: String* should be always at the end/should be last parameter
//2. You can't declare two time String* variable
