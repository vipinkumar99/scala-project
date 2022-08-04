package lectures.part1basics

import scala.collection.immutable.Range

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("call by value :" + x)
    println("call by value :" + x)
  }

  def callByName(x: => Long): Unit = {
    println("call by name :" + x)
    println("call by name :" + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  //println(printFirst(infinite(), 34))
  //println(34, infinite())

}
