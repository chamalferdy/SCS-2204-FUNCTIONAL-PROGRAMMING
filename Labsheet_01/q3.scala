import scala.compiletime.ops.int
def main(args: Array[String]): Unit = {
  var c = Volume(5)
  println("The volume of the Sphere would be : " + c)
}

def Volume(r: Double): Double = { ((4 * Math.PI * r * r * r) / 3) }
