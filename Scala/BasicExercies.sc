import java.util

def HelloWorld() {

  println("Hello World!!!")
}

def Assignment(){

  var output = "Helloworld"

  println("Assignment: " + output)
}

def Parametres(output: String): Unit ={

  println("Parametres: " + output)
}

def returnTypes():String={

  "Return Type : Hello World"

}

def typeInference(output:Any){

  println("Type Inference: " + output)
}

def Strings(string:String, int: Int){

  var result = string.substring(string.size - int, string.size)

  println(result)

}

def Strings2(string1: String, string2: String, char1: Char,char2: Char): Unit ={

  var result = string1.concat(string2)

  result = result.replace(char1,char2)

  println(result)
}

def operators(int1: Int,int2: Int){

  val result = int1 + int2

  println(result)
}

def Conditionals(numberOne: Int,numberTwo: Int, isTrue: Boolean){

  if(isTrue)numberOne+numberTwo else numberOne*numberTwo

}

def Conditionals2(numberOne: Int,numberTwo: Int) = (numberOne,numberTwo)match{

  case calculate if(numberOne == 0 && numberTwo==0)=>0
  case calculate if(numberOne ==0 && numberTwo!=0)=>numberTwo
  case calculate if(numberOne!=0 && numberTwo==0)=>numberOne
}

def interation(string: String, int: Int): Unit ={

  for (i<-0 until int){
    println(string)
    int-i
  }
}

def interation2(input: String, times: Int): Unit ={

  var result = ""
  for (i <- 1 to times) result += input + " "
  for (j <- 1 to times) println(result)

}

def fizzBuzz(fizz: String, buzz:String, int: Int): Unit ={

  (1 to int).map(value=> if(value % 3 == 0 && value % 5 == 0) fizz+buzz else if(value % 3 == 0) fizz else if(value % 5 == 0) buzz else value).foreach(value=>println(value))
}

def RecursiveFizzBuzz(fizz: String,buzz:String,int: Int): Unit ={


    var count = 0

    if(count <= int){

      if(count%3==0 && count%5==0){
        println(fizz + buzz)
        count + 1
      }else if(count%3==0){
        println(fizz)
        count+ 1
      }else if(count%5==0){
        println(buzz)
        count + 1
      }else(
        println(count)
        )

    }

  RecursiveFizzBuzz("Fizz", "Buzz",15)
}

def recursiveIteration1(input : String, counter: Int): Unit = {
  if (counter != 0) {
    println(input);
    recursiveIteration1(input, counter - 1)
  }
}
def patternMatchingConditional1(int1: Int, int2: Int, boolean: Boolean): Int = (int1,int2,boolean) match{

  case calculate if(calculate._3==true)=>int1+int2
  case calculate if(calculate._3==false)=>int1*int2

}

def patternMatchingConditional2(int1: Int, int2: Int, boolean: Boolean): Int = (int1,int2,boolean) match{

  case calculate if(calculate._1 ==0 && calculate._2 ==0)=>0
  case calculate if(calculate._1 ==0)=>int2
  case calculate if(calculate._2 ==0)=>int1
  case calculate if(calculate._3==true)=>int1+int2
  case calculate if(calculate._3==false)=>int1*int2

}

def patternMatching2(any: Any) = any match {

  case Array(x,y,_*) => Array(y,x)
  case List(x,y,_*) => List(y,x)
  case tuple @ (a: Any, b:Any)=> tuple.swap
  case _ =>

}

def functional(): Unit ={

  var times:Array[String]=java.util.TimeZone.getAvailableIDs().map(a=>a.split('/')).filter(_.length>1).map(b=>b(1)).grouped(10).map(c=>c(0)).toArray

  times.foreach(println)

}


HelloWorld()
Assignment()
Parametres("Hello World")
returnTypes()
typeInference("Hello")
Strings("hello",3)
Strings2("Ha","llo", 'a', 'e')
operators(5,2)
Conditionals(5,2,false)
Conditionals2(0,5)
interation("hi",3)
interation2("h",4)
fizzBuzz("Fizz", "Buzz",15)
recursiveIteration1("hi",3)
//RecursiveFizzBuzz("Fizz", "Buzz",15)
patternMatchingConditional1(5,2,true)
patternMatchingConditional2(2,0,true)
patternMatching2(List(5,7))
patternMatching2(Array(2,3,4))
patternMatching2((7,8))
functional()