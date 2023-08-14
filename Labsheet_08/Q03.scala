object Three {
  def main(args: Array[String]): Unit = {
    var strArr = Array(
      "Benny",
      "Niroshan", /*length = 8 && 1 index has to be changed*/
      "Saman",
      "Kumara" /*length = 6 && last index has to be changed*/
    )
    for (i <- 0 to strArr.length - 1) {
      if ((i % 2 == 0) && (i == 0)) {
        formatNames(strArr(i), toUpper)
      }
      if ((i % 2 == 0) && (i == 2)) {
        formatNames(strArr(i), toLower)
      }
      if (i % 2 == 1) {
        formatNames(strArr(i), toCustom)
      }
    }
  }

  def formatNames(name: String, func: String => String): Unit = {
    println(func(name))
  }

  val toUpper: String => String = (str: String) => { str.toUpperCase() }
  val toLower: String => String = (str: String) => { str.toLowerCase() }

  def toCustom(para3: String): String = {
    var index: Int = para3.length()
    // first element -> first character
    if (index == 8) {
      index = index - (index - 1) // 8 -> (8 - ( 8 - 1 ))
      para3.updated(
        index,
        para3(index).toUpper
      )
    } else {
      // last element -> last character
      index = index - 1 // 6 -> ( 6 - 1 )
      para3.updated(
        index,
        para3(index).toUpper
      )
    }
  }

}
