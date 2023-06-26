def main(args: Array[String]): Unit = {
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f
  var g: Float = 4.3f // arbitrary value.

  // scala doesn't support increment or decrement operators.
  b = b - 1
  var n1 = (b * a) + (c * d)
  d = d - 1
  println(n1)
  //

  var n2 = (a)
  println(n2)
  a = a + 1
  //
  var n3 = -2 * (g - k) + c // g is not given.
  println(n3)
  //

  println(c)
  c = c + 1
  //
  c = c + 1

  c = c * a
  println(c)
  a = a + 1
}
