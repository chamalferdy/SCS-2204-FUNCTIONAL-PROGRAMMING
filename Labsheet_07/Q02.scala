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
