package day23_tuples_options

object IteratorBDemo {

  // Iterator notes:-
  // Not a collection
  // it helps in providing methods to iterate over the elements
  // inside the collection
  // next -> Gives next element. hasNext check if element is present


  def main(args: Array[String]): Unit = {
    var iterator1 = Iterator("Hello World", "Hello India", "Hello Singapore", "Hello US")
    var bufferedIterator = iterator1.buffered
    println(bufferedIterator.getClass)
    println(bufferedIterator.head)
    println(bufferedIterator.next())

    //Duplicate method in iterator will create a Tuple2 having 2 iterator
    var iterator2 = Iterator("Hello World", "Hello India", "Hello Singapore", "Hello US").duplicate
    println(iterator2)
    println(iterator2._1.next())
    println(iterator2._1.next())
    println(iterator2._2.next())
    println(iterator2._2.next())
  }
}
