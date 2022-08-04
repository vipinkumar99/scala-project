package external.map

object MapDemo {

  val mymap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 804 -> "July", 804 -> "Julyy")
  val mymap2: Map[Int, String] = Map(805 -> "lea")

  def main(args: Array[String]): Unit = {
    println(mymap)
    println(mymap(802))
    //    println(mymap(803))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)
    mymap.keys.foreach(key => {
      println("key " + key)
      println("value " + mymap(key))
    })

    println(mymap.contains(80100))
    println(mymap ++ mymap2)
    println(mymap.size)
  }
}
