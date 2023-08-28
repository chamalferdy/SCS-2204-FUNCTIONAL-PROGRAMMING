object Two {
  def main(args: Array[String]): Unit = {
    var wordlist = List("apple", "banana", "cherry", "date")
    println(
      "Total count of letter occurrences : " + countLetterOccurrences(wordlist)
    )
  }
  def countLetterOccurrences(wordlist: List[String]): Int = {
    wordlist.map(x => x.size).reduce((x, y) => x + y)
  }
}
