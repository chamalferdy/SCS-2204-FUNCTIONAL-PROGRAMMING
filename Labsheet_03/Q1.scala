import scala.io.StdIn

def main(args: Array[String]): Unit = {
  println("Enter a string:")
  val inputStr = StdIn.readLine()
  println(revString(inputStr))
}

def revString(str: String): String = {
  if (str.isEmpty) { // base case for the recursion.
    ""
  } else {
    revString(str.tail) + str.head
  }
}
