package day12_traits_value_class_universal_traits

trait FourWheeler {
  def tyres(): Unit = {
    println("4 Tyres is present in four wheeler")
  }
}


trait CarB { //keyword trait
  def engine(): Unit = { //body is present for engine() method
    println("Engine is 1000 cc in Car")
  }

  def tyres(): Unit = {
    println("4 Tyres is present in car")
  }

  def break() //body is not present for break method. it should be implemented in the class that
  // in the class that is extending trait car


}

class MercedesB extends CarB with FourWheeler { //keyword is extends
  override def break(): Unit = { // unimplemented method break() is implemented here
    println("Disk Break in Mercedes")
  }

  override def tyres(): Unit = super.tyres() //if same method tyres() is implmented
  // in multiple traits it will be execute the traits from right
}

object DemoBTraits {

  def main(args: Array[String]): Unit = {
    val mercedes = new MercedesB
    mercedes.engine()
    mercedes.tyres()
    mercedes.break()
  }


}
