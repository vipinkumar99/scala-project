// access level in scala
//1.public - can we access anywhere (By Default)
//2.private - can we access only in the class it is defined
//3.protected - can access in class it is defined as well as in subclass extending the given class using inheritance


class Car {
  var topClassExtraCost = 0
  private var roadTax = 100
  protected var xyz = 100

  def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

  def checkTax(): Int = {
    roadTax = 10
    roadTax
  }

  def printTax = roadTax
}


object DemoClassObject {

  def main(args: Array[String]): Unit = {
    var bmw = new Car()
    println(bmw.topClassExtraCost)
    // can not access protected access data type
    //  println(bmw.xyz)
    // can not access private access data type
    // println(bmw.roadTax)

    println("Road tax is :" + bmw.checkTax())
    println("Road tax is :" + bmw.printTax)
    var result = bmw.cost(10000)
    println("Total cost of car is :" + result)


  }
}
