package com.chgrivas.scalarat.custom.rational

import org.scalatest.{DiagrammedAssertions, FunSuite}

class RationalSpec extends FunSuite with DiagrammedAssertions {

  test("A Rational can be instantiated with two arguments") {
    assert(new Rational(1, 3).isInstanceOf[Rational])
  }

  test("A Rational toString method resturns the rational in the correct format n/d") {
    val rational = new Rational(2, 5)
    assert(rational.toString == "2/5")
  }

  test("Creating a Rational can not accept a zero in the denominator") {
    assertThrows[IllegalArgumentException] {
      new Rational(5, 0)
    }
  }

  test("A Rational can be instantiated with one arguments") {
    assert(new Rational(5).isInstanceOf[Rational])
  }

  test("A Rational with one argument gets turned into string as n/1") {
    assert(new Rational(5).toString == "5/1")
  }

  test("Adding rationals works as expected") {
    val twoFifths = new Rational(2, 5)
    val oneThird = new Rational(1, 3)

    assert((twoFifths + oneThird).toString == "11/15")
  }

  test("Multiplying rationals works as expected") {
    val twoFifths = new Rational(2, 5)
    val oneThird = new Rational(1, 3)

    assert((twoFifths * oneThird).toString == "2/15")
  }

  test("A rational gets created normalized") {
    assert(new Rational(4, 2).toString == "2/1")
  }

  test("Adding an integer to a rational works as expected") {
    assert((new Rational(4, 2) + 5).toString == "7/1")
  }
}
