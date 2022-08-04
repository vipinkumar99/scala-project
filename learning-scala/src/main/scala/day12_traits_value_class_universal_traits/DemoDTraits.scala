package day12_traits_value_class_universal_traits

abstract class VehicleD {
}


trait FourWheelerD {

}


trait CarD {
  this: FourWheelerD with VehicleD => // if you extend CarD make sure you extends FourWheelerD and VehicleD
  {

  }

}

class MercedesD extends VehicleD with FourWheelerD with CarD {

}

object DemoDTraits {

  def main(args: Array[String]): Unit = {
    val mercedes = new MercedesC
  }


}
