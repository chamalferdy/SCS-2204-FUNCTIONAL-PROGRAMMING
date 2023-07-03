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

// revString(HELLOTHERE)
// H + revString(ELLOTHERE)
// H + E + revString(LLOTHERE)
// H + E + L + revString(LOTHERE)
// H + E + L + L + revString(LOTHERE)
// H + E + L + L + O + revString(OTHERE)
// H + E + L + L + O + T + revString(THERE)
// H + E + L + L + O + T + H + revString(HERE)
// H + E + L + L + O + T + H + E + revString(ERE)
// H + E + L + L + O + T + H + E + R + revString(RE)
// H + E + L + L + O + T + H + E + R + E + revString(E)
// H + E + L + L + O + T + H + E + R + E + revString() will return while printing
