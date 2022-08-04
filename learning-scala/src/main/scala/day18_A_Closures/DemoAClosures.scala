package day18_A_Closures

//Closures: Variables are defined outside function definition
object DemoAClosures {

  def main(args: Array[String]): Unit = {
    /*  println(multiplier(5, 10))*/
    println(multiplier(5))
  }

  /*def multiplier(x: Int): Int = {
    x * 10
  }
*/
  /*var multiplier = (x: Int) => x * 10*/

  /* var multiplier = (x: Int, factor: Int) => x * factor*/
  var factor = 10
  var multiplier = (x: Int) => x * factor
  // if variable (eg:factor) is defined outside the function body, it is called as Closure
  // if variable used inside function body (eg factor) is neither a input parameter nor
  // defined inside function body
  var multiplier1 = (x: Int) => {
    var factor1 = 1
    x * factor1
  }
}
