package day6_singleton_class_compaignion

case class Car(name: String, model: String) {
  val carName = name
  val carModel = model

  def printDetails(): Unit = {
    println("Car name is : " + carName + " and Car model is : " + carModel)
  }
}


object CaseClassDemoA {

  def main(args: Array[String]): Unit = {
    //val bmw = new Car("BMW", "550")
    val bmw = Car("BMW", "550") //No need to write the "new" since "apply" method is auto generate in case class
    bmw.printDetails()
    //  bmw.carName = "B.M.W" // Constructor parameters is val by default. Therefore mutator method is not generated
    bmw.printDetails()

    bmw match {
      case Car(a, b) => println(a, b) //case class autogenerate unhappy method,used for pattern matching. There is unapply method, used for matching
    }

    //autogenerate copy method
    val mercedes = bmw.copy(name = "mercedes", model = "Class A")
    mercedes.printDetails()

    // equals and hashcode method
    println(bmw == mercedes)

    //toString method is auto implemented
    println(bmw)
  }
}
