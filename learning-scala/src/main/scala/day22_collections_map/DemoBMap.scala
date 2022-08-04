package day22_collections_map

object DemoBMap {

  def main(args: Array[String]): Unit = {
    // create mutable collection
    var cars1 = scala.collection.mutable.Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    cars1 += ("Suzuki" -> "Mid Range")
    println(cars1)

    val cars2 = scala.collection.mutable.Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    cars2 += ("Suzuki" -> "Mid Range")
    println(cars2)

    //We are able to insert new element for val in case of immutable map
    // Reason:-
    // 1. += operator behaves differently in scala.collection.immutable.Map
    // and scala.collection.mutable.Map
    //2. In immutable map += operator will return a new map
    // object and new object can only be saved if the object is type of var
    //3. In mutable map += operator will modify the existing map object
    // Hence it will work on both var and val
  }
}
