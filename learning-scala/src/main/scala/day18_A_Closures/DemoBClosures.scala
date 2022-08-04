package day18_A_Closures

//Even or Odd
// print even and odd number
object DemoBClosures {

  def main(args: Array[String]): Unit = {
    /* println(isEven(2))
     println(isEven(3))
     println(isEven(4))
     println(isEven(5))
     println(isEven(6))
     println(isEven(7))*/
    println(evenOrOdd(2))
    println(evenOrOdd(3))
    println(evenOrOdd(isEven, 2))
    println(evenOrOdd(isEven, 3))
  }

  /*def isEven(number: Int): Boolean = {
    number % 2 == 0
  }*/
  var division = 2
  var isEven = (n: Int) => n % division == 0
  /* var isEven: (Int) => Boolean = (n) => {
     n % 2 == 0
   }*/

  def evenOrOdd(x: Int): String = {
    var evenFlag = isEven(x)
    if (evenFlag) {
      "Even Number"
    } else {
      "Odd Number"
    }
  }

  def evenOrOdd(f: Int => Boolean, x: Int): String = {
    var evenFlag = f(x)
    if (evenFlag) {
      "Even Number"
    } else {
      "Odd Number"
    }
  }
}
