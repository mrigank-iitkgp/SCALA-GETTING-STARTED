import implicits._

val numbers = Array(1 , 2 , 3 , 4 , 5 , 6 , 7)
numbers.map(num => num * 2)
numbers.filter(num => num % 2 == 0)
numbers.filter(num => num % 2 != 0)

import implicits.stringToCurrency

val cad: Currency = "CAD 100"
