case class Currency(code: String , amount: Double , toUSD: Double)
object implicits extends App {
  implicit def stringToCurrency(money: String): Currency = {
    val Array(code: String , value: String) = money.split("\\s")
    val amountAsDouble = value.toDouble
    code match {
      case "USD" => Currency("USD" , amountAsDouble , amountAsDouble)
      case "NZD" => Currency("NZD" , amountAsDouble , amountAsDouble * (1 / 1.50))
      case "CAD" => Currency("CAD" , amountAsDouble , amountAsDouble * (1 / 1.30))
    }
  }
  val cad: Currency = "CAD 100"
  println(cad)
}
