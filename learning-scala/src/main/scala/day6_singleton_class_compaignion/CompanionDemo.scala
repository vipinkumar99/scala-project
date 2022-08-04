package day6_singleton_class_compaignion

class CompanionDemo {
  var x = 5

  def getValue(): Unit = {
    println("value of x=" + x + " and value of y=" + CompanionDemo.y)
  }
}


object CompanionDemo {
  var y = 2.2

  def main(args: Array[String]): Unit = {
    val objectForCompanionDemoClass = new CompanionDemo
    println("Value of x when retrieved from companion object is " + objectForCompanionDemoClass.x)
    println("Value of y when retrieved from companion object is " + y)
    objectForCompanionDemoClass.getValue()
  }
}
