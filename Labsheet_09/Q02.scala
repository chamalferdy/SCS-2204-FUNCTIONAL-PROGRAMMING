object Two {
  class Rational(x: Int, y: Int) {
    var numer = x
    var denom = y
    require(denom != 0, "Denominator can't be zero!")
    def sub(rat: Rational): Rational = {
      new Rational(numer * rat.denom - rat.numer * denom, denom * rat.denom)
    }
    override def toString(): String = numer + "/" + denom
  }

  def main(args: Array[String]): Unit = {
    var x = new Rational(3, 4)
    var y = new Rational(5, 8)
    var z = new Rational(2, 7)
    var finalval = (x.sub(y)).sub(z)
    println(
      "Final value of Subtracting " + (x) + " , " + (y) + " and " + (z) + " answer would be : " + finalval
    )
  }
}
