package day11_exception_handling

import scala.util.control.Exception.catching

object DemoCCaching {

  def main(args: Array[String]): Unit = {

    /*val catchEx = catching(classOf[ArithmeticException],classOf[ArrayIndexOutOfBoundsException])
      .withApply(e => println("ArithmeticException occurred"))*/
    val catchEx = catching(classOf[ArithmeticException],classOf[ArrayIndexOutOfBoundsException])
      .withApply(e => println(DemoBTrySuccessFailure.exceptionHandling(e)))

    val a = catchEx(10 / 0)
    if (a.!=()) {
      println(a)
    }
  }
}
