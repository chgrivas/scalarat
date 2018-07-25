package com.chgrivas.scalarat.kata.fizzbuzz

object FizzBuzz {

  def print(n: Int): String = {
    require(n > 0)

    if (n % 3 == 0 && n % 5 == 0)
      return "fizzbuzz"
    else if (n % 3 == 0)
      return "fizz"
    else if (n % 5 == 0)
      return "buzz"
    n.toString
  }
}
