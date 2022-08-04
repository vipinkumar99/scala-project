package day14_arrays

import scala.Array._

object DemoCArray {
  def main(args: Array[String]): Unit = {
    var matrixEq = ofDim[Int](3, 3)
    for (row <- 0 to 2) {
      for (column <- 0 to 2) {
        matrixEq(row)(column) = column + 3
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
