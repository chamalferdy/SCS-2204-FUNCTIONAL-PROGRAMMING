def main(args: Array[String]): Unit = {
  var bP = bookPrice(60)
  var disc = discount(bookPrice(60))
  var sC = shippingCost(60)
  println("The total wholesale cost would be : " + (bP + sC - disc))
}

def bookPrice(x: Int): Double = { return (x * 24.95) }
def discount(amnt: Double): Double = { return (amnt * .4) }
def shippingCost(x: Int): Double = {
  if (x <= 50) {
    return x * 3
  } else {
    return (3 * 50 + (x - 50) * .75)
  }

}
