package GarageSource

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.{Failure, Random, Success}
import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global

class Garage {

  val garageCapacity = 10
  var isGarageOpen: Boolean = false

  var vehicle:ListBuffer[Vehicle] = new ListBuffer[Vehicle]()
  var customer:ListBuffer[Customer] = new ListBuffer[Customer]()
  var employee:ListBuffer[Employee] = new ListBuffer[Employee]()
  var allparts: ListBuffer[Part] = new ListBuffer[Part]

  var assignCarTOCustomer:mutable.Map[Vehicle, Customer]=scala.collection.mutable.Map[Vehicle,Customer]()

  var fixedVehicles:mutable.Map[Vehicle, Employee]=scala.collection.mutable.Map[Vehicle,Employee]()

  var vehiclesInsideGarage:ListBuffer[Vehicle] = new ListBuffer[Vehicle]()
  var availableEmployee:ListBuffer[Employee] = new ListBuffer[Employee]()

  var timeForAllVehiclesToBeFixed = 0
  var maxHours = 0
  var totalDaysToFixVehicle = 0
  var hourlyCharge = 8


  def garageCheck(): Boolean =() match{

    case garageChecker if(vehicle.isEmpty || customer.isEmpty)=>println("Sorry but there are no vehnicles for the employess to work with");false
    case garageChecker if(employee.isEmpty)=>println("Sorry but there are no employees to fix vehicles");false
    case _=> true
  }

  def checker(): Unit ={

    while(vehiclesInsideGarage.nonEmpty && availableEmployee.nonEmpty && customer.nonEmpty){

      assignCarTOCustomer.put(vehiclesInsideGarage.head,customer.head)


      startFixingVehicle(vehiclesInsideGarage.head,availableEmployee.head, customer.head)

      customer-=customer.head
      customer+=customer.head

      availableEmployee-=availableEmployee.head

      vehiclesInsideGarage-=vehiclesInsideGarage.head
    }

    if (vehiclesInsideGarage.nonEmpty) {
      Thread.sleep(3000); checker()
    }
    Thread.sleep(3500)
  }


  def openGarage(): Unit ={

    isGarageOpen = true

    if(garageCheck()==true){


      println("\n" + "                                                                                                                           \n ad88888ba                                       ,ad8888ba,                                                                \nd8\"     \"8b  ,d                                 d8\"'    `\"8b                                                               \nY8,          88                                d8'                                                                         \n`Y8aaaaa,  MM88MMM  ,adPPYYba,  8b,dPPYba,     88             ,adPPYYba,  8b,dPPYba,  ,adPPYYba,   ,adPPYb,d8   ,adPPYba,  \n  `\"\"\"\"\"8b,  88     \"\"     `Y8  88P'   \"Y8     88      88888  \"\"     `Y8  88P'   \"Y8  \"\"     `Y8  a8\"    `Y88  a8P_____88  \n        `8b  88     ,adPPPPP88  88             Y8,        88  ,adPPPPP88  88          ,adPPPPP88  8b       88  8PP\"\"\"\"\"\"\"  \nY8a     a8P  88,    88,    ,88  88              Y8a.    .a88  88,    ,88  88          88,    ,88  \"8a,   ,d88  \"8b,   ,aa  \n \"Y88888P\"   \"Y888  `\"8bbdP\"Y8  88               `\"Y88888P\"   `\"8bbdP\"Y8  88          `\"8bbdP\"Y8   `\"YbbdP\"Y8   `\"Ybbd8\"'  \n                                                                                                   aa,    ,88              \n                                                                                                    \"Y8bbdP\"               ")
      println("__________________________________________________________________________________________________________________________________________________________________________")

      println("Garage is now open and fxing process will be started soon")

      println("__________________________________________________________________________________________________________________________________________________________________________" + "\n")

      getTotalHoursToFixEachVehicle()

      calculateMaxDaysAndDaysToFixVehicle(timeForAllVehiclesToBeFixed)

      vehiclesInsideGarage = vehicle.clone()
      availableEmployee = employee.clone()

      checker()

    }
  }


  def startFixingVehicle(currentVehicle: Vehicle, emp: Employee, cus: Customer)={

    var f = Future{

    var totalBillForCurrentVehicle = 0.00
    var totalTimeToFixCurrentVehicle = 0
    var totalNumberOfBrokenParts = 0
    var isFixingDone:Boolean=false
    var labourCharge = 0.00
    var withoutlabour = 0.00


      if (vehicle.contains(currentVehicle)) {


        for (part <- currentVehicle.parts if part.isBroke) {

          val thread = new Thread {
            override def run: Unit = {
              totalNumberOfBrokenParts += 1
              totalTimeToFixCurrentVehicle += part.timeAndCost()._1
              totalBillForCurrentVehicle += hourlyCharge * part.timeAndCost()._1 + part.timeAndCost()._2

              fixedVehicles.put(currentVehicle, emp)
            }
          }
          thread.start()
          Thread.sleep(750)
        }
        availableEmployee += emp

        var second = s"Vehicle: ${currentVehicle.make + " " + currentVehicle.model} is owned by ${cus.fullName}"
        var first = s"Employee: ${emp.fullName + " " + "which got employee id of " + emp.eID} is fixing ${currentVehicle.make + " " + currentVehicle.model}"
        println("__________________________________________________________________________________________________________________________________________________________________________")
        println(s"$second \n $first \n It will take $totalTimeToFixCurrentVehicle hours to fix ${currentVehicle.make + " " + currentVehicle.model} since it has $totalNumberOfBrokenParts broken parts. So the total bill to fix this vehicle will be £$totalBillForCurrentVehicle which includes labour charge.")

       }

      true

      }

    f.onComplete {
      case Success(value) => println("Fixed");Thread.sleep(950)
      case Failure(e) => e.printStackTrace
    }



  }



  def getTotalHoursToFixEachVehicle()={

    vehicle.foreach(vehicle=>vehicle.parts.foreach(part=>if(part.isBroke)(timeForAllVehiclesToBeFixed+=part.timeAndCost()._1)))
    println(s"It will take $timeForAllVehiclesToBeFixed hours for all vehicles to get fixed")

  }

  def getTotalEarnings()={
    var totalEarnings = 0.00
    vehicle.foreach(vehicle=>totalEarnings+=calculateBill(vehicle))
    println(s"Total earning throughout the day is £$totalEarnings")
  }




  def calculateMaxDaysAndDaysToFixVehicle(totalHours:Int): Unit ={
    employee.foreach(employee=>if(employee.isAvailable){maxHours=maxHours+8})

    println(s"There are $maxHours hours available today before garage close down")

    var totalDays = Math.round(totalHours / maxHours)
    println(s"It will take $totalDays days to fix all the vehicles")
  }



  def calculateBill(vehicle: Vehicle) : Double = {
    var bill = 0.00
    vehicle.parts.foreach{
      //case part if part.isBroke => bill += part.timeAndCost()._2
      case part if part.isBroke => bill += hourlyCharge * part.timeAndCost()._1 + part.timeAndCost()._2
      case _ =>
    }
    bill
  }

  //Method to generate the random parts from the list for each of the vehicles
  def generateRandomParts() ={

    var partList: ListBuffer[String] = new ListBuffer[String]

    partList+=("Engine", "Windscreen", "Passenger Doors", "Driver Doors", "Suspension", "Gearbox", "Breaks", "Radiator", "Steering", "Catalyst Convertor", "Break Pads", "Clutch Plates", "Fuel Tank", "Timebelt", "Headlights", "Breaklights", "Seatbelt", "Exhaust", "Wipers", "Multimedia")

    allparts = (Random.shuffle(partList).take(10).map(part => new Part(part)))

    allparts

  }


  //Method to insert customers
  def insertCustomer(insertCustomer: Customer): Unit = insertCustomer match{
    case a if customer != null => customer += insertCustomer;
    case _ => println("Customer registration was unsucessful")
  }

  //Method to register employee
  def registerEmployee(registerEmployee: Employee): Unit = registerEmployee match{
    case a if employee != null => employee += registerEmployee;
    case _ => println("Employee registration was unsucessful")
  }

  //Method to insert vehicle
  def insertVehicle(insertVehicle: Vehicle): Unit = insertVehicle match{
    case a if vehicle != null=> vehicle += insertVehicle
    case _ => println("Could not add the vehicle to the garage")
  }

  //Method to remove vehicle by id
  def removeVehicle(vehicleID:Int): Unit ={vehicle.remove(vehicleID)}

  //Methods to display registered Employees, Customers and Vehicles data
  def outputRegisteredEmployees(): Unit ={employee.foreach(item=>println(item))}

  def outputCustomerData(): Unit ={customer.foreach(item=>println(item))}

  def outputVehicleData(): Unit ={vehicle.foreach(item=>println(item))}


  def closeGarage(): Unit ={

    println("__________________________________________________________________________________________________________________________________________________________________________" + "\n")
    getTotalEarnings()
    isGarageOpen = false
  }




}
