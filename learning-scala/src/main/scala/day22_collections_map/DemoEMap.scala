package day22_collections_map

object DemoEMap {

  def main(args: Array[String]): Unit = {
    var highAndMidEndCar = Map("Mercedes" -> "High End", "BWM" -> "High End", "Toyota" -> "Mid End")
    var lowEndCar = Map("Nano" -> "Low End", "M800" -> "Low End")
    // combine two map
    /*var car = highAndMidEndCar ++ lowEndCar*/
    /* var car = highAndMidEndCar ++(lowEndCar)*/
    var car = highAndMidEndCar.++(lowEndCar)
    println(car)
    car.keys.foreach(key => {
      println("key=" + key + " value=" + car(key))
    })

    car.foreach(c => {
      println("key=" + c._1 + " value=" + c._2)
    })

    // car.foreach(case(carName, carRange) => println("key=" + carName + " value=" + carRange))

    println(car.contains("Toyota"))
    //check if value is present or not
    println(car.valuesIterator.exists(_.equals("High End")))
    println(car.valuesIterator.exists(_.contains("d Ra")))
    // contains check wild "Hi" char is present in value string
    println(car.valuesIterator.exists(_.contains("Hi")))

  }
}
