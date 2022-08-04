package day14_arrays

object DemoBArray {

  def main(args: Array[String]): Unit = {
    var marks = Array(58, 36, 98, 10, 56, 45, 95, 37, 76, 82, 19, 2, 100)
    var total = marks.reduceRight(_ + _)
    println("Total marks:" + total)
    var min = marks.reduceRight(_ min _)
    println("Min marks:" + min)
    var max = marks.reduceRight((x, y) => x max y)
    println("Max marks:" + max)
    println("Avg marks:" + (total / 13))
  }
}
