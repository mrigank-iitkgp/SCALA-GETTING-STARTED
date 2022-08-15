val amounts = Array(10 , 24 , 45 , 56)
val currencies = Array("USD" , "INR")

var sum = 0

// Simple For loop

for(amount <- amounts){
  sum = sum + amount
}
println(sum)

// Converting the for loop into an expression
val results: Array[String] = for{
  amount <- amounts
  currency <- currencies
} yield {
  currency + " " + amount
}

// Foreach statement

amounts.foreach(amount => println(amount * 100))
amounts.foreach(amount => println("INR " + amount))

