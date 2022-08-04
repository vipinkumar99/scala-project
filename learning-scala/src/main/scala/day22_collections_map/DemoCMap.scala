package day22_collections_map

object DemoCMap {

  def main(args: Array[String]): Unit = {
    // create mutable collection
    var cars1 = scala.collection.mutable.Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    cars1 += ("Suzuki" -> "Mid Range")
    //    println(cars1)
    // get all keys
    println(cars1.keys)
    // get all values
    println(cars1.values)
    // check empty or not
    println(cars1.isEmpty)
    //
    println(cars1.min)
    println(cars1.max)

    var emptyMap = Map()
    println(emptyMap.isEmpty)
    // get first element
    println(cars1.head)
    // get all elements expect first element
    println(cars1.tail)
  }
}
