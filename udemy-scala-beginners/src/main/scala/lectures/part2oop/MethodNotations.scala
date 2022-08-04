package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = {
      movie == favoriteMovie
    }

    def hangOutWith(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    def +(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    def +(nickname: String): Person = {
      new Person(this.name + " " + nickname, favoriteMovie)
    }


    def unary_! : String = {
      s"${name},what the heck?!"
    }

    def unary_+ : Person = {
      new Person(name, favoriteMovie, age + 1)
    }

    def isAlive: Boolean = true

    def apply(): String = s"Hi,my name is ${name} and I like ${favoriteMovie}"

    def apply(n: Int): String = s"${name} watched ${favoriteMovie} ${n} times"

    def learns(thing: String) = s"${this.name} learning ${thing}"

    def learnsScala = learns("Scala")

  }

  val marry = new Person("Marry", "Inception")
  println(marry.likes("Inception"))
  println(marry likes "Inception") //both are equal
  //infix notation=operator notation

  //"operator" in scala
  val tom = new Person("Tom", "The Fight Club")
  println(marry hangOutWith tom)

  println(marry + tom)
  println(marry.+(tom))

  //prefix notations
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_prefix only works with - + ~ !
  println(!marry)
  println(marry.unary_!)
  //postfix notations
  println(marry.isAlive)
  println(marry isAlive)

  //apply
  println(marry.apply())
  println(marry())

  /*
    1.Overload the + operator
    marry + "the rockstar" => new Person "Marry" (the rockstar)

    2.Add an age to the Person class
    Add a unary + operator => new Person with the age + 1
    +marry => marry with age incrementer

   3. Add a "learns" method in the Person class => "Marry learns Scala"
      Add a learnsScala method,calls learns method with "Scala"
      Use it in prefix notation
   4. Overload the apply method
       marry.apply(2) => "Marry watched Inception 2 times"
  */

  println((marry + "(The Rockstar)") ())
  println((marry + "(The Rockstar)").apply())

  println((+marry).age)
  println(marry learnsScala)
  println(marry(10))
}
