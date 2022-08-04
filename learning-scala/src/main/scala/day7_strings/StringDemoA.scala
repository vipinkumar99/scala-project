package day7_strings

object StringDemoA {


  def main(args: Array[String]): Unit = {
    var greetings = "Hello World!" //Data type String is not defined. Auto interpreted
    println(greetings)
    var greetingsNew: String = "Hello India!" //Data type String is defined
    println(greetings)

    // method to get the length of the String
    //Accessor method  any method use to get the information of an object
    var length = greetings.length()
    println("Length of the string :" + length)

    //concat method
    var var1 = "Hello"
    var var2 = "World"
    println(var1 + var2) // you can concat using + operator
    println(var1.concat(var2)) //you can also use concat method
    // to get char at given index
    println(var1.charAt(0))
    // equals
    var varA = "Hello World!"
    var varB = "Hello World!"
    println(varA.equals(varB)) // true if both the string having same content
    println(varA == varB) //it is same as equal but it does one more task it will check varA and varB are null or not null

    //formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 50000
    var mileageOfCar = 8.5

    printf("Name of car is %s and cost of car %d and milage of car is %f", nameOfCar, costOfCar, mileageOfCar)
    println()
    //multi line string
    var multiLineStringA =
      """Hello
        |World
        |How
        |are
        |you
        """.stripMargin
    println(multiLineStringA)

    var multiLineStringB =
      """Hello
        $World
        $How
        $are
        $you
        """.stripMargin('$')
    println(multiLineStringB)

    // String interpolation
    //1. 's' string interpolation
    var name = "PM Modi"
    println("Hello " + name)
    println(s"Hello $name, How are you") // using s interpolar. widly use
    //2. 'f' string interpolation
    name = "PM Modi"
    var salary = 2000.2f
    println(f"Name is $name%s and salary is$salary%8.2f and designation is PM")
    //3. raw interpolator
    println("Hello World!\nHow are you?")
    println(raw"Hello World!\nHow are you?") // same as interpolater but does not perform escaping. escaping \n \t


  }
}
