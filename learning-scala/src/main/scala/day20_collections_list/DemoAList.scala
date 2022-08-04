package day20_collections_list

object DemoAList {

  def main(args: Array[String]): Unit = {
    // fill create list with same data
    var list1 = List.fill(5)("Red")
    println(list1)
    var list2 = List.fill(5)(2.5)
    println(list2)
    // you can apply some function to generate element in list
    var list3 = List.tabulate(5)(x => x + 10)
    println(list3)

    var list4 = List.tabulate(5)(x => x * x)
    println(list4)

    // print matrix list
    var matrix = List.tabulate(3, 3)((r, c) => r * c)
    println(matrix)

    var list5 = List(0, 1, 2, 5, 9, 1, 25, 18)
    //reverse the order of list
    // content of list will be not change, List is immutable
    list5 = list5.reverse
    println(list5)


    var list6 = List(0, 5, 2, 6, 9, 1, 25, 18)
    // sorted - sorting in asc and desc order
    // sorting in asc by default
    // sorting in desc order by using reverse
    list6 = list6.sorted(Ordering.Int.reverse)
    println(list6)

    list6 = list6.sortBy(x => x).reverse
    println(list6)

    list6 = list6.sortBy(x => x * x)
    println(list6)

    var list7 = List(1, 2, 5, 9, 1, 25, 18)
    list7 = list7.sortBy(x => 10 / x)
    println(list7)
  }
}