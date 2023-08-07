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
