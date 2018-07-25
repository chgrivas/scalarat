package com.chgrivas.scalarat.kata.fizzbuzz

import org.scalatest.{DiagrammedAssertions, FunSuite}

class FizzBuzzSpec extends FunSuite with DiagrammedAssertions {

  test("FizzBuzz object compiles") {
    assertCompiles("FizzBuzz.print(1)")
  }

  test("FizzBuzz with a number <= zero throws an exception") {
    assertThrows[IllegalArgumentException](FizzBuzz.print(-1))
    assertThrows[IllegalArgumentException](FizzBuzz.print(0))
  }

  test("FizzBuzz with a number that gets divided by 3 should return fizz") {
    assert(FizzBuzz.print(3) == "fizz")
    assert(FizzBuzz.print(6) == "fizz")
    assert(FizzBuzz.print(9) == "fizz")
  }

  test("FizzBuzz with a number that gets divided by 5 should return buzz") {
    assert(FizzBuzz.print(5) == "buzz")
    assert(FizzBuzz.print(10) == "buzz")
    assert(FizzBuzz.print(20) == "buzz")
  }

  test("FizzBuzz with a number that gets divided by both 3 and 5 should return fizzbuzz") {
    assert(FizzBuzz.print(15) == "fizzbuzz")
    assert(FizzBuzz.print(30) == "fizzbuzz")
    assert(FizzBuzz.print(45) == "fizzbuzz")
  }

  test("FizzBuzz with a number not divided by both 3 or 5 should return itself as a string") {
    assert(FizzBuzz.print(14) == "14")
    assert(FizzBuzz.print(2) == "2")
  }
}
