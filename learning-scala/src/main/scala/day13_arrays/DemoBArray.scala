package day13_arrays

object DemoBArray {

  def main(args: Array[String]): Unit = {
    var marks = Array(58, 36, 98, 10, 56, 45, 95, 37, 76, 82, 19, 2, 100)

    //foreach and map
    /* for (mark <- marks) {
       println(mark)
     }*/
    marks.foreach(println)

    var totalMarks = 0
    /*marks.foreach(mark => totalMarks = totalMarks + mark)*/
    marks.foreach(totalMarks += _)
    println("Total Marks:" + totalMarks)
    var averageMarks = totalMarks / marks.length
    println("Average Marks:" + averageMarks)

    /*var newMarks = marks.map(mark => mark + 10)*/
    var newMarks = marks.map(_ + 10)
    //  newMarks.foreach(println)

    // if you want to do same operation on each element of an array -> Use Map
    // Note:- ( you can also do with foreach/for loop but it will slow )

    // if you want to take Sum/get single output (eg: total marks), use foreach

    // Note :- if you want for loop to return you an array, you can use yield with it
    val result = for (mark <- marks) yield (mark + 10)
    result.foreach(println)


  }
}
