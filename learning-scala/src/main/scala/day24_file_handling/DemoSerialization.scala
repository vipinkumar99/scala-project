package day24_file_handling

import java.io.{FileOutputStream, ObjectOutputStream}

object DemoSerialization {

  def main(args: Array[String]): Unit = {
    var filePath1 = "C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\sampleser.txt"
    val fos = new FileOutputStream(filePath1)
    val oos = new ObjectOutputStream(fos)
    oos.writeObject(new Animal("Dog", 12))
    oos.writeObject(new Person("vipin"))
    oos.close()
  }
}



