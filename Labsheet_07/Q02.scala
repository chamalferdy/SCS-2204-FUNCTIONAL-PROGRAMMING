object Two {
  def main(args: Array[String]): Unit = {
    var numlist: List[Int] = List(1, 2, 3, 4, 5);
    println("The Given list would be : " + numlist);
    calculateSquare(numlist);
  }
  def calculateSquare(numlist: List[Int]): Unit = {
    val squarelist: List[Int] = numlist.map(x => x * x); // lambda function.
    println("The squared numbers for the list would be : " + squarelist);
  }
}

/*
Write a Scala function called calculateSquare that takes a list of integers as input and uses a lambda function to calculate the square of each number in the list. The function should return a new list containing the squares of the input numbers in the same order.
Example:

Input: [1, 2, 3, 4, 5]
Output: [1, 4, 9, 16, 25]
You can use the map method on lists to implement the calculateSquare function with a lambda function inside it
 */
