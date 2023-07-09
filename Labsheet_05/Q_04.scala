// Write a recursive function to determine even and odd numbers

def main(args: Array[String]): Unit = {

  var flag : Boolean = true
  while (flag) {
    println("Enter a number : ")
    var m: Int = scala.io.StdIn.readInt()
    if m != 0 && m < 0 && m > 0 then flag = false 
    else{
      var v : Int = evenorodd(m)
      if v == 1 then println("odd")
      else println("even")
    }  
  }
}

def evenorodd(a: Int): Int = {
  if a == 0 then 0
  else if a == 1 || a == -1 then 1
  else evenorodd(a % 2)
}
