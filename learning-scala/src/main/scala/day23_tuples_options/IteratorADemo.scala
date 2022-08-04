package day23_tuples_options

object IteratorADemo {

  // Iterator notes:-
  // Not a collection
  // it helps in providing methods to iterate over the elements
  // inside the collection
  // next -> Gives next element. hasNext check if element is present


  def main(args: Array[String]): Unit = {
    var iterator1 = Iterator("Hello World", "Hello India", "Hello Singapore", "Hello US")
    // If no elements in Iterator, next() will give error. Instead first check using hasNext()
    println(iterator1.hasNext)
    println(iterator1.next())
    println(iterator1.hasNext)
    println(iterator1.next())

    while (iterator1.hasNext) {
      println(iterator1.next())
    }

    var iterator2 = Iterator("Hello World", "Hello India", "Hello Singapore", "Hello US")
    println(iterator2.max)
    // it gives error because you already used max function on it.
    // you will to set the index to 0. i.e redefine the iterator
    // println(iterator2.min)

    var iterator3 = Iterator("Hello World", "Hello India", "Hello Singapore", "Hello US")
    println(iterator3.min)

    var iterator4 = Iterator("Hello World", "Hello India", "Hello Singapore", "Hello US")
    // to get the no of element
    println(iterator4.length)
    // to get the size or no of element
    println(iterator4.size)
  }
}
