def Blackjack(numberOne : Int, numberTwo : Int) : Int=(numberOne, numberTwo)match{


  case calculate if(calculate._1 > 21 && calculate._2 > 21) => 0
  case calculate if(calculate._1 <=21 && calculate._1 > calculate._2 || calculate._1<=21 && calculate._2>21) => calculate._1
  case calculate if(calculate._2<=21 && calculate._2 > calculate._1 || calculate._2<=21 && calculate._1>21) => calculate._2
  case calculate if(numberOne == numberTwo) => numberOne|numberTwo
}


def uniqueSum(numberOne: Int,numberTwo: Int, numberThree: Int):Int=(numberOne, numberTwo,numberThree)match {

  case calculate if(calculate._1 != calculate._2 && calculate._1 != calculate._3 && calculate._2 != calculate._3)=>numberOne+numberTwo+numberThree
  case calculate if(calculate._1 == calculate._2 && calculate._2 != calculate._3)=>numberThree
  case calculate if(calculate._1 == calculate._3 && calculate._1 != calculate._2)=>numberTwo
  case calculate if(calculate._2 == calculate._3 && calculate._2 != calculate._1)=>numberOne
  case calculate if(calculate._1 == calculate._2 && calculate._2 == calculate._3)=>0
  case _=> 0
}

def tooHot(temp: Int, isSummer: Boolean):Boolean=(temp, isSummer) match{

  case tooHot if((isSummer == true && temp>=60 && temp<=100) | (isSummer == false && temp >=60 && temp <= 90))=> true
  case tooHot if((isSummer == true && temp <60 | temp > 100) | (isSummer == false && temp <60 | temp > 90))=> false

}

Blackjack(22,5)
println(uniqueSum(1,1,3))
tooHot(100,true)