package day5_constructors

// Auxiliary constructors
class DemoClass4(val a: Int, val b: Double, val c: String) {
  val x = a
  var y = b
  val z = c

  def addNumber(): Double = {
    x + y
  }

  println(s"Primary constructor says x - ${x} and y - ${y} and z - ${z}")

  def this() {
    this(99, 00.00, "Hello Scala")
    println("I came into auxiliary constructor with 0 parameter")
  }

  def this(a: Int) {
    this(a, 00.00, "Hello Scala")
    println("I came into auxiliary constructor with 1 parameter")
  }

  def this(c: String) {
    this(6, 66.66, c)
    println("I came into auxiliary constructor with 1 parameter")
  }

  def this(a: Int, b: Float) {
    this(a, b, "Hello World")
    println("I came into auxiliary constructor with 2 parameter")
  }

}

object ConstructorDemo4 {

  def main(args: Array[String]): Unit = {
    val demo1 = new DemoClass4(5, 7.2, "Hello world")
    val demo2 = new DemoClass4()
    val demo3 = new DemoClass4(1)
    val demo4 = new DemoClass4(4, 5)
    val demo5 = new DemoClass4("Vipin")


  }
}
