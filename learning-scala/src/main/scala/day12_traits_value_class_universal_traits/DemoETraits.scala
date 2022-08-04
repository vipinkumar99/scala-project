package day12_traits_value_class_universal_traits

//value class : can not allocated runtime object
//value class always has only 1 parameter with type as val
// you can't extends a value class
// value class can't extends a trait. Thats way you have a universal

//Benefit of value class
//1.less initialization
//2.Better performance
//3.less memory use


trait CarE extends Any {
  def print(): Unit = {
    println(this)
  }


}

class MercedesE(val x: Int) extends AnyVal with CarE {
  def hello: Unit = {
    println("Hello")
  }
}

object DemoETraits {

  def main(args: Array[String]): Unit = {
    val mercedes = new MercedesE(5)
    mercedes.hello
  }


}
