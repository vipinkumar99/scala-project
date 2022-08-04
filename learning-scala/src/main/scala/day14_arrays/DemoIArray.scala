package day14_arrays

import scala.collection.mutable.ArrayBuffer

object DemoIArray {

  def main(args: Array[String]): Unit = {
    var marks = ArrayBuffer[Int]()
    marks += 10
    marks += 6
    marks += 3
    marks.foreach(print)
    println()
    marks += 5
    marks.foreach(print)
    println()
    marks.append(7)
    marks.foreach(print)
    println()
    marks ++= Array(77, 88, 66, 55)
    marks.foreach(x => print(x + " "))
    println()
    marks -= 5
    marks.foreach(x => print(x + " "))
  }
}
