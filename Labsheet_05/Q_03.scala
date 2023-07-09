// Write a recursive function returns the addition of numbers from1 to n: For example sum(5) should print 15

def main(args: Array[String]): Unit = {
    var flag : Boolean = true
    while (flag) {
        println("Enter a number : ")
        var m: Int = scala.io.StdIn.readInt()
        if m > 0 then println(addition(m)) else flag = false
    }
}

def addition( n : Int): Int = {
    if n == 1 then return 1
    else return n + addition(n-1)
} 
