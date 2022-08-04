package external.basic

object EscapeCharacterPrintln {

  def main(args: Array[String]): Unit = {
    /* use to add new line*/
    println("Hello\nWorld")
    /*use to add tab space*/
    println("Hello\tWorld")
    /*use to backward remove char*/
    println("Hello\b\bWorld")
    /*use to print indentation mark*/
    println("Hello \f World")
    /*use to return carriage*/
    println("Hello\rWorld")
    /*use to print double quote*/
    println("Hello \"India\" world")
    /*use to print single quote*/
    println("Hello \'India\' world")
    /*use to print double slash*/
    println("https:////www.google.com")
  }

}
