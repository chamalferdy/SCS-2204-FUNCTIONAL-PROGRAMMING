def main(args: Array[String]): Unit = {
  var ea = easyfunc(2)
  var temp = tempofunc(3)
  println("Total running time would be : " + (ea + temp + ea))
}

def easyfunc(x: Int): Int = x * 8
def tempofunc(x: Int): Int = x * 7
