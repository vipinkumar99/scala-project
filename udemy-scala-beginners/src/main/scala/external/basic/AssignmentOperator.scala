package external.basic

object AssignmentOperator {

  def main(args: Array[String]): Unit = {
    var a = 50;
    var b = 40;
    var c = 0;

    c = a + b
    println("simple addition (a+b) : " + c)
    c += a
    println("add and assignment (c+=a) :" + c)
    c -= a
    println("subtract and assignment (c-=a) :" + c)
    c *= a
    println("multiply and assignment (c*=a) :" + c)
    c /= a
    println("division and assignment (c/=a) :" + c)
    c %= a
    println("modules and assignment (c%=a) :" + c)
    c <<= a
    println("left shift and assignment (c<<=a) :" + c)
    c >>= a
    println("right shift and assignment (c>>=a) :" + c)
    c &= a
    println("bitwise and assignment (c&=a) :" + c)
    c ^= a
    println("bitwise exclusive or and assignment (c^=a) :" + c)
    c != a
    println("bitwise or inclusive or and assignment (c!=a) :" + c)


  }
}
