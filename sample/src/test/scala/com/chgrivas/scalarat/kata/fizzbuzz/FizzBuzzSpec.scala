package com.chgrivas.scalarat.kata.fizzbuzz

import org.scalatest.{DiagrammedAssertions, FunSuite}

class FizzBuzzSpec extends FunSuite with DiagrammedAssertions {

  test("FizzBuzz object compiles") {
    assertCompiles("FizzBuzz.print(1)")
  }
}
