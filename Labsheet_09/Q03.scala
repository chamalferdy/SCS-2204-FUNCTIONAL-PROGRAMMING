object Three {
  class Account(id: String, num: Int, blnc: Double) {
    val accid: String = id
    val accnum: Int = num
    var balance: Double = blnc
    override def toString(): String =
      "[" + accid + " : " + accnum + " : " + balance + "]"
    def withdraw(a: Double) = { this.balance = this.balance - a }
    def deposit(a: Double) = { this.balance = this.balance + a }
    def transfer(acc: Account, bal: Double) = {
      this.balance = this.balance - bal
      acc.balance = acc.balance + bal
    }
  }

  def main(args: Array[String]): Unit = {
    var acc1 = new Account("001", 10_023, 20_100.50)
    var acc2 = new Account("002", 12_004, 12_000.20)
    var acc3 = new Account("003", 20_311, 300_500.00)
    println(
      s"Balance before withdrawing 3000 from account ${acc1.accid} : ${acc1}"
    )
    acc1.withdraw(3_000)
    println(
      s"Balance after withdrawing 3000 from account ${acc1.accid}: ${acc1}"
    )
    println(s"Balance before depositing 5000 to acount ${acc2.accid}: ${acc2}")
    acc2.deposit(5_000)
    println(s"Balance after depositing 5000 to acount ${acc2.accid}: ${acc2}")
    println(
      s"Balance before tranferring 4000 from account ${acc3.accid} to acount ${acc1.accid}: ${acc3} and ${acc1}"
    )
    acc3.transfer(acc1, 4_000)
    println(
      s"Balance after tranferring 4000 from account ${acc3.accid} to acount ${acc1.accid}: ${acc3} and ${acc1}"
    )
  }
}
