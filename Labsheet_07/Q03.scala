object Three {
  def main(args: Array[String]): Unit = {
    val inplist = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val prmnums = filterPrime(inplist)

    println(s"Input List: $inplist")
    println(s"Prime Numbers: $prmnums")

  }
  def filterPrime(numbers: List[Int]): List[Int] = {
    val isPrime = (n: Int) =>
      (n > 1) && (2 to Math.sqrt(n).toInt).forall(n % _ != 0)
      // (2 to Math.sqrt(n).toInt).forall(n % _ != 0) checks if none of the numbers from 2 to the square root of n evenly divide n.
      // The _ is a placeholder that represents the current value in the range. n % _ != 0 checks if n is not divisible by the current value.
    numbers.filter(isPrime)
  }
}
