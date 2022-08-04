package day22_collections_map

object DemoDMap {

  def main(args: Array[String]): Unit = {

    val cars1 = scala.collection.mutable.Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    // -= operator work for both var and val because it is mutable
    cars1 -= "Toyota"
    // put method is available in only mutable
    cars1.put("Suzuki", "Low Range")
    println(cars1)

    // remove key Suzuki  and return the value Low Range
    println(cars1.remove("Suzuki"))
    // try to remove key Suzuki and if not found return None as value
    println(cars1.remove("Suzuki"))

    println(cars1.get("Suzuki"))


    var cars2 = scala.collection.immutable.Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    // -= operator work well only for var in case of immutable map
    // Reason :- -= operator in case of immutable RETURNS a new map/data structure and to re-allocate
    // the object, only work with var
    //   cars2 -= "Toyota"
    //println(cars2)

    cars2 -= "Mercedes"
    println(cars2)
    // try to remove element again
    cars2 -= "Mercedes"
    // remove more element
    cars2 --= List("Toyota", "BWM")
    println(cars2)


  }
}
