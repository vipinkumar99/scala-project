package day16_functional_programming

object DemoCAnonymousFunction {


  def main(args: Array[String]): Unit = {
    var listOfNumbers: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var squareOfNumbers1 = listOfNumbers.map(square)
    println(squareOfNumbers1)

    var squareOfNumbers2 = listOfNumbers.map(x => x * x)
    println(squareOfNumbers2)

    var doubleOfNumbers = listOfNumbers.map((x: Int) => x * 2)
    /*var doubleOfNumbers = listOfNumbers.map(x => x * 2)*/
    /* var doubleOfNumbers = listOfNumbers.map(_ * 2)*/
    println(doubleOfNumbers)


  }

  // Traditional way
  /*def square(x: Int): Int = {
    x * x
  }*/

  // Functional way
  var square = (x: Int) => x * x

  // var square:Int=>Int = (x: Int) => x * x

}
