import scala.io.StdIn.readLine

def mean(a: Int, b: Int): Double = {
  var c, d: Double = 0.0;
  c = a.toDouble;
  d = b.toDouble;
  var mean: Double = (c + d) / 2;
  BigDecimal(mean).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble;
}

def main(args: Array[String]): Unit = {
  println("Enter two integers : ");
  var num1: Int = scala.io.StdIn.readInt();
  var num2: Int = scala.io.StdIn.readInt();
  println("The mean of the 2 numbers would be : ");
  println(mean(num1, num2));
}
