package lectures.part2oop

object OOBasic extends App {
  val person = new Person("Vipin", 26)
  println(person.age)
  person.greet("Vijay")
  person.greet()

  val author = new Writer("Vipin", "Prajapati", 1995)
  val duplicateAuthor = new Writer("Vipin", "Prajapati", 1995)
  val noval = new Novel("Great Programing", 2000, author)
  /* println(author.fullName())*/
  println(author.fullName)
  println(noval.authorAge())
  println(noval.isWrittenBy(author))
  println(noval.isWrittenBy(duplicateAuthor))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.increment(5).print

}

//constructor
class Person(name: String, val age: Int = 0) {
  // body

  val x = 2
  println(1 + 3)

  //method
  def greet(name: String): Unit = {
    println(this.name + " says Hi," + name)
  }

  //overloading
  def greet(): Unit = {
    println("Hi,I am " + this.name)
  }

  // multiple constructor
  def this(name: String) = this(name, 0)

  def this() = this("Rohit")
}

class Writer(firstName: String, surname: String, val year: Int) {
  /*def fullName(): String = {
    firstName + " " + surname
  }*/

  def fullName = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge(): Int = {
    year - author.year
  }

  def isWrittenBy(author: Writer): Boolean = {
    author == this.author
  }

  def copy(newYear: Int): Novel = {
    new Novel(name, newYear, author)
  }
}


class Counter(val count: Int = 0) {

  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }

  def dec = {
    println("decrement")
    new Counter(count - 1)
  }

  def increment(n: Int): Counter = {
    if (n <= 0) this else inc.increment(n - 1)
  }

  def decrement(n: Int): Counter = {
    if (n <= 0) this else inc.decrement(n - 1)
  }

  def print = println(count)

}