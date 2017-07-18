/**
  * Created by Profile on 18/07/2017.
  */
object NumberConvertor {

  val englishConversion= List("thousand","million", "billion", "trillion", "quadrillion", "quantillion", "sextillion")
  val frenchConversion= List("thousand", "million", "millard", "billion", "billiard", "trillion", "trilliard")


  def convertNumber(number: Long): String = {

    def num(formattedNumber: String): String = formattedNumber.length match {
      case check if (formattedNumber.length <= 3) => formattedNumber
      case thousand if (thousand == 4) => formattedNumber.head + " " + englishConversion(0) + " " + num(formattedNumber.tail)
      case million if (million == 7) => formattedNumber.head + " " + englishConversion(1) + " " + num(formattedNumber.tail)
      case billion if (billion == 10) => formattedNumber.head + " " + englishConversion(2) + " " + num(formattedNumber.tail)
      case trillion if (trillion == 13) => formattedNumber.head + " " + englishConversion(3) + " " + num(formattedNumber.tail)
      case quadrillion if (quadrillion == 16) => formattedNumber.head + " " + englishConversion(4) + " " + num(formattedNumber.tail)
      case quantillion if (quantillion == 19) => formattedNumber.head + " " + englishConversion(5) + " " + num(formattedNumber.tail)
      case sextillion if (sextillion == 22) => formattedNumber.head + " " + englishConversion(6) + " " + num(formattedNumber.tail)
      case _ => formattedNumber.head + num(formattedNumber.tail)
    }

    num(number.toString)
  }

  def main(args: Array[String]): Unit = {

    println(convertNumber(1234567891111l))

  }

}
