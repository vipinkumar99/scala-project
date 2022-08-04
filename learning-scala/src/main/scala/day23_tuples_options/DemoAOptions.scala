package day23_tuples_options

object DemoAOptions {

  def main(args: Array[String]): Unit = {
    // Options{Similar to HashMap in java, gives value or Null}
    //Option[T] => Some[T] or None
    // define a option
    val option1: Option[Int] = Some(10)
    println(option1)

    val option2 = Some(10)
    println(option2)

    var option3: Option[Int] = Some(10)
    println(option3)
    // Using isEmpty() to check if it is has Some(return False) or None(return True)
    println(option3.isEmpty)
    option3 = None
    println(option3.isEmpty)
    println(option3)
    var cars1 = Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    println(cars1.get("Jaguar1"))
    println(cars1.get("BWM"))
    println(removeSome(cars1.get("BWM")))
    println(removeSome(cars1.get("Jaguar1")))

  }


  def removeSome(x: Option[String]): String = {
    x match {
      case Some(y) => y
      case None => "Not Found"
    }
  }

}