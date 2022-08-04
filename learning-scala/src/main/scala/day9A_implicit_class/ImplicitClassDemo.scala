package day9A_implicit_class


object ImplicitClassDemo {

  implicit class StringFunClass(s: String) {
    def firstChar() = s.substring(0, 1)

    def nthChar(n: Int) = s.substring(n, n + 1)
  }

  def main(args: Array[String]): Unit = {
    var str = "vipin"
    println(str.firstChar())
    println(str.nthChar(3))
  }
}


