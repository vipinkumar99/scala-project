package day19_collections_list

object DemoAList {

  def main(args: Array[String]): Unit = {

    val colors1: List[String] = List("Red", "Green", "Yellow")
    println(colors1)

    //data type is optional
    //No need to specify data type. Scala can interpret it
    val colors2 = List("Red", "Green", "Yellow")
    println(colors2)

    val evens1 = List(2, 4, 6, 8, 10)
    println(evens1)


    // List of Int and Double is consider as List of Double
    val evens2 = List(2.0, 4, 6.0, 8, 10.0)
    println(evens2)

    // List of Int, Double and String is consider as List of Any
    val evens3 = List(2.0, 4, 6.0, 8, 10.0, "Hello")
    println(evens3)

    //2Dimension list
    val matrix = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    println(matrix)
    println(matrix(0))
    //list from 1 to 20
    val list = List.range(1, 21)
    println(list)
    val evenList = List.range(2, 20, 2)
    println(evenList)
    val oddList1 = List.range(1, 20, 2)
    println(oddList1)
    val oddList2 = (1 to 20 by 2).toList
    println(oddList2)

  }
}
