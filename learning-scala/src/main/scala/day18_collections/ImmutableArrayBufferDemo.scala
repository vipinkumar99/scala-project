package day18_collections

object ImmutableArrayBufferDemo {

  def main(args: Array[String]): Unit = {
    val list1 = scala.collection.immutable.List(2, 4, 6, 8)
    println(list1)
    //Since list is immutable we can't add one more element
    //+= operator is not available in scala.collection.immutable
    // it is defined in only scala.collection.mutable
    // list1 += 10
  }
}
  