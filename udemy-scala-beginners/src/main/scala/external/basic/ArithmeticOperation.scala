package external.basic

object ArithmeticOperation {

  def main(args: Array[String]): Unit = {

    var b1: Byte = 5
    var b2: Byte = 7
    var b3 = (b1 + b2).toByte
    println(b3.getClass)

    var f1: Float = 12.5f
    var f2: Float = 12.5f
    var f3 = f1 + f2
    println(f3.getClass)

    var d1 = 5
    //  var d2 = d1 / 0

    var m1 = 5
    var m2 = m1 * 0
    println(m2 + " " + m2.getClass)
    var m3 = m1.*(0)
    println(m3 + " " + m3.getClass)
    var m4 = m1 * 0
    println(m4 + " " + m4.getClass)

  }
}
