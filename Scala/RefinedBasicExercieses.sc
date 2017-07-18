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

    RecursiveFizzBuzz("Fizz", "Buzz",15)

  }


}

RecursiveFizzBuzz("Fizz","Buzz",15)


