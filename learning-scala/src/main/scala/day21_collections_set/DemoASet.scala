package day21_collections_set

object DemoASet {

  def main(args: Array[String]): Unit = {
    //class scala.collection.immutable.Set$Set3
    var set1 = Set("India", "Singapore", "US")
    println(set1)
    // create empty set
    //class scala.collection.immutable.Set$EmptySet$
    var set2: Set[String] = Set()
    println(set2.getClass)
    //class scala.collection.immutable.Set$Set3
    var set3: Set[String] = Set("India", "Singapore", "US")
    println(set3.getClass)
    //class scala.collection.immutable.Set$Set1
    var set4: Set[String] = Set("India")
    println(set4.getClass)
    //class scala.collection.immutable.Set$Set4
    var set5: Set[String] = Set("India", "Singapore", "US", "Malaysia")
    println(set5.getClass)
    //class scala.collection.immutable.HashSet$HashTrieSet
    var set6: Set[String] = Set("India", "Singapore", "US", "Malaysia", "USA")
    println(set6.getClass)

  }
}
