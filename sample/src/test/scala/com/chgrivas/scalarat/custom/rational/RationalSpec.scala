package com.chgrivas.scalarat.custom.rational

import org.scalatest.{DiagrammedAssertions, FunSuite}

class RationalSpec extends FunSuite with DiagrammedAssertions {

  test("A Rational can be instantiated with two arguments") {
    assert(new Rational(1, 3).isInstanceOf[Rational])
  }

  test("A rational toString method resturns the rational in the correct format n/d") {
    val rational: Rational = new Rational(2, 5)
    assert(rational.toString == "2/5")
  }
}
