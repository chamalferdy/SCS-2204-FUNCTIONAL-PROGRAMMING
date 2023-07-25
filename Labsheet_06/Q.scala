def caesarEncrypt(plainText: String, shift: Int): String = {
  plainText.map { char =>
    if (char.isLetter) {
      val base = if (char.isUpper) 'A' else 'a'
      // char - base = to the value difference.
      ((char - base + shift) % 26 + base).toChar
    } else {
      char
    }
  }
}

def caesarDecrypt(encryptedText: String, shift: Int): String = {
  caesarEncrypt(encryptedText, -shift)
}

def cipher(
    processFunc: (String, Int) => String,
    text: String,
    shift: Int
): String = {
  processFunc(text, shift)
}

def main(args: Array[String]): Unit = {
  printf("Enter the shifting number : ")
  var shiftAmount = (scala.io.StdIn.readInt % 26)
  var text = scala.io.StdIn.readLine("Secret Text would be : ")

  // Encrypt the text
  val encryptedText = cipher(caesarEncrypt, text, shiftAmount)
  println(s"Encrypted: $encryptedText")

  // Decrypt the text
  val decryptedText = cipher(caesarDecrypt, encryptedText, shiftAmount)
  println(s"Decrypted: $decryptedText")
}
