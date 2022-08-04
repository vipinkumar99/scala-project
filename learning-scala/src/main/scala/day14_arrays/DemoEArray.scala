package day14_arrays

import scala.Array._

object DemoEArray {

  def main(args: Array[String]): Unit = {
    var marks1 = Array(5, 6, 0, 9, 2, 4, 6)
    var marks2 = Array(5, 9, 2, 6, 4, 2, 6)
    var allMarks = concat(marks1, marks2) //concat method is use to combine two array
    allMarks.foreach(println)

    var rollNo = range(1, 101)
    rollNo.foreach(print)
    println()
    var rollNos = range(2, 101, 2)
    for (rollNo <- rollNos) {
      print(rollNo + " ,")
    }
  }
}
