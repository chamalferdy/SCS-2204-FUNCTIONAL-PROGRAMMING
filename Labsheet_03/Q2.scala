def main(args: Array[String]): Unit = {

  val strings = getListOfStrings()
//   println("You entered:")
//   strings.foreach(println)
  val filteredList = filterStrings(strings)
  println(filteredList)

}

def getListOfStrings(): List[String] = {
  println("Enter strings you want to enter. Enter an empty line to finish:")
  Iterator
    .continually(scala.io.StdIn.readLine())
    .takeWhile(_.nonEmpty)
    .toList
}

def filterStrings(list: List[String]): List[String] = {
  list.filter(_.length > 5)
}
