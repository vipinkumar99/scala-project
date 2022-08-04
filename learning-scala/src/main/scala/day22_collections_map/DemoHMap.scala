package day22_collections_map

object DemoHMap {

  def main(args: Array[String]): Unit = {
    // SortedMap give sorted key value
    var cars1 = scala.collection.SortedMap("Mercedes" -> "High End", "BWM" -> "High End", "Toyota" -> "Mid End", "Nano" -> "Low End", "M800" -> "Low End")
    println(cars1)

    // ListMap preserve the sequence of insertion
    var cars2 = scala.collection.immutable.ListMap("Mercedes" -> "High End", "BWM" -> "High End", "Toyota" -> "Mid End", "Nano" -> "Low End", "M800" -> "Low End")
    println(cars2)
    // it is not preserving the sequence
    var cars3 = scala.collection.mutable.ListMap("Mercedes" -> "High End", "BWM" -> "High End", "Toyota" -> "Mid End", "Nano" -> "Low End", "M800" -> "Low End")
    println(cars3)
    // preserve the sequence and append at the end
    var cars4 = scala.collection.mutable.LinkedHashMap("Mercedes" -> "High End", "BWM" -> "High End", "Toyota" -> "Mid End", "Nano" -> "Low End", "M800" -> "Low End", "1" -> "1")
    println(cars4)
    // store based on hash
    var cars5 = scala.collection.mutable.HashMap("Mercedes" -> "High End", "BWM" -> "High End")
    println(cars5)

  }
}
