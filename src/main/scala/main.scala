object main {
  def main(args: Array[String]): Unit = {
    val Array(code: String , value: String) = args(0).split("\\s")
    val amountAsDouble = value.toDouble
    if(!Set("CAD" , "NZD").contains(code)) {
      println("Supported Currencies as CAD and NZD. Please try again!!")
      sys.exit()
    }
    val rate = Utils.getExchangeRate(code)
    println(args(0) + " = USD " + amountAsDouble * rate)
  }
  object Utils{
    private val cadToUsd: Double = 1/1.50
    private val nzdToUsd: Double = 1/1.30

    def getExchangeRate(code: String): Double = {
      println("Getting the exchange rates")
      code match {
        case "NZD" => cadToUsd
        case "CAD" => nzdToUsd
      }
    }
  }
}
