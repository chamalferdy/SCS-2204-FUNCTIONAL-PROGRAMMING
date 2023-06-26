def main(args: Array[String]): Unit = {
  var x = takeHomesal(40, 30)
  println(x)
}

def normalwage(hours: Int): Int = hours * 250

def otwage(hours: Int): Int = hours * 85

def income(h1: Int, h2: Int): Int = normalwage(h1) + otwage(h2)

def tax(income: Int): Double = income * .12

def takeHomesal(h1: Int, h2: Int): Double = {
  income(h1, h2) - tax(income(h1, h2))
}
