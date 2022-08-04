package lectures.part2oop

object Inheritance extends App {

  class Animal {
    val creatureType = "wild"

    def eat1(): Unit = {
      println("Eating food-1")
    }

    private def eat2(): Unit = {
      println("Eating food-2")
    }

    protected def eat3(): Unit = {
      println("Eating food-3")
    }
  }

  class Cat extends Animal {
    def crunch(): Unit = {
      eat3()
      println("cat - crunch crunch....")
    }
  }

  val cat = new Cat
  cat.eat1()
  cat.crunch()


  //constructor
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name) {

  }

  //overriding
  /* class Dog extends Animal {
     override val creatureType = "domestic"

     override def eat1(): Unit = {
       println("crunch, crunch")
     }
   }*/

  class Dog(override val creatureType: String) extends Animal {
    // override val creatureType = "domestic"

    override def eat1(): Unit = {
      super.eat1();
      println("dog- crunch, crunch")
    }
  }

  /* class Dog(dogType: String) extends Animal {
     override val creatureType = dogType

     override def eat1(): Unit = {
       println("crunch, crunch")
     }
   }*/


  /*val dog = new Dog
  dog.eat1()
  println(dog.creatureType)*/

  /*val dog = new Dog("Domestic")
  dog.eat1()
  println(dog.creatureType)*/

  //type substitution (board: polymorphism)
  val unkonownAnimal: Animal = new Dog("K9")
  unkonownAnimal.eat1()

  //super is use to refer parent class method

  // preventing overrides
  // 1. use final on member/method
  // 2. user final on the entire class
  // 3. sealed the class - extends classes in THIS FILE. prevent extension in other files
}
