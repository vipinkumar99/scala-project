package day11_exception_handling

import scala.util.{Failure, Success, Try}

object DemoBTrySuccessFailure {

  def main(args: Array[String]): Unit = {
    val a = Try(10 / 0)
    a match {
      case Success(value) => println(value)
      /*case Failure(exception) => println(exception)*/
      case Failure(exception) => exceptionHandling(exception)
    }

  }

  def exceptionHandling(ex: Throwable): Unit = {
    if (ex.toString.equals("java.lang.ArithmeticException: / by zero")) {
      println(ex.getMessage)
    } else {
      println(ex)
    }

  }
}
