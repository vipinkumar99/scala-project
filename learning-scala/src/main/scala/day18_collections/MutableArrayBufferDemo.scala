package day18_collections


object MutableArrayBufferDemo {

  def main(args: Array[String]): Unit = {
    val ab1 = scala.collection.mutable.ArrayBuffer(2, 4, 6, 8)
    println(ab1)
    ab1 += 10
    // we added new element 10, because it is mutable
    //Had it been a immutable, you can't add it
    println(ab1)
    //ab1 = ab1.map(i => i + 1)
    //you can't reassign to val
    //Had it been a var you can reassign

    var ab2 = scala.collection.mutable.ArrayBuffer(2, 4, 6, 8)
    println(ab2)
    ab2 += 10
    println(ab2)
    //you can reassign to val
    ab2 = ab2.map(i => i + 1)
    println(ab2)
  }
}
