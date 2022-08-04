package day16_functional_programming


object DemoBAnonymousFunction {


  def main(args: Array[String]): Unit = {
    var listOfNumbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    /*var divisibleByThreeOutput = listOfNumbers.foreach(num => if (divisibleByThree(num)) println(num))
    println(divisibleByThreeOutput)*/

    /*var divisibleByThreeOutput = listOfNumbers.foreach(num => {
      if (divisibleByThree(num)) {
        println(num + " is divisible by three")
      } else {
        println(num + " not is divisible by three")
      }
    })*/

    /*  var divisibleByThreeOutput = listOfNumbers.filter((x: Int) => x % 3 == 0)*/
    var divisibleByThreeOutput = listOfNumbers.filter(_ % 3 == 0)
    divisibleByThreeOutput.foreach(x => print(x + " "))
  }

  /*def divisibleByThree(x: Int): Boolean = {
    x % 3 == 0
  }*/

  var divisibleByThree = (x: Int) => x % 3 == 0


}
