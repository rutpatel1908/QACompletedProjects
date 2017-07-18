package GarageSource


class Customer(val cID: Int, var fullName: String, var phoneNumber:String) extends Person(cID, fullName,phoneNumber){

  override def toString: String = "Customer=> " + super.toString
}
