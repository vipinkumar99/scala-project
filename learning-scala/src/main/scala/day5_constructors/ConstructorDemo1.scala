package day5_constructors

// Primary constructor without parameter
class DemoClass1 {
  val x = 3
  val y = 2

  def addNumber(): Int = {
    x + y
  }

  val z = addNumber()

  println(s"z = ${z}")


  println(s"x- ${x} and y- ${y}")
  println("x = " + x + " and y = " + y)

}


object ConstructorDemo {

  def main(args: Array[String]): Unit = {
    val demoObj1 = new DemoClass1

  }
}
