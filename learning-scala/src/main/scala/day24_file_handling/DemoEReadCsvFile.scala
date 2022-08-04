package day24_file_handling

object DemoEReadCsvFile {

  def main(args: Array[String]): Unit = {
    var filePath = "C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\test.csv"
    var lines = scala.io.Source.fromFile(filePath).getLines()
    for (line <- lines) {
      if (!line.equals("name,state,age")) {
        val Array(name: String, state: String, age: String) = line.split(",")
        val ageNo = age.toInt
        println("Name is:" + name + " state is:" + state + " age is:" + ageNo)
      }
    }

  }

}
