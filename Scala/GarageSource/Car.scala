package GarageSource

import scala.collection.mutable.ListBuffer
import scala.util.Random


class Car(val idOfVehicle: Int, var typeOfVehicle: String, var vehicleMake: String, var vehicleModel: String, var vehicleRegNumber: String, var vehicleColour: String, var carType: String,var carEngine: Int, var carDoors: Int, var carHP: Int, var carSeats:Int, parts1: ListBuffer[Part]) extends Vehicle(idOfVehicle,typeOfVehicle,vehicleMake,vehicleModel,vehicleRegNumber,vehicleColour){

  var parts: ListBuffer[Part] = parts1

  override def toString: String = {super.toString + " , " + s"Car Type: $carType, Engine: $carEngine, Doors: $carDoors, HP: $carHP, Seats: $carSeats"}

}
