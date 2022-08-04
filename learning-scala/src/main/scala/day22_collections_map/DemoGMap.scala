package day22_collections_map

object DemoGMap {

  def main(args: Array[String]): Unit = {
    var cars = scala.collection.mutable.Map("Mercedes" -> "High End", "BWM" -> "High End", "Toyota" -> "Mid End", "Nano" -> "Low End", "M800" -> "Low End")

    // do transformation on map
    cars.mapValues(value => value.toUpperCase()).foreach(println)
    cars.mapValues(value => value.length).foreach(println)

    // Note :- cars still not modified. mapValues return new map object

    var newCar = cars.transform((carName, carRange) => carName.length.toString)
    println(newCar)

  }
}
