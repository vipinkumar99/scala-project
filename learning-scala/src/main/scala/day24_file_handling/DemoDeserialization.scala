package day24_file_handling

import java.io.{FileInputStream, ObjectInputStream, ObjectStreamClass}

object DemoDeserialization {

  def main(args: Array[String]): Unit = {
    var filePath1 = "C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\sampleser.txt"
    val fis = new FileInputStream(filePath1)
    val ois = new ObjectInputStreamWithCustomClassLoader(fis)
    val animal = ois.readObject()
    val person = ois.readObject()
    ois.close()
    println(animal)
    println(person)
  }
}

class ObjectInputStreamWithCustomClassLoader(fileInputStream: FileInputStream) extends ObjectInputStream(fileInputStream) {
  override def resolveClass(desc: ObjectStreamClass): Class[_] = {
    try {
      Class.forName(desc.getName, false, getClass.getClassLoader)
    } catch {
      case ex: ClassNotFoundException => super.resolveClass(desc)
    }
  }
}
