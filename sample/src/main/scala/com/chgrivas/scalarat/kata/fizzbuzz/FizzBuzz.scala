package com.chgrivas.scalarat.kata.fizzbuzz

object FizzBuzz {

//  def print(n: Int): String = {
//    require(n > 0)
//
//    if (n % 3 == 0 && n % 5 == 0)
//      return "fizzbuzz"
//    else if (n % 3 == 0)
//      return "fizz"
//    else if (n % 5 == 0)
//      return "buzz"
//    n.toString
//  }

  def print(n: Int): String = (n % 3, n % 5) match {
    case (0, 0) => "fizzbuzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case _      => n.toString
  }
}
