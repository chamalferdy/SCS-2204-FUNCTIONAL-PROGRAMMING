import scala.compiletime.ops.int
object One {
  def main(args: Array[String]): Unit = {
    println("Enter a deposit amount to calculate interest : ")
    var depamount = scala.io.StdIn.readDouble()
    interestfunc(depamount)
  }

  def interestfunc(depamt: Double): Unit = {
    var list = List(0, 0.02, 0.04, 0.035, 0.065)
    var list1 = list.map(x => x * depamt)
    if depamt < 0 then println(list1(0))
    else if depamt < 20_000 then println(list1(1))
    else if depamt < 200_000 then println(list1(2))
    else if depamt < 2_000_000 then println(list1(3))
    else println(list1(4))
  }
}
