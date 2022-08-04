package day22_collections_map

object DemoAMap {

  def main(args: Array[String]): Unit = {
    //class scala.collection.immutable.HashMap$HashTrieMap
    // it is by default immutable
    var cars1 = Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    println(cars1.getClass)
    var cars2 = Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range", "Mercedes" -> "Low Range")
    cars2 += ("Suzuki" -> "Mid Range")
    println(cars2)
    // Sequence of data insertion is not preserved in map
    // whenever duplicate key data is insert it will
    // insert latest one data

    val cars3 = Map("Mercedes" -> "High Range", "BWM" -> "High Range", "Toyota" -> "High Range", "Jaguar" -> "High Range", "Nano" -> "Low Range", "Mercedes" -> "Low Range")
    // can not add element to cars3 because it is val type
    // cars3 += ("Suzuki" -> "Mid Range")
  }
}
