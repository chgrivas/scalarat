package com.chgrivas.scalarat.kata.fizzbuzz

object FizzBuzz {

  def print(n: Int): String = {
    require(n >= 0)

    if (n % 3 == 0 && n % 5 == 0)
      return "FizzBuzz"
    else if (n % 3 == 0)
      return "Fizz"
    else if (n % 5 == 0)
      return "Buzz"
    n.toString
  }
}
