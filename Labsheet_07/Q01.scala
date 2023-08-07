object One {
  def main(args: Array[String]): Unit = {
    var intlist: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    filterEvenNumbers(intlist)
  }
  def filterEvenNumbers(integerList: List[Int]): Unit = {
    val list1: List[Int] = integerList.filter(_ % 2 == 0)
    println("The Even Numbers of the list would be : " + list1)
  }
}

/*
Write a Scala function called filterEvenNumbers that takes a list of integers as input and uses a lambda function to filter out the even numbers from the list. The function should return a new list containing only the even numbers.

Example:
Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output: [2, 4, 6, 8, 10]
You can use the filter method on lists to implement the filterEvenNumbers function with a lambda function inside it.
 */
