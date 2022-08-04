package day8_pattern_matching_regex

object MatchPattern1 {

  def main(args: Array[String]): Unit = {
    /*println(matchPattern1(1))
    println(matchPattern1(2))
    println(matchPattern1(3))*/

    println(matchPattern2(1))
    println(matchPattern2(3))
    println(matchPattern2("three"))
    println(matchPattern2("four"))
  }

  def matchPattern1(x: Int) = x match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "None of above"
  }

  def matchPattern2(x: Any) = x match {
    case 1 => "One"
    case 2 => "Two"
    case "three" => 3
    case "four" => 4
    case _ => "None of above"
  }

}
