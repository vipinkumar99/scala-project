package day24_file_handling

import java.io.{BufferedWriter, File, FileWriter, PrintWriter}


object DemoDWriteFile {

  def main(args: Array[String]): Unit = {
    //option-1
    var filePath1 = "C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\output1.txt"
    // create instance of file
    val outFile1 = new File(filePath1)
    //create instance of print writer
    val outWriter1 = new PrintWriter(outFile1)
    // write into file
    outWriter1.write("Hello World!\n")
    outWriter1.write("Hello World Again!\n")
    outWriter1.write("Hello World Again Again!\n")
    // close the file
    outWriter1.close()
    println("Error is:" + outWriter1.checkError())

    //option-2
    var filePath2 = "C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\output2.txt"
    // create instance of file
    val outFile2 = new File(filePath2)
    //create instance of file writer
    val outWriter2 = new FileWriter(outFile2)
    // write into file
    outWriter2.write("Hello World!\n")
    outWriter2.write("Hello World Again!\n")
    outWriter2.write("Hello World Again Again!\n")
    // close the file
    outWriter2.close()

    //option-3
    var filePath3 = "C:\\Users\\vipvipin\\Documents\\scala-project\\learning-scala-start\\learningScalaA\\src\\main\\scala\\output3.txt"
    // create instance of file
    val outFile3 = new File(filePath3)
    //create instance of file writer
    val outWriter3 = new FileWriter(outFile3)
    // create buffered writer
    val bufferedWriter = new BufferedWriter(outWriter3)
    // write into file
    bufferedWriter.write("Hello World!\n")
    bufferedWriter.write("Hello World Again!\n")
    bufferedWriter.write("Hello World Again Again!\n")
    // close the file
    bufferedWriter.close()
  }

}
// Exception handling
//PrintWriter -> Error handling using checkError method
//FileWriter -> BufferedWriter - can use try catch block

//Flushing the data
//PrintWriter -> costly, it flush
// FileWriter + BufferedWriter -> you can flush manually OR it will be flush when you close it

