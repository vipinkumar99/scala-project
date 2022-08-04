package day23_tuples_options

object DemoBTuple {

  def main(args: Array[String]): Unit = {

    val carList = List(("Mercedes", "High Range"), ("Suzuki", "Mid Range"), ("Jaguar", "High Range")
      , ("BMW", "High Range"))
    carList.foreach {
      case ("Jaguar", range) => println("Car is Jaguar and the range is :" + range)
      case _ =>
    }

  }
}
