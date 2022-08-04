package external.set

object SetDemo {
  val mySet1: Set[Int] = Set(1, 2, 5, 8, 9, 6, 4, 4)
  val mySet2: Set[Int] = Set(4, 2, 9, 18, 19, 16, 14)
  val names: Set[String] = Set("Max", "Tom", "John")

  def main(args: Array[String]): Unit = {
    println(mySet1 + 10)
    println(mySet1)
    println(mySet1(8))
    println(names("Maxxx"))
    println(mySet1.head)
    println(mySet1.tail)
    println(mySet1.isEmpty)
    println(mySet1 ++ mySet2)
    println(mySet1.++(mySet2))
    println(mySet1.&(mySet2))
    println(mySet1.intersect(mySet2))
    println(mySet1.max)
    println(mySet1.min)
    mySet1.foreach(println)
    for (name <- names) {
      println(name)
    }
  }
}
