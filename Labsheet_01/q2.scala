def main(args: Array[String]): Unit = {
  var b = CeltoFahrenheit(35.0)
  println("Fahrenheit value would be " + b)
}

def CeltoFahrenheit(C: Double): Double = { ((C * 1.8000) + 32.00) }
