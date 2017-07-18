package GarageSource

import scala.util.Random


class Part(partName:String) {

  val partN = partName
  var isBroke = Random.nextBoolean()

  def timeAndCost(): (Int, Double) = partN match {
    case "Engine" => (5, 40.00)
    case "Windscreen" => (2, 150.00)
    case "Passenger Doors" => (2, 55.00)
    case "Driver Doors" => (3, 75.00)
    case "Suspension" => (4, 70.00)
    case "Gearbox" => (4, 25.00)
    case "Breaks" => (4, 75.00)
    case "Radiator" => (3, 65.00)
    case "Steering" => (3, 60.00)
    case "Catalyst Convertor" => (4, 90.00)
    case "Break Pads" => (1, 75.00)
    case "Clutch Plates" => (2, 45.00)
    case "Fuel Tank" => (3, 155.00)
    case "Timebelt" => (2, 60.00)
    case "Headlights" => (1, 80.00)
    case "Breaklights" => (1, 75.00)
    case "Seatbelt" => (1, 30.00)
    case "Exhaust" => (2, 80.00)
    case "Wipers" => (1, 65.00)
    case "Multimedia" => (2, 95.00)

    case _ => (0, 0.00)
  }


  object Part {
    def apply(partName: String): Part = new Part(partName)
  }

}
