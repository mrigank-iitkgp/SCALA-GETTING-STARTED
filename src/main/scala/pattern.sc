var amount = 100
// '_' is a wildcard char which matches everything
amount match {
  case 100 => println("Bill is $100")
  case 50 => println("Bill is $50")
  case _ => println("Not a $100 or $50 bill")
}

// Code to remove the hard coded value

var billAmount = 150

billAmount match {
  case a if (a >= 50) => println("Bill is greater than 50 and is " + a)
  case a if (a == 100) => println("Bill is $ 100")
  case a => println("Bill amount is " + a)
}

var aTuple = ("NZD" , 100)
aTuple match {
  case (first , second) if first == "USD" => println("Bill is USD " + second)
  case (first , second) if first == "NZD" => println("Bill is USD " + second * (1/1.50))
}




