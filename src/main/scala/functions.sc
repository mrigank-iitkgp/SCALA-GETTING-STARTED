def square(x: Int): Int = x * x
var sq = square(10)

// Creating function taking arbitrary number of arguments

def multiply(nums: Int*): Int = {
  var prod = 1
  for(num <- nums) {
    prod = prod * num
  }
  prod
}

val mul_1 = multiply(10 , 30 , 40)
val mul_2 = multiply(1)


// Creating local functions

def sumOdd(num: Int): Int = {
  def getOdd(x: Int): Array[Int] = {
    var result = Array[Int]()
    var curr = 1
    while(curr <= x) {
      if(curr % 2 == 1) result = result :+ curr
      curr = curr + 1
    }
    result
  }
  val odd_numbers = getOdd(num)
  var sum = 0
  for(x <- odd_numbers) {
    sum = sum + x
  }
  sum
}

sumOdd(5)
