package day14_arrays

object DemoAArray {

  def main(args: Array[String]): Unit = {
    var marks = Array(58, 36, 98, 10, 56, 45, 95, 37, 76, 82, 19, 2, 100)
    /*var avg = marks.reduceLeft((x, y) => (x + y) / 2)*/
    /* var total = marks.reduceLeft((x, y) => (x + y))*/
    var total = marks.reduceLeft(_ + _)
    println("Total marks:" + total)
    var min = marks.reduceLeft(_ min _)
    println("Min marks:" + min)
    /*var max = marks.reduceLeft(_ max _)*/
    var max = marks.reduceLeft((x, y) => x max y)
    println("Max marks:" + max)
    println("Avg marks:" + (total / 13))
  }
}
