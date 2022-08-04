package day22_collections_map

object DemoFMap {

  def main(args: Array[String]): Unit = {
    // creating the map with default value NULL
    var cars = scala.collection.mutable.Map("Mercedes" -> "High End", "BWM" -> "High End", "Toyota" -> "Mid End", "Nano" -> "Low End", "M800" -> "Low End")
      .withDefaultValue(null)
    println(cars("abc"))

    println(cars.get("abc"))
    // another way of doing using getOrElse method
    println(cars.getOrElse("abc", "I am not able to get-NULL"))
  }
}
