/*The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .
Each subsequent number is the sum of the previous two. Write a recursive function print fist n Fibonacci numbers for given n.*/

def main(args: Array[String]): Unit = {
    var flag : Boolean = true
    while (flag) {
        println("Enter a number : ")
        var m: Int = scala.io.StdIn.readInt()
        if m >= 1 then println(fibonacci(m)) 
        else{
            println("Enter a Natural Number !")
            flag = false
        }
    }
}

def fibonacci(f: Int): Int = {
  if f == 1 then 0
  else if f == 2 then 1
  else{
    var value : Int = fibonacci(f - 1) + fibonacci(f - 2)
    value
  }
}
