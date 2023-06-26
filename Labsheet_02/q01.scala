def main(args: Array[String]): Unit = {

  var k, i, j: Int = 2
  var m, n: Int = 5
  var f: Float = 12.0f
  var g: Float = 4.0f
  var c: Char = 'X'
  ////////////////////////
  println(eval1(k, m))
  println(eval2(m, j))
  println(eval3(n, j))
  println(eval4(m, j))
  println(eval5(f, g))
  i = i + 1
  println(i * n)

}

def eval1(k: Int, m: Int): Int = {
  k + 12 * m
}

def eval2(m: Int, j: Int): Int = {
  m / j
}

def eval3(n: Int, j: Int): Int = {
  n % j
}

def eval4(m: Int, j: Int): Int = {
  m / j * j
}

def eval5(f: Float, g: Float): Float = {
  f + 10 * 5 + g
}
