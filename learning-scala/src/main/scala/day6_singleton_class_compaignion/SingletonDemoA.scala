package day6_singleton_class_compaignion

class DemoClassA {
  val x = 2
  val y = 5.5

  def add() = x + y

  println("x = " + x + " and y = " + y)
}


object SingletonDemoA {

  def main(args: Array[String]): Unit = {
    val demoClassA1 = new DemoClassA
    println(demoClassA1.x, demoClassA1.y)
    val result = demoClassA1.add()
    println(result)
  }
}
