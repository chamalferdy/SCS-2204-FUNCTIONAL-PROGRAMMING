import scala.compiletime.ops.int
def main(args: Array[String]): Unit = {
  println("Enter a value : ");
  var amount: Double = scala.io.StdIn.readDouble()
  var x: Double = interestfunc(amount);
  println(x);
}

def interestfunc(deposit: Double): Double = deposit match {
  case x if x < 0         => 0
  case x if x < 20_000    => x * 0.02
  case x if x < 200_000   => x * 0.04
  case x if x < 2_000_000 => x * 0.035
  case x if x > 2_000_000 => x * 0.065
}
