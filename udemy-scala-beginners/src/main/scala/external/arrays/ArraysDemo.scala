package external.arrays
import  Array._

object ArraysDemo {

  val myarray1: Array[Int] = new Array[Int](4)
  val myarray2 = new Array[Int](5)
  val myarray3 = Array(1, 2, 3, 4, 5)

  def main(args: Array[String]): Unit = {
    myarray1(0) = 20;
    myarray1(1) = 50;
    myarray1(2) = 10;
    myarray1(3) = 30;
    println(myarray1)
    for (x <- myarray1) {
      println(x)
    }
    for (i <- 0 to (myarray1.length - 1)) {
      println(myarray1(i))
    }

    for(i <- 0 to (myarray3.length-1)){
      println(myarray3(i))
    }

    val result=concat(myarray1,myarray3);
    for(i <- result){
      println(i)
    }
  }
}
