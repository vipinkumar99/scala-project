package day19_collections_list

object DemoDList {

  def main(args: Array[String]): Unit = {

    var numbers = List(1, 2, 3, 4, 5)
    numbers.foreach(println)
    numbers.foreach(x => println(x * 2))


    // numbers.foreach(x => x * 2)
    // transformation but not work with println
    //  numbers.foreach(_ * 2)


  }
}
