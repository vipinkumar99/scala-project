package lectures.part2oop

object AbstractDataType extends App {

  //abstract
  abstract class Animal {
    val creatureType: String = "wild"

    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("Dog - crunch crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit

    val preferredMeal = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"

    def eat: Unit = println("nomnomom")

    def eat(animal: Animal): Unit = println("I'am a croc and I'am eating "+animal.creatureType)
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

}
