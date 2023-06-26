def main(args: Array[String]): Unit = {
  var a = area(5.0)
  println("Area of the Disk : " + a)
}

def area(r: Double): Double = { math.Pi * r * r }
