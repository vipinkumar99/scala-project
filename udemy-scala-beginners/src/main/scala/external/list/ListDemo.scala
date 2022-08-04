package external.list

object ListDemo {

  val myList: List[Int] = List(1, 2, 4, 5, 6, 7, 8)
  val names: List[String] = List("Max", "Tom", "John")

  def main(args: Array[String]): Unit = {
    // println(myList)
    // println(names)

    println(0 :: myList)
    println(myList)
    println(names)
    println(1 :: 5 :: 9 :: Nil)
    println(myList.head)
    println(names.tail)
    println(myList.tail)
    println(myList.isEmpty)
    println(myList.reverse)
    println(List.fill(5)(2))
    println(myList.max)

    myList.foreach(println)
    var sum: Int = 0
    myList.foreach(sum += _)
    println("sum=" + sum)

    for(name <- names){
      println(name)
    }

    println(names(0))
  }
}
