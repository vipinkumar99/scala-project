package day20_collections_list

object CarDemo {

  def main(args: Array[String]): Unit = {
    var car1 = new Cars("Mercedes", 50000)
    var car2 = new Cars("BMW", 80000)
    var car3 = new Cars("Jaguar", 70000)

    var listOfCars = List(car1, car2, car3)
    println(listOfCars)
    //sort cars list by cost asc order
    var sortedCarListAsc = listOfCars.sortBy(car => car.cost)
    println(sortedCarListAsc)
    //sort cars list by cost desc order
    var sortedCarListDesc = listOfCars.sortBy(_.cost).reverse
    println(sortedCarListDesc)
    //sort cars list by name asc order
    var sortedByName = listOfCars.sortBy(_.name)
    println(sortedByName)



  }


}



