package GarageSource

import scala.collection.mutable.ListBuffer

abstract class Vehicle(val vehicleID: Int, var vehicleType: String, var make: String, var model: String, var regNumber: String, var colour: String) {

  var parts:ListBuffer[Part]

  override def toString: String = {s"Type: $vehicleType, Make: $make, Model: $model, Reg Number: $regNumber, Colour: $colour"}

}
