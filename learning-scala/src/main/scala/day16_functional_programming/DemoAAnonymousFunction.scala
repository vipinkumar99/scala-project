package day16_functional_programming

//Function without a name and def keyword
//First class function. Pass function as parameter and define function value


object DemoAAnonymousFunction {


  def main(args: Array[String]): Unit = {
    println("Increment Function output is: " + increment1(5))
    println("Increment Function output is: " + increment2(5))
    printHelloWorld1
    println(add(2, 5))

  }

  // Anonymous function with 1 input parameter and 1 output parameter
  //Normal way of defining an increment function
  def increment1(x: Int): Int = {
    x + 1
  }

  //Using function value/ Anonymous
  //val increment2=(x:Int)=>x+1
  val increment2 = (x: Int) => {
    println("value of x is:" + x)
    x + 1
  }

  //Anonymous function with 0 input parameter and 0 output parameter
  // Normal way of defining function
  def printHelloWorld1: Unit = {
    println("Hello world")
  }

  //using function value/Anonymous function
  var printHelloWolrd2 = () => println("Hello World")


  def add(x: Int, y: Int): Int = {
    x + y
  }


}
