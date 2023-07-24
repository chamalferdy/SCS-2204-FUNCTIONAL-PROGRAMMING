/*The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .
Each subsequent number is the sum of the previous two. Write a recursive function print fist n Fibonacci numbers for given n.*/
object Fibonacci{
  def main(args: Array[String]): Unit = {
    var flag : Boolean = true
    while (flag) {
      println("\nEnter a number : ")
      var m: Int = scala.io.StdIn.readInt()
      if m >= 1 then printFibonacci(m)  
      else{
        println("\nEnter a Natural Number !")
        flag = false
      }
    }
  }
  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
  } 
  def fibonacci(n: Int): Int = {
    if (n <= 1)
      n
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }
}