package day14_arrays

object DemoGArray {

  def main(args: Array[String]): Unit = {
    var marks1 = Array(5, 8, 9)
    var marks2 = Array(5, 9, 7)
    var marks3 = Array(5, 9, 4)

    var marks = Array(marks1, marks2, marks3)
    for (mark <- marks) {
      for (markA <- mark) {
        print(markA + " ")
      }
    }
  }
}
