/*Write a recursive function primeSeq(n) that prints all prime number which less than n? For example prime(10) should print 2,3,5, and 7 on the terminal.*/

import scala.io.StdIn._
import scala.util.control.Breaks._

def gcd(a: Int, b: Int): Int = b match {
  case 0            => a
  case b if (b > a) => gcd(b, a)
  case _            => gcd(b, a % b)
}

def isPrime(n: Int, i: Int): Boolean = n match {
  case n if n == i        => true
  case n if gcd(n, i) > 1 => false // if greater than 1 it's not prime.
  case x                  => isPrime(n, i + 1)
}

def printSeq(n: Int, i: Int): Int = {
  if (n == i) {
    break
  }
  if (isPrime(i, 2)) {
    println(i)
  }
  printSeq(n, i + 1)
}

def main(args: Array[String]): Unit = {
  print("Enter a number : ")
  var m: Int = readInt() // 5
  printSeq(m, 2)
}
