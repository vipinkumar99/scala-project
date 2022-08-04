package day19_collections_list

object DemoEList {

  def main(args: Array[String]): Unit = {

    /* val colors = List("Violet", "Orange", "Red", "Green", "Blue")*/
    var colors = List("Violet", "Orange", "Red", "Green", "Blue")
    //access element at index 2
    println(colors(2))

    //modify the element in index 2 (you can not modify the content
    // of element of list because list is immutable)
    // colors(2) = "RED"
    // NOTE:- EVEN LIST IS DEFINE AS VAR WE CAN NOT MODIFY THE LIST

    // Filter the elements into a new list having the length as 3
    /* var colorsWithLength3 = colors.filter(x => x.length == 3)*/
    // short hand notation filter
    var colorsWithLength3 = colors.filter(_.length == 3)
    println(colorsWithLength3)

    var colorsWithGreen = colors.filter(x => x == "Green")
    println(colorsWithGreen)

    var colorsContainsN = colors.filter(x => x.contains("n"))
    println(colorsContainsN)

    var colorsWithLength5More = colors.filter(x => x.length >= 5)
    println(colorsWithLength5More)

    println(colorsWithLength5More.exists(x => x == "Green"))

    println(colorsWithLength5More.exists(x => x == "Blue"))

  }
}
