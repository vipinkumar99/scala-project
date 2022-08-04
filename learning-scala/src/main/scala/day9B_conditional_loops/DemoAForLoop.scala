package day9B_conditional_loops

import scala.util.control.Breaks

object DemoAForLoop {

  def main(args: Array[String]): Unit = {
    println("==============for loop=========================")
    // it will execute for i from 1 to 10
    for (i <- 1 to 10) {
      println("value of i = " + i)
    }
    println("===============until for loop===================")
    // it will execute for i from 1 until 10 (from 1 to 9)
    for (i <- 1 until 10) {
      println("value of i = " + i)
    }
    println("==============Nested for loop====================")
    for (i <- 1 to 10) {
      for (j <- 1 to 10) {
        println("Value of i is:" + i + " value of j is:" + j)
      }
    }
    println("==============Nested for loop-Scala====================")
    for (i <- 1 to 10; j <- 1 to 10) {
      println("Value of i is:" + i + " value of j is:" + j)
    }

    println("==============for loo for collection====================")
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- list) {
      print(i + " ")
    }

    println("==============for loo for collection with filter====================")
    var list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- list1 if i % 2 == 0) {
      print(i + " ")
    }

    println("==============for loo for collection with filter====================")
    var list2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- list2 if i % 2 == 0; if i != 4) {
      print(i + " ")
    }

    println("==============for loo for collection with filter with YIELD====================")
    var list3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var evenNumberList = for (i <- list3 if i % 2 == 0) yield i
    print(evenNumberList)

    // break statement
    var list4 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var break = new Breaks
    break.breakable({
      for (i <- list4 if i % 2 == 0; if i != 4) {
        println("value of i = " + i)
        if (i == 4) {
          println("i am breaking at 4")
          break.break()
        }
      }
    })

  }
}
