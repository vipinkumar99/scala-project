package external.basic

object Operators {

  def main(args: Array[String]): Unit = {
    //prefix
    var a1 = -10;
    println(a1.getClass)
    var a2 = 10.unary_-
    println(a2.getClass)
    //infix
    var a3 = 2 + 5
    println(a3.getClass)
    var a4 = 2.+(5);
    println(a4.getClass)
    //postfix
    var a = 2
    var b = a.toByte
    println(b)

  }
}
