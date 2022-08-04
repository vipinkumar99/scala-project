package day24_file_handling

@SerialVersionUID(15L)
class Animal(name: String, age: Int) extends Serializable {

  override def toString = s"Animal($name,$age)"
}
