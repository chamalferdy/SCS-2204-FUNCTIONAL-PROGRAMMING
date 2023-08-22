class Account(id: String, n: Int, b: Double) {
  //
  val nic: String = id
  val acnumber: Int = n
  var balance: Double = b

  override def toString(): String =
    "[" + nic + " : " + acnumber + " : " + balance + "]"

  def withdraw(a: Double) = { this.balance = this.balance - a }
  def deposti(a: Double) = { this.balance = this.balance + a }
  def transfer(acc: Account, bal: Double) = {}
}

var bank: List[Account] = List()
