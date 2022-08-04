package day23_tuples_options

object DemoATuple {

  def main(args: Array[String]): Unit = {
    //class scala.Tuple3
    val tuple1 = (1, "String-Data", 2.3)
    println(tuple1.getClass)

    //class scala.Tuple5
    val tuple2 = (1, "String-Data", 2.3, 5, 5.6)
    println(tuple2.getClass)
    //class scala.Tuple3
    val tuple3 = new Tuple3(1, "String-Data", 2.5)
    println(tuple3.getClass)

    //class scala.Tuple5
    val tuple4 = new Tuple5(1, "String-Data", 2.5, 4, 5.5)
    println(tuple4.getClass)

    // accessing element from tuple
    println(tuple4._1)
    println(tuple4._2)

    // accessing the element using productIterator
    tuple4.productIterator.foreach(println)
    // convert tuple into string
    println(tuple4.toString())

    val tuple5 = new Tuple2(1, "String-Data")
   // tuple5 = tuple5.swap
    println(tuple5.swap)
  }
}
