package day23_tuples_options

object DemoBOptions {

  def main(args: Array[String]): Unit = {

    // Get will give error if option is having None value
    // With None -> gives error
    val option1: Option[Int] = None
    //  println(option1.get)
    // if it was Some -> it will retrieve the element
    val option2: Option[Int] = Some(10)
    println(option2.get)

    // Instead you can getOrElse
    val option3: Option[Int] = Some(10)
    println(option3.getOrElse(0))

    val option4: Option[Int] = None
    println(option4.getOrElse(0))

  }


  def removeSome(x: Option[String]): String = {
    x match {
      case Some(y) => y
      case None => "Not Found"
    }
  }

}