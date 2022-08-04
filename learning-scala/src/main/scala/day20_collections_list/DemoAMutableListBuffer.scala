package day20_collections_list

import scala.collection.mutable.ListBuffer

object DemoAMutableListBuffer {

  def main(args: Array[String]): Unit = {
    // create empty list buffer
    var listBuffer1 = new ListBuffer[Int]()
    // add element in list buffer
    listBuffer1 += 0
    println(listBuffer1)
    // add element in list buffer
    listBuffer1 += 1
    println(listBuffer1)
    // add element in list buffer
    listBuffer1 += 2
    println(listBuffer1)
    // add multiple element in list buffer
    listBuffer1 += (5, 6, 7, 8, 9)
    println(listBuffer1)
    // remove element in list buffer
    listBuffer1 -= (6, 7)
    println(listBuffer1)
    // convert list buffer to list
    var list = listBuffer1.toList
    println(list)
    // use map in list buffer
    var listBufferMap = listBuffer1.map(x => x * x)
    println(listBufferMap)


  }
}
