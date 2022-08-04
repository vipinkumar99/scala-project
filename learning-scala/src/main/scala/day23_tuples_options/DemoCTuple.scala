package day23_tuples_options

object DemoCTuple {

  def main(args: Array[String]): Unit = {

    // Tuple is not much used. Instead of Tuple most people will use case class
    val t1 = (1, "String-Data")
    println(t1)
    val s1 = (1, "xyz")
    println(s1)
    val s2 = (1, "abc", "xyz")
    println(s2)

    // using a case class. good code readability
    val student = new Student(1, "abc", "xyz")


  }
}

case class Student(rollNo: Int, firstName: String, lastName: String) {

}