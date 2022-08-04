package day21_collections_set

//mutable set
object DemoBSet {
  def main(args: Array[String]): Unit = {
    // create mutable set
    var set1 = scala.collection.Set("India", "US")
    println(set1)
    //add element in set
    set1 += "Singapore"
    println(set1)
    //see the class for which object is created while creating set
    //class scala.collection.immutable.Set$Set3
    println(set1.getClass)

    var countries = Set("India", "Singapore", "US")
    //class scala.collection.immutable.Set$Set3
    println(countries.getClass)
    //get first element
    println(countries.head)
    // get all element expect first element
    println(countries.tail)
    //check set is empty or not
    println(countries.isEmpty)

    var emptySet = Set()
    println(emptySet.isEmpty)

    var developedCountries = Set("Singapore", "US")
    var developingCountries = Set("India", "Malaysia")
    // combining two set
    /*var allCountries = developedCountries ++ developingCountries*/
    var allCountries = developedCountries.++(developingCountries)
    println(allCountries)
    //class scala.collection.immutable.Set$Set4
    println(allCountries.getClass)
    // find the min
    println(allCountries.min)
    //find the max
    println(allCountries.max)


  }
}
