package external.basic

object Variables {

  def main(args: Array[String]): Unit = {
    var isPresent = true
    println(isPresent.getClass)

    //var isPresent1:Int=true
    //println(isPresent1)

    //var boolean :Boolean=123
    //println(boolean)

    var a1 = 123;
    var a2: Int = 123
    // type inference
    println(a1.getClass)
    println(a2.getClass)

    var f1: Float = 123
    var f2 = 123f
    println(f1)
    println(f2)

    var d1 = 12.3
    var d2 = 12.5f
    println(d1.getClass)
    println(d2.getClass)

    var b1: Byte = 12
    var b2 = 12.toByte
    println(b1)
    println(b2)

    var b3 = 5.asInstanceOf[Byte]
    println(b3.getClass)

    var i1 = 5.toInt;
    println(i1.getClass)
    var i2 = 5.asInstanceOf[Int]
    println(i2.getClass)

    var an: Any = 12
    var anByte=an.asInstanceOf[Int]
    println(anByte.getClass)
  }
}
