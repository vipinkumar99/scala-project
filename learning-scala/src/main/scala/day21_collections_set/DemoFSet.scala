package day21_collections_set

import scala.collection.{SortedSet, mutable}

object DemoFSet {

  def main(args: Array[String]): Unit = {

    // SortedSet keep the data in asc order
    var sortedSet = SortedSet(1, 31, 14, 45, 26, 81, 49)
    println(sortedSet)

    // LinkedHashSet preserved the sequence
    var linkedHashSet = mutable.LinkedHashSet(1, 31, 14, 45, 26, 81, 49)
    println(linkedHashSet)
    // create queue set
    var numberQueue = scala.collection.mutable.Queue(1, 31, 14, 45, 26, 81, 49)
    println(numberQueue)
    // remove the first element from the set
    println(numberQueue.dequeue())
    // remove the element which is divisible by 2
    println(numberQueue.dequeueFirst(x => x % 2 == 0))

  }
}
