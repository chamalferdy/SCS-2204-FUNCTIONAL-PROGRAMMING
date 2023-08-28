object One {
  def main(args: Array[String]): Unit = {
    var celtemplist = List(0, 10, 20, 30)
    println(
      "The average Fahrenheit Temperature would be : " + calculateAverage(
        celtemplist
      )
    )
  }
  def calculateAverage(x: List[Int]): Double = {
    x.map(x => ((x.toDouble * 9.0) / 5.0) + 32.0)
      .reduce((x, y) => x + y) / x.size.toDouble
  }
}
