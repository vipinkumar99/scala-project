package day5_constructors

//Primary constructor with parameter
class DemoClass2(val a: Int, val b: Double, val c: String) {
  val x = a // var(can change the value) and val(can't change the value)
  var y = b // retrieve (GET) and change (SET) the content of y because it is a var >>> INTERNALLY SCALA CREATE 2 METHOD's Getter and Setter
  val z = c // ONLY retrieve (GET) the content of y because it is a val >>> INTERNALLY SCALA CREATES ONLY 1 METHOD Getter

  def addNumber(): Double = {
    x + y
  }

  println(s"x - ${x} and y - ${y} and z - ${z}")
}

object ConstructorDemo2 {

  def main(args: Array[String]): Unit = {
    val demo = new DemoClass2(5, 7.2, "abc")
    val result = demo.addNumber()
    println("result = " + result)

    //   demo.x = 3  //can not change (only retrieve) the content of x as it was defined as val in the class and hence it only has getter method
    //   demo.y = 7.3333 //can retrieve and change the content of y as it was defined as var in the class and hence it has getter and setter
  }
}
