package com.chgrivas.scalarat.kata.berlinuhr

import org.scalatest.{DiagrammedAssertions, FunSuite}

class BerlinClockSpec extends FunSuite with DiagrammedAssertions {

  test("BerlinClock exists") {
    assertCompiles("BerlinClock.convertToBerlinTime(\"15:13:22\")")
    assertCompiles("BerlinClock.seconds(1)")
    assertCompiles("BerlinClock.topHours(7)")
  }

  test("Seconds are Y (yellow only on even seconds)") {
    assert(BerlinClock.seconds(0) == "Y")
    assert(BerlinClock.seconds(1) == "O")
    assert(BerlinClock.seconds(49) == "O")
  }

  test("Top hours should have 4 lamps") {
    assert(BerlinClock.topHours(7).length == 4)
  }

  test("Top hours is converted to lambs correctly") {
    assert(BerlinClock.topHours(1) == "OOOO")
    assert(BerlinClock.topHours(7) == "ROOO")
    assert(BerlinClock.topHours(14) == "RROO")
    assert(BerlinClock.topHours(19) == "RRRO")
    assert(BerlinClock.topHours(22) == "RRRR")
  }

}
