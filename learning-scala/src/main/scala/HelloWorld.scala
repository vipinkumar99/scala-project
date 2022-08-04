object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello World!")
    /*var result = add1(2, 5);*/
    /*  var result = add2(2, 5);*/
    /* var result = add3(2, 5);*/
    /*var result = add4(2, 5);*/
    var result = add5(2, 5);
    println("addition of 2 and 5 is : " + result)
  }

  def add1(a: Int, b: Int): Int = {
    var c = a + b
    return c
  }

  def add2(a: Int, b: Int): Int = {
    var c = a + b
    // return c // Not mandatory to specify the return keyword
    c
  }

  def add3(a: Int, b: Int) { // Not mandatory to specify the return type. It is interpreted
    var c = a + b
    // return c // Not mandatory to specify the return keyword
    c
  }

  def add4(a: Int, b: Int) { // If you are specify return keyword.You need to specify return type always
    var c = a + b
    return c // Not mandatory to specify the return keyword

  }

  def add5(a: Int, b: Int) = a + b


}
