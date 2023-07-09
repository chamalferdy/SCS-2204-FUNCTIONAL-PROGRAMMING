// Write a recursive function to get the addition of all even numbers less than given n.

def main(args: Array[String]): Unit = {
    var flag : Boolean = true
    while (flag) {
        println("Enter a number : ")
        var m: Int = scala.io.StdIn.readInt()
        if m > 0 then println(addeven(m))
        else {
            println("Enter a positive number !")
            flag = false
        }
    }
}

def addeven(a: Int): Int = {
    if a == 0 then a
    else if a == 1 then 0
    else if (a % 2 == 0) a - 2 + addeven(a - 2)
    else a - 1 + addeven(a - 1)
}


