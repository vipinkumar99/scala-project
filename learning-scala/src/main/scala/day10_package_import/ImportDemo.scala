package day10_package_import

import java.util._

object ImportDemo {

  def main(args: Array[String]): Unit = {
    var array = new ArrayList(5)
    println(array)
    val date = new Date()
    println(date)

    var set = new HashSet()
    println(set)

//    val currency = new Currency(2)
//    println(currency)
  }
}
