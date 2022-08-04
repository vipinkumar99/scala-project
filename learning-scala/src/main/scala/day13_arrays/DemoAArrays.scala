package day13_arrays

object DemoAArrays {

  def main(args: Array[String]): Unit = {
    println("hello world")

    var marks = Array(58, 36, 98, 10, 56, 45, 95, 37, 76, 82, 19, 2, 100)

    for (mark <- marks) {
      println(mark)
    }

    //average
    var totalMarks = 0
    var averageMarks = 0
    /*for (mark <- marks) {
      totalMarks = totalMarks + mark;
    }*/

    for (i <- 0 to (marks.length - 1)) {
      totalMarks = totalMarks + marks(i);
    }

    averageMarks = totalMarks / marks.length
    println("average marks is:" + averageMarks)

  }
}
