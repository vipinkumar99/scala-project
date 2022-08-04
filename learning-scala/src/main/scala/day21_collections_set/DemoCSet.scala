package day21_collections_set

object DemoCSet {

  def main(args: Array[String]): Unit = {
    //creating set for some operation
    var numberSet1 = Set(2, 23, 67, 8, 3)

    println(numberSet1.getClass)
    var numberSet2 = Set(2, 2, 8, 3, 56, 47)
    println(numberSet1)
    // 2 was 2 times,but set is collection of unique element so it ignore
    // Sequence is not preserved. As data in set is not stored as per
    // index, but it is stored as pair wise (i.e which element comes behind which element)
    // Pair wise advantage and disadvantage
    // advantage :- Iteration operation is more fast for set as compare to List
    // disadvantage :- Random Retrieval of element for set is slower then list

    // find the common element between 2 set
    /* var commonSet = numberSet1 & numberSet2*/
    var commonSet = numberSet1.&(numberSet2)
    println(commonSet)
    // find the interest between 2 set
    var intersetEle = numberSet1.intersect(numberSet2)
    println(intersetEle)
    //find the union between 2 set
    /* var unionSet = numberSet1.union(numberSet2)*/
    var unionSet = numberSet1 ++ numberSet2
    println(unionSet)

  }
}
