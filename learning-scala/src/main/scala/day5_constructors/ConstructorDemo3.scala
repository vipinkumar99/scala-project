package day5_constructors

// Default parameters in constructor
class DemoClass3(val a: Int = 99, val b: Double = 88.88, val c: String = "Hello Scala") {
  val x = a
  var y = b
  val z = c

  def addNumber(): Double = {
    x + y
  }

  println(s"x - ${x} and y - ${y} and z - ${z}")
}

object ConstructorDemo3 {

  def main(args: Array[String]): Unit = {
    val demo1 = new DemoClass3(5, 7.2, "Hello World")
    val demo2 = new DemoClass3()
    val demo3 = new DemoClass3(25)
    //val demo4=new DemoClass3("Hello World") // you need to pass parameters in correct sequence
    val demo5 = new DemoClass3(c = "Hello World")
    val demo6 = new DemoClass3(c = "Hello", a = 5, b = 6.6)
    // val demo7=new DemoClass3(,,"Hello") //can not do
    // val demo8=new DemoClass3(a,b,"Hello") //can not do, it does not know what is a and b simply
    val demo10 = new DemoClass3(a = 5, b = 5.5, "Hello")

  }
}
