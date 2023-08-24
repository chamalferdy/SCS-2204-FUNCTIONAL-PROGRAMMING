object One {
  class Rational(x: Int, y: Int) {
    require(y != 0, "Denominator should not be zero!")
    def neg(t: Rational) = new Rational(-x, y)
    override def toString(): String = x + "/" + y
  }

  def main(args: Array[String]): Unit = {
    println("Enter the numerator : ")
    var num = scala.io.StdIn.readInt()
    println("Enter the denominator : ")
    var denom = scala.io.StdIn.readInt()
    var x = Rational(num, denom)
    var negratnum = x.neg(x)
    println("Negative Rational number would be : " + negratnum)
  }
}
