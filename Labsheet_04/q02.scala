def main(args: Array[String]): Unit = {
  println("Enter an Integer : ")
  var amount: Int = scala.io.StdIn.readInt()
  println("The entered number would be : " + checkNumber(amount))

}

def checkNumber(number: Int): Unit = number match {
  case y if y < 0      => println("Negative");
  case y if y == 0     => println("Zero");
  case y if y % 2 == 0 => println("Even");
  case y if y % 2 == 1 => println("Odd");
}
