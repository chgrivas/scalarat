package com.chgrivas.scalarat.kata.berlinuhr

import org.scalatest.{DiagrammedAssertions, FunSuite}

class BerlinClockSpec extends FunSuite with DiagrammedAssertions {

  test("BerlinClock exists") {
    assertCompiles("BerlinClock.convertToBerlinTime(\"15:13:22\")")
    assertCompiles("BerlinClock.seconds(1)")
  }

  test("Seconds are Y (yellow only on even seconds)") {
    assert(BerlinClock.seconds(0) == "Y")
    assert(BerlinClock.seconds(1) == "O")
    assert(BerlinClock.seconds(49) == "O")
  }
}
