package day12_traits_value_class_universal_traits

abstract class Vehicle {
  def category()
}


trait FourWheelerC {
  def tyres(): Unit = {
    println("4 Tyres is present in four wheeler")
  }
}


trait CarC {

  var x = 1000
  val t=4

  def engine(): Unit = {
    println("Engine is " + x + "CC in Car")
  }

  def tyres(): Unit = {
    println(t+" tyres is present in car")
  }

  def break()


}

class MercedesC extends Vehicle with FourWheelerC with CarC {
  x = 2000

  override def break(): Unit = {
    println("Disk Break in Mercedes")
  }

  override def tyres(): Unit = super.tyres()

  override def engine(): Unit = {
    println("Engine of mercedes of " + x+"CC")
  }

  override def category(): Unit = {
    println("It is mercedes!")
  }
}

object DemoCTraits {

  def main(args: Array[String]): Unit = {
    val mercedes = new MercedesC
    mercedes.engine()
    mercedes.tyres()
    mercedes.break()
    mercedes.category()
  }


}
