import scala.io.StdIn

def main(args: Array[String]): Unit = {

  print("Enter the number of Strings : ")
  var cnt = StdIn.readInt()
  listMake(cnt);

}

def listMake(cnt: Int): Unit = {
  var array: Array[String] = Array[String]()
  var newArray: Array[String] = Array[String]()

  println("Enter elements of array: ")
  for (i <- 1 to cnt) {
    print(s"$i: ")
    var word1 = StdIn.readLine();
    array = array :+ word1
  }

  println("Elements greater than length of 5:")
  for (element <- array) {
    if (element.length > 5) {
      newArray = newArray :+ element
    }
  }

  for (element <- newArray) {
    println(element)
  }
}
