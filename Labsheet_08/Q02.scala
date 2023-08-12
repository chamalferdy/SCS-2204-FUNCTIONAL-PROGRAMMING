object Two {
  def main(args: Array[String]): Unit = {
    println("Enter an Integer : ")
    var amount: Int = scala.io.StdIn.readInt()
    checkNumber(amount)
  }
  def checkNumber(number: Int): Unit = {
    var num = List(number)
    if num(0) <= 0 then println("Negative/zero")
    else if num.map(x => (x % 2))(0) == 0 then println("Even\n")
    else println("Odd\n")
  }
}
