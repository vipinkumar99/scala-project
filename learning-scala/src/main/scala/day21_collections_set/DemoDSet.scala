package day21_collections_set

object DemoDSet {

  def main(args: Array[String]): Unit = {
    // creating mutable set
    var numberSet = scala.collection.mutable.Set(1, 2)
    // add one element to the set
    numberSet += 3
    println(numberSet)
    // add 2 more elements to the set
    numberSet += (4, 5)
    println(numberSet)
    // remove 2 more elements from the set
    numberSet -= (1, 3)
    println(numberSet)
    // remove 1 element from the set
    numberSet -= 4
    println(numberSet)
    // it will ignore because 5 is already present
    numberSet += 5
    println(numberSet)
    // it will add element and return the boolean result true/false
    println(numberSet.add(5))
    // it will remove element and return the boolean result true/false
    println(numberSet.remove(9))


  }
}
