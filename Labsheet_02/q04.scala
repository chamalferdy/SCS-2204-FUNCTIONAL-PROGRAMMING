def main(args: Array[String]): Unit = {
  var best_ticket_price = 0
  var profit = 0
  var check_profit = 0
  var attendees = 160
  var ticket = 5
  while (attendees > 0) {
    check_profit = income(attendees, ticket) - ownerCost(attendees)
    if (check_profit > profit) {
      best_ticket_price = ticket
      profit = check_profit
    }
    attendees = attendees - 20
    ticket = ticket + 5
  }
  println("Best Ticket Price is: Rs." + best_ticket_price)
  print("Profit gain: Rs." + profit)
}
def ownerCost(x: Int): Int = {
  3 * x + 500
}
def income(x: Int, y: Int): Int = {
  x * y
}
