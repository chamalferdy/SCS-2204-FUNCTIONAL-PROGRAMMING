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
    numbers.filter(isPrime)
  }
}
/*
Write a Scala function called filterPrime that takes a list of integers as input and uses a lambda function to filter out the prime numbers from the list. The function should return a new list containing only the prime numbers.

Example:
Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output: [2, 3, 5, 7]
 */
