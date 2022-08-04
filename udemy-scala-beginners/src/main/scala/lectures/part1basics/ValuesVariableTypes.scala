package lectures.part1basics

object ValuesVariableTypes extends App {
  val x: Int = 42
  println(x)
  //x=24
  //VALUES ARE IMMUTABLE
  val y = 42
  println(y)
  // COMPILER CAN INFER TYPE
  val aString: String = "Hello";
  // SEMICOLON IS OPTIONAL
  val otherString = "Good bye"
  //Data types in scala
  val vString: String = "Hi"
  val anInt: Int = x
  val aBoolean: Boolean = false
  val aChar: Char = 'A'
  val aFloat: Float = 2.5F
  val aDouble: Double = 25.25
  val aLong: Long = 189389458965490039L
  val aShort: Short = 4512
  //variables
  var aVariable: Int = 4
  aVariable = 5 //side effect

  //val are immutable can't reassigned var are mutable


}
