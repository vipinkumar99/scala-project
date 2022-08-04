package day21_collections_set

object DemoESet {

  def main(args: Array[String]): Unit = {
    var passStudentRollNoSet = Set(1, 3, 4, 5, 6, 8, 9, 10, 12, 13)
    // check set contains the element or not
    println(passStudentRollNoSet.contains(3))
    // convert set to list
    var passStudentRollNoList = passStudentRollNoSet.toList
    println(passStudentRollNoList)
    // convert set to array
    var passStudentRollNoArray = passStudentRollNoSet.toArray
    println(passStudentRollNoArray)

  }
}
