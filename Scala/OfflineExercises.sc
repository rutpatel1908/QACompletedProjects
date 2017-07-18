def exercise1(string:String) ={

  var result = ""
  string.toCharArray.foreach(charactor=>result+=charactor.toString+charactor.toString)

  result

}


def exercise2(string: String): Unit ={

  println(string.split("bread").mkString)


}



def exercise3(numberOne:Int, numberTwo: Int, numberThree: Int){

  val numArray: Array[Int] = Array(numberOne,numberTwo,numberThree).sorted

  if((numArray(1)-numArray(0))==numArray(2)-numArray(1)) {
    println("true")
  }else {
    println("false")
  }

}





def exercise5(bunnies:Int): Unit = {

  var result = 0


  if (bunnies > 0) {
    result = bunnies + bunnies
    println(result)
  } else{
    result = 0
    println(result)
  }


  //exercise5(5)
}

exercise5(7)




def exercise6(string:String, int: Int){

  var result = string.substring(string.size - int, string.size)

  println(result)

}



def exercise7(string:String): Unit ={

  println(string.endsWith("ly"))
}


def exercise8(string: String): Unit ={

  println(string.distinct)

}



exercise1("The")

exercise2("breadjambread")
exercise2("xxbreadjambreadyy")
exercise2("xxbreadyy")

exercise3(2,4,6)
exercise3(4,6,2)
exercise3(4,6,3)

exercise6("Hello", 2)
exercise6("Chocolate", 3)
exercise6("Chocolate", 1)

exercise7("oddly")
exercise7("y")
exercise7("oddy")

exercise8("yyzzza")
exercise8("abbbcdd")
exercise8("Hello")
