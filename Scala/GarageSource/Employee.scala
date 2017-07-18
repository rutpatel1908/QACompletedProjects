package GarageSource


class Employee(val eID: Int, var fullName: String, var phoneNumber:String, var jobTitle: String) extends Person(eID, fullName,phoneNumber){

  var isAvailable:Boolean = true

  def getAvailability : Boolean = { isAvailable}
  def setAvailability(newRole: Boolean) : Any = {isAvailable = newRole}

  override def toString: String = "Employee=> "+super.toString + " , " + "Role: " + jobTitle


}
