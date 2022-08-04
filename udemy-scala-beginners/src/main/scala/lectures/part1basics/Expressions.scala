package lectures.part1basics

object Expressions extends App {
  val sum = 1 + 3 //EXPRESSION
  println(sum)
  println(2 + 1 + 3)
  // + - / * & | ^ << >> >>>(right shift with zero extension)

  println(1 == sum)
  // == != > >= < <=
  println(!(1 == sum))

  // ! &&  ||
  // IF is an EXPRESSION in scala
  val aCondition = true
  aVariable += 3 // also works with -= *= /= .... side effect
  println(aVariable)

  // Instructions (DO) Vs Expressions (VALUE)
  val aConditionValue = if (aCondition) 5 else 3 // IF EXPRESSION

  println(aConditionValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)
  var aVariable = 2
  var i = 0
  while (i < 5) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN
  // EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVariable == 3) // Unit ==== void
  println(aWeirdValue)
  // side effects: println(), whiles, reassigning

  //code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hell0" else "GoodBye"
  }
  println(aCodeBlock)

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if (someValue) 235 else 985
    45
  }
  println(someOtherValue)


}
