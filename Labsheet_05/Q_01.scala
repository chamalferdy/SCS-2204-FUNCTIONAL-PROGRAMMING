/*Write a recursive function prime(n) that returns true for a prime number and false for the other? For example prime(5) should return true and prime(8) should return false.*/

def main(args: Array[String]): Unit = {
    var flag : Boolean = true
    while (flag) {
        println("Enter a number : ")
        var m: Int = scala.io.StdIn.readInt()
        if m > 1 then println(prime(m)) 
        else{
            println("Enter a positive Integer greater than 1 !")
            flag = false
        }
    }
}

def prime(n: Int, x: Int = 2): Boolean = x match {
  case y if (y == n)      => true
  case y if gcd(n, y) > 1 => false
  case y                  => prime(n, y + 1)
}

def gcd(a: Int, x: Int): Int = x match {
  case 0          => a // if x == 0
  case b if b > a => gcd(b, a) // if x's value > a
  case _: Int     => gcd(x, a % x)
}

