package day6_singleton_class_compaignion

object DemoObjectB { // Instead of class it is an object
  val x = 2
  val y = 5.5

  def add() = x + y

  println("x = " + x + " and y = " + y)
}


object SingletonDemoB {

  def main(args: Array[String]): Unit = {
    //  val demoClassB1 = new DemoObjectB // can't create object of object
    println(DemoObjectB.x, DemoObjectB.y)
    val result = DemoObjectB.add()
    println(result)
  }
}
