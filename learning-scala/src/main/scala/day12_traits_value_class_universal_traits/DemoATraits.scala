package day12_traits_value_class_universal_traits


trait Car { //keyword trait
  def engine(): Unit = { //body is present for engine() method
    println("Engine is 1000 cc")
  }

  def break() //body is not present for break method. it should be implemented in the class that
  // in the class that is extending trait car


  def tyres() //body is not present for tyres method. it should be implemented in the class that
  // in the class that is extending trait car
}

class Mercedes extends Car { //keyword is extends
  override def break(): Unit = { // unimplemented method break() is implemented here
    println("Disk Break")
  }

  override def tyres(): Unit = { // unimplemented method tyres() is implemented here
    println("4 tyres")
  }
}

object DemoATraits {

  def main(args: Array[String]): Unit = {
    val mercedes = new Mercedes
    mercedes.engine()
    mercedes.tyres()
    mercedes.break()
  }


}
