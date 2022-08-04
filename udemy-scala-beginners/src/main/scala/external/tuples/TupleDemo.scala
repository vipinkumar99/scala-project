package external.tuples

object TupleDemo {

  val myTuple1 = (1, 2, "Hello", true)
  val myTuple2 = new Tuple3(1, 2, "Hello")
  val myTuple3 = new Tuple2(1, 2)
  val myTuple4 = new Tuple3(1, 2,(4,5))

  def main(args: Array[String]): Unit = {
    println(myTuple1)
    println(myTuple2)
    println(myTuple3)

    println(myTuple1._1)
    println(myTuple1._2)

    myTuple2.productIterator.foreach(i => {
      println(i)
    })

    println(1 -> "Hello")
    println(myTuple4._3._1)

  }
}
