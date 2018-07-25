package com.chgrivas.scalarat.kata.fizzbuzz

object FizzBuzz {

  def print(n: Int): String = (n % 3, n % 5) match {
    case (0, 0) => "fizzbuzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case _      => n.toString
  }
}
