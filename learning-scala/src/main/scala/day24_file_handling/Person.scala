package day24_file_handling

case class Person(name: String) extends Serializable {
  override def toString = s"Person($name)"
}
