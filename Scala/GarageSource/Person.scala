package GarageSource


class Person(val id: Int, var fName: String, var phoneNo:String) {

  def getID(): Int = (id)
  def getName() :String = {fName}
  def getPhonenNumber() :String = {phoneNo}

  override def toString: String = {s"Full Name: $fName, Phone Number: $phoneNo"}

}
