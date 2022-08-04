package day19_collections_list

object DemoBList {

  def main(args: Array[String]): Unit = {

    var colors1: List[String] = List("Red", "Green", "Yellow")
    println(colors1)
    //give first element
    println(colors1.head)
    //give all element expect of first element
    println(colors1.tail)
    // make list null/empty
    colors1 = Nil
    //check list is empty or not
    println(colors1.isEmpty)
    var colors2: List[String] = List("Red", "Green", "Yellow")
    //get the size of list
    println(colors1.size)
    //make list as string using separator
    var availableColor1 = colors2.mkString(",")
    println(availableColor1)
    var availableColor2 = colors2.mkString("[", ",", "]")
    println(availableColor2)


  }
}
