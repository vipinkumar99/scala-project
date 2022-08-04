package day17_functional_programming

//Note :- Without partially applied function
object DemoDPartiallyAppliedFunctions {

  def main(args: Array[String]): Unit = {
    /* fourWheeler("Mercedes", "Car", 200000)*/
    car("Mercedes")
    car("BMW")
    truck("BMW")
  }


  /*def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int): Unit = {
    println("Vehicle Name is:" + vehicleName + ",Vehicle Type is:" + vehicleType + ",Vehicle Cost is:" + vehicleCost)
  }*/


  val car = fourWheeler(_: String, "Car", 20000) //partially implemented function
  val truck = fourWheeler(_: String, "Truck", 50000) //partially implemented function


  val fourWheeler = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
    println("Vehicle Name is:" + vehicleName + ",Vehicle Type is:" + vehicleType + ",Vehicle Cost is:" + vehicleCost)
  }

}
