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
}
