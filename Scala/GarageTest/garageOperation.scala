package GarageTest

import GarageSource._

object garageOperation {

  def main(args: Array[String]): Unit = {

    var garage = new Garage()


    garage.registerEmployee(new Employee(1,"Alfin Thomos", "07969848798", "Mechanic"))
    garage.registerEmployee(new Employee(2, "Jack Smith", "0744383488343", "Mechanic"))
    garage.registerEmployee(new Employee(3, "Bret Smith", "0744383487343", "Mechanic"))
    garage.registerEmployee(new Employee(4, "John Thomson", "0744383488343", "Mechanic"))
    garage.registerEmployee(new Employee(5, "Alex Cooper", "0744383488343", "Mechanic"))
    garage.registerEmployee(new Employee(6, "Jeff Afins", "0744383488343", "Mechanic"))
    garage.registerEmployee(new Employee(7, "James Troffin", "0744383488343", "Mechanic"))


    garage.insertCustomer(new Customer(0,"Adam Jackson", "07969848798"))
    garage.insertCustomer(new Customer(1,"Alex Smith", "07569848798"))
    garage.insertCustomer(new Customer(2, "Steve Jackson", "077434747642"))
    garage.insertCustomer(new Customer(3, "John Clark", "077435657642"))
    garage.insertCustomer(new Customer(4, "James Blair", "0774354547642"))
    garage.insertCustomer(new Customer(5, "Stuart Dennis", "0774747642"))
    garage.insertCustomer(new Customer(6, "David Harrison", "077434747642"))


    garage.insertVehicle(new Car(1,"Car","VW","Passat","SV73QWD","Blue","Saloon",1999,5,120,5, garage.generateRandomParts()))
    garage.insertVehicle(new Bike(2,"Bike","Honda","CVR","OP85QI","Red","Sports",300, garage.generateRandomParts()))
    garage.insertVehicle(new Car(3,"Car","BMW","5 Series","CV54SFG","Black","Saloon",2012,5,150,5, garage.generateRandomParts()))
    garage.insertVehicle(new Bike(4,"Bike","Suzuki","Hayaboussa","OP85QI","Orange","Sports",300, garage.generateRandomParts()))
    garage.insertVehicle(new Car(5,"Car","Mercedes","C","SV73QWD","Navy","Saloon",2015,5,120,5, garage.generateRandomParts()))
    garage.insertVehicle(new Bike(6,"Bike","Yamaha","Ninja","OP85QI","Silver","Sports",300, garage.generateRandomParts()))
    garage.insertVehicle(new Car(7,"Car","Audi","A4","SV73QWD","Grey","Saloon",2017,5,120,5, garage.generateRandomParts()))
    garage.insertVehicle(new Bike(8,"Bike","Yamaha","Ninja2","OP85QI","Green","Sports",300, garage.generateRandomParts()))
    garage.insertVehicle(new Car(9,"Car","Audi","A1","SV73QWD","Yellow","Saloon",2014,5,120,5, garage.generateRandomParts()))
    garage.insertVehicle(new Car(10,"Car","Audi","A5","SV73QWD","Brown","Saloon",2005,5,120,5, garage.generateRandomParts()))



    garage.openGarage()
    garage.closeGarage()

    println("__________________________________________________________________________________________________________________________________________________________________________" + "\n")

    println("--------------------------------------------------------------------------- Garage Stored Data --------------------------------------------------------------------------")




    println("__________________________________________________________________________________________________________________________________________________________________________" + "\n")

    println("Vehicle Data: " + "\n")
    garage.outputVehicleData()

    println("__________________________________________________________________________________________________________________________________________________________________________" + "\n")

    println("Customer Data: " + "\n")
    garage.outputCustomerData()

    println("__________________________________________________________________________________________________________________________________________________________________________" + "\n")

    println("Employee Data: " + "\n")
    garage.outputRegisteredEmployees()

  }

}
