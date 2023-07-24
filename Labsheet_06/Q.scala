def main(args: Array[String]): Unit = {
  // The Cipher function
  val Cipher = (
      Encr_or_Decr: (Char, Int, String) => Char,
      s: String,
      key: Int,
      a: String
  ) => s.map(Encr_or_Decr(_, key, a))
//function for Encrypting
  val Encryptionval = (c: Char, key: Int, a: String) => {
    // check char is a letter
    if (c.isLetter) {
      // adding 26 allows us to take any number even if it is negative
      a((a.indexOf(c.toUpper) + key + 26) % 26)
    } else {
      c
    }
  }
//function for Decrypting
  val Decryptionval = (c: Char, key: Int, a: String) => {
    // check char is a letter
    if (c.isLetter) {
      // adding 26 allows us to take any number even if it is negative
      a((a.indexOf(c.toUpper) - key + 26) % 26)
    } else {
      c
    }
  }

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  var shift = 0
  var text = ""
  printf("Enter the shifting number : ")
  shift = (scala.io.StdIn.readInt % 26)
  text = scala.io.StdIn.readLine("Secret Text would be : ")
  val Ciphertext = Cipher(Encryptionval, text, shift, alphabet)
  val Plaintext = Cipher(Decryptionval, Ciphertext, shift, alphabet)
  println("Ciphertext : " + Ciphertext)
  println("Plaintext : " + Plaintext)
}
