package day14_arrays

import scala.Array._

object DemoDArray {
  def main(args: Array[String]): Unit = {
    var matrixEq = ofDim[Int](3, 3)
    for (row <- 0 to 2) {
      for (column <- 0 to 2) {
        if (row == column) {
          matrixEq(row)(column) = 1
        } else {
          matrixEq(row)(column) = 0
        }
      }
    }

    for (row <- 0 to 2) {
      for (column <- 0 to 2) {
        print(matrixEq(row)(column) + " ")
      }
      println(" ")
    }
  }
}
