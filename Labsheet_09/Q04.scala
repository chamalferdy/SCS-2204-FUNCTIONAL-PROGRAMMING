object Four {
  class Account(id: String, num: Int, blnc: Double) {
    val nic: String = id
    val accnum: Int = num
    var balance: Double = blnc
    override def toString(): String =
      "[" + nic + " : " + accnum + " : " + balance + "]"
  }

  def main(args: Array[String]): Unit = {
    var acc1 = new Account("001", 10023, 250_040)
    var acc2 = new Account("002", 10323, -460_080)
    var acc3 = new Account("003", 34023, -950_400)
    var acc4 = new Account("004", 15063, -280_000)
    var acc5 = new Account("005", 92353, 970_040)
    var acc6 = new Account("006", 63467, 160_008.55)
    var acclist = List(acc1, acc2, acc3, acc4, acc5, acc6)
    //////////////////////////////////////////////////// 4.1
    var ODlist = acclist.filter(_.balance < 0)
    println("Negative balances " + ODlist)
    //////////////////////////////////////////////////// 4.2
    var sumbalancelist = acclist.map(_.balance).sum
    println(
      "The sum of all account balances without interest : " + sumbalancelist
    )
    //////////////////////////////////////////////////// 4.3
    var DEPlist = acclist.filter(_.balance > 0)
    var sumDEPlist = DEPlist.map(x => x.balance * 1.05).reduce((x, y) => x + y)
    var sumODlist = ODlist.map(x => x.balance * 1.1).reduce((x, y) => x + y)
    println(
      "Final balance of the Overdrafted Accounts with interest: " + sumODlist
    )
    println(
      "Final balance of the Deposit Accounts with interest: " + sumDEPlist
    )
    println(
      "Final balance of all Accounts with interest: " + (sumODlist + sumDEPlist)
    )
  }
}
