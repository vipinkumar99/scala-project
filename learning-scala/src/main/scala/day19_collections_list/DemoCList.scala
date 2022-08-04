package day19_collections_list

object DemoCList {

  def main(args: Array[String]): Unit = {

    var colors = List("Red", "Green", "Yellow")
    //add element in list at end
    colors = colors :+ "Blue"
    println(colors)
    colors = "Orange" +: colors
    println(colors)
    colors = "Violet" :: colors
    colors = "Violet" :: colors
    colors = "Violet" :: colors
    println(colors)
    //make new list with distinct element
    var colors1 = colors.distinct
    println(colors1)
    //iterate each element
    /* for (color <- colors) {
       println(color)
     }*/
    /*colors1.foreach(x => println(x))*/
   /* colors1.foreach(println(_))*/
    colors1.foreach(println)


  }
}
