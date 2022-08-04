package day24_file_handling

// Read from Command line scala.io
object DemoACommandLine {

  def main(args: Array[String]): Unit = {
    println("Enter your name")
    var name = scala.io.StdIn.readLine()
    println("Hello " + name)
    println("Enter your phone number")
    var phoneNo = scala.io.StdIn.readLine()
    println("Enter your age")
    var age = Console.readLine()
    println("Hi," + name + " your complete information :-")
    println("Name:" + name)
    println("Phone No:" + phoneNo)
    println("Age :" + age)
  }
}
