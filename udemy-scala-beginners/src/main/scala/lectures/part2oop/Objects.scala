package lectures.part2oop

object Objects {
  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static/class" level functionality
    val N_EYE = 2

    def canFly: Boolean = false

    //factory method
    /*def from(mother: Person, father: Person): Person = new Person("Bobbie")*/
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(name: String) {
    //instance level functionality

  }
  // it is call COMPANIONS


  def main(args: Array[String]): Unit = {
    println(Person.N_EYE)
    println(Person.canFly)

    //Scala object = SINGLETON INSTANCE
    val marry = Person;
    val john = Person;
    println(marry == john)


    val p1 = new Person("vipin");
    val p2 = new Person("nitin");
    println(p1 == p2)

    val bobbie = Person(p1, p2)
  }

  //Scala Application = Scala object with
  // def main(args:Array[String]):Unit
}
