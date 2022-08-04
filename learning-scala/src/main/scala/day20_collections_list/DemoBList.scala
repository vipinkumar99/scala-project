package day20_collections_list

object DemoBList {

  def main(args: Array[String]): Unit = {
    var list = List(0, 5, 2, 6, 9, 1, 25, 18)
    var ascList = list.sortWith((x, y) => x < y)
    println(ascList)
    var descList = list.sortWith((x, y) => x > y)
    println(descList)
    var descList1 = list.sortWith(_ > _)
    println(descList1)

    var car1 = new Cars("Mercedes", 50000)
    var car2 = new Cars("BMW", 80000)
    var car3 = new Cars("Jaguar", 70000)

    var listOfCars = List(car1, car2, car3)
    //sort car by cost asc
    var listOfCarsCostAsc = listOfCars.sortWith((c1, c2) => c1.cost < c2.cost)
    println(listOfCarsCostAsc)
    //sort car by cost desc
    var listOfCarsCostDesc = listOfCars.sortWith((c1, c2) => c1.cost > c2.cost)
    println(listOfCarsCostDesc)
    //sort car by cost desc shorten notation
    var listOfCarsCostDescSort = listOfCars.sortWith(_.cost > _.cost)
    println(listOfCarsCostDescSort)
    //sort car by name asc shorten notation
    var listOfCarsNameAscSort = listOfCars.sortWith(_.name < _.name)
    println(listOfCarsNameAscSort)

    /*var listOfCars = listOfCars.sortWith(sortingLogic)*/

  }

  def sortingLogic(c1: Cars, c2: Cars): Boolean = {
    println(c1)
    println(c2)
    c1.cost > c2.cost
  }
}
