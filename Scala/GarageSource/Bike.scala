package GarageSource

import scala.collection.mutable.ListBuffer


class Bike(val idOfVehicle: Int, var typeOfVehicle: String, var vehicleMake: String, var vehicleModel: String, var vehicleRegNumber: String, var vehicleColour: String, var bikeType: String, var bikeCC: Int, parts1: ListBuffer[Part]) extends Vehicle(idOfVehicle,typeOfVehicle,vehicleMake,vehicleModel,vehicleRegNumber,vehicleColour){

  var parts:ListBuffer[Part] =parts1

  override def toString: String = {super.toString + " , " + s"Bike Type: $bikeType, Bike CC: $bikeCC"}

}
